package com.google.gwt.dom.builder.client;

import com.google.gwt.dom.builder.shared.AsideBuilder;
import com.google.gwt.dom.client.AsideElement;

/**
 * DOM-based implementation of {@link AsideBuilder}
 */
public class DomAsideBuilder extends DomElementBuilderBase<AsideBuilder, AsideElement> implements AsideBuilder {

    DomAsideBuilder(DomBuilderImpl delegate) {
        super(delegate);
    }
}
