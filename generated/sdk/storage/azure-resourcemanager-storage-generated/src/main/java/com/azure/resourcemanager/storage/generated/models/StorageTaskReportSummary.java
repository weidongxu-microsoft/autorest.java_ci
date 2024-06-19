// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.generated.fluent.models.StorageTaskReportInstanceInner;
import java.io.IOException;
import java.util.List;

/**
 * Fetch Storage Tasks Run Summary.
 */
@Immutable
public final class StorageTaskReportSummary implements JsonSerializable<StorageTaskReportSummary> {
    /*
     * Gets storage tasks run result summary.
     */
    private List<StorageTaskReportInstanceInner> value;

    /*
     * Request URL that can be used to query next page of storage task run results summary. Returned when the number of
     * run instances and summary reports exceed maximum page size.
     */
    private String nextLink;

    /**
     * Creates an instance of StorageTaskReportSummary class.
     */
    public StorageTaskReportSummary() {
    }

    /**
     * Get the value property: Gets storage tasks run result summary.
     * 
     * @return the value value.
     */
    public List<StorageTaskReportInstanceInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of storage task run results summary.
     * Returned when the number of run instances and summary reports exceed maximum page size.
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
     * Reads an instance of StorageTaskReportSummary from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageTaskReportSummary if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageTaskReportSummary.
     */
    public static StorageTaskReportSummary fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageTaskReportSummary deserializedStorageTaskReportSummary = new StorageTaskReportSummary();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<StorageTaskReportInstanceInner> value
                        = reader.readArray(reader1 -> StorageTaskReportInstanceInner.fromJson(reader1));
                    deserializedStorageTaskReportSummary.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedStorageTaskReportSummary.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageTaskReportSummary;
        });
    }
}
