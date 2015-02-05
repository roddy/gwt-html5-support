package com.google.gwt.dom.builder.shared;

/**
 * HTML-based implementation of {@link MainBuilder}
 */
public class HtmlMainBuilder extends HtmlElementBuilderBase<MainBuilder> implements MainBuilder {

    HtmlMainBuilder(HtmlBuilderImpl delegate) {
        super(delegate);
    }

    @Override
    public MainBuilder role(String role) {
        return trustedAttribute("role", role);
    }
}
