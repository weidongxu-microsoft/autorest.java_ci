// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.fluent.DeviceCapacityChecksClient;
import com.azure.resourcemanager.databoxedge.generated.models.DeviceCapacityChecks;
import com.azure.resourcemanager.databoxedge.generated.models.DeviceCapacityRequestInfo;

public final class DeviceCapacityChecksImpl implements DeviceCapacityChecks {
    private static final ClientLogger LOGGER = new ClientLogger(DeviceCapacityChecksImpl.class);

    private final DeviceCapacityChecksClient innerClient;

    private final com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager;

    public DeviceCapacityChecksImpl(DeviceCapacityChecksClient innerClient,
        com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void checkResourceCreationFeasibility(String resourceGroupName, String deviceName,
        DeviceCapacityRequestInfo deviceCapacityRequestInfo) {
        this.serviceClient().checkResourceCreationFeasibility(resourceGroupName, deviceName, deviceCapacityRequestInfo);
    }

    public void checkResourceCreationFeasibility(String resourceGroupName, String deviceName,
        DeviceCapacityRequestInfo deviceCapacityRequestInfo, String capacityName, Context context) {
        this.serviceClient()
            .checkResourceCreationFeasibility(resourceGroupName, deviceName, deviceCapacityRequestInfo, capacityName,
                context);
    }

    private DeviceCapacityChecksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
