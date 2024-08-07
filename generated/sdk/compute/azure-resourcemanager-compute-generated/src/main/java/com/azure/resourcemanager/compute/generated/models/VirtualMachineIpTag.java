// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Contains the IP tag associated with the public IP address.
 */
@Fluent
public final class VirtualMachineIpTag implements JsonSerializable<VirtualMachineIpTag> {
    /*
     * IP tag type. Example: FirstPartyUsage.
     */
    private String ipTagType;

    /*
     * IP tag associated with the public IP. Example: SQL, Storage etc.
     */
    private String tag;

    /**
     * Creates an instance of VirtualMachineIpTag class.
     */
    public VirtualMachineIpTag() {
    }

    /**
     * Get the ipTagType property: IP tag type. Example: FirstPartyUsage.
     * 
     * @return the ipTagType value.
     */
    public String ipTagType() {
        return this.ipTagType;
    }

    /**
     * Set the ipTagType property: IP tag type. Example: FirstPartyUsage.
     * 
     * @param ipTagType the ipTagType value to set.
     * @return the VirtualMachineIpTag object itself.
     */
    public VirtualMachineIpTag withIpTagType(String ipTagType) {
        this.ipTagType = ipTagType;
        return this;
    }

    /**
     * Get the tag property: IP tag associated with the public IP. Example: SQL, Storage etc.
     * 
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag property: IP tag associated with the public IP. Example: SQL, Storage etc.
     * 
     * @param tag the tag value to set.
     * @return the VirtualMachineIpTag object itself.
     */
    public VirtualMachineIpTag withTag(String tag) {
        this.tag = tag;
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
        jsonWriter.writeStringField("ipTagType", this.ipTagType);
        jsonWriter.writeStringField("tag", this.tag);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineIpTag from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineIpTag if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineIpTag.
     */
    public static VirtualMachineIpTag fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineIpTag deserializedVirtualMachineIpTag = new VirtualMachineIpTag();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ipTagType".equals(fieldName)) {
                    deserializedVirtualMachineIpTag.ipTagType = reader.getString();
                } else if ("tag".equals(fieldName)) {
                    deserializedVirtualMachineIpTag.tag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineIpTag;
        });
    }
}
