// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.generated.fluent.ExtensionsClient;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.AsyncOperationResultInner;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.AzureMonitorResponseInner;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.ClusterMonitoringResponseInner;
import com.azure.resourcemanager.hdinsight.generated.models.AsyncOperationResult;
import com.azure.resourcemanager.hdinsight.generated.models.AzureMonitorRequest;
import com.azure.resourcemanager.hdinsight.generated.models.AzureMonitorResponse;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterMonitoringRequest;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterMonitoringResponse;
import com.azure.resourcemanager.hdinsight.generated.models.Extension;
import com.azure.resourcemanager.hdinsight.generated.models.Extensions;

public final class ExtensionsImpl implements Extensions {
    private static final ClientLogger LOGGER = new ClientLogger(ExtensionsImpl.class);

    private final ExtensionsClient innerClient;

    private final com.azure.resourcemanager.hdinsight.generated.HDInsightManager serviceManager;

    public ExtensionsImpl(ExtensionsClient innerClient,
        com.azure.resourcemanager.hdinsight.generated.HDInsightManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void enableMonitoring(String resourceGroupName, String clusterName, ClusterMonitoringRequest parameters) {
        this.serviceClient().enableMonitoring(resourceGroupName, clusterName, parameters);
    }

    public void enableMonitoring(String resourceGroupName, String clusterName, ClusterMonitoringRequest parameters,
        Context context) {
        this.serviceClient().enableMonitoring(resourceGroupName, clusterName, parameters, context);
    }

    public Response<ClusterMonitoringResponse> getMonitoringStatusWithResponse(String resourceGroupName,
        String clusterName, Context context) {
        Response<ClusterMonitoringResponseInner> inner
            = this.serviceClient().getMonitoringStatusWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ClusterMonitoringResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ClusterMonitoringResponse getMonitoringStatus(String resourceGroupName, String clusterName) {
        ClusterMonitoringResponseInner inner = this.serviceClient().getMonitoringStatus(resourceGroupName, clusterName);
        if (inner != null) {
            return new ClusterMonitoringResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void disableMonitoring(String resourceGroupName, String clusterName) {
        this.serviceClient().disableMonitoring(resourceGroupName, clusterName);
    }

    public void disableMonitoring(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().disableMonitoring(resourceGroupName, clusterName, context);
    }

    public void enableAzureMonitor(String resourceGroupName, String clusterName, AzureMonitorRequest parameters) {
        this.serviceClient().enableAzureMonitor(resourceGroupName, clusterName, parameters);
    }

    public void enableAzureMonitor(String resourceGroupName, String clusterName, AzureMonitorRequest parameters,
        Context context) {
        this.serviceClient().enableAzureMonitor(resourceGroupName, clusterName, parameters, context);
    }

    public Response<AzureMonitorResponse> getAzureMonitorStatusWithResponse(String resourceGroupName,
        String clusterName, Context context) {
        Response<AzureMonitorResponseInner> inner
            = this.serviceClient().getAzureMonitorStatusWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AzureMonitorResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AzureMonitorResponse getAzureMonitorStatus(String resourceGroupName, String clusterName) {
        AzureMonitorResponseInner inner = this.serviceClient().getAzureMonitorStatus(resourceGroupName, clusterName);
        if (inner != null) {
            return new AzureMonitorResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void disableAzureMonitor(String resourceGroupName, String clusterName) {
        this.serviceClient().disableAzureMonitor(resourceGroupName, clusterName);
    }

    public void disableAzureMonitor(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().disableAzureMonitor(resourceGroupName, clusterName, context);
    }

    public void enableAzureMonitorAgent(String resourceGroupName, String clusterName, AzureMonitorRequest parameters) {
        this.serviceClient().enableAzureMonitorAgent(resourceGroupName, clusterName, parameters);
    }

    public void enableAzureMonitorAgent(String resourceGroupName, String clusterName, AzureMonitorRequest parameters,
        Context context) {
        this.serviceClient().enableAzureMonitorAgent(resourceGroupName, clusterName, parameters, context);
    }

    public Response<AzureMonitorResponse> getAzureMonitorAgentStatusWithResponse(String resourceGroupName,
        String clusterName, Context context) {
        Response<AzureMonitorResponseInner> inner
            = this.serviceClient().getAzureMonitorAgentStatusWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AzureMonitorResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AzureMonitorResponse getAzureMonitorAgentStatus(String resourceGroupName, String clusterName) {
        AzureMonitorResponseInner inner
            = this.serviceClient().getAzureMonitorAgentStatus(resourceGroupName, clusterName);
        if (inner != null) {
            return new AzureMonitorResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void disableAzureMonitorAgent(String resourceGroupName, String clusterName) {
        this.serviceClient().disableAzureMonitorAgent(resourceGroupName, clusterName);
    }

    public void disableAzureMonitorAgent(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().disableAzureMonitorAgent(resourceGroupName, clusterName, context);
    }

    public void create(String resourceGroupName, String clusterName, String extensionName, Extension parameters) {
        this.serviceClient().create(resourceGroupName, clusterName, extensionName, parameters);
    }

    public void create(String resourceGroupName, String clusterName, String extensionName, Extension parameters,
        Context context) {
        this.serviceClient().create(resourceGroupName, clusterName, extensionName, parameters, context);
    }

    public Response<ClusterMonitoringResponse> getWithResponse(String resourceGroupName, String clusterName,
        String extensionName, Context context) {
        Response<ClusterMonitoringResponseInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, clusterName, extensionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ClusterMonitoringResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ClusterMonitoringResponse get(String resourceGroupName, String clusterName, String extensionName) {
        ClusterMonitoringResponseInner inner = this.serviceClient().get(resourceGroupName, clusterName, extensionName);
        if (inner != null) {
            return new ClusterMonitoringResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String extensionName) {
        this.serviceClient().delete(resourceGroupName, clusterName, extensionName);
    }

    public void delete(String resourceGroupName, String clusterName, String extensionName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, extensionName, context);
    }

    public Response<AsyncOperationResult> getAzureAsyncOperationStatusWithResponse(String resourceGroupName,
        String clusterName, String extensionName, String operationId, Context context) {
        Response<AsyncOperationResultInner> inner = this.serviceClient()
            .getAzureAsyncOperationStatusWithResponse(resourceGroupName, clusterName, extensionName, operationId,
                context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AsyncOperationResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AsyncOperationResult getAzureAsyncOperationStatus(String resourceGroupName, String clusterName,
        String extensionName, String operationId) {
        AsyncOperationResultInner inner = this.serviceClient()
            .getAzureAsyncOperationStatus(resourceGroupName, clusterName, extensionName, operationId);
        if (inner != null) {
            return new AsyncOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ExtensionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hdinsight.generated.HDInsightManager manager() {
        return this.serviceManager;
    }
}
