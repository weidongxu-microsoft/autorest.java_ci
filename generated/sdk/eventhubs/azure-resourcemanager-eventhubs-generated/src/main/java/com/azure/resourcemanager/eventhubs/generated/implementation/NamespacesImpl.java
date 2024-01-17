// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.fluent.NamespacesClient;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.EHNamespaceInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.NetworkRuleSetInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.NetworkRuleSetListResultInner;
import com.azure.resourcemanager.eventhubs.generated.models.AccessKeys;
import com.azure.resourcemanager.eventhubs.generated.models.AuthorizationRule;
import com.azure.resourcemanager.eventhubs.generated.models.CheckNameAvailabilityParameter;
import com.azure.resourcemanager.eventhubs.generated.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.eventhubs.generated.models.EHNamespace;
import com.azure.resourcemanager.eventhubs.generated.models.Namespaces;
import com.azure.resourcemanager.eventhubs.generated.models.NetworkRuleSet;
import com.azure.resourcemanager.eventhubs.generated.models.NetworkRuleSetListResult;
import com.azure.resourcemanager.eventhubs.generated.models.RegenerateAccessKeyParameters;

public final class NamespacesImpl implements Namespaces {
    private static final ClientLogger LOGGER = new ClientLogger(NamespacesImpl.class);

    private final NamespacesClient innerClient;

    private final com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager;

