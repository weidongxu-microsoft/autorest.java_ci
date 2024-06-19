// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A voice receiver.
 */
@Fluent
public final class VoiceReceiver implements JsonSerializable<VoiceReceiver> {
    /*
     * The name of the voice receiver. Names must be unique across all receivers within an action group.
     */
    private String name;

    /*
     * The country code of the voice receiver.
     */
    private String countryCode;

    /*
     * The phone number of the voice receiver.
     */
    private String phoneNumber;

    /**
     * Creates an instance of VoiceReceiver class.
     */
    public VoiceReceiver() {
    }

    /**
     * Get the name property: The name of the voice receiver. Names must be unique across all receivers within an action
     * group.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the voice receiver. Names must be unique across all receivers within an action
     * group.
     * 
     * @param name the name value to set.
     * @return the VoiceReceiver object itself.
     */
    public VoiceReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the countryCode property: The country code of the voice receiver.
     * 
     * @return the countryCode value.
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * Set the countryCode property: The country code of the voice receiver.
     * 
     * @param countryCode the countryCode value to set.
     * @return the VoiceReceiver object itself.
     */
    public VoiceReceiver withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get the phoneNumber property: The phone number of the voice receiver.
     * 
     * @return the phoneNumber value.
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set the phoneNumber property: The phone number of the voice receiver.
     * 
     * @param phoneNumber the phoneNumber value to set.
     * @return the VoiceReceiver object itself.
     */
    public VoiceReceiver withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model VoiceReceiver"));
        }
        if (countryCode() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property countryCode in model VoiceReceiver"));
        }
        if (phoneNumber() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property phoneNumber in model VoiceReceiver"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VoiceReceiver.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("countryCode", this.countryCode);
        jsonWriter.writeStringField("phoneNumber", this.phoneNumber);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VoiceReceiver from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VoiceReceiver if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VoiceReceiver.
     */
    public static VoiceReceiver fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VoiceReceiver deserializedVoiceReceiver = new VoiceReceiver();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedVoiceReceiver.name = reader.getString();
                } else if ("countryCode".equals(fieldName)) {
                    deserializedVoiceReceiver.countryCode = reader.getString();
                } else if ("phoneNumber".equals(fieldName)) {
                    deserializedVoiceReceiver.phoneNumber = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVoiceReceiver;
        });
    }
}
