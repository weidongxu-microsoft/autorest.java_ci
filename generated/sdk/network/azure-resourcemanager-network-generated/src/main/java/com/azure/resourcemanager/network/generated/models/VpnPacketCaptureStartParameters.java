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
 * Start packet capture parameters on virtual network gateway.
 */
@Fluent
public final class VpnPacketCaptureStartParameters implements JsonSerializable<VpnPacketCaptureStartParameters> {
    /*
     * Start Packet capture parameters.
     */
    private String filterData;

    /**
     * Creates an instance of VpnPacketCaptureStartParameters class.
     */
    public VpnPacketCaptureStartParameters() {
    }

    /**
     * Get the filterData property: Start Packet capture parameters.
     * 
     * @return the filterData value.
     */
    public String filterData() {
        return this.filterData;
    }

    /**
     * Set the filterData property: Start Packet capture parameters.
     * 
     * @param filterData the filterData value to set.
     * @return the VpnPacketCaptureStartParameters object itself.
     */
    public VpnPacketCaptureStartParameters withFilterData(String filterData) {
        this.filterData = filterData;
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
        jsonWriter.writeStringField("filterData", this.filterData);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VpnPacketCaptureStartParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VpnPacketCaptureStartParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VpnPacketCaptureStartParameters.
     */
    public static VpnPacketCaptureStartParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VpnPacketCaptureStartParameters deserializedVpnPacketCaptureStartParameters
                = new VpnPacketCaptureStartParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("filterData".equals(fieldName)) {
                    deserializedVpnPacketCaptureStartParameters.filterData = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVpnPacketCaptureStartParameters;
        });
    }
}
