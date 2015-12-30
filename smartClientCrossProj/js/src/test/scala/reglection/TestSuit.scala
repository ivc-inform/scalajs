package reglection

import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.option.ScOption._
import com.simplesys.SmartClient.option.{ScOption, ScSome}
import com.simplesys.common.Strings._
import com.simplesys.log.Logging
import com.simplesys.macros.PropsToMap
import org.scalatest.FunSuite

import scala.reflect.runtime.{universe => ru}
import scala.scalajs.js


class TestSuit extends FunSuite {
    test("1") {
        import ru._

        val cls = new ClassProps {
            override val addPropertiesOnCreate: ScOption[Boolean] = false
        }

        val tpeAbstractPropsClass = weakTypeOf[cls.type]
        val tsScOption = typeOf[ScOption[_]].typeSymbol
        val tsScSome = typeOf[ScSome[_]].typeSymbol
        val tsUnit = typeOf[Unit].typeSymbol

        val fields = tpeAbstractPropsClass.members.collect { case field if field.isPublic &&
          field.isMethod &&
          !field.asMethod.isConstructor &&
          (field.asMethod.returnType.typeSymbol == tsScOption || field.asMethod.returnType.typeSymbol == tsScSome) &&
          field.asTerm.isGetter
        => field
        }

        println(s"$newLine// Class: $tpeAbstractPropsClass ///////////////////////////////////////////////////////////////".newLine)

        println("//////////////////////////////////////////////// Fields: ///////////////////////////////////////////////////////////////")
        fields.foreach {
            field =>
                val f = field
                val typeSymbol = f.asMethod.returnType.typeSymbol
                val typeParams = f.asMethod.returnType.typeArgs
                val typeParams1 = f.asTerm.isVal
                val typeParams2 = f.asTerm.isVar

                println(s"field.name ${field.name.toString}, typeSymbol: $typeSymbol. typeParams: $typeParams")
        }
        println("//////////////////////////////////////////////// End Fields: ///////////////////////////////////////////////////////////".newLine)

        val (fAbstractPropsClass, fSimple) = fields.map { field =>
            field.typeSignature.baseType(typeOf[ScOption[_]].typeSymbol) match {
                case TypeRef(_, _, tArg) => (field, tArg.head, true)
                case NoType => (field, field.typeSignature, false)
            }
        }.partition { case (f, t, p) => p }
    }

    test("2") {

        import scala.collection.mutable

        val a = new PropsToMap[CanvasProps] with Logging {
            def getMap(props: CanvasProps) = {
                val res = mutable.HashMap.empty[String, Any]
                println(props.addPropertiesOnCreate.isEmpty);
                println(false);
                props.addPropertiesOnCreate.foreach(((v) => res.update("addPropertiesOnCreate", v)))
                props.animateAcceleration.foreach(((v) => res.update("addPropertiesOnCreate", v)))
                res.toMap
            }

            def getDictionary(props: CanvasProps): js.Dictionary[js.Any] = {
                val res = js.Dictionary.empty[js.Any]
                props.width.foreach(((item) => res.update("width", item)));
                props.visibilityChanged.foreach(((item) => res.update("visibilityChanged", item)));
                props.visibility.foreach(((item) => res.update("visibility", item.toString)));
                props.valuesManager.foreach(((item) => res.update("valuesManager", item)));
                props.useTouchScrolling.foreach(((item) => res.update("useTouchScrolling", item)));
                props.useOpacityFilter.foreach(((item) => res.update("useOpacityFilter", item)));
                props.useNativeDrag.foreach(((item) => res.update("useNativeDrag", item)));
                props.useDragMask.foreach(((item) => res.update("useDragMask", item)));
                props.useBackMask.foreach(((item) => res.update("useBackMask", item)));
                props.topElement.foreach(((item) => res.update("topElement", item)));
                props.top.foreach(((item) => res.update("top", item)));
                props.tabIndex.foreach(((item) => res.update("tabIndex", item)));
                props.styleName.foreach(((item) => res.update("styleName", item)));
                props.snapVGap.foreach(((item) => res.update("snapVGap", item)));
                props.snapVDirection.foreach(((item) => res.update("snapVDirection", item)));
                props.snapToGrid.foreach(((item) => res.update("snapToGrid", item)));
                props.snapToEdgeAlign.foreach(((item) => res.update("snapToEdgeAlign", item)));
                props.snapToCenterAlign.foreach(((item) => res.update("snapToCenterAlign", item)));
                props.snapToAlign.foreach(((item) => res.update("snapToAlign", item)));
                props.snapTo.foreach(((item) => res.update("snapTo", item)));
                props.snapResizeToGrid.foreach(((item) => res.update("snapResizeToGrid", item)));
                props.snapResizeToAlign.foreach(((item) => res.update("snapResizeToAlign", item)));
                props.snapOnDrop.foreach(((item) => res.update("snapOnDrop", item)));
                props.snapOffsetTop.foreach(((item) => res.update("snapOffsetTop", item)));
                props.snapOffsetLeft.foreach(((item) => res.update("snapOffsetLeft", item)));
                props.snapHGap.foreach(((item) => res.update("snapHGap", item)));
                props.snapHDirection.foreach(((item) => res.update("snapHDirection", item)));
                props.snapEdge.foreach(((item) => res.update("snapEdge", item)));
                props.snapAxis.foreach(((item) => res.update("snapAxis", item)));

                res
            }
        }

        println(s"Size map: ${
            a.getMap(new CanvasProps {
                override val addPropertiesOnCreate: ScOption[Boolean] = true
            }).size
        }")

        println(s"Size dict: ${
            a.getDictionary(new CanvasProps {
                override val addPropertiesOnCreate: ScOption[Boolean] = true
            }).size
        }")
    }
}


