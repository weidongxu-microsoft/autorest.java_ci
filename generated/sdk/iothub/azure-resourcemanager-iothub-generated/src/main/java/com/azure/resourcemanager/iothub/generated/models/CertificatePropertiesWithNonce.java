// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The description of an X509 CA Certificate including the challenge nonce issued for the Proof-Of-Possession flow.
 */
@Immutable
public final class CertificatePropertiesWithNonce implements JsonSerializable<CertificatePropertiesWithNonce> {
    /*
     * The certificate's subject name.
     */
    private String subject;

    /*
     * The certificate's expiration date and time.
     */
    private DateTimeRfc1123 expiry;

    /*
     * The certificate's thumbprint.
     */
    private String thumbprint;

    /*
     * Determines whether certificate has been verified.
     */
    private Boolean isVerified;

    /*
     * The certificate's create date and time.
     */
    private DateTimeRfc1123 created;

    /*
     * The certificate's last update date and time.
     */
    private DateTimeRfc1123 updated;

    /*
     * The certificate's verification code that will be used for proof of possession.
     */
    private String verificationCode;

    /*
     * The certificate content
     */
    private String certificate;

    /**
     * Creates an instance of CertificatePropertiesWithNonce class.
     */
    public CertificatePropertiesWithNonce() {
    }

    /**
     * Get the subject property: The certificate's subject name.
     * 
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Get the expiry property: The certificate's expiration date and time.
     * 
     * @return the expiry value.
     */
    public OffsetDateTime expiry() {
        if (this.expiry == null) {
            return null;
        }
        return this.expiry.getDateTime();
    }

    /**
     * Get the thumbprint property: The certificate's thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the isVerified property: Determines whether certificate has been verified.
     * 
     * @return the isVerified value.
     */
    public Boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Get the created property: The certificate's create date and time.
     * 
     * @return the created value.
     */
    public OffsetDateTime created() {
        if (this.created == null) {
            return null;
        }
        return this.created.getDateTime();
    }

    /**
     * Get the updated property: The certificate's last update date and time.
     * 
     * @return the updated value.
     */
    public OffsetDateTime updated() {
        if (this.updated == null) {
            return null;
        }
        return this.updated.getDateTime();
    }

    /**
     * Get the verificationCode property: The certificate's verification code that will be used for proof of possession.
     * 
     * @return the verificationCode value.
     */
    public String verificationCode() {
        return this.verificationCode;
    }

    /**
     * Get the certificate property: The certificate content.
     * 
     * @return the certificate value.
     */
    public String certificate() {
        return this.certificate;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CertificatePropertiesWithNonce from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificatePropertiesWithNonce if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CertificatePropertiesWithNonce.
     */
    public static CertificatePropertiesWithNonce fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CertificatePropertiesWithNonce deserializedCertificatePropertiesWithNonce
                = new CertificatePropertiesWithNonce();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("subject".equals(fieldName)) {
                    deserializedCertificatePropertiesWithNonce.subject = reader.getString();
                } else if ("expiry".equals(fieldName)) {
                    deserializedCertificatePropertiesWithNonce.expiry
                        = reader.getNullable(nonNullReader -> new DateTimeRfc1123(nonNullReader.getString()));
                } else if ("thumbprint".equals(fieldName)) {
                    deserializedCertificatePropertiesWithNonce.thumbprint = reader.getString();
                } else if ("isVerified".equals(fieldName)) {
                    deserializedCertificatePropertiesWithNonce.isVerified = reader.getNullable(JsonReader::getBoolean);
                } else if ("created".equals(fieldName)) {
                    deserializedCertificatePropertiesWithNonce.created
                        = reader.getNullable(nonNullReader -> new DateTimeRfc1123(nonNullReader.getString()));
                } else if ("updated".equals(fieldName)) {
                    deserializedCertificatePropertiesWithNonce.updated
                        = reader.getNullable(nonNullReader -> new DateTimeRfc1123(nonNullReader.getString()));
                } else if ("verificationCode".equals(fieldName)) {
                    deserializedCertificatePropertiesWithNonce.verificationCode = reader.getString();
                } else if ("certificate".equals(fieldName)) {
                    deserializedCertificatePropertiesWithNonce.certificate = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCertificatePropertiesWithNonce;
        });
    }
}
