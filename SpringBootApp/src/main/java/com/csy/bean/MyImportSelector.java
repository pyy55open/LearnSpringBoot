package com.csy.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println(annotationMetadata.getAnnotationAttributes(EnableLog.class.getName()));
        return new String[]{"com.csy.bean.User",VipUser.class.getName()};
    }
}
