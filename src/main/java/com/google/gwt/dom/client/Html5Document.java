package com.google.gwt.dom.client;

public class Html5Document extends Document {

    /**
     * Creates a &lt;nav&gt; element.
     * @return the newly created element
     */
    public final NavElement createNavElement() {
        return (NavElement) DOMImpl.impl.createElement(this, NavElement.TAG);
    }

    protected Html5Document() {

    }
}
