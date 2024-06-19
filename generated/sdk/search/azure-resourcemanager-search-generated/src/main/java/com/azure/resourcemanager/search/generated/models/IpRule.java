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
 * The IP restriction rule of the Azure AI Search service.
 */
@Fluent
public final class IpRule implements JsonSerializable<IpRule> {
    /*
     * Value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP range in CIDR format (eg., 123.1.2.3/24)
     * to be allowed.
     */
    private String value;

    /**
     * Creates an instance of IpRule class.
     */
    public IpRule() {
    }

    /**
     * Get the value property: Value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP range in CIDR
     * format (eg., 123.1.2.3/24) to be allowed.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP range in CIDR
     * format (eg., 123.1.2.3/24) to be allowed.
     * 
     * @param value the value value to set.
     * @return the IpRule object itself.
     */
    public IpRule withValue(String value) {
        this.value = value;
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
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpRule if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the IpRule.
     */
    public static IpRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpRule deserializedIpRule = new IpRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedIpRule.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpRule;
        });
    }
}
