// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.generated.fluent.ApiKeysClient;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentApiKeyInner;
import com.azure.resourcemanager.applicationinsights.generated.models.ApiKeyRequest;
import com.azure.resourcemanager.applicationinsights.generated.models.ApiKeys;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentApiKey;

public final class ApiKeysImpl implements ApiKeys {
    private static final ClientLogger LOGGER = new ClientLogger(ApiKeysImpl.class);

    private final ApiKeysClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    public ApiKeysImpl(
        ApiKeysClient innerClient,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ApplicationInsightsComponentApiKey> list(String resourceGroupName, String resourceName) {
        PagedIterable<ApplicationInsightsComponentApiKeyInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new ApplicationInsightsComponentApiKeyImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationInsightsComponentApiKey> list(
        String resourceGroupName, String resourceName, Context context) {
        PagedIterable<ApplicationInsightsComponentApiKeyInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new ApplicationInsightsComponentApiKeyImpl(inner1, this.manager()));
    }

    public ApplicationInsightsComponentApiKey create(
        String resourceGroupName, String resourceName, ApiKeyRequest apiKeyProperties) {
        ApplicationInsightsComponentApiKeyInner inner =
            this.serviceClient().create(resourceGroupName, resourceName, apiKeyProperties);
        if (inner != null) {
            return new ApplicationInsightsComponentApiKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationInsightsComponentApiKey> createWithResponse(
        String resourceGroupName, String resourceName, ApiKeyRequest apiKeyProperties, Context context) {
        Response<ApplicationInsightsComponentApiKeyInner> inner =
            this.serviceClient().createWithResponse(resourceGroupName, resourceName, apiKeyProperties, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationInsightsComponentApiKeyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationInsightsComponentApiKey delete(String resourceGroupName, String resourceName, String keyId) {
        ApplicationInsightsComponentApiKeyInner inner =
            this.serviceClient().delete(resourceGroupName, resourceName, keyId);
        if (inner != null) {
            return new ApplicationInsightsComponentApiKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationInsightsComponentApiKey> deleteWithResponse(
        String resourceGroupName, String resourceName, String keyId, Context context) {
        Response<ApplicationInsightsComponentApiKeyInner> inner =
            this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, keyId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationInsightsComponentApiKeyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationInsightsComponentApiKey get(String resourceGroupName, String resourceName, String keyId) {
        ApplicationInsightsComponentApiKeyInner inner =
            this.serviceClient().get(resourceGroupName, resourceName, keyId);
        if (inner != null) {
            return new ApplicationInsightsComponentApiKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationInsightsComponentApiKey> getWithResponse(
        String resourceGroupName, String resourceName, String keyId, Context context) {
        Response<ApplicationInsightsComponentApiKeyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, keyId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationInsightsComponentApiKeyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ApiKeysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
