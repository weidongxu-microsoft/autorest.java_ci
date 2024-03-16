// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Base class for Content Key Policy key for token validation. A derived class must be used to create a token key.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "@odata.type",
    defaultImpl = ContentKeyPolicyRestrictionTokenKey.class,
    visible = true)
@JsonTypeName("ContentKeyPolicyRestrictionTokenKey")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.ContentKeyPolicySymmetricTokenKey",
        value = ContentKeyPolicySymmetricTokenKey.class),
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.ContentKeyPolicyRsaTokenKey",
        value = ContentKeyPolicyRsaTokenKey.class),
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.ContentKeyPolicyX509CertificateTokenKey",
        value = ContentKeyPolicyX509CertificateTokenKey.class) })
@Immutable
public class ContentKeyPolicyRestrictionTokenKey {
    /*
     * The discriminator for derived types.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType;

    /**
     * Creates an instance of ContentKeyPolicyRestrictionTokenKey class.
     */
    public ContentKeyPolicyRestrictionTokenKey() {
        this.odataType = "ContentKeyPolicyRestrictionTokenKey";
    }

    /**
     * Get the odataType property: The discriminator for derived types.
     * 
     * @return the odataType value.
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * Set the odataType property: The discriminator for derived types.
     * 
     * @param odataType the odataType value to set.
     * @return the ContentKeyPolicyRestrictionTokenKey object itself.
     */
    protected ContentKeyPolicyRestrictionTokenKey withOdataType(String odataType) {
        this.odataType = odataType;
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
