// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.fluent.ApplicationGroupsClient;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.ApplicationGroupInner;
import com.azure.resourcemanager.eventhubs.generated.models.ApplicationGroup;
import com.azure.resourcemanager.eventhubs.generated.models.ApplicationGroups;

public final class ApplicationGroupsImpl implements ApplicationGroups {
    private static final ClientLogger LOGGER = new ClientLogger(ApplicationGroupsImpl.class);

    private final ApplicationGroupsClient innerClient;

    private final com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager;

    public ApplicationGroupsImpl(
        ApplicationGroupsClient innerClient,
        com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ApplicationGroup> listByNamespace(String resourceGroupName, String namespaceName) {
        PagedIterable<ApplicationGroupInner> inner =
            this.serviceClient().listByNamespace(resourceGroupName, namespaceName);
        return Utils.mapPage(inner, inner1 -> new ApplicationGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationGroup> listByNamespace(
        String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<ApplicationGroupInner> inner =
            this.serviceClient().listByNamespace(resourceGroupName, namespaceName, context);
        return Utils.mapPage(inner, inner1 -> new ApplicationGroupImpl(inner1, this.manager()));
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String applicationGroupName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, namespaceName, applicationGroupName, context);
    }

    public void delete(String resourceGroupName, String namespaceName, String applicationGroupName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, applicationGroupName);
    }

    public Response<ApplicationGroup> getWithResponse(
        String resourceGroupName, String namespaceName, String applicationGroupName, Context context) {
        Response<ApplicationGroupInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, namespaceName, applicationGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationGroup get(String resourceGroupName, String namespaceName, String applicationGroupName) {
        ApplicationGroupInner inner = this.serviceClient().get(resourceGroupName, namespaceName, applicationGroupName);
        if (inner != null) {
            return new ApplicationGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ApplicationGroup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String applicationGroupName = Utils.getValueFromIdByName(id, "applicationGroups");
        if (applicationGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'applicationGroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, applicationGroupName, Context.NONE).getValue();
    }

    public Response<ApplicationGroup> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String applicationGroupName = Utils.getValueFromIdByName(id, "applicationGroups");
        if (applicationGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'applicationGroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, applicationGroupName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String applicationGroupName = Utils.getValueFromIdByName(id, "applicationGroups");
        if (applicationGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'applicationGroups'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, namespaceName, applicationGroupName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String applicationGroupName = Utils.getValueFromIdByName(id, "applicationGroups");
        if (applicationGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'applicationGroups'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, namespaceName, applicationGroupName, context);
    }

    private ApplicationGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager() {
        return this.serviceManager;
    }

    public ApplicationGroupImpl define(String name) {
        return new ApplicationGroupImpl(name, this.manager());
    }
}
