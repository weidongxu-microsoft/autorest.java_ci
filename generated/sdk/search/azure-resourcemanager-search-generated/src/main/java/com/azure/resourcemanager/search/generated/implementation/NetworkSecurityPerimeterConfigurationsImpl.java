// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.search.generated.fluent.NetworkSecurityPerimeterConfigurationsClient;
import com.azure.resourcemanager.search.generated.fluent.models.NetworkSecurityPerimeterConfigurationInner;
import com.azure.resourcemanager.search.generated.models.NetworkSecurityPerimeterConfiguration;
import com.azure.resourcemanager.search.generated.models.NetworkSecurityPerimeterConfigurations;

public final class NetworkSecurityPerimeterConfigurationsImpl implements NetworkSecurityPerimeterConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkSecurityPerimeterConfigurationsImpl.class);

    private final NetworkSecurityPerimeterConfigurationsClient innerClient;

    private final com.azure.resourcemanager.search.generated.SearchManager serviceManager;

    public NetworkSecurityPerimeterConfigurationsImpl(NetworkSecurityPerimeterConfigurationsClient innerClient,
        com.azure.resourcemanager.search.generated.SearchManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<NetworkSecurityPerimeterConfiguration> listByService(String resourceGroupName,
        String searchServiceName) {
        PagedIterable<NetworkSecurityPerimeterConfigurationInner> inner
            = this.serviceClient().listByService(resourceGroupName, searchServiceName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new NetworkSecurityPerimeterConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkSecurityPerimeterConfiguration> listByService(String resourceGroupName,
        String searchServiceName, Context context) {
        PagedIterable<NetworkSecurityPerimeterConfigurationInner> inner
            = this.serviceClient().listByService(resourceGroupName, searchServiceName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new NetworkSecurityPerimeterConfigurationImpl(inner1, this.manager()));
    }

    public Response<NetworkSecurityPerimeterConfiguration> getWithResponse(String resourceGroupName,
        String searchServiceName, String nspConfigName, Context context) {
        Response<NetworkSecurityPerimeterConfigurationInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, searchServiceName, nspConfigName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetworkSecurityPerimeterConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkSecurityPerimeterConfiguration get(String resourceGroupName, String searchServiceName,
        String nspConfigName) {
        NetworkSecurityPerimeterConfigurationInner inner
            = this.serviceClient().get(resourceGroupName, searchServiceName, nspConfigName);
        if (inner != null) {
            return new NetworkSecurityPerimeterConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void reconcile(String resourceGroupName, String searchServiceName, String nspConfigName) {
        this.serviceClient().reconcile(resourceGroupName, searchServiceName, nspConfigName);
    }

    public void reconcile(String resourceGroupName, String searchServiceName, String nspConfigName, Context context) {
        this.serviceClient().reconcile(resourceGroupName, searchServiceName, nspConfigName, context);
    }

    private NetworkSecurityPerimeterConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.search.generated.SearchManager manager() {
        return this.serviceManager;
    }
}