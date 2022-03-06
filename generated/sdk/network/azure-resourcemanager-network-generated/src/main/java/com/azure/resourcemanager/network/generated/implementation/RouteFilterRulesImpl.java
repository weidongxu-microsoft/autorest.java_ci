// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.RouteFilterRulesClient;
import com.azure.resourcemanager.network.generated.fluent.models.RouteFilterRuleInner;
import com.azure.resourcemanager.network.generated.models.RouteFilterRule;
import com.azure.resourcemanager.network.generated.models.RouteFilterRules;

public final class RouteFilterRulesImpl implements RouteFilterRules {
    private static final ClientLogger LOGGER = new ClientLogger(RouteFilterRulesImpl.class);

    private final RouteFilterRulesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public RouteFilterRulesImpl(
        RouteFilterRulesClient innerClient, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String routeFilterName, String ruleName) {
        this.serviceClient().delete(resourceGroupName, routeFilterName, ruleName);
    }

    public void delete(String resourceGroupName, String routeFilterName, String ruleName, Context context) {
        this.serviceClient().delete(resourceGroupName, routeFilterName, ruleName, context);
    }

    public RouteFilterRule get(String resourceGroupName, String routeFilterName, String ruleName) {
        RouteFilterRuleInner inner = this.serviceClient().get(resourceGroupName, routeFilterName, ruleName);
        if (inner != null) {
            return new RouteFilterRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RouteFilterRule> getWithResponse(
        String resourceGroupName, String routeFilterName, String ruleName, Context context) {
        Response<RouteFilterRuleInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, routeFilterName, ruleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RouteFilterRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RouteFilterRule createOrUpdate(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRuleInner routeFilterRuleParameters) {
        RouteFilterRuleInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters);
        if (inner != null) {
            return new RouteFilterRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public RouteFilterRule createOrUpdate(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRuleInner routeFilterRuleParameters,
        Context context) {
        RouteFilterRuleInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters, context);
        if (inner != null) {
            return new RouteFilterRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<RouteFilterRule> listByRouteFilter(String resourceGroupName, String routeFilterName) {
        PagedIterable<RouteFilterRuleInner> inner =
            this.serviceClient().listByRouteFilter(resourceGroupName, routeFilterName);
        return Utils.mapPage(inner, inner1 -> new RouteFilterRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<RouteFilterRule> listByRouteFilter(
        String resourceGroupName, String routeFilterName, Context context) {
        PagedIterable<RouteFilterRuleInner> inner =
            this.serviceClient().listByRouteFilter(resourceGroupName, routeFilterName, context);
        return Utils.mapPage(inner, inner1 -> new RouteFilterRuleImpl(inner1, this.manager()));
    }

    private RouteFilterRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
