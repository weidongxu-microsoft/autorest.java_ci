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
 * The instance view of a virtual machine extension handler.
 */
@Fluent
public final class VirtualMachineExtensionHandlerInstanceView
    implements JsonSerializable<VirtualMachineExtensionHandlerInstanceView> {
    /*
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     */
    private String type;

    /*
     * Specifies the version of the script handler.
     */
    private String typeHandlerVersion;

    /*
     * The extension handler status.
     */
    private InstanceViewStatus status;

    /**
     * Creates an instance of VirtualMachineExtensionHandlerInstanceView class.
     */
    public VirtualMachineExtensionHandlerInstanceView() {
    }

    /**
     * Get the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @param type the type value to set.
     * @return the VirtualMachineExtensionHandlerInstanceView object itself.
     */
    public VirtualMachineExtensionHandlerInstanceView withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     * 
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     * 
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the VirtualMachineExtensionHandlerInstanceView object itself.
     */
    public VirtualMachineExtensionHandlerInstanceView withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the status property: The extension handler status.
     * 
     * @return the status value.
     */
    public InstanceViewStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The extension handler status.
     * 
     * @param status the status value to set.
     * @return the VirtualMachineExtensionHandlerInstanceView object itself.
     */
    public VirtualMachineExtensionHandlerInstanceView withStatus(InstanceViewStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("typeHandlerVersion", this.typeHandlerVersion);
        jsonWriter.writeJsonField("status", this.status);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineExtensionHandlerInstanceView from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineExtensionHandlerInstanceView if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineExtensionHandlerInstanceView.
     */
    public static VirtualMachineExtensionHandlerInstanceView fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineExtensionHandlerInstanceView deserializedVirtualMachineExtensionHandlerInstanceView
                = new VirtualMachineExtensionHandlerInstanceView();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedVirtualMachineExtensionHandlerInstanceView.type = reader.getString();
                } else if ("typeHandlerVersion".equals(fieldName)) {
                    deserializedVirtualMachineExtensionHandlerInstanceView.typeHandlerVersion = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedVirtualMachineExtensionHandlerInstanceView.status = InstanceViewStatus.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineExtensionHandlerInstanceView;
        });
    }
}
