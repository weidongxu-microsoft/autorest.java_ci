// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.authorization.generated.fluent.models.ClassicAdministratorInner;
import java.io.IOException;
import java.util.List;

/**
 * ClassicAdministrator list result information.
 */
@Fluent
public final class ClassicAdministratorListResult implements JsonSerializable<ClassicAdministratorListResult> {
    /*
     * An array of administrators.
     */
    private List<ClassicAdministratorInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ClassicAdministratorListResult class.
     */
    public ClassicAdministratorListResult() {
    }

    /**
     * Get the value property: An array of administrators.
     * 
     * @return the value value.
     */
    public List<ClassicAdministratorInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of administrators.
     * 
     * @param value the value value to set.
     * @return the ClassicAdministratorListResult object itself.
     */
    public ClassicAdministratorListResult withValue(List<ClassicAdministratorInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ClassicAdministratorListResult object itself.
     */
    public ClassicAdministratorListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClassicAdministratorListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClassicAdministratorListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClassicAdministratorListResult.
     */
    public static ClassicAdministratorListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClassicAdministratorListResult deserializedClassicAdministratorListResult
                = new ClassicAdministratorListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ClassicAdministratorInner> value
                        = reader.readArray(reader1 -> ClassicAdministratorInner.fromJson(reader1));
                    deserializedClassicAdministratorListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedClassicAdministratorListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClassicAdministratorListResult;
        });
    }
}
