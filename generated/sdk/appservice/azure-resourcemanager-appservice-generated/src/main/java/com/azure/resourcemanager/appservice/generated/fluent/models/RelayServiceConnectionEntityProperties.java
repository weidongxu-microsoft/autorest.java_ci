// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * RelayServiceConnectionEntity resource specific properties.
 */
@Fluent
public final class RelayServiceConnectionEntityProperties
    implements JsonSerializable<RelayServiceConnectionEntityProperties> {
    /*
     * The entityName property.
     */
    private String entityName;

    /*
     * The entityConnectionString property.
     */
    private String entityConnectionString;

    /*
     * The resourceType property.
     */
    private String resourceType;

    /*
     * The resourceConnectionString property.
     */
    private String resourceConnectionString;

    /*
     * The hostname property.
     */
    private String hostname;

    /*
     * The port property.
     */
    private Integer port;

    /*
     * The biztalkUri property.
     */
    private String biztalkUri;

    /**
     * Creates an instance of RelayServiceConnectionEntityProperties class.
     */
    public RelayServiceConnectionEntityProperties() {
    }

    /**
     * Get the entityName property: The entityName property.
     * 
     * @return the entityName value.
     */
    public String entityName() {
        return this.entityName;
    }

    /**
     * Set the entityName property: The entityName property.
     * 
     * @param entityName the entityName value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    /**
     * Get the entityConnectionString property: The entityConnectionString property.
     * 
     * @return the entityConnectionString value.
     */
    public String entityConnectionString() {
        return this.entityConnectionString;
    }

    /**
     * Set the entityConnectionString property: The entityConnectionString property.
     * 
     * @param entityConnectionString the entityConnectionString value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withEntityConnectionString(String entityConnectionString) {
        this.entityConnectionString = entityConnectionString;
        return this;
    }

    /**
     * Get the resourceType property: The resourceType property.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The resourceType property.
     * 
     * @param resourceType the resourceType value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the resourceConnectionString property: The resourceConnectionString property.
     * 
     * @return the resourceConnectionString value.
     */
    public String resourceConnectionString() {
        return this.resourceConnectionString;
    }

    /**
     * Set the resourceConnectionString property: The resourceConnectionString property.
     * 
     * @param resourceConnectionString the resourceConnectionString value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withResourceConnectionString(String resourceConnectionString) {
        this.resourceConnectionString = resourceConnectionString;
        return this;
    }

    /**
     * Get the hostname property: The hostname property.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The hostname property.
     * 
     * @param hostname the hostname value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the port property: The port property.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port property.
     * 
     * @param port the port value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the biztalkUri property: The biztalkUri property.
     * 
     * @return the biztalkUri value.
     */
    public String biztalkUri() {
        return this.biztalkUri;
    }

    /**
     * Set the biztalkUri property: The biztalkUri property.
     * 
     * @param biztalkUri the biztalkUri value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withBiztalkUri(String biztalkUri) {
        this.biztalkUri = biztalkUri;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("entityName", this.entityName);
        jsonWriter.writeStringField("entityConnectionString", this.entityConnectionString);
        jsonWriter.writeStringField("resourceType", this.resourceType);
        jsonWriter.writeStringField("resourceConnectionString", this.resourceConnectionString);
        jsonWriter.writeStringField("hostname", this.hostname);
        jsonWriter.writeNumberField("port", this.port);
        jsonWriter.writeStringField("biztalkUri", this.biztalkUri);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RelayServiceConnectionEntityProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RelayServiceConnectionEntityProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RelayServiceConnectionEntityProperties.
     */
    public static RelayServiceConnectionEntityProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RelayServiceConnectionEntityProperties deserializedRelayServiceConnectionEntityProperties
                = new RelayServiceConnectionEntityProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("entityName".equals(fieldName)) {
                    deserializedRelayServiceConnectionEntityProperties.entityName = reader.getString();
                } else if ("entityConnectionString".equals(fieldName)) {
                    deserializedRelayServiceConnectionEntityProperties.entityConnectionString = reader.getString();
                } else if ("resourceType".equals(fieldName)) {
                    deserializedRelayServiceConnectionEntityProperties.resourceType = reader.getString();
                } else if ("resourceConnectionString".equals(fieldName)) {
                    deserializedRelayServiceConnectionEntityProperties.resourceConnectionString = reader.getString();
                } else if ("hostname".equals(fieldName)) {
                    deserializedRelayServiceConnectionEntityProperties.hostname = reader.getString();
                } else if ("port".equals(fieldName)) {
                    deserializedRelayServiceConnectionEntityProperties.port = reader.getNullable(JsonReader::getInt);
                } else if ("biztalkUri".equals(fieldName)) {
                    deserializedRelayServiceConnectionEntityProperties.biztalkUri = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRelayServiceConnectionEntityProperties;
        });
    }
}
