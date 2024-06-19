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
 * Parameters for an Action.
 */
@Fluent
public final class Parameter implements JsonSerializable<Parameter> {
    /*
     * List of route prefixes.
     */
    private List<String> routePrefix;

    /*
     * List of BGP communities.
     */
    private List<String> community;

    /*
     * List of AS paths.
     */
    private List<String> asPath;

    /**
     * Creates an instance of Parameter class.
     */
    public Parameter() {
    }

    /**
     * Get the routePrefix property: List of route prefixes.
     * 
     * @return the routePrefix value.
     */
    public List<String> routePrefix() {
        return this.routePrefix;
    }

    /**
     * Set the routePrefix property: List of route prefixes.
     * 
     * @param routePrefix the routePrefix value to set.
     * @return the Parameter object itself.
     */
    public Parameter withRoutePrefix(List<String> routePrefix) {
        this.routePrefix = routePrefix;
        return this;
    }

    /**
     * Get the community property: List of BGP communities.
     * 
     * @return the community value.
     */
    public List<String> community() {
        return this.community;
    }

    /**
     * Set the community property: List of BGP communities.
     * 
     * @param community the community value to set.
     * @return the Parameter object itself.
     */
    public Parameter withCommunity(List<String> community) {
        this.community = community;
        return this;
    }

    /**
     * Get the asPath property: List of AS paths.
     * 
     * @return the asPath value.
     */
    public List<String> asPath() {
        return this.asPath;
    }

    /**
     * Set the asPath property: List of AS paths.
     * 
     * @param asPath the asPath value to set.
     * @return the Parameter object itself.
     */
    public Parameter withAsPath(List<String> asPath) {
        this.asPath = asPath;
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
        jsonWriter.writeArrayField("routePrefix", this.routePrefix, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("community", this.community, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("asPath", this.asPath, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Parameter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Parameter if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Parameter.
     */
    public static Parameter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Parameter deserializedParameter = new Parameter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("routePrefix".equals(fieldName)) {
                    List<String> routePrefix = reader.readArray(reader1 -> reader1.getString());
                    deserializedParameter.routePrefix = routePrefix;
                } else if ("community".equals(fieldName)) {
                    List<String> community = reader.readArray(reader1 -> reader1.getString());
                    deserializedParameter.community = community;
                } else if ("asPath".equals(fieldName)) {
                    List<String> asPath = reader.readArray(reader1 -> reader1.getString());
                    deserializedParameter.asPath = asPath;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedParameter;
        });
    }
}
