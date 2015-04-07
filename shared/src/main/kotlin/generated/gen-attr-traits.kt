package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public trait CoreAttributeGroupFacade : Tag {
    var accessKey : String
        get()  = attributeStringf320f1e5.get(this, "accesskey")
        set(newValue) {attributeStringf320f1e5.set(this, "accesskey", newValue)}

    var classes : String
        get()  = attributeStringf320f1e5.get(this, "class")
        set(newValue) {attributeStringf320f1e5.set(this, "class", newValue)}

    var contentEditable : Boolean
        get()  = attributeBoolean9946b2.get(this, "contenteditable")
        set(newValue) {attributeBoolean9946b2.set(this, "contenteditable", newValue)}

    var contextMenu : String
        get()  = attributeStringf320f1e5.get(this, "contextmenu")
        set(newValue) {attributeStringf320f1e5.set(this, "contextmenu", newValue)}

    var dataFolderName : String
        get()  = attributeStringf320f1e5.get(this, "data-FolderName")
        set(newValue) {attributeStringf320f1e5.set(this, "data-FolderName", newValue)}

    var dataMsgId : String
        get()  = attributeStringf320f1e5.get(this, "data-MsgId")
        set(newValue) {attributeStringf320f1e5.set(this, "data-MsgId", newValue)}

    var dir : Dir
        get()  = attributeDirDirValuesa269b13d.get(this, "dir")
        set(newValue) {attributeDirDirValuesa269b13d.set(this, "dir", newValue)}

    var draggable : Draggable
        get()  = attributeDraggableDraggableValuese45a793d.get(this, "draggable")
        set(newValue) {attributeDraggableDraggableValuese45a793d.set(this, "draggable", newValue)}

    var hidden : Boolean
        get()  = attributeBooleanbf9581c0.get(this, "hidden")
        set(newValue) {attributeBooleanbf9581c0.set(this, "hidden", newValue)}

    var id : String
        get()  = attributeStringf320f1e5.get(this, "id")
        set(newValue) {attributeStringf320f1e5.set(this, "id", newValue)}

    var item : String
        get()  = attributeStringf320f1e5.get(this, "item")
        set(newValue) {attributeStringf320f1e5.set(this, "item", newValue)}

    var itemProp : String
        get()  = attributeStringf320f1e5.get(this, "itemprop")
        set(newValue) {attributeStringf320f1e5.set(this, "itemprop", newValue)}

    var lang : String
        get()  = attributeStringf320f1e5.get(this, "lang")
        set(newValue) {attributeStringf320f1e5.set(this, "lang", newValue)}

    var role : String
        get()  = attributeStringf320f1e5.get(this, "role")
        set(newValue) {attributeStringf320f1e5.set(this, "role", newValue)}

    var runAt : RunAt
        get()  = attributeRunAtRunAtValues218c6a9d.get(this, "runat")
        set(newValue) {attributeRunAtRunAtValues218c6a9d.set(this, "runat", newValue)}

    var spellCheck : Boolean
        get()  = attributeBoolean9946b2.get(this, "spellcheck")
        set(newValue) {attributeBoolean9946b2.set(this, "spellcheck", newValue)}

    var style : String
        get()  = attributeStringf320f1e5.get(this, "style")
        set(newValue) {attributeStringf320f1e5.set(this, "style", newValue)}

    var subject : String
        get()  = attributeStringf320f1e5.get(this, "subject")
        set(newValue) {attributeStringf320f1e5.set(this, "subject", newValue)}

    var tabIndex : String
        get()  = attributeStringf320f1e5.get(this, "tabIndex")
        set(newValue) {attributeStringf320f1e5.set(this, "tabIndex", newValue)}

    var title : String
        get()  = attributeStringf320f1e5.get(this, "title")
        set(newValue) {attributeStringf320f1e5.set(this, "title", newValue)}

}

public trait AServerAttributeGroupFacade : Tag {
    var onServerClick : String
        get()  = attributeStringf320f1e5.get(this, "OnServerClick")
        set(newValue) {attributeStringf320f1e5.set(this, "OnServerClick", newValue)}

}

public trait ButtonServerAttributeGroupFacade : Tag {
    var causesValidation : Boolean
        get()  = attributeBoolean9946b2.get(this, "CausesValidation")
        set(newValue) {attributeBoolean9946b2.set(this, "CausesValidation", newValue)}

