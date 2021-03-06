// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of FirewallPolicyIdpsSignatures. */
public interface FirewallPolicyIdpsSignatures {
    /**
     * Retrieves the current status of IDPS signatures for the relevant policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will describe the query to run against the IDPS signatures DB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result.
     */
    QueryResults list(String resourceGroupName, String firewallPolicyName, IdpsQueryObject parameters);

    /**
     * Retrieves the current status of IDPS signatures for the relevant policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will describe the query to run against the IDPS signatures DB.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result along with {@link Response}.
     */
    Response<QueryResults> listWithResponse(
        String resourceGroupName, String firewallPolicyName, IdpsQueryObject parameters, Context context);
}
