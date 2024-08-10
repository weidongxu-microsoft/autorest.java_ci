// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hdinsight.generated.models.ApplicationProperties;
import java.io.IOException;
import java.util.Map;

/**
 * The HDInsight cluster application.
 */
@Fluent
public final class ApplicationInner extends ProxyResource {
    /*
     * The ETag for the application
     */
    private String etag;

    /*
     * The tags for the application.
     */
    private Map<String, String> tags;

    /*
     * The properties of the application.
     */
    private ApplicationProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

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
     * Creates an instance of ApplicationInner class.
     */
    public ApplicationInner() {
    }

    /**
     * Get the etag property: The ETag for the application.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The ETag for the application.
     * 
     * @param etag the etag value to set.
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the tags property: The tags for the application.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags for the application.
     * 
     * @param tags the tags value to set.
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The properties of the application.
     * 
     * @return the properties value.
     */
    public ApplicationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the application.
     * 
     * @param properties the properties value to set.
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withProperties(ApplicationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("etag", this.etag);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApplicationInner.
     */
    public static ApplicationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationInner deserializedApplicationInner = new ApplicationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedApplicationInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedApplicationInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedApplicationInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedApplicationInner.etag = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedApplicationInner.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedApplicationInner.properties = ApplicationProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedApplicationInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationInner;
        });
    }
}
