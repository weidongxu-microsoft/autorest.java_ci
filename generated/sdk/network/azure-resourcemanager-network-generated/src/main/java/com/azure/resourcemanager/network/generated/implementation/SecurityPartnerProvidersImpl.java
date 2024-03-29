// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.SecurityPartnerProvidersClient;
import com.azure.resourcemanager.network.generated.fluent.models.SecurityPartnerProviderInner;
import com.azure.resourcemanager.network.generated.models.SecurityPartnerProvider;
import com.azure.resourcemanager.network.generated.models.SecurityPartnerProviders;

public final class SecurityPartnerProvidersImpl implements SecurityPartnerProviders {
    private static final ClientLogger LOGGER = new ClientLogger(SecurityPartnerProvidersImpl.class);

    private final SecurityPartnerProvidersClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public SecurityPartnerProvidersImpl(SecurityPartnerProvidersClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String securityPartnerProviderName) {
        this.serviceClient().delete(resourceGroupName, securityPartnerProviderName);
    }

    public void delete(String resourceGroupName, String securityPartnerProviderName, Context context) {
        this.serviceClient().delete(resourceGroupName, securityPartnerProviderName, context);
    }

    public Response<SecurityPartnerProvider> getByResourceGroupWithResponse(String resourceGroupName,
        String securityPartnerProviderName, Context context) {
        Response<SecurityPartnerProviderInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, securityPartnerProviderName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SecurityPartnerProviderImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecurityPartnerProvider getByResourceGroup(String resourceGroupName, String securityPartnerProviderName) {
        SecurityPartnerProviderInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, securityPartnerProviderName);
        if (inner != null) {
            return new SecurityPartnerProviderImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<SecurityPartnerProvider> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SecurityPartnerProviderInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SecurityPartnerProviderImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityPartnerProvider> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<SecurityPartnerProviderInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SecurityPartnerProviderImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityPartnerProvider> list() {
        PagedIterable<SecurityPartnerProviderInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SecurityPartnerProviderImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityPartnerProvider> list(Context context) {
        PagedIterable<SecurityPartnerProviderInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SecurityPartnerProviderImpl(inner1, this.manager()));
    }

    public SecurityPartnerProvider getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String securityPartnerProviderName = ResourceManagerUtils.getValueFromIdByName(id, "securityPartnerProviders");
        if (securityPartnerProviderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'securityPartnerProviders'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, securityPartnerProviderName, Context.NONE)
            .getValue();
    }

    public Response<SecurityPartnerProvider> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String securityPartnerProviderName = ResourceManagerUtils.getValueFromIdByName(id, "securityPartnerProviders");
        if (securityPartnerProviderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'securityPartnerProviders'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, securityPartnerProviderName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String securityPartnerProviderName = ResourceManagerUtils.getValueFromIdByName(id, "securityPartnerProviders");
        if (securityPartnerProviderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'securityPartnerProviders'.", id)));
        }
        this.delete(resourceGroupName, securityPartnerProviderName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String securityPartnerProviderName = ResourceManagerUtils.getValueFromIdByName(id, "securityPartnerProviders");
        if (securityPartnerProviderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'securityPartnerProviders'.", id)));
        }
        this.delete(resourceGroupName, securityPartnerProviderName, context);
    }

    private SecurityPartnerProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public SecurityPartnerProviderImpl define(String name) {
        return new SecurityPartnerProviderImpl(name, this.manager());
    }
}
