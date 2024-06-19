// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.PublicCertificateLocation;
import java.io.IOException;

/**
 * PublicCertificate resource specific properties.
 */
@Fluent
public final class PublicCertificateProperties implements JsonSerializable<PublicCertificateProperties> {
    /*
     * Public Certificate byte array
     */
    private byte[] blob;

    /*
     * Public Certificate Location
     */
    private PublicCertificateLocation publicCertificateLocation;

    /*
     * Certificate Thumbprint
     */
    private String thumbprint;

    /**
     * Creates an instance of PublicCertificateProperties class.
     */
    public PublicCertificateProperties() {
    }

    /**
     * Get the blob property: Public Certificate byte array.
     * 
     * @return the blob value.
     */
    public byte[] blob() {
        return CoreUtils.clone(this.blob);
    }

    /**
     * Set the blob property: Public Certificate byte array.
     * 
     * @param blob the blob value to set.
     * @return the PublicCertificateProperties object itself.
     */
    public PublicCertificateProperties withBlob(byte[] blob) {
        this.blob = CoreUtils.clone(blob);
        return this;
    }

    /**
     * Get the publicCertificateLocation property: Public Certificate Location.
     * 
     * @return the publicCertificateLocation value.
     */
    public PublicCertificateLocation publicCertificateLocation() {
        return this.publicCertificateLocation;
    }

    /**
     * Set the publicCertificateLocation property: Public Certificate Location.
     * 
     * @param publicCertificateLocation the publicCertificateLocation value to set.
     * @return the PublicCertificateProperties object itself.
     */
    public PublicCertificateProperties
        withPublicCertificateLocation(PublicCertificateLocation publicCertificateLocation) {
        this.publicCertificateLocation = publicCertificateLocation;
        return this;
    }

    /**
     * Get the thumbprint property: Certificate Thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
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
        jsonWriter.writeBinaryField("blob", this.blob);
        jsonWriter.writeStringField("publicCertificateLocation",
            this.publicCertificateLocation == null ? null : this.publicCertificateLocation.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PublicCertificateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PublicCertificateProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PublicCertificateProperties.
     */
    public static PublicCertificateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PublicCertificateProperties deserializedPublicCertificateProperties = new PublicCertificateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("blob".equals(fieldName)) {
                    deserializedPublicCertificateProperties.blob = reader.getBinary();
                } else if ("publicCertificateLocation".equals(fieldName)) {
                    deserializedPublicCertificateProperties.publicCertificateLocation
                        = PublicCertificateLocation.fromString(reader.getString());
                } else if ("thumbprint".equals(fieldName)) {
                    deserializedPublicCertificateProperties.thumbprint = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPublicCertificateProperties;
        });
    }
}
