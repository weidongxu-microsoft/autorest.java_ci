// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Attributes of a deleted storage account. */
@Immutable
public final class DeletedAccountProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeletedAccountProperties.class);

    /*
     * Full resource id of the original storage account.
     */
    @JsonProperty(value = "storageAccountResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String storageAccountResourceId;

    /*
     * Location of the deleted account.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Can be used to attempt recovering this deleted account via
     * PutStorageAccount API.
     */
    @JsonProperty(value = "restoreReference", access = JsonProperty.Access.WRITE_ONLY)
    private String restoreReference;

    /*
     * Creation time of the deleted account.
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private String creationTime;

    /*
     * Deletion time of the deleted account.
     */
    @JsonProperty(value = "deletionTime", access = JsonProperty.Access.WRITE_ONLY)
    private String deletionTime;

    /**
     * Get the storageAccountResourceId property: Full resource id of the original storage account.
     *
     * @return the storageAccountResourceId value.
     */
    public String storageAccountResourceId() {
        return this.storageAccountResourceId;
    }

    /**
     * Get the location property: Location of the deleted account.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the restoreReference property: Can be used to attempt recovering this deleted account via PutStorageAccount
     * API.
     *
     * @return the restoreReference value.
     */
    public String restoreReference() {
        return this.restoreReference;
    }

    /**
     * Get the creationTime property: Creation time of the deleted account.
     *
     * @return the creationTime value.
     */
    public String creationTime() {
        return this.creationTime;
    }

    /**
     * Get the deletionTime property: Deletion time of the deleted account.
     *
     * @return the deletionTime value.
     */
    public String deletionTime() {
        return this.deletionTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
