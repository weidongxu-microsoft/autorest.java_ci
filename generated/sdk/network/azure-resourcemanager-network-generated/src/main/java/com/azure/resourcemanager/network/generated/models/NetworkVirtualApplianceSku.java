// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceSkuInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of NetworkVirtualApplianceSku.
 */
public interface NetworkVirtualApplianceSku {
    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the id property: Resource ID.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the vendor property: Network Virtual Appliance Sku vendor.
     * 
     * @return the vendor value.
     */
    String vendor();

    /**
     * Gets the availableVersions property: Available Network Virtual Appliance versions.
     * 
     * @return the availableVersions value.
     */
    List<String> availableVersions();

    /**
     * Gets the availableScaleUnits property: The list of scale units available.
     * 
     * @return the availableScaleUnits value.
     */
    List<NetworkVirtualApplianceSkuInstances> availableScaleUnits();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceSkuInner object.
     * 
     * @return the inner object.
     */
    NetworkVirtualApplianceSkuInner innerModel();
}
