// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A load balancer configuration for an availability group listener.
 */
@Fluent
public final class LoadBalancerConfiguration implements JsonSerializable<LoadBalancerConfiguration> {
    /*
     * Private IP address.
     */
    private PrivateIpAddress privateIpAddress;

    /*
     * Resource id of the public IP.
     */
    private String publicIpAddressResourceId;

    /*
     * Resource id of the load balancer.
     */
    private String loadBalancerResourceId;

    /*
     * Probe port.
     */
    private Integer probePort;

    /*
     * List of the SQL virtual machine instance resource id's that are enrolled into the availability group listener.
     */
    private List<String> sqlVirtualMachineInstances;

    /**
     * Creates an instance of LoadBalancerConfiguration class.
     */
    public LoadBalancerConfiguration() {
    }

    /**
     * Get the privateIpAddress property: Private IP address.
     * 
     * @return the privateIpAddress value.
     */
    public PrivateIpAddress privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: Private IP address.
     * 
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withPrivateIpAddress(PrivateIpAddress privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the publicIpAddressResourceId property: Resource id of the public IP.
     * 
     * @return the publicIpAddressResourceId value.
     */
    public String publicIpAddressResourceId() {
        return this.publicIpAddressResourceId;
    }

    /**
     * Set the publicIpAddressResourceId property: Resource id of the public IP.
     * 
     * @param publicIpAddressResourceId the publicIpAddressResourceId value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withPublicIpAddressResourceId(String publicIpAddressResourceId) {
        this.publicIpAddressResourceId = publicIpAddressResourceId;
        return this;
    }

    /**
     * Get the loadBalancerResourceId property: Resource id of the load balancer.
     * 
     * @return the loadBalancerResourceId value.
     */
    public String loadBalancerResourceId() {
        return this.loadBalancerResourceId;
    }

    /**
     * Set the loadBalancerResourceId property: Resource id of the load balancer.
     * 
     * @param loadBalancerResourceId the loadBalancerResourceId value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withLoadBalancerResourceId(String loadBalancerResourceId) {
        this.loadBalancerResourceId = loadBalancerResourceId;
        return this;
    }

    /**
     * Get the probePort property: Probe port.
     * 
     * @return the probePort value.
     */
    public Integer probePort() {
        return this.probePort;
    }

    /**
     * Set the probePort property: Probe port.
     * 
     * @param probePort the probePort value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withProbePort(Integer probePort) {
        this.probePort = probePort;
        return this;
    }

    /**
     * Get the sqlVirtualMachineInstances property: List of the SQL virtual machine instance resource id's that are
     * enrolled into the availability group listener.
     * 
     * @return the sqlVirtualMachineInstances value.
     */
    public List<String> sqlVirtualMachineInstances() {
        return this.sqlVirtualMachineInstances;
    }

    /**
     * Set the sqlVirtualMachineInstances property: List of the SQL virtual machine instance resource id's that are
     * enrolled into the availability group listener.
     * 
     * @param sqlVirtualMachineInstances the sqlVirtualMachineInstances value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withSqlVirtualMachineInstances(List<String> sqlVirtualMachineInstances) {
        this.sqlVirtualMachineInstances = sqlVirtualMachineInstances;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateIpAddress() != null) {
            privateIpAddress().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("privateIpAddress", this.privateIpAddress);
        jsonWriter.writeStringField("publicIpAddressResourceId", this.publicIpAddressResourceId);
        jsonWriter.writeStringField("loadBalancerResourceId", this.loadBalancerResourceId);
        jsonWriter.writeNumberField("probePort", this.probePort);
        jsonWriter.writeArrayField("sqlVirtualMachineInstances", this.sqlVirtualMachineInstances,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoadBalancerConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBalancerConfiguration if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoadBalancerConfiguration.
     */
    public static LoadBalancerConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBalancerConfiguration deserializedLoadBalancerConfiguration = new LoadBalancerConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("privateIpAddress".equals(fieldName)) {
                    deserializedLoadBalancerConfiguration.privateIpAddress = PrivateIpAddress.fromJson(reader);
                } else if ("publicIpAddressResourceId".equals(fieldName)) {
                    deserializedLoadBalancerConfiguration.publicIpAddressResourceId = reader.getString();
                } else if ("loadBalancerResourceId".equals(fieldName)) {
                    deserializedLoadBalancerConfiguration.loadBalancerResourceId = reader.getString();
                } else if ("probePort".equals(fieldName)) {
                    deserializedLoadBalancerConfiguration.probePort = reader.getNullable(JsonReader::getInt);
                } else if ("sqlVirtualMachineInstances".equals(fieldName)) {
                    List<String> sqlVirtualMachineInstances = reader.readArray(reader1 -> reader1.getString());
                    deserializedLoadBalancerConfiguration.sqlVirtualMachineInstances = sqlVirtualMachineInstances;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBalancerConfiguration;
        });
    }
}
