// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Constraints that determine the list of available Internet service providers.
 */
@Fluent
public final class AvailableProvidersListParameters implements JsonSerializable<AvailableProvidersListParameters> {
    /*
     * A list of Azure regions.
     */
    private List<String> azureLocations;

    /*
     * The country for available providers list.
     */
    private String country;

    /*
     * The state for available providers list.
     */
    private String state;

    /*
     * The city or town for available providers list.
     */
    private String city;

    /**
     * Creates an instance of AvailableProvidersListParameters class.
     */
    public AvailableProvidersListParameters() {
    }

    /**
     * Get the azureLocations property: A list of Azure regions.
     * 
     * @return the azureLocations value.
     */
    public List<String> azureLocations() {
        return this.azureLocations;
    }

    /**
     * Set the azureLocations property: A list of Azure regions.
     * 
     * @param azureLocations the azureLocations value to set.
     * @return the AvailableProvidersListParameters object itself.
     */
    public AvailableProvidersListParameters withAzureLocations(List<String> azureLocations) {
        this.azureLocations = azureLocations;
        return this;
    }

    /**
     * Get the country property: The country for available providers list.
     * 
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: The country for available providers list.
     * 
     * @param country the country value to set.
     * @return the AvailableProvidersListParameters object itself.
     */
    public AvailableProvidersListParameters withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the state property: The state for available providers list.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The state for available providers list.
     * 
     * @param state the state value to set.
     * @return the AvailableProvidersListParameters object itself.
     */
    public AvailableProvidersListParameters withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the city property: The city or town for available providers list.
     * 
     * @return the city value.
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city property: The city or town for available providers list.
     * 
     * @param city the city value to set.
     * @return the AvailableProvidersListParameters object itself.
     */
    public AvailableProvidersListParameters withCity(String city) {
        this.city = city;
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
        jsonWriter.writeArrayField("azureLocations", this.azureLocations,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("country", this.country);
        jsonWriter.writeStringField("state", this.state);
        jsonWriter.writeStringField("city", this.city);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableProvidersListParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableProvidersListParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableProvidersListParameters.
     */
    public static AvailableProvidersListParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableProvidersListParameters deserializedAvailableProvidersListParameters
                = new AvailableProvidersListParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("azureLocations".equals(fieldName)) {
                    List<String> azureLocations = reader.readArray(reader1 -> reader1.getString());
                    deserializedAvailableProvidersListParameters.azureLocations = azureLocations;
                } else if ("country".equals(fieldName)) {
                    deserializedAvailableProvidersListParameters.country = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedAvailableProvidersListParameters.state = reader.getString();
                } else if ("city".equals(fieldName)) {
                    deserializedAvailableProvidersListParameters.city = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableProvidersListParameters;
        });
    }
}
