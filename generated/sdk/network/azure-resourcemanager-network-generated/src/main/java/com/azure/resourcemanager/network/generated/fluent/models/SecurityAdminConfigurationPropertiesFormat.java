// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.NetworkIntentPolicyBasedService;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the security admin configuration properties. */
@Fluent
public final class SecurityAdminConfigurationPropertiesFormat {
    /*
     * A description of the security configuration.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Enum list of network intent policy based services.
     */
    @JsonProperty(value = "applyOnNetworkIntentPolicyBasedServices")
    private List<NetworkIntentPolicyBasedService> applyOnNetworkIntentPolicyBasedServices;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of SecurityAdminConfigurationPropertiesFormat class. */
    public SecurityAdminConfigurationPropertiesFormat() {
    }

    /**
     * Get the description property: A description of the security configuration.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description of the security configuration.
     *
     * @param description the description value to set.
     * @return the SecurityAdminConfigurationPropertiesFormat object itself.
     */
    public SecurityAdminConfigurationPropertiesFormat withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the applyOnNetworkIntentPolicyBasedServices property: Enum list of network intent policy based services.
     *
     * @return the applyOnNetworkIntentPolicyBasedServices value.
     */
    public List<NetworkIntentPolicyBasedService> applyOnNetworkIntentPolicyBasedServices() {
        return this.applyOnNetworkIntentPolicyBasedServices;
    }

    /**
     * Set the applyOnNetworkIntentPolicyBasedServices property: Enum list of network intent policy based services.
     *
     * @param applyOnNetworkIntentPolicyBasedServices the applyOnNetworkIntentPolicyBasedServices value to set.
     * @return the SecurityAdminConfigurationPropertiesFormat object itself.
     */
    public SecurityAdminConfigurationPropertiesFormat withApplyOnNetworkIntentPolicyBasedServices(
        List<NetworkIntentPolicyBasedService> applyOnNetworkIntentPolicyBasedServices) {
        this.applyOnNetworkIntentPolicyBasedServices = applyOnNetworkIntentPolicyBasedServices;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
