// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Information about the partner.
 */
@Fluent
public final class Partner {
    /*
     * The immutableId of the corresponding partner registration.
     */
    @JsonProperty(value = "partnerRegistrationImmutableId")
    private UUID partnerRegistrationImmutableId;

    /*
     * The partner name.
     */
    @JsonProperty(value = "partnerName")
    private String partnerName;

    /*
     * Expiration time of the partner authorization. If this timer expires, any request from this partner to create,
     * update or delete resources in subscriber's
     * context will fail. If specified, the allowed values are between 1 to the value of
     * defaultMaximumExpirationTimeInDays specified in PartnerConfiguration.
     * If not specified, the default value will be the value of defaultMaximumExpirationTimeInDays specified in
     * PartnerConfiguration or 7 if this value is not specified.
     */
    @JsonProperty(value = "authorizationExpirationTimeInUtc")
    private OffsetDateTime authorizationExpirationTimeInUtc;

    /**
     * Creates an instance of Partner class.
     */
    public Partner() {
    }

    /**
     * Get the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     * 
     * @return the partnerRegistrationImmutableId value.
     */
    public UUID partnerRegistrationImmutableId() {
        return this.partnerRegistrationImmutableId;
    }

    /**
     * Set the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     * 
     * @param partnerRegistrationImmutableId the partnerRegistrationImmutableId value to set.
     * @return the Partner object itself.
     */
    public Partner withPartnerRegistrationImmutableId(UUID partnerRegistrationImmutableId) {
        this.partnerRegistrationImmutableId = partnerRegistrationImmutableId;
        return this;
    }

    /**
     * Get the partnerName property: The partner name.
     * 
     * @return the partnerName value.
     */
    public String partnerName() {
        return this.partnerName;
    }

    /**
     * Set the partnerName property: The partner name.
     * 
     * @param partnerName the partnerName value to set.
     * @return the Partner object itself.
     */
    public Partner withPartnerName(String partnerName) {
        this.partnerName = partnerName;
        return this;
    }

    /**
     * Get the authorizationExpirationTimeInUtc property: Expiration time of the partner authorization. If this timer
     * expires, any request from this partner to create, update or delete resources in subscriber's
     * context will fail. If specified, the allowed values are between 1 to the value of
     * defaultMaximumExpirationTimeInDays specified in PartnerConfiguration.
     * If not specified, the default value will be the value of defaultMaximumExpirationTimeInDays specified in
     * PartnerConfiguration or 7 if this value is not specified.
     * 
     * @return the authorizationExpirationTimeInUtc value.
     */
    public OffsetDateTime authorizationExpirationTimeInUtc() {
        return this.authorizationExpirationTimeInUtc;
    }

    /**
     * Set the authorizationExpirationTimeInUtc property: Expiration time of the partner authorization. If this timer
     * expires, any request from this partner to create, update or delete resources in subscriber's
     * context will fail. If specified, the allowed values are between 1 to the value of
     * defaultMaximumExpirationTimeInDays specified in PartnerConfiguration.
     * If not specified, the default value will be the value of defaultMaximumExpirationTimeInDays specified in
     * PartnerConfiguration or 7 if this value is not specified.
     * 
     * @param authorizationExpirationTimeInUtc the authorizationExpirationTimeInUtc value to set.
     * @return the Partner object itself.
     */
    public Partner withAuthorizationExpirationTimeInUtc(OffsetDateTime authorizationExpirationTimeInUtc) {
        this.authorizationExpirationTimeInUtc = authorizationExpirationTimeInUtc;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
