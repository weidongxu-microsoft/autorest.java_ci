// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.DestinationProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Capture storage details for capture description. */
@Fluent
public final class Destination {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Destination.class);

    /*
     * Name for capture destination
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Properties describing the storage account, blob container and archive
     * name format for capture destination
     */
    @JsonProperty(value = "properties")
    private DestinationProperties innerProperties;

    /**
     * Get the name property: Name for capture destination.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name for capture destination.
     *
     * @param name the name value to set.
     * @return the Destination object itself.
     */
    public Destination withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Properties describing the storage account, blob container and archive name
     * format for capture destination.
     *
     * @return the innerProperties value.
     */
    private DestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the storageAccountResourceId property: Resource id of the storage account to be used to create the blobs.
     *
     * @return the storageAccountResourceId value.
     */
    public String storageAccountResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountResourceId();
    }

    /**
     * Set the storageAccountResourceId property: Resource id of the storage account to be used to create the blobs.
     *
     * @param storageAccountResourceId the storageAccountResourceId value to set.
     * @return the Destination object itself.
     */
    public Destination withStorageAccountResourceId(String storageAccountResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DestinationProperties();
        }
        this.innerProperties().withStorageAccountResourceId(storageAccountResourceId);
        return this;
    }

    /**
     * Get the blobContainer property: Blob container Name.
     *
     * @return the blobContainer value.
     */
    public String blobContainer() {
        return this.innerProperties() == null ? null : this.innerProperties().blobContainer();
    }

    /**
     * Set the blobContainer property: Blob container Name.
     *
     * @param blobContainer the blobContainer value to set.
     * @return the Destination object itself.
     */
    public Destination withBlobContainer(String blobContainer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DestinationProperties();
        }
        this.innerProperties().withBlobContainer(blobContainer);
        return this;
    }

    /**
     * Get the archiveNameFormat property: Blob naming convention for archive, e.g.
     * {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters
     * (Namespace,EventHub .. etc) are mandatory irrespective of order.
     *
     * @return the archiveNameFormat value.
     */
    public String archiveNameFormat() {
        return this.innerProperties() == null ? null : this.innerProperties().archiveNameFormat();
    }

    /**
     * Set the archiveNameFormat property: Blob naming convention for archive, e.g.
     * {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters
     * (Namespace,EventHub .. etc) are mandatory irrespective of order.
     *
     * @param archiveNameFormat the archiveNameFormat value to set.
     * @return the Destination object itself.
     */
    public Destination withArchiveNameFormat(String archiveNameFormat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DestinationProperties();
        }
        this.innerProperties().withArchiveNameFormat(archiveNameFormat);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
