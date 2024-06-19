// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The PlayReady license.
 */
@Fluent
public final class ContentKeyPolicyPlayReadyLicense implements JsonSerializable<ContentKeyPolicyPlayReadyLicense> {
    /*
     * A flag indicating whether test devices can use the license.
     */
    private boolean allowTestDevices;

    /*
     * The security level.
     */
    private SecurityLevel securityLevel;

    /*
     * The begin date of license
     */
    private OffsetDateTime beginDate;

    /*
     * The expiration date of license.
     */
    private OffsetDateTime expirationDate;

    /*
     * The relative begin date of license.
     */
    private Duration relativeBeginDate;

    /*
     * The relative expiration date of license.
     */
    private Duration relativeExpirationDate;

    /*
     * The grace period of license.
     */
    private Duration gracePeriod;

    /*
     * The license PlayRight
     */
    private ContentKeyPolicyPlayReadyPlayRight playRight;

    /*
     * The license type.
     */
    private ContentKeyPolicyPlayReadyLicenseType licenseType;

    /*
     * The content key location.
     */
    private ContentKeyPolicyPlayReadyContentKeyLocation contentKeyLocation;

    /*
     * The PlayReady content type.
     */
    private ContentKeyPolicyPlayReadyContentType contentType;

    /**
     * Creates an instance of ContentKeyPolicyPlayReadyLicense class.
     */
    public ContentKeyPolicyPlayReadyLicense() {
    }

    /**
     * Get the allowTestDevices property: A flag indicating whether test devices can use the license.
     * 
     * @return the allowTestDevices value.
     */
    public boolean allowTestDevices() {
        return this.allowTestDevices;
    }

    /**
     * Set the allowTestDevices property: A flag indicating whether test devices can use the license.
     * 
     * @param allowTestDevices the allowTestDevices value to set.
     * @return the ContentKeyPolicyPlayReadyLicense object itself.
     */
    public ContentKeyPolicyPlayReadyLicense withAllowTestDevices(boolean allowTestDevices) {
        this.allowTestDevices = allowTestDevices;
        return this;
    }

    /**
     * Get the securityLevel property: The security level.
     * 
     * @return the securityLevel value.
     */
    public SecurityLevel securityLevel() {
        return this.securityLevel;
    }

    /**
     * Set the securityLevel property: The security level.
     * 
     * @param securityLevel the securityLevel value to set.
     * @return the ContentKeyPolicyPlayReadyLicense object itself.
     */
    public ContentKeyPolicyPlayReadyLicense withSecurityLevel(SecurityLevel securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }

    /**
     * Get the beginDate property: The begin date of license.
     * 
     * @return the beginDate value.
     */
    public OffsetDateTime beginDate() {
        return this.beginDate;
    }

