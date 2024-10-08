// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.EventCategoriesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.LocalizableStringInner;
import com.azure.resourcemanager.monitor.generated.models.EventCategories;
import com.azure.resourcemanager.monitor.generated.models.LocalizableString;

public final class EventCategoriesImpl implements EventCategories {
    private static final ClientLogger LOGGER = new ClientLogger(EventCategoriesImpl.class);

    private final EventCategoriesClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public EventCategoriesImpl(EventCategoriesClient innerClient,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LocalizableString> list() {
        PagedIterable<LocalizableStringInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LocalizableStringImpl(inner1, this.manager()));
    }

    public PagedIterable<LocalizableString> list(Context context) {
        PagedIterable<LocalizableStringInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LocalizableStringImpl(inner1, this.manager()));
    }

    private EventCategoriesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
