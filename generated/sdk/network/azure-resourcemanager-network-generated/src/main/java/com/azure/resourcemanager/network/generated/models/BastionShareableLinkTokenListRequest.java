// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Post request for Delete Bastion Shareable Link By Token endpoint.
 */
@Fluent
public final class BastionShareableLinkTokenListRequest
    implements JsonSerializable<BastionShareableLinkTokenListRequest> {
    /*
     * List of Bastion Shareable Link Token.
     */
    private List<String> tokens;

    /**
     * Creates an instance of BastionShareableLinkTokenListRequest class.
     */
    public BastionShareableLinkTokenListRequest() {
    }

    /**
     * Get the tokens property: List of Bastion Shareable Link Token.
     * 
     * @return the tokens value.
     */
    public List<String> tokens() {
        return this.tokens;
    }

    /**
     * Set the tokens property: List of Bastion Shareable Link Token.
     * 
     * @param tokens the tokens value to set.
     * @return the BastionShareableLinkTokenListRequest object itself.
     */
    public BastionShareableLinkTokenListRequest withTokens(List<String> tokens) {
        this.tokens = tokens;
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
        jsonWriter.writeArrayField("tokens", this.tokens, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BastionShareableLinkTokenListRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BastionShareableLinkTokenListRequest if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BastionShareableLinkTokenListRequest.
     */
    public static BastionShareableLinkTokenListRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BastionShareableLinkTokenListRequest deserializedBastionShareableLinkTokenListRequest
                = new BastionShareableLinkTokenListRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tokens".equals(fieldName)) {
                    List<String> tokens = reader.readArray(reader1 -> reader1.getString());
                    deserializedBastionShareableLinkTokenListRequest.tokens = tokens;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBastionShareableLinkTokenListRequest;
        });
    }
}
