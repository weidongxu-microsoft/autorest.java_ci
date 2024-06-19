// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskInner;
import java.io.IOException;
import java.util.List;

/**
 * The List Disks operation response.
 */
@Fluent
public final class DiskList implements JsonSerializable<DiskList> {
    /*
     * A list of disks.
     */
    private List<DiskInner> value;

    /*
     * The uri to fetch the next page of disks. Call ListNext() with this to fetch the next page of disks.
     */
    private String nextLink;

    /**
     * Creates an instance of DiskList class.
     */
    public DiskList() {
    }

    /**
     * Get the value property: A list of disks.
     * 
     * @return the value value.
     */
    public List<DiskInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of disks.
     * 
     * @param value the value value to set.
     * @return the DiskList object itself.
     */
    public DiskList withValue(List<DiskInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of disks. Call ListNext() with this to fetch the next
     * page of disks.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of disks. Call ListNext() with this to fetch the next
     * page of disks.
     * 
     * @param nextLink the nextLink value to set.
     * @return the DiskList object itself.
     */
    public DiskList withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
                .log(new IllegalArgumentException("Missing required property value in model DiskList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiskList.class);

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
     * Reads an instance of DiskList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiskList if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DiskList.
     */
    public static DiskList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiskList deserializedDiskList = new DiskList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<DiskInner> value = reader.readArray(reader1 -> DiskInner.fromJson(reader1));
                    deserializedDiskList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedDiskList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiskList;
        });
    }
}
