package com.google.gwt.dom.client;

import com.google.gwt.core.client.JavaScriptObject;

@TagName(ArticleElement.TAG)
public class ArticleElement extends Element {
    public static final String TAG = "article";

    public static ArticleElement as(Element element) {
        assert is(element);
        return (ArticleElement) element;
    }

    public static boolean is(JavaScriptObject o) {
        if(Element.is(o)) {
            return is((Element)o);
        }
        return false;
    }

    public static boolean is(Node node) {
        if(Element.is(node)) {
            return is((Element)node);
        }
        return false;
    }

    public static boolean is(Element element) {
        return element != null && element.hasTagName(TAG);
    }

    protected ArticleElement() {
        
    }
}

