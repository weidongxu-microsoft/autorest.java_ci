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
 * City or town details.
 */
@Fluent
public final class AvailableProvidersListCity implements JsonSerializable<AvailableProvidersListCity> {
    /*
     * The city or town name.
     */
    private String cityName;

    /*
     * A list of Internet service providers.
     */
    private List<String> providers;

    /**
     * Creates an instance of AvailableProvidersListCity class.
     */
    public AvailableProvidersListCity() {
    }

    /**
     * Get the cityName property: The city or town name.
     * 
     * @return the cityName value.
     */
    public String cityName() {
        return this.cityName;
    }

    /**
     * Set the cityName property: The city or town name.
     * 
     * @param cityName the cityName value to set.
     * @return the AvailableProvidersListCity object itself.
     */
    public AvailableProvidersListCity withCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    /**
     * Get the providers property: A list of Internet service providers.
     * 
     * @return the providers value.
     */
    public List<String> providers() {
        return this.providers;
    }

    /**
     * Set the providers property: A list of Internet service providers.
     * 
     * @param providers the providers value to set.
     * @return the AvailableProvidersListCity object itself.
     */
    public AvailableProvidersListCity withProviders(List<String> providers) {
        this.providers = providers;
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
        jsonWriter.writeStringField("cityName", this.cityName);
        jsonWriter.writeArrayField("providers", this.providers, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableProvidersListCity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableProvidersListCity if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableProvidersListCity.
     */
    public static AvailableProvidersListCity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableProvidersListCity deserializedAvailableProvidersListCity = new AvailableProvidersListCity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("cityName".equals(fieldName)) {
                    deserializedAvailableProvidersListCity.cityName = reader.getString();
                } else if ("providers".equals(fieldName)) {
                    List<String> providers = reader.readArray(reader1 -> reader1.getString());
                    deserializedAvailableProvidersListCity.providers = providers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableProvidersListCity;
        });
    }
}
