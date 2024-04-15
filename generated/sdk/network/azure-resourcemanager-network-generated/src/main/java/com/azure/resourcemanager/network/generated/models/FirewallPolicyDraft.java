// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.FirewallPolicyDraftInner;
import java.util.Map;

/**
 * An immutable client-side representation of FirewallPolicyDraft.
 */
public interface FirewallPolicyDraft {
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
     * Gets the id property: Resource ID.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the basePolicy property: The parent firewall policy from which rules are inherited.
     * 
     * @return the basePolicy value.
     */
    SubResource basePolicy();

    /**
     * Gets the threatIntelMode property: The operation mode for Threat Intelligence.
     * 
     * @return the threatIntelMode value.
     */
    AzureFirewallThreatIntelMode threatIntelMode();

    /**
     * Gets the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy.
     * 
     * @return the threatIntelWhitelist value.
     */
    FirewallPolicyThreatIntelWhitelist threatIntelWhitelist();

    /**
     * Gets the insights property: Insights on Firewall Policy.
     * 
     * @return the insights value.
     */
    FirewallPolicyInsights insights();

    /**
     * Gets the snat property: The private IP addresses/IP ranges to which traffic will not be SNAT.
     * 
     * @return the snat value.
     */
    FirewallPolicySnat snat();

    /**
     * Gets the sql property: SQL Settings definition.
     * 
     * @return the sql value.
     */
    FirewallPolicySql sql();

    /**
     * Gets the dnsSettings property: DNS Proxy Settings definition.
     * 
     * @return the dnsSettings value.
     */
    DnsSettings dnsSettings();

    /**
     * Gets the explicitProxy property: Explicit Proxy Settings definition.
     * 
     * @return the explicitProxy value.
     */
    ExplicitProxy explicitProxy();

    /**
     * Gets the intrusionDetection property: The configuration for Intrusion detection.
     * 
     * @return the intrusionDetection value.
     */
    FirewallPolicyIntrusionDetection intrusionDetection();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.FirewallPolicyDraftInner object.
     * 
     * @return the inner object.
     */
    FirewallPolicyDraftInner innerModel();
}