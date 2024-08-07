// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.AzureFirewallsClient;
import com.azure.resourcemanager.network.generated.fluent.models.AzureFirewallInner;
import com.azure.resourcemanager.network.generated.fluent.models.IpPrefixesListInner;
import com.azure.resourcemanager.network.generated.models.AzureFirewall;
import com.azure.resourcemanager.network.generated.models.AzureFirewalls;
import com.azure.resourcemanager.network.generated.models.FirewallPacketCaptureParameters;
import com.azure.resourcemanager.network.generated.models.IpPrefixesList;

public final class AzureFirewallsImpl implements AzureFirewalls {
    private static final ClientLogger LOGGER = new ClientLogger(AzureFirewallsImpl.class);

    private final AzureFirewallsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public AzureFirewallsImpl(AzureFirewallsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String azureFirewallName) {
        this.serviceClient().delete(resourceGroupName, azureFirewallName);
    }

    public void delete(String resourceGroupName, String azureFirewallName, Context context) {
        this.serviceClient().delete(resourceGroupName, azureFirewallName, context);
    }

    public Response<AzureFirewall> getByResourceGroupWithResponse(String resourceGroupName, String azureFirewallName,
        Context context) {
        Response<AzureFirewallInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, azureFirewallName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AzureFirewallImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AzureFirewall getByResourceGroup(String resourceGroupName, String azureFirewallName) {
        AzureFirewallInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, azureFirewallName);
        if (inner != null) {
            return new AzureFirewallImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<AzureFirewall> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AzureFirewallInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AzureFirewallImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureFirewall> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AzureFirewallInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AzureFirewallImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureFirewall> list() {
        PagedIterable<AzureFirewallInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AzureFirewallImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureFirewall> list(Context context) {
        PagedIterable<AzureFirewallInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AzureFirewallImpl(inner1, this.manager()));
    }

    public IpPrefixesList listLearnedPrefixes(String resourceGroupName, String azureFirewallName) {
        IpPrefixesListInner inner = this.serviceClient().listLearnedPrefixes(resourceGroupName, azureFirewallName);
        if (inner != null) {
            return new IpPrefixesListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public IpPrefixesList listLearnedPrefixes(String resourceGroupName, String azureFirewallName, Context context) {
        IpPrefixesListInner inner
            = this.serviceClient().listLearnedPrefixes(resourceGroupName, azureFirewallName, context);
        if (inner != null) {
            return new IpPrefixesListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void packetCapture(String resourceGroupName, String azureFirewallName,
        FirewallPacketCaptureParameters parameters) {
        this.serviceClient().packetCapture(resourceGroupName, azureFirewallName, parameters);
    }

    public void packetCapture(String resourceGroupName, String azureFirewallName,
        FirewallPacketCaptureParameters parameters, Context context) {
        this.serviceClient().packetCapture(resourceGroupName, azureFirewallName, parameters, context);
    }

    public AzureFirewall getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureFirewallName = ResourceManagerUtils.getValueFromIdByName(id, "azureFirewalls");
        if (azureFirewallName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'azureFirewalls'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, azureFirewallName, Context.NONE).getValue();
    }

    public Response<AzureFirewall> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureFirewallName = ResourceManagerUtils.getValueFromIdByName(id, "azureFirewalls");
        if (azureFirewallName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'azureFirewalls'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, azureFirewallName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureFirewallName = ResourceManagerUtils.getValueFromIdByName(id, "azureFirewalls");
        if (azureFirewallName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'azureFirewalls'.", id)));
        }
        this.delete(resourceGroupName, azureFirewallName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureFirewallName = ResourceManagerUtils.getValueFromIdByName(id, "azureFirewalls");
        if (azureFirewallName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'azureFirewalls'.", id)));
        }
        this.delete(resourceGroupName, azureFirewallName, context);
    }

    private AzureFirewallsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public AzureFirewallImpl define(String name) {
        return new AzureFirewallImpl(name, this.manager());
    }
}
