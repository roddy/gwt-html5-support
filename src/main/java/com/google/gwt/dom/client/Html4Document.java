package com.google.gwt.dom.client;

public class Html4Document extends Document {

    /**
     * Creates a &lt;abbr&gt; element.
     * @return the newly created element
     */
    public final AbbrElement createAbbrElement() {
        return (AbbrElement) DOMImpl.impl.createElement(this, AbbrElement.TAG);
    }

    protected Html4Document() {

    }
}
