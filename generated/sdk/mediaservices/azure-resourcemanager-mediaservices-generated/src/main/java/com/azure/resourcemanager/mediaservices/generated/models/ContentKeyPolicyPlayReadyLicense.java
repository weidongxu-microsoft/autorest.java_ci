// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** The PlayReady license. */
@Fluent
public final class ContentKeyPolicyPlayReadyLicense {
    /*
     * A flag indicating whether test devices can use the license.
     */
    @JsonProperty(value = "allowTestDevices", required = true)
    private boolean allowTestDevices;

    /*
     * The begin date of license
     */
    @JsonProperty(value = "beginDate")
    private OffsetDateTime beginDate;

    /*
     * The expiration date of license.
     */
    @JsonProperty(value = "expirationDate")
    private OffsetDateTime expirationDate;

    /*
     * The relative begin date of license.
     */
    @JsonProperty(value = "relativeBeginDate")
    private Duration relativeBeginDate;

    /*
     * The relative expiration date of license.
     */
    @JsonProperty(value = "relativeExpirationDate")
    private Duration relativeExpirationDate;

    /*
     * The grace period of license.
     */
    @JsonProperty(value = "gracePeriod")
    private Duration gracePeriod;

    /*
     * The license PlayRight
     */
    @JsonProperty(value = "playRight")
    private ContentKeyPolicyPlayReadyPlayRight playRight;

    /*
     * The license type.
     */
    @JsonProperty(value = "licenseType", required = true)
    private ContentKeyPolicyPlayReadyLicenseType licenseType;

    /*
     * The content key location.
     */
    @JsonProperty(value = "contentKeyLocation", required = true)
    private ContentKeyPolicyPlayReadyContentKeyLocation contentKeyLocation;

    /*
     * The PlayReady content type.
     */
    @JsonProperty(value = "contentType", required = true)
    private ContentKeyPolicyPlayReadyContentType contentType;

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
    public ContentKeyPolicyPlayReadyLicense withContentKeyLocation(
        ContentKeyPolicyPlayReadyContentKeyLocation contentKeyLocation) {
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
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property licenseType in model ContentKeyPolicyPlayReadyLicense"));
        }
        if (contentKeyLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property contentKeyLocation in model ContentKeyPolicyPlayReadyLicense"));
        } else {
            contentKeyLocation().validate();
        }
        if (contentType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property contentType in model ContentKeyPolicyPlayReadyLicense"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContentKeyPolicyPlayReadyLicense.class);
}
