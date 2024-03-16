// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.generated.models.CustomRuleList;
import com.azure.resourcemanager.frontdoor.generated.models.FrontendEndpointLink;
import com.azure.resourcemanager.frontdoor.generated.models.ManagedRuleSetList;
import com.azure.resourcemanager.frontdoor.generated.models.PolicyResourceState;
import com.azure.resourcemanager.frontdoor.generated.models.PolicySettings;
import com.azure.resourcemanager.frontdoor.generated.models.RoutingRuleLink;
import com.azure.resourcemanager.frontdoor.generated.models.SecurityPolicyLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Defines web application firewall policy properties.
 */
@Fluent
public final class WebApplicationFirewallPolicyProperties {
    /*
     * Describes settings for the policy.
     */
    @JsonProperty(value = "policySettings")
    private PolicySettings policySettings;

    /*
     * Describes custom rules inside the policy.
     */
    @JsonProperty(value = "customRules")
    private CustomRuleList customRules;

    /*
     * Describes managed rules inside the policy.
     */
    @JsonProperty(value = "managedRules")
    private ManagedRuleSetList managedRules;

    /*
     * Describes Frontend Endpoints associated with this Web Application Firewall policy.
     */
    @JsonProperty(value = "frontendEndpointLinks", access = JsonProperty.Access.WRITE_ONLY)
    private List<FrontendEndpointLink> frontendEndpointLinks;

    /*
     * Describes Routing Rules associated with this Web Application Firewall policy.
     */
    @JsonProperty(value = "routingRuleLinks", access = JsonProperty.Access.WRITE_ONLY)
    private List<RoutingRuleLink> routingRuleLinks;

    /*
     * Describes Security Policy associated with this Web Application Firewall policy.
     */
    @JsonProperty(value = "securityPolicyLinks", access = JsonProperty.Access.WRITE_ONLY)
    private List<SecurityPolicyLink> securityPolicyLinks;

    /*
     * Provisioning state of the policy.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Resource status of the policy.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private PolicyResourceState resourceState;

    /**
     * Creates an instance of WebApplicationFirewallPolicyProperties class.
     */
    public WebApplicationFirewallPolicyProperties() {
    }

    /**
     * Get the policySettings property: Describes settings for the policy.
     * 
     * @return the policySettings value.
     */
    public PolicySettings policySettings() {
        return this.policySettings;
    }

    /**
     * Set the policySettings property: Describes settings for the policy.
     * 
     * @param policySettings the policySettings value to set.
     * @return the WebApplicationFirewallPolicyProperties object itself.
     */
    public WebApplicationFirewallPolicyProperties withPolicySettings(PolicySettings policySettings) {
        this.policySettings = policySettings;
        return this;
    }

    /**
     * Get the customRules property: Describes custom rules inside the policy.
     * 
     * @return the customRules value.
     */
    public CustomRuleList customRules() {
        return this.customRules;
    }

    /**
     * Set the customRules property: Describes custom rules inside the policy.
     * 
     * @param customRules the customRules value to set.
     * @return the WebApplicationFirewallPolicyProperties object itself.
     */
    public WebApplicationFirewallPolicyProperties withCustomRules(CustomRuleList customRules) {
        this.customRules = customRules;
        return this;
    }

    /**
     * Get the managedRules property: Describes managed rules inside the policy.
     * 
     * @return the managedRules value.
     */
    public ManagedRuleSetList managedRules() {
        return this.managedRules;
    }

    /**
     * Set the managedRules property: Describes managed rules inside the policy.
     * 
     * @param managedRules the managedRules value to set.
     * @return the WebApplicationFirewallPolicyProperties object itself.
     */
    public WebApplicationFirewallPolicyProperties withManagedRules(ManagedRuleSetList managedRules) {
        this.managedRules = managedRules;
        return this;
    }

    /**
     * Get the frontendEndpointLinks property: Describes Frontend Endpoints associated with this Web Application Firewall policy.
     * 
     * @return the frontendEndpointLinks value.
     */
    public List<FrontendEndpointLink> frontendEndpointLinks() {
        return this.frontendEndpointLinks;
    }

    /**
     * Get the routingRuleLinks property: Describes Routing Rules associated with this Web Application Firewall policy.
     * 
     * @return the routingRuleLinks value.
     */
    public List<RoutingRuleLink> routingRuleLinks() {
        return this.routingRuleLinks;
    }

    /**
     * Get the securityPolicyLinks property: Describes Security Policy associated with this Web Application Firewall policy.
     * 
     * @return the securityPolicyLinks value.
     */
    public List<SecurityPolicyLink> securityPolicyLinks() {
        return this.securityPolicyLinks;
    }

    /**
     * Get the provisioningState property: Provisioning state of the policy.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceState property: Resource status of the policy.
     * 
     * @return the resourceState value.
     */
    public PolicyResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policySettings() != null) {
            policySettings().validate();
        }
        if (customRules() != null) {
            customRules().validate();
        }
        if (managedRules() != null) {
            managedRules().validate();
        }
        if (frontendEndpointLinks() != null) {
            frontendEndpointLinks().forEach(e -> e.validate());
        }
        if (routingRuleLinks() != null) {
            routingRuleLinks().forEach(e -> e.validate());
        }
        if (securityPolicyLinks() != null) {
            securityPolicyLinks().forEach(e -> e.validate());
        }
    }
}
