package com.arpa.and.ui.table.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Table {

    String name() default "";

    boolean count() default false;

    int pageSize() default Integer.MAX_VALUE;

    int currentPage() default 0;
}
