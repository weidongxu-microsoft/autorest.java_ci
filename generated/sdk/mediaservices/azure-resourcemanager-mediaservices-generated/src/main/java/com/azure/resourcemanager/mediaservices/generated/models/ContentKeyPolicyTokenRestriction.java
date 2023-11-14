// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents a token restriction. Provided token must match these requirements for successful license or key delivery.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyTokenRestriction")
@Fluent
public final class ContentKeyPolicyTokenRestriction extends ContentKeyPolicyRestriction {
    /*
     * The token issuer.
     */
    @JsonProperty(value = "issuer", required = true)
    private String issuer;

    /*
     * The audience for the token.
     */
    @JsonProperty(value = "audience", required = true)
    private String audience;

    /*
     * The primary verification key.
     */
    @JsonProperty(value = "primaryVerificationKey", required = true)
    private ContentKeyPolicyRestrictionTokenKey primaryVerificationKey;

    /*
     * A list of alternative verification keys.
     */
    @JsonProperty(value = "alternateVerificationKeys")
    private List<ContentKeyPolicyRestrictionTokenKey> alternateVerificationKeys;

    /*
     * A list of required token claims.
     */
    @JsonProperty(value = "requiredClaims")
    private List<ContentKeyPolicyTokenClaim> requiredClaims;

    /*
     * The type of token.
     */
    @JsonProperty(value = "restrictionTokenType", required = true)
    private ContentKeyPolicyRestrictionTokenType restrictionTokenType;

    /*
     * The OpenID connect discovery document.
     */
    @JsonProperty(value = "openIdConnectDiscoveryDocument")
    private String openIdConnectDiscoveryDocument;

    /**
     * Creates an instance of ContentKeyPolicyTokenRestriction class.
     */
    public ContentKeyPolicyTokenRestriction() {
    }

    /**
     * Get the issuer property: The token issuer.
     * 
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Set the issuer property: The token issuer.
     * 
     * @param issuer the issuer value to set.
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get the audience property: The audience for the token.
     * 
     * @return the audience value.
     */
    public String audience() {
        return this.audience;
    }

    /**
     * Set the audience property: The audience for the token.
     * 
     * @param audience the audience value to set.
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * Get the primaryVerificationKey property: The primary verification key.
     * 
     * @return the primaryVerificationKey value.
     */
    public ContentKeyPolicyRestrictionTokenKey primaryVerificationKey() {
        return this.primaryVerificationKey;
    }

    /**
     * Set the primaryVerificationKey property: The primary verification key.
     * 
     * @param primaryVerificationKey the primaryVerificationKey value to set.
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction
        withPrimaryVerificationKey(ContentKeyPolicyRestrictionTokenKey primaryVerificationKey) {
        this.primaryVerificationKey = primaryVerificationKey;
        return this;
    }

    /**
     * Get the alternateVerificationKeys property: A list of alternative verification keys.
     * 
     * @return the alternateVerificationKeys value.
     */
    public List<ContentKeyPolicyRestrictionTokenKey> alternateVerificationKeys() {
        return this.alternateVerificationKeys;
    }

    /**
     * Set the alternateVerificationKeys property: A list of alternative verification keys.
     * 
     * @param alternateVerificationKeys the alternateVerificationKeys value to set.
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction
        withAlternateVerificationKeys(List<ContentKeyPolicyRestrictionTokenKey> alternateVerificationKeys) {
        this.alternateVerificationKeys = alternateVerificationKeys;
        return this;
    }

    /**
     * Get the requiredClaims property: A list of required token claims.
     * 
     * @return the requiredClaims value.
     */
    public List<ContentKeyPolicyTokenClaim> requiredClaims() {
        return this.requiredClaims;
    }

    /**
     * Set the requiredClaims property: A list of required token claims.
     * 
     * @param requiredClaims the requiredClaims value to set.
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction withRequiredClaims(List<ContentKeyPolicyTokenClaim> requiredClaims) {
        this.requiredClaims = requiredClaims;
        return this;
    }

    /**
     * Get the restrictionTokenType property: The type of token.
     * 
     * @return the restrictionTokenType value.
     */
    public ContentKeyPolicyRestrictionTokenType restrictionTokenType() {
        return this.restrictionTokenType;
    }

    /**
     * Set the restrictionTokenType property: The type of token.
     * 
     * @param restrictionTokenType the restrictionTokenType value to set.
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction
        withRestrictionTokenType(ContentKeyPolicyRestrictionTokenType restrictionTokenType) {
        this.restrictionTokenType = restrictionTokenType;
        return this;
    }

    /**
     * Get the openIdConnectDiscoveryDocument property: The OpenID connect discovery document.
     * 
     * @return the openIdConnectDiscoveryDocument value.
     */
    public String openIdConnectDiscoveryDocument() {
        return this.openIdConnectDiscoveryDocument;
    }

    /**
     * Set the openIdConnectDiscoveryDocument property: The OpenID connect discovery document.
     * 
     * @param openIdConnectDiscoveryDocument the openIdConnectDiscoveryDocument value to set.
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction withOpenIdConnectDiscoveryDocument(String openIdConnectDiscoveryDocument) {
        this.openIdConnectDiscoveryDocument = openIdConnectDiscoveryDocument;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (issuer() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property issuer in model ContentKeyPolicyTokenRestriction"));
        }
        if (audience() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property audience in model ContentKeyPolicyTokenRestriction"));
        }
        if (primaryVerificationKey() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property primaryVerificationKey in model ContentKeyPolicyTokenRestriction"));
        } else {
            primaryVerificationKey().validate();
        }
        if (alternateVerificationKeys() != null) {
            alternateVerificationKeys().forEach(e -> e.validate());
        }
        if (requiredClaims() != null) {
            requiredClaims().forEach(e -> e.validate());
        }
        if (restrictionTokenType() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property restrictionTokenType in model ContentKeyPolicyTokenRestriction"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContentKeyPolicyTokenRestriction.class);
}