    var validationGroup : String
        get()  = attributeStringf320f1e5.get(this, "ValidationGroup")
        set(newValue) {attributeStringf320f1e5.set(this, "ValidationGroup", newValue)}

}

public trait SelectServerAttributeGroupFacade : Tag {
    var dataSourceID : String
        get()  = attributeStringf320f1e5.get(this, "DataSourceID")
        set(newValue) {attributeStringf320f1e5.set(this, "DataSourceID", newValue)}

    var dataTextField : String
        get()  = attributeStringf320f1e5.get(this, "DataTextField")
        set(newValue) {attributeStringf320f1e5.set(this, "DataTextField", newValue)}

    var dataValueField : String
        get()  = attributeStringf320f1e5.get(this, "DataValueField")
        set(newValue) {attributeStringf320f1e5.set(this, "DataValueField", newValue)}

    var onServerChange : String
        get()  = attributeStringf320f1e5.get(this, "OnServerChange")
        set(newValue) {attributeStringf320f1e5.set(this, "OnServerChange", newValue)}

}

public trait FormServerAttributeGroupFacade : Tag {
    var defaultButton : String
        get()  = attributeStringf320f1e5.get(this, "DefaultButton")
        set(newValue) {attributeStringf320f1e5.set(this, "DefaultButton", newValue)}

    var defaultFocus : String
        get()  = attributeStringf320f1e5.get(this, "DefaultFocus")
        set(newValue) {attributeStringf320f1e5.set(this, "DefaultFocus", newValue)}

    var submitDisabledControls : Boolean
        get()  = attributeBoolean9946b2.get(this, "SubmitDisabledControls")
        set(newValue) {attributeBoolean9946b2.set(this, "SubmitDisabledControls", newValue)}

}

public trait CoreServerAttributeGroupFacade : Tag {
    var enableTheming : Boolean
        get()  = attributeBoolean9946b2.get(this, "EnableTheming")
        set(newValue) {attributeBoolean9946b2.set(this, "EnableTheming", newValue)}

    var enableViewState : Boolean
        get()  = attributeBoolean9946b2.get(this, "EnableViewState")
        set(newValue) {attributeBoolean9946b2.set(this, "EnableViewState", newValue)}

    var onDataBinding : String
        get()  = attributeStringf320f1e5.get(this, "OnDataBinding")
        set(newValue) {attributeStringf320f1e5.set(this, "OnDataBinding", newValue)}

    var onDisposed : String
        get()  = attributeStringf320f1e5.get(this, "OnDisposed")
        set(newValue) {attributeStringf320f1e5.set(this, "OnDisposed", newValue)}

    var onInit : String
        get()  = attributeStringf320f1e5.get(this, "OnInit")
        set(newValue) {attributeStringf320f1e5.set(this, "OnInit", newValue)}

    var onPreREndEr : String
        get()  = attributeStringf320f1e5.get(this, "OnPreRender")
        set(newValue) {attributeStringf320f1e5.set(this, "OnPreRender", newValue)}

    var skinID : String
        get()  = attributeStringf320f1e5.get(this, "SkinID")
        set(newValue) {attributeStringf320f1e5.set(this, "SkinID", newValue)}

    var visible : Boolean
        get()  = attributeBoolean9946b2.get(this, "Visible")
        set(newValue) {attributeBoolean9946b2.set(this, "Visible", newValue)}

}

public trait CommonEventsGroupFacade : Tag {
    var onAbort : String
        get()  = attributeStringf320f1e5.get(this, "onabort")
        set(newValue) {attributeStringf320f1e5.set(this, "onabort", newValue)}

    var onBlur : String
        get()  = attributeStringf320f1e5.get(this, "onblur")
        set(newValue) {attributeStringf320f1e5.set(this, "onblur", newValue)}

    var onCanPlay : String
        get()  = attributeStringf320f1e5.get(this, "oncanplay")
        set(newValue) {attributeStringf320f1e5.set(this, "oncanplay", newValue)}

    var onCanPlayThrough : String
        get()  = attributeStringf320f1e5.get(this, "oncanplaythrough")
        set(newValue) {attributeStringf320f1e5.set(this, "oncanplaythrough", newValue)}

    var onChange : String
        get()  = attributeStringf320f1e5.get(this, "onchange")
        set(newValue) {attributeStringf320f1e5.set(this, "onchange", newValue)}

    var onClick : String
        get()  = attributeStringf320f1e5.get(this, "onclick")
        set(newValue) {attributeStringf320f1e5.set(this, "onclick", newValue)}

