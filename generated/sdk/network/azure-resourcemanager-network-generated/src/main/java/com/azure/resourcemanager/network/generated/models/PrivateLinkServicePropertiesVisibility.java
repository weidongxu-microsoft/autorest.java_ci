// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The visibility list of the private link service.
 */
@Fluent
public final class PrivateLinkServicePropertiesVisibility extends ResourceSet {
    /**
     * Creates an instance of PrivateLinkServicePropertiesVisibility class.
     */
    public PrivateLinkServicePropertiesVisibility() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrivateLinkServicePropertiesVisibility withSubscriptions(List<String> subscriptions) {
        super.withSubscriptions(subscriptions);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("subscriptions", subscriptions(), (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkServicePropertiesVisibility from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkServicePropertiesVisibility if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkServicePropertiesVisibility.
     */
    public static PrivateLinkServicePropertiesVisibility fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkServicePropertiesVisibility deserializedPrivateLinkServicePropertiesVisibility
                = new PrivateLinkServicePropertiesVisibility();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("subscriptions".equals(fieldName)) {
                    List<String> subscriptions = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrivateLinkServicePropertiesVisibility.withSubscriptions(subscriptions);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkServicePropertiesVisibility;
        });
    }
}
