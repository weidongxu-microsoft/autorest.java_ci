// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.fluent.StorageTaskAssignmentsInstancesReportsClient;
import com.azure.resourcemanager.storage.generated.fluent.models.StorageTaskReportInstanceInner;
import com.azure.resourcemanager.storage.generated.models.StorageTaskAssignmentsInstancesReports;
import com.azure.resourcemanager.storage.generated.models.StorageTaskReportInstance;

public final class StorageTaskAssignmentsInstancesReportsImpl implements StorageTaskAssignmentsInstancesReports {
    private static final ClientLogger LOGGER = new ClientLogger(StorageTaskAssignmentsInstancesReportsImpl.class);

    private final StorageTaskAssignmentsInstancesReportsClient innerClient;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    public StorageTaskAssignmentsInstancesReportsImpl(StorageTaskAssignmentsInstancesReportsClient innerClient,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StorageTaskReportInstance> list(String resourceGroupName, String accountName) {
        PagedIterable<StorageTaskReportInstanceInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new StorageTaskReportInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageTaskReportInstance> list(String resourceGroupName, String accountName,
        String maxpagesize, String filter, Context context) {
        PagedIterable<StorageTaskReportInstanceInner> inner
            = this.serviceClient().list(resourceGroupName, accountName, maxpagesize, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new StorageTaskReportInstanceImpl(inner1, this.manager()));
    }

    private StorageTaskAssignmentsInstancesReportsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }
}