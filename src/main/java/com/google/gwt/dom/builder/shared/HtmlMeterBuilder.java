package com.google.gwt.dom.builder.shared;

/**
 * HTML-based implementation of {@link MeterBuilder}
 */
public class HtmlMeterBuilder extends HtmlElementBuilderBase<MeterBuilder> implements MeterBuilder {

    HtmlMeterBuilder(HtmlBuilderImpl delegate) {
        super(delegate);
    }

    @Override
    public MeterBuilder value(int value) {
        return trustedAttribute("value", value);
    }

    @Override
    public MeterBuilder min(int min) {
        return trustedAttribute("min", min);
    }

    @Override
    public MeterBuilder max(int max) {
        return trustedAttribute("max", max);
    }

    @Override
    public MeterBuilder low(int low) {
        return trustedAttribute("low", low);
    }

    @Override
    public MeterBuilder high(int high) {
        return trustedAttribute("high", high);
    }

    @Override
    public MeterBuilder optimum(int optimum) {
        return trustedAttribute("optimum", optimum);
    }
}
