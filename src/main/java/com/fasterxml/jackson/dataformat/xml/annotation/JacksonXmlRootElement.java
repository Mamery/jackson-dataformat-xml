package com.fasterxml.jackson.dataformat.xml.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation that can be used to define name of root element used
 * for the root-level object when serialized, which normally uses
 * name of the type (class). It is similar to JAXB <code>XmlRootElement</code>.
 *<p>
 * Note that annotation has no effect on non-root elements: regular property
 * values and so on; their name is derived from getter/setter/field, not
 * from type itself.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JacksonXmlRootElement
{
    String namespace() default "";
    String localName() default "";
}
