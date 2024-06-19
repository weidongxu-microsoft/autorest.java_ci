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
import java.util.List;

/**
 * Additional configuration for a data providers.
 */
@Fluent
public final class DataProviderMetadata implements JsonSerializable<DataProviderMetadata> {
    /*
     * The providerName property.
     */
    private String providerName;

    /*
     * Settings for the data provider
     */
    private List<KeyValuePairStringObject> propertyBag;

    /**
     * Creates an instance of DataProviderMetadata class.
     */
    public DataProviderMetadata() {
    }

    /**
     * Get the providerName property: The providerName property.
     * 
     * @return the providerName value.
     */
    public String providerName() {
        return this.providerName;
    }

    /**
     * Set the providerName property: The providerName property.
     * 
     * @param providerName the providerName value to set.
     * @return the DataProviderMetadata object itself.
     */
    public DataProviderMetadata withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * Get the propertyBag property: Settings for the data provider.
     * 
     * @return the propertyBag value.
     */
    public List<KeyValuePairStringObject> propertyBag() {
        return this.propertyBag;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (propertyBag() != null) {
            propertyBag().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("providerName", this.providerName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataProviderMetadata from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataProviderMetadata if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataProviderMetadata.
     */
    public static DataProviderMetadata fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataProviderMetadata deserializedDataProviderMetadata = new DataProviderMetadata();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("providerName".equals(fieldName)) {
                    deserializedDataProviderMetadata.providerName = reader.getString();
                } else if ("propertyBag".equals(fieldName)) {
                    List<KeyValuePairStringObject> propertyBag
                        = reader.readArray(reader1 -> KeyValuePairStringObject.fromJson(reader1));
                    deserializedDataProviderMetadata.propertyBag = propertyBag;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataProviderMetadata;
        });
    }
}
