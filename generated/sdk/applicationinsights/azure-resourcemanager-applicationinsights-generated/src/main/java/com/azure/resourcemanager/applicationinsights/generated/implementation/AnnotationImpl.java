// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.resourcemanager.applicationinsights.generated.fluent.models.AnnotationInner;
import com.azure.resourcemanager.applicationinsights.generated.models.Annotation;
import java.time.OffsetDateTime;

public final class AnnotationImpl implements Annotation {
    private AnnotationInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    AnnotationImpl(AnnotationInner innerObject,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String annotationName() {
        return this.innerModel().annotationName();
    }

    public String category() {
        return this.innerModel().category();
    }

    public OffsetDateTime eventTime() {
        return this.innerModel().eventTime();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String properties() {
        return this.innerModel().properties();
    }

    public String relatedAnnotation() {
        return this.innerModel().relatedAnnotation();
    }

    public AnnotationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
