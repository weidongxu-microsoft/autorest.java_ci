// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.NetworkRuleSetInner;
import java.util.List;

/**
 * An immutable client-side representation of NetworkRuleSet.
 */
public interface NetworkRuleSet {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

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
     * Gets the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the trustedServiceAccessEnabled property: Value that indicates whether Trusted Service Access is Enabled or not.
     * 
     * @return the trustedServiceAccessEnabled value.
     */
    Boolean trustedServiceAccessEnabled();

    /**
     * Gets the defaultAction property: Default Action for Network Rule Set.
     * 
     * @return the defaultAction value.
     */
    DefaultAction defaultAction();

    /**
     * Gets the virtualNetworkRules property: List VirtualNetwork Rules.
     * 
     * @return the virtualNetworkRules value.
     */
    List<NWRuleSetVirtualNetworkRules> virtualNetworkRules();

    /**
     * Gets the ipRules property: List of IpRules.
     * 
     * @return the ipRules value.
     */
    List<NWRuleSetIpRules> ipRules();

    /**
     * Gets the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is enabled. If value is SecuredByPerimeter then Inbound and Outbound communication is controlled by the network security perimeter and profile's access rules.
     * 
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccessFlag publicNetworkAccess();

    /**
     * Gets the inner com.azure.resourcemanager.eventhubs.generated.fluent.models.NetworkRuleSetInner object.
     * 
     * @return the inner object.
     */
    NetworkRuleSetInner innerModel();
}
