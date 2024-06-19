// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * The IpGroups property information.
 */
@Fluent
public final class IpGroupPropertiesFormat implements JsonSerializable<IpGroupPropertiesFormat> {
    /*
     * The provisioning state of the IpGroups resource.
     */
    private ProvisioningState provisioningState;

    /*
     * IpAddresses/IpAddressPrefixes in the IpGroups resource.
     */
    private List<String> ipAddresses;

    /*
     * List of references to Firewall resources that this IpGroups is associated with.
     */
    private List<SubResource> firewalls;

    /*
     * List of references to Firewall Policies resources that this IpGroups is associated with.
     */
    private List<SubResource> firewallPolicies;

    /**
     * Creates an instance of IpGroupPropertiesFormat class.
     */
    public IpGroupPropertiesFormat() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the IpGroups resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the ipAddresses property: IpAddresses/IpAddressPrefixes in the IpGroups resource.
     * 
     * @return the ipAddresses value.
     */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }

    /**
     * Set the ipAddresses property: IpAddresses/IpAddressPrefixes in the IpGroups resource.
     * 
     * @param ipAddresses the ipAddresses value to set.
     * @return the IpGroupPropertiesFormat object itself.
     */
    public IpGroupPropertiesFormat withIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    /**
     * Get the firewalls property: List of references to Firewall resources that this IpGroups is associated with.
     * 
     * @return the firewalls value.
     */
    public List<SubResource> firewalls() {
        return this.firewalls;
    }

    /**
     * Get the firewallPolicies property: List of references to Firewall Policies resources that this IpGroups is
     * associated with.
     * 
     * @return the firewallPolicies value.
     */
    public List<SubResource> firewallPolicies() {
        return this.firewallPolicies;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("ipAddresses", this.ipAddresses, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpGroupPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpGroupPropertiesFormat if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IpGroupPropertiesFormat.
     */
    public static IpGroupPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpGroupPropertiesFormat deserializedIpGroupPropertiesFormat = new IpGroupPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedIpGroupPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("ipAddresses".equals(fieldName)) {
                    List<String> ipAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedIpGroupPropertiesFormat.ipAddresses = ipAddresses;
                } else if ("firewalls".equals(fieldName)) {
                    List<SubResource> firewalls = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedIpGroupPropertiesFormat.firewalls = firewalls;
                } else if ("firewallPolicies".equals(fieldName)) {
                    List<SubResource> firewallPolicies = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedIpGroupPropertiesFormat.firewallPolicies = firewallPolicies;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpGroupPropertiesFormat;
        });
    }
}
