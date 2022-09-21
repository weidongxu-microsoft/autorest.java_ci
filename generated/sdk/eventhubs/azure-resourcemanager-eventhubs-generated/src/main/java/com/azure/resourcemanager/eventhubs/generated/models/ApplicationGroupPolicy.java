// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Properties of the Application Group policy. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ApplicationGroupPolicy.class)
@JsonTypeName("ApplicationGroupPolicy")
@JsonSubTypes({@JsonSubTypes.Type(name = "ThrottlingPolicy", value = ThrottlingPolicy.class)})
@Fluent
public class ApplicationGroupPolicy {
    /*
     * The Name of this policy
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /** Creates an instance of ApplicationGroupPolicy class. */
    public ApplicationGroupPolicy() {
    }

    /**
     * Get the name property: The Name of this policy.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The Name of this policy.
     *
     * @param name the name value to set.
     * @return the ApplicationGroupPolicy object itself.
     */
    public ApplicationGroupPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ApplicationGroupPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationGroupPolicy.class);
}
