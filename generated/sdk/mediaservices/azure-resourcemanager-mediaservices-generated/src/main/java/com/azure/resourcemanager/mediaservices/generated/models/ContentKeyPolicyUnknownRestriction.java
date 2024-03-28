// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a ContentKeyPolicyRestriction that is unavailable in the current API version.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "@odata.type",
    defaultImpl = ContentKeyPolicyUnknownRestriction.class,
    visible = true)
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyUnknownRestriction")
@Immutable
public final class ContentKeyPolicyUnknownRestriction extends ContentKeyPolicyRestriction {
    /*
     * The discriminator for derived types.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Media.ContentKeyPolicyUnknownRestriction";

    /**
     * Creates an instance of ContentKeyPolicyUnknownRestriction class.
     */
    public ContentKeyPolicyUnknownRestriction() {
    }

    /**
     * Get the odataType property: The discriminator for derived types.
     * 
     * @return the odataType value.
     */
    @Override
    public String odataType() {
        return this.odataType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
