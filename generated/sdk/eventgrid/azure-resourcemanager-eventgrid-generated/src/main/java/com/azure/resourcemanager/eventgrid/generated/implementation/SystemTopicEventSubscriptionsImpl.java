// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.generated.fluent.SystemTopicEventSubscriptionsClient;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.DeliveryAttributeListResultInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.EventSubscriptionFullUrlInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.EventSubscriptionInner;
import com.azure.resourcemanager.eventgrid.generated.models.DeliveryAttributeListResult;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscription;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscriptionFullUrl;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscriptionUpdateParameters;
import com.azure.resourcemanager.eventgrid.generated.models.SystemTopicEventSubscriptions;

public final class SystemTopicEventSubscriptionsImpl implements SystemTopicEventSubscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(SystemTopicEventSubscriptionsImpl.class);

    private final SystemTopicEventSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    public SystemTopicEventSubscriptionsImpl(
        SystemTopicEventSubscriptionsClient innerClient,
        com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<DeliveryAttributeListResult> getDeliveryAttributesWithResponse(
        String resourceGroupName, String systemTopicName, String eventSubscriptionName, Context context) {
        Response<DeliveryAttributeListResultInner> inner =
            this
                .serviceClient()
                .getDeliveryAttributesWithResponse(resourceGroupName, systemTopicName, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeliveryAttributeListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DeliveryAttributeListResult getDeliveryAttributes(
        String resourceGroupName, String systemTopicName, String eventSubscriptionName) {
        DeliveryAttributeListResultInner inner =
            this.serviceClient().getDeliveryAttributes(resourceGroupName, systemTopicName, eventSubscriptionName);
        if (inner != null) {
            return new DeliveryAttributeListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EventSubscription> getWithResponse(
        String resourceGroupName, String systemTopicName, String eventSubscriptionName, Context context) {
        Response<EventSubscriptionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, systemTopicName, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EventSubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EventSubscription get(String resourceGroupName, String systemTopicName, String eventSubscriptionName) {
        EventSubscriptionInner inner =
            this.serviceClient().get(resourceGroupName, systemTopicName, eventSubscriptionName);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EventSubscription createOrUpdate(
        String resourceGroupName,
        String systemTopicName,
        String eventSubscriptionName,
        EventSubscriptionInner eventSubscriptionInfo) {
        EventSubscriptionInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, systemTopicName, eventSubscriptionName, eventSubscriptionInfo);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EventSubscription createOrUpdate(
        String resourceGroupName,
        String systemTopicName,
        String eventSubscriptionName,
        EventSubscriptionInner eventSubscriptionInfo,
        Context context) {
        EventSubscriptionInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName, systemTopicName, eventSubscriptionName, eventSubscriptionInfo, context);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String systemTopicName, String eventSubscriptionName) {
        this.serviceClient().delete(resourceGroupName, systemTopicName, eventSubscriptionName);
    }

    public void delete(
        String resourceGroupName, String systemTopicName, String eventSubscriptionName, Context context) {
        this.serviceClient().delete(resourceGroupName, systemTopicName, eventSubscriptionName, context);
    }

    public EventSubscription update(
        String resourceGroupName,
        String systemTopicName,
        String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters) {
        EventSubscriptionInner inner =
            this
                .serviceClient()
                .update(resourceGroupName, systemTopicName, eventSubscriptionName, eventSubscriptionUpdateParameters);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EventSubscription update(
        String resourceGroupName,
        String systemTopicName,
        String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters,
        Context context) {
        EventSubscriptionInner inner =
            this
                .serviceClient()
                .update(
                    resourceGroupName,
                    systemTopicName,
                    eventSubscriptionName,
                    eventSubscriptionUpdateParameters,
                    context);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EventSubscriptionFullUrl> getFullUrlWithResponse(
        String resourceGroupName, String systemTopicName, String eventSubscriptionName, Context context) {
        Response<EventSubscriptionFullUrlInner> inner =
            this
                .serviceClient()
                .getFullUrlWithResponse(resourceGroupName, systemTopicName, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EventSubscriptionFullUrlImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EventSubscriptionFullUrl getFullUrl(
        String resourceGroupName, String systemTopicName, String eventSubscriptionName) {
        EventSubscriptionFullUrlInner inner =
            this.serviceClient().getFullUrl(resourceGroupName, systemTopicName, eventSubscriptionName);
        if (inner != null) {
            return new EventSubscriptionFullUrlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<EventSubscription> listBySystemTopic(String resourceGroupName, String systemTopicName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listBySystemTopic(resourceGroupName, systemTopicName);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listBySystemTopic(
        String resourceGroupName, String systemTopicName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listBySystemTopic(resourceGroupName, systemTopicName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    private SystemTopicEventSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }
}
