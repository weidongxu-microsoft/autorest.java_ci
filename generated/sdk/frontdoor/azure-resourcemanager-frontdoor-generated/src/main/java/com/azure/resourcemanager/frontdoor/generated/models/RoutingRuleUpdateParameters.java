// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Routing rules to apply to an endpoint. */
@Fluent
public class RoutingRuleUpdateParameters {
    /*
     * Frontend endpoints associated with this rule
     */
    @JsonProperty(value = "frontendEndpoints")
    private List<SubResource> frontendEndpoints;

    /*
     * Protocol schemes to match for this rule
     */
    @JsonProperty(value = "acceptedProtocols")
    private List<FrontDoorProtocol> acceptedProtocols;

    /*
     * The route patterns of the rule.
     */
    @JsonProperty(value = "patternsToMatch")
    private List<String> patternsToMatch;

    /*
     * Whether to enable use of this rule. Permitted values are 'Enabled' or
     * 'Disabled'
     */
    @JsonProperty(value = "enabledState")
    private RoutingRuleEnabledState enabledState;

    /*
     * A reference to the routing configuration.
     */
    @JsonProperty(value = "routeConfiguration")
    private RouteConfiguration routeConfiguration;

    /*
     * A reference to a specific Rules Engine Configuration to apply to this
     * route.
     */
    @JsonProperty(value = "rulesEngine")
    private SubResource rulesEngine;

    /*
     * Defines the Web Application Firewall policy for each routing rule (if
     * applicable)
     */
    @JsonProperty(value = "webApplicationFirewallPolicyLink")
    private RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink;

    /**
     * Get the frontendEndpoints property: Frontend endpoints associated with this rule.
     *
     * @return the frontendEndpoints value.
     */
    public List<SubResource> frontendEndpoints() {
        return this.frontendEndpoints;
    }

    /**
     * Set the frontendEndpoints property: Frontend endpoints associated with this rule.
     *
     * @param frontendEndpoints the frontendEndpoints value to set.
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withFrontendEndpoints(List<SubResource> frontendEndpoints) {
        this.frontendEndpoints = frontendEndpoints;
        return this;
    }

    /**
     * Get the acceptedProtocols property: Protocol schemes to match for this rule.
     *
     * @return the acceptedProtocols value.
     */
    public List<FrontDoorProtocol> acceptedProtocols() {
        return this.acceptedProtocols;
    }

    /**
     * Set the acceptedProtocols property: Protocol schemes to match for this rule.
     *
     * @param acceptedProtocols the acceptedProtocols value to set.
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withAcceptedProtocols(List<FrontDoorProtocol> acceptedProtocols) {
        this.acceptedProtocols = acceptedProtocols;
        return this;
    }

    /**
     * Get the patternsToMatch property: The route patterns of the rule.
     *
     * @return the patternsToMatch value.
     */
    public List<String> patternsToMatch() {
        return this.patternsToMatch;
    }

    /**
     * Set the patternsToMatch property: The route patterns of the rule.
     *
     * @param patternsToMatch the patternsToMatch value to set.
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withPatternsToMatch(List<String> patternsToMatch) {
        this.patternsToMatch = patternsToMatch;
        return this;
    }

    /**
     * Get the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @return the enabledState value.
     */
    public RoutingRuleEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @param enabledState the enabledState value to set.
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withEnabledState(RoutingRuleEnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get the routeConfiguration property: A reference to the routing configuration.
     *
     * @return the routeConfiguration value.
     */
    public RouteConfiguration routeConfiguration() {
        return this.routeConfiguration;
    }

    /**
     * Set the routeConfiguration property: A reference to the routing configuration.
     *
     * @param routeConfiguration the routeConfiguration value to set.
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withRouteConfiguration(RouteConfiguration routeConfiguration) {
        this.routeConfiguration = routeConfiguration;
        return this;
    }

    /**
     * Get the rulesEngine property: A reference to a specific Rules Engine Configuration to apply to this route.
     *
     * @return the rulesEngine value.
     */
    public SubResource rulesEngine() {
        return this.rulesEngine;
    }

    /**
     * Set the rulesEngine property: A reference to a specific Rules Engine Configuration to apply to this route.
     *
     * @param rulesEngine the rulesEngine value to set.
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withRulesEngine(SubResource rulesEngine) {
        this.rulesEngine = rulesEngine;
        return this;
    }

    /**
     * Get the webApplicationFirewallPolicyLink property: Defines the Web Application Firewall policy for each routing
     * rule (if applicable).
     *
     * @return the webApplicationFirewallPolicyLink value.
     */
    public RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink() {
        return this.webApplicationFirewallPolicyLink;
    }

    /**
     * Set the webApplicationFirewallPolicyLink property: Defines the Web Application Firewall policy for each routing
     * rule (if applicable).
     *
     * @param webApplicationFirewallPolicyLink the webApplicationFirewallPolicyLink value to set.
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withWebApplicationFirewallPolicyLink(
        RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
        this.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routeConfiguration() != null) {
            routeConfiguration().validate();
        }
        if (webApplicationFirewallPolicyLink() != null) {
            webApplicationFirewallPolicyLink().validate();
        }
    }
}
