package com.simplesys.SmartClient.option

import scala.language.implicitConversions


sealed abstract class Either[+A, +B] {

  def left = Either.LeftProjection(this)

  def right = Either.RightProjection(this)

  def fold[X](fa: A => X, fb: B => X) = this match {
    case Left(a) => fa(a)
    case Right(b) => fb(b)
  }

  def swap = this match {
    case Left(a) => Right(a)
    case Right(b) => Left(b)
  }

  def joinRight[A1 >: A, B1 >: B, C](implicit ev: B1 <:< Either[A1, C]): Either[A1, C] = this match {
    case Left(a)  => Left(a)
    case Right(b) => b
  }

  def joinLeft[A1 >: A, B1 >: B, C](implicit ev: A1 <:< Either[C, B1]): Either[C, B1] = this match {
    case Left(a)  => a
    case Right(b) => Right(b)
  }

  def isLeft: Boolean

  def isRight: Boolean
}

final case class Left[+A, +B](a: A) extends Either[A, B] {
  def isLeft = true
  def isRight = false
}

final case class Right[+A, +B](b: B) extends Either[A, B] {
  def isLeft = false
  def isRight = true
}

object Either {

  implicit class MergeableEither[A](private val x: Either[A, A]) extends AnyVal {
    def merge: A = x match {
      case Left(a)  => a
      case Right(a) => a
    }
  }

  final case class LeftProjection[+A, +B](e: Either[A, B]) {
    /**
     * Returns the value from this `Left` or throws `java.util.NoSuchElementException`
     * if this is a `Right`.
     *
     * {{{
     * Left(12).left.get // 12
     * Right(12).left.get // NoSuchElementException
     * }}}
     *
     * @throws java.util.NoSuchElementException if the projection is [[scala.util.Right]]
     */
    def get = e match {
      case Left(a) => a
      case Right(_) =>  throw new NoSuchElementException("Either.left.value on Right")
    }

    /**
     * Executes the given side-effecting function if this is a `Left`.
     *
     * {{{
     * Left(12).left.foreach(x => println(x))  // prints "12"
     * Right(12).left.foreach(x => println(x)) // doesn't print
     * }}}
     * @param f The side-effecting function to execute.
     */
    def foreach[U](f: A => U) = e match {
      case Left(a) => f(a)
      case Right(_) => {}
    }

    /**
     * Returns the value from this `Left` or the given argument if this is a
     * `Right`.
     *
     * {{{
     * Left(12).left.getOrElse(17)  // 12
     * Right(12).left.getOrElse(17) // 17
     * }}}
     *
     */
    def getOrElse[AA >: A](or: => AA) = e match {
      case Left(a) => a
      case Right(_) => or
    }

    /**
     * Returns `true` if `Right` or returns the result of the application of
     * the given function to the `Left` value.
     *
     * {{{
     * Left(12).left.forall(_ > 10)  // true
     * Left(7).left.forall(_ > 10)   // false
     * Right(12).left.forall(_ > 10) // true
     * }}}
     *
     */
    def forall(f: A => Boolean) = e match {
      case Left(a) => f(a)
      case Right(_) => true
    }

    /**
     * Returns `false` if `Right` or returns the result of the application of
     * the given function to the `Left` value.
     *
     * {{{
     * Left(12).left.exists(_ > 10)  // true
     * Left(7).left.exists(_ > 10)   // false
     * Right(12).left.exists(_ > 10) // false
     * }}}
     *
     */
    def exists(f: A => Boolean) = e match {
      case Left(a) => f(a)
      case Right(_) => false
    }

    /**
     * Binds the given function across `Left`.
     *
     * {{{
     * Left(12).left.flatMap(x => Left("scala")) // Left("scala")
     * Right(12).left.flatMap(x => Left("scala") // Right(12)
     * }}}
     * @param f The function to bind across `Left`.
     */
    def flatMap[BB >: B, X](f: A => Either[X, BB]) = e match {
      case Left(a) => f(a)
      case Right(b) => Right(b)
    }

    /**
     * Maps the function argument through `Left`.
     *
     * {{{
     * Left(12).left.map(_ + 2) // Left(14)
     * Right[Int, Int](12).left.map(_ + 2) // Right(12)
     * }}}
     */
    def map[X](f: A => X) = e match {
      case Left(a) => Left(f(a))
      case Right(b) => Right(b)
    }

    /**
     * Returns `None` if this is a `Right` or if the given predicate
     * `p` does not hold for the left value, otherwise, returns a `Left`.
     *
     * {{{
     * Left(12).left.filter(_ > 10)  // Some(Left(12))
     * Left(7).left.filter(_ > 10)   // None
     * Right(12).left.filter(_ > 10) // None
     * }}}
     */
    def filter[Y](p: A => Boolean): Option[Either[A, Y]] = e match {
      case Left(a) => if(p(a)) Some(Left(a)) else None
      case Right(b) => None
    }

    /**
     * Returns a `Seq` containing the `Left` value if it exists or an empty
     * `Seq` if this is a `Right`.
     *
     * {{{
     * Left(12).left.toSeq // Seq(12)
     * Right(12).left.toSeq // Seq()
     * }}}
     */
    def toSeq = e match {
      case Left(a) => Seq(a)
      case Right(_) => Seq.empty
    }

    /**
     * Returns a `Some` containing the `Left` value if it exists or a
     * `None` if this is a `Right`.
     *
     * {{{
     * Left(12).left.toOption // Some(12)
     * Right(12).left.toOption // None
     * }}}
     */
    def toOption = e match {
      case Left(a) => Some(a)
      case Right(_) => None
    }
  }

