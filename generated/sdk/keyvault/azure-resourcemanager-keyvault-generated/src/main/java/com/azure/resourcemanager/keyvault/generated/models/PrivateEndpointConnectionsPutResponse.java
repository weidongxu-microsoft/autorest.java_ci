// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.keyvault.generated.fluent.models.PrivateEndpointConnectionInner;

/**
 * Contains all response data for the put operation.
 */
public final class PrivateEndpointConnectionsPutResponse
    extends ResponseBase<PrivateEndpointConnectionsPutHeaders, PrivateEndpointConnectionInner> {
    /**
     * Creates an instance of PrivateEndpointConnectionsPutResponse.
     * 
     * @param request the request which resulted in this PrivateEndpointConnectionsPutResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public PrivateEndpointConnectionsPutResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders,
        PrivateEndpointConnectionInner value, PrivateEndpointConnectionsPutHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     * 
     * @return the deserialized response body.
     */
    @Override
    public PrivateEndpointConnectionInner getValue() {
        return super.getValue();
    }
}
