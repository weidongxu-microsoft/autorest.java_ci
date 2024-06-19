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
 * The BalancePropertiesNewPurchasesDetailsItem model.
 */
@Immutable
public final class BalancePropertiesNewPurchasesDetailsItem
    implements JsonSerializable<BalancePropertiesNewPurchasesDetailsItem> {
    /*
     * the name of new purchase.
     */
    private String name;

    /*
     * the value of new purchase.
     */
    private BigDecimal value;

    /**
     * Creates an instance of BalancePropertiesNewPurchasesDetailsItem class.
     */
    public BalancePropertiesNewPurchasesDetailsItem() {
    }

    /**
     * Get the name property: the name of new purchase.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value property: the value of new purchase.
     * 
     * @return the value value.
     */
    public BigDecimal value() {
        return this.value;
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
     * Reads an instance of BalancePropertiesNewPurchasesDetailsItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BalancePropertiesNewPurchasesDetailsItem if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BalancePropertiesNewPurchasesDetailsItem.
     */
    public static BalancePropertiesNewPurchasesDetailsItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BalancePropertiesNewPurchasesDetailsItem deserializedBalancePropertiesNewPurchasesDetailsItem
                = new BalancePropertiesNewPurchasesDetailsItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedBalancePropertiesNewPurchasesDetailsItem.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedBalancePropertiesNewPurchasesDetailsItem.value
                        = reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBalancePropertiesNewPurchasesDetailsItem;
        });
    }
}
