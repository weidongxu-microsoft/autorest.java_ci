// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.SignatureOverridesFilterValuesResponseInner;
import com.azure.resourcemanager.network.generated.models.SignatureOverridesFilterValuesQuery;

/**
 * An instance of this class provides access to all the operations defined in
 * FirewallPolicyIdpsSignaturesFilterValuesClient.
 */
public interface FirewallPolicyIdpsSignaturesFilterValuesClient {
    /**
     * Retrieves the current filter values for the signatures overrides.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Describes the filter values possibles for a given column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the list of all possible values for a specific filter value.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SignatureOverridesFilterValuesResponseInner list(
        String resourceGroupName, String firewallPolicyName, SignatureOverridesFilterValuesQuery parameters);

    /**
     * Retrieves the current filter values for the signatures overrides.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Describes the filter values possibles for a given column.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the list of all possible values for a specific filter value along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SignatureOverridesFilterValuesResponseInner> listWithResponse(
        String resourceGroupName,
        String firewallPolicyName,
        SignatureOverridesFilterValuesQuery parameters,
        Context context);
}
