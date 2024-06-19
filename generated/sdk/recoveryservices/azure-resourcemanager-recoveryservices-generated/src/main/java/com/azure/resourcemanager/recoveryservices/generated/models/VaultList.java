// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.VaultInner;
import java.io.IOException;
import java.util.List;

/**
 * The response model for a list of Vaults.
 */
@Fluent
public final class VaultList implements JsonSerializable<VaultList> {
    /*
     * The value property.
     */
    private List<VaultInner> value;

    /*
     * The nextLink property.
     */
    private String nextLink;

    /**
     * Creates an instance of VaultList class.
     */
    public VaultList() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<VaultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the VaultList object itself.
     */
    public VaultList withValue(List<VaultInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VaultList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VaultList if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the VaultList.
     */
    public static VaultList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VaultList deserializedVaultList = new VaultList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<VaultInner> value = reader.readArray(reader1 -> VaultInner.fromJson(reader1));
                    deserializedVaultList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedVaultList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVaultList;
        });
    }
}
