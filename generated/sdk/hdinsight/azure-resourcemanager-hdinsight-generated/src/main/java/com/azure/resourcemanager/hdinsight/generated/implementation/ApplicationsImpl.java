// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.generated.fluent.ApplicationsClient;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.ApplicationInner;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.AsyncOperationResultInner;
import com.azure.resourcemanager.hdinsight.generated.models.Application;
import com.azure.resourcemanager.hdinsight.generated.models.Applications;
import com.azure.resourcemanager.hdinsight.generated.models.AsyncOperationResult;

public final class ApplicationsImpl implements Applications {
    private static final ClientLogger LOGGER = new ClientLogger(ApplicationsImpl.class);

    private final ApplicationsClient innerClient;

    private final com.azure.resourcemanager.hdinsight.generated.HDInsightManager serviceManager;

    public ApplicationsImpl(ApplicationsClient innerClient,
        com.azure.resourcemanager.hdinsight.generated.HDInsightManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Application> listByCluster(String resourceGroupName, String clusterName) {
        PagedIterable<ApplicationInner> inner = this.serviceClient().listByCluster(resourceGroupName, clusterName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ApplicationImpl(inner1, this.manager()));
    }

    public PagedIterable<Application> listByCluster(String resourceGroupName, String clusterName, Context context) {
        PagedIterable<ApplicationInner> inner
            = this.serviceClient().listByCluster(resourceGroupName, clusterName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ApplicationImpl(inner1, this.manager()));
    }

    public Response<Application> getWithResponse(String resourceGroupName, String clusterName, String applicationName,
        Context context) {
        Response<ApplicationInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, clusterName, applicationName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ApplicationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Application get(String resourceGroupName, String clusterName, String applicationName) {
        ApplicationInner inner = this.serviceClient().get(resourceGroupName, clusterName, applicationName);
        if (inner != null) {
            return new ApplicationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String applicationName) {
        this.serviceClient().delete(resourceGroupName, clusterName, applicationName);
    }

    public void delete(String resourceGroupName, String clusterName, String applicationName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, applicationName, context);
    }

    public Response<AsyncOperationResult> getAzureAsyncOperationStatusWithResponse(String resourceGroupName,
        String clusterName, String applicationName, String operationId, Context context) {
        Response<AsyncOperationResultInner> inner = this.serviceClient().getAzureAsyncOperationStatusWithResponse(
            resourceGroupName, clusterName, applicationName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AsyncOperationResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AsyncOperationResult getAzureAsyncOperationStatus(String resourceGroupName, String clusterName,
        String applicationName, String operationId) {
        AsyncOperationResultInner inner = this.serviceClient().getAzureAsyncOperationStatus(resourceGroupName,
            clusterName, applicationName, operationId);
        if (inner != null) {
            return new AsyncOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Application getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, applicationName, Context.NONE).getValue();
    }

    public Response<Application> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, applicationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        this.delete(resourceGroupName, clusterName, applicationName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        this.delete(resourceGroupName, clusterName, applicationName, context);
    }

    private ApplicationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hdinsight.generated.HDInsightManager manager() {
        return this.serviceManager;
    }

    public ApplicationImpl define(String name) {
        return new ApplicationImpl(name, this.manager());
    }
}
