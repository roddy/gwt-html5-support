package com.google.gwt.dom.builder.client;

import com.google.gwt.dom.builder.shared.MeterBuilder;
import com.google.gwt.dom.client.MeterElement;

/**
 * DOM-based implementation of {@link MeterBuilder}
 */
public class DomMeterBuilder extends DomElementBuilderBase<MeterBuilder, MeterElement> implements MeterBuilder {

    DomMeterBuilder(DomBuilderImpl delegate) {
        super(delegate);
    }

    @Override
    public MeterBuilder value(int value) {
        assertCanAddAttribute().setValue(value);
        return this;
    }

    @Override
    public MeterBuilder min(int min) {
        assertCanAddAttribute().setMin(min);
        return this;
    }

    @Override
    public MeterBuilder max(int max) {
        assertCanAddAttribute().setMax(max);
        return this;
    }

    @Override
    public MeterBuilder low(int low) {
        assertCanAddAttribute().setLow(low);
        return this;
    }

    @Override
    public MeterBuilder high(int high) {
        assertCanAddAttribute().setHigh(high);
        return this;
    }

    @Override
    public MeterBuilder optimum(int optimum) {
        assertCanAddAttribute().setOptimum(optimum);
        return this;
    }
}
