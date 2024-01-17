// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.AdminRulesClient;
import com.azure.resourcemanager.network.generated.fluent.models.BaseAdminRuleInner;
import com.azure.resourcemanager.network.generated.models.AdminRules;
import com.azure.resourcemanager.network.generated.models.BaseAdminRule;

public final class AdminRulesImpl implements AdminRules {
    private static final ClientLogger LOGGER = new ClientLogger(AdminRulesImpl.class);

    private final AdminRulesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public AdminRulesImpl(AdminRulesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BaseAdminRule> list(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName) {
        PagedIterable<BaseAdminRuleInner> inner
            = this.serviceClient().list(resourceGroupName, networkManagerName, configurationName, ruleCollectionName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BaseAdminRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<BaseAdminRule> list(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, Integer top, String skipToken, Context context) {
        PagedIterable<BaseAdminRuleInner> inner = this.serviceClient().list(resourceGroupName, networkManagerName,
            configurationName, ruleCollectionName, top, skipToken, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BaseAdminRuleImpl(inner1, this.manager()));
    }

    public Response<BaseAdminRule> getWithResponse(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, String ruleName, Context context) {
        Response<BaseAdminRuleInner> inner = this.serviceClient().getWithResponse(resourceGroupName, networkManagerName,
            configurationName, ruleCollectionName, ruleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BaseAdminRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BaseAdminRule get(String resourceGroupName, String networkManagerName, String configurationName,
        String ruleCollectionName, String ruleName) {
        BaseAdminRuleInner inner = this.serviceClient().get(resourceGroupName, networkManagerName, configurationName,
            ruleCollectionName, ruleName);
        if (inner != null) {
            return new BaseAdminRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BaseAdminRule> createOrUpdateWithResponse(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, String ruleName, BaseAdminRuleInner adminRule,
        Context context) {
        Response<BaseAdminRuleInner> inner = this.serviceClient().createOrUpdateWithResponse(resourceGroupName,
            networkManagerName, configurationName, ruleCollectionName, ruleName, adminRule, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BaseAdminRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BaseAdminRule createOrUpdate(String resourceGroupName, String networkManagerName, String configurationName,
        String ruleCollectionName, String ruleName, BaseAdminRuleInner adminRule) {
        BaseAdminRuleInner inner = this.serviceClient().createOrUpdate(resourceGroupName, networkManagerName,
            configurationName, ruleCollectionName, ruleName, adminRule);
        if (inner != null) {
            return new BaseAdminRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String networkManagerName, String configurationName,
        String ruleCollectionName, String ruleName) {
        this.serviceClient().delete(resourceGroupName, networkManagerName, configurationName, ruleCollectionName,
            ruleName);
    }

    public void delete(String resourceGroupName, String networkManagerName, String configurationName,
        String ruleCollectionName, String ruleName, Boolean force, Context context) {
        this.serviceClient().delete(resourceGroupName, networkManagerName, configurationName, ruleCollectionName,
            ruleName, force, context);
    }

    private AdminRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
