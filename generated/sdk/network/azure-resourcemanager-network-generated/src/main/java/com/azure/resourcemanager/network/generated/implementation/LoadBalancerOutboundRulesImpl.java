// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.LoadBalancerOutboundRulesClient;
import com.azure.resourcemanager.network.generated.fluent.models.OutboundRuleInner;
import com.azure.resourcemanager.network.generated.models.LoadBalancerOutboundRules;
import com.azure.resourcemanager.network.generated.models.OutboundRule;

public final class LoadBalancerOutboundRulesImpl implements LoadBalancerOutboundRules {
    private static final ClientLogger LOGGER = new ClientLogger(LoadBalancerOutboundRulesImpl.class);

    private final LoadBalancerOutboundRulesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public LoadBalancerOutboundRulesImpl(LoadBalancerOutboundRulesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OutboundRule> list(String resourceGroupName, String loadBalancerName) {
        PagedIterable<OutboundRuleInner> inner = this.serviceClient().list(resourceGroupName, loadBalancerName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OutboundRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<OutboundRule> list(String resourceGroupName, String loadBalancerName, Context context) {
        PagedIterable<OutboundRuleInner> inner
            = this.serviceClient().list(resourceGroupName, loadBalancerName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OutboundRuleImpl(inner1, this.manager()));
    }

    public Response<OutboundRule> getWithResponse(String resourceGroupName, String loadBalancerName,
        String outboundRuleName, Context context) {
        Response<OutboundRuleInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, loadBalancerName, outboundRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new OutboundRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OutboundRule get(String resourceGroupName, String loadBalancerName, String outboundRuleName) {
        OutboundRuleInner inner = this.serviceClient().get(resourceGroupName, loadBalancerName, outboundRuleName);
        if (inner != null) {
            return new OutboundRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private LoadBalancerOutboundRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
