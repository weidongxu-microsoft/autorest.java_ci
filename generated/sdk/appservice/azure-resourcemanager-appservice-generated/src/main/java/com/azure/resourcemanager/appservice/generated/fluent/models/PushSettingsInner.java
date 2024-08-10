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

/**
 * Push settings for the App.
 */
@Fluent
public final class PushSettingsInner extends ProxyOnlyResource {
    /*
     * PushSettings resource specific properties
     */
    private PushSettingsProperties innerProperties;

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
     * Creates an instance of PushSettingsInner class.
     */
    public PushSettingsInner() {
    }

    /**
     * Get the innerProperties property: PushSettings resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private PushSettingsProperties innerProperties() {
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
    public PushSettingsInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the isPushEnabled property: Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     * @return the isPushEnabled value.
     */
    public Boolean isPushEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isPushEnabled();
    }

    /**
     * Set the isPushEnabled property: Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     * @param isPushEnabled the isPushEnabled value to set.
     * @return the PushSettingsInner object itself.
     */
    public PushSettingsInner withIsPushEnabled(Boolean isPushEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PushSettingsProperties();
        }
        this.innerProperties().withIsPushEnabled(isPushEnabled);
        return this;
    }

    /**
     * Get the tagWhitelistJson property: Gets or sets a JSON string containing a list of tags that are whitelisted for
     * use by the push registration endpoint.
     * 
     * @return the tagWhitelistJson value.
     */
    public String tagWhitelistJson() {
        return this.innerProperties() == null ? null : this.innerProperties().tagWhitelistJson();
    }

    /**
     * Set the tagWhitelistJson property: Gets or sets a JSON string containing a list of tags that are whitelisted for
     * use by the push registration endpoint.
     * 
     * @param tagWhitelistJson the tagWhitelistJson value to set.
     * @return the PushSettingsInner object itself.
     */
    public PushSettingsInner withTagWhitelistJson(String tagWhitelistJson) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PushSettingsProperties();
        }
        this.innerProperties().withTagWhitelistJson(tagWhitelistJson);
        return this;
    }

    /**
     * Get the tagsRequiringAuth property: Gets or sets a JSON string containing a list of tags that require user
     * authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '&#064;', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     * 
     * @return the tagsRequiringAuth value.
     */
    public String tagsRequiringAuth() {
        return this.innerProperties() == null ? null : this.innerProperties().tagsRequiringAuth();
    }

    /**
     * Set the tagsRequiringAuth property: Gets or sets a JSON string containing a list of tags that require user
     * authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '&#064;', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     * 
     * @param tagsRequiringAuth the tagsRequiringAuth value to set.
     * @return the PushSettingsInner object itself.
     */
    public PushSettingsInner withTagsRequiringAuth(String tagsRequiringAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PushSettingsProperties();
        }
        this.innerProperties().withTagsRequiringAuth(tagsRequiringAuth);
        return this;
    }

    /**
     * Get the dynamicTagsJson property: Gets or sets a JSON string containing a list of dynamic tags that will be
     * evaluated from user claims in the push registration endpoint.
     * 
     * @return the dynamicTagsJson value.
     */
    public String dynamicTagsJson() {
        return this.innerProperties() == null ? null : this.innerProperties().dynamicTagsJson();
    }

    /**
     * Set the dynamicTagsJson property: Gets or sets a JSON string containing a list of dynamic tags that will be
     * evaluated from user claims in the push registration endpoint.
     * 
     * @param dynamicTagsJson the dynamicTagsJson value to set.
     * @return the PushSettingsInner object itself.
     */
    public PushSettingsInner withDynamicTagsJson(String dynamicTagsJson) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PushSettingsProperties();
        }
        this.innerProperties().withDynamicTagsJson(dynamicTagsJson);
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
     * Reads an instance of PushSettingsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PushSettingsInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PushSettingsInner.
     */
    public static PushSettingsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PushSettingsInner deserializedPushSettingsInner = new PushSettingsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPushSettingsInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPushSettingsInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPushSettingsInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedPushSettingsInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedPushSettingsInner.innerProperties = PushSettingsProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPushSettingsInner;
        });
    }
}
