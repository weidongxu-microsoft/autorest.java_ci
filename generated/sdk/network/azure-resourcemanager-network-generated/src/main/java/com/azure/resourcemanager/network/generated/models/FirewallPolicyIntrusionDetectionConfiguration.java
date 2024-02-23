// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The operation for configuring intrusion detection.
 */
@Fluent
public final class FirewallPolicyIntrusionDetectionConfiguration {
    /*
     * List of specific signatures states.
     */
    @JsonProperty(value = "signatureOverrides")
    private List<FirewallPolicyIntrusionDetectionSignatureSpecification> signatureOverrides;

    /*
     * List of rules for traffic to bypass.
     */
    @JsonProperty(value = "bypassTrafficSettings")
    private List<FirewallPolicyIntrusionDetectionBypassTrafficSpecifications> bypassTrafficSettings;

    /*
     * IDPS Private IP address ranges are used to identify traffic direction (i.e. inbound, outbound, etc.). By default,
     * only ranges defined by IANA RFC 1918 are considered private IP addresses. To modify default ranges, specify your
     * Private IP address ranges with this property
     */
    @JsonProperty(value = "privateRanges")
    private List<String> privateRanges;

    /**
     * Creates an instance of FirewallPolicyIntrusionDetectionConfiguration class.
     */
    public FirewallPolicyIntrusionDetectionConfiguration() {
    }

    /**
     * Get the signatureOverrides property: List of specific signatures states.
     * 
     * @return the signatureOverrides value.
     */
    public List<FirewallPolicyIntrusionDetectionSignatureSpecification> signatureOverrides() {
        return this.signatureOverrides;
    }

    /**
     * Set the signatureOverrides property: List of specific signatures states.
     * 
     * @param signatureOverrides the signatureOverrides value to set.
     * @return the FirewallPolicyIntrusionDetectionConfiguration object itself.
     */
    public FirewallPolicyIntrusionDetectionConfiguration
        withSignatureOverrides(List<FirewallPolicyIntrusionDetectionSignatureSpecification> signatureOverrides) {
        this.signatureOverrides = signatureOverrides;
        return this;
    }

    /**
     * Get the bypassTrafficSettings property: List of rules for traffic to bypass.
     * 
     * @return the bypassTrafficSettings value.
     */
    public List<FirewallPolicyIntrusionDetectionBypassTrafficSpecifications> bypassTrafficSettings() {
        return this.bypassTrafficSettings;
    }

    /**
     * Set the bypassTrafficSettings property: List of rules for traffic to bypass.
     * 
     * @param bypassTrafficSettings the bypassTrafficSettings value to set.
     * @return the FirewallPolicyIntrusionDetectionConfiguration object itself.
     */
    public FirewallPolicyIntrusionDetectionConfiguration withBypassTrafficSettings(
        List<FirewallPolicyIntrusionDetectionBypassTrafficSpecifications> bypassTrafficSettings) {
        this.bypassTrafficSettings = bypassTrafficSettings;
        return this;
    }

    /**
     * Get the privateRanges property: IDPS Private IP address ranges are used to identify traffic direction (i.e.
     * inbound, outbound, etc.). By default, only ranges defined by IANA RFC 1918 are considered private IP addresses.
     * To modify default ranges, specify your Private IP address ranges with this property.
     * 
     * @return the privateRanges value.
     */
    public List<String> privateRanges() {
        return this.privateRanges;
    }

    /**
     * Set the privateRanges property: IDPS Private IP address ranges are used to identify traffic direction (i.e.
     * inbound, outbound, etc.). By default, only ranges defined by IANA RFC 1918 are considered private IP addresses.
     * To modify default ranges, specify your Private IP address ranges with this property.
     * 
     * @param privateRanges the privateRanges value to set.
     * @return the FirewallPolicyIntrusionDetectionConfiguration object itself.
     */
    public FirewallPolicyIntrusionDetectionConfiguration withPrivateRanges(List<String> privateRanges) {
        this.privateRanges = privateRanges;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (signatureOverrides() != null) {
            signatureOverrides().forEach(e -> e.validate());
        }
        if (bypassTrafficSettings() != null) {
            bypassTrafficSettings().forEach(e -> e.validate());
        }
    }
}
