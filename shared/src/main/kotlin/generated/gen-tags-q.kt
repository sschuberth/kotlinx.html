package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class Q(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("q", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var cite : String
        get()  = attributeStringf320f1e5.get(this, "cite")
        set(newValue) {attributeStringf320f1e5.set(this, "cite", newValue)}


}
