// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.AzureStorageInfoValue;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import java.io.IOException;
import java.util.Map;

/**
 * AzureStorageInfo dictionary resource.
 */
@Fluent
public final class AzureStoragePropertyDictionaryResourceInner extends ProxyOnlyResource {
    /*
     * Azure storage accounts.
     */
    private Map<String, AzureStorageInfoValue> properties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of AzureStoragePropertyDictionaryResourceInner class.
     */
    public AzureStoragePropertyDictionaryResourceInner() {
    }

    /**
     * Get the properties property: Azure storage accounts.
     * 
     * @return the properties value.
     */
    public Map<String, AzureStorageInfoValue> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Azure storage accounts.
     * 
     * @param properties the properties value to set.
     * @return the AzureStoragePropertyDictionaryResourceInner object itself.
     */
    public AzureStoragePropertyDictionaryResourceInner withProperties(Map<String, AzureStorageInfoValue> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureStoragePropertyDictionaryResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (properties() != null) {
            properties().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeMapField("properties", this.properties, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureStoragePropertyDictionaryResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureStoragePropertyDictionaryResourceInner if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureStoragePropertyDictionaryResourceInner.
     */
    public static AzureStoragePropertyDictionaryResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureStoragePropertyDictionaryResourceInner deserializedAzureStoragePropertyDictionaryResourceInner
                = new AzureStoragePropertyDictionaryResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAzureStoragePropertyDictionaryResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAzureStoragePropertyDictionaryResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAzureStoragePropertyDictionaryResourceInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedAzureStoragePropertyDictionaryResourceInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    Map<String, AzureStorageInfoValue> properties
                        = reader.readMap(reader1 -> AzureStorageInfoValue.fromJson(reader1));
                    deserializedAzureStoragePropertyDictionaryResourceInner.properties = properties;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureStoragePropertyDictionaryResourceInner;
        });
    }
}
