// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information of Access Rule in Network Profile. */
@Fluent
public final class NspAccessRule {
    /*
     * Fully qualified identifier of the resource
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Name of the resource
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Type of the resource
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Properties of Access Rule
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private NspAccessRuleProperties properties;

    /** Creates an instance of NspAccessRule class. */
    public NspAccessRule() {
    }

    /**
     * Get the id property: Fully qualified identifier of the resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Fully qualified identifier of the resource.
     *
     * @param id the id value to set.
     * @return the NspAccessRule object itself.
     */
    public NspAccessRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource.
     *
     * @param name the name value to set.
     * @return the NspAccessRule object itself.
     */
    public NspAccessRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     *
     * @param type the type value to set.
     * @return the NspAccessRule object itself.
     */
    public NspAccessRule withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the properties property: Properties of Access Rule.
     *
     * @return the properties value.
     */
    public NspAccessRuleProperties properties() {
        return this.properties;
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
