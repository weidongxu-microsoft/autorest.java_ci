// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.resourcemanager.applicationinsights.generated.fluent.models.AnnotationInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of Annotation. */
public interface Annotation {
    /**
     * Gets the annotationName property: Name of annotation.
     *
     * @return the annotationName value.
     */
    String annotationName();

    /**
     * Gets the category property: Category of annotation, free form.
     *
     * @return the category value.
     */
    String category();

    /**
     * Gets the eventTime property: Time when event occurred.
     *
     * @return the eventTime value.
     */
    OffsetDateTime eventTime();

    /**
     * Gets the id property: Unique Id for annotation.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the properties property: Serialized JSON object for detailed properties.
     *
     * @return the properties value.
     */
    String properties();

    /**
     * Gets the relatedAnnotation property: Related parent annotation if any.
     *
     * @return the relatedAnnotation value.
     */
    String relatedAnnotation();

    /**
     * Gets the inner com.azure.resourcemanager.applicationinsights.generated.fluent.models.AnnotationInner object.
     *
     * @return the inner object.
     */
    AnnotationInner innerModel();
}
