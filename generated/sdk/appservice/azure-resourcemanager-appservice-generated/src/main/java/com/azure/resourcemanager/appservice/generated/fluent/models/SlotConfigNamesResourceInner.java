// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import java.io.IOException;
import java.util.List;

/**
 * Slot Config names azure resource.
 */
@Fluent
public final class SlotConfigNamesResourceInner extends ProxyOnlyResource {
    /*
     * Core resource properties
     */
    private SlotConfigNames innerProperties;

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
     * Creates an instance of SlotConfigNamesResourceInner class.
     */
    public SlotConfigNamesResourceInner() {
    }

    /**
     * Get the innerProperties property: Core resource properties.
     * 
     * @return the innerProperties value.
     */
    private SlotConfigNames innerProperties() {
        return this.innerProperties;
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
    public SlotConfigNamesResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the connectionStringNames property: List of connection string names.
     * 
     * @return the connectionStringNames value.
     */
    public List<String> connectionStringNames() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionStringNames();
    }

    /**
     * Set the connectionStringNames property: List of connection string names.
     * 
     * @param connectionStringNames the connectionStringNames value to set.
     * @return the SlotConfigNamesResourceInner object itself.
     */
    public SlotConfigNamesResourceInner withConnectionStringNames(List<String> connectionStringNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SlotConfigNames();
        }
        this.innerProperties().withConnectionStringNames(connectionStringNames);
        return this;
    }

    /**
     * Get the appSettingNames property: List of application settings names.
     * 
     * @return the appSettingNames value.
     */
    public List<String> appSettingNames() {
        return this.innerProperties() == null ? null : this.innerProperties().appSettingNames();
    }

    /**
     * Set the appSettingNames property: List of application settings names.
     * 
     * @param appSettingNames the appSettingNames value to set.
     * @return the SlotConfigNamesResourceInner object itself.
     */
    public SlotConfigNamesResourceInner withAppSettingNames(List<String> appSettingNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SlotConfigNames();
        }
        this.innerProperties().withAppSettingNames(appSettingNames);
        return this;
    }

    /**
     * Get the azureStorageConfigNames property: List of external Azure storage account identifiers.
     * 
     * @return the azureStorageConfigNames value.
     */
    public List<String> azureStorageConfigNames() {
        return this.innerProperties() == null ? null : this.innerProperties().azureStorageConfigNames();
    }

    /**
     * Set the azureStorageConfigNames property: List of external Azure storage account identifiers.
     * 
     * @param azureStorageConfigNames the azureStorageConfigNames value to set.
     * @return the SlotConfigNamesResourceInner object itself.
     */
    public SlotConfigNamesResourceInner withAzureStorageConfigNames(List<String> azureStorageConfigNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SlotConfigNames();
        }
        this.innerProperties().withAzureStorageConfigNames(azureStorageConfigNames);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SlotConfigNamesResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SlotConfigNamesResourceInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SlotConfigNamesResourceInner.
     */
    public static SlotConfigNamesResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SlotConfigNamesResourceInner deserializedSlotConfigNamesResourceInner = new SlotConfigNamesResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSlotConfigNamesResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSlotConfigNamesResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSlotConfigNamesResourceInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedSlotConfigNamesResourceInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedSlotConfigNamesResourceInner.innerProperties = SlotConfigNames.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSlotConfigNamesResourceInner;
        });
    }
}
