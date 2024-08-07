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

/**
 * Function app runtime name and version.
 */
@Fluent
public final class FunctionsRuntime implements JsonSerializable<FunctionsRuntime> {
    /*
     * Function app runtime name. Available options: dotnet-isolated, node, java, powershell, python, custom
     */
    private RuntimeName name;

    /*
     * Function app runtime version. Example: 8 (for dotnet-isolated)
     */
    private String version;

    /**
     * Creates an instance of FunctionsRuntime class.
     */
    public FunctionsRuntime() {
    }

    /**
     * Get the name property: Function app runtime name. Available options: dotnet-isolated, node, java, powershell,
     * python, custom.
     * 
     * @return the name value.
     */
    public RuntimeName name() {
        return this.name;
    }

    /**
     * Set the name property: Function app runtime name. Available options: dotnet-isolated, node, java, powershell,
     * python, custom.
     * 
     * @param name the name value to set.
     * @return the FunctionsRuntime object itself.
     */
    public FunctionsRuntime withName(RuntimeName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: Function app runtime version. Example: 8 (for dotnet-isolated).
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Function app runtime version. Example: 8 (for dotnet-isolated).
     * 
     * @param version the version value to set.
     * @return the FunctionsRuntime object itself.
     */
    public FunctionsRuntime withVersion(String version) {
        this.version = version;
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
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        jsonWriter.writeStringField("version", this.version);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FunctionsRuntime from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FunctionsRuntime if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FunctionsRuntime.
     */
    public static FunctionsRuntime fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FunctionsRuntime deserializedFunctionsRuntime = new FunctionsRuntime();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedFunctionsRuntime.name = RuntimeName.fromString(reader.getString());
                } else if ("version".equals(fieldName)) {
                    deserializedFunctionsRuntime.version = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFunctionsRuntime;
        });
    }
}
