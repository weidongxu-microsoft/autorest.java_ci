// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.fluent.models.CapabilityInner;

/**
 * An instance of this class provides access to all the operations defined in LocationBasedCapabilitySetsClient.
 */
public interface LocationBasedCapabilitySetsClient {
    /**
     * Get capabilities at specified location in a given subscription.
     * 
     * @param locationName The name of the location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return capabilities at specified location in a given subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapabilityInner> list(String locationName);

    /**
     * Get capabilities at specified location in a given subscription.
     * 
     * @param locationName The name of the location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return capabilities at specified location in a given subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapabilityInner> list(String locationName, Context context);

    /**
     * Get capabilities at specified location in a given subscription.
     * 
     * @param locationName The name of the location.
     * @param capabilitySetName Name of capability set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return capabilities at specified location in a given subscription along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CapabilityInner> getWithResponse(String locationName, String capabilitySetName, Context context);

    /**
     * Get capabilities at specified location in a given subscription.
     * 
     * @param locationName The name of the location.
     * @param capabilitySetName Name of capability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return capabilities at specified location in a given subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapabilityInner get(String locationName, String capabilitySetName);
}