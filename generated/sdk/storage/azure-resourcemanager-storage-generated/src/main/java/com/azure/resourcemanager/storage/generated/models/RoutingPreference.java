// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Routing preference defines the type of network, either microsoft or internet routing to be used to deliver the user
 * data, the default option is microsoft routing.
 */
@Fluent
public final class RoutingPreference implements JsonSerializable<RoutingPreference> {
    /*
     * Routing Choice defines the kind of network routing opted by the user.
     */
    private RoutingChoice routingChoice;

    /*
     * A boolean flag which indicates whether microsoft routing storage endpoints are to be published
     */
    private Boolean publishMicrosoftEndpoints;

    /*
     * A boolean flag which indicates whether internet routing storage endpoints are to be published
     */
    private Boolean publishInternetEndpoints;

    /**
     * Creates an instance of RoutingPreference class.
     */
    public RoutingPreference() {
    }

    /**
     * Get the routingChoice property: Routing Choice defines the kind of network routing opted by the user.
     * 
     * @return the routingChoice value.
     */
    public RoutingChoice routingChoice() {
        return this.routingChoice;
    }

    /**
     * Set the routingChoice property: Routing Choice defines the kind of network routing opted by the user.
     * 
     * @param routingChoice the routingChoice value to set.
     * @return the RoutingPreference object itself.
     */
    public RoutingPreference withRoutingChoice(RoutingChoice routingChoice) {
        this.routingChoice = routingChoice;
        return this;
    }

    /**
     * Get the publishMicrosoftEndpoints property: A boolean flag which indicates whether microsoft routing storage
     * endpoints are to be published.
     * 
     * @return the publishMicrosoftEndpoints value.
     */
    public Boolean publishMicrosoftEndpoints() {
        return this.publishMicrosoftEndpoints;
    }

    /**
     * Set the publishMicrosoftEndpoints property: A boolean flag which indicates whether microsoft routing storage
     * endpoints are to be published.
     * 
     * @param publishMicrosoftEndpoints the publishMicrosoftEndpoints value to set.
     * @return the RoutingPreference object itself.
     */
    public RoutingPreference withPublishMicrosoftEndpoints(Boolean publishMicrosoftEndpoints) {
        this.publishMicrosoftEndpoints = publishMicrosoftEndpoints;
        return this;
    }

    /**
     * Get the publishInternetEndpoints property: A boolean flag which indicates whether internet routing storage
     * endpoints are to be published.
     * 
     * @return the publishInternetEndpoints value.
     */
    public Boolean publishInternetEndpoints() {
        return this.publishInternetEndpoints;
    }

    /**
     * Set the publishInternetEndpoints property: A boolean flag which indicates whether internet routing storage
     * endpoints are to be published.
     * 
     * @param publishInternetEndpoints the publishInternetEndpoints value to set.
     * @return the RoutingPreference object itself.
     */
    public RoutingPreference withPublishInternetEndpoints(Boolean publishInternetEndpoints) {
        this.publishInternetEndpoints = publishInternetEndpoints;
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
        jsonWriter.writeStringField("routingChoice", this.routingChoice == null ? null : this.routingChoice.toString());
        jsonWriter.writeBooleanField("publishMicrosoftEndpoints", this.publishMicrosoftEndpoints);
        jsonWriter.writeBooleanField("publishInternetEndpoints", this.publishInternetEndpoints);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoutingPreference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoutingPreference if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoutingPreference.
     */
    public static RoutingPreference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoutingPreference deserializedRoutingPreference = new RoutingPreference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("routingChoice".equals(fieldName)) {
                    deserializedRoutingPreference.routingChoice = RoutingChoice.fromString(reader.getString());
                } else if ("publishMicrosoftEndpoints".equals(fieldName)) {
                    deserializedRoutingPreference.publishMicrosoftEndpoints
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("publishInternetEndpoints".equals(fieldName)) {
                    deserializedRoutingPreference.publishInternetEndpoints = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoutingPreference;
        });
    }
}
