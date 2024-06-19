// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentInner;
import java.io.IOException;
import java.util.List;

/**
 * Describes the list of Application Insights Resources.
 */
@Fluent
public final class ApplicationInsightsComponentListResult
    implements JsonSerializable<ApplicationInsightsComponentListResult> {
    /*
     * List of Application Insights component definitions.
     */
    private List<ApplicationInsightsComponentInner> value;

    /*
     * The URI to get the next set of Application Insights component definitions if too many components where returned
     * in the result set.
     */
    private String nextLink;

    /**
     * Creates an instance of ApplicationInsightsComponentListResult class.
     */
    public ApplicationInsightsComponentListResult() {
    }

    /**
     * Get the value property: List of Application Insights component definitions.
     * 
     * @return the value value.
     */
    public List<ApplicationInsightsComponentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Application Insights component definitions.
     * 
     * @param value the value value to set.
     * @return the ApplicationInsightsComponentListResult object itself.
     */
    public ApplicationInsightsComponentListResult withValue(List<ApplicationInsightsComponentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to get the next set of Application Insights component definitions if too many
     * components where returned in the result set.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to get the next set of Application Insights component definitions if too many
     * components where returned in the result set.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ApplicationInsightsComponentListResult object itself.
     */
    public ApplicationInsightsComponentListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model ApplicationInsightsComponentListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationInsightsComponentListResult.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationInsightsComponentListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationInsightsComponentListResult if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApplicationInsightsComponentListResult.
     */
    public static ApplicationInsightsComponentListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationInsightsComponentListResult deserializedApplicationInsightsComponentListResult
                = new ApplicationInsightsComponentListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ApplicationInsightsComponentInner> value
                        = reader.readArray(reader1 -> ApplicationInsightsComponentInner.fromJson(reader1));
                    deserializedApplicationInsightsComponentListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedApplicationInsightsComponentListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationInsightsComponentListResult;
        });
    }
}
