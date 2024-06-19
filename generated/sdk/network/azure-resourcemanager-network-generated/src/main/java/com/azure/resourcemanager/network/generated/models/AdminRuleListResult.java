// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.BaseAdminRuleInner;
import java.io.IOException;
import java.util.List;

/**
 * security configuration admin rule list result.
 */
@Fluent
public final class AdminRuleListResult implements JsonSerializable<AdminRuleListResult> {
    /*
     * A list of admin rules
     */
    private List<BaseAdminRuleInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of AdminRuleListResult class.
     */
    public AdminRuleListResult() {
    }

    /**
     * Get the value property: A list of admin rules.
     * 
     * @return the value value.
     */
    public List<BaseAdminRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of admin rules.
     * 
     * @param value the value value to set.
     * @return the AdminRuleListResult object itself.
     */
    public AdminRuleListResult withValue(List<BaseAdminRuleInner> value) {
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
     * Set the nextLink property: The URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AdminRuleListResult object itself.
     */
    public AdminRuleListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AdminRuleListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AdminRuleListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AdminRuleListResult.
     */
    public static AdminRuleListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AdminRuleListResult deserializedAdminRuleListResult = new AdminRuleListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<BaseAdminRuleInner> value = reader.readArray(reader1 -> BaseAdminRuleInner.fromJson(reader1));
                    deserializedAdminRuleListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAdminRuleListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAdminRuleListResult;
        });
    }
}
