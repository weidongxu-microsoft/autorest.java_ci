// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.resourcemanager.keyvault.generated.fluent.models.MhsmGeoReplicatedRegionInner;

/**
 * An immutable client-side representation of MhsmGeoReplicatedRegion.
 */
public interface MhsmGeoReplicatedRegion {
    /**
     * Gets the name property: Name of the geo replicated region.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the provisioningState property: Provisioning state of the geo replicated region.
     * 
     * @return the provisioningState value.
     */
    GeoReplicationRegionProvisioningState provisioningState();

    /**
     * Gets the isPrimary property: A boolean value that indicates whether the region is the primary region or a
     * secondary region.
     * 
     * @return the isPrimary value.
     */
    Boolean isPrimary();

    /**
     * Gets the inner com.azure.resourcemanager.keyvault.generated.fluent.models.MhsmGeoReplicatedRegionInner object.
     * 
     * @return the inner object.
     */
    MhsmGeoReplicatedRegionInner innerModel();
}
