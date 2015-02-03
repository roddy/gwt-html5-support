package com.google.gwt.dom.client;

public class Html5Document extends Document {

    /**
     * Creates a &lt;nav&gt; element.
     * @return the newly created element
     */
    public final NavElement createNavElement() {
        return (NavElement) DOMImpl.impl.createElement(this, NavElement.TAG);
    }

    /**
     * Creates a &lt;section&gt; element.
     * @return the newly created element
     */
    public final SectionElement createSectionElement() {
        return (SectionElement) DOMImpl.impl.createElement(this, SectionElement.TAG);
    }

    public final ArticleElement createArticleElement() {
        return (ArticleElement) DOMImpl.impl.createElement(this, ArticleElement.TAG);
    }

    protected Html5Document() {

    }
}
