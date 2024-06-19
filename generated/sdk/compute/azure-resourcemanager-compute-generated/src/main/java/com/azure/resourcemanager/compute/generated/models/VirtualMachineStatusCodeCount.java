// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The status code and count of the virtual machine scale set instance view status summary.
 */
@Immutable
public final class VirtualMachineStatusCodeCount implements JsonSerializable<VirtualMachineStatusCodeCount> {
    /*
     * The instance view status code.
     */
    private String code;

    /*
     * The number of instances having a particular status code.
     */
    private Integer count;

    /**
     * Creates an instance of VirtualMachineStatusCodeCount class.
     */
    public VirtualMachineStatusCodeCount() {
    }

    /**
     * Get the code property: The instance view status code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the count property: The number of instances having a particular status code.
     * 
     * @return the count value.
     */
    public Integer count() {
        return this.count;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineStatusCodeCount from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineStatusCodeCount if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineStatusCodeCount.
     */
    public static VirtualMachineStatusCodeCount fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineStatusCodeCount deserializedVirtualMachineStatusCodeCount
                = new VirtualMachineStatusCodeCount();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedVirtualMachineStatusCodeCount.code = reader.getString();
                } else if ("count".equals(fieldName)) {
                    deserializedVirtualMachineStatusCodeCount.count = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineStatusCodeCount;
        });
    }
}
