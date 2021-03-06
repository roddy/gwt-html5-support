package com.google.gwt.dom.client;

public class Html5Document extends Html4Document {

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

    /**
     * Creates a &lt;article&gt; element.
     * @return the newly created element
     */
    public final ArticleElement createArticleElement() {
        return (ArticleElement) DOMImpl.impl.createElement(this, ArticleElement.TAG);
    }

    /**
     * Creates a &lt;aside&gt; element.
     * @return the newly created element
     */
    public final AsideElement createAsideElement() {
        return (AsideElement) DOMImpl.impl.createElement(this, AsideElement.TAG);
    }

    /**
     * Creates a &lt;main&gt; element.
     * @return the newly created element
     */
    public final MainElement createMainElement() {
        return (MainElement) DOMImpl.impl.createElement(this, MainElement.TAG);
    }

    /**
     * Creates a &lt;meter&gt; element.
     * @return the newly created element
     */
    public final MeterElement createMeterElement() {
        return (MeterElement) DOMImpl.impl.createElement(this, MeterElement.TAG);
    }

    public final RubyElement createRubyElement() {
        return (RubyElement) DOMImpl.impl.createElement(this, RubyElement.RUBY_TAG);
    }

    public final RubyElement createRtcElement() {
        return (RubyElement) DOMImpl.impl.createElement(this, RubyElement.RTC_TAG);
    }

    public final RubyElement createRbElement() {
        return (RubyElement) DOMImpl.impl.createElement(this, RubyElement.RB_TAG);
    }

    public final RubyElement createRpElement() {
        return (RubyElement) DOMImpl.impl.createElement(this, RubyElement.RP_TAG);
    }

    public final RubyElement createRtElement() {
        return (RubyElement) DOMImpl.impl.createElement(this, RubyElement.RT_TAG);
    }



    protected Html5Document() {

    }
}
