// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.StorageBlobDeadLetterDestinationProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about the storage blob based dead letter destination. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("StorageBlob")
@Fluent
public final class StorageBlobDeadLetterDestination extends DeadLetterDestination {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageBlobDeadLetterDestination.class);

    /*
     * The properties of the Storage Blob based deadletter destination
     */
    @JsonProperty(value = "properties")
    private StorageBlobDeadLetterDestinationProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of the Storage Blob based deadletter destination.
     *
     * @return the innerProperties value.
     */
    private StorageBlobDeadLetterDestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resourceId property: The Azure Resource ID of the storage account that is the destination of the
     * deadletter events.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: The Azure Resource ID of the storage account that is the destination of the
     * deadletter events.
     *
     * @param resourceId the resourceId value to set.
     * @return the StorageBlobDeadLetterDestination object itself.
     */
    public StorageBlobDeadLetterDestination withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageBlobDeadLetterDestinationProperties();
        }
        this.innerProperties().withResourceId(resourceId);
        return this;
    }

    /**
     * Get the blobContainerName property: The name of the Storage blob container that is the destination of the
     * deadletter events.
     *
     * @return the blobContainerName value.
     */
    public String blobContainerName() {
        return this.innerProperties() == null ? null : this.innerProperties().blobContainerName();
    }

    /**
     * Set the blobContainerName property: The name of the Storage blob container that is the destination of the
     * deadletter events.
     *
     * @param blobContainerName the blobContainerName value to set.
     * @return the StorageBlobDeadLetterDestination object itself.
     */
    public StorageBlobDeadLetterDestination withBlobContainerName(String blobContainerName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageBlobDeadLetterDestinationProperties();
        }
        this.innerProperties().withBlobContainerName(blobContainerName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
