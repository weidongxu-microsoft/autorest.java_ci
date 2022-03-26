// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.generated.fluent.DomainEventSubscriptionsClient;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.DeliveryAttributeListResultInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.EventSubscriptionFullUrlInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.EventSubscriptionInner;
import com.azure.resourcemanager.eventgrid.generated.models.DeliveryAttributeListResult;
import com.azure.resourcemanager.eventgrid.generated.models.DomainEventSubscriptions;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscription;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscriptionFullUrl;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscriptionUpdateParameters;

public final class DomainEventSubscriptionsImpl implements DomainEventSubscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(DomainEventSubscriptionsImpl.class);

    private final DomainEventSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    public DomainEventSubscriptionsImpl(
        DomainEventSubscriptionsClient innerClient,
        com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public EventSubscription get(String resourceGroupName, String domainName, String eventSubscriptionName) {
        EventSubscriptionInner inner = this.serviceClient().get(resourceGroupName, domainName, eventSubscriptionName);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EventSubscription> getWithResponse(
        String resourceGroupName, String domainName, String eventSubscriptionName, Context context) {
        Response<EventSubscriptionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, domainName, eventSubscriptionName, context);
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

    public EventSubscription createOrUpdate(
        String resourceGroupName,
        String domainName,
        String eventSubscriptionName,
        EventSubscriptionInner eventSubscriptionInfo) {
        EventSubscriptionInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, domainName, eventSubscriptionName, eventSubscriptionInfo);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EventSubscription createOrUpdate(
        String resourceGroupName,
        String domainName,
        String eventSubscriptionName,
        EventSubscriptionInner eventSubscriptionInfo,
        Context context) {
        EventSubscriptionInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, domainName, eventSubscriptionName, eventSubscriptionInfo, context);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String domainName, String eventSubscriptionName) {
        this.serviceClient().delete(resourceGroupName, domainName, eventSubscriptionName);
    }

    public void delete(String resourceGroupName, String domainName, String eventSubscriptionName, Context context) {
        this.serviceClient().delete(resourceGroupName, domainName, eventSubscriptionName, context);
    }

    public EventSubscription update(
        String resourceGroupName,
        String domainName,
        String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters) {
        EventSubscriptionInner inner =
            this
                .serviceClient()
                .update(resourceGroupName, domainName, eventSubscriptionName, eventSubscriptionUpdateParameters);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EventSubscription update(
        String resourceGroupName,
        String domainName,
        String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters,
        Context context) {
        EventSubscriptionInner inner =
            this
                .serviceClient()
                .update(
                    resourceGroupName, domainName, eventSubscriptionName, eventSubscriptionUpdateParameters, context);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EventSubscriptionFullUrl getFullUrl(
        String resourceGroupName, String domainName, String eventSubscriptionName) {
        EventSubscriptionFullUrlInner inner =
            this.serviceClient().getFullUrl(resourceGroupName, domainName, eventSubscriptionName);
        if (inner != null) {
            return new EventSubscriptionFullUrlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EventSubscriptionFullUrl> getFullUrlWithResponse(
        String resourceGroupName, String domainName, String eventSubscriptionName, Context context) {
        Response<EventSubscriptionFullUrlInner> inner =
            this.serviceClient().getFullUrlWithResponse(resourceGroupName, domainName, eventSubscriptionName, context);
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

    public PagedIterable<EventSubscription> list(String resourceGroupName, String domainName) {
        PagedIterable<EventSubscriptionInner> inner = this.serviceClient().list(resourceGroupName, domainName);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> list(String resourceGroupName, String domainName, Context context) {
        PagedIterable<EventSubscriptionInner> inner = this.serviceClient().list(resourceGroupName, domainName, context);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public DeliveryAttributeListResult getDeliveryAttributes(
        String resourceGroupName, String domainName, String eventSubscriptionName) {
        DeliveryAttributeListResultInner inner =
            this.serviceClient().getDeliveryAttributes(resourceGroupName, domainName, eventSubscriptionName);
        if (inner != null) {
            return new DeliveryAttributeListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeliveryAttributeListResult> getDeliveryAttributesWithResponse(
        String resourceGroupName, String domainName, String eventSubscriptionName, Context context) {
        Response<DeliveryAttributeListResultInner> inner =
            this
                .serviceClient()
                .getDeliveryAttributesWithResponse(resourceGroupName, domainName, eventSubscriptionName, context);
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

    private DomainEventSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }
}
