package com.google.gwt.dom.builder.client;

import com.google.gwt.dom.builder.shared.AbbrBuilder;
import com.google.gwt.dom.client.AbbrElement;

/**
 * DOM-based implementation of {@link AbbrBuilder}
 */
public class DomAbbrBuilder extends DomElementBuilderBase<AbbrBuilder, AbbrElement> implements AbbrBuilder {

    DomAbbrBuilder(DomBuilderImpl delegate) {
        super(delegate);
    }
}
