// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.generated.models.CategoryType;
import com.azure.resourcemanager.monitor.generated.models.ProxyOnlyResource;
import java.io.IOException;

/**
 * The diagnostic settings category resource.
 */
@Fluent
public final class DiagnosticSettingsCategoryResourceInner extends ProxyOnlyResource {
    /*
     * The properties of a Diagnostic Settings Category.
     */
    private DiagnosticSettingsCategory innerProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of DiagnosticSettingsCategoryResourceInner class.
     */
    public DiagnosticSettingsCategoryResourceInner() {
    }

    /**
     * Get the innerProperties property: The properties of a Diagnostic Settings Category.
     * 
     * @return the innerProperties value.
     */
    private DiagnosticSettingsCategory innerProperties() {
        return this.innerProperties;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * Get the categoryType property: The type of the diagnostic settings category.
     * 
     * @return the categoryType value.
     */
    public CategoryType categoryType() {
        return this.innerProperties() == null ? null : this.innerProperties().categoryType();
    }

    /**
     * Set the categoryType property: The type of the diagnostic settings category.
     * 
     * @param categoryType the categoryType value to set.
     * @return the DiagnosticSettingsCategoryResourceInner object itself.
     */
    public DiagnosticSettingsCategoryResourceInner withCategoryType(CategoryType categoryType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticSettingsCategory();
        }
        this.innerProperties().withCategoryType(categoryType);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiagnosticSettingsCategoryResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnosticSettingsCategoryResourceInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DiagnosticSettingsCategoryResourceInner.
     */
    public static DiagnosticSettingsCategoryResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnosticSettingsCategoryResourceInner deserializedDiagnosticSettingsCategoryResourceInner
                = new DiagnosticSettingsCategoryResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDiagnosticSettingsCategoryResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDiagnosticSettingsCategoryResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDiagnosticSettingsCategoryResourceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedDiagnosticSettingsCategoryResourceInner.innerProperties
                        = DiagnosticSettingsCategory.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnosticSettingsCategoryResourceInner;
        });
    }
}
