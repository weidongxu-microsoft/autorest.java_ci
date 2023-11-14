// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.search.generated.fluent.AdminKeysClient;
import com.azure.resourcemanager.search.generated.fluent.models.AdminKeyResultInner;
import com.azure.resourcemanager.search.generated.models.AdminKeyKind;
import com.azure.resourcemanager.search.generated.models.AdminKeyResult;
import com.azure.resourcemanager.search.generated.models.AdminKeys;
import java.util.UUID;

public final class AdminKeysImpl implements AdminKeys {
    private static final ClientLogger LOGGER = new ClientLogger(AdminKeysImpl.class);

    private final AdminKeysClient innerClient;

    private final com.azure.resourcemanager.search.generated.SearchManager serviceManager;

    public AdminKeysImpl(AdminKeysClient innerClient,
        com.azure.resourcemanager.search.generated.SearchManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<AdminKeyResult> getWithResponse(String resourceGroupName, String searchServiceName,
        UUID clientRequestId, Context context) {
        Response<AdminKeyResultInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, searchServiceName, clientRequestId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AdminKeyResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AdminKeyResult get(String resourceGroupName, String searchServiceName) {
        AdminKeyResultInner inner = this.serviceClient().get(resourceGroupName, searchServiceName);
        if (inner != null) {
            return new AdminKeyResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AdminKeyResult> regenerateWithResponse(String resourceGroupName, String searchServiceName,
        AdminKeyKind keyKind, UUID clientRequestId, Context context) {
        Response<AdminKeyResultInner> inner = this.serviceClient().regenerateWithResponse(resourceGroupName,
            searchServiceName, keyKind, clientRequestId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AdminKeyResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AdminKeyResult regenerate(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind) {
        AdminKeyResultInner inner = this.serviceClient().regenerate(resourceGroupName, searchServiceName, keyKind);
        if (inner != null) {
            return new AdminKeyResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private AdminKeysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.search.generated.SearchManager manager() {
        return this.serviceManager;
    }
}
