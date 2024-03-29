// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.implementation;

import com.azure.resourcemanager.hdinsight.generated.fluent.models.ClusterMonitoringResponseInner;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterMonitoringResponse;

public final class ClusterMonitoringResponseImpl implements ClusterMonitoringResponse {
    private ClusterMonitoringResponseInner innerObject;

    private final com.azure.resourcemanager.hdinsight.generated.HDInsightManager serviceManager;

    ClusterMonitoringResponseImpl(ClusterMonitoringResponseInner innerObject,
        com.azure.resourcemanager.hdinsight.generated.HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean clusterMonitoringEnabled() {
        return this.innerModel().clusterMonitoringEnabled();
    }

    public String workspaceId() {
        return this.innerModel().workspaceId();
    }

    public ClusterMonitoringResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hdinsight.generated.HDInsightManager manager() {
        return this.serviceManager;
    }
}
