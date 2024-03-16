// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.StaticMembersClient;
import com.azure.resourcemanager.network.generated.fluent.models.StaticMemberInner;
import com.azure.resourcemanager.network.generated.models.StaticMember;
import com.azure.resourcemanager.network.generated.models.StaticMembers;

public final class StaticMembersImpl implements StaticMembers {
    private static final ClientLogger LOGGER = new ClientLogger(StaticMembersImpl.class);

    private final StaticMembersClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public StaticMembersImpl(StaticMembersClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<StaticMember> getWithResponse(String resourceGroupName, String networkManagerName,
        String networkGroupName, String staticMemberName, Context context) {
        Response<StaticMemberInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, networkManagerName, networkGroupName, staticMemberName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new StaticMemberImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public StaticMember get(String resourceGroupName, String networkManagerName, String networkGroupName,
        String staticMemberName) {
        StaticMemberInner inner
            = this.serviceClient().get(resourceGroupName, networkManagerName, networkGroupName, staticMemberName);
        if (inner != null) {
            return new StaticMemberImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String networkManagerName,
        String networkGroupName, String staticMemberName, Context context) {
        return this.serviceClient()
            .deleteWithResponse(resourceGroupName, networkManagerName, networkGroupName, staticMemberName, context);
    }

    public void delete(String resourceGroupName, String networkManagerName, String networkGroupName,
        String staticMemberName) {
        this.serviceClient().delete(resourceGroupName, networkManagerName, networkGroupName, staticMemberName);
    }

    public PagedIterable<StaticMember> list(String resourceGroupName, String networkManagerName,
        String networkGroupName) {
        PagedIterable<StaticMemberInner> inner
            = this.serviceClient().list(resourceGroupName, networkManagerName, networkGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new StaticMemberImpl(inner1, this.manager()));
    }

    public PagedIterable<StaticMember> list(String resourceGroupName, String networkManagerName,
        String networkGroupName, Integer top, String skipToken, Context context) {
        PagedIterable<StaticMemberInner> inner = this.serviceClient()
            .list(resourceGroupName, networkManagerName, networkGroupName, top, skipToken, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new StaticMemberImpl(inner1, this.manager()));
    }

    public StaticMember getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = ResourceManagerUtils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String networkGroupName = ResourceManagerUtils.getValueFromIdByName(id, "networkGroups");
        if (networkGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkGroups'.", id)));
        }
        String staticMemberName = ResourceManagerUtils.getValueFromIdByName(id, "staticMembers");
        if (staticMemberName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'staticMembers'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, networkManagerName, networkGroupName, staticMemberName, Context.NONE)
            .getValue();
    }

    public Response<StaticMember> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = ResourceManagerUtils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String networkGroupName = ResourceManagerUtils.getValueFromIdByName(id, "networkGroups");
        if (networkGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkGroups'.", id)));
        }
        String staticMemberName = ResourceManagerUtils.getValueFromIdByName(id, "staticMembers");
        if (staticMemberName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'staticMembers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkManagerName, networkGroupName, staticMemberName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = ResourceManagerUtils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String networkGroupName = ResourceManagerUtils.getValueFromIdByName(id, "networkGroups");
        if (networkGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkGroups'.", id)));
        }
        String staticMemberName = ResourceManagerUtils.getValueFromIdByName(id, "staticMembers");
        if (staticMemberName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'staticMembers'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, networkManagerName, networkGroupName, staticMemberName,
            Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = ResourceManagerUtils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String networkGroupName = ResourceManagerUtils.getValueFromIdByName(id, "networkGroups");
        if (networkGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkGroups'.", id)));
        }
        String staticMemberName = ResourceManagerUtils.getValueFromIdByName(id, "staticMembers");
        if (staticMemberName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'staticMembers'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, networkManagerName, networkGroupName, staticMemberName,
            context);
    }

    private StaticMembersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public StaticMemberImpl define(String name) {
        return new StaticMemberImpl(name, this.manager());
    }
}
