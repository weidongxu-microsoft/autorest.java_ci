// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of CheckNameAvailabilities. */
public interface CheckNameAvailabilities {
    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability.
     */
    NameAvailability execute(NameAvailabilityRequest nameAvailabilityRequest);

    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability along with {@link Response}.
     */
    Response<NameAvailability> executeWithResponse(NameAvailabilityRequest nameAvailabilityRequest, Context context);
}
