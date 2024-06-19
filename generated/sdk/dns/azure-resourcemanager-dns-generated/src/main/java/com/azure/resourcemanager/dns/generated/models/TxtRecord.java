// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A TXT record.
 */
@Fluent
public final class TxtRecord implements JsonSerializable<TxtRecord> {
    /*
     * The text value of this TXT record.
     */
    private List<String> value;

    /**
     * Creates an instance of TxtRecord class.
     */
    public TxtRecord() {
    }

    /**
     * Get the value property: The text value of this TXT record.
     * 
     * @return the value value.
     */
    public List<String> value() {
        return this.value;
    }

    /**
     * Set the value property: The text value of this TXT record.
     * 
     * @param value the value value to set.
     * @return the TxtRecord object itself.
     */
    public TxtRecord withValue(List<String> value) {
        this.value = value;
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TxtRecord from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TxtRecord if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the TxtRecord.
     */
    public static TxtRecord fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TxtRecord deserializedTxtRecord = new TxtRecord();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<String> value = reader.readArray(reader1 -> reader1.getString());
                    deserializedTxtRecord.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTxtRecord;
        });
    }
}
