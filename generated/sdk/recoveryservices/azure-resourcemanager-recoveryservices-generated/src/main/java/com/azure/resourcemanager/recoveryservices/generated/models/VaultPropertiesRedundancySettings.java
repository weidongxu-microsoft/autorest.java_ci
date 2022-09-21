// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The redundancy Settings of a Vault. */
@Immutable
public final class VaultPropertiesRedundancySettings {
    /*
     * The storage redundancy setting of a vault
     */
    @JsonProperty(value = "standardTierStorageRedundancy", access = JsonProperty.Access.WRITE_ONLY)
    private StandardTierStorageRedundancy standardTierStorageRedundancy;

    /*
     * Flag to show if Cross Region Restore is enabled on the Vault or not
     */
    @JsonProperty(value = "crossRegionRestore", access = JsonProperty.Access.WRITE_ONLY)
    private CrossRegionRestore crossRegionRestore;

    /** Creates an instance of VaultPropertiesRedundancySettings class. */
    public VaultPropertiesRedundancySettings() {
    }

    /**
     * Get the standardTierStorageRedundancy property: The storage redundancy setting of a vault.
     *
     * @return the standardTierStorageRedundancy value.
     */
    public StandardTierStorageRedundancy standardTierStorageRedundancy() {
        return this.standardTierStorageRedundancy;
    }

    /**
     * Get the crossRegionRestore property: Flag to show if Cross Region Restore is enabled on the Vault or not.
     *
     * @return the crossRegionRestore value.
     */
    public CrossRegionRestore crossRegionRestore() {
        return this.crossRegionRestore;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