    var onContextMenu : String
        get()  = attributeStringf320f1e5.get(this, "oncontextmenu")
        set(newValue) {attributeStringf320f1e5.set(this, "oncontextmenu", newValue)}

    var onDoubleClick : String
        get()  = attributeStringf320f1e5.get(this, "ondblclick")
        set(newValue) {attributeStringf320f1e5.set(this, "ondblclick", newValue)}

    var onDrag : String
        get()  = attributeStringf320f1e5.get(this, "ondrag")
        set(newValue) {attributeStringf320f1e5.set(this, "ondrag", newValue)}

    var onDragEnter : String
        get()  = attributeStringf320f1e5.get(this, "ondragenter")
        set(newValue) {attributeStringf320f1e5.set(this, "ondragenter", newValue)}

    var onDragLeave : String
        get()  = attributeStringf320f1e5.get(this, "ondragleave")
        set(newValue) {attributeStringf320f1e5.set(this, "ondragleave", newValue)}

    var onDragOver : String
        get()  = attributeStringf320f1e5.get(this, "ondragover")
        set(newValue) {attributeStringf320f1e5.set(this, "ondragover", newValue)}

    var onDragStart : String
        get()  = attributeStringf320f1e5.get(this, "ondragstart")
        set(newValue) {attributeStringf320f1e5.set(this, "ondragstart", newValue)}

    var onDrop : String
        get()  = attributeStringf320f1e5.get(this, "ondrop")
        set(newValue) {attributeStringf320f1e5.set(this, "ondrop", newValue)}

    var onDurationChange : String
        get()  = attributeStringf320f1e5.get(this, "ondurationchange")
        set(newValue) {attributeStringf320f1e5.set(this, "ondurationchange", newValue)}

    var onEmptied : String
        get()  = attributeStringf320f1e5.get(this, "onemptied")
        set(newValue) {attributeStringf320f1e5.set(this, "onemptied", newValue)}

    var onEnded : String
        get()  = attributeStringf320f1e5.get(this, "onended")
        set(newValue) {attributeStringf320f1e5.set(this, "onended", newValue)}

    var onError : String
        get()  = attributeStringf320f1e5.get(this, "onerror")
        set(newValue) {attributeStringf320f1e5.set(this, "onerror", newValue)}

    var onFocus : String
        get()  = attributeStringf320f1e5.get(this, "onfocus")
        set(newValue) {attributeStringf320f1e5.set(this, "onfocus", newValue)}

    var onFormChange : String
        get()  = attributeStringf320f1e5.get(this, "onformchange")
        set(newValue) {attributeStringf320f1e5.set(this, "onformchange", newValue)}

    var onFormInput : String
        get()  = attributeStringf320f1e5.get(this, "onforminput")
        set(newValue) {attributeStringf320f1e5.set(this, "onforminput", newValue)}

    var onInput : String
        get()  = attributeStringf320f1e5.get(this, "oninput")
        set(newValue) {attributeStringf320f1e5.set(this, "oninput", newValue)}

    var onInvalid : String
        get()  = attributeStringf320f1e5.get(this, "oninvalid")
        set(newValue) {attributeStringf320f1e5.set(this, "oninvalid", newValue)}

    var onKeyDown : String
        get()  = attributeStringf320f1e5.get(this, "onkeydown")
        set(newValue) {attributeStringf320f1e5.set(this, "onkeydown", newValue)}

    var onKeyPress : String
        get()  = attributeStringf320f1e5.get(this, "onkeypress")
        set(newValue) {attributeStringf320f1e5.set(this, "onkeypress", newValue)}

    var onKeyUp : String
        get()  = attributeStringf320f1e5.get(this, "onkeyup")
        set(newValue) {attributeStringf320f1e5.set(this, "onkeyup", newValue)}

    var onLoad : String
        get()  = attributeStringf320f1e5.get(this, "onload")
        set(newValue) {attributeStringf320f1e5.set(this, "onload", newValue)}

    var onLoadedData : String
        get()  = attributeStringf320f1e5.get(this, "onloadeddata")
        set(newValue) {attributeStringf320f1e5.set(this, "onloadeddata", newValue)}

    var onLoadedMetaData : String
        get()  = attributeStringf320f1e5.get(this, "onloadedmetadata")
        set(newValue) {attributeStringf320f1e5.set(this, "onloadedmetadata", newValue)}

    var onLoadStart : String
        get()  = attributeStringf320f1e5.get(this, "onloadstart")
        set(newValue) {attributeStringf320f1e5.set(this, "onloadstart", newValue)}

