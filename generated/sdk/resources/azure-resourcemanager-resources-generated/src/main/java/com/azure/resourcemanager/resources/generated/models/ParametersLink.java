// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Entity representing the reference to the deployment parameters.
 */
@Fluent
public final class ParametersLink implements JsonSerializable<ParametersLink> {
    /*
     * The URI of the parameters file.
     */
    private String uri;

    /*
     * If included, must match the ContentVersion in the template.
     */
    private String contentVersion;

    /**
     * Creates an instance of ParametersLink class.
     */
    public ParametersLink() {
    }

    /**
     * Get the uri property: The URI of the parameters file.
     * 
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI of the parameters file.
     * 
     * @param uri the uri value to set.
     * @return the ParametersLink object itself.
     */
    public ParametersLink withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the contentVersion property: If included, must match the ContentVersion in the template.
     * 
     * @return the contentVersion value.
     */
    public String contentVersion() {
        return this.contentVersion;
    }

    /**
     * Set the contentVersion property: If included, must match the ContentVersion in the template.
     * 
     * @param contentVersion the contentVersion value to set.
     * @return the ParametersLink object itself.
     */
    public ParametersLink withContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (uri() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property uri in model ParametersLink"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ParametersLink.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("uri", this.uri);
        jsonWriter.writeStringField("contentVersion", this.contentVersion);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ParametersLink from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ParametersLink if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ParametersLink.
     */
    public static ParametersLink fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ParametersLink deserializedParametersLink = new ParametersLink();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("uri".equals(fieldName)) {
                    deserializedParametersLink.uri = reader.getString();
                } else if ("contentVersion".equals(fieldName)) {
                    deserializedParametersLink.contentVersion = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedParametersLink;
        });
    }
}
