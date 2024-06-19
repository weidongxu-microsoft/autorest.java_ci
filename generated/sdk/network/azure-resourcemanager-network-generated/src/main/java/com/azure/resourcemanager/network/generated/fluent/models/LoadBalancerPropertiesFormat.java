// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.InboundNatPool;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the load balancer.
 */
@Fluent
public final class LoadBalancerPropertiesFormat implements JsonSerializable<LoadBalancerPropertiesFormat> {
    /*
     * Object representing the frontend IPs to be used for the load balancer.
     */
    private List<FrontendIpConfigurationInner> frontendIpConfigurations;

    /*
     * Collection of backend address pools used by a load balancer.
     */
    private List<BackendAddressPoolInner> backendAddressPools;

    /*
     * Object collection representing the load balancing rules Gets the provisioning.
     */
    private List<LoadBalancingRuleInner> loadBalancingRules;

    /*
     * Collection of probe objects used in the load balancer.
     */
    private List<ProbeInner> probes;

    /*
     * Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT rules on your load balancer is
     * mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an Inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     */
    private List<InboundNatRuleInner> inboundNatRules;

    /*
     * Defines an external port range for inbound NAT to a single backend port on NICs associated with a load balancer.
     * Inbound NAT rules are created automatically for each NIC associated with the Load Balancer using an external port
     * from this range. Defining an Inbound NAT pool on your Load Balancer is mutually exclusive with defining inbound
     * NAT rules. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with
     * individual virtual machines cannot reference an inbound NAT pool. They have to reference individual inbound NAT
     * rules.
     */
    private List<InboundNatPool> inboundNatPools;

    /*
     * The outbound rules.
     */
    private List<OutboundRuleInner> outboundRules;

    /*
     * The resource GUID property of the load balancer resource.
     */
    private String resourceGuid;

    /*
     * The provisioning state of the load balancer resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of LoadBalancerPropertiesFormat class.
     */
    public LoadBalancerPropertiesFormat() {
    }

