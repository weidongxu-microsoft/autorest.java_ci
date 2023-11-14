// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.generated.fluent.WorkbooksClient;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.WorkbookInner;
import com.azure.resourcemanager.applicationinsights.generated.models.CategoryType;
import com.azure.resourcemanager.applicationinsights.generated.models.Workbook;
import com.azure.resourcemanager.applicationinsights.generated.models.Workbooks;
import java.util.List;

public final class WorkbooksImpl implements Workbooks {
    private static final ClientLogger LOGGER = new ClientLogger(WorkbooksImpl.class);

    private final WorkbooksClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    public WorkbooksImpl(WorkbooksClient innerClient,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Workbook> listByResourceGroup(String resourceGroupName, CategoryType category) {
        PagedIterable<WorkbookInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, category);
        return Utils.mapPage(inner, inner1 -> new WorkbookImpl(inner1, this.manager()));
    }

    public PagedIterable<Workbook> listByResourceGroup(String resourceGroupName, CategoryType category,
        List<String> tags, Boolean canFetchContent, Context context) {
        PagedIterable<WorkbookInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, category, tags, canFetchContent, context);
        return Utils.mapPage(inner, inner1 -> new WorkbookImpl(inner1, this.manager()));
    }

    public Response<Workbook> getByResourceGroupWithResponse(String resourceGroupName, String resourceName,
        Context context) {
        Response<WorkbookInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WorkbookImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Workbook getByResourceGroup(String resourceGroupName, String resourceName) {
        WorkbookInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourceName);
        if (inner != null) {
            return new WorkbookImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String resourceName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String resourceName) {
        this.serviceClient().delete(resourceGroupName, resourceName);
    }

    public Workbook getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "workbooks");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workbooks'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<Workbook> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "workbooks");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workbooks'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "workbooks");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workbooks'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "workbooks");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workbooks'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceGroupName, resourceName, context);
    }

    private WorkbooksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }

    public WorkbookImpl define(String name) {
        return new WorkbookImpl(name, this.manager());
    }
}
