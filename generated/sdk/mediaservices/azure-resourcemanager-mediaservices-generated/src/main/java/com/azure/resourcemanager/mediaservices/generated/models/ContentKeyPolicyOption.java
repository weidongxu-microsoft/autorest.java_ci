// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Represents a policy option. */
@Fluent
public final class ContentKeyPolicyOption {
    /*
     * The legacy Policy Option ID.
     */
    @JsonProperty(value = "policyOptionId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID policyOptionId;

    /*
     * The Policy Option description.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The key delivery configuration.
     */
    @JsonProperty(value = "configuration", required = true)
    private ContentKeyPolicyConfiguration configuration;

    /*
     * The requirements that must be met to deliver keys with this configuration
     */
    @JsonProperty(value = "restriction", required = true)
    private ContentKeyPolicyRestriction restriction;

    /** Creates an instance of ContentKeyPolicyOption class. */
    public ContentKeyPolicyOption() {
    }

    /**
     * Get the policyOptionId property: The legacy Policy Option ID.
     *
     * @return the policyOptionId value.
     */
    public UUID policyOptionId() {
        return this.policyOptionId;
    }

    /**
     * Get the name property: The Policy Option description.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The Policy Option description.
     *
     * @param name the name value to set.
     * @return the ContentKeyPolicyOption object itself.
     */
    public ContentKeyPolicyOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the configuration property: The key delivery configuration.
     *
     * @return the configuration value.
     */
    public ContentKeyPolicyConfiguration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: The key delivery configuration.
     *
     * @param configuration the configuration value to set.
     * @return the ContentKeyPolicyOption object itself.
     */
    public ContentKeyPolicyOption withConfiguration(ContentKeyPolicyConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Get the restriction property: The requirements that must be met to deliver keys with this configuration.
     *
     * @return the restriction value.
     */
    public ContentKeyPolicyRestriction restriction() {
        return this.restriction;
    }

    /**
     * Set the restriction property: The requirements that must be met to deliver keys with this configuration.
     *
     * @param restriction the restriction value to set.
     * @return the ContentKeyPolicyOption object itself.
     */
    public ContentKeyPolicyOption withRestriction(ContentKeyPolicyRestriction restriction) {
        this.restriction = restriction;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configuration() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property configuration in model ContentKeyPolicyOption"));
        } else {
            configuration().validate();
        }
        if (restriction() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property restriction in model ContentKeyPolicyOption"));
        } else {
            restriction().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContentKeyPolicyOption.class);
}
