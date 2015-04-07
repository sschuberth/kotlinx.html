package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class KBD(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("kbd", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class KEYGEN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("keygen", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var challenge : String
        get()  = attributeStringf320f1e5.get(this, "challenge")
        set(newValue) {attributeStringf320f1e5.set(this, "challenge", newValue)}

    var autoFocus : Boolean
        get()  = attributeBooleanbf9581c0.get(this, "autofocus")
        set(newValue) {attributeBooleanbf9581c0.set(this, "autofocus", newValue)}

    var keyType : KeyType
        get()  = attributeKeyTypeKeyTypeValues568965bd.get(this, "keytype")
        set(newValue) {attributeKeyTypeKeyTypeValues568965bd.set(this, "keytype", newValue)}

    var disabled : Boolean
        get()  = attributeBooleanbf9581c0.get(this, "disabled")
        set(newValue) {attributeBooleanbf9581c0.set(this, "disabled", newValue)}

    var form : String
        get()  = attributeStringf320f1e5.get(this, "form")
        set(newValue) {attributeStringf320f1e5.set(this, "form", newValue)}

    var name : String
        get()  = attributeStringf320f1e5.get(this, "name")
        set(newValue) {attributeStringf320f1e5.set(this, "name", newValue)}


}
