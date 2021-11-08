// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the storage blob based dead letter destination. */
@Fluent
public final class StorageBlobDeadLetterDestinationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageBlobDeadLetterDestinationProperties.class);

    /*
     * The Azure Resource ID of the storage account that is the destination of
     * the deadletter events
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The name of the Storage blob container that is the destination of the
     * deadletter events
     */
    @JsonProperty(value = "blobContainerName")
    private String blobContainerName;

    /**
     * Get the resourceId property: The Azure Resource ID of the storage account that is the destination of the
     * deadletter events.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The Azure Resource ID of the storage account that is the destination of the
     * deadletter events.
     *
     * @param resourceId the resourceId value to set.
     * @return the StorageBlobDeadLetterDestinationProperties object itself.
     */
    public StorageBlobDeadLetterDestinationProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the blobContainerName property: The name of the Storage blob container that is the destination of the
     * deadletter events.
     *
     * @return the blobContainerName value.
     */
    public String blobContainerName() {
        return this.blobContainerName;
    }

    /**
     * Set the blobContainerName property: The name of the Storage blob container that is the destination of the
     * deadletter events.
     *
     * @param blobContainerName the blobContainerName value to set.
     * @return the StorageBlobDeadLetterDestinationProperties object itself.
     */
    public StorageBlobDeadLetterDestinationProperties withBlobContainerName(String blobContainerName) {
        this.blobContainerName = blobContainerName;
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
