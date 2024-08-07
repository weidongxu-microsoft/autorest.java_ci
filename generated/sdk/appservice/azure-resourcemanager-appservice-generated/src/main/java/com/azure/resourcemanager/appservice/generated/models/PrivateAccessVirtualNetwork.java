// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Description of a Virtual Network that is useable for private site access.
 */
@Fluent
public final class PrivateAccessVirtualNetwork implements JsonSerializable<PrivateAccessVirtualNetwork> {
    /*
     * The name of the Virtual Network.
     */
    private String name;

    /*
     * The key (ID) of the Virtual Network.
     */
    private Integer key;

    /*
     * The ARM uri of the Virtual Network
     */
    private String resourceId;

    /*
     * A List of subnets that access is allowed to on this Virtual Network. An empty array (but not null) is interpreted
     * to mean that all subnets are allowed within this Virtual Network.
     */
    private List<PrivateAccessSubnet> subnets;

    /**
     * Creates an instance of PrivateAccessVirtualNetwork class.
     */
    public PrivateAccessVirtualNetwork() {
    }

    /**
     * Get the name property: The name of the Virtual Network.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the Virtual Network.
     * 
     * @param name the name value to set.
     * @return the PrivateAccessVirtualNetwork object itself.
     */
    public PrivateAccessVirtualNetwork withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the key property: The key (ID) of the Virtual Network.
     * 
     * @return the key value.
     */
    public Integer key() {
        return this.key;
    }

    /**
     * Set the key property: The key (ID) of the Virtual Network.
     * 
     * @param key the key value to set.
     * @return the PrivateAccessVirtualNetwork object itself.
     */
    public PrivateAccessVirtualNetwork withKey(Integer key) {
        this.key = key;
        return this;
    }

    /**
     * Get the resourceId property: The ARM uri of the Virtual Network.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The ARM uri of the Virtual Network.
     * 
     * @param resourceId the resourceId value to set.
     * @return the PrivateAccessVirtualNetwork object itself.
     */
    public PrivateAccessVirtualNetwork withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the subnets property: A List of subnets that access is allowed to on this Virtual Network. An empty array
     * (but not null) is interpreted to mean that all subnets are allowed within this Virtual Network.
     * 
     * @return the subnets value.
     */
    public List<PrivateAccessSubnet> subnets() {
        return this.subnets;
    }

    /**
     * Set the subnets property: A List of subnets that access is allowed to on this Virtual Network. An empty array
     * (but not null) is interpreted to mean that all subnets are allowed within this Virtual Network.
     * 
     * @param subnets the subnets value to set.
     * @return the PrivateAccessVirtualNetwork object itself.
     */
    public PrivateAccessVirtualNetwork withSubnets(List<PrivateAccessSubnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnets() != null) {
            subnets().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeNumberField("key", this.key);
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeArrayField("subnets", this.subnets, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateAccessVirtualNetwork from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateAccessVirtualNetwork if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateAccessVirtualNetwork.
     */
    public static PrivateAccessVirtualNetwork fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateAccessVirtualNetwork deserializedPrivateAccessVirtualNetwork = new PrivateAccessVirtualNetwork();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedPrivateAccessVirtualNetwork.name = reader.getString();
                } else if ("key".equals(fieldName)) {
                    deserializedPrivateAccessVirtualNetwork.key = reader.getNullable(JsonReader::getInt);
                } else if ("resourceId".equals(fieldName)) {
                    deserializedPrivateAccessVirtualNetwork.resourceId = reader.getString();
                } else if ("subnets".equals(fieldName)) {
                    List<PrivateAccessSubnet> subnets
                        = reader.readArray(reader1 -> PrivateAccessSubnet.fromJson(reader1));
                    deserializedPrivateAccessVirtualNetwork.subnets = subnets;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateAccessVirtualNetwork;
        });
    }
}
