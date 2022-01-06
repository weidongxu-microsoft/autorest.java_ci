// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ContainerAppSecret;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Container App Secrets Collection ARM resource. */
@Fluent
public final class SecretsCollectionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecretsCollectionInner.class);

    /*
     * Collection of resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<ContainerAppSecret> value;

    /**
     * Get the value property: Collection of resources.
     *
     * @return the value value.
     */
    public List<ContainerAppSecret> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     *
     * @param value the value value to set.
     * @return the SecretsCollectionInner object itself.
     */
    public SecretsCollectionInner withValue(List<ContainerAppSecret> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model SecretsCollectionInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
