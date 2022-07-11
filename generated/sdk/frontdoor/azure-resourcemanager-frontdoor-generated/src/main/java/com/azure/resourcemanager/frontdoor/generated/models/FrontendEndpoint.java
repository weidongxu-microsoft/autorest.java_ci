// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.resourcemanager.frontdoor.generated.fluent.models.FrontendEndpointInner;

/** An immutable client-side representation of FrontendEndpoint. */
public interface FrontendEndpoint {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the resourceState property: Resource status of the Front Door or Front Door SubResource.
     *
     * <p>Resource status.
     *
     * @return the resourceState value.
     */
    FrontDoorResourceState resourceState();

    /**
     * Gets the customHttpsProvisioningState property: Provisioning status of Custom Https of the frontendEndpoint.
     *
     * @return the customHttpsProvisioningState value.
     */
    CustomHttpsProvisioningState customHttpsProvisioningState();

    /**
     * Gets the customHttpsProvisioningSubstate property: Provisioning substate shows the progress of custom HTTPS
     * enabling/disabling process step by step.
     *
     * @return the customHttpsProvisioningSubstate value.
     */
    CustomHttpsProvisioningSubstate customHttpsProvisioningSubstate();

    /**
     * Gets the customHttpsConfiguration property: The configuration specifying how to enable HTTPS.
     *
     * @return the customHttpsConfiguration value.
     */
    CustomHttpsConfiguration customHttpsConfiguration();

    /**
     * Gets the hostname property: The host name of the frontendEndpoint. Must be a domain name.
     *
     * @return the hostname value.
     */
    String hostname();

    /**
     * Gets the sessionAffinityEnabledState property: Whether to allow session affinity on this host. Valid options are
     * 'Enabled' or 'Disabled'.
     *
     * @return the sessionAffinityEnabledState value.
     */
    SessionAffinityEnabledState sessionAffinityEnabledState();

    /**
     * Gets the sessionAffinityTtlSeconds property: UNUSED. This field will be ignored. The TTL to use in seconds for
     * session affinity, if applicable.
     *
     * @return the sessionAffinityTtlSeconds value.
     */
    Integer sessionAffinityTtlSeconds();

    /**
     * Gets the webApplicationFirewallPolicyLink property: Defines the Web Application Firewall policy for each host (if
     * applicable).
     *
     * @return the webApplicationFirewallPolicyLink value.
     */
    FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink();

    /**
     * Gets the inner com.azure.resourcemanager.frontdoor.generated.fluent.models.FrontendEndpointInner object.
     *
     * @return the inner object.
     */
    FrontendEndpointInner innerModel();
}
