// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.SettingInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of listing settings. It contains a list of available settings.
 */
@Immutable
public final class SettingsListResult implements JsonSerializable<SettingsListResult> {
    /*
     * The list of settings.
     */
    private List<SettingInner> value;

    /*
     * The link (url) to the next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of SettingsListResult class.
     */
    public SettingsListResult() {
    }

    /**
     * Get the value property: The list of settings.
     * 
     * @return the value value.
     */
    public List<SettingInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
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
     * Reads an instance of SettingsListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SettingsListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SettingsListResult.
     */
    public static SettingsListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SettingsListResult deserializedSettingsListResult = new SettingsListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SettingInner> value = reader.readArray(reader1 -> SettingInner.fromJson(reader1));
                    deserializedSettingsListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSettingsListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSettingsListResult;
        });
    }
}
