// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.generated.fluent.WebTestsClient;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.WebTestInner;
import com.azure.resourcemanager.applicationinsights.generated.models.WebTest;
import com.azure.resourcemanager.applicationinsights.generated.models.WebTests;

public final class WebTestsImpl implements WebTests {
    private static final ClientLogger LOGGER = new ClientLogger(WebTestsImpl.class);

    private final WebTestsClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    public WebTestsImpl(WebTestsClient innerClient,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WebTest> listByResourceGroup(String resourceGroupName) {
        PagedIterable<WebTestInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new WebTestImpl(inner1, this.manager()));
    }

    public PagedIterable<WebTest> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<WebTestInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new WebTestImpl(inner1, this.manager()));
    }

    public Response<WebTest> getByResourceGroupWithResponse(String resourceGroupName, String webTestName,
        Context context) {
        Response<WebTestInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, webTestName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WebTestImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WebTest getByResourceGroup(String resourceGroupName, String webTestName) {
        WebTestInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, webTestName);
        if (inner != null) {
            return new WebTestImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String webTestName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, webTestName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String webTestName) {
        this.serviceClient().delete(resourceGroupName, webTestName);
    }

    public PagedIterable<WebTest> list() {
        PagedIterable<WebTestInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new WebTestImpl(inner1, this.manager()));
    }

    public PagedIterable<WebTest> list(Context context) {
        PagedIterable<WebTestInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new WebTestImpl(inner1, this.manager()));
    }

    public PagedIterable<WebTest> listByComponent(String componentName, String resourceGroupName) {
        PagedIterable<WebTestInner> inner = this.serviceClient().listByComponent(componentName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new WebTestImpl(inner1, this.manager()));
    }

    public PagedIterable<WebTest> listByComponent(String componentName, String resourceGroupName, Context context) {
        PagedIterable<WebTestInner> inner
            = this.serviceClient().listByComponent(componentName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new WebTestImpl(inner1, this.manager()));
    }

    public WebTest getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String webTestName = Utils.getValueFromIdByName(id, "webtests");
        if (webTestName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'webtests'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, webTestName, Context.NONE).getValue();
    }

    public Response<WebTest> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String webTestName = Utils.getValueFromIdByName(id, "webtests");
        if (webTestName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'webtests'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, webTestName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String webTestName = Utils.getValueFromIdByName(id, "webtests");
        if (webTestName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'webtests'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceGroupName, webTestName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String webTestName = Utils.getValueFromIdByName(id, "webtests");
        if (webTestName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'webtests'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceGroupName, webTestName, context);
    }

    private WebTestsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }

    public WebTestImpl define(String name) {
        return new WebTestImpl(name, this.manager());
    }
}
