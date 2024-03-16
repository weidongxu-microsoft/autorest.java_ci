// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mysql.generated.fluent.models.ServerBackupV2Inner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of server backups.
 */
@Fluent
public final class ServerBackupV2ListResult {
    /*
     * The list of backups of a server.
     */
    @JsonProperty(value = "value")
    private List<ServerBackupV2Inner> value;

    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ServerBackupV2ListResult class.
     */
    public ServerBackupV2ListResult() {
    }

    /**
     * Get the value property: The list of backups of a server.
     * 
     * @return the value value.
     */
    public List<ServerBackupV2Inner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of backups of a server.
     * 
     * @param value the value value to set.
     * @return the ServerBackupV2ListResult object itself.
     */
    public ServerBackupV2ListResult withValue(List<ServerBackupV2Inner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ServerBackupV2ListResult object itself.
     */
    public ServerBackupV2ListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
