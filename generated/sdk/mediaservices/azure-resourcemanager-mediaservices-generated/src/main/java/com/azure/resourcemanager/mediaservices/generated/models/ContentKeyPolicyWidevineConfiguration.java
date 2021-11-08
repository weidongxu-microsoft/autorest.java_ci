// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Specifies a configuration for Widevine licenses. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyWidevineConfiguration")
@Fluent
public final class ContentKeyPolicyWidevineConfiguration extends ContentKeyPolicyConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContentKeyPolicyWidevineConfiguration.class);

    /*
     * The Widevine template.
     */
    @JsonProperty(value = "widevineTemplate", required = true)
    private String widevineTemplate;

    /**
     * Get the widevineTemplate property: The Widevine template.
     *
     * @return the widevineTemplate value.
     */
    public String widevineTemplate() {
        return this.widevineTemplate;
    }

    /**
     * Set the widevineTemplate property: The Widevine template.
     *
     * @param widevineTemplate the widevineTemplate value to set.
     * @return the ContentKeyPolicyWidevineConfiguration object itself.
     */
    public ContentKeyPolicyWidevineConfiguration withWidevineTemplate(String widevineTemplate) {
        this.widevineTemplate = widevineTemplate;
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
        if (widevineTemplate() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property widevineTemplate in model ContentKeyPolicyWidevineConfiguration"));
        }
    }
}
