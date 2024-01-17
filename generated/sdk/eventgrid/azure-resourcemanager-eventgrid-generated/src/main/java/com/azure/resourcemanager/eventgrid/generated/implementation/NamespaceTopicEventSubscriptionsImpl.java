// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.generated.fluent.NamespaceTopicEventSubscriptionsClient;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.DeliveryAttributeListResultInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.SubscriptionInner;
import com.azure.resourcemanager.eventgrid.generated.models.DeliveryAttributeListResult;
import com.azure.resourcemanager.eventgrid.generated.models.NamespaceTopicEventSubscriptions;
import com.azure.resourcemanager.eventgrid.generated.models.Subscription;

public final class NamespaceTopicEventSubscriptionsImpl implements NamespaceTopicEventSubscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(NamespaceTopicEventSubscriptionsImpl.class);

    private final NamespaceTopicEventSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    public NamespaceTopicEventSubscriptionsImpl(NamespaceTopicEventSubscriptionsClient innerClient,
        com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Subscription> getWithResponse(String resourceGroupName, String namespaceName, String topicName,
        String eventSubscriptionName, Context context) {
        Response<SubscriptionInner> inner = this.serviceClient().getWithResponse(resourceGroupName, namespaceName,
            topicName, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Subscription get(String resourceGroupName, String namespaceName, String topicName,
        String eventSubscriptionName) {
        SubscriptionInner inner
            = this.serviceClient().get(resourceGroupName, namespaceName, topicName, eventSubscriptionName);
        if (inner != null) {
            return new SubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String namespaceName, String topicName, String eventSubscriptionName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, topicName, eventSubscriptionName);
    }

    public void delete(String resourceGroupName, String namespaceName, String topicName, String eventSubscriptionName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, namespaceName, topicName, eventSubscriptionName, context);
    }

    public PagedIterable<Subscription> listByNamespaceTopic(String resourceGroupName, String namespaceName,
        String topicName) {
        PagedIterable<SubscriptionInner> inner
            = this.serviceClient().listByNamespaceTopic(resourceGroupName, namespaceName, topicName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<Subscription> listByNamespaceTopic(String resourceGroupName, String namespaceName,
        String topicName, String filter, Integer top, Context context) {
        PagedIterable<SubscriptionInner> inner = this.serviceClient().listByNamespaceTopic(resourceGroupName,
            namespaceName, topicName, filter, top, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SubscriptionImpl(inner1, this.manager()));
    }

    public Response<DeliveryAttributeListResult> getDeliveryAttributesWithResponse(String resourceGroupName,
        String namespaceName, String topicName, String eventSubscriptionName, Context context) {
        Response<DeliveryAttributeListResultInner> inner = this.serviceClient().getDeliveryAttributesWithResponse(
            resourceGroupName, namespaceName, topicName, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DeliveryAttributeListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DeliveryAttributeListResult getDeliveryAttributes(String resourceGroupName, String namespaceName,
        String topicName, String eventSubscriptionName) {
        DeliveryAttributeListResultInner inner = this.serviceClient().getDeliveryAttributes(resourceGroupName,
            namespaceName, topicName, eventSubscriptionName);
        if (inner != null) {
            return new DeliveryAttributeListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Subscription getById(String id) {
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
        String topicName = ResourceManagerUtils.getValueFromIdByName(id, "topics");
        if (topicName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topics'.", id)));
        }
        String eventSubscriptionName = ResourceManagerUtils.getValueFromIdByName(id, "eventSubscriptions");
        if (eventSubscriptionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'eventSubscriptions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, topicName, eventSubscriptionName, Context.NONE)
            .getValue();
    }

    public Response<Subscription> getByIdWithResponse(String id, Context context) {
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
        String topicName = ResourceManagerUtils.getValueFromIdByName(id, "topics");
        if (topicName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topics'.", id)));
        }
        String eventSubscriptionName = ResourceManagerUtils.getValueFromIdByName(id, "eventSubscriptions");
        if (eventSubscriptionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'eventSubscriptions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, topicName, eventSubscriptionName, context);
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
        String topicName = ResourceManagerUtils.getValueFromIdByName(id, "topics");
        if (topicName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topics'.", id)));
        }
        String eventSubscriptionName = ResourceManagerUtils.getValueFromIdByName(id, "eventSubscriptions");
        if (eventSubscriptionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'eventSubscriptions'.", id)));
        }
        this.delete(resourceGroupName, namespaceName, topicName, eventSubscriptionName, Context.NONE);
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
        String topicName = ResourceManagerUtils.getValueFromIdByName(id, "topics");
        if (topicName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topics'.", id)));
        }
        String eventSubscriptionName = ResourceManagerUtils.getValueFromIdByName(id, "eventSubscriptions");
        if (eventSubscriptionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'eventSubscriptions'.", id)));
        }
        this.delete(resourceGroupName, namespaceName, topicName, eventSubscriptionName, context);
    }

    private NamespaceTopicEventSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }

    public SubscriptionImpl define(String name) {
        return new SubscriptionImpl(name, this.manager());
    }
}
