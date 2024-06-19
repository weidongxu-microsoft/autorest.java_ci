// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.ProfileUpdateProperties;
import java.io.IOException;
import java.util.Map;

/**
 * Defines modifiable attributes of a Profile.
 */
@Fluent
public final class ProfileUpdateModel implements JsonSerializable<ProfileUpdateModel> {
    /*
     * The properties of a Profile
     */
    private ProfileUpdateProperties innerProperties;

    /*
     * Resource tags.
     */
    private Map<String, String> tags;

    /**
     * Creates an instance of ProfileUpdateModel class.
     */
    public ProfileUpdateModel() {
    }

    /**
     * Get the innerProperties property: The properties of a Profile.
     * 
     * @return the innerProperties value.
     */
    private ProfileUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the ProfileUpdateModel object itself.
     */
    public ProfileUpdateModel withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the enabledState property: The enabled state of the Profile.
     * 
     * @return the enabledState value.
     */
    public State enabledState() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledState();
    }

    /**
     * Set the enabledState property: The enabled state of the Profile.
     * 
     * @param enabledState the enabledState value to set.
     * @return the ProfileUpdateModel object itself.
     */
    public ProfileUpdateModel withEnabledState(State enabledState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProfileUpdateProperties();
        }
        this.innerProperties().withEnabledState(enabledState);
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
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProfileUpdateModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProfileUpdateModel if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProfileUpdateModel.
     */
    public static ProfileUpdateModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProfileUpdateModel deserializedProfileUpdateModel = new ProfileUpdateModel();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedProfileUpdateModel.innerProperties = ProfileUpdateProperties.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedProfileUpdateModel.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProfileUpdateModel;
        });
    }
}
