// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.relay.generated.fluent.HybridConnectionsClient;
import com.azure.resourcemanager.relay.generated.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.relay.generated.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.relay.generated.fluent.models.HybridConnectionInner;
import com.azure.resourcemanager.relay.generated.models.AccessKeys;
import com.azure.resourcemanager.relay.generated.models.AuthorizationRule;
import com.azure.resourcemanager.relay.generated.models.HybridConnection;
import com.azure.resourcemanager.relay.generated.models.HybridConnections;
import com.azure.resourcemanager.relay.generated.models.RegenerateAccessKeyParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class HybridConnectionsImpl implements HybridConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HybridConnectionsImpl.class);

    private final HybridConnectionsClient innerClient;

    private final com.azure.resourcemanager.relay.generated.RelayManager serviceManager;

    public HybridConnectionsImpl(
        HybridConnectionsClient innerClient, com.azure.resourcemanager.relay.generated.RelayManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<HybridConnection> listByNamespace(String resourceGroupName, String namespaceName) {
        PagedIterable<HybridConnectionInner> inner =
            this.serviceClient().listByNamespace(resourceGroupName, namespaceName);
        return Utils.mapPage(inner, inner1 -> new HybridConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<HybridConnection> listByNamespace(
        String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<HybridConnectionInner> inner =
            this.serviceClient().listByNamespace(resourceGroupName, namespaceName, context);
        return Utils.mapPage(inner, inner1 -> new HybridConnectionImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String namespaceName, String hybridConnectionName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, hybridConnectionName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String hybridConnectionName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, namespaceName, hybridConnectionName, context);
    }

    public HybridConnection get(String resourceGroupName, String namespaceName, String hybridConnectionName) {
        HybridConnectionInner inner = this.serviceClient().get(resourceGroupName, namespaceName, hybridConnectionName);
        if (inner != null) {
            return new HybridConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<HybridConnection> getWithResponse(
        String resourceGroupName, String namespaceName, String hybridConnectionName, Context context) {
        Response<HybridConnectionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, namespaceName, hybridConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new HybridConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String hybridConnectionName) {
        PagedIterable<AuthorizationRuleInner> inner =
            this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, hybridConnectionName);
        return Utils.mapPage(inner, inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String hybridConnectionName, Context context) {
        PagedIterable<AuthorizationRuleInner> inner =
            this
                .serviceClient()
                .listAuthorizationRules(resourceGroupName, namespaceName, hybridConnectionName, context);
        return Utils.mapPage(inner, inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public AuthorizationRule createOrUpdateAuthorizationRule(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters) {
        AuthorizationRuleInner inner =
            this
                .serviceClient()
                .createOrUpdateAuthorizationRule(
                    resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName, parameters);
        if (inner != null) {
            return new AuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AuthorizationRule> createOrUpdateAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters,
        Context context) {
        Response<AuthorizationRuleInner> inner =
            this
                .serviceClient()
                .createOrUpdateAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteAuthorizationRule(
        String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName) {
        this
            .serviceClient()
            .deleteAuthorizationRule(resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName);
    }

    public Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        Context context) {
        return this
            .serviceClient()
            .deleteAuthorizationRuleWithResponse(
                resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName, context);
    }

    public AuthorizationRule getAuthorizationRule(
        String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName) {
        AuthorizationRuleInner inner =
            this
                .serviceClient()
                .getAuthorizationRule(resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName);
        if (inner != null) {
            return new AuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AuthorizationRule> getAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        Context context) {
        Response<AuthorizationRuleInner> inner =
            this
                .serviceClient()
                .getAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys listKeys(
        String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName) {
        AccessKeysInner inner =
            this
                .serviceClient()
                .listKeys(resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> listKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        Context context) {
        Response<AccessKeysInner> inner =
            this
                .serviceClient()
                .listKeysWithResponse(
                    resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys regenerateKeys(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters) {
        AccessKeysInner inner =
            this
                .serviceClient()
                .regenerateKeys(
                    resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName, parameters);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context) {
        Response<AccessKeysInner> inner =
            this
                .serviceClient()
                .regenerateKeysWithResponse(
                    resourceGroupName, namespaceName, hybridConnectionName, authorizationRuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public HybridConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String hybridConnectionName = Utils.getValueFromIdByName(id, "hybridConnections");
        if (hybridConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'hybridConnections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, hybridConnectionName, Context.NONE).getValue();
    }

    public Response<HybridConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String hybridConnectionName = Utils.getValueFromIdByName(id, "hybridConnections");
        if (hybridConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'hybridConnections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, hybridConnectionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String hybridConnectionName = Utils.getValueFromIdByName(id, "hybridConnections");
        if (hybridConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'hybridConnections'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, namespaceName, hybridConnectionName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String hybridConnectionName = Utils.getValueFromIdByName(id, "hybridConnections");
        if (hybridConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'hybridConnections'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, namespaceName, hybridConnectionName, context);
    }

    private HybridConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.relay.generated.RelayManager manager() {
        return this.serviceManager;
    }

    public HybridConnectionImpl define(String name) {
        return new HybridConnectionImpl(name, this.manager());
    }
}
