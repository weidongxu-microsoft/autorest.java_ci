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

/**
 * Azure Web Category Resource.
 */
@Fluent
public final class AzureWebCategoryInner implements JsonSerializable<AzureWebCategoryInner> {
    /*
     * Properties of the Azure Web Category.
     */
    private AzureWebCategoryPropertiesFormat innerProperties;

    /*
     * Resource ID.
     */
    private String id;

    /*
     * Resource name.
     */
    private String name;

    /*
     * Resource type.
     */
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Creates an instance of AzureWebCategoryInner class.
     */
    public AzureWebCategoryInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Azure Web Category.
     * 
     * @return the innerProperties value.
     */
    private AzureWebCategoryPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the AzureWebCategoryInner object itself.
     */
    public AzureWebCategoryInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the group property: The name of the group that the category belongs to.
     * 
     * @return the group value.
     */
    public String group() {
        return this.innerProperties() == null ? null : this.innerProperties().group();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureWebCategoryInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureWebCategoryInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureWebCategoryInner.
     */
    public static AzureWebCategoryInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureWebCategoryInner deserializedAzureWebCategoryInner = new AzureWebCategoryInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedAzureWebCategoryInner.innerProperties
                        = AzureWebCategoryPropertiesFormat.fromJson(reader);
                } else if ("id".equals(fieldName)) {
                    deserializedAzureWebCategoryInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAzureWebCategoryInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAzureWebCategoryInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedAzureWebCategoryInner.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureWebCategoryInner;
        });
    }
}
