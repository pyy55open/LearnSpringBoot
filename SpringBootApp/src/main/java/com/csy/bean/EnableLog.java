package com.csy.bean;

import org.springframework.context.annotation.Import;

@Import(MyImportSelector.class)
public @interface EnableLog {
    String name();
}
