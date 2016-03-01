package backbone

import com.simplesys.backbone.Events
import org.scalatest.{FlatSpec, Matchers}

class ScalaTestBackbone extends FlatSpec with Matchers {
    "Backbone" should "do something" in {
        val obj = new Events
        1 should be(1)
    }
}
