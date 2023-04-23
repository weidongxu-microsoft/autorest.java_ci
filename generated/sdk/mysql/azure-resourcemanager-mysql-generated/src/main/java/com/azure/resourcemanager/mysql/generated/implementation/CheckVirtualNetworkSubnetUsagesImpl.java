// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.generated.fluent.CheckVirtualNetworkSubnetUsagesClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.VirtualNetworkSubnetUsageResultInner;
import com.azure.resourcemanager.mysql.generated.models.CheckVirtualNetworkSubnetUsages;
import com.azure.resourcemanager.mysql.generated.models.VirtualNetworkSubnetUsageParameter;
import com.azure.resourcemanager.mysql.generated.models.VirtualNetworkSubnetUsageResult;

public final class CheckVirtualNetworkSubnetUsagesImpl implements CheckVirtualNetworkSubnetUsages {
    private static final ClientLogger LOGGER = new ClientLogger(CheckVirtualNetworkSubnetUsagesImpl.class);

    private final CheckVirtualNetworkSubnetUsagesClient innerClient;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    public CheckVirtualNetworkSubnetUsagesImpl(
        CheckVirtualNetworkSubnetUsagesClient innerClient,
        com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<VirtualNetworkSubnetUsageResult> executeWithResponse(
        String locationName, VirtualNetworkSubnetUsageParameter parameters, Context context) {
        Response<VirtualNetworkSubnetUsageResultInner> inner =
            this.serviceClient().executeWithResponse(locationName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualNetworkSubnetUsageResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualNetworkSubnetUsageResult execute(String locationName, VirtualNetworkSubnetUsageParameter parameters) {
        VirtualNetworkSubnetUsageResultInner inner = this.serviceClient().execute(locationName, parameters);
        if (inner != null) {
            return new VirtualNetworkSubnetUsageResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private CheckVirtualNetworkSubnetUsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}
