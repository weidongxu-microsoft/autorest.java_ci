// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Capabilities information. */
@Fluent
public final class CapabilitiesProperties {
    /*
     * The dnsZones property.
     */
    @JsonProperty(value = "dnsZones")
    private List<DnsZone> dnsZones;

    /** Creates an instance of CapabilitiesProperties class. */
    public CapabilitiesProperties() {
    }

    /**
     * Get the dnsZones property: The dnsZones property.
     *
     * @return the dnsZones value.
     */
    public List<DnsZone> dnsZones() {
        return this.dnsZones;
    }

    /**
     * Set the dnsZones property: The dnsZones property.
     *
     * @param dnsZones the dnsZones value to set.
     * @return the CapabilitiesProperties object itself.
     */
    public CapabilitiesProperties withDnsZones(List<DnsZone> dnsZones) {
        this.dnsZones = dnsZones;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dnsZones() != null) {
            dnsZones().forEach(e -> e.validate());
        }
    }
}
