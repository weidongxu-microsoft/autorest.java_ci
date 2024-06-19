// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * The properties of the SavingsPlan.
 */
@Immutable
public final class SavingsPlan implements JsonSerializable<SavingsPlan> {
    /*
     * SavingsPlan term
     */
    private String term;

    /*
     * SavingsPlan Market Price
     */
    private BigDecimal marketPrice;

    /*
     * SavingsPlan Effective Price
     */
    private BigDecimal effectivePrice;

    /**
     * Creates an instance of SavingsPlan class.
     */
    public SavingsPlan() {
    }

    /**
     * Get the term property: SavingsPlan term.
     * 
     * @return the term value.
     */
    public String term() {
        return this.term;
    }

    /**
     * Get the marketPrice property: SavingsPlan Market Price.
     * 
     * @return the marketPrice value.
     */
    public BigDecimal marketPrice() {
        return this.marketPrice;
    }

    /**
     * Get the effectivePrice property: SavingsPlan Effective Price.
     * 
     * @return the effectivePrice value.
     */
    public BigDecimal effectivePrice() {
        return this.effectivePrice;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SavingsPlan from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SavingsPlan if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SavingsPlan.
     */
    public static SavingsPlan fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SavingsPlan deserializedSavingsPlan = new SavingsPlan();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("term".equals(fieldName)) {
                    deserializedSavingsPlan.term = reader.getString();
                } else if ("marketPrice".equals(fieldName)) {
                    deserializedSavingsPlan.marketPrice
                        = reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString()));
                } else if ("effectivePrice".equals(fieldName)) {
                    deserializedSavingsPlan.effectivePrice
                        = reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSavingsPlan;
        });
    }
}
