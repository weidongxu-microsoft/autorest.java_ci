// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.keyvault.generated.models.MhsmPrivateLinkResource;
import java.io.IOException;
import java.util.List;

/**
 * A list of private link resources.
 */
@Fluent
public final class MhsmPrivateLinkResourceListResultInner
    implements JsonSerializable<MhsmPrivateLinkResourceListResultInner> {
    /*
     * Array of private link resources
     */
    private List<MhsmPrivateLinkResource> value;

    /**
     * Creates an instance of MhsmPrivateLinkResourceListResultInner class.
     */
    public MhsmPrivateLinkResourceListResultInner() {
    }

    /**
     * Get the value property: Array of private link resources.
     * 
     * @return the value value.
     */
    public List<MhsmPrivateLinkResource> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of private link resources.
     * 
     * @param value the value value to set.
     * @return the MhsmPrivateLinkResourceListResultInner object itself.
     */
    public MhsmPrivateLinkResourceListResultInner withValue(List<MhsmPrivateLinkResource> value) {
        this.value = value;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MhsmPrivateLinkResourceListResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MhsmPrivateLinkResourceListResultInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MhsmPrivateLinkResourceListResultInner.
     */
    public static MhsmPrivateLinkResourceListResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MhsmPrivateLinkResourceListResultInner deserializedMhsmPrivateLinkResourceListResultInner
                = new MhsmPrivateLinkResourceListResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<MhsmPrivateLinkResource> value
                        = reader.readArray(reader1 -> MhsmPrivateLinkResource.fromJson(reader1));
                    deserializedMhsmPrivateLinkResourceListResultInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMhsmPrivateLinkResourceListResultInner;
        });
    }
}
