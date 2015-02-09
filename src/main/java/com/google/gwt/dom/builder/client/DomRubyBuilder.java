package com.google.gwt.dom.builder.client;

import com.google.gwt.dom.builder.shared.RubyBuilder;
import com.google.gwt.dom.client.RubyElement;

/**
 * DOM-based implementation of {@link RubyBuilder}
 */
public class DomRubyBuilder extends DomElementBuilderBase<RubyBuilder, RubyElement> implements RubyBuilder {

    DomRubyBuilder(DomBuilderImpl delegate) {
        super(delegate);
    }
}
