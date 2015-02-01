package com.google.gwt.dom.builder.client;

import com.google.gwt.dom.builder.shared.NavBuilder;
import com.google.gwt.dom.client.NavElement;

/**
 * DOM-based implementation of {@link NavBuilder}
 */
public class DomNavBuilder extends DomElementBuilderBase<NavBuilder, NavElement> implements NavBuilder {

    DomNavBuilder(DomBuilderImpl delegate) {
        super(delegate);
    }

}
