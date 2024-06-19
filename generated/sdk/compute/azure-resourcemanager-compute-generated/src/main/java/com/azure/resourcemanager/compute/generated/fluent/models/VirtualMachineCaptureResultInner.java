// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Output of virtual machine capture operation.
 */
@Fluent
public final class VirtualMachineCaptureResultInner extends SubResource {
    /*
     * the schema of the captured virtual machine
     */
    private String schema;

    /*
     * the version of the content
     */
    private String contentVersion;

    /*
     * parameters of the captured virtual machine
     */
    private Object parameters;

    /*
     * a list of resource items of the captured virtual machine
     */
    private List<Object> resources;

    /**
     * Creates an instance of VirtualMachineCaptureResultInner class.
     */
    public VirtualMachineCaptureResultInner() {
    }

    /**
     * Get the schema property: the schema of the captured virtual machine.
     * 
     * @return the schema value.
     */
    public String schema() {
        return this.schema;
    }

    /**
     * Get the contentVersion property: the version of the content.
     * 
     * @return the contentVersion value.
     */
    public String contentVersion() {
        return this.contentVersion;
    }

    /**
     * Get the parameters property: parameters of the captured virtual machine.
     * 
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Get the resources property: a list of resource items of the captured virtual machine.
     * 
     * @return the resources value.
     */
    public List<Object> resources() {
        return this.resources;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineCaptureResultInner withId(String id) {
        super.withId(id);
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
        jsonWriter.writeStringField("id", id());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineCaptureResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineCaptureResultInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineCaptureResultInner.
     */
    public static VirtualMachineCaptureResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineCaptureResultInner deserializedVirtualMachineCaptureResultInner
                = new VirtualMachineCaptureResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVirtualMachineCaptureResultInner.withId(reader.getString());
                } else if ("$schema".equals(fieldName)) {
                    deserializedVirtualMachineCaptureResultInner.schema = reader.getString();
                } else if ("contentVersion".equals(fieldName)) {
                    deserializedVirtualMachineCaptureResultInner.contentVersion = reader.getString();
                } else if ("parameters".equals(fieldName)) {
                    deserializedVirtualMachineCaptureResultInner.parameters = reader.readUntyped();
                } else if ("resources".equals(fieldName)) {
                    List<Object> resources = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedVirtualMachineCaptureResultInner.resources = resources;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineCaptureResultInner;
        });
    }
}
