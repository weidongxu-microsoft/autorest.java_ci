// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorProtocol;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorResourceState;
import com.azure.resourcemanager.frontdoor.generated.models.RouteConfiguration;
import com.azure.resourcemanager.frontdoor.generated.models.RoutingRuleEnabledState;
import com.azure.resourcemanager.frontdoor.generated.models.RoutingRuleUpdateParameters;
import com.azure.resourcemanager.frontdoor.generated.models.RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JSON object that contains the properties required to create a routing rule. */
@Fluent
public final class RoutingRuleProperties extends RoutingRuleUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoutingRuleProperties.class);

    /*
     * Resource status of the Front Door or Front Door SubResource. Resource
     * status.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private FrontDoorResourceState resourceState;

    /**
     * Get the resourceState property: Resource status of the Front Door or Front Door SubResource. Resource status.
     *
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /** {@inheritDoc} */
    @Override
    public RoutingRuleProperties withFrontendEndpoints(List<SubResource> frontendEndpoints) {
        super.withFrontendEndpoints(frontendEndpoints);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoutingRuleProperties withAcceptedProtocols(List<FrontDoorProtocol> acceptedProtocols) {
        super.withAcceptedProtocols(acceptedProtocols);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoutingRuleProperties withPatternsToMatch(List<String> patternsToMatch) {
        super.withPatternsToMatch(patternsToMatch);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoutingRuleProperties withEnabledState(RoutingRuleEnabledState enabledState) {
        super.withEnabledState(enabledState);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoutingRuleProperties withRouteConfiguration(RouteConfiguration routeConfiguration) {
        super.withRouteConfiguration(routeConfiguration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoutingRuleProperties withRulesEngine(SubResource rulesEngine) {
        super.withRulesEngine(rulesEngine);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoutingRuleProperties withWebApplicationFirewallPolicyLink(
        RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
        super.withWebApplicationFirewallPolicyLink(webApplicationFirewallPolicyLink);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
