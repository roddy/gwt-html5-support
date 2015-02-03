package com.google.gwt.dom.builder.client;

import com.google.gwt.dom.builder.shared.SectionBuilder;
import com.google.gwt.dom.client.SectionElement;

/**
 * DOM-based implementation of {@link SectionBuilder}
 */
public class DomSectionBuilder  extends DomElementBuilderBase<SectionBuilder, SectionElement> implements SectionBuilder {

    DomSectionBuilder(DomBuilderImpl delegate) {
        super(delegate);
    }
}
