// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The localizable string class.
 */
@Fluent
public final class LocalizableStringAutoGenerated implements JsonSerializable<LocalizableStringAutoGenerated> {
    /*
     * The invariant value.
     */
    private String value;

    /*
     * The display name.
     */
    private String localizedValue;

    /**
     * Creates an instance of LocalizableStringAutoGenerated class.
     */
    public LocalizableStringAutoGenerated() {
    }

    /**
     * Get the value property: The invariant value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The invariant value.
     * 
     * @param value the value value to set.
     * @return the LocalizableStringAutoGenerated object itself.
     */
    public LocalizableStringAutoGenerated withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: The display name.
     * 
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: The display name.
     * 
     * @param localizedValue the localizedValue value to set.
     * @return the LocalizableStringAutoGenerated object itself.
     */
    public LocalizableStringAutoGenerated withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model LocalizableStringAutoGenerated"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LocalizableStringAutoGenerated.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("localizedValue", this.localizedValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LocalizableStringAutoGenerated from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LocalizableStringAutoGenerated if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LocalizableStringAutoGenerated.
     */
    public static LocalizableStringAutoGenerated fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LocalizableStringAutoGenerated deserializedLocalizableStringAutoGenerated
                = new LocalizableStringAutoGenerated();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedLocalizableStringAutoGenerated.value = reader.getString();
                } else if ("localizedValue".equals(fieldName)) {
                    deserializedLocalizableStringAutoGenerated.localizedValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLocalizableStringAutoGenerated;
        });
    }
}
