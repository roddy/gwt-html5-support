# gwt-htmlspec
GWT support for the full W3C HTML specification.

## Purpose
The GWT SDK contains native support for a select variety of native HTML elements. This support allows you to create 
UiBinder definitions rooted at elements other than a generic `DivElement`.

The variety of available elements is not what it could be, however, and that is where the __gwt-htmlspec__ project comes
in. This module proves (most of) the missing element support, including optional HTML5 support as well as the regularly 
supported HTML4 and earlier elements.

The GWT javadoc explains best the sort of support these elements provide to developers:

> Classes for low-level DOM programming. This package contains classes that expose the W3C standard HTML document object model for programmatic access and manipulation of HTML pages directly in client-side Java source, accounting for most browser variations. These classes provide an efficient, type-safe, and IDE-friendly alternative to writing JavaScript Native Interface (JSNI) methods for many common tasks.
>
> These classes extend com.google.gwt.core.client.JavaScriptObject, which enables them to be used directly as Java types without introducing any object-oriented size or speed overhead beyond the underlying JavaScript objects they represent. Consequently, these DOM classes are efficient enough to be used directly when maximum performance is required and are lightweight enough to serve as the basic building blocks upon which widget libraries may be constructed.

(Source: [com.google.gwt.dom.client javadoc](http://grepcode.com/file_/repo1.maven.org/maven2/com.google.gwt/gwt-user/2.7.0/com/google/gwt/dom/client/package-info.java/?v=source))

## Supported HTML Elements

| Tag | GWT Native Support | gwt-htmlspec |
|-----|--------------------|--------------|
| a | AnchorElement | - |
| abbr | - | AbbrElement |
| address | - | - |
| area | AreaElement | - |
| article | - | ArticleElement |
| aside | - | AsideElement |
| audio | AudioElement | - |
| b | - | - |
| base | BaseElement | - |
| bdi | - | - |
| bdo | - | - |
| blockquote | - | - |
| body | BodyElement | - |
| br | BRElement | - |
| button | Button | - |
| canvas | CanvasElement | - |
| caption | TableCaptionElement | - |
| cite | - | - |
| code | - | - |
| col | - | - |
| colgroup | - | - |
| command | - | - |
| datalist | - | - |
| dd | - | - |
| del | ModElement | - |
| details | - | - |
| dfn | - | - |
| div | DivElement | - |
| dl | DListElement | - |
| dt | - | - |
| doctype | - | - |
| em | - | - |
| embed | - | - |
| fieldset | FieldSetElement | - |
| figcaption | - | - |
| figure | - | - |
| footer | - | - |
| form | FormElement | - |
| h1-h6 | HeadingElemnt | - |
| head | HeadElement | - |
| header | - | - |
| hr | HRElement | - |
| html | - | - |
| i | - | - |
| iframe | IFrameElement | - |
| img | ImageElement | - |
| input | InputElement | - |
| ins | ModElement | - |
| kbd | - | - |
| keygen | - | - |
| label | LabelElement | - |
| legend | LegendElement | - |
| li | LIElement | - |
| link | LinkElement | - |
| main | - | MainElement |
| map | MapElement | - |
| mark | - | - |
| menu | - | - |
| meta | MetaElement | - |
| meter | - | - |
| nav | - | NavElement |
| noscript | - | - |
| obj | ObjectElement | - |
| ol | OListElement | - |
| optgroup | OptGroupElement | - |
| option | OptionElement | - |
| output | - | - |
| p | ParagraphElement | - |
| param | ParamElement | - |
| pre | PreElement | - |
| progress | - | - |
| q | QuoteElement | - |
| rp | - | - |
| rt | - | - |
| ruby | - | - |
| s | - | - |
| samp | - | - |
| script | ScriptElement | - |
| section | - | SectionElement |
| select | SelectElement | - |
| small | - | - |
| source | SourceElement | - |
| span | SpanElement | - |
| strong | - | - |
| style | StyleElement | - |
| sub | - | - |
| summary | - | - |
| sup | - | - |
| table | TableElement | - |
| tbody | TableSectionElement | - |
| td | TableCellElement | - |
| textarea | TextAreaElement | - |
| tfoot | TableSectionElement | - |
| th | TableCellElement | - |
| thead | TableSectionElement | - |
| time | - | - |
| title | TitleElement | - |
| tr | TableRowElement | - |
| track | - | - |
| u | - | - |
| ul | UListElement | - |
| var | - | - |
| video | VideoElement | - |
| wbr | - | - |

### Deprecated HTML Elements (partial support)

These tags are obsoleted in HTML5, but GWT still provides native support. They are included here for completeness.

| Tag | GWT Native Support |
|-----|--------------------|
| frame | FrameElement |
| frameset | FrameSetElement |