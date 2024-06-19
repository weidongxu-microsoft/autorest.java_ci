// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Information of the private link resource.
 */
@Fluent
public final class PrivateLinkResourceInner implements JsonSerializable<PrivateLinkResourceInner> {
    /*
     * Properties of the private link resource.
     */
    private PrivateLinkResourceProperties innerProperties;

    /*
     * Fully qualified identifier of the resource.
     */
    private String id;

    /*
     * Name of the resource.
     */
    private String name;

    /*
     * Type of the resource.
     */
    private String type;

    /**
     * Creates an instance of PrivateLinkResourceInner class.
     */
    public PrivateLinkResourceInner() {
    }

    /**
     * Get the innerProperties property: Properties of the private link resource.
     * 
     * @return the innerProperties value.
     */
    private PrivateLinkResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: Fully qualified identifier of the resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Fully qualified identifier of the resource.
     * 
     * @param id the id value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource.
     * 
     * @param name the name value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     * 
     * @param type the type value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the groupId property: The groupId property.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.innerProperties() == null ? null : this.innerProperties().groupId();
    }

    /**
     * Set the groupId property: The groupId property.
     * 
     * @param groupId the groupId value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withGroupId(String groupId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withGroupId(groupId);
        return this;
    }

    /**
     * Get the displayName property: The displayName property.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The displayName property.
     * 
     * @param displayName the displayName value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the requiredMembers property: The requiredMembers property.
     * 
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredMembers();
    }

    /**
     * Set the requiredMembers property: The requiredMembers property.
     * 
     * @param requiredMembers the requiredMembers value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withRequiredMembers(List<String> requiredMembers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withRequiredMembers(requiredMembers);
        return this;
    }

    /**
     * Get the requiredZoneNames property: The requiredZoneNames property.
     * 
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredZoneNames();
    }

    /**
     * Set the requiredZoneNames property: The requiredZoneNames property.
     * 
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withRequiredZoneNames(List<String> requiredZoneNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withRequiredZoneNames(requiredZoneNames);
        return this;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkResourceInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkResourceInner.
     */
    public static PrivateLinkResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkResourceInner deserializedPrivateLinkResourceInner = new PrivateLinkResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.innerProperties
                        = PrivateLinkResourceProperties.fromJson(reader);
                } else if ("id".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkResourceInner;
        });
    }
}
