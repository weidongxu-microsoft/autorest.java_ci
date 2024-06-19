// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventhubs.generated.models.UnavailableReason;
import java.io.IOException;

/**
 * The Result of the CheckNameAvailability operation.
 */
@Fluent
public final class CheckNameAvailabilityResultInner implements JsonSerializable<CheckNameAvailabilityResultInner> {
    /*
     * The detailed info regarding the reason associated with the Namespace.
     */
    private String message;

    /*
     * Value indicating Namespace is availability, true if the Namespace is available; otherwise, false.
     */
    private Boolean nameAvailable;

    /*
     * The reason for unavailability of a Namespace.
     */
    private UnavailableReason reason;

    /**
     * Creates an instance of CheckNameAvailabilityResultInner class.
     */
    public CheckNameAvailabilityResultInner() {
    }

    /**
     * Get the message property: The detailed info regarding the reason associated with the Namespace.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the nameAvailable property: Value indicating Namespace is availability, true if the Namespace is available;
     * otherwise, false.
     * 
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: Value indicating Namespace is availability, true if the Namespace is available;
     * otherwise, false.
     * 
     * @param nameAvailable the nameAvailable value to set.
     * @return the CheckNameAvailabilityResultInner object itself.
     */
    public CheckNameAvailabilityResultInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: The reason for unavailability of a Namespace.
     * 
     * @return the reason value.
     */
    public UnavailableReason reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for unavailability of a Namespace.
     * 
     * @param reason the reason value to set.
     * @return the CheckNameAvailabilityResultInner object itself.
     */
    public CheckNameAvailabilityResultInner withReason(UnavailableReason reason) {
        this.reason = reason;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CheckNameAvailabilityResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CheckNameAvailabilityResultInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CheckNameAvailabilityResultInner.
     */
    public static CheckNameAvailabilityResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CheckNameAvailabilityResultInner deserializedCheckNameAvailabilityResultInner
                = new CheckNameAvailabilityResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("message".equals(fieldName)) {
                    deserializedCheckNameAvailabilityResultInner.message = reader.getString();
                } else if ("nameAvailable".equals(fieldName)) {
                    deserializedCheckNameAvailabilityResultInner.nameAvailable
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("reason".equals(fieldName)) {
                    deserializedCheckNameAvailabilityResultInner.reason
                        = UnavailableReason.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckNameAvailabilityResultInner;
        });
    }
}
