// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The type of the pattern for an alias path.
 */
@Fluent
public final class AliasPattern implements JsonSerializable<AliasPattern> {
    /*
     * The alias pattern phrase.
     */
    private String phrase;

    /*
     * The alias pattern variable.
     */
    private String variable;

    /*
     * The type of alias pattern
     */
    private AliasPatternType type;

    /**
     * Creates an instance of AliasPattern class.
     */
    public AliasPattern() {
    }

    /**
     * Get the phrase property: The alias pattern phrase.
     * 
     * @return the phrase value.
     */
    public String phrase() {
        return this.phrase;
    }

    /**
     * Set the phrase property: The alias pattern phrase.
     * 
     * @param phrase the phrase value to set.
     * @return the AliasPattern object itself.
     */
    public AliasPattern withPhrase(String phrase) {
        this.phrase = phrase;
        return this;
    }

    /**
     * Get the variable property: The alias pattern variable.
     * 
     * @return the variable value.
     */
    public String variable() {
        return this.variable;
    }

    /**
     * Set the variable property: The alias pattern variable.
     * 
     * @param variable the variable value to set.
     * @return the AliasPattern object itself.
     */
    public AliasPattern withVariable(String variable) {
        this.variable = variable;
        return this;
    }

    /**
     * Get the type property: The type of alias pattern.
     * 
     * @return the type value.
     */
    public AliasPatternType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of alias pattern.
     * 
     * @param type the type value to set.
     * @return the AliasPattern object itself.
     */
    public AliasPattern withType(AliasPatternType type) {
        this.type = type;
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
        jsonWriter.writeStringField("phrase", this.phrase);
        jsonWriter.writeStringField("variable", this.variable);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AliasPattern from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AliasPattern if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AliasPattern.
     */
    public static AliasPattern fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AliasPattern deserializedAliasPattern = new AliasPattern();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("phrase".equals(fieldName)) {
                    deserializedAliasPattern.phrase = reader.getString();
                } else if ("variable".equals(fieldName)) {
                    deserializedAliasPattern.variable = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAliasPattern.type = AliasPatternType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAliasPattern;
        });
    }
}
