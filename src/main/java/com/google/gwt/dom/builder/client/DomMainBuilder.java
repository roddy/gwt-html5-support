package com.google.gwt.dom.builder.client;

import com.google.gwt.dom.builder.shared.MainBuilder;
import com.google.gwt.dom.client.MainElement;

/**
 * DOM-based implementation of {@link MainBuilder}
 */
public class DomMainBuilder extends DomElementBuilderBase<MainBuilder, MainElement> implements MainBuilder{

    DomMainBuilder(DomBuilderImpl delegate) {
        super(delegate);
    }

    @Override
    public MainBuilder role(String role) {
        assertCanAddAttribute().setRole(role);
        return this;
    }
}