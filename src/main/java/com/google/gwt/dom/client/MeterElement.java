package com.google.gwt.dom.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * HTML5 meter element.
 *
 * @see <a href="http://www.w3.org/html/wg/drafts/html/master/sections.html#the-meter-element">W3C HTML5 Draft</a>
 */
@TagName(MeterElement.TAG)
public class MeterElement extends Element{
    public static final String TAG = "meter";

    /**
     * Current value of the element
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-value">W3C HTML5 Draft</a>
     */
    public final native int getValue() /*-{
        return this.value;
    }-*/;

    /**
     * Current value of the element
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-value">W3C HTML5 Draft</a>
     */
    public final native void setValue(int value) /*-{
        var min = (this.min === null ? 0 : this.min);
        var max = (this.max === null ? 1 : this.max);

        if( value < min ) {
            value = min;
        } else if (value > max) {
            value = max;
        }

        this.value = value;
    }-*/;

    /**
     * Lower bound of range.
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-min">W3C HTML5 Draft</a>
     */
    public final native int getMin() /*-{
        return this.min;
    }-*/;

    /**
     * Lower bound of range.
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-min">W3C HTML5 Draft</a>
     */
    public final native void setMin(int min) /*-{
        this.min = min;
    }-*/;

    /**
     * Upper bound of range.
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-max">W3C HTML5 Draft</a>
     */
    public final native int getMax() /*-{
        return this.max;
    }-*/;

    /**
     * Upper bound of range.
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-max">W3C HTML5 Draft</a>
     */
    public final native void setMax(int max) /*-{
        this.max = max;
    }-*/;

    /**
     * High limit of low range
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-low">W3C HTML5 Draft</a>
     */
    public final native int getLow() /*-{
        return this.low;
    }-*/;

    /**
     * High limit of low range
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-low">W3C HTML5 Draft</a>
     */
    public final native void setLow(int low) /*-{
        var min = (this.min === null ? 0 : this.min);
        if(low < min) {
            low = min;
        }
        this.low = low;
    }-*/;

    /**
     * Low limit of high range
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-high">W3C HTML5 Draft</a>
     */
    public final native int getHigh() /*-{
        return this.high;
    }-*/;

    /**
     * Low limit of high range
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-high">W3C HTML5 Draft</a>
     */
    public final native void setHigh(int high) /*-{
        var max = (this.max === null ? 1 : this.max)
        if(high > max) {
            high = max;
        }
        this.high = high;
    }-*/;

    /**
     * Optimum value in gauge.
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-optimum">W3C HTML5 Draft</a>
     */
    public final native int getOptimum() /*-{
        return this.optimum;
    }-*/;

    /**
     * Optimum value in gauge.
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-optimum">W3C HTML5 Draft</a>
     */
    public final native void setOptimum(int optimum) /*-{
        this.optimum = optimum;
    }-*/;

    /**
     * Assert that the given {@link Element} is compatible with this class and automatically typecast it.
     */
    public static MeterElement as(Element element) {
        assert is(element);
        return (MeterElement) element;
    }

    /**
     * Determines whether the given {@link com.google.gwt.core.client.JavaScriptObject} can be cast to this class. A <code>null</code> object will
     * cause this method to return <code>false</code>.
     * @param o the object to test
     * @return true if the given object can be cast to this class, false if otherwise or null
     */
    public static boolean is(JavaScriptObject o) {
        if(Element.is(o)) {
            return is((Element)o);
        }
        return false;
    }

    /**
     * Determines whether the given {@link Node} can be cast to this class. A <code>null</code> object will cause this
     * method to return <code>null</code>.
     * @param node the Node object to test
     * @return true if the given Node can be cast to this class, false if otherwise or null
     */
    public static boolean is(Node node) {
        if(Element.is(node)) {
            return is((Element)node);
        }
        return false;
    }

    /**
     * Determines whether the given {@link Element} can be cast to this class. A <code>null</code> object will cause
     * this method to return <code>null</code>.
     * @param elem the Element object to test
     * @return true if the given Element can be cast to this class, false if otherwise or null
     */
    public static boolean is(Element elem) {
        return elem != null && elem.hasTagName(TAG);
    }

    protected MeterElement() {
        // default values:
        setMin(0);
        setMax(1);
        setValue(0);
        setLow(0);
        setHigh(1);
    }
}
