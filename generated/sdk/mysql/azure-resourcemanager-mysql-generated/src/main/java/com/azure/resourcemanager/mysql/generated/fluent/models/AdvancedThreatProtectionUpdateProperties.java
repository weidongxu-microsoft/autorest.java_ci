// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mysql.generated.models.AdvancedThreatProtectionState;
import java.io.IOException;

/**
 * Properties of Advanced Threat Protection that can be updated.
 */
@Fluent
public final class AdvancedThreatProtectionUpdateProperties
    implements JsonSerializable<AdvancedThreatProtectionUpdateProperties> {
    /*
     * Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled or a state has not been
     * applied yet on the specific database or server.
     */
    private AdvancedThreatProtectionState state;

    /**
     * Creates an instance of AdvancedThreatProtectionUpdateProperties class.
     */
    public AdvancedThreatProtectionUpdateProperties() {
    }

    /**
     * Get the state property: Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled
     * or a state has not been applied yet on the specific database or server.
     * 
     * @return the state value.
     */
    public AdvancedThreatProtectionState state() {
        return this.state;
    }

    /**
     * Set the state property: Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled
     * or a state has not been applied yet on the specific database or server.
     * 
     * @param state the state value to set.
     * @return the AdvancedThreatProtectionUpdateProperties object itself.
     */
    public AdvancedThreatProtectionUpdateProperties withState(AdvancedThreatProtectionState state) {
        this.state = state;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (state() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property state in model AdvancedThreatProtectionUpdateProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AdvancedThreatProtectionUpdateProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AdvancedThreatProtectionUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AdvancedThreatProtectionUpdateProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AdvancedThreatProtectionUpdateProperties.
     */
    public static AdvancedThreatProtectionUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AdvancedThreatProtectionUpdateProperties deserializedAdvancedThreatProtectionUpdateProperties
                = new AdvancedThreatProtectionUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("state".equals(fieldName)) {
                    deserializedAdvancedThreatProtectionUpdateProperties.state
                        = AdvancedThreatProtectionState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAdvancedThreatProtectionUpdateProperties;
        });
    }
}