    var onMouseDown : String
        get()  = attributeStringf320f1e5.get(this, "onmousedown")
        set(newValue) {attributeStringf320f1e5.set(this, "onmousedown", newValue)}

    var onMouseMove : String
        get()  = attributeStringf320f1e5.get(this, "onmousemove")
        set(newValue) {attributeStringf320f1e5.set(this, "onmousemove", newValue)}

    var onMouseOut : String
        get()  = attributeStringf320f1e5.get(this, "onmouseout")
        set(newValue) {attributeStringf320f1e5.set(this, "onmouseout", newValue)}

    var onMouseOver : String
        get()  = attributeStringf320f1e5.get(this, "onmouseover")
        set(newValue) {attributeStringf320f1e5.set(this, "onmouseover", newValue)}

    var onMouseUp : String
        get()  = attributeStringf320f1e5.get(this, "onmouseup")
        set(newValue) {attributeStringf320f1e5.set(this, "onmouseup", newValue)}

    var onMouseWheel : String
        get()  = attributeStringf320f1e5.get(this, "onmousewheel")
        set(newValue) {attributeStringf320f1e5.set(this, "onmousewheel", newValue)}

    var onPause : String
        get()  = attributeStringf320f1e5.get(this, "onpause")
        set(newValue) {attributeStringf320f1e5.set(this, "onpause", newValue)}

    var onPlay : String
        get()  = attributeStringf320f1e5.get(this, "onplay")
        set(newValue) {attributeStringf320f1e5.set(this, "onplay", newValue)}

    var onPlaying : String
        get()  = attributeStringf320f1e5.get(this, "onplaying")
        set(newValue) {attributeStringf320f1e5.set(this, "onplaying", newValue)}

    var onProgress : String
        get()  = attributeStringf320f1e5.get(this, "onprogress")
        set(newValue) {attributeStringf320f1e5.set(this, "onprogress", newValue)}

    var onRateChange : String
        get()  = attributeStringf320f1e5.get(this, "onratechange")
        set(newValue) {attributeStringf320f1e5.set(this, "onratechange", newValue)}

    var onReadyStateChange : String
        get()  = attributeStringf320f1e5.get(this, "onreadystatechange")
        set(newValue) {attributeStringf320f1e5.set(this, "onreadystatechange", newValue)}

    var onScroll : String
        get()  = attributeStringf320f1e5.get(this, "onscroll")
        set(newValue) {attributeStringf320f1e5.set(this, "onscroll", newValue)}

    var onSeeked : String
        get()  = attributeStringf320f1e5.get(this, "onseeked")
        set(newValue) {attributeStringf320f1e5.set(this, "onseeked", newValue)}

    var onSeeking : String
        get()  = attributeStringf320f1e5.get(this, "onseeking")
        set(newValue) {attributeStringf320f1e5.set(this, "onseeking", newValue)}

    var onSelect : String
        get()  = attributeStringf320f1e5.get(this, "onselect")
        set(newValue) {attributeStringf320f1e5.set(this, "onselect", newValue)}

    var onShow : String
        get()  = attributeStringf320f1e5.get(this, "onshow")
        set(newValue) {attributeStringf320f1e5.set(this, "onshow", newValue)}

    var onStalled : String
        get()  = attributeStringf320f1e5.get(this, "onstalled")
        set(newValue) {attributeStringf320f1e5.set(this, "onstalled", newValue)}

    var onSubmit : String
        get()  = attributeStringf320f1e5.get(this, "onsubmit")
        set(newValue) {attributeStringf320f1e5.set(this, "onsubmit", newValue)}

    var onSuspend : String
        get()  = attributeStringf320f1e5.get(this, "onsuspend")
        set(newValue) {attributeStringf320f1e5.set(this, "onsuspend", newValue)}

    var onTimeUpdate : String
        get()  = attributeStringf320f1e5.get(this, "ontimeupdate")
        set(newValue) {attributeStringf320f1e5.set(this, "ontimeupdate", newValue)}

    var onVolumeChange : String
        get()  = attributeStringf320f1e5.get(this, "onvolumechange")
        set(newValue) {attributeStringf320f1e5.set(this, "onvolumechange", newValue)}

    var onWaiting : String
        get()  = attributeStringf320f1e5.get(this, "onwaiting")
        set(newValue) {attributeStringf320f1e5.set(this, "onwaiting", newValue)}

}
