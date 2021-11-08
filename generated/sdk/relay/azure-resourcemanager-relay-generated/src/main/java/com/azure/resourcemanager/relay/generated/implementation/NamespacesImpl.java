// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.relay.generated.fluent.NamespacesClient;
import com.azure.resourcemanager.relay.generated.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.relay.generated.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.relay.generated.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.relay.generated.fluent.models.RelayNamespaceInner;
import com.azure.resourcemanager.relay.generated.models.AccessKeys;
import com.azure.resourcemanager.relay.generated.models.AuthorizationRule;
import com.azure.resourcemanager.relay.generated.models.CheckNameAvailability;
import com.azure.resourcemanager.relay.generated.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.relay.generated.models.Namespaces;
import com.azure.resourcemanager.relay.generated.models.RegenerateAccessKeyParameters;
import com.azure.resourcemanager.relay.generated.models.RelayNamespace;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NamespacesImpl implements Namespaces {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NamespacesImpl.class);

    private final NamespacesClient innerClient;

    private final com.azure.resourcemanager.relay.generated.RelayManager serviceManager;

    public NamespacesImpl(
        NamespacesClient innerClient, com.azure.resourcemanager.relay.generated.RelayManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameAvailabilityResult checkNameAvailability(CheckNameAvailability parameters) {
        CheckNameAvailabilityResultInner inner = this.serviceClient().checkNameAvailability(parameters);
        if (inner != null) {
            return new CheckNameAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(
        CheckNameAvailability parameters, Context context) {
        Response<CheckNameAvailabilityResultInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<RelayNamespace> list() {
        PagedIterable<RelayNamespaceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new RelayNamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<RelayNamespace> list(Context context) {
        PagedIterable<RelayNamespaceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new RelayNamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<RelayNamespace> listByResourceGroup(String resourceGroupName) {
        PagedIterable<RelayNamespaceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new RelayNamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<RelayNamespace> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<RelayNamespaceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new RelayNamespaceImpl(inner1, this.manager()));
    }

    public void deleteByResourceGroup(String resourceGroupName, String namespaceName) {
        this.serviceClient().delete(resourceGroupName, namespaceName);
    }

    public void delete(String resourceGroupName, String namespaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, namespaceName, context);
    }

    public RelayNamespace getByResourceGroup(String resourceGroupName, String namespaceName) {
        RelayNamespaceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, namespaceName);
        if (inner != null) {
            return new RelayNamespaceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RelayNamespace> getByResourceGroupWithResponse(
        String resourceGroupName, String namespaceName, Context context) {
        Response<RelayNamespaceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, namespaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RelayNamespaceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(String resourceGroupName, String namespaceName) {
        PagedIterable<AuthorizationRuleInner> inner =
            this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName);
        return Utils.mapPage(inner, inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<AuthorizationRuleInner> inner =
            this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, context);
        return Utils.mapPage(inner, inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        this.serviceClient().deleteAuthorizationRule(resourceGroupName, namespaceName, authorizationRuleName);
    }

    public Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context) {
        return this
            .serviceClient()
            .deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
    }

    public AuthorizationRule getAuthorizationRule(
        String resourceGroupName, String namespaceName, String authorizationRuleName) {
        AuthorizationRuleInner inner =
            this.serviceClient().getAuthorizationRule(resourceGroupName, namespaceName, authorizationRuleName);
        if (inner != null) {
            return new AuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AuthorizationRule> getAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context) {
        Response<AuthorizationRuleInner> inner =
            this
                .serviceClient()
                .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
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

    public AccessKeys listKeys(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        AccessKeysInner inner = this.serviceClient().listKeys(resourceGroupName, namespaceName, authorizationRuleName);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> listKeysWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context) {
        Response<AccessKeysInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
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
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters) {
        AccessKeysInner inner =
            this.serviceClient().regenerateKeys(resourceGroupName, namespaceName, authorizationRuleName, parameters);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context) {
        Response<AccessKeysInner> inner =
            this
                .serviceClient()
                .regenerateKeysWithResponse(
                    resourceGroupName, namespaceName, authorizationRuleName, parameters, context);
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

    public RelayNamespace getById(String id) {
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
        return this.getByResourceGroupWithResponse(resourceGroupName, namespaceName, Context.NONE).getValue();
    }

    public Response<RelayNamespace> getByIdWithResponse(String id, Context context) {
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
        return this.getByResourceGroupWithResponse(resourceGroupName, namespaceName, context);
    }

    public AuthorizationRule getAuthorizationRuleById(String id) {
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
        String authorizationRuleName = Utils.getValueFromIdByName(id, "authorizationRules");
        if (authorizationRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'authorizationRules'.", id)));
        }
        return this
            .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, Context.NONE)
            .getValue();
    }

    public Response<AuthorizationRule> getAuthorizationRuleByIdWithResponse(String id, Context context) {
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
        String authorizationRuleName = Utils.getValueFromIdByName(id, "authorizationRules");
        if (authorizationRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'authorizationRules'.", id)));
        }
        return this.getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
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
        this.delete(resourceGroupName, namespaceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
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
        this.delete(resourceGroupName, namespaceName, context);
    }

    public void deleteAuthorizationRuleById(String id) {
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
        String authorizationRuleName = Utils.getValueFromIdByName(id, "authorizationRules");
        if (authorizationRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'authorizationRules'.", id)));
        }
        this.deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, Context.NONE);
    }

    public Response<Void> deleteAuthorizationRuleByIdWithResponse(String id, Context context) {
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
        String authorizationRuleName = Utils.getValueFromIdByName(id, "authorizationRules");
        if (authorizationRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'authorizationRules'.", id)));
        }
        return this
            .deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
    }

    private NamespacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.relay.generated.RelayManager manager() {
        return this.serviceManager;
    }

    public RelayNamespaceImpl define(String name) {
        return new RelayNamespaceImpl(name, this.manager());
    }

    public AuthorizationRuleImpl defineAuthorizationRule(String name) {
        return new AuthorizationRuleImpl(name, this.manager());
    }
}
