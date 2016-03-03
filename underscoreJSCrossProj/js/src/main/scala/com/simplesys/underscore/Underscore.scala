import scala.scalajs.js
import scala.scalajs.js.annotation._

package com.simplesys.underscore {

    import com.simplesys.System._
    import com.simplesys.underscore.__._

    import scala.scalajs.js.|

    package __ {

        import com.simplesys.System.JSObject

        import scala.scalajs.js.RegExp

        @js.native
        trait ThrottleSettings extends JSObject {
            var leading: Boolean = js.native
            var trailing: Boolean = js.native
        }

        @js.native
        trait TemplateSettings extends JSObject {
            var evaluate: RegExp = js.native
            var interpolate: RegExp = js.native
            var escape: RegExp = js.native
        }

        @js.native
        trait Collection[T] extends JSObject {
        }

        @js.native
        trait List[T] extends Collection[T] {
            @JSBracketAccess
            def apply(index: Double): T = js.native
            @JSBracketAccess
            def update(index: Double, v: T): Unit = js.native
            var length: Double = js.native
        }

        @js.native
        trait Dictionary[T] extends Collection[T] {
            @JSBracketAccess
            def apply(index: String): T = js.native
            @JSBracketAccess
            def update(index: String, v: T): Unit = js.native
        }

        @js.native
        trait ListIterator[T, TResult] extends JSObject {
            def apply(value: T, index: Double, list: List[T]): TResult = js.native
        }

        @js.native
        trait ObjectIterator[T, TResult] extends JSObject {
            def apply(element: T, key: String, list: Dictionary[T]): TResult = js.native
        }

        @js.native
        trait MemoIterator[T, TResult] extends JSObject {
            def apply(prev: TResult, curr: T, index: Double, list: List[T]): TResult = js.native
        }

        @js.native
        trait MemoObjectIterator[T, TResult] extends JSObject {
            def apply(prev: TResult, curr: T, key: String, list: Dictionary[T]): TResult = js.native
        }

    }

    @js.native
    trait UnderscoreStatic extends JSObject {
        def apply[T](value: JSArray[T]): Underscore[T] = js.native
        def each[T](list: List[T], iterator: ListIterator[T, _], context: JSAny = js.native): List[T] = js.native
        @JSName("each")
        def eachDictionary[T](`object`: Dictionary[T], iterator: ObjectIterator[T, _], context: JSAny = js.native): Dictionary[T] = js.native
        def forEach[T](list: List[T], iterator: ListIterator[T, _], context: JSAny = js.native): List[T] = js.native
        @JSName("forEach")
        def forEachDictionary[T](`object`: Dictionary[T], iterator: ObjectIterator[T, _], context: JSAny = js.native): Dictionary[T] = js.native
        def map[T, TResult](list: List[T], iterator: ListIterator[T, TResult], context: JSAny = js.native): JSArray[TResult] = js.native
        @JSName("map")
        def mapDictionary[T, TResult](`object`: Dictionary[T], iterator: ObjectIterator[T, TResult], context: JSAny = js.native): JSArray[TResult] = js.native
        def collect[T, TResult](list: List[T], iterator: ListIterator[T, TResult], context: JSAny = js.native): JSArray[TResult] = js.native
        @JSName("collect")
        def collectDictionary[T, TResult](`object`: Dictionary[T], iterator: ObjectIterator[T, TResult], context: JSAny = js.native): JSArray[TResult] = js.native
        def reduce[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): TResult = js.native
        def inject[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): TResult = js.native
        def foldl[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): TResult = js.native
        def reduceRight[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): TResult = js.native
        def foldr[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): TResult = js.native
        def find[T](list: List[T], iterator: ListIterator[T, Boolean], context: JSAny = js.native): T = js.native
        @JSName("find")
        def findDictionary[T](`object`: Dictionary[T], iterator: ObjectIterator[T, Boolean], context: JSAny = js.native): T = js.native
        def detect[T](list: List[T], iterator: ListIterator[T, Boolean], context: JSAny = js.native): T = js.native
        @JSName("detect")
        def detectDictionary[T](`object`: Dictionary[T], iterator: ObjectIterator[T, Boolean], context: JSAny = js.native): T = js.native
        def findIndex[T](list: List[T], iterator: ListIterator[T, Boolean], context: JSAny = js.native): Double = js.native
        def filter[T](list: List[T], iterator: ListIterator[T, Boolean], context: JSAny = js.native): JSArray[T] = js.native
        @JSName("filter")
        def filterDictionary[T](`object`: Dictionary[T], iterator: ObjectIterator[T, Boolean], context: JSAny = js.native): JSArray[T] = js.native
        def select[T](list: List[T], iterator: ListIterator[T, Boolean], context: JSAny = js.native): JSArray[T] = js.native
        @JSName("select")
        def selectDictionary[T](`object`: Dictionary[T], iterator: ObjectIterator[T, Boolean], context: JSAny = js.native): JSArray[T] = js.native
        def where[T, U <: AnyRef](list: List[T], properties: U): JSArray[T] = js.native
        def findWhere[T, U <: AnyRef](list: List[T], properties: U): T = js.native
        def reject[T](list: List[T], iterator: ListIterator[T, Boolean], context: JSAny = js.native): JSArray[T] = js.native
        @JSName("reject")
        def rejectDictionary[T](`object`: Dictionary[T], iterator: ObjectIterator[T, Boolean], context: JSAny = js.native): JSArray[T] = js.native
        def every[T](list: List[T], iterator: ListIterator[T, Boolean] = js.native, context: JSAny = js.native): Boolean = js.native
        def all[T](list: List[T], iterator: ListIterator[T, Boolean] = js.native, context: JSAny = js.native): Boolean = js.native
        def some[T](list: List[T], iterator: ListIterator[T, Boolean] = js.native, context: JSAny = js.native): Boolean = js.native
        @JSName("some")
        def someDictionary[T](`object`: Dictionary[T], iterator: ObjectIterator[T, Boolean] = js.native, context: JSAny = js.native): Boolean = js.native
        def any[T](list: List[T], iterator: ListIterator[T, Boolean] = js.native, context: JSAny = js.native): Boolean = js.native
        @JSName("any")
        def anyDictionary[T](`object`: Dictionary[T], iterator: ObjectIterator[T, Boolean] = js.native, context: JSAny = js.native): Boolean = js.native
        def contains[T](list: List[T], value: T): Boolean = js.native
        def contains[T](`object`: Dictionary[T], value: T): Boolean = js.native
        def include[T](list: Collection[T], value: T): Boolean = js.native
        def include[T](`object`: Dictionary[T], value: T): Boolean = js.native
        def invoke[T <: AnyRef](list: List[T], methodName: String, arguments: JSAny*): JSDynamic = js.native
        def pluck[T <: AnyRef](list: List[T], propertyName: String): JSArray[JSAny] = js.native
        def max(list: List[Double]): Double = js.native
        def max[T](list: List[T], iterator: ListIterator[T, JSAny] = js.native, context: JSAny = js.native): T = js.native
        def min(list: List[Double]): Double = js.native
        def min[T](list: List[T], iterator: ListIterator[T, JSAny] = js.native, context: JSAny = js.native): T = js.native
        def sortBy[T, TSort](list: List[T], iterator: ListIterator[T, TSort] = js.native, context: JSAny = js.native): JSArray[T] = js.native
        @JSName("sortBy")
        def sortByString[T](list: List[T], iterator: String, context: JSAny = js.native): JSArray[T] = js.native
        def groupBy[T](list: List[T], iterator: ListIterator[T, JSAny] = js.native, context: JSAny = js.native): Dictionary[JSArray[T]] = js.native
        def indexBy[T](list: List[T], iterator: ListIterator[T, JSAny], context: JSAny = js.native): Dictionary[T] = js.native
        def countBy[T](list: List[T], iterator: ListIterator[T, JSAny] = js.native, context: JSAny = js.native): Dictionary[Double] = js.native
        def shuffle[T](list: Collection[T]): JSArray[T] = js.native
        def sample[T](list: Collection[T], n: Double): JSArray[T] = js.native
        def sample[T](list: Collection[T]): T = js.native
        def toArray[T](list: Collection[T]): JSArray[T] = js.native
        def size[T](list: Collection[T]): Double = js.native
        def partition[T](array: JSArray[T], iterator: ListIterator[T, Boolean], context: JSAny = js.native): JSArray[JSArray[T]] = js.native
        def first[T](array: List[T]): T = js.native
        def first[T](array: List[T], n: Double): JSArray[T] = js.native
        def head[T](array: List[T]): T = js.native
        def head[T](array: List[T], n: Double): JSArray[T] = js.native
        def take[T](array: List[T]): T = js.native
        def take[T](array: List[T], n: Double): JSArray[T] = js.native
        def initial[T](array: List[T], n: Double = js.native): JSArray[T] = js.native
        def last[T](array: List[T]): T = js.native
        def last[T](array: List[T], n: Double): JSArray[T] = js.native
        def rest[T](array: List[T], n: Double = js.native): JSArray[T] = js.native
        def tail[T](array: List[T], n: Double = js.native): JSArray[T] = js.native
        def drop[T](array: List[T], n: Double = js.native): JSArray[T] = js.native
        def compact[T](array: List[T]): JSArray[T] = js.native
        def flatten(array: List[JSAny], shallow: Boolean = js.native): JSArray[JSAny] = js.native
        def without[T](array: List[T], values: T*): JSArray[T] = js.native
        def union[T](arrays: List[T]*): JSArray[T] = js.native
        def intersection[T](arrays: List[T]*): JSArray[T] = js.native
        def difference[T](array: List[T], others: List[T]*): JSArray[T] = js.native
        def uniq[T, TSort](array: List[T], isSorted: Boolean = false, iterator: ListIterator[T, TSort] = null, context: JSAny = null): JSArray[T] = js.native
        @JSName("uniq")
        def uniqNoBoolean[T, TSort](array: List[T], iterator: ListIterator[T, TSort] = js.native, context: JSAny = js.native): JSArray[T] = js.native
        @JSName("unique")
        def uniqueNoBoolean[T, TSort](array: List[T], iterator: ListIterator[T, TSort] = js.native, context: JSAny = js.native): JSArray[T] = js.native
        def unique[T, TSort](array: List[T], isSorted: Boolean = false, iterator: ListIterator[T, TSort] = js.native, context: JSAny = js.native): JSArray[T] = js.native
        def zip(arrays: JSArray[JSAny]*): JSArray[JSArray[JSAny]] = js.native
        @JSName("zip")
        def zipAnys(arrays: JSAny*): JSArray[JSAny] = js.native
        def `object`[TResult <: AnyRef](keys: List[String], values: List[JSAny]): TResult = js.native
        def `object`[TResult <: AnyRef](keyValuePairs: JSArray[JSAny]*): TResult = js.native
        def `object`[TResult <: AnyRef](list: List[JSAny], values: JSAny = js.native): TResult = js.native
        def indexOf[T](array: List[T], value: T, isSorted: Boolean = js.native): Double = js.native
        def indexOf[T](array: List[T], value: T, startFrom: Double): Double = js.native
        def lastIndexOf[T](array: List[T], value: T, from: Double = js.native): Double = js.native
        def sortedIndex[T, TSort](list: List[T], value: T, iterator: js.Function1[T, TSort] = js.native, context: JSAny = js.native): Double = js.native
        def range(start: Double, stop: Double, step: Double = js.native): JSArray[Double] = js.native
        def range(stop: Double): JSArray[Double] = js.native
        def bind(func: JSFunction, context: JSAny, arguments: JSAny*): js.Function0[Any] = js.native
        def bindAll(`object`: JSAny, methodNames: String*): JSDynamic = js.native
        def partial(fn: JSFunction, arguments: JSAny*): JSFunction = js.native
        def memoize(fn: JSFunction, hashFn: JSFunction = js.native): JSFunction = js.native
        def delay(func: JSFunction, wait: Double, arguments: JSAny*): JSDynamic = js.native
        def delay(func: JSFunction, arguments: JSAny*): JSDynamic = js.native
        def defer(fn: JSFunction, arguments: JSAny*): Unit = js.native
        def throttle[T <: JSFunction](func: T, wait: Double, options: ThrottleSettings = js.native): T = js.native
        def debounce[T <: JSFunction](fn: T, wait: Double, immediate: Boolean = js.native): T = js.native
        def once[T <: JSFunction](fn: T): T = js.native
        def after(count: Double, fn: JSFunction): JSFunction = js.native
        def before(count: Double, fn: JSFunction): JSFunction = js.native
        def wrap(fn: JSFunction, wrapper: JSFunction): JSFunction = js.native
        def negate(predicate: JSFunction): Boolean = js.native
        def compose(functions: JSFunction*): JSFunction = js.native
        def keys(`object`: JSAny): JSArray[String] = js.native
        def values(`object`: JSAny): JSArray[JSAny] = js.native
        def mapObject[T, U](`object`: Dictionary[T], iteratee: js.Function3[T, String, Dictionary[T], U], context: JSAny = js.native): Dictionary[U] = js.native
        @JSName("mapObject")
        def mapObjectGeneric[T](`object`: JSAny, iteratee: js.Function3[JSAny, String, JSAny, T], context: JSAny = js.native): Dictionary[T] = js.native
        @JSName("mapObject")
        def mapObjectString(`object`: JSAny, iteratee: String, context: JSAny = js.native): Dictionary[JSAny] = js.native
        def pairs(`object`: JSAny): JSArray[JSArray[JSAny]] = js.native
        def invert(`object`: JSAny): JSDynamic = js.native
        def functions(`object`: JSAny): JSArray[String] = js.native
        def methods(`object`: JSAny): JSArray[String] = js.native
        def extend(destination: JSAny, sources: JSAny*): JSDynamic = js.native
        def pick(`object`: JSAny, keys: JSAny*): JSDynamic = js.native
        def pick(`object`: JSAny, fn: js.Function3[JSAny, JSAny, JSAny, Any]): JSDynamic = js.native
        def omit(`object`: JSAny, keys: String*): JSDynamic = js.native
        def omit(`object`: JSAny, iteratee: JSFunction): JSDynamic = js.native
        def defaults(`object`: JSAny, defaults: JSAny*): JSDynamic = js.native
        @JSName("clone")
        def cloneJS[T](`object`: T): T = js.native
        def tap[T](`object`: T, intercepter: JSFunction): T = js.native
        def has(`object`: JSAny, key: String): Boolean = js.native
        def matches[T, TResult](attrs: T): ListIterator[T, TResult] = js.native
        def property(key: String): js.Function1[Object, Any] = js.native
        def isEqual(`object`: JSAny, other: JSAny): Boolean = js.native
        def isEmpty(`object`: JSAny): Boolean = js.native
        def isElement(`object`: JSAny): Boolean = js.native
        def isArray(`object`: JSAny): Boolean = js.native
        def isObject(`object`: JSAny): Boolean = js.native
        def isArguments(`object`: JSAny): Boolean = js.native
        def isFunction(`object`: JSAny): Boolean = js.native
        def isString(`object`: JSAny): Boolean = js.native
        def isNumber(`object`: JSAny): Boolean = js.native
        def isFinite(`object`: JSAny): Boolean = js.native
        def isBoolean(`object`: JSAny): Boolean = js.native
        def isDate(`object`: JSAny): Boolean = js.native
        def isRegExp(`object`: JSAny): Boolean = js.native
        def isNaN(`object`: JSAny): Boolean = js.native
        def isNull(`object`: JSAny): Boolean = js.native
        def isUndefined(value: JSAny): Boolean = js.native
        def noConflict(): JSDynamic = js.native
        def identity[T](value: T): T = js.native
        def constant[T](value: T): js.Function0[T] = js.native
        def noop(): Unit = js.native
        def times[TResult](n: Double, iterator: js.Function1[Double, TResult], context: JSAny = js.native): JSArray[TResult] = js.native
        def random(max: Double): Double = js.native
        def random(min: Double, max: Double): Double = js.native
        def mixin(`object`: JSAny): Unit = js.native
        def iteratee(value: String): JSFunction = js.native
        def iteratee(value: JSFunction, context: JSAny = js.native, argCount: Double = js.native): JSFunction = js.native
        def uniqueId(prefix: String): String = js.native
        def uniqueId(): Double = js.native
        def escape(str: String): String = js.native
        def unescape(str: String): String = js.native
        def result(`object`: JSAny, property: String): JSDynamic = js.native
        def template(templateString: String, settings: TemplateSettings = js.native): js.Function1[JSAny, String] = js.native
        @JSName("template")
        def templateWithoutData(templateString: String, settings: TemplateSettings = js.native): js.Function0[String] = js.native
        var templateSettings: TemplateSettings = js.native
        def now(): Double = js.native
        def chain[T](obj: JSArray[T]): _Chain[T] = js.native
        def chain[T <: AnyRef](obj: T): _Chain[T] = js.native
        def value[T, TResult](obj: T): TResult = js.native
    }

    @js.native
    trait Underscore[T] extends JSObject {
        def each(iterator: ListIterator[T, _], context: JSAny = js.native): JSArray[T] = js.native
        def forEach(iterator: ListIterator[T, _], context: JSAny = js.native): JSArray[T] = js.native
        def map[TResult](iterator: ListIterator[T, TResult], context: JSAny = js.native): JSArray[TResult] = js.native
        def collect[TResult](iterator: ListIterator[T, TResult], context: JSAny = js.native): JSArray[TResult] = js.native
        def reduce[TResult](iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): TResult = js.native
        def inject[TResult](iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): TResult = js.native
        def foldl[TResult](iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): TResult = js.native
        def reduceRight[TResult](iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): TResult = js.native
        def foldr[TResult](iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): TResult = js.native
        def find(iterator: ListIterator[T, Boolean], context: JSAny = js.native): T = js.native
        def detect(iterator: ListIterator[T, Boolean], context: JSAny = js.native): T = js.native
        def filter(iterator: ListIterator[T, Boolean], context: JSAny = js.native): JSArray[T] = js.native
        def select(iterator: ListIterator[T, Boolean], context: JSAny = js.native): JSArray[T] = js.native
        def where[U <: AnyRef](properties: U): JSArray[T] = js.native
        def findWhere[U <: AnyRef](properties: U): T = js.native
        def reject(iterator: ListIterator[T, Boolean], context: JSAny = js.native): JSArray[T] = js.native
        def all(iterator: ListIterator[T, Boolean] = js.native, context: JSAny = js.native): Boolean = js.native
        def every(iterator: ListIterator[T, Boolean] = js.native, context: JSAny = js.native): Boolean = js.native
        def any(iterator: ListIterator[T, Boolean] = js.native, context: JSAny = js.native): Boolean = js.native
        def some(iterator: ListIterator[T, Boolean] = js.native, context: JSAny = js.native): Boolean = js.native
        def contains(value: T): Boolean = js.native
        def include(value: T): Boolean = js.native
        def invoke(methodName: String, arguments: JSAny*): JSDynamic = js.native
        def pluck(propertyName: String): JSArray[JSAny] = js.native
        def max(): Double = js.native
        def max(iterator: ListIterator[T, Double], context: JSAny = js.native): T = js.native
        def min(): Double = js.native
        def min(iterator: ListIterator[T, Double], context: JSAny = js.native): T = js.native
        def sortBy(iterator: ListIterator[T, JSAny] = js.native, context: JSAny = js.native): JSArray[T] = js.native
        def groupBy(iterator: ListIterator[T, JSAny] = js.native, context: JSAny = js.native): Dictionary[List[T]] = js.native
        @JSName("groupBy")
        def groupByString(iterator: String, context: JSAny = js.native): Dictionary[JSArray[T]] = js.native
        def indexBy(iterator: ListIterator[T, JSAny], context: JSAny = js.native): Dictionary[T] = js.native
        def countBy(iterator: ListIterator[T, JSAny] = js.native, context: JSAny = js.native): Dictionary[Double] = js.native
        def shuffle(): JSArray[T] = js.native
        def sample[R](n: Double): JSArray[R] = js.native
        def sample[R](): R = js.native
        def toArray(): JSArray[T] = js.native
        def size(): Double = js.native
        def first(): T = js.native
        def first(n: Double): JSArray[T] = js.native
        def head(): T = js.native
        def head(n: Double): JSArray[T] = js.native
        def take(): T = js.native
        def take(n: Double): JSArray[T] = js.native
        def initial(n: Double = js.native): JSArray[T] = js.native
        def last(): T = js.native
        def last(n: Double): JSArray[T] = js.native
        def rest(n: Double = js.native): JSArray[T] = js.native
        def tail(n: Double = js.native): JSArray[T] = js.native
        def drop(n: Double = js.native): JSArray[T] = js.native
        def compact(): JSArray[T] = js.native
        def flatten(shallow: Boolean = js.native): JSArray[JSAny] = js.native
        def without(values: T*): JSArray[T] = js.native
        def partition(iterator: ListIterator[T, Boolean], context: JSAny = js.native): JSArray[JSArray[T]] = js.native
        def union(arrays: List[T]*): JSArray[T] = js.native
        def intersection(arrays: List[T]*): JSArray[T] = js.native
        def difference(others: List[T]*): JSArray[T] = js.native
        def uniq(isSorted: Boolean = js.native, iterator: ListIterator[T, JSAny] = js.native): JSArray[T] = js.native
        @JSName("uniq")
        def uniqNonBoolean[TSort](iterator: ListIterator[T, TSort] = js.native, context: JSAny = js.native): JSArray[T] = js.native
        def unique[TSort](isSorted: Boolean = js.native, iterator: ListIterator[T, TSort] = js.native): JSArray[T] = js.native
        @JSName("unique")
        def uniqueNonBoolean[TSort](iterator: ListIterator[T, TSort] = js.native, context: JSAny = js.native): JSArray[T] = js.native
        def zip(arrays: JSArray[JSAny]*): JSArray[JSArray[JSAny]] = js.native
        def `object`(keyValuePairs: JSArray[JSAny]*): JSDynamic = js.native
        def `object`(values: JSAny = js.native): JSDynamic = js.native
        def indexOf(value: T, isSorted: Boolean = js.native): Double = js.native
        def indexOf(value: T, startFrom: Double): Double = js.native
        def lastIndexOf(value: T, from: Double = js.native): Double = js.native
        def sortedIndex(value: T, iterator: js.Function1[T, Any] = js.native, context: JSAny = js.native): Double = js.native
        def range(stop: Double, step: Double = js.native): JSArray[Double] = js.native
        def range(): JSArray[Double] = js.native
        def bind(`object`: JSAny, arguments: JSAny*): JSFunction = js.native
        def bindAll(methodNames: String*): JSDynamic = js.native
        def partial(arguments: JSAny*): JSFunction = js.native
        def memoize(hashFn: js.Function1[JSAny, String] = js.native): JSFunction = js.native
        def defer(arguments: JSAny*): Unit = js.native
        def delay(wait: Double, arguments: JSAny*): JSDynamic = js.native
        def delay(arguments: JSAny*): JSDynamic = js.native
        def throttle(wait: Double, options: ThrottleSettings = js.native): JSFunction = js.native
        def debounce(wait: Double, immediate: Boolean = js.native): JSFunction = js.native
        def once(): JSFunction = js.native
        def after(fn: JSFunction): JSFunction = js.native
        def before(fn: JSFunction): JSFunction = js.native
        def wrap(wrapper: JSFunction): js.Function0[JSFunction] = js.native
        def negate(): Boolean = js.native
        def compose(functions: JSFunction*): JSFunction = js.native
        def keys(): JSArray[String] = js.native
        def values(): JSArray[T] = js.native
        def pairs(): JSArray[JSArray[JSAny]] = js.native
        def invert(): JSDynamic = js.native
        def functions(): JSArray[String] = js.native
        def methods(): JSArray[String] = js.native
        def extend(sources: JSAny*): JSDynamic = js.native
        def pick(keys: String*): JSDynamic = js.native
        def pick(fn: js.Function3[JSAny, JSAny, JSAny, Any]): JSDynamic = js.native
        def omit(keys: String*): JSDynamic = js.native
        def omit(fn: JSFunction): JSDynamic = js.native
        def defaults(defaults: JSAny*): JSDynamic = js.native
        @JSName("clone")
        def cloneJS(): T = js.native
        def tap(interceptor: JSFunction): JSDynamic = js.native
        def has(key: String): Boolean = js.native
        def matches[TResult](): ListIterator[T, TResult] = js.native
        def property(): js.Function1[Object, Any] = js.native
        def isEqual(other: JSAny): Boolean = js.native
        def isEmpty(): Boolean = js.native
        def isElement(): Boolean = js.native
        def isArray(): Boolean = js.native
        def isObject(): Boolean = js.native
        def isArguments(): Boolean = js.native
        def isFunction(): Boolean = js.native
        def isString(): Boolean = js.native
        def isNumber(): Boolean = js.native
        def isFinite(): Boolean = js.native
        def isBoolean(): Boolean = js.native
        def isDate(): Boolean = js.native
        def isRegExp(): Boolean = js.native
        def isNaN(): Boolean = js.native
        def isNull(): Boolean = js.native
        def isUndefined(): Boolean = js.native
        def identity(): JSDynamic = js.native
        def constant(): js.Function0[T] = js.native
        def noop(): Unit = js.native
        def times[TResult](iterator: js.Function1[Double, TResult], context: JSAny = js.native): JSArray[TResult] = js.native
        def random(): Double = js.native
        def random(max: Double): Double = js.native
        def mixin(): Unit = js.native
        def iteratee(context: JSAny = js.native, argCount: Double = js.native): JSFunction = js.native
        def uniqueId(): String = js.native
        def escape(): String = js.native
        def unescape(): String = js.native
        def result(property: String): JSDynamic = js.native
        def template(settings: TemplateSettings = js.native): JSFunction = js.native
        def chain(): _Chain[T] = js.native
        def value[TResult](): TResult = js.native
    }

    @js.native
    trait _Chain[T] extends JSObject {
        def each(iterator: ListIterator[T, _], context: JSAny = js.native): _Chain[T] = js.native
        def forEach(iterator: ListIterator[T, _], context: JSAny = js.native): _Chain[T] = js.native
        def map[TArray](iterator: ListIterator[T, JSArray[TArray]], context: JSAny = js.native): _ChainOfArrays[TArray] = js.native
        @JSName("map")
        def mapGeneric[TResult](iterator: ListIterator[T, TResult], context: JSAny = js.native): _Chain[TResult] = js.native
        def collect[TResult](iterator: ListIterator[T, TResult], context: JSAny = js.native): _Chain[TResult] = js.native
        def reduce[TResult](iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): _ChainSingle[TResult] = js.native
        def inject[TResult](iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): _ChainSingle[TResult] = js.native
        def foldl[TResult](iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): _ChainSingle[TResult] = js.native
        def reduceRight[TResult](iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): _ChainSingle[TResult] = js.native
        def foldr[TResult](iterator: MemoIterator[T, TResult], memo: TResult = js.native, context: JSAny = js.native): _ChainSingle[TResult] = js.native
        def find(iterator: ListIterator[T, Boolean], context: JSAny = js.native): _ChainSingle[T] = js.native
        def detect(iterator: ListIterator[T, Boolean], context: JSAny = js.native): _Chain[T] = js.native
        def filter(iterator: ListIterator[T, Boolean], context: JSAny = js.native): _Chain[T] = js.native
        def select(iterator: ListIterator[T, Boolean], context: JSAny = js.native): _Chain[T] = js.native
        def where[U <: AnyRef](properties: U): _Chain[T] = js.native
        def findWhere[U <: AnyRef](properties: U): _ChainSingle[T] = js.native
        def reject(iterator: ListIterator[T, Boolean], context: JSAny = js.native): _Chain[T] = js.native
        def all(iterator: ListIterator[T, Boolean] = js.native, context: JSAny = js.native): _Chain[T] = js.native
        def every(iterator: ListIterator[T, Boolean] = js.native, context: JSAny = js.native): _Chain[T] = js.native
        def any(iterator: ListIterator[T, Boolean] = js.native, context: JSAny = js.native): _Chain[T] = js.native
        def some(iterator: ListIterator[T, Boolean] = js.native, context: JSAny = js.native): _Chain[T] = js.native
        def contains(value: T): _Chain[T] = js.native
        def include(value: T): _Chain[T] = js.native
        def invoke(methodName: String, arguments: JSAny*): _Chain[T] = js.native
        def pluck(propertyName: String): _Chain[JSAny] = js.native
        def max(): _ChainSingle[T] = js.native
        def max(iterator: ListIterator[T, Double], context: JSAny = js.native): _ChainSingle[T] = js.native
        def min(): _ChainSingle[T] = js.native
        def min(iterator: ListIterator[T, Double], context: JSAny = js.native): _ChainSingle[T] = js.native
        def sortBy(iterator: ListIterator[T, JSAny] = js.native, context: JSAny = js.native): _Chain[T] = js.native
        def groupBy(iterator: ListIterator[T, JSAny] = js.native, context: JSAny = js.native): _ChainOfArrays[T] = js.native
        def indexBy(iterator: ListIterator[T, JSAny], context: JSAny = js.native): _Chain[T] = js.native
        def countBy(iterator: ListIterator[T, JSAny] = js.native, context: JSAny = js.native): _Chain[T] = js.native
        def shuffle(): _Chain[T] = js.native
        def sample[R](n: Double): _Chain[R] = js.native
        def sample[R](): _Chain[R] = js.native
        def toArray(): _Chain[T] = js.native
        def size(): _Chain[T] = js.native
        def first(): _ChainSingle[T] = js.native
        def first(n: Double): _Chain[T] = js.native
        def head(): _Chain[T] = js.native
        def head(n: Double): _Chain[T] = js.native
        def take(): _Chain[T] = js.native
        def take(n: Double): _Chain[T] = js.native
        def initial(n: Double = js.native): _Chain[T] = js.native
        def last(): _ChainSingle[T] = js.native
        def last(n: Double): _Chain[T] = js.native
        def rest(n: Double = js.native): _Chain[T] = js.native
        def tail(n: Double = js.native): _Chain[T] = js.native
        def drop(n: Double = js.native): _Chain[T] = js.native
        def compact(): _Chain[T] = js.native
        def flatten(shallow: Boolean = js.native): _Chain[JSAny] = js.native
        def without(values: T*): _Chain[T] = js.native
        def partition(iterator: ListIterator[T, Boolean], context: JSAny = js.native): _Chain[JSArray[JSArray[T]]] = js.native
        def union(arrays: List[T]*): _Chain[T] = js.native
        def intersection(arrays: List[T]*): _Chain[T] = js.native
        def difference(others: List[T]*): _Chain[T] = js.native
        def uniq(isSorted: Boolean = js.native, iterator: ListIterator[T, JSAny] = js.native): _Chain[T] = js.native
        @JSName("uniq")
        def uniqNoBoolean[TSort](iterator: ListIterator[T, TSort] = js.native, context: JSAny = js.native): _Chain[T] = js.native
        def unique[TSort](isSorted: Boolean = js.native, iterator: ListIterator[T, TSort] = js.native): _Chain[T] = js.native
        @JSName("unique")
        def uniqueNoBoolean[TSort](iterator: ListIterator[T, TSort] = js.native, context: JSAny = js.native): _Chain[T] = js.native
        def zip(arrays: JSArray[JSAny]*): _Chain[T] = js.native
        def `object`(keyValuePairs: JSArray[JSAny]*): _Chain[T] = js.native
        def `object`(values: JSAny = js.native): _Chain[T] = js.native
        def indexOf(value: T, isSorted: Boolean = js.native): _ChainSingle[T] = js.native
        def indexOf(value: T, startFrom: Double): _ChainSingle[T] = js.native
        def lastIndexOf(value: T, from: Double = js.native): _ChainSingle[T] = js.native
        def sortedIndex(value: T, iterator: js.Function1[T, Any] = js.native, context: JSAny = js.native): _Chain[T] = js.native
        def range(stop: Double, step: Double = js.native): _Chain[T] = js.native
        def range(): _Chain[T] = js.native
        def bind(`object`: JSAny, arguments: JSAny*): _Chain[T] = js.native
        def bindAll(methodNames: String*): _Chain[T] = js.native
        def partial(arguments: JSAny*): _Chain[T] = js.native
        def memoize(hashFn: js.Function1[JSAny, String] = js.native): _Chain[T] = js.native
        def defer(arguments: JSAny*): _Chain[T] = js.native
        def delay(wait: Double, arguments: JSAny*): _Chain[T] = js.native
        def delay(arguments: JSAny*): _Chain[T] = js.native
        def throttle(wait: Double, options: ThrottleSettings = js.native): _Chain[T] = js.native
        def debounce(wait: Double, immediate: Boolean = js.native): _Chain[T] = js.native
        def once(): _Chain[T] = js.native
        def after(func: JSFunction): _Chain[T] = js.native
        def before(fn: JSFunction): _Chain[T] = js.native
        def wrap(wrapper: JSFunction): js.Function0[_Chain[T]] = js.native
        def negate(): _Chain[T] = js.native
        def compose(functions: JSFunction*): _Chain[T] = js.native
        def keys(): _Chain[String] = js.native
        def values(): _Chain[T] = js.native
        def pairs(): _Chain[T] = js.native
        def invert(): _Chain[T] = js.native
        def functions(): _Chain[T] = js.native
        def methods(): _Chain[T] = js.native
        def extend(sources: JSAny*): _Chain[T] = js.native
        def pick(keys: String*): _Chain[T] = js.native
        def pick(fn: js.Function3[JSAny, JSAny, JSAny, Any]): _Chain[T] = js.native
        def omit(keys: String*): _Chain[T] = js.native
        def omit(iteratee: JSFunction): _Chain[T] = js.native
        def defaults(defaults: JSAny*): _Chain[T] = js.native
        @JSName("clone")
        def cloneJS(): _Chain[T] = js.native
        def tap(interceptor: JSFunction): _Chain[T] = js.native
        def has(key: String): _Chain[T] = js.native
        def matches[TResult](): _Chain[T] = js.native
        def property(): _Chain[T] = js.native
        def isEqual(other: JSAny): _Chain[T] = js.native
        def isEmpty(): _Chain[T] = js.native
        def isElement(): _Chain[T] = js.native
        def isArray(): _Chain[T] = js.native
        def isObject(): _Chain[T] = js.native
        def isArguments(): _Chain[T] = js.native
        def isFunction(): _Chain[T] = js.native
        def isString(): _Chain[T] = js.native
        def isNumber(): _Chain[T] = js.native
        def isFinite(): _Chain[T] = js.native
        def isBoolean(): _Chain[T] = js.native
        def isDate(): _Chain[T] = js.native
        def isRegExp(): _Chain[T] = js.native
        def isNaN(): _Chain[T] = js.native
        def isNull(): _Chain[T] = js.native
        def isUndefined(): _Chain[T] = js.native
        def identity(): _Chain[T] = js.native
        def constant(): _Chain[T] = js.native
        def noop(): _Chain[T] = js.native
        def times[TResult](iterator: js.Function1[Double, TResult], context: JSAny = js.native): _Chain[T] = js.native
        def random(): _Chain[T] = js.native
        def random(max: Double): _Chain[T] = js.native
        def mixin(): _Chain[T] = js.native
        def iteratee(context: JSAny = js.native, argCount: Double = js.native): _Chain[T] = js.native
        def uniqueId(): _Chain[T] = js.native
        def escape(): _Chain[T] = js.native
        def unescape(): _Chain[T] = js.native
        def result(property: String): _Chain[T] = js.native
        def template(settings: TemplateSettings = js.native): JSFunction = js.native
        def concat(arr: JSArray[T]*): _Chain[T] = js.native
        def join(separator: JSAny = js.native): _ChainSingle[T] = js.native
        def pop(): _ChainSingle[T] = js.native
        def push(item: T*): _Chain[T] = js.native
        def reverse(): _Chain[T] = js.native
        def shift(): _ChainSingle[T] = js.native
        def slice(start: Double, end: Double = js.native): _Chain[T] = js.native
        def sort(compareFn: js.Function2[T, T, Boolean]): _Chain[T] = js.native
        def splice(index: Double, quantity: Double, items: T*): _Chain[T] = js.native
        @JSName("toString")
        def toStringJS: _ChainSingle[T] = js.native
        def unshift(items: T*): _Chain[T] = js.native
        def chain(): _Chain[T] = js.native
        def value[TResult](): JSArray[T] = js.native
    }

    @js.native
    trait _ChainSingle[T] extends JSObject {
        def value(): T = js.native
    }

    @js.native
    trait _ChainOfArrays[T] extends _Chain[JSArray[T]] {
        def flatten(): _Chain[T] = js.native
    }

    @js.native
    object underscore extends js.GlobalScope {
        @JSName("_")
        var ___ : UnderscoreStatic = js.native
        type Dictionary[T] = scalajs.js.Dictionary[T]
        type List[T] = collection.mutable.IndexedSeq[T]
        type Collection[T] = collection.Iterable[T]
    }
}



