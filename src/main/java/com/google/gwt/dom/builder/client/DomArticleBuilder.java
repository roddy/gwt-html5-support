package com.google.gwt.dom.builder.client;

import com.google.gwt.dom.builder.shared.ArticleBuilder;
import com.google.gwt.dom.client.ArticleElement;

/**
 * DOM-based implementation of {@link ArticleBuilder}
 */
public class DomArticleBuilder extends DomElementBuilderBase<ArticleBuilder, ArticleElement> implements ArticleBuilder {
    DomArticleBuilder(DomBuilderImpl delegate) {
        super(delegate);
    }
}
