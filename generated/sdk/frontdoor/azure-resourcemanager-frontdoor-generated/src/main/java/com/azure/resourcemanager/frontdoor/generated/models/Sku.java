// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The pricing tier of the web application firewall policy.
 */
@Fluent
public final class Sku implements JsonSerializable<Sku> {
    /*
     * Name of the pricing tier.
     */
    private SkuName name;

    /**
     * Creates an instance of Sku class.
     */
    public Sku() {
    }

    /**
     * Get the name property: Name of the pricing tier.
     * 
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the pricing tier.
     * 
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
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
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Sku from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Sku if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Sku.
     */
    public static Sku fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Sku deserializedSku = new Sku();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSku.name = SkuName.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSku;
        });
    }
}
