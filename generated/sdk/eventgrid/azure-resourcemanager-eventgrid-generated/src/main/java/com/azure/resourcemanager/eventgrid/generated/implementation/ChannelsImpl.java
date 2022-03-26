// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.generated.fluent.ChannelsClient;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.ChannelInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.EventSubscriptionFullUrlInner;
import com.azure.resourcemanager.eventgrid.generated.models.Channel;
import com.azure.resourcemanager.eventgrid.generated.models.ChannelUpdateParameters;
import com.azure.resourcemanager.eventgrid.generated.models.Channels;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscriptionFullUrl;

public final class ChannelsImpl implements Channels {
    private static final ClientLogger LOGGER = new ClientLogger(ChannelsImpl.class);

    private final ChannelsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    public ChannelsImpl(
        ChannelsClient innerClient, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Channel get(String resourceGroupName, String partnerNamespaceName, String channelName) {
        ChannelInner inner = this.serviceClient().get(resourceGroupName, partnerNamespaceName, channelName);
        if (inner != null) {
            return new ChannelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Channel> getWithResponse(
        String resourceGroupName, String partnerNamespaceName, String channelName, Context context) {
        Response<ChannelInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, partnerNamespaceName, channelName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ChannelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String partnerNamespaceName, String channelName) {
        this.serviceClient().delete(resourceGroupName, partnerNamespaceName, channelName);
    }

    public void delete(String resourceGroupName, String partnerNamespaceName, String channelName, Context context) {
        this.serviceClient().delete(resourceGroupName, partnerNamespaceName, channelName, context);
    }

    public void update(
        String resourceGroupName,
        String partnerNamespaceName,
        String channelName,
        ChannelUpdateParameters channelUpdateParameters) {
        this.serviceClient().update(resourceGroupName, partnerNamespaceName, channelName, channelUpdateParameters);
    }

    public Response<Void> updateWithResponse(
        String resourceGroupName,
        String partnerNamespaceName,
        String channelName,
        ChannelUpdateParameters channelUpdateParameters,
        Context context) {
        return this
            .serviceClient()
            .updateWithResponse(resourceGroupName, partnerNamespaceName, channelName, channelUpdateParameters, context);
    }

    public PagedIterable<Channel> listByPartnerNamespace(String resourceGroupName, String partnerNamespaceName) {
        PagedIterable<ChannelInner> inner =
            this.serviceClient().listByPartnerNamespace(resourceGroupName, partnerNamespaceName);
        return Utils.mapPage(inner, inner1 -> new ChannelImpl(inner1, this.manager()));
    }

    public PagedIterable<Channel> listByPartnerNamespace(
        String resourceGroupName, String partnerNamespaceName, String filter, Integer top, Context context) {
        PagedIterable<ChannelInner> inner =
            this.serviceClient().listByPartnerNamespace(resourceGroupName, partnerNamespaceName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new ChannelImpl(inner1, this.manager()));
    }

    public EventSubscriptionFullUrl getFullUrl(
        String resourceGroupName, String partnerNamespaceName, String channelName) {
        EventSubscriptionFullUrlInner inner =
            this.serviceClient().getFullUrl(resourceGroupName, partnerNamespaceName, channelName);
        if (inner != null) {
            return new EventSubscriptionFullUrlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EventSubscriptionFullUrl> getFullUrlWithResponse(
        String resourceGroupName, String partnerNamespaceName, String channelName, Context context) {
        Response<EventSubscriptionFullUrlInner> inner =
            this.serviceClient().getFullUrlWithResponse(resourceGroupName, partnerNamespaceName, channelName, context);
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

    public Channel getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerNamespaceName = Utils.getValueFromIdByName(id, "partnerNamespaces");
        if (partnerNamespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerNamespaces'.", id)));
        }
        String channelName = Utils.getValueFromIdByName(id, "channels");
        if (channelName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'channels'.", id)));
        }
        return this.getWithResponse(resourceGroupName, partnerNamespaceName, channelName, Context.NONE).getValue();
    }

    public Response<Channel> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerNamespaceName = Utils.getValueFromIdByName(id, "partnerNamespaces");
        if (partnerNamespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerNamespaces'.", id)));
        }
        String channelName = Utils.getValueFromIdByName(id, "channels");
        if (channelName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'channels'.", id)));
        }
        return this.getWithResponse(resourceGroupName, partnerNamespaceName, channelName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerNamespaceName = Utils.getValueFromIdByName(id, "partnerNamespaces");
        if (partnerNamespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerNamespaces'.", id)));
        }
        String channelName = Utils.getValueFromIdByName(id, "channels");
        if (channelName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'channels'.", id)));
        }
        this.delete(resourceGroupName, partnerNamespaceName, channelName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerNamespaceName = Utils.getValueFromIdByName(id, "partnerNamespaces");
        if (partnerNamespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerNamespaces'.", id)));
        }
        String channelName = Utils.getValueFromIdByName(id, "channels");
        if (channelName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'channels'.", id)));
        }
        this.delete(resourceGroupName, partnerNamespaceName, channelName, context);
    }

    private ChannelsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }

    public ChannelImpl define(String name) {
        return new ChannelImpl(name, this.manager());
    }
}
