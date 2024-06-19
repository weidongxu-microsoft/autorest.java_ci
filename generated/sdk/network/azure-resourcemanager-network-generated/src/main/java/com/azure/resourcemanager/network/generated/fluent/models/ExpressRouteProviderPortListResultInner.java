// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListExpressRouteProviderPort API service call.
 */
@Fluent
public final class ExpressRouteProviderPortListResultInner
    implements JsonSerializable<ExpressRouteProviderPortListResultInner> {
    /*
     * A list of ExpressRouteProviderPort resources.
     */
    private List<ExpressRouteProviderPortInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ExpressRouteProviderPortListResultInner class.
     */
    public ExpressRouteProviderPortListResultInner() {
    }

    /**
     * Get the value property: A list of ExpressRouteProviderPort resources.
     * 
     * @return the value value.
     */
    public List<ExpressRouteProviderPortInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of ExpressRouteProviderPort resources.
     * 
     * @param value the value value to set.
     * @return the ExpressRouteProviderPortListResultInner object itself.
     */
    public ExpressRouteProviderPortListResultInner withValue(List<ExpressRouteProviderPortInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpressRouteProviderPortListResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteProviderPortListResultInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExpressRouteProviderPortListResultInner.
     */
    public static ExpressRouteProviderPortListResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteProviderPortListResultInner deserializedExpressRouteProviderPortListResultInner
                = new ExpressRouteProviderPortListResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ExpressRouteProviderPortInner> value
                        = reader.readArray(reader1 -> ExpressRouteProviderPortInner.fromJson(reader1));
                    deserializedExpressRouteProviderPortListResultInner.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedExpressRouteProviderPortListResultInner.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteProviderPortListResultInner;
        });
    }
}
