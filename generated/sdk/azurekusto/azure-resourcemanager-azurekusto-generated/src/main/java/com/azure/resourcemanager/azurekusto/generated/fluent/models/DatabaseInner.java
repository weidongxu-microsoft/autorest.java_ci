// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.azurekusto.generated.models.Kind;
import com.azure.resourcemanager.azurekusto.generated.models.ReadOnlyFollowingDatabase;
import com.azure.resourcemanager.azurekusto.generated.models.ReadWriteDatabase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Class representing a Kusto database.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "kind", defaultImpl = DatabaseInner.class, visible = true)
@JsonTypeName("Database")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ReadWrite", value = ReadWriteDatabase.class),
    @JsonSubTypes.Type(name = "ReadOnlyFollowing", value = ReadOnlyFollowingDatabase.class) })
@Fluent
public class DatabaseInner extends ProxyResource {
    /*
     * Kind of the database
     */
    @JsonTypeId
    @JsonProperty(value = "kind", required = true)
    private Kind kind;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Creates an instance of DatabaseInner class.
     */
    public DatabaseInner() {
        this.kind = Kind.fromString("Database");
    }

    /**
     * Get the kind property: Kind of the database.
     * 
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of the database.
     * 
     * @param kind the kind value to set.
     * @return the DatabaseInner object itself.
     */
    protected DatabaseInner withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the location property: Resource location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     * 
     * @param location the location value to set.
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withLocation(String location) {
        this.location = location;
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
