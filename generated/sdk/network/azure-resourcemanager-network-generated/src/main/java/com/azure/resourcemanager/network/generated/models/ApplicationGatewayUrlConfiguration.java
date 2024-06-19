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

/**
 * Url configuration of the Actions set in Application Gateway.
 */
@Fluent
public final class ApplicationGatewayUrlConfiguration implements JsonSerializable<ApplicationGatewayUrlConfiguration> {
    /*
     * Url path which user has provided for url rewrite. Null means no path will be updated. Default value is null.
     */
    private String modifiedPath;

    /*
     * Query string which user has provided for url rewrite. Null means no query string will be updated. Default value
     * is null.
     */
    private String modifiedQueryString;

    /*
     * If set as true, it will re-evaluate the url path map provided in path based request routing rules using modified
     * path. Default value is false.
     */
    private Boolean reroute;

    /**
     * Creates an instance of ApplicationGatewayUrlConfiguration class.
     */
    public ApplicationGatewayUrlConfiguration() {
    }

    /**
     * Get the modifiedPath property: Url path which user has provided for url rewrite. Null means no path will be
     * updated. Default value is null.
     * 
     * @return the modifiedPath value.
     */
    public String modifiedPath() {
        return this.modifiedPath;
    }

    /**
     * Set the modifiedPath property: Url path which user has provided for url rewrite. Null means no path will be
     * updated. Default value is null.
     * 
     * @param modifiedPath the modifiedPath value to set.
     * @return the ApplicationGatewayUrlConfiguration object itself.
     */
    public ApplicationGatewayUrlConfiguration withModifiedPath(String modifiedPath) {
        this.modifiedPath = modifiedPath;
        return this;
    }

    /**
     * Get the modifiedQueryString property: Query string which user has provided for url rewrite. Null means no query
     * string will be updated. Default value is null.
     * 
     * @return the modifiedQueryString value.
     */
    public String modifiedQueryString() {
        return this.modifiedQueryString;
    }

    /**
     * Set the modifiedQueryString property: Query string which user has provided for url rewrite. Null means no query
     * string will be updated. Default value is null.
     * 
     * @param modifiedQueryString the modifiedQueryString value to set.
     * @return the ApplicationGatewayUrlConfiguration object itself.
     */
    public ApplicationGatewayUrlConfiguration withModifiedQueryString(String modifiedQueryString) {
        this.modifiedQueryString = modifiedQueryString;
        return this;
    }

    /**
     * Get the reroute property: If set as true, it will re-evaluate the url path map provided in path based request
     * routing rules using modified path. Default value is false.
     * 
     * @return the reroute value.
     */
    public Boolean reroute() {
        return this.reroute;
    }

    /**
     * Set the reroute property: If set as true, it will re-evaluate the url path map provided in path based request
     * routing rules using modified path. Default value is false.
     * 
     * @param reroute the reroute value to set.
     * @return the ApplicationGatewayUrlConfiguration object itself.
     */
    public ApplicationGatewayUrlConfiguration withReroute(Boolean reroute) {
        this.reroute = reroute;
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
        jsonWriter.writeStringField("modifiedPath", this.modifiedPath);
        jsonWriter.writeStringField("modifiedQueryString", this.modifiedQueryString);
        jsonWriter.writeBooleanField("reroute", this.reroute);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayUrlConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayUrlConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewayUrlConfiguration.
     */
    public static ApplicationGatewayUrlConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayUrlConfiguration deserializedApplicationGatewayUrlConfiguration
                = new ApplicationGatewayUrlConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("modifiedPath".equals(fieldName)) {
                    deserializedApplicationGatewayUrlConfiguration.modifiedPath = reader.getString();
                } else if ("modifiedQueryString".equals(fieldName)) {
                    deserializedApplicationGatewayUrlConfiguration.modifiedQueryString = reader.getString();
                } else if ("reroute".equals(fieldName)) {
                    deserializedApplicationGatewayUrlConfiguration.reroute = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayUrlConfiguration;
        });
    }
}
