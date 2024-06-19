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
 * The FrontEndConfiguration model.
 */
@Fluent
public final class FrontEndConfiguration implements JsonSerializable<FrontEndConfiguration> {
    /*
     * The kind property.
     */
    private FrontEndServiceType kind;

    /**
     * Creates an instance of FrontEndConfiguration class.
     */
    public FrontEndConfiguration() {
    }

    /**
     * Get the kind property: The kind property.
     * 
     * @return the kind value.
     */
    public FrontEndServiceType kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind property.
     * 
     * @param kind the kind value to set.
     * @return the FrontEndConfiguration object itself.
     */
    public FrontEndConfiguration withKind(FrontEndServiceType kind) {
        this.kind = kind;
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
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FrontEndConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FrontEndConfiguration if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FrontEndConfiguration.
     */
    public static FrontEndConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FrontEndConfiguration deserializedFrontEndConfiguration = new FrontEndConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    deserializedFrontEndConfiguration.kind = FrontEndServiceType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFrontEndConfiguration;
        });
    }
}
