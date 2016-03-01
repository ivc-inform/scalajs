package backbone

import com.simplesys.backbone.Events
import utest._
import utest.framework.TestSuite

object TestBackbone extends TestSuite {
    val tests = TestSuite {
        'testEvents {
            val obj = new Events()
            obj.on("alert", (eventName: String) => scalajs.js.Dynamic.global.alert("Triggered " + eventName))

            obj.trigger("alert", "an event")

            val onChange = () => scalajs.js.Dynamic.global.alert("whatever")
            val context: scalajs.js.Any = null

            obj.off("change", onChange)
            obj.off("change")
            obj.off(null, onChange)
            obj.off(null, null, context)
            obj.off()
        }
    }
}

