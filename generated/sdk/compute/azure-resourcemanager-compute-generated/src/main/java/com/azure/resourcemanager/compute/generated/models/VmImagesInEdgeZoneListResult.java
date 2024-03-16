// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.VmImagesInEdgeZoneListResultInner;
import java.util.List;

/**
 * An immutable client-side representation of VmImagesInEdgeZoneListResult.
 */
public interface VmImagesInEdgeZoneListResult {
    /**
     * Gets the value property: The list of VMImages in EdgeZone.
     * 
     * @return the value value.
     */
    List<VirtualMachineImageResource> value();

    /**
     * Gets the nextLink property: The URI to fetch the next page of VMImages in EdgeZone. Call ListNext() with this URI to fetch the next page of VmImages.
     * 
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VmImagesInEdgeZoneListResultInner object.
     * 
     * @return the inner object.
     */
    VmImagesInEdgeZoneListResultInner innerModel();
}
