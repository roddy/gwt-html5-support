package com.google.gwt.dom.client;

public class Html4Document extends Document {

    /**
     * Creates a &lt;small&gt; element.
     * @return the newly created element
     */
    public final SmallElement createSmallElement() {
        return (SmallElement) DOMImpl.impl.createElement(this, SmallElement.TAG);
    }

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
