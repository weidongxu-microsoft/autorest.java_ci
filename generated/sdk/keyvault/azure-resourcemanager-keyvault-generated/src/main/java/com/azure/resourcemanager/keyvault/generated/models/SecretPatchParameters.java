// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Parameters for patching a secret.
 */
@Fluent
public final class SecretPatchParameters {
    /*
     * The tags that will be assigned to the secret. 
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Properties of the secret
     */
    @JsonProperty(value = "properties")
    private SecretPatchProperties properties;

    /**
     * Creates an instance of SecretPatchParameters class.
     */
    public SecretPatchParameters() {
    }

    /**
     * Get the tags property: The tags that will be assigned to the secret.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags that will be assigned to the secret.
     * 
     * @param tags the tags value to set.
     * @return the SecretPatchParameters object itself.
     */
    public SecretPatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: Properties of the secret.
     * 
     * @return the properties value.
     */
    public SecretPatchProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the secret.
     * 
     * @param properties the properties value to set.
     * @return the SecretPatchParameters object itself.
     */
    public SecretPatchParameters withProperties(SecretPatchProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
