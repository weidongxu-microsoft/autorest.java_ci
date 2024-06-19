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
 * Localizable string object containing the name and a localized value.
 */
@Fluent
public final class LocalizableString implements JsonSerializable<LocalizableString> {
    /*
     * Non-localized name.
     */
    private String value;

    /*
     * Localized name.
     */
    private String localizedValue;

    /**
     * Creates an instance of LocalizableString class.
     */
    public LocalizableString() {
    }

    /**
     * Get the value property: Non-localized name.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Non-localized name.
     * 
     * @param value the value value to set.
     * @return the LocalizableString object itself.
     */
    public LocalizableString withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: Localized name.
     * 
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: Localized name.
     * 
     * @param localizedValue the localizedValue value to set.
     * @return the LocalizableString object itself.
     */
    public LocalizableString withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
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
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("localizedValue", this.localizedValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LocalizableString from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LocalizableString if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LocalizableString.
     */
    public static LocalizableString fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LocalizableString deserializedLocalizableString = new LocalizableString();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedLocalizableString.value = reader.getString();
                } else if ("localizedValue".equals(fieldName)) {
                    deserializedLocalizableString.localizedValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLocalizableString;
        });
    }
}
