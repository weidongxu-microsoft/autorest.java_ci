// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Single sign-on request information for domain management.
 */
@Immutable
public final class DomainControlCenterSsoRequestInner {
    /*
     * URL where the single sign-on request is to be made.
     */
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /*
     * Post parameter key.
     */
    @JsonProperty(value = "postParameterKey", access = JsonProperty.Access.WRITE_ONLY)
    private String postParameterKey;

    /*
     * Post parameter value. Client should use 'application/x-www-form-urlencoded' encoding for this value.
     */
    @JsonProperty(value = "postParameterValue", access = JsonProperty.Access.WRITE_ONLY)
    private String postParameterValue;

    /**
     * Creates an instance of DomainControlCenterSsoRequestInner class.
     */
    public DomainControlCenterSsoRequestInner() {
    }

    /**
     * Get the url property: URL where the single sign-on request is to be made.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Get the postParameterKey property: Post parameter key.
     * 
     * @return the postParameterKey value.
     */
    public String postParameterKey() {
        return this.postParameterKey;
    }

    /**
     * Get the postParameterValue property: Post parameter value. Client should use 'application/x-www-form-urlencoded'
     * encoding for this value.
     * 
     * @return the postParameterValue value.
     */
    public String postParameterValue() {
        return this.postParameterValue;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
