// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ServiceEndpointPoliciesClient;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyInner;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPolicies;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPolicy;

public final class ServiceEndpointPoliciesImpl implements ServiceEndpointPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(ServiceEndpointPoliciesImpl.class);

    private final ServiceEndpointPoliciesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ServiceEndpointPoliciesImpl(ServiceEndpointPoliciesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String serviceEndpointPolicyName) {
        this.serviceClient().delete(resourceGroupName, serviceEndpointPolicyName);
    }

    public void delete(String resourceGroupName, String serviceEndpointPolicyName, Context context) {
        this.serviceClient().delete(resourceGroupName, serviceEndpointPolicyName, context);
    }

    public Response<ServiceEndpointPolicy> getByResourceGroupWithResponse(String resourceGroupName,
        String serviceEndpointPolicyName, String expand, Context context) {
        Response<ServiceEndpointPolicyInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, serviceEndpointPolicyName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ServiceEndpointPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServiceEndpointPolicy getByResourceGroup(String resourceGroupName, String serviceEndpointPolicyName) {
        ServiceEndpointPolicyInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, serviceEndpointPolicyName);
        if (inner != null) {
            return new ServiceEndpointPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ServiceEndpointPolicy> list() {
        PagedIterable<ServiceEndpointPolicyInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ServiceEndpointPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<ServiceEndpointPolicy> list(Context context) {
        PagedIterable<ServiceEndpointPolicyInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ServiceEndpointPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<ServiceEndpointPolicy> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ServiceEndpointPolicyInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ServiceEndpointPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<ServiceEndpointPolicy> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ServiceEndpointPolicyInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ServiceEndpointPolicyImpl(inner1, this.manager()));
    }

    public ServiceEndpointPolicy getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceEndpointPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "serviceEndpointPolicies");
        if (serviceEndpointPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'serviceEndpointPolicies'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, serviceEndpointPolicyName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<ServiceEndpointPolicy> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceEndpointPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "serviceEndpointPolicies");
        if (serviceEndpointPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'serviceEndpointPolicies'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, serviceEndpointPolicyName, expand, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceEndpointPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "serviceEndpointPolicies");
        if (serviceEndpointPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'serviceEndpointPolicies'.", id)));
        }
        this.delete(resourceGroupName, serviceEndpointPolicyName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceEndpointPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "serviceEndpointPolicies");
        if (serviceEndpointPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'serviceEndpointPolicies'.", id)));
        }
        this.delete(resourceGroupName, serviceEndpointPolicyName, context);
    }

    private ServiceEndpointPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public ServiceEndpointPolicyImpl define(String name) {
        return new ServiceEndpointPolicyImpl(name, this.manager());
    }
}
