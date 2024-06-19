// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes the list of all possible values for a specific filter value.
 */
@Fluent
public final class SignatureOverridesFilterValuesResponseInner
    implements JsonSerializable<SignatureOverridesFilterValuesResponseInner> {
    /*
     * Describes the possible values
     */
    private List<String> filterValues;

    /**
     * Creates an instance of SignatureOverridesFilterValuesResponseInner class.
     */
    public SignatureOverridesFilterValuesResponseInner() {
    }

    /**
     * Get the filterValues property: Describes the possible values.
     * 
     * @return the filterValues value.
     */
    public List<String> filterValues() {
        return this.filterValues;
    }

    /**
     * Set the filterValues property: Describes the possible values.
     * 
     * @param filterValues the filterValues value to set.
     * @return the SignatureOverridesFilterValuesResponseInner object itself.
     */
    public SignatureOverridesFilterValuesResponseInner withFilterValues(List<String> filterValues) {
        this.filterValues = filterValues;
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
        jsonWriter.writeArrayField("filterValues", this.filterValues, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SignatureOverridesFilterValuesResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SignatureOverridesFilterValuesResponseInner if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SignatureOverridesFilterValuesResponseInner.
     */
    public static SignatureOverridesFilterValuesResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SignatureOverridesFilterValuesResponseInner deserializedSignatureOverridesFilterValuesResponseInner
                = new SignatureOverridesFilterValuesResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("filterValues".equals(fieldName)) {
                    List<String> filterValues = reader.readArray(reader1 -> reader1.getString());
                    deserializedSignatureOverridesFilterValuesResponseInner.filterValues = filterValues;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSignatureOverridesFilterValuesResponseInner;
        });
    }
}
