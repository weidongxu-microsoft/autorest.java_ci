// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Domain recommendation search parameters.
 */
@Fluent
public final class DomainRecommendationSearchParameters
    implements JsonSerializable<DomainRecommendationSearchParameters> {
    /*
     * Keywords to be used for generating domain recommendations.
     */
    private String keywords;

    /*
     * Maximum number of recommendations.
     */
    private Integer maxDomainRecommendations;

    /**
     * Creates an instance of DomainRecommendationSearchParameters class.
     */
    public DomainRecommendationSearchParameters() {
    }

    /**
     * Get the keywords property: Keywords to be used for generating domain recommendations.
     * 
     * @return the keywords value.
     */
    public String keywords() {
        return this.keywords;
    }

    /**
     * Set the keywords property: Keywords to be used for generating domain recommendations.
     * 
     * @param keywords the keywords value to set.
     * @return the DomainRecommendationSearchParameters object itself.
     */
    public DomainRecommendationSearchParameters withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * Get the maxDomainRecommendations property: Maximum number of recommendations.
     * 
     * @return the maxDomainRecommendations value.
     */
    public Integer maxDomainRecommendations() {
        return this.maxDomainRecommendations;
    }

    /**
     * Set the maxDomainRecommendations property: Maximum number of recommendations.
     * 
     * @param maxDomainRecommendations the maxDomainRecommendations value to set.
     * @return the DomainRecommendationSearchParameters object itself.
     */
    public DomainRecommendationSearchParameters withMaxDomainRecommendations(Integer maxDomainRecommendations) {
        this.maxDomainRecommendations = maxDomainRecommendations;
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
        jsonWriter.writeStringField("keywords", this.keywords);
        jsonWriter.writeNumberField("maxDomainRecommendations", this.maxDomainRecommendations);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DomainRecommendationSearchParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DomainRecommendationSearchParameters if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DomainRecommendationSearchParameters.
     */
    public static DomainRecommendationSearchParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DomainRecommendationSearchParameters deserializedDomainRecommendationSearchParameters
                = new DomainRecommendationSearchParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keywords".equals(fieldName)) {
                    deserializedDomainRecommendationSearchParameters.keywords = reader.getString();
                } else if ("maxDomainRecommendations".equals(fieldName)) {
                    deserializedDomainRecommendationSearchParameters.maxDomainRecommendations
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDomainRecommendationSearchParameters;
        });
    }
}
