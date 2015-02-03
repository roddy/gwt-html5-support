package com.google.gwt.dom.client;

public class Html5DOMImplIE8 extends DOMImplIE8 {

    @Override public native Element createElement(Document doc, String tag) /*-{
        if("nav" === tag || "section" === tag) {
          tag = "div";
        }
        return doc.createElement(tag);
    }-*/;
}