    /**
     * Set the beginDate property: The begin date of license.
     * 
     * @param beginDate the beginDate value to set.
     * @return the ContentKeyPolicyPlayReadyLicense object itself.
     */
    public ContentKeyPolicyPlayReadyLicense withBeginDate(OffsetDateTime beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Get the expirationDate property: The expiration date of license.
     * 
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the expirationDate property: The expiration date of license.
     * 
     * @param expirationDate the expirationDate value to set.
     * @return the ContentKeyPolicyPlayReadyLicense object itself.
     */
    public ContentKeyPolicyPlayReadyLicense withExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get the relativeBeginDate property: The relative begin date of license.
     * 
     * @return the relativeBeginDate value.
     */
    public Duration relativeBeginDate() {
        return this.relativeBeginDate;
    }

    /**
     * Set the relativeBeginDate property: The relative begin date of license.
     * 
     * @param relativeBeginDate the relativeBeginDate value to set.
     * @return the ContentKeyPolicyPlayReadyLicense object itself.
     */
    public ContentKeyPolicyPlayReadyLicense withRelativeBeginDate(Duration relativeBeginDate) {
        this.relativeBeginDate = relativeBeginDate;
        return this;
    }

    /**
     * Get the relativeExpirationDate property: The relative expiration date of license.
     * 
     * @return the relativeExpirationDate value.
     */
    public Duration relativeExpirationDate() {
        return this.relativeExpirationDate;
    }

    /**
     * Set the relativeExpirationDate property: The relative expiration date of license.
     * 
     * @param relativeExpirationDate the relativeExpirationDate value to set.
     * @return the ContentKeyPolicyPlayReadyLicense object itself.
     */
    public ContentKeyPolicyPlayReadyLicense withRelativeExpirationDate(Duration relativeExpirationDate) {
        this.relativeExpirationDate = relativeExpirationDate;
        return this;
    }

    /**
     * Get the gracePeriod property: The grace period of license.
     * 
     * @return the gracePeriod value.
     */
    public Duration gracePeriod() {
        return this.gracePeriod;
    }

    /**
     * Set the gracePeriod property: The grace period of license.
     * 
     * @param gracePeriod the gracePeriod value to set.
     * @return the ContentKeyPolicyPlayReadyLicense object itself.
     */
    public ContentKeyPolicyPlayReadyLicense withGracePeriod(Duration gracePeriod) {
        this.gracePeriod = gracePeriod;
        return this;
    }

    /**
     * Get the playRight property: The license PlayRight.
     * 
     * @return the playRight value.
     */
    public ContentKeyPolicyPlayReadyPlayRight playRight() {
        return this.playRight;
    }

    /**
     * Set the playRight property: The license PlayRight.
     * 
     * @param playRight the playRight value to set.
     * @return the ContentKeyPolicyPlayReadyLicense object itself.
     */
    public ContentKeyPolicyPlayReadyLicense withPlayRight(ContentKeyPolicyPlayReadyPlayRight playRight) {
        this.playRight = playRight;
        return this;
    }

    /**
     * Get the licenseType property: The license type.
     * 
     * @return the licenseType value.
     */
    public ContentKeyPolicyPlayReadyLicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The license type.
     * 
     * @param licenseType the licenseType value to set.
     * @return the ContentKeyPolicyPlayReadyLicense object itself.
     */
    public ContentKeyPolicyPlayReadyLicense withLicenseType(ContentKeyPolicyPlayReadyLicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the contentKeyLocation property: The content key location.
     * 
     * @return the contentKeyLocation value.
     */
    public ContentKeyPolicyPlayReadyContentKeyLocation contentKeyLocation() {
        return this.contentKeyLocation;
    }

    /**
     * Set the contentKeyLocation property: The content key location.
     * 
     * @param contentKeyLocation the contentKeyLocation value to set.
     * @return the ContentKeyPolicyPlayReadyLicense object itself.
     */
    public ContentKeyPolicyPlayReadyLicense
        withContentKeyLocation(ContentKeyPolicyPlayReadyContentKeyLocation contentKeyLocation) {
        this.contentKeyLocation = contentKeyLocation;
        return this;
    }

    /**
     * Get the contentType property: The PlayReady content type.
     * 
     * @return the contentType value.
     */
    public ContentKeyPolicyPlayReadyContentType contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The PlayReady content type.
     * 
     * @param contentType the contentType value to set.
     * @return the ContentKeyPolicyPlayReadyLicense object itself.
     */
    public ContentKeyPolicyPlayReadyLicense withContentType(ContentKeyPolicyPlayReadyContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (playRight() != null) {
            playRight().validate();
        }
        if (licenseType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property licenseType in model ContentKeyPolicyPlayReadyLicense"));
        }
        if (contentKeyLocation() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property contentKeyLocation in model ContentKeyPolicyPlayReadyLicense"));
        } else {
            contentKeyLocation().validate();
        }
        if (contentType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property contentType in model ContentKeyPolicyPlayReadyLicense"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContentKeyPolicyPlayReadyLicense.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("allowTestDevices", this.allowTestDevices);
        jsonWriter.writeStringField("licenseType", this.licenseType == null ? null : this.licenseType.toString());
        jsonWriter.writeJsonField("contentKeyLocation", this.contentKeyLocation);
        jsonWriter.writeStringField("contentType", this.contentType == null ? null : this.contentType.toString());
        jsonWriter.writeStringField("securityLevel", this.securityLevel == null ? null : this.securityLevel.toString());
        jsonWriter.writeStringField("beginDate",
            this.beginDate == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.beginDate));
        jsonWriter.writeStringField("expirationDate",
            this.expirationDate == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expirationDate));
        jsonWriter.writeStringField("relativeBeginDate", CoreUtils.durationToStringWithDays(this.relativeBeginDate));
        jsonWriter.writeStringField("relativeExpirationDate",
            CoreUtils.durationToStringWithDays(this.relativeExpirationDate));
        jsonWriter.writeStringField("gracePeriod", CoreUtils.durationToStringWithDays(this.gracePeriod));
        jsonWriter.writeJsonField("playRight", this.playRight);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContentKeyPolicyPlayReadyLicense from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContentKeyPolicyPlayReadyLicense if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContentKeyPolicyPlayReadyLicense.
     */
    public static ContentKeyPolicyPlayReadyLicense fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContentKeyPolicyPlayReadyLicense deserializedContentKeyPolicyPlayReadyLicense
                = new ContentKeyPolicyPlayReadyLicense();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("allowTestDevices".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyLicense.allowTestDevices = reader.getBoolean();
                } else if ("licenseType".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyLicense.licenseType
                        = ContentKeyPolicyPlayReadyLicenseType.fromString(reader.getString());
                } else if ("contentKeyLocation".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyLicense.contentKeyLocation
                        = ContentKeyPolicyPlayReadyContentKeyLocation.fromJson(reader);
                } else if ("contentType".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyLicense.contentType
                        = ContentKeyPolicyPlayReadyContentType.fromString(reader.getString());
                } else if ("securityLevel".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyLicense.securityLevel
                        = SecurityLevel.fromString(reader.getString());
                } else if ("beginDate".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyLicense.beginDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("expirationDate".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyLicense.expirationDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("relativeBeginDate".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyLicense.relativeBeginDate
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("relativeExpirationDate".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyLicense.relativeExpirationDate
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("gracePeriod".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyLicense.gracePeriod
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("playRight".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyLicense.playRight
                        = ContentKeyPolicyPlayReadyPlayRight.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContentKeyPolicyPlayReadyLicense;
        });
    }
}
