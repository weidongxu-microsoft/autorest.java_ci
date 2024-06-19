// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies Reboot related Scheduled Event related configurations.
 */
@Fluent
public final class UserInitiatedReboot implements JsonSerializable<UserInitiatedReboot> {
    /*
     * Specifies Reboot Scheduled Event related configurations.
     */
    private Boolean automaticallyApprove;

    /**
     * Creates an instance of UserInitiatedReboot class.
     */
    public UserInitiatedReboot() {
    }

    /**
     * Get the automaticallyApprove property: Specifies Reboot Scheduled Event related configurations.
     * 
     * @return the automaticallyApprove value.
     */
    public Boolean automaticallyApprove() {
        return this.automaticallyApprove;
    }

    /**
     * Set the automaticallyApprove property: Specifies Reboot Scheduled Event related configurations.
     * 
     * @param automaticallyApprove the automaticallyApprove value to set.
     * @return the UserInitiatedReboot object itself.
     */
    public UserInitiatedReboot withAutomaticallyApprove(Boolean automaticallyApprove) {
        this.automaticallyApprove = automaticallyApprove;
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
        jsonWriter.writeBooleanField("automaticallyApprove", this.automaticallyApprove);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserInitiatedReboot from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserInitiatedReboot if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UserInitiatedReboot.
     */
    public static UserInitiatedReboot fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserInitiatedReboot deserializedUserInitiatedReboot = new UserInitiatedReboot();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("automaticallyApprove".equals(fieldName)) {
                    deserializedUserInitiatedReboot.automaticallyApprove = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserInitiatedReboot;
        });
    }
}
