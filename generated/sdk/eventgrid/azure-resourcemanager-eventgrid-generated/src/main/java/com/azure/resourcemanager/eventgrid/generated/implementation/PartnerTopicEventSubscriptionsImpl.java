// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.generated.fluent.PartnerTopicEventSubscriptionsClient;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.DeliveryAttributeListResultInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.EventSubscriptionFullUrlInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.EventSubscriptionInner;
import com.azure.resourcemanager.eventgrid.generated.models.DeliveryAttributeListResult;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscription;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscriptionFullUrl;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscriptionUpdateParameters;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopicEventSubscriptions;

public final class PartnerTopicEventSubscriptionsImpl implements PartnerTopicEventSubscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(PartnerTopicEventSubscriptionsImpl.class);

    private final PartnerTopicEventSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    public PartnerTopicEventSubscriptionsImpl(PartnerTopicEventSubscriptionsClient innerClient,
        com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<EventSubscription> getWithResponse(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName, Context context) {
        Response<EventSubscriptionInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, partnerTopicName, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new EventSubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EventSubscription get(String resourceGroupName, String partnerTopicName, String eventSubscriptionName) {
        EventSubscriptionInner inner
            = this.serviceClient().get(resourceGroupName, partnerTopicName, eventSubscriptionName);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EventSubscription createOrUpdate(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName, EventSubscriptionInner eventSubscriptionInfo) {
        EventSubscriptionInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, partnerTopicName, eventSubscriptionName, eventSubscriptionInfo);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EventSubscription createOrUpdate(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName, EventSubscriptionInner eventSubscriptionInfo, Context context) {
        EventSubscriptionInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, partnerTopicName, eventSubscriptionName, eventSubscriptionInfo, context);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String partnerTopicName, String eventSubscriptionName) {
        this.serviceClient().delete(resourceGroupName, partnerTopicName, eventSubscriptionName);
    }

    public void delete(String resourceGroupName, String partnerTopicName, String eventSubscriptionName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, partnerTopicName, eventSubscriptionName, context);
    }

    public EventSubscription update(String resourceGroupName, String partnerTopicName, String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters) {
        EventSubscriptionInner inner = this.serviceClient()
            .update(resourceGroupName, partnerTopicName, eventSubscriptionName, eventSubscriptionUpdateParameters);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EventSubscription update(String resourceGroupName, String partnerTopicName, String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters, Context context) {
        EventSubscriptionInner inner = this.serviceClient()
            .update(resourceGroupName, partnerTopicName, eventSubscriptionName, eventSubscriptionUpdateParameters,
                context);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EventSubscriptionFullUrl> getFullUrlWithResponse(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName, Context context) {
        Response<EventSubscriptionFullUrlInner> inner = this.serviceClient()
            .getFullUrlWithResponse(resourceGroupName, partnerTopicName, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new EventSubscriptionFullUrlImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EventSubscriptionFullUrl getFullUrl(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName) {
        EventSubscriptionFullUrlInner inner
            = this.serviceClient().getFullUrl(resourceGroupName, partnerTopicName, eventSubscriptionName);
        if (inner != null) {
            return new EventSubscriptionFullUrlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<EventSubscription> listByPartnerTopic(String resourceGroupName, String partnerTopicName) {
        PagedIterable<EventSubscriptionInner> inner
            = this.serviceClient().listByPartnerTopic(resourceGroupName, partnerTopicName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByPartnerTopic(String resourceGroupName, String partnerTopicName,
        String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner
            = this.serviceClient().listByPartnerTopic(resourceGroupName, partnerTopicName, filter, top, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public Response<DeliveryAttributeListResult> getDeliveryAttributesWithResponse(String resourceGroupName,
        String partnerTopicName, String eventSubscriptionName, Context context) {
        Response<DeliveryAttributeListResultInner> inner = this.serviceClient()
            .getDeliveryAttributesWithResponse(resourceGroupName, partnerTopicName, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DeliveryAttributeListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DeliveryAttributeListResult getDeliveryAttributes(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName) {
        DeliveryAttributeListResultInner inner
            = this.serviceClient().getDeliveryAttributes(resourceGroupName, partnerTopicName, eventSubscriptionName);
        if (inner != null) {
            return new DeliveryAttributeListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PartnerTopicEventSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }
}
