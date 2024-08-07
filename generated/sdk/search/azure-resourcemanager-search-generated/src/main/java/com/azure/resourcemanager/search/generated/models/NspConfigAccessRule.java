// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An access rule for a network security perimeter configuration.
 */
@Fluent
public final class NspConfigAccessRule implements JsonSerializable<NspConfigAccessRule> {
    /*
     * The name property.
     */
    private String name;

    /*
     * The properties for the access rules in a network security perimeter configuration.
     */
    private NspConfigAccessRuleProperties properties;

    /**
     * Creates an instance of NspConfigAccessRule class.
     */
    public NspConfigAccessRule() {
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the NspConfigAccessRule object itself.
     */
    public NspConfigAccessRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: The properties for the access rules in a network security perimeter configuration.
     * 
     * @return the properties value.
     */
    public NspConfigAccessRuleProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties for the access rules in a network security perimeter configuration.
     * 
     * @param properties the properties value to set.
     * @return the NspConfigAccessRule object itself.
     */
    public NspConfigAccessRule withProperties(NspConfigAccessRuleProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NspConfigAccessRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NspConfigAccessRule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NspConfigAccessRule.
     */
    public static NspConfigAccessRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NspConfigAccessRule deserializedNspConfigAccessRule = new NspConfigAccessRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedNspConfigAccessRule.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedNspConfigAccessRule.properties = NspConfigAccessRuleProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNspConfigAccessRule;
        });
    }
}
