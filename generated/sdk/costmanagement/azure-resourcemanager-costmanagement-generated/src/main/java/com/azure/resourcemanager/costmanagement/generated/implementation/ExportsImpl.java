// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.generated.fluent.ExportsClient;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.ExportExecutionListResultInner;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.ExportInner;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.ExportListResultInner;
import com.azure.resourcemanager.costmanagement.generated.models.Export;
import com.azure.resourcemanager.costmanagement.generated.models.ExportExecutionListResult;
import com.azure.resourcemanager.costmanagement.generated.models.ExportListResult;
import com.azure.resourcemanager.costmanagement.generated.models.Exports;

public final class ExportsImpl implements Exports {
    private static final ClientLogger LOGGER = new ClientLogger(ExportsImpl.class);

    private final ExportsClient innerClient;

    private final com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager;

    public ExportsImpl(ExportsClient innerClient,
        com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ExportListResult> listWithResponse(String scope, Context context) {
        Response<ExportListResultInner> inner = this.serviceClient().listWithResponse(scope, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExportListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExportListResult list(String scope) {
        ExportListResultInner inner = this.serviceClient().list(scope);
        if (inner != null) {
            return new ExportListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Export> getWithResponse(String scope, String exportName, Context context) {
        Response<ExportInner> inner = this.serviceClient().getWithResponse(scope, exportName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExportImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Export get(String scope, String exportName) {
        ExportInner inner = this.serviceClient().get(scope, exportName);
        if (inner != null) {
            return new ExportImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(String scope, String exportName, Context context) {
        return this.serviceClient().deleteWithResponse(scope, exportName, context);
    }

    public void deleteByResourceGroup(String scope, String exportName) {
        this.serviceClient().delete(scope, exportName);
    }

    public Response<Void> executeWithResponse(String scope, String exportName, Context context) {
        return this.serviceClient().executeWithResponse(scope, exportName, context);
    }

    public void execute(String scope, String exportName) {
        this.serviceClient().execute(scope, exportName);
    }

    public Response<ExportExecutionListResult> getExecutionHistoryWithResponse(String scope, String exportName,
        Context context) {
        Response<ExportExecutionListResultInner> inner
            = this.serviceClient().getExecutionHistoryWithResponse(scope, exportName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExportExecutionListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExportExecutionListResult getExecutionHistory(String scope, String exportName) {
        ExportExecutionListResultInner inner = this.serviceClient().getExecutionHistory(scope, exportName);
        if (inner != null) {
            return new ExportExecutionListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Export getById(String id) {
        String scope = Utils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "scope");
        if (scope == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String exportName = Utils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "exportName");
        if (exportName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'exports'.", id)));
        }
        return this.getWithResponse(scope, exportName, Context.NONE).getValue();
    }

    public Response<Export> getByIdWithResponse(String id, Context context) {
        String scope = Utils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "scope");
        if (scope == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String exportName = Utils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "exportName");
        if (exportName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'exports'.", id)));
        }
        return this.getWithResponse(scope, exportName, context);
    }

    public void deleteById(String id) {
        String scope = Utils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "scope");
        if (scope == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String exportName = Utils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "exportName");
        if (exportName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'exports'.", id)));
        }
        this.deleteByResourceGroupWithResponse(scope, exportName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String scope = Utils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "scope");
        if (scope == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String exportName = Utils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "exportName");
        if (exportName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'exports'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(scope, exportName, context);
    }

    private ExportsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.costmanagement.generated.CostManagementManager manager() {
        return this.serviceManager;
    }

    public ExportImpl define(String name) {
        return new ExportImpl(name, this.manager());
    }
}
