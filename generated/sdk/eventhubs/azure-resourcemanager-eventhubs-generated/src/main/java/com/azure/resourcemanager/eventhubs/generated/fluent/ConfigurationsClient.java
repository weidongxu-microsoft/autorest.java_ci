// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.ClusterQuotaConfigurationPropertiesInner;

/**
 * An instance of this class provides access to all the operations defined in ConfigurationsClient.
 */
public interface ConfigurationsClient {
    /**
     * Replace all specified Event Hubs Cluster settings with those contained in the request body. Leaves the settings
     * not specified in the request body unmodified.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating an Event Hubs Cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all settings for the cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterQuotaConfigurationPropertiesInner> patchWithResponse(String resourceGroupName, String clusterName,
        ClusterQuotaConfigurationPropertiesInner parameters, Context context);

    /**
     * Replace all specified Event Hubs Cluster settings with those contained in the request body. Leaves the settings
     * not specified in the request body unmodified.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating an Event Hubs Cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all settings for the cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterQuotaConfigurationPropertiesInner patch(String resourceGroupName, String clusterName,
        ClusterQuotaConfigurationPropertiesInner parameters);

    /**
     * Get all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings
     * imposed on the cluster.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings
     * imposed on the cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterQuotaConfigurationPropertiesInner> getWithResponse(String resourceGroupName, String clusterName,
        Context context);

    /**
     * Get all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings
     * imposed on the cluster.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings
     * imposed on the cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterQuotaConfigurationPropertiesInner get(String resourceGroupName, String clusterName);
}
