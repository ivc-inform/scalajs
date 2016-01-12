package com.simplesys.SmartClient.option

import com.simplesys.SmartClient.option.DoubleType.{Type2Projection, Type1Projection}

import scala.language.implicitConversions


sealed abstract class DoubleType[+A, +B] {

  def left = Type1Projection(this)

  def right = Type2Projection(this)

  def fold[X](fa: A => X, fb: B => X) = this match {
    case Type1(a) => fa(a)
    case Type2(b) => fb(b)
  }

  def swap = this match {
    case Type1(a) => Type2(a)
    case Type2(b) => Type1(b)
  }

  def joinRight[A1 >: A, B1 >: B, C](implicit ev: B1 <:< DoubleType[A1, C]): DoubleType[A1, C] = this match {
    case Type1(a)  => Type1(a)
    case Type2(b) => b
  }

  def joinLeft[A1 >: A, B1 >: B, C](implicit ev: A1 <:< DoubleType[C, B1]): DoubleType[C, B1] = this match {
    case Type1(a)  => a
    case Type2(b) => Type2(b)
  }

  def isLeft: Boolean

  def isRight: Boolean
}

final case class Type1[+A, +B](a: A) extends DoubleType[A, B] {
  def isLeft = true
  def isRight = false
}

final case class Type2[+A, +B](b: B) extends DoubleType[A, B] {
  def isLeft = false
  def isRight = true
}

object DoubleType {

  implicit class MergeableEither[A](private val x: DoubleType[A, A]) extends AnyVal {
    def merge: A = x match {
      case Type1(a)  => a
      case Type2(a) => a
    }
  }

  final case class Type1Projection[+A, +B](e: DoubleType[A, B]) {
    def get = e match {
      case Type1(a) => a
      case Type2(_) =>  throw new NoSuchElementException("DoubleType.type1.value on Type2")
    }

    def foreach[U](f: A => U) = e match {
      case Type1(a) => f(a)
      case Type2(_) => {}
    }

    def getOrElse[AA >: A](or: => AA) = e match {
      case Type1(a) => a
      case Type2(_) => or
    }

    def forall(f: A => Boolean) = e match {
      case Type1(a) => f(a)
      case Type2(_) => true
    }

    def exists(f: A => Boolean) = e match {
      case Type1(a) => f(a)
      case Type2(_) => false
    }

    def flatMap[BB >: B, X](f: A => DoubleType[X, BB]) = e match {
      case Type1(a) => f(a)
      case Type2(b) => Type2(b)
    }

    def map[X](f: A => X) = e match {
      case Type1(a) => Type1(f(a))
      case Type2(b) => Type2(b)
    }

    def filter[Y](p: A => Boolean): Option[DoubleType[A, Y]] = e match {
      case Type1(a) => if(p(a)) Some(Type1(a)) else None
      case Type2(b) => None
    }

    def toSeq = e match {
      case Type1(a) => Seq(a)
      case Type2(_) => Seq.empty
    }

    def toOption = e match {
      case Type1(a) => Some(a)
      case Type2(_) => None
    }
  }

  final case class Type2Projection[+A, +B](e: DoubleType[A, B]) {

    def get = e match {
      case Type1(_) =>  throw new NoSuchElementException("DoubleType.type2.value on Type1")
      case Type2(a) => a
    }

    def foreach[U](f: B => U) = e match {
      case Type1(_) => {}
      case Type2(b) => f(b)
    }

    def getOrElse[BB >: B](or: => BB) = e match {
      case Type1(_) => or
      case Type2(b) => b
    }

    def forall(f: B => Boolean) = e match {
      case Type1(_) => true
      case Type2(b) => f(b)
    }

    def exists(f: B => Boolean) = e match {
      case Type1(_) => false
      case Type2(b) => f(b)
    }

    def flatMap[AA >: A, Y](f: B => DoubleType[AA, Y]) = e match {
      case Type1(a) => Type1(a)
      case Type2(b) => f(b)
    }

    def map[Y](f: B => Y) = e match {
      case Type1(a) => Type1(a)
      case Type2(b) => Type2(f(b))
    }

    def filter[X](p: B => Boolean): Option[DoubleType[X, B]] = e match {
      case Type1(_) => None
      case Type2(b) => if(p(b)) Some(Type2(b)) else None
    }

    def toSeq = e match {
      case Type1(_) => Seq.empty
      case Type2(b) => Seq(b)
    }

    def toOption = e match {
      case Type1(_) => None
      case Type2(b) => Some(b)
    }
  }

  def cond[A, B](test: Boolean, right: => B, left: => A): DoubleType[A, B] =
    if (test) Type2(right) else Type1(left)
}

//class IntString extends DoubleType[Int, String] {
//
//  override def isLeft: Boolean = ???
//  override def isRight: Boolean = ???
//
//}
