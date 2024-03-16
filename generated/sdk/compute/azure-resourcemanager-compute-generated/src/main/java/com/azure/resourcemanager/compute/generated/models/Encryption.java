// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Encryption at rest settings for disk or snapshot.
 */
@Fluent
public final class Encryption {
    /*
     * ResourceId of the disk encryption set to use for enabling encryption at rest.
     */
    @JsonProperty(value = "diskEncryptionSetId")
    private String diskEncryptionSetId;

    /*
     * The type of key used to encrypt the data of the disk.
     */
    @JsonProperty(value = "type")
    private EncryptionType type;

    /**
     * Creates an instance of Encryption class.
     */
    public Encryption() {
    }

    /**
     * Get the diskEncryptionSetId property: ResourceId of the disk encryption set to use for enabling encryption at rest.
     * 
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Set the diskEncryptionSetId property: ResourceId of the disk encryption set to use for enabling encryption at rest.
     * 
     * @param diskEncryptionSetId the diskEncryptionSetId value to set.
     * @return the Encryption object itself.
     */
    public Encryption withDiskEncryptionSetId(String diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        return this;
    }

    /**
     * Get the type property: The type of key used to encrypt the data of the disk.
     * 
     * @return the type value.
     */
    public EncryptionType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of key used to encrypt the data of the disk.
     * 
     * @param type the type value to set.
     * @return the Encryption object itself.
     */
    public Encryption withType(EncryptionType type) {
        this.type = type;
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
