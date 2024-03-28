// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.keyvault.generated.models.SecretProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Resource information with extended details.
 */
@Fluent
public final class SecretInner extends Resource {
    /*
     * Properties of the secret
     */
    @JsonProperty(value = "properties", required = true)
    private SecretProperties properties;

    /**
     * Creates an instance of SecretInner class.
     */
    public SecretInner() {
    }

    /**
     * Get the properties property: Properties of the secret.
     * 
     * @return the properties value.
     */
    public SecretProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the secret.
     * 
     * @param properties the properties value to set.
     * @return the SecretInner object itself.
     */
    public SecretInner withProperties(SecretProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecretInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecretInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property properties in model SecretInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SecretInner.class);
}
