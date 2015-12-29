package com.simplesys.SmartClient.option

object ScOption {
    implicit def anyToScOpt[T](x: T): ScOption[T] = ScSome(x)
}

sealed abstract class ScOption[+A] extends Product with Serializable {
    self =>

    def isEmpty: Boolean
    final def nonEmpty = isDefined

    def isDefined: Boolean = !isEmpty

    def get: A

    @inline final def getOrElse[B >: A](default: => B): B =
        if (isEmpty) default else this.get

    @inline final def orNull[A1 >: A](implicit ev: Null <:< A1): A1 = this getOrElse ev(null)

    @inline final def map[B](f: A => B): ScOption[B] =
        if (isEmpty) ScNone else ScSome(f(this.get))

    @inline final def fold[B](ifEmpty: => B)(f: A => B): B =
        if (isEmpty) ifEmpty else f(this.get)

    @inline final def flatMap[B](f: A => ScOption[B]): ScOption[B] =
        if (isEmpty) ScNone else f(this.get)

    def flatten[B](implicit ev: A <:< ScOption[B]): ScOption[B] =
        if (isEmpty) ScNone else ev(this.get)

    @inline final def filter(p: A => Boolean): ScOption[A] =
        if (isEmpty || p(this.get)) this else ScNone

    @inline final def filterNot(p: A => Boolean): ScOption[A] =
        if (isEmpty || !p(this.get)) this else ScNone

    @inline final def withFilter(p: A => Boolean): WithFilter = new WithFilter(p)

    class WithFilter(p: A => Boolean) {
        def map[B](f: A => B): ScOption[B] = self filter p map f
        def flatMap[B](f: A => ScOption[B]): ScOption[B] = self filter p flatMap f
        def foreach[U](f: A => U): Unit = self filter p foreach f
        def withFilter(q: A => Boolean): WithFilter = new WithFilter(x => p(x) && q(x))
    }

    final def contains[A1 >: A](elem: A1): Boolean =
        !isEmpty && this.get == elem

    @inline final def exists(p: A => Boolean): Boolean =
        !isEmpty && p(this.get)

    @inline final def forall(p: A => Boolean): Boolean = isEmpty || p(this.get)

    @inline final def foreach[U](f: A => U) {
        if (!isEmpty) f(this.get)
    }

    @inline final def orElse[B >: A](alternative: => ScOption[B]): ScOption[B] =
        if (isEmpty) alternative else this

    def iterator: Iterator[A] =
        if (isEmpty) collection.Iterator.empty else collection.Iterator.single(this.get)

    def toList: List[A] =
        if (isEmpty) List() else new ::(this.get, Nil)

    @inline final def toRight[X](left: => X) =
        if (isEmpty) Left(left) else Right(this.get)

    @inline final def toLeft[X](right: => X) =
        if (isEmpty) Right(right) else Left(this.get)
}

final case class ScSome[+A](x: A) extends ScOption[A] {
    def isEmpty = false
    def get = x
}

case object ScNone extends ScOption[Nothing] {
    type ScNone = ScNone.type
    def isEmpty = true
    def get = throw new NoSuchElementException("ScNone.get")
}

