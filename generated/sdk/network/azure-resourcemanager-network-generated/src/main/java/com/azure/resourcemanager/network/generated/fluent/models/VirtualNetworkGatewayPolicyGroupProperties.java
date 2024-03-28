// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayPolicyGroupMember;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of VirtualNetworkGatewayPolicyGroup.
 */
@Fluent
public final class VirtualNetworkGatewayPolicyGroupProperties {
    /*
     * Shows if this is a Default VirtualNetworkGatewayPolicyGroup or not.
     */
    @JsonProperty(value = "isDefault", required = true)
    private boolean isDefault;

    /*
     * Priority for VirtualNetworkGatewayPolicyGroup.
     */
    @JsonProperty(value = "priority", required = true)
    private int priority;

    /*
     * Multiple PolicyMembers for VirtualNetworkGatewayPolicyGroup.
     */
    @JsonProperty(value = "policyMembers", required = true)
    private List<VirtualNetworkGatewayPolicyGroupMember> policyMembers;

    /*
     * List of references to vngClientConnectionConfigurations.
     */
    @JsonProperty(value = "vngClientConnectionConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> vngClientConnectionConfigurations;

    /*
     * The provisioning state of the VirtualNetworkGatewayPolicyGroup resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of VirtualNetworkGatewayPolicyGroupProperties class.
     */
    public VirtualNetworkGatewayPolicyGroupProperties() {
    }

    /**
     * Get the isDefault property: Shows if this is a Default VirtualNetworkGatewayPolicyGroup or not.
     * 
     * @return the isDefault value.
     */
    public boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set the isDefault property: Shows if this is a Default VirtualNetworkGatewayPolicyGroup or not.
     * 
     * @param isDefault the isDefault value to set.
     * @return the VirtualNetworkGatewayPolicyGroupProperties object itself.
     */
    public VirtualNetworkGatewayPolicyGroupProperties withIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the priority property: Priority for VirtualNetworkGatewayPolicyGroup.
     * 
     * @return the priority value.
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority for VirtualNetworkGatewayPolicyGroup.
     * 
     * @param priority the priority value to set.
     * @return the VirtualNetworkGatewayPolicyGroupProperties object itself.
     */
    public VirtualNetworkGatewayPolicyGroupProperties withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the policyMembers property: Multiple PolicyMembers for VirtualNetworkGatewayPolicyGroup.
     * 
     * @return the policyMembers value.
     */
    public List<VirtualNetworkGatewayPolicyGroupMember> policyMembers() {
        return this.policyMembers;
    }

    /**
     * Set the policyMembers property: Multiple PolicyMembers for VirtualNetworkGatewayPolicyGroup.
     * 
     * @param policyMembers the policyMembers value to set.
     * @return the VirtualNetworkGatewayPolicyGroupProperties object itself.
     */
    public VirtualNetworkGatewayPolicyGroupProperties
        withPolicyMembers(List<VirtualNetworkGatewayPolicyGroupMember> policyMembers) {
        this.policyMembers = policyMembers;
        return this;
    }

    /**
     * Get the vngClientConnectionConfigurations property: List of references to vngClientConnectionConfigurations.
     * 
     * @return the vngClientConnectionConfigurations value.
     */
    public List<SubResource> vngClientConnectionConfigurations() {
        return this.vngClientConnectionConfigurations;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VirtualNetworkGatewayPolicyGroup resource.
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
        if (policyMembers() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property policyMembers in model VirtualNetworkGatewayPolicyGroupProperties"));
        } else {
            policyMembers().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkGatewayPolicyGroupProperties.class);
}
