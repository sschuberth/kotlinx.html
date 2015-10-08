package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

open class LABEL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("label", consumer, initialAttributes), CommonAttributeGroupFacadePhrasingContent {
    var form : String
        get()  = attributeStringString.get(this, "form")
        set(newValue) {attributeStringString.set(this, "form", newValue)}

    var for_ : String
        get()  = attributeStringString.get(this, "for")
        set(newValue) {attributeStringString.set(this, "for", newValue)}


}

open class LEGEND(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("legend", consumer, initialAttributes), CommonAttributeGroupFacadeFlowContentPhrasingContent {

}
val LEGEND.asFlowContent : FlowContent
    get()  = this

val LEGEND.asPhrasingContent : PhrasingContent
    get()  = this


open class LI(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("li", consumer, initialAttributes), CommonAttributeGroupFacadeFlowContent {
    var value : String
        get()  = attributeStringString.get(this, "value")
        set(newValue) {attributeStringString.set(this, "value", newValue)}


}

open class LINK(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("link", consumer, initialAttributes), CommonAttributeGroupFacade {
    var href : String
        get()  = attributeStringString.get(this, "href")
        set(newValue) {attributeStringString.set(this, "href", newValue)}

    var rel : String
        get()  = attributeStringString.get(this, "rel")
        set(newValue) {attributeStringString.set(this, "rel", newValue)}

    var media : String
        get()  = attributeStringString.get(this, "media")
        set(newValue) {attributeStringString.set(this, "media", newValue)}

    var type : String
        get()  = attributeStringString.get(this, "type")
        set(newValue) {attributeStringString.set(this, "type", newValue)}

    var sizes : String
        get()  = attributeStringString.get(this, "sizes")
        set(newValue) {attributeStringString.set(this, "sizes", newValue)}


}

