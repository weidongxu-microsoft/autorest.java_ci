// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteLinkInner;

/**
 * An immutable client-side representation of ExpressRouteLink.
 */
public interface ExpressRouteLink {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Name of child port resource that is unique among child port resources of the parent.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the routerName property: Name of Azure router associated with physical port.
     * 
     * @return the routerName value.
     */
    String routerName();

    /**
     * Gets the interfaceName property: Name of Azure router interface.
     * 
     * @return the interfaceName value.
     */
    String interfaceName();

    /**
     * Gets the patchPanelId property: Mapping between physical port to patch panel port.
     * 
     * @return the patchPanelId value.
     */
    String patchPanelId();

    /**
     * Gets the rackId property: Mapping of physical patch panel to rack.
     * 
     * @return the rackId value.
     */
    String rackId();

    /**
     * Gets the coloLocation property: Cololocation for ExpressRoute Hybrid Direct.
     * 
     * @return the coloLocation value.
     */
    String coloLocation();

    /**
     * Gets the connectorType property: Physical fiber port type.
     * 
     * @return the connectorType value.
     */
    ExpressRouteLinkConnectorType connectorType();

    /**
     * Gets the adminState property: Administrative state of the physical port.
     * 
     * @return the adminState value.
     */
    ExpressRouteLinkAdminState adminState();

    /**
     * Gets the provisioningState property: The provisioning state of the express route link resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the macSecConfig property: MacSec configuration.
     * 
     * @return the macSecConfig value.
     */
    ExpressRouteLinkMacSecConfig macSecConfig();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteLinkInner object.
     * 
     * @return the inner object.
     */
    ExpressRouteLinkInner innerModel();
}
