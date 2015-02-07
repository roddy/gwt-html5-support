package com.google.gwt.dom.builder.shared;

/**
 * Builds a meter element.
 */
public interface MeterBuilder extends ElementBuilderBase<MeterBuilder> {

    /**
     * Current value of the element
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-value">W3C HTML5 Draft</a>
     */
    MeterBuilder value(int value);

    /**
     * Lower bound of range.
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-min">W3C HTML5 Draft</a>
     */
    MeterBuilder min(int min);

    /**
     * Upper bound of range.
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-max">W3C HTML5 Draft</a>
     */
    MeterBuilder max(int max);

    /**
     * High limit of low range
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-low">W3C HTML5 Draft</a>
     */
    MeterBuilder low(int low);

    /**
     * Low limit of high range
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-high">W3C HTML5 Draft</a>
     */
    MeterBuilder high(int high);

    /**
     * Optimum value in gauge.
     * @see <a href="http://www.w3.org/html/wg/drafts/html/master/forms.html#attr-meter-optimum">W3C HTML5 Draft</a>
     */
    MeterBuilder optimum(int optimum);
}
