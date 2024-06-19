// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.InAvailabilityReasonType;
import java.io.IOException;

/**
 * Information regarding availability of a resource name.
 */
@Fluent
public final class ResourceNameAvailabilityInner implements JsonSerializable<ResourceNameAvailabilityInner> {
    /*
     * <code>true</code> indicates name is valid and available. <code>false</code> indicates the name is invalid,
     * unavailable, or both.
     */
    private Boolean nameAvailable;

    /*
     * <code>Invalid</code> indicates the name provided does not match Azure App Service naming requirements.
     * <code>AlreadyExists</code> indicates that the name is already in use and is therefore unavailable.
     */
    private InAvailabilityReasonType reason;

    /*
     * If reason == invalid, provide the user with the reason why the given name is invalid, and provide the resource
     * naming requirements so that the user can select a valid name. If reason == AlreadyExists, explain that resource
     * name is already in use, and direct them to select a different name.
     */
    private String message;

    /**
     * Creates an instance of ResourceNameAvailabilityInner class.
     */
    public ResourceNameAvailabilityInner() {
    }

    /**
     * Get the nameAvailable property: &lt;code&gt;true&lt;/code&gt; indicates name is valid and available.
     * &lt;code&gt;false&lt;/code&gt; indicates the name is invalid, unavailable, or both.
     * 
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: &lt;code&gt;true&lt;/code&gt; indicates name is valid and available.
     * &lt;code&gt;false&lt;/code&gt; indicates the name is invalid, unavailable, or both.
     * 
     * @param nameAvailable the nameAvailable value to set.
     * @return the ResourceNameAvailabilityInner object itself.
     */
    public ResourceNameAvailabilityInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: &lt;code&gt;Invalid&lt;/code&gt; indicates the name provided does not match Azure App
     * Service naming requirements. &lt;code&gt;AlreadyExists&lt;/code&gt; indicates that the name is already in use and
     * is therefore unavailable.
     * 
     * @return the reason value.
     */
    public InAvailabilityReasonType reason() {
        return this.reason;
    }

    /**
     * Set the reason property: &lt;code&gt;Invalid&lt;/code&gt; indicates the name provided does not match Azure App
     * Service naming requirements. &lt;code&gt;AlreadyExists&lt;/code&gt; indicates that the name is already in use and
     * is therefore unavailable.
     * 
     * @param reason the reason value to set.
     * @return the ResourceNameAvailabilityInner object itself.
     */
    public ResourceNameAvailabilityInner withReason(InAvailabilityReasonType reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message property: If reason == invalid, provide the user with the reason why the given name is invalid,
     * and provide the resource naming requirements so that the user can select a valid name. If reason ==
     * AlreadyExists, explain that resource name is already in use, and direct them to select a different name.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: If reason == invalid, provide the user with the reason why the given name is invalid,
     * and provide the resource naming requirements so that the user can select a valid name. If reason ==
     * AlreadyExists, explain that resource name is already in use, and direct them to select a different name.
     * 
     * @param message the message value to set.
     * @return the ResourceNameAvailabilityInner object itself.
     */
    public ResourceNameAvailabilityInner withMessage(String message) {
        this.message = message;
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
        jsonWriter.writeBooleanField("nameAvailable", this.nameAvailable);
        jsonWriter.writeStringField("reason", this.reason == null ? null : this.reason.toString());
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceNameAvailabilityInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceNameAvailabilityInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceNameAvailabilityInner.
     */
    public static ResourceNameAvailabilityInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceNameAvailabilityInner deserializedResourceNameAvailabilityInner
                = new ResourceNameAvailabilityInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nameAvailable".equals(fieldName)) {
                    deserializedResourceNameAvailabilityInner.nameAvailable
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("reason".equals(fieldName)) {
                    deserializedResourceNameAvailabilityInner.reason
                        = InAvailabilityReasonType.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    deserializedResourceNameAvailabilityInner.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceNameAvailabilityInner;
        });
    }
}
