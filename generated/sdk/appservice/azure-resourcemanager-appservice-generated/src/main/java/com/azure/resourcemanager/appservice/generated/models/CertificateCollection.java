// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateInner;
import java.io.IOException;
import java.util.List;

/**
 * Collection of certificates.
 */
@Fluent
public final class CertificateCollection implements JsonSerializable<CertificateCollection> {
    /*
     * Collection of resources.
     */
    private List<CertificateInner> value;

    /*
     * Link to next page of resources.
     */
    private String nextLink;

    /**
     * Creates an instance of CertificateCollection class.
     */
    public CertificateCollection() {
    }

    /**
     * Get the value property: Collection of resources.
     * 
     * @return the value value.
     */
    public List<CertificateInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     * 
     * @param value the value value to set.
     * @return the CertificateCollection object itself.
     */
    public CertificateCollection withValue(List<CertificateInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model CertificateCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CertificateCollection.class);

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
     * Reads an instance of CertificateCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateCollection if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CertificateCollection.
     */
    public static CertificateCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CertificateCollection deserializedCertificateCollection = new CertificateCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<CertificateInner> value = reader.readArray(reader1 -> CertificateInner.fromJson(reader1));
                    deserializedCertificateCollection.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedCertificateCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCertificateCollection;
        });
    }
}
