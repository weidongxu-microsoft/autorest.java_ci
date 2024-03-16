// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.DomainControlCenterSsoRequestInner;

/**
 * An immutable client-side representation of DomainControlCenterSsoRequest.
 */
public interface DomainControlCenterSsoRequest {
    /**
     * Gets the url property: URL where the single sign-on request is to be made.
     * 
     * @return the url value.
     */
    String url();

    /**
     * Gets the postParameterKey property: Post parameter key.
     * 
     * @return the postParameterKey value.
     */
    String postParameterKey();

    /**
     * Gets the postParameterValue property: Post parameter value. Client should use 'application/x-www-form-urlencoded' encoding for this value.
     * 
     * @return the postParameterValue value.
     */
    String postParameterValue();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.DomainControlCenterSsoRequestInner object.
     * 
     * @return the inner object.
     */
    DomainControlCenterSsoRequestInner innerModel();
}
