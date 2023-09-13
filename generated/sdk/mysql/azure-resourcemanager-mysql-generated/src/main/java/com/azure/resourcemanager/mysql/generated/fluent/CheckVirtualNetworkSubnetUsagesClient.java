// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.fluent.models.VirtualNetworkSubnetUsageResultInner;
import com.azure.resourcemanager.mysql.generated.models.VirtualNetworkSubnetUsageParameter;

/** An instance of this class provides access to all the operations defined in CheckVirtualNetworkSubnetUsagesClient. */
public interface CheckVirtualNetworkSubnetUsagesClient {
    /**
     * Get virtual network subnet usage for a given vNet resource id.
     *
     * @param locationName The name of the location.
     * @param parameters The required parameters for creating or updating a server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual network subnet usage for a given vNet resource id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualNetworkSubnetUsageResultInner> executeWithResponse(
        String locationName, VirtualNetworkSubnetUsageParameter parameters, Context context);

    /**
     * Get virtual network subnet usage for a given vNet resource id.
     *
     * @param locationName The name of the location.
     * @param parameters The required parameters for creating or updating a server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual network subnet usage for a given vNet resource id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkSubnetUsageResultInner execute(String locationName, VirtualNetworkSubnetUsageParameter parameters);
}
