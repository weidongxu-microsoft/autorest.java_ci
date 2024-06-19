// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.policy.generated.fluent.models.DataPolicyManifestInner;
import java.io.IOException;
import java.util.List;

/**
 * List of data policy manifests.
 */
@Fluent
public final class DataPolicyManifestListResult implements JsonSerializable<DataPolicyManifestListResult> {
    /*
     * An array of data policy manifests.
     */
    private List<DataPolicyManifestInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of DataPolicyManifestListResult class.
     */
    public DataPolicyManifestListResult() {
    }

    /**
     * Get the value property: An array of data policy manifests.
     * 
     * @return the value value.
     */
    public List<DataPolicyManifestInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of data policy manifests.
     * 
     * @param value the value value to set.
     * @return the DataPolicyManifestListResult object itself.
     */
    public DataPolicyManifestListResult withValue(List<DataPolicyManifestInner> value) {
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
     * @return the DataPolicyManifestListResult object itself.
     */
    public DataPolicyManifestListResult withNextLink(String nextLink) {
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
     * Reads an instance of DataPolicyManifestListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataPolicyManifestListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataPolicyManifestListResult.
     */
    public static DataPolicyManifestListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataPolicyManifestListResult deserializedDataPolicyManifestListResult = new DataPolicyManifestListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<DataPolicyManifestInner> value
                        = reader.readArray(reader1 -> DataPolicyManifestInner.fromJson(reader1));
                    deserializedDataPolicyManifestListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedDataPolicyManifestListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataPolicyManifestListResult;
        });
    }
}
