package com.google.gwt.dom.builder.client;

import com.google.gwt.dom.builder.shared.SmallBuilder;
import com.google.gwt.dom.client.SmallElement;

/**
 * DOM-based implementation of {@link SmallBuilder}
 */
public class DomSmallBuilder extends DomElementBuilderBase<SmallBuilder, SmallElement> implements SmallBuilder {

    DomSmallBuilder(DomBuilderImpl delegate) {
        super(delegate);
    }
}