  final case class RightProjection[+A, +B](e: Either[A, B]) {

    /**
     * Returns the value from this `Right` or throws
     * `java.util.NoSuchElementException` if this is a `Left`.
     *
     * {{{
     * Right(12).right.get // 12
     * Left(12).right.get // NoSuchElementException
     * }}}
     *
     * @throws java.util.NoSuchElementException if the projection is `Left`.
     */
    def get = e match {
      case Left(_) =>  throw new NoSuchElementException("Either.right.value on Left")
      case Right(a) => a
    }

    /**
     * Executes the given side-effecting function if this is a `Right`.
     *
     * {{{
     * Right(12).right.foreach(x => println(x)) // prints "12"
     * Left(12).right.foreach(x => println(x))  // doesn't print
     * }}}
     * @param f The side-effecting function to execute.
     */
    def foreach[U](f: B => U) = e match {
      case Left(_) => {}
      case Right(b) => f(b)
    }

    /**
     * Returns the value from this `Right` or the given argument if this is a
     * `Left`.
     *
     * {{{
     * Right(12).right.getOrElse(17) // 12
     * Left(12).right.getOrElse(17)  // 17
     * }}}
     */
    def getOrElse[BB >: B](or: => BB) = e match {
      case Left(_) => or
      case Right(b) => b
    }

    /**
     * Returns `true` if `Left` or returns the result of the application of
     * the given function to the `Right` value.
     *
     * {{{
     * Right(12).right.forall(_ > 10) // true
     * Right(7).right.forall(_ > 10)  // false
     * Left(12).right.forall(_ > 10)  // true
     * }}}
     */
    def forall(f: B => Boolean) = e match {
      case Left(_) => true
      case Right(b) => f(b)
    }

    /**
     * Returns `false` if `Left` or returns the result of the application of
     * the given function to the `Right` value.
     *
     * {{{
     * Right(12).right.exists(_ > 10)  // true
     * Right(7).right.exists(_ > 10)   // false
     * Left(12).right.exists(_ > 10)   // false
     * }}}
     */
    def exists(f: B => Boolean) = e match {
      case Left(_) => false
      case Right(b) => f(b)
    }

    /**
     * Binds the given function across `Right`.
     *
     * @param f The function to bind across `Right`.
     */
    def flatMap[AA >: A, Y](f: B => Either[AA, Y]) = e match {
      case Left(a) => Left(a)
      case Right(b) => f(b)
    }

    /**
     * The given function is applied if this is a `Right`.
     *
     * {{{
     * Right(12).right.map(x => "flower") // Result: Right("flower")
     * Left(12).right.map(x => "flower")  // Result: Left(12)
     * }}}
     */
    def map[Y](f: B => Y) = e match {
      case Left(a) => Left(a)
      case Right(b) => Right(f(b))
    }

    /** Returns `None` if this is a `Left` or if the
     *  given predicate `p` does not hold for the right value,
     *  otherwise, returns a `Right`.
     *
     * {{{
     * Right(12).right.filter(_ > 10) // Some(Right(12))
     * Right(7).right.filter(_ > 10)  // None
     * Left(12).right.filter(_ > 10)  // None
     * }}}
     */
    def filter[X](p: B => Boolean): Option[Either[X, B]] = e match {
      case Left(_) => None
      case Right(b) => if(p(b)) Some(Right(b)) else None
    }

    /** Returns a `Seq` containing the `Right` value if
     *  it exists or an empty `Seq` if this is a `Left`.
     *
     * {{{
     * Right(12).right.toSeq // Seq(12)
     * Left(12).right.toSeq // Seq()
     * }}}
     */
    def toSeq = e match {
      case Left(_) => Seq.empty
      case Right(b) => Seq(b)
    }

    /** Returns a `Some` containing the `Right` value
     *  if it exists or a `None` if this is a `Left`.
     *
     * {{{
     * Right(12).right.toOption // Some(12)
     * Left(12).right.toOption // None
     * }}}
     */
    def toOption = e match {
      case Left(_) => None
      case Right(b) => Some(b)
    }
  }

  def cond[A, B](test: Boolean, right: => B, left: => A): Either[A, B] =
    if (test) Right(right) else Left(left)
}
