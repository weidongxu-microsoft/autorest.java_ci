// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.dns.generated.fluent.models.DnssecConfigInner;

/**
 * An instance of this class provides access to all the operations defined in DnssecConfigsClient.
 */
public interface DnssecConfigsClient {
    /**
     * Creates or updates the DNSSEC configuration on a DNS zone.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents the DNSSEC configuration.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DnssecConfigInner>, DnssecConfigInner> beginCreateOrUpdate(String resourceGroupName,
        String zoneName);

    /**
     * Creates or updates the DNSSEC configuration on a DNS zone.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNSSEC configuration. Omit this value to always overwrite the DNSSEC
     * configuration. Specify the last-seen etag value to prevent accidentally overwriting any concurrent changes.
     * @param ifNoneMatch Set to '*' to allow this DNSSEC configuration to be created, but to prevent updating existing
     * DNSSEC configuration. Other values will be ignored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents the DNSSEC configuration.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DnssecConfigInner>, DnssecConfigInner> beginCreateOrUpdate(String resourceGroupName,
        String zoneName, String ifMatch, String ifNoneMatch, Context context);

    /**
     * Creates or updates the DNSSEC configuration on a DNS zone.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the DNSSEC configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DnssecConfigInner createOrUpdate(String resourceGroupName, String zoneName);

    /**
     * Creates or updates the DNSSEC configuration on a DNS zone.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNSSEC configuration. Omit this value to always overwrite the DNSSEC
     * configuration. Specify the last-seen etag value to prevent accidentally overwriting any concurrent changes.
     * @param ifNoneMatch Set to '*' to allow this DNSSEC configuration to be created, but to prevent updating existing
     * DNSSEC configuration. Other values will be ignored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the DNSSEC configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DnssecConfigInner createOrUpdate(String resourceGroupName, String zoneName, String ifMatch, String ifNoneMatch,
        Context context);

    /**
     * Deletes the DNSSEC configuration on a DNS zone. This operation cannot be undone.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String zoneName);

    /**
     * Deletes the DNSSEC configuration on a DNS zone. This operation cannot be undone.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of this DNSSEC configuration. Omit this value to always delete the DNSSEC configuration.
     * Specify the last-seen etag value to prevent accidentally deleting any concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String zoneName, String ifMatch,
        Context context);

    /**
     * Deletes the DNSSEC configuration on a DNS zone. This operation cannot be undone.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String zoneName);

    /**
     * Deletes the DNSSEC configuration on a DNS zone. This operation cannot be undone.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of this DNSSEC configuration. Omit this value to always delete the DNSSEC configuration.
     * Specify the last-seen etag value to prevent accidentally deleting any concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String zoneName, String ifMatch, Context context);

    /**
     * Gets the DNSSEC configuration.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DNSSEC configuration along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DnssecConfigInner> getWithResponse(String resourceGroupName, String zoneName, Context context);

    /**
     * Gets the DNSSEC configuration.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DNSSEC configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DnssecConfigInner get(String resourceGroupName, String zoneName);

    /**
     * Lists the DNSSEC configurations in a DNS zone.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a List DNSSEC configurations operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DnssecConfigInner> listByDnsZone(String resourceGroupName, String zoneName);

    /**
     * Lists the DNSSEC configurations in a DNS zone.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a List DNSSEC configurations operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DnssecConfigInner> listByDnsZone(String resourceGroupName, String zoneName, Context context);
}
