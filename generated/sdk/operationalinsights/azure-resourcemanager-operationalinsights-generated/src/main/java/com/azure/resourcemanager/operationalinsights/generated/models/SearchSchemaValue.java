// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Value object for schema results. */
@Fluent
public final class SearchSchemaValue {
    /*
     * The name of the schema.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The display name of the schema.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The boolean that indicates the field is searchable as free text.
     */
    @JsonProperty(value = "indexed", required = true)
    private boolean indexed;

    /*
     * The boolean that indicates whether or not the field is stored.
     */
    @JsonProperty(value = "stored", required = true)
    private boolean stored;

    /*
     * The boolean that indicates whether or not the field is a facet.
     */
    @JsonProperty(value = "facet", required = true)
    private boolean facet;

    /*
     * The array of workflows containing the field.
     */
    @JsonProperty(value = "ownerType")
    private List<String> ownerType;

    /** Creates an instance of SearchSchemaValue class. */
    public SearchSchemaValue() {
    }

    /**
     * Get the name property: The name of the schema.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the schema.
     *
     * @param name the name value to set.
     * @return the SearchSchemaValue object itself.
     */
    public SearchSchemaValue withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The display name of the schema.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the schema.
     *
     * @param displayName the displayName value to set.
     * @return the SearchSchemaValue object itself.
     */
    public SearchSchemaValue withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the type property: The type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type.
     *
     * @param type the type value to set.
     * @return the SearchSchemaValue object itself.
     */
    public SearchSchemaValue withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the indexed property: The boolean that indicates the field is searchable as free text.
     *
     * @return the indexed value.
     */
    public boolean indexed() {
        return this.indexed;
    }

    /**
     * Set the indexed property: The boolean that indicates the field is searchable as free text.
     *
     * @param indexed the indexed value to set.
     * @return the SearchSchemaValue object itself.
     */
    public SearchSchemaValue withIndexed(boolean indexed) {
        this.indexed = indexed;
        return this;
    }

    /**
     * Get the stored property: The boolean that indicates whether or not the field is stored.
     *
     * @return the stored value.
     */
    public boolean stored() {
        return this.stored;
    }

    /**
     * Set the stored property: The boolean that indicates whether or not the field is stored.
     *
     * @param stored the stored value to set.
     * @return the SearchSchemaValue object itself.
     */
    public SearchSchemaValue withStored(boolean stored) {
        this.stored = stored;
        return this;
    }

    /**
     * Get the facet property: The boolean that indicates whether or not the field is a facet.
     *
     * @return the facet value.
     */
    public boolean facet() {
        return this.facet;
    }

    /**
     * Set the facet property: The boolean that indicates whether or not the field is a facet.
     *
     * @param facet the facet value to set.
     * @return the SearchSchemaValue object itself.
     */
    public SearchSchemaValue withFacet(boolean facet) {
        this.facet = facet;
        return this;
    }

    /**
     * Get the ownerType property: The array of workflows containing the field.
     *
     * @return the ownerType value.
     */
    public List<String> ownerType() {
        return this.ownerType;
    }

    /**
     * Set the ownerType property: The array of workflows containing the field.
     *
     * @param ownerType the ownerType value to set.
     * @return the SearchSchemaValue object itself.
     */
    public SearchSchemaValue withOwnerType(List<String> ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
