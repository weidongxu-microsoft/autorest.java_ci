// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.relay.generated.fluent.WcfRelaysClient;
import com.azure.resourcemanager.relay.generated.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.relay.generated.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.relay.generated.fluent.models.WcfRelayInner;
import com.azure.resourcemanager.relay.generated.models.AccessKeys;
import com.azure.resourcemanager.relay.generated.models.AuthorizationRule;
import com.azure.resourcemanager.relay.generated.models.RegenerateAccessKeyParameters;
import com.azure.resourcemanager.relay.generated.models.WcfRelay;
import com.azure.resourcemanager.relay.generated.models.WcfRelays;

public final class WcfRelaysImpl implements WcfRelays {
    private static final ClientLogger LOGGER = new ClientLogger(WcfRelaysImpl.class);

    private final WcfRelaysClient innerClient;

    private final com.azure.resourcemanager.relay.generated.RelayManager serviceManager;

    public WcfRelaysImpl(WcfRelaysClient innerClient,
        com.azure.resourcemanager.relay.generated.RelayManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(String resourceGroupName, String namespaceName,
        String relayName) {
        PagedIterable<AuthorizationRuleInner> inner
            = this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, relayName);
        return Utils.mapPage(inner, inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(String resourceGroupName, String namespaceName,
        String relayName, Context context) {
        PagedIterable<AuthorizationRuleInner> inner
            = this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, relayName, context);
        return Utils.mapPage(inner, inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public Response<AuthorizationRule> createOrUpdateAuthorizationRuleWithResponse(String resourceGroupName,
        String namespaceName, String relayName, String authorizationRuleName, AuthorizationRuleInner parameters,
        Context context) {
        Response<AuthorizationRuleInner> inner = this.serviceClient().createOrUpdateAuthorizationRuleWithResponse(
            resourceGroupName, namespaceName, relayName, authorizationRuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AuthorizationRule createOrUpdateAuthorizationRule(String resourceGroupName, String namespaceName,
        String relayName, String authorizationRuleName, AuthorizationRuleInner parameters) {
        AuthorizationRuleInner inner = this.serviceClient().createOrUpdateAuthorizationRule(resourceGroupName,
            namespaceName, relayName, authorizationRuleName, parameters);
        if (inner != null) {
            return new AuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteAuthorizationRuleWithResponse(String resourceGroupName, String namespaceName,
        String relayName, String authorizationRuleName, Context context) {
        return this.serviceClient().deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName, relayName,
            authorizationRuleName, context);
    }

    public void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String relayName,
        String authorizationRuleName) {
        this.serviceClient().deleteAuthorizationRule(resourceGroupName, namespaceName, relayName,
            authorizationRuleName);
    }

    public Response<AuthorizationRule> getAuthorizationRuleWithResponse(String resourceGroupName, String namespaceName,
        String relayName, String authorizationRuleName, Context context) {
        Response<AuthorizationRuleInner> inner = this.serviceClient().getAuthorizationRuleWithResponse(
            resourceGroupName, namespaceName, relayName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AuthorizationRule getAuthorizationRule(String resourceGroupName, String namespaceName, String relayName,
        String authorizationRuleName) {
        AuthorizationRuleInner inner = this.serviceClient().getAuthorizationRule(resourceGroupName, namespaceName,
            relayName, authorizationRuleName);
        if (inner != null) {
            return new AuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> listKeysWithResponse(String resourceGroupName, String namespaceName, String relayName,
        String authorizationRuleName, Context context) {
        Response<AccessKeysInner> inner = this.serviceClient().listKeysWithResponse(resourceGroupName, namespaceName,
            relayName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys listKeys(String resourceGroupName, String namespaceName, String relayName,
        String authorizationRuleName) {
        AccessKeysInner inner
            = this.serviceClient().listKeys(resourceGroupName, namespaceName, relayName, authorizationRuleName);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> regenerateKeysWithResponse(String resourceGroupName, String namespaceName,
        String relayName, String authorizationRuleName, RegenerateAccessKeyParameters parameters, Context context) {
        Response<AccessKeysInner> inner = this.serviceClient().regenerateKeysWithResponse(resourceGroupName,
            namespaceName, relayName, authorizationRuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys regenerateKeys(String resourceGroupName, String namespaceName, String relayName,
        String authorizationRuleName, RegenerateAccessKeyParameters parameters) {
        AccessKeysInner inner = this.serviceClient().regenerateKeys(resourceGroupName, namespaceName, relayName,
            authorizationRuleName, parameters);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<WcfRelay> listByNamespace(String resourceGroupName, String namespaceName) {
        PagedIterable<WcfRelayInner> inner = this.serviceClient().listByNamespace(resourceGroupName, namespaceName);
        return Utils.mapPage(inner, inner1 -> new WcfRelayImpl(inner1, this.manager()));
    }

    public PagedIterable<WcfRelay> listByNamespace(String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<WcfRelayInner> inner
            = this.serviceClient().listByNamespace(resourceGroupName, namespaceName, context);
        return Utils.mapPage(inner, inner1 -> new WcfRelayImpl(inner1, this.manager()));
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String namespaceName, String relayName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, namespaceName, relayName, context);
    }

    public void delete(String resourceGroupName, String namespaceName, String relayName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, relayName);
    }

    public Response<WcfRelay> getWithResponse(String resourceGroupName, String namespaceName, String relayName,
        Context context) {
        Response<WcfRelayInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, namespaceName, relayName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WcfRelayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WcfRelay get(String resourceGroupName, String namespaceName, String relayName) {
        WcfRelayInner inner = this.serviceClient().get(resourceGroupName, namespaceName, relayName);
        if (inner != null) {
            return new WcfRelayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public WcfRelay getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String relayName = Utils.getValueFromIdByName(id, "wcfRelays");
        if (relayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'wcfRelays'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, relayName, Context.NONE).getValue();
    }

    public Response<WcfRelay> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String relayName = Utils.getValueFromIdByName(id, "wcfRelays");
        if (relayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'wcfRelays'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, relayName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String relayName = Utils.getValueFromIdByName(id, "wcfRelays");
        if (relayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'wcfRelays'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, namespaceName, relayName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String relayName = Utils.getValueFromIdByName(id, "wcfRelays");
        if (relayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'wcfRelays'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, namespaceName, relayName, context);
    }

    private WcfRelaysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.relay.generated.RelayManager manager() {
        return this.serviceManager;
    }

    public WcfRelayImpl define(String name) {
        return new WcfRelayImpl(name, this.manager());
    }
}
