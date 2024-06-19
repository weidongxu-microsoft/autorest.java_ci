// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Restore Settings of the vault.
 */
@Fluent
public final class RestoreSettings implements JsonSerializable<RestoreSettings> {
    /*
     * Settings for CrossSubscriptionRestore
     */
    private CrossSubscriptionRestoreSettings crossSubscriptionRestoreSettings;

    /**
     * Creates an instance of RestoreSettings class.
     */
    public RestoreSettings() {
    }

    /**
     * Get the crossSubscriptionRestoreSettings property: Settings for CrossSubscriptionRestore.
     * 
     * @return the crossSubscriptionRestoreSettings value.
     */
    public CrossSubscriptionRestoreSettings crossSubscriptionRestoreSettings() {
        return this.crossSubscriptionRestoreSettings;
    }

    /**
     * Set the crossSubscriptionRestoreSettings property: Settings for CrossSubscriptionRestore.
     * 
     * @param crossSubscriptionRestoreSettings the crossSubscriptionRestoreSettings value to set.
     * @return the RestoreSettings object itself.
     */
    public RestoreSettings
        withCrossSubscriptionRestoreSettings(CrossSubscriptionRestoreSettings crossSubscriptionRestoreSettings) {
        this.crossSubscriptionRestoreSettings = crossSubscriptionRestoreSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (crossSubscriptionRestoreSettings() != null) {
            crossSubscriptionRestoreSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("crossSubscriptionRestoreSettings", this.crossSubscriptionRestoreSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestoreSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestoreSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RestoreSettings.
     */
    public static RestoreSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestoreSettings deserializedRestoreSettings = new RestoreSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("crossSubscriptionRestoreSettings".equals(fieldName)) {
                    deserializedRestoreSettings.crossSubscriptionRestoreSettings
                        = CrossSubscriptionRestoreSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestoreSettings;
        });
    }
}
