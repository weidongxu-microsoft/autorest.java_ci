// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details about the target where the backup content will be stored.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = BackupStoreDetails.class)
@JsonTypeName("BackupStoreDetails")
@JsonSubTypes({ @JsonSubTypes.Type(name = "FullBackupStoreDetails", value = FullBackupStoreDetails.class) })
@Immutable
public class BackupStoreDetails {
    /**
     * Creates an instance of BackupStoreDetails class.
     */
    public BackupStoreDetails() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
