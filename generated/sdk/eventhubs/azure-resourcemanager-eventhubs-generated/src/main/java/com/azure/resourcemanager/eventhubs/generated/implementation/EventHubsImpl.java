// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.fluent.EventHubsClient;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.EventhubInner;
import com.azure.resourcemanager.eventhubs.generated.models.AccessKeys;
import com.azure.resourcemanager.eventhubs.generated.models.AuthorizationRule;
import com.azure.resourcemanager.eventhubs.generated.models.EventHubs;
import com.azure.resourcemanager.eventhubs.generated.models.Eventhub;
import com.azure.resourcemanager.eventhubs.generated.models.RegenerateAccessKeyParameters;

public final class EventHubsImpl implements EventHubs {
    private static final ClientLogger LOGGER = new ClientLogger(EventHubsImpl.class);

    private final EventHubsClient innerClient;

    private final com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager;

    public EventHubsImpl(EventHubsClient innerClient,
        com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(String resourceGroupName, String namespaceName,
        String eventHubName) {
        PagedIterable<AuthorizationRuleInner> inner
            = this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, eventHubName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(String resourceGroupName, String namespaceName,
        String eventHubName, Context context) {
        PagedIterable<AuthorizationRuleInner> inner
            = this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, eventHubName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public Response<AuthorizationRule> createOrUpdateAuthorizationRuleWithResponse(String resourceGroupName,
        String namespaceName, String eventHubName, String authorizationRuleName, AuthorizationRuleInner parameters,
        Context context) {
        Response<AuthorizationRuleInner> inner = this.serviceClient().createOrUpdateAuthorizationRuleWithResponse(
            resourceGroupName, namespaceName, eventHubName, authorizationRuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AuthorizationRule createOrUpdateAuthorizationRule(String resourceGroupName, String namespaceName,
        String eventHubName, String authorizationRuleName, AuthorizationRuleInner parameters) {
        AuthorizationRuleInner inner = this.serviceClient().createOrUpdateAuthorizationRule(resourceGroupName,
            namespaceName, eventHubName, authorizationRuleName, parameters);
        if (inner != null) {
            return new AuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AuthorizationRule> getAuthorizationRuleWithResponse(String resourceGroupName, String namespaceName,
        String eventHubName, String authorizationRuleName, Context context) {
        Response<AuthorizationRuleInner> inner = this.serviceClient().getAuthorizationRuleWithResponse(
            resourceGroupName, namespaceName, eventHubName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AuthorizationRule getAuthorizationRule(String resourceGroupName, String namespaceName, String eventHubName,
        String authorizationRuleName) {
        AuthorizationRuleInner inner = this.serviceClient().getAuthorizationRule(resourceGroupName, namespaceName,
            eventHubName, authorizationRuleName);
        if (inner != null) {
            return new AuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteAuthorizationRuleWithResponse(String resourceGroupName, String namespaceName,
        String eventHubName, String authorizationRuleName, Context context) {
        return this.serviceClient().deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName, eventHubName,
            authorizationRuleName, context);
    }

    public void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String eventHubName,
        String authorizationRuleName) {
        this.serviceClient().deleteAuthorizationRule(resourceGroupName, namespaceName, eventHubName,
            authorizationRuleName);
    }

    public Response<AccessKeys> listKeysWithResponse(String resourceGroupName, String namespaceName,
        String eventHubName, String authorizationRuleName, Context context) {
        Response<AccessKeysInner> inner = this.serviceClient().listKeysWithResponse(resourceGroupName, namespaceName,
            eventHubName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys listKeys(String resourceGroupName, String namespaceName, String eventHubName,
        String authorizationRuleName) {
        AccessKeysInner inner
            = this.serviceClient().listKeys(resourceGroupName, namespaceName, eventHubName, authorizationRuleName);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> regenerateKeysWithResponse(String resourceGroupName, String namespaceName,
        String eventHubName, String authorizationRuleName, RegenerateAccessKeyParameters parameters, Context context) {
        Response<AccessKeysInner> inner = this.serviceClient().regenerateKeysWithResponse(resourceGroupName,
            namespaceName, eventHubName, authorizationRuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys regenerateKeys(String resourceGroupName, String namespaceName, String eventHubName,
        String authorizationRuleName, RegenerateAccessKeyParameters parameters) {
        AccessKeysInner inner = this.serviceClient().regenerateKeys(resourceGroupName, namespaceName, eventHubName,
            authorizationRuleName, parameters);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Eventhub> listByNamespace(String resourceGroupName, String namespaceName) {
        PagedIterable<EventhubInner> inner = this.serviceClient().listByNamespace(resourceGroupName, namespaceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new EventhubImpl(inner1, this.manager()));
    }

    public PagedIterable<Eventhub> listByNamespace(String resourceGroupName, String namespaceName, Integer skip,
        Integer top, Context context) {
        PagedIterable<EventhubInner> inner
            = this.serviceClient().listByNamespace(resourceGroupName, namespaceName, skip, top, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new EventhubImpl(inner1, this.manager()));
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String namespaceName, String eventHubName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, namespaceName, eventHubName, context);
    }

    public void delete(String resourceGroupName, String namespaceName, String eventHubName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, eventHubName);
    }

    public Response<Eventhub> getWithResponse(String resourceGroupName, String namespaceName, String eventHubName,
        Context context) {
        Response<EventhubInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, namespaceName, eventHubName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new EventhubImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Eventhub get(String resourceGroupName, String namespaceName, String eventHubName) {
        EventhubInner inner = this.serviceClient().get(resourceGroupName, namespaceName, eventHubName);
        if (inner != null) {
            return new EventhubImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Eventhub getById(String id) {
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
        String eventHubName = ResourceManagerUtils.getValueFromIdByName(id, "eventhubs");
        if (eventHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'eventhubs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, eventHubName, Context.NONE).getValue();
    }

    public Response<Eventhub> getByIdWithResponse(String id, Context context) {
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
        String eventHubName = ResourceManagerUtils.getValueFromIdByName(id, "eventhubs");
        if (eventHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'eventhubs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, eventHubName, context);
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
        String eventHubName = ResourceManagerUtils.getValueFromIdByName(id, "eventhubs");
        if (eventHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'eventhubs'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, namespaceName, eventHubName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
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
        String eventHubName = ResourceManagerUtils.getValueFromIdByName(id, "eventhubs");
        if (eventHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'eventhubs'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, namespaceName, eventHubName, context);
    }

    private EventHubsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager() {
        return this.serviceManager;
    }

    public EventhubImpl define(String name) {
        return new EventhubImpl(name, this.manager());
    }
}
