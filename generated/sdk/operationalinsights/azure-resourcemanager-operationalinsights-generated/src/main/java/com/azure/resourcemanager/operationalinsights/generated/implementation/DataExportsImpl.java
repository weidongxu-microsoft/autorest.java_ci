// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.fluent.DataExportsClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.DataExportInner;
import com.azure.resourcemanager.operationalinsights.generated.models.DataExport;
import com.azure.resourcemanager.operationalinsights.generated.models.DataExports;

public final class DataExportsImpl implements DataExports {
    private static final ClientLogger LOGGER = new ClientLogger(DataExportsImpl.class);

    private final DataExportsClient innerClient;

    private final com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager;

    public DataExportsImpl(DataExportsClient innerClient,
        com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DataExport> listByWorkspace(String resourceGroupName, String workspaceName) {
        PagedIterable<DataExportInner> inner = this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new DataExportImpl(inner1, this.manager()));
    }

    public PagedIterable<DataExport> listByWorkspace(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<DataExportInner> inner
            = this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new DataExportImpl(inner1, this.manager()));
    }

    public Response<DataExport> getWithResponse(String resourceGroupName, String workspaceName, String dataExportName,
        Context context) {
        Response<DataExportInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, workspaceName, dataExportName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DataExportImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DataExport get(String resourceGroupName, String workspaceName, String dataExportName) {
        DataExportInner inner = this.serviceClient().get(resourceGroupName, workspaceName, dataExportName);
        if (inner != null) {
            return new DataExportImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String workspaceName, String dataExportName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, workspaceName, dataExportName, context);
    }

    public void delete(String resourceGroupName, String workspaceName, String dataExportName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, dataExportName);
    }

    public DataExport getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String dataExportName = Utils.getValueFromIdByName(id, "dataExports");
        if (dataExportName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'dataExports'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, dataExportName, Context.NONE).getValue();
    }

    public Response<DataExport> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String dataExportName = Utils.getValueFromIdByName(id, "dataExports");
        if (dataExportName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'dataExports'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, dataExportName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String dataExportName = Utils.getValueFromIdByName(id, "dataExports");
        if (dataExportName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'dataExports'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, workspaceName, dataExportName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String dataExportName = Utils.getValueFromIdByName(id, "dataExports");
        if (dataExportName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'dataExports'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, workspaceName, dataExportName, context);
    }

    private DataExportsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    public DataExportImpl define(String name) {
        return new DataExportImpl(name, this.manager());
    }
}
