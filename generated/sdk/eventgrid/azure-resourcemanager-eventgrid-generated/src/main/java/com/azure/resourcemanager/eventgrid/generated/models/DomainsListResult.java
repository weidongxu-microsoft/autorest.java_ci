// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.DomainInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of the List Domains operation.
 */
@Fluent
public final class DomainsListResult implements JsonSerializable<DomainsListResult> {
    /*
     * A collection of Domains.
     */
    private List<DomainInner> value;

    /*
     * A link for the next page of domains.
     */
    private String nextLink;

    /**
     * Creates an instance of DomainsListResult class.
     */
    public DomainsListResult() {
    }

    /**
     * Get the value property: A collection of Domains.
     * 
     * @return the value value.
     */
    public List<DomainInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of Domains.
     * 
     * @param value the value value to set.
     * @return the DomainsListResult object itself.
     */
    public DomainsListResult withValue(List<DomainInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of domains.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of domains.
     * 
     * @param nextLink the nextLink value to set.
     * @return the DomainsListResult object itself.
     */
    public DomainsListResult withNextLink(String nextLink) {
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
     * Reads an instance of DomainsListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DomainsListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DomainsListResult.
     */
    public static DomainsListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DomainsListResult deserializedDomainsListResult = new DomainsListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<DomainInner> value = reader.readArray(reader1 -> DomainInner.fromJson(reader1));
                    deserializedDomainsListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedDomainsListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDomainsListResult;
        });
    }
}
