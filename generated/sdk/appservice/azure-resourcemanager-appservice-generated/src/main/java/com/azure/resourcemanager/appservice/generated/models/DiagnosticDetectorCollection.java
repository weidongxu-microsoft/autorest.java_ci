// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorDefinitionResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of Diagnostic Detectors. */
@Fluent
public final class DiagnosticDetectorCollection {
    /*
     * Collection of resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<DetectorDefinitionResourceInner> value;

    /*
     * Link to next page of resources.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Collection of resources.
     *
     * @return the value value.
     */
    public List<DetectorDefinitionResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     *
     * @param value the value value to set.
     * @return the DiagnosticDetectorCollection object itself.
     */
    public DiagnosticDetectorCollection withValue(List<DetectorDefinitionResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model DiagnosticDetectorCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiagnosticDetectorCollection.class);
}
