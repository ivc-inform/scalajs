
import org.scalajs.dom.raw.{HTMLElement, Window}
import org.scalajs.jquery._

import scala.scalajs.js
import scala.scalajs.js.annotation._

package com.simplesys {

    package backbone {

        import com.simplesys.types.{JSArray, JSDictionary, JSAny, JSArrayAny}

        @js.native
        trait Silenceable extends js.Object {
            var silent: Boolean = js.native
        }

        @js.native
        trait AddOptions extends Silenceable {
            var at: Double = js.native
        }

        @js.native
        trait HistoryOptions extends Silenceable {
            var pushState: Boolean = js.native
            var root: String = js.native
        }

        @js.native
        trait NavigateOptions extends js.Object {
            var trigger: Boolean = js.native
        }

        @js.native
        trait RouterOptions extends js.Object {
            var routes: JSAny = js.native
        }

        @js.native
        trait Validable extends js.Object {
            var validate: Boolean = js.native
        }

        @js.native
        trait Waitable extends js.Object {
            @JSName("wait")
            var waitJS: Boolean = js.native
        }

        @js.native
        trait Parseable extends js.Object {
            var parse: JSAny = js.native
        }

        @js.native
        trait PersistenceOptions extends js.Object {
            var url: String = js.native
            var beforeSend: js.Function1[JQueryXHR, Unit] = js.native
            var success: js.Function3[JSAny, JSAny, JSAny, Unit] = js.native
            var error: js.Function3[JSAny, JQueryXHR, JSAny, Unit] = js.native
        }

        @js.native
        trait ModelSetOptions extends Silenceable with Validable {
        }

        @js.native
        trait ModelFetchOptions extends PersistenceOptions with ModelSetOptions with Parseable {
        }

        @js.native
        trait ModelSaveOptions extends Silenceable with Waitable with Validable with Parseable with PersistenceOptions {
            var patch: Boolean = js.native
        }

        @js.native
        trait ModelDestroyOptions extends Waitable with PersistenceOptions {
        }

        @js.native
        trait CollectionFetchOptions extends PersistenceOptions with Parseable {
            var reset: Boolean = js.native
        }

        @js.native
        @JSName("Backbone.Events")
        class Events extends js.Object {
            def on(eventName: String, callback: js.Function = js.native, context: JSAny = js.native): js.Dynamic = js.native
            def off(eventName: String = js.native, callback: js.Function = js.native, context: JSAny = js.native): js.Dynamic = js.native
            def trigger(eventName: String, args: JSAny*): js.Dynamic = js.native
            def bind(eventName: String, callback: js.Function, context: JSAny = js.native): js.Dynamic = js.native
            def unbind(eventName: String = js.native, callback: js.Function = js.native, context: JSAny = js.native): js.Dynamic = js.native
            def once(events: String, callback: js.Function, context: JSAny = js.native): js.Dynamic = js.native
            def listenTo(`object`: JSAny, events: String, callback: js.Function): js.Dynamic = js.native
            def listenToOnce(`object`: JSAny, events: String, callback: js.Function): js.Dynamic = js.native
            def stopListening(`object`: JSAny = js.native, events: String = js.native, callback: js.Function = js.native): js.Dynamic = js.native
        }

        @js.native
        @JSName("Backbone.ModelBase")
        class ModelBase extends Events {
            var url: JSAny = js.native
            def parse(response: JSAny, options: JSAny = js.native): js.Dynamic = js.native
            def toJSON(options: JSAny = js.native): js.Dynamic = js.native
            def sync(arg: JSAny*): JQueryXHR = js.native
        }

        @js.native
        @JSName("Backbone.Model")
        class Model protected() extends ModelBase {
            //https://books.google.com/books?id=3JOHCAAAQBAJ&lpg=PT274&ots=eMqG4wHhYz&dq=private%20static%20extend%20typescript&pg=PT273#v=onepage&q=private%20static%20extend%20typescript&f=false
            //          /**
            //        * Do not use, prefer TypeScript's extend functionality.
            //        **/
            //        private static extend(properties: any, classProperties?: any): any;


            def this(attributes: JSAny = js.native, options: JSAny = js.native) = this()
            var attributes: JSAny = js.native
            var changed: JSArrayAny = js.native
            var cid: String = js.native
            var collection: backbone.Collection[_ <: Model /*JSAny*/ ] = js.native
            def defaults(): js.Dynamic = js.native
            var id: JSAny = js.native
            var idAttribute: String = js.native
            var validationError: JSAny = js.native
            var urlRoot: JSAny = js.native
            def initialize(attributes: JSAny = js.native, options: JSAny = js.native): Unit = js.native
            def fetch(options: ModelFetchOptions = js.native): JQueryXHR = js.native
            def get(attributeName: String): js.Dynamic = js.native
            @JSName("set")
            def setAttribute(attributeName: String, value: JSAny, options: ModelSetOptions = js.native): Model = js.native
            def set(obj: JSAny, options: ModelSetOptions = js.native): Model = js.native
            def change(): js.Dynamic = js.native
            def changedAttributes(attributes: JSAny = js.native): JSArrayAny = js.native
            def clear(options: Silenceable = js.native): js.Dynamic = js.native
            @JSName("clone")
            def cloneJS(): Model = js.native
            def destroy(options: ModelDestroyOptions = js.native): js.Dynamic = js.native
            def escape(attribute: String): String = js.native
            def has(attribute: String): Boolean = js.native
            def hasChanged(attribute: String = js.native): Boolean = js.native
            def isNew(): Boolean = js.native
            def isValid(options: JSAny = js.native): Boolean = js.native
            def previous(attribute: String): js.Dynamic = js.native
            def previousAttributes(): JSArrayAny = js.native
            def save(attributes: JSAny = js.native, options: ModelSaveOptions = js.native): js.Dynamic = js.native
            def unset(attribute: String, options: Silenceable = js.native): Model = js.native
            def validate(attributes: JSAny, options: JSAny = js.native): js.Dynamic = js.native

            //        private _validate(attrs: any, options: any): boolean;

            def keys(): JSArray[String] = js.native
            def values(): JSArrayAny = js.native
            def pairs(): JSArrayAny = js.native
            def invert(): js.Dynamic = js.native
            def pick(keys: JSArray[String]): js.Dynamic = js.native
            def omit(keys: JSArray[String]): js.Dynamic = js.native
        }

        @js.native
        @JSName("Backbone.Collection")
        class Collection[TModel <: Model] protected() extends ModelBase {
            //        /**
            //        * Do not use, prefer TypeScript's extend functionality.
            //        **/
            //        private static extend(properties: any, classProperties?: any): any;
            def this(models: JSArray[TModel] = js.native, options: JSAny = js.native) = this()
            var models: JSArray[TModel] = js.native
            var length: Double = js.native
            def initialize(models: JSArray[TModel] = js.native, options: JSAny = js.native): Unit = js.native
            def fetch(options: CollectionFetchOptions = js.native): JQueryXHR = js.native
            def comparator(element: TModel): Double = js.native
            def comparator(compare: TModel, to: TModel = js.native): Double = js.native
            def add(model: TModel, options: AddOptions = js.native): Collection[TModel] = js.native
            @JSName("add")
            def addModels(models: JSArray[TModel], options: AddOptions = js.native): Collection[TModel] = js.native
            def at(index: Double): TModel = js.native
            def get(id: Double): TModel = js.native
            def create(attributes: JSAny, options: ModelSaveOptions = js.native): TModel = js.native
            def pluck(attribute: String): JSArrayAny = js.native
            def push(model: TModel, options: AddOptions = js.native): TModel = js.native
            def pop(options: Silenceable = js.native): TModel = js.native
            def remove(model: TModel, options: Silenceable = js.native): TModel = js.native
            @JSName("remove")
            def removeModels(models: JSArray[TModel], options: Silenceable = js.native): JSArray[TModel] = js.native
            def reset(models: JSArray[TModel] = js.native, options: Silenceable = js.native): JSArray[TModel] = js.native
            def set(models: JSArray[TModel] = js.native, options: Silenceable = js.native): JSArray[TModel] = js.native
            def shift(options: Silenceable = js.native): TModel = js.native
            def sort(options: Silenceable = js.native): Collection[TModel] = js.native
            def unshift(model: TModel, options: AddOptions = js.native): TModel = js.native
            def where(properies: JSAny): JSArray[TModel] = js.native
            def findWhere(properties: JSAny): TModel = js.native

            //        private _prepareModel(attrs?: any, options?: any): any;
            //        private _removeReference(model: TModel): void;
            //        private _onModelEvent(event: string, model: TModel, collection: Collection<TModel>, options: any): void;

            def all(iterator: js.Function2[TModel, Double, Boolean], context: JSAny = js.native): Boolean = js.native
            def any(iterator: js.Function2[TModel, Double, Boolean], context: JSAny = js.native): Boolean = js.native
            def collect(iterator: js.Function3[TModel, Double, JSAny, JSArray[JSAny]], context: JSAny = js.native): JSArrayAny = js.native
            def chain(): js.Dynamic = js.native
            def contains(value: JSAny): Boolean = js.native
            def countBy(iterator: js.Function2[TModel, Double, Any]): JSDictionary[Double] = js.native
            def countBy(attribute: String): JSDictionary[Double] = js.native
            def detect(iterator: js.Function1[JSAny, Boolean], context: JSAny = js.native): js.Dynamic = js.native
            def drop(): TModel = js.native
            def drop(n: Double): JSArray[TModel] = js.native
            def each(iterator: js.Function3[TModel, Double, JSAny, Unit], context: JSAny = js.native): js.Dynamic = js.native
            def every(iterator: js.Function2[TModel, Double, Boolean], context: JSAny = js.native): Boolean = js.native
            def filter(iterator: js.Function2[TModel, Double, Boolean], context: JSAny = js.native): JSArray[TModel] = js.native
            def find(iterator: js.Function2[TModel, Double, Boolean], context: JSAny = js.native): TModel = js.native
            def first(): TModel = js.native
            def first(n: Double): JSArray[TModel] = js.native
            def foldl(iterator: js.Function3[JSAny, TModel, Double, Any], initialMemo: JSAny, context: JSAny = js.native): js.Dynamic = js.native
            def forEach(iterator: js.Function3[TModel, Double, JSAny, Unit], context: JSAny = js.native): js.Dynamic = js.native
            def groupBy(iterator: js.Function2[TModel, Double, String], context: JSAny = js.native): JSDictionary[JSArray[TModel]] = js.native
            @JSName("groupBy")
            def groupByAttribute(attribute: String, context: JSAny = js.native): JSDictionary[JSArray[TModel]] = js.native
            def include(value: JSAny): Boolean = js.native
            def indexOf(element: TModel, isSorted: Boolean = js.native): Double = js.native
            def initial(): TModel = js.native
            def initial(n: Double): JSArray[TModel] = js.native
            def inject(iterator: js.Function3[JSAny, TModel, Double, Any], initialMemo: JSAny, context: JSAny = js.native): js.Dynamic = js.native
            def isEmpty(`object`: JSAny): Boolean = js.native
            def invoke(methodName: String, args: JSArrayAny = js.native): js.Dynamic = js.native
            def last(): TModel = js.native
            def last(n: Double): JSArray[TModel] = js.native
            def lastIndexOf(element: TModel, fromIndex: Double = js.native): Double = js.native
            def map(iterator: js.Function3[TModel, Double, JSAny, Any], context: JSAny = js.native): JSArrayAny = js.native
            def max(iterator: js.Function2[TModel, Double, Any] = js.native, context: JSAny = js.native): TModel = js.native
            def min(iterator: js.Function2[TModel, Double, Any] = js.native, context: JSAny = js.native): TModel = js.native
            def reduce(iterator: js.Function3[JSAny, TModel, Double, Any], initialMemo: JSAny, context: JSAny = js.native): js.Dynamic = js.native
            def select(iterator: JSAny, context: JSAny = js.native): JSArrayAny = js.native
            def size(): Double = js.native
            def shuffle(): JSArrayAny = js.native
            def some(iterator: js.Function2[TModel, Double, Boolean], context: JSAny = js.native): Boolean = js.native
            def sortBy(iterator: js.Function2[TModel, Double, Double], context: JSAny = js.native): JSArray[TModel] = js.native
            @JSName("sortBy")
            def sortByAttribute(attribute: String, context: JSAny = js.native): JSArray[TModel] = js.native
            def sortedIndex(element: TModel, iterator: js.Function2[TModel, Double, Double] = js.native): Double = js.native
            def reduceRight(iterator: js.Function3[JSAny, TModel, Double, Any], initialMemo: JSAny, context: JSAny = js.native): JSArrayAny = js.native
            def reject(iterator: js.Function2[TModel, Double, Boolean], context: JSAny = js.native): JSArray[TModel] = js.native
            def rest(): TModel = js.native
            def rest(n: Double): JSArray[TModel] = js.native
            def tail(): TModel = js.native
            def tail(n: Double): JSArray[TModel] = js.native
            def toArray(): JSArrayAny = js.native
            def without(values: JSAny*): JSArray[TModel] = js.native
        }

        @js.native
        @JSName("Backbone.Router")
        class Router protected() extends Events {
            //        /**
            //        * Do not use, prefer TypeScript's extend functionality.
            //        **/
            //        private static extend(properties: any, classProperties?: any): any;

            def this(options: RouterOptions = js.native) = this()
            var routes: JSAny = js.native
            def initialize(options: RouterOptions = js.native): Unit = js.native
            def route(route: String, name: String, callback: js.Function = js.native): Router = js.native
            def navigate(fragment: String, options: NavigateOptions = js.native): Router = js.native
            @JSName("navigate")
            def navigateTrigger(fragment: String, trigger: Boolean = js.native): Router = js.native

            //        private _bindRoutes(): void;
            //        private _routeToRegExp(route: string): RegExp;
            //        private _extractParameters(route: RegExp, fragment: string): string[];
        }

        @js.native
        @JSName("Backbone.History")
        class History extends Events {
            var handlers: JSArrayAny = js.native
            var interval: Double = js.native
            def start(options: HistoryOptions = js.native): Boolean = js.native
            def getHash(window: Window = js.native): String = js.native
            def getFragment(fragment: String = js.native, forcePushState: Boolean = js.native): String = js.native
            def stop(): Unit = js.native
            def route(route: String, callback: js.Function): Double = js.native
            def checkUrl(e: JSAny = js.native): Unit = js.native
            def loadUrl(fragmentOverride: String): Boolean = js.native
            def navigate(fragment: String, options: JSAny = js.native): Boolean = js.native
            var started: Boolean = js.native
            var options: JSAny = js.native

            //        private _updateHash(location: Location, fragment: string, replace: boolean): void;
        }

        @js.native
        trait ViewOptions[TModel <: Model] extends js.Object {
            var model: TModel = js.native
            var collection: backbone.Collection[TModel] = js.native
            var el: JSAny = js.native
            var id: String = js.native
            var className: String = js.native
            var tagName: String = js.native
            var attributes: JSAny = js.native
        }

        @js.native
        @JSName("Backbone.View")
        class View[TModel <: Model] protected() extends Events {
            //        /**
            //        * Do not use, prefer TypeScript's extend functionality.
            //        **/
            //        private static extend(properties: any, classProperties?: any): any;

            def this(options: ViewOptions[TModel] = js.native) = this()
            def initialize(options: ViewOptions[TModel] = js.native): Unit = js.native
            def events(): js.Dynamic = js.native
            @JSName("$")
            def `$`(selector: String): JQuery = js.native
            var model: TModel = js.native
            var collection: Collection[TModel] = js.native
            def setElement(element: HTMLElement, delegate: Boolean = js.native): View[TModel] = js.native
            var id: String = js.native
            var cid: String = js.native
            var className: String = js.native
            var tagName: String = js.native
            var el: JSAny = js.native
            @JSName("$el")
            var `$el`: JQuery = js.native
            def setElement(element: JSAny): View[TModel] = js.native
            var attributes: JSAny = js.native
            def render(): View[TModel] = js.native
            def remove(): View[TModel] = js.native
            def make(tagName: JSAny, attributes: JSAny = js.native, content: JSAny = js.native): js.Dynamic = js.native
            def delegateEvents(events: JSAny = js.native): js.Dynamic = js.native
            def undelegateEvents(): js.Dynamic = js.native
            def _ensureElement(): Unit = js.native
        }

    }

    package backbone {
        @js.native
        @JSName("Backbone")
        object Backbone extends js.Object {
            var history: History = js.native
            def sync(method: String, model: Model, options: JQueryAjaxSettings = js.native): js.Dynamic = js.native
            def ajax(options: JQueryAjaxSettings = js.native): JQueryXHR = js.native
            var emulateHTTP: Boolean = js.native
            var emulateJSON: Boolean = js.native
            var `$`: JQueryStatic = js.native
        }
    }

}
