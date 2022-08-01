// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Health statuses have following meanings. The 'healthy' status shows that the endpoint is accepting messages as
 * expected. The 'unhealthy' status shows that the endpoint is not accepting messages as expected and IoT Hub is
 * retrying to send data to this endpoint. The status of an unhealthy endpoint will be updated to healthy when IoT Hub
 * has established an eventually consistent state of health. The 'dead' status shows that the endpoint is not accepting
 * messages, after IoT Hub retried sending messages for the retrial period. See IoT Hub metrics to identify errors and
 * monitor issues with endpoints. The 'unknown' status shows that the IoT Hub has not established a connection with the
 * endpoint. No messages have been delivered to or rejected from this endpoint.
 */
public final class EndpointHealthStatus extends ExpandableStringEnum<EndpointHealthStatus> {
    /** Static value unknown for EndpointHealthStatus. */
    public static final EndpointHealthStatus UNKNOWN = fromString("unknown");

    /** Static value healthy for EndpointHealthStatus. */
    public static final EndpointHealthStatus HEALTHY = fromString("healthy");

    /** Static value degraded for EndpointHealthStatus. */
    public static final EndpointHealthStatus DEGRADED = fromString("degraded");

    /** Static value unhealthy for EndpointHealthStatus. */
    public static final EndpointHealthStatus UNHEALTHY = fromString("unhealthy");

    /** Static value dead for EndpointHealthStatus. */
    public static final EndpointHealthStatus DEAD = fromString("dead");

    /**
     * Creates or finds a EndpointHealthStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EndpointHealthStatus.
     */
    @JsonCreator
    public static EndpointHealthStatus fromString(String name) {
        return fromString(name, EndpointHealthStatus.class);
    }

    /**
     * Gets known EndpointHealthStatus values.
     *
     * @return known EndpointHealthStatus values.
     */
    public static Collection<EndpointHealthStatus> values() {
        return values(EndpointHealthStatus.class);
    }
}
