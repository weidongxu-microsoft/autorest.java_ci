// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Dimensions or Tags to filter a budget by.
 */
@Fluent
public final class BudgetFilterProperties implements JsonSerializable<BudgetFilterProperties> {
    /*
     * Has comparison expression for a dimension
     */
    private BudgetComparisonExpression dimensions;

    /*
     * Has comparison expression for a tag
     */
    private BudgetComparisonExpression tags;

    /**
     * Creates an instance of BudgetFilterProperties class.
     */
    public BudgetFilterProperties() {
    }

    /**
     * Get the dimensions property: Has comparison expression for a dimension.
     * 
     * @return the dimensions value.
     */
    public BudgetComparisonExpression dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: Has comparison expression for a dimension.
     * 
     * @param dimensions the dimensions value to set.
     * @return the BudgetFilterProperties object itself.
     */
    public BudgetFilterProperties withDimensions(BudgetComparisonExpression dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the tags property: Has comparison expression for a tag.
     * 
     * @return the tags value.
     */
    public BudgetComparisonExpression tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Has comparison expression for a tag.
     * 
     * @param tags the tags value to set.
     * @return the BudgetFilterProperties object itself.
     */
    public BudgetFilterProperties withTags(BudgetComparisonExpression tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dimensions() != null) {
            dimensions().validate();
        }
        if (tags() != null) {
            tags().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("dimensions", this.dimensions);
        jsonWriter.writeJsonField("tags", this.tags);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BudgetFilterProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BudgetFilterProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BudgetFilterProperties.
     */
    public static BudgetFilterProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BudgetFilterProperties deserializedBudgetFilterProperties = new BudgetFilterProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dimensions".equals(fieldName)) {
                    deserializedBudgetFilterProperties.dimensions = BudgetComparisonExpression.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    deserializedBudgetFilterProperties.tags = BudgetComparisonExpression.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBudgetFilterProperties;
        });
    }
}
