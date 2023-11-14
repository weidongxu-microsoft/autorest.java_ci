// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Virtual Router definition.
 */
@Fluent
public final class VirtualRouterPropertiesFormat {
    /*
     * VirtualRouter ASN.
     */
    @JsonProperty(value = "virtualRouterAsn")
    private Long virtualRouterAsn;

    /*
     * VirtualRouter IPs.
     */
    @JsonProperty(value = "virtualRouterIps")
    private List<String> virtualRouterIps;

    /*
     * The Subnet on which VirtualRouter is hosted.
     */
    @JsonProperty(value = "hostedSubnet")
    private SubResource hostedSubnet;

    /*
     * The Gateway on which VirtualRouter is hosted.
     */
    @JsonProperty(value = "hostedGateway")
    private SubResource hostedGateway;

    /*
     * List of references to VirtualRouterPeerings.
     */
    @JsonProperty(value = "peerings", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> peerings;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of VirtualRouterPropertiesFormat class.
     */
    public VirtualRouterPropertiesFormat() {
    }

    /**
     * Get the virtualRouterAsn property: VirtualRouter ASN.
     * 
     * @return the virtualRouterAsn value.
     */
    public Long virtualRouterAsn() {
        return this.virtualRouterAsn;
    }

    /**
     * Set the virtualRouterAsn property: VirtualRouter ASN.
     * 
     * @param virtualRouterAsn the virtualRouterAsn value to set.
     * @return the VirtualRouterPropertiesFormat object itself.
     */
    public VirtualRouterPropertiesFormat withVirtualRouterAsn(Long virtualRouterAsn) {
        this.virtualRouterAsn = virtualRouterAsn;
        return this;
    }

    /**
     * Get the virtualRouterIps property: VirtualRouter IPs.
     * 
     * @return the virtualRouterIps value.
     */
    public List<String> virtualRouterIps() {
        return this.virtualRouterIps;
    }

    /**
     * Set the virtualRouterIps property: VirtualRouter IPs.
     * 
     * @param virtualRouterIps the virtualRouterIps value to set.
     * @return the VirtualRouterPropertiesFormat object itself.
     */
    public VirtualRouterPropertiesFormat withVirtualRouterIps(List<String> virtualRouterIps) {
        this.virtualRouterIps = virtualRouterIps;
        return this;
    }

    /**
     * Get the hostedSubnet property: The Subnet on which VirtualRouter is hosted.
     * 
     * @return the hostedSubnet value.
     */
    public SubResource hostedSubnet() {
        return this.hostedSubnet;
    }

    /**
     * Set the hostedSubnet property: The Subnet on which VirtualRouter is hosted.
     * 
     * @param hostedSubnet the hostedSubnet value to set.
     * @return the VirtualRouterPropertiesFormat object itself.
     */
    public VirtualRouterPropertiesFormat withHostedSubnet(SubResource hostedSubnet) {
        this.hostedSubnet = hostedSubnet;
        return this;
    }

    /**
     * Get the hostedGateway property: The Gateway on which VirtualRouter is hosted.
     * 
     * @return the hostedGateway value.
     */
    public SubResource hostedGateway() {
        return this.hostedGateway;
    }

    /**
     * Set the hostedGateway property: The Gateway on which VirtualRouter is hosted.
     * 
     * @param hostedGateway the hostedGateway value to set.
     * @return the VirtualRouterPropertiesFormat object itself.
     */
    public VirtualRouterPropertiesFormat withHostedGateway(SubResource hostedGateway) {
        this.hostedGateway = hostedGateway;
        return this;
    }

    /**
     * Get the peerings property: List of references to VirtualRouterPeerings.
     * 
     * @return the peerings value.
     */
    public List<SubResource> peerings() {
        return this.peerings;
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
