// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.generated.fluent.ResourceProviderCommonsClient;
import com.azure.resourcemanager.iothub.generated.fluent.models.UserSubscriptionQuotaListResultInner;
import com.azure.resourcemanager.iothub.generated.models.ResourceProviderCommons;
import com.azure.resourcemanager.iothub.generated.models.UserSubscriptionQuotaListResult;

public final class ResourceProviderCommonsImpl implements ResourceProviderCommons {
    private static final ClientLogger LOGGER = new ClientLogger(ResourceProviderCommonsImpl.class);

    private final ResourceProviderCommonsClient innerClient;

    private final com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager;

    public ResourceProviderCommonsImpl(ResourceProviderCommonsClient innerClient,
        com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<UserSubscriptionQuotaListResult> getSubscriptionQuotaWithResponse(Context context) {
        Response<UserSubscriptionQuotaListResultInner> inner
            = this.serviceClient().getSubscriptionQuotaWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new UserSubscriptionQuotaListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public UserSubscriptionQuotaListResult getSubscriptionQuota() {
        UserSubscriptionQuotaListResultInner inner = this.serviceClient().getSubscriptionQuota();
        if (inner != null) {
            return new UserSubscriptionQuotaListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ResourceProviderCommonsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.iothub.generated.IotHubManager manager() {
        return this.serviceManager;
    }
}
