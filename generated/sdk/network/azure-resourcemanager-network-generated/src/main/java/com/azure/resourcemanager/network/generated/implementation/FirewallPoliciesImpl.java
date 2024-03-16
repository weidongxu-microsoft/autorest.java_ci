// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.FirewallPoliciesClient;
import com.azure.resourcemanager.network.generated.fluent.models.FirewallPolicyInner;
import com.azure.resourcemanager.network.generated.models.FirewallPolicies;
import com.azure.resourcemanager.network.generated.models.FirewallPolicy;

public final class FirewallPoliciesImpl implements FirewallPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(FirewallPoliciesImpl.class);

    private final FirewallPoliciesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public FirewallPoliciesImpl(FirewallPoliciesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String firewallPolicyName) {
        this.serviceClient().delete(resourceGroupName, firewallPolicyName);
    }

    public void delete(String resourceGroupName, String firewallPolicyName, Context context) {
        this.serviceClient().delete(resourceGroupName, firewallPolicyName, context);
    }

    public Response<FirewallPolicy> getByResourceGroupWithResponse(String resourceGroupName, String firewallPolicyName,
        String expand, Context context) {
        Response<FirewallPolicyInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, firewallPolicyName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FirewallPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FirewallPolicy getByResourceGroup(String resourceGroupName, String firewallPolicyName) {
        FirewallPolicyInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, firewallPolicyName);
        if (inner != null) {
            return new FirewallPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<FirewallPolicy> listByResourceGroup(String resourceGroupName) {
        PagedIterable<FirewallPolicyInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FirewallPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<FirewallPolicy> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<FirewallPolicyInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FirewallPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<FirewallPolicy> list() {
        PagedIterable<FirewallPolicyInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FirewallPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<FirewallPolicy> list(Context context) {
        PagedIterable<FirewallPolicyInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FirewallPolicyImpl(inner1, this.manager()));
    }

    public FirewallPolicy getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String firewallPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "firewallPolicies");
        if (firewallPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'firewallPolicies'.", id)));
        }
        String localExpand = null;
        return this.getByResourceGroupWithResponse(resourceGroupName, firewallPolicyName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<FirewallPolicy> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String firewallPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "firewallPolicies");
        if (firewallPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'firewallPolicies'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, firewallPolicyName, expand, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String firewallPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "firewallPolicies");
        if (firewallPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'firewallPolicies'.", id)));
        }
        this.delete(resourceGroupName, firewallPolicyName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String firewallPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "firewallPolicies");
        if (firewallPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'firewallPolicies'.", id)));
        }
        this.delete(resourceGroupName, firewallPolicyName, context);
    }

    private FirewallPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public FirewallPolicyImpl define(String name) {
        return new FirewallPolicyImpl(name, this.manager());
    }
}
