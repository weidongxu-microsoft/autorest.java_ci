// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A TLSA record. For more information about the TLSA record format, see RFC 6698:
 * https://www.rfc-editor.org/rfc/rfc6698.
 */
@Fluent
public final class TlsaRecord implements JsonSerializable<TlsaRecord> {
    /*
     * The usage specifies the provided association that will be used to match the certificate presented in the TLS
     * handshake.
     */
    private Integer usage;

    /*
     * The selector specifies which part of the TLS certificate presented by the server will be matched against the
     * association data.
     */
    private Integer selector;

    /*
     * The matching type specifies how the certificate association is presented.
     */
    private Integer matchingType;

    /*
     * This specifies the certificate association data to be matched.
     */
    private String certAssociationData;

    /**
     * Creates an instance of TlsaRecord class.
     */
    public TlsaRecord() {
    }

    /**
     * Get the usage property: The usage specifies the provided association that will be used to match the certificate
     * presented in the TLS handshake.
     * 
     * @return the usage value.
     */
    public Integer usage() {
        return this.usage;
    }

    /**
     * Set the usage property: The usage specifies the provided association that will be used to match the certificate
     * presented in the TLS handshake.
     * 
     * @param usage the usage value to set.
     * @return the TlsaRecord object itself.
     */
    public TlsaRecord withUsage(Integer usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Get the selector property: The selector specifies which part of the TLS certificate presented by the server will
     * be matched against the association data.
     * 
     * @return the selector value.
     */
    public Integer selector() {
        return this.selector;
    }

    /**
     * Set the selector property: The selector specifies which part of the TLS certificate presented by the server will
     * be matched against the association data.
     * 
     * @param selector the selector value to set.
     * @return the TlsaRecord object itself.
     */
    public TlsaRecord withSelector(Integer selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Get the matchingType property: The matching type specifies how the certificate association is presented.
     * 
     * @return the matchingType value.
     */
    public Integer matchingType() {
        return this.matchingType;
    }

    /**
     * Set the matchingType property: The matching type specifies how the certificate association is presented.
     * 
     * @param matchingType the matchingType value to set.
     * @return the TlsaRecord object itself.
     */
    public TlsaRecord withMatchingType(Integer matchingType) {
        this.matchingType = matchingType;
        return this;
    }

    /**
     * Get the certAssociationData property: This specifies the certificate association data to be matched.
     * 
     * @return the certAssociationData value.
     */
    public String certAssociationData() {
        return this.certAssociationData;
    }

    /**
     * Set the certAssociationData property: This specifies the certificate association data to be matched.
     * 
     * @param certAssociationData the certAssociationData value to set.
     * @return the TlsaRecord object itself.
     */
    public TlsaRecord withCertAssociationData(String certAssociationData) {
        this.certAssociationData = certAssociationData;
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
        jsonWriter.writeNumberField("usage", this.usage);
        jsonWriter.writeNumberField("selector", this.selector);
        jsonWriter.writeNumberField("matchingType", this.matchingType);
        jsonWriter.writeStringField("certAssociationData", this.certAssociationData);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TlsaRecord from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TlsaRecord if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the TlsaRecord.
     */
    public static TlsaRecord fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TlsaRecord deserializedTlsaRecord = new TlsaRecord();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("usage".equals(fieldName)) {
                    deserializedTlsaRecord.usage = reader.getNullable(JsonReader::getInt);
                } else if ("selector".equals(fieldName)) {
                    deserializedTlsaRecord.selector = reader.getNullable(JsonReader::getInt);
                } else if ("matchingType".equals(fieldName)) {
                    deserializedTlsaRecord.matchingType = reader.getNullable(JsonReader::getInt);
                } else if ("certAssociationData".equals(fieldName)) {
                    deserializedTlsaRecord.certAssociationData = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTlsaRecord;
        });
    }
}
