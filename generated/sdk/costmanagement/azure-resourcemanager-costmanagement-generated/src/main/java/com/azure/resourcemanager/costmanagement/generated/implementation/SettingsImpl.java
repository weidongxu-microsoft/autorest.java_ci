// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.generated.fluent.SettingsClient;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.SettingInner;
import com.azure.resourcemanager.costmanagement.generated.models.Setting;
import com.azure.resourcemanager.costmanagement.generated.models.Settings;

public final class SettingsImpl implements Settings {
    private static final ClientLogger LOGGER = new ClientLogger(SettingsImpl.class);

    private final SettingsClient innerClient;

    private final com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager;

    public SettingsImpl(SettingsClient innerClient,
        com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Setting> list() {
        PagedIterable<SettingInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SettingImpl(inner1, this.manager()));
    }

    public PagedIterable<Setting> list(Context context) {
        PagedIterable<SettingInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SettingImpl(inner1, this.manager()));
    }

    public Response<Setting> getWithResponse(String settingName, Context context) {
        Response<SettingInner> inner = this.serviceClient().getWithResponse(settingName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SettingImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Setting get(String settingName) {
        SettingInner inner = this.serviceClient().get(settingName);
        if (inner != null) {
            return new SettingImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Setting> createOrUpdateWithResponse(String settingName, SettingInner parameters, Context context) {
        Response<SettingInner> inner
            = this.serviceClient().createOrUpdateWithResponse(settingName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SettingImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Setting createOrUpdate(String settingName, SettingInner parameters) {
        SettingInner inner = this.serviceClient().createOrUpdate(settingName, parameters);
        if (inner != null) {
            return new SettingImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String settingName, Context context) {
        return this.serviceClient().deleteWithResponse(settingName, context);
    }

    public void delete(String settingName) {
        this.serviceClient().delete(settingName);
    }

    private SettingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.costmanagement.generated.CostManagementManager manager() {
        return this.serviceManager;
    }
}