    /**
     * Get the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load balancer.
     * 
     * @return the frontendIpConfigurations value.
     */
    public List<FrontendIpConfigurationInner> frontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load balancer.
     * 
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat
        withFrontendIpConfigurations(List<FrontendIpConfigurationInner> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Get the backendAddressPools property: Collection of backend address pools used by a load balancer.
     * 
     * @return the backendAddressPools value.
     */
    public List<BackendAddressPoolInner> backendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools property: Collection of backend address pools used by a load balancer.
     * 
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat withBackendAddressPools(List<BackendAddressPoolInner> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Get the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     * 
     * @return the loadBalancingRules value.
     */
    public List<LoadBalancingRuleInner> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Set the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     * 
     * @param loadBalancingRules the loadBalancingRules value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat withLoadBalancingRules(List<LoadBalancingRuleInner> loadBalancingRules) {
        this.loadBalancingRules = loadBalancingRules;
        return this;
    }

    /**
     * Get the probes property: Collection of probe objects used in the load balancer.
     * 
     * @return the probes value.
     */
    public List<ProbeInner> probes() {
        return this.probes;
    }

    /**
     * Set the probes property: Collection of probe objects used in the load balancer.
     * 
     * @param probes the probes value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat withProbes(List<ProbeInner> probes) {
        this.probes = probes;
        return this;
    }

    /**
     * Get the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
     * @return the inboundNatRules value.
     */
    public List<InboundNatRuleInner> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Set the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
     * @param inboundNatRules the inboundNatRules value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat withInboundNatRules(List<InboundNatRuleInner> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
        return this;
    }

    /**
     * Get the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on NICs
     * associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the
     * Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound NAT rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     * 
     * @return the inboundNatPools value.
     */
    public List<InboundNatPool> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Set the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on NICs
     * associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the
     * Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound NAT rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     * 
     * @param inboundNatPools the inboundNatPools value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat withInboundNatPools(List<InboundNatPool> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
        return this;
    }

    /**
     * Get the outboundRules property: The outbound rules.
     * 
     * @return the outboundRules value.
     */
    public List<OutboundRuleInner> outboundRules() {
        return this.outboundRules;
    }

    /**
     * Set the outboundRules property: The outbound rules.
     * 
     * @param outboundRules the outboundRules value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat withOutboundRules(List<OutboundRuleInner> outboundRules) {
        this.outboundRules = outboundRules;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the load balancer resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the load balancer resource.
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
        if (frontendIpConfigurations() != null) {
            frontendIpConfigurations().forEach(e -> e.validate());
        }
        if (backendAddressPools() != null) {
            backendAddressPools().forEach(e -> e.validate());
        }
        if (loadBalancingRules() != null) {
            loadBalancingRules().forEach(e -> e.validate());
        }
        if (probes() != null) {
            probes().forEach(e -> e.validate());
        }
        if (inboundNatRules() != null) {
            inboundNatRules().forEach(e -> e.validate());
        }
        if (inboundNatPools() != null) {
            inboundNatPools().forEach(e -> e.validate());
        }
        if (outboundRules() != null) {
            outboundRules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("frontendIPConfigurations", this.frontendIpConfigurations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("backendAddressPools", this.backendAddressPools,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("loadBalancingRules", this.loadBalancingRules,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("probes", this.probes, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("inboundNatRules", this.inboundNatRules,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("inboundNatPools", this.inboundNatPools,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("outboundRules", this.outboundRules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoadBalancerPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBalancerPropertiesFormat if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoadBalancerPropertiesFormat.
     */
    public static LoadBalancerPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBalancerPropertiesFormat deserializedLoadBalancerPropertiesFormat = new LoadBalancerPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("frontendIPConfigurations".equals(fieldName)) {
                    List<FrontendIpConfigurationInner> frontendIpConfigurations
                        = reader.readArray(reader1 -> FrontendIpConfigurationInner.fromJson(reader1));
                    deserializedLoadBalancerPropertiesFormat.frontendIpConfigurations = frontendIpConfigurations;
                } else if ("backendAddressPools".equals(fieldName)) {
                    List<BackendAddressPoolInner> backendAddressPools
                        = reader.readArray(reader1 -> BackendAddressPoolInner.fromJson(reader1));
                    deserializedLoadBalancerPropertiesFormat.backendAddressPools = backendAddressPools;
                } else if ("loadBalancingRules".equals(fieldName)) {
                    List<LoadBalancingRuleInner> loadBalancingRules
                        = reader.readArray(reader1 -> LoadBalancingRuleInner.fromJson(reader1));
                    deserializedLoadBalancerPropertiesFormat.loadBalancingRules = loadBalancingRules;
                } else if ("probes".equals(fieldName)) {
                    List<ProbeInner> probes = reader.readArray(reader1 -> ProbeInner.fromJson(reader1));
                    deserializedLoadBalancerPropertiesFormat.probes = probes;
                } else if ("inboundNatRules".equals(fieldName)) {
                    List<InboundNatRuleInner> inboundNatRules
                        = reader.readArray(reader1 -> InboundNatRuleInner.fromJson(reader1));
                    deserializedLoadBalancerPropertiesFormat.inboundNatRules = inboundNatRules;
                } else if ("inboundNatPools".equals(fieldName)) {
                    List<InboundNatPool> inboundNatPools
                        = reader.readArray(reader1 -> InboundNatPool.fromJson(reader1));
                    deserializedLoadBalancerPropertiesFormat.inboundNatPools = inboundNatPools;
                } else if ("outboundRules".equals(fieldName)) {
                    List<OutboundRuleInner> outboundRules
                        = reader.readArray(reader1 -> OutboundRuleInner.fromJson(reader1));
                    deserializedLoadBalancerPropertiesFormat.outboundRules = outboundRules;
                } else if ("resourceGuid".equals(fieldName)) {
                    deserializedLoadBalancerPropertiesFormat.resourceGuid = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedLoadBalancerPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBalancerPropertiesFormat;
        });
    }
}
