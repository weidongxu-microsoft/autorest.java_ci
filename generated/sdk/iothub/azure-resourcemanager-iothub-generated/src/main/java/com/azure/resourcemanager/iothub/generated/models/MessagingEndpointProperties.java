// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** The properties of the messaging endpoints used by this IoT hub. */
@Fluent
public final class MessagingEndpointProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MessagingEndpointProperties.class);

    /*
     * The lock duration. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     */
    @JsonProperty(value = "lockDurationAsIso8601")
    private Duration lockDurationAsIso8601;

    /*
     * The period of time for which a message is available to consume before it
     * is expired by the IoT hub. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     */
    @JsonProperty(value = "ttlAsIso8601")
    private Duration ttlAsIso8601;

    /*
     * The number of times the IoT hub attempts to deliver a message. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     */
    @JsonProperty(value = "maxDeliveryCount")
    private Integer maxDeliveryCount;

    /**
     * Get the lockDurationAsIso8601 property: The lock duration. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     *
     * @return the lockDurationAsIso8601 value.
     */
    public Duration lockDurationAsIso8601() {
        return this.lockDurationAsIso8601;
    }

    /**
     * Set the lockDurationAsIso8601 property: The lock duration. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     *
     * @param lockDurationAsIso8601 the lockDurationAsIso8601 value to set.
     * @return the MessagingEndpointProperties object itself.
     */
    public MessagingEndpointProperties withLockDurationAsIso8601(Duration lockDurationAsIso8601) {
        this.lockDurationAsIso8601 = lockDurationAsIso8601;
        return this;
    }

    /**
     * Get the ttlAsIso8601 property: The period of time for which a message is available to consume before it is
     * expired by the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     *
     * @return the ttlAsIso8601 value.
     */
    public Duration ttlAsIso8601() {
        return this.ttlAsIso8601;
    }

    /**
     * Set the ttlAsIso8601 property: The period of time for which a message is available to consume before it is
     * expired by the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     *
     * @param ttlAsIso8601 the ttlAsIso8601 value to set.
     * @return the MessagingEndpointProperties object itself.
     */
    public MessagingEndpointProperties withTtlAsIso8601(Duration ttlAsIso8601) {
        this.ttlAsIso8601 = ttlAsIso8601;
        return this;
    }

    /**
     * Get the maxDeliveryCount property: The number of times the IoT hub attempts to deliver a message. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     *
     * @return the maxDeliveryCount value.
     */
    public Integer maxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Set the maxDeliveryCount property: The number of times the IoT hub attempts to deliver a message. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     *
     * @param maxDeliveryCount the maxDeliveryCount value to set.
     * @return the MessagingEndpointProperties object itself.
     */
    public MessagingEndpointProperties withMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
