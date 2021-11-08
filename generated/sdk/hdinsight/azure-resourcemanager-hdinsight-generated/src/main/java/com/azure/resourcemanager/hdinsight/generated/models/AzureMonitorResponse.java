// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.resourcemanager.hdinsight.generated.fluent.models.AzureMonitorResponseInner;

/** An immutable client-side representation of AzureMonitorResponse. */
public interface AzureMonitorResponse {
    /**
     * Gets the clusterMonitoringEnabled property: The status of the monitor on the HDInsight cluster.
     *
     * @return the clusterMonitoringEnabled value.
     */
    Boolean clusterMonitoringEnabled();

    /**
     * Gets the workspaceId property: The workspace ID of the monitor on the HDInsight cluster.
     *
     * @return the workspaceId value.
     */
    String workspaceId();

    /**
     * Gets the selectedConfigurations property: The selected configurations.
     *
     * @return the selectedConfigurations value.
     */
    AzureMonitorSelectedConfigurations selectedConfigurations();

    /**
     * Gets the inner com.azure.resourcemanager.hdinsight.generated.fluent.models.AzureMonitorResponseInner object.
     *
     * @return the inner object.
     */
    AzureMonitorResponseInner innerModel();
}
