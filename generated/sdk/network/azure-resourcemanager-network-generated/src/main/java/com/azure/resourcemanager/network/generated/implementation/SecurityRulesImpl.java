// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.SecurityRulesClient;
import com.azure.resourcemanager.network.generated.fluent.models.SecurityRuleInner;
import com.azure.resourcemanager.network.generated.models.SecurityRule;
import com.azure.resourcemanager.network.generated.models.SecurityRules;

public final class SecurityRulesImpl implements SecurityRules {
    private static final ClientLogger LOGGER = new ClientLogger(SecurityRulesImpl.class);

    private final SecurityRulesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public SecurityRulesImpl(SecurityRulesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        this.serviceClient().delete(resourceGroupName, networkSecurityGroupName, securityRuleName);
    }

    public void delete(String resourceGroupName, String networkSecurityGroupName, String securityRuleName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, networkSecurityGroupName, securityRuleName, context);
    }

    public Response<SecurityRule> getWithResponse(String resourceGroupName, String networkSecurityGroupName,
        String securityRuleName, Context context) {
        Response<SecurityRuleInner> inner = this.serviceClient().getWithResponse(resourceGroupName,
            networkSecurityGroupName, securityRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SecurityRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecurityRule get(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        SecurityRuleInner inner
            = this.serviceClient().get(resourceGroupName, networkSecurityGroupName, securityRuleName);
        if (inner != null) {
            return new SecurityRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<SecurityRule> list(String resourceGroupName, String networkSecurityGroupName) {
        PagedIterable<SecurityRuleInner> inner = this.serviceClient().list(resourceGroupName, networkSecurityGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SecurityRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityRule> list(String resourceGroupName, String networkSecurityGroupName,
        Context context) {
        PagedIterable<SecurityRuleInner> inner
            = this.serviceClient().list(resourceGroupName, networkSecurityGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SecurityRuleImpl(inner1, this.manager()));
    }

    public SecurityRule getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkSecurityGroupName = ResourceManagerUtils.getValueFromIdByName(id, "networkSecurityGroups");
        if (networkSecurityGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkSecurityGroups'.", id)));
        }
        String securityRuleName = ResourceManagerUtils.getValueFromIdByName(id, "securityRules");
        if (securityRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'securityRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkSecurityGroupName, securityRuleName, Context.NONE)
            .getValue();
    }

    public Response<SecurityRule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkSecurityGroupName = ResourceManagerUtils.getValueFromIdByName(id, "networkSecurityGroups");
        if (networkSecurityGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkSecurityGroups'.", id)));
        }
        String securityRuleName = ResourceManagerUtils.getValueFromIdByName(id, "securityRules");
        if (securityRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'securityRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkSecurityGroupName, securityRuleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkSecurityGroupName = ResourceManagerUtils.getValueFromIdByName(id, "networkSecurityGroups");
        if (networkSecurityGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkSecurityGroups'.", id)));
        }
        String securityRuleName = ResourceManagerUtils.getValueFromIdByName(id, "securityRules");
        if (securityRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'securityRules'.", id)));
        }
        this.delete(resourceGroupName, networkSecurityGroupName, securityRuleName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkSecurityGroupName = ResourceManagerUtils.getValueFromIdByName(id, "networkSecurityGroups");
        if (networkSecurityGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkSecurityGroups'.", id)));
        }
        String securityRuleName = ResourceManagerUtils.getValueFromIdByName(id, "securityRules");
        if (securityRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'securityRules'.", id)));
        }
        this.delete(resourceGroupName, networkSecurityGroupName, securityRuleName, context);
    }

    private SecurityRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public SecurityRuleImpl define(String name) {
        return new SecurityRuleImpl(name, this.manager());
    }
}
