// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * VpnServerConfiguration PolicyGroup member.
 */
@Fluent
public final class VpnServerConfigurationPolicyGroupMember
    implements JsonSerializable<VpnServerConfigurationPolicyGroupMember> {
    /*
     * Name of the VpnServerConfigurationPolicyGroupMember.
     */
    private String name;

    /*
     * The Vpn Policy member attribute type.
     */
    private VpnPolicyMemberAttributeType attributeType;

    /*
     * The value of Attribute used for this VpnServerConfigurationPolicyGroupMember.
     */
    private String attributeValue;

    /**
     * Creates an instance of VpnServerConfigurationPolicyGroupMember class.
     */
    public VpnServerConfigurationPolicyGroupMember() {
    }

    /**
     * Get the name property: Name of the VpnServerConfigurationPolicyGroupMember.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the VpnServerConfigurationPolicyGroupMember.
     * 
     * @param name the name value to set.
     * @return the VpnServerConfigurationPolicyGroupMember object itself.
     */
    public VpnServerConfigurationPolicyGroupMember withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the attributeType property: The Vpn Policy member attribute type.
     * 
     * @return the attributeType value.
     */
    public VpnPolicyMemberAttributeType attributeType() {
        return this.attributeType;
    }

    /**
     * Set the attributeType property: The Vpn Policy member attribute type.
     * 
     * @param attributeType the attributeType value to set.
     * @return the VpnServerConfigurationPolicyGroupMember object itself.
     */
    public VpnServerConfigurationPolicyGroupMember withAttributeType(VpnPolicyMemberAttributeType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * Get the attributeValue property: The value of Attribute used for this VpnServerConfigurationPolicyGroupMember.
     * 
     * @return the attributeValue value.
     */
    public String attributeValue() {
        return this.attributeValue;
    }

    /**
     * Set the attributeValue property: The value of Attribute used for this VpnServerConfigurationPolicyGroupMember.
     * 
     * @param attributeValue the attributeValue value to set.
     * @return the VpnServerConfigurationPolicyGroupMember object itself.
     */
    public VpnServerConfigurationPolicyGroupMember withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("attributeType", this.attributeType == null ? null : this.attributeType.toString());
        jsonWriter.writeStringField("attributeValue", this.attributeValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VpnServerConfigurationPolicyGroupMember from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VpnServerConfigurationPolicyGroupMember if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VpnServerConfigurationPolicyGroupMember.
     */
    public static VpnServerConfigurationPolicyGroupMember fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VpnServerConfigurationPolicyGroupMember deserializedVpnServerConfigurationPolicyGroupMember
                = new VpnServerConfigurationPolicyGroupMember();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedVpnServerConfigurationPolicyGroupMember.name = reader.getString();
                } else if ("attributeType".equals(fieldName)) {
                    deserializedVpnServerConfigurationPolicyGroupMember.attributeType
                        = VpnPolicyMemberAttributeType.fromString(reader.getString());
                } else if ("attributeValue".equals(fieldName)) {
                    deserializedVpnServerConfigurationPolicyGroupMember.attributeValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVpnServerConfigurationPolicyGroupMember;
        });
    }
}
