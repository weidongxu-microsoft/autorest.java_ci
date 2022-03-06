// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration settings of the Allowed Audiences validation flow. */
@Fluent
public final class AllowedAudiencesValidation {
    /*
     * The configuration settings of the allowed list of audiences from which
     * to validate the JWT token.
     */
    @JsonProperty(value = "allowedAudiences")
    private List<String> allowedAudiences;

    /**
     * Get the allowedAudiences property: The configuration settings of the allowed list of audiences from which to
     * validate the JWT token.
     *
     * @return the allowedAudiences value.
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences;
    }

    /**
     * Set the allowedAudiences property: The configuration settings of the allowed list of audiences from which to
     * validate the JWT token.
     *
     * @param allowedAudiences the allowedAudiences value to set.
     * @return the AllowedAudiencesValidation object itself.
     */
    public AllowedAudiencesValidation withAllowedAudiences(List<String> allowedAudiences) {
        this.allowedAudiences = allowedAudiences;
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