    public NamespacesImpl(NamespacesClient innerClient,
        com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EHNamespace> list() {
        PagedIterable<EHNamespaceInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new EHNamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<EHNamespace> list(Context context) {
        PagedIterable<EHNamespaceInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new EHNamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<EHNamespace> listByResourceGroup(String resourceGroupName) {
        PagedIterable<EHNamespaceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new EHNamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<EHNamespace> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<EHNamespaceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new EHNamespaceImpl(inner1, this.manager()));
    }

    public void deleteByResourceGroup(String resourceGroupName, String namespaceName) {
        this.serviceClient().delete(resourceGroupName, namespaceName);
    }

    public void delete(String resourceGroupName, String namespaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, namespaceName, context);
    }

    public Response<EHNamespace> getByResourceGroupWithResponse(String resourceGroupName, String namespaceName,
        Context context) {
        Response<EHNamespaceInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, namespaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new EHNamespaceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EHNamespace getByResourceGroup(String resourceGroupName, String namespaceName) {
        EHNamespaceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, namespaceName);
        if (inner != null) {
            return new EHNamespaceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkRuleSet> createOrUpdateNetworkRuleSetWithResponse(String resourceGroupName,
        String namespaceName, NetworkRuleSetInner parameters, Context context) {
        Response<NetworkRuleSetInner> inner = this.serviceClient()
            .createOrUpdateNetworkRuleSetWithResponse(resourceGroupName, namespaceName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetworkRuleSetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkRuleSet createOrUpdateNetworkRuleSet(String resourceGroupName, String namespaceName,
        NetworkRuleSetInner parameters) {
        NetworkRuleSetInner inner
            = this.serviceClient().createOrUpdateNetworkRuleSet(resourceGroupName, namespaceName, parameters);
        if (inner != null) {
            return new NetworkRuleSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkRuleSet> getNetworkRuleSetWithResponse(String resourceGroupName, String namespaceName,
        Context context) {
        Response<NetworkRuleSetInner> inner
            = this.serviceClient().getNetworkRuleSetWithResponse(resourceGroupName, namespaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetworkRuleSetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkRuleSet getNetworkRuleSet(String resourceGroupName, String namespaceName) {
        NetworkRuleSetInner inner = this.serviceClient().getNetworkRuleSet(resourceGroupName, namespaceName);
        if (inner != null) {
            return new NetworkRuleSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkRuleSetListResult> listNetworkRuleSetWithResponse(String resourceGroupName,
        String namespaceName, Context context) {
        Response<NetworkRuleSetListResultInner> inner
            = this.serviceClient().listNetworkRuleSetWithResponse(resourceGroupName, namespaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetworkRuleSetListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkRuleSetListResult listNetworkRuleSet(String resourceGroupName, String namespaceName) {
        NetworkRuleSetListResultInner inner = this.serviceClient().listNetworkRuleSet(resourceGroupName, namespaceName);
        if (inner != null) {
            return new NetworkRuleSetListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(String resourceGroupName, String namespaceName) {
        PagedIterable<AuthorizationRuleInner> inner
            = this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(String resourceGroupName, String namespaceName,
        Context context) {
        PagedIterable<AuthorizationRuleInner> inner
            = this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public Response<Void> deleteAuthorizationRuleWithResponse(String resourceGroupName, String namespaceName,
        String authorizationRuleName, Context context) {
        return this.serviceClient().deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName,
            authorizationRuleName, context);
    }

    public void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        this.serviceClient().deleteAuthorizationRule(resourceGroupName, namespaceName, authorizationRuleName);
    }

    public Response<AuthorizationRule> getAuthorizationRuleWithResponse(String resourceGroupName, String namespaceName,
        String authorizationRuleName, Context context) {
        Response<AuthorizationRuleInner> inner = this.serviceClient()
            .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AuthorizationRule getAuthorizationRule(String resourceGroupName, String namespaceName,
        String authorizationRuleName) {
        AuthorizationRuleInner inner
            = this.serviceClient().getAuthorizationRule(resourceGroupName, namespaceName, authorizationRuleName);
        if (inner != null) {
            return new AuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> listKeysWithResponse(String resourceGroupName, String namespaceName,
        String authorizationRuleName, Context context) {
        Response<AccessKeysInner> inner = this.serviceClient().listKeysWithResponse(resourceGroupName, namespaceName,
            authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys listKeys(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        AccessKeysInner inner = this.serviceClient().listKeys(resourceGroupName, namespaceName, authorizationRuleName);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> regenerateKeysWithResponse(String resourceGroupName, String namespaceName,
        String authorizationRuleName, RegenerateAccessKeyParameters parameters, Context context) {
        Response<AccessKeysInner> inner = this.serviceClient().regenerateKeysWithResponse(resourceGroupName,
            namespaceName, authorizationRuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys regenerateKeys(String resourceGroupName, String namespaceName, String authorizationRuleName,
        RegenerateAccessKeyParameters parameters) {
        AccessKeysInner inner
            = this.serviceClient().regenerateKeys(resourceGroupName, namespaceName, authorizationRuleName, parameters);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityResult>
        checkNameAvailabilityWithResponse(CheckNameAvailabilityParameter parameters, Context context) {
        Response<CheckNameAvailabilityResultInner> inner
            = this.serviceClient().checkNameAvailabilityWithResponse(parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CheckNameAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameAvailabilityResult checkNameAvailability(CheckNameAvailabilityParameter parameters) {
        CheckNameAvailabilityResultInner inner = this.serviceClient().checkNameAvailability(parameters);
        if (inner != null) {
            return new CheckNameAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EHNamespace getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, namespaceName, Context.NONE).getValue();
    }

    public Response<EHNamespace> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, namespaceName, context);
    }

    public AuthorizationRule getAuthorizationRuleById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String authorizationRuleName = ResourceManagerUtils.getValueFromIdByName(id, "authorizationRules");
        if (authorizationRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'authorizationRules'.", id)));
        }
        return this
            .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, Context.NONE)
            .getValue();
    }

    public Response<AuthorizationRule> getAuthorizationRuleByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String authorizationRuleName = ResourceManagerUtils.getValueFromIdByName(id, "authorizationRules");
        if (authorizationRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'authorizationRules'.", id)));
        }
        return this.getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        this.delete(resourceGroupName, namespaceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        this.delete(resourceGroupName, namespaceName, context);
    }

    public void deleteAuthorizationRuleById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String authorizationRuleName = ResourceManagerUtils.getValueFromIdByName(id, "authorizationRules");
        if (authorizationRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'authorizationRules'.", id)));
        }
        this.deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, Context.NONE);
    }

    public Response<Void> deleteAuthorizationRuleByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String authorizationRuleName = ResourceManagerUtils.getValueFromIdByName(id, "authorizationRules");
        if (authorizationRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'authorizationRules'.", id)));
        }
        return this.deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName,
            context);
    }

    private NamespacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager() {
        return this.serviceManager;
    }

    public EHNamespaceImpl define(String name) {
        return new EHNamespaceImpl(name, this.manager());
    }

    public AuthorizationRuleImpl defineAuthorizationRule(String name) {
        return new AuthorizationRuleImpl(name, this.manager());
    }
}
