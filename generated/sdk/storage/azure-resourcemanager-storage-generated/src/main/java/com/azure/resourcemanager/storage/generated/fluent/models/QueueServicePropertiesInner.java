// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.generated.models.CorsRules;
import java.io.IOException;

/**
 * The properties of a storage account’s Queue service.
 */
@Fluent
public final class QueueServicePropertiesInner extends ProxyResource {
    /*
     * The properties of a storage account’s Queue service.
     */
    private QueueServicePropertiesProperties innerQueueServiceProperties;

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
     * Creates an instance of QueueServicePropertiesInner class.
     */
    public QueueServicePropertiesInner() {
    }

    /**
     * Get the innerQueueServiceProperties property: The properties of a storage account’s Queue service.
     * 
     * @return the innerQueueServiceProperties value.
     */
    private QueueServicePropertiesProperties innerQueueServiceProperties() {
        return this.innerQueueServiceProperties;
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
     * Get the cors property: Specifies CORS rules for the Queue service. You can include up to five CorsRule elements
     * in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and
     * CORS will be disabled for the Queue service.
     * 
     * @return the cors value.
     */
    public CorsRules cors() {
        return this.innerQueueServiceProperties() == null ? null : this.innerQueueServiceProperties().cors();
    }

    /**
     * Set the cors property: Specifies CORS rules for the Queue service. You can include up to five CorsRule elements
     * in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and
     * CORS will be disabled for the Queue service.
     * 
     * @param cors the cors value to set.
     * @return the QueueServicePropertiesInner object itself.
     */
    public QueueServicePropertiesInner withCors(CorsRules cors) {
        if (this.innerQueueServiceProperties() == null) {
            this.innerQueueServiceProperties = new QueueServicePropertiesProperties();
        }
        this.innerQueueServiceProperties().withCors(cors);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerQueueServiceProperties() != null) {
            innerQueueServiceProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerQueueServiceProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QueueServicePropertiesInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QueueServicePropertiesInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the QueueServicePropertiesInner.
     */
    public static QueueServicePropertiesInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QueueServicePropertiesInner deserializedQueueServicePropertiesInner = new QueueServicePropertiesInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedQueueServicePropertiesInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedQueueServicePropertiesInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedQueueServicePropertiesInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedQueueServicePropertiesInner.innerQueueServiceProperties
                        = QueueServicePropertiesProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQueueServicePropertiesInner;
        });
    }
}
