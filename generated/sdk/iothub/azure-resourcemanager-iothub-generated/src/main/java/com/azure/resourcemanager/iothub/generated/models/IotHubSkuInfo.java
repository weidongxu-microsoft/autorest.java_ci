// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the SKU of the IoT hub. */
@Fluent
public final class IotHubSkuInfo {
    /*
     * The name of the SKU.
     */
    @JsonProperty(value = "name", required = true)
    private IotHubSku name;

    /*
     * The billing tier for the IoT hub.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private IotHubSkuTier tier;

    /*
     * The number of provisioned IoT Hub units. See:
     * https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
     */
    @JsonProperty(value = "capacity")
    private Long capacity;

    /** Creates an instance of IotHubSkuInfo class. */
    public IotHubSkuInfo() {
    }

    /**
     * Get the name property: The name of the SKU.
     *
     * @return the name value.
     */
    public IotHubSku name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the SKU.
     *
     * @param name the name value to set.
     * @return the IotHubSkuInfo object itself.
     */
    public IotHubSkuInfo withName(IotHubSku name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The billing tier for the IoT hub.
     *
     * @return the tier value.
     */
    public IotHubSkuTier tier() {
        return this.tier;
    }

    /**
     * Get the capacity property: The number of provisioned IoT Hub units. See:
     * https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
     *
     * @return the capacity value.
     */
    public Long capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The number of provisioned IoT Hub units. See:
     * https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
     *
     * @param capacity the capacity value to set.
     * @return the IotHubSkuInfo object itself.
     */
    public IotHubSkuInfo withCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model IotHubSkuInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IotHubSkuInfo.class);
}
