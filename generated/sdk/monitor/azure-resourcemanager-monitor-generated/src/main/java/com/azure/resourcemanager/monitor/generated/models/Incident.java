// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.resourcemanager.monitor.generated.fluent.models.IncidentInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of Incident.
 */
public interface Incident {
    /**
     * Gets the name property: Incident name.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the ruleName property: Rule name that is associated with the incident.
     * 
     * @return the ruleName value.
     */
    String ruleName();

    /**
     * Gets the isActive property: A boolean to indicate whether the incident is active or resolved.
     * 
     * @return the isActive value.
     */
    Boolean isActive();

    /**
     * Gets the activatedTime property: The time at which the incident was activated in ISO8601 format.
     * 
     * @return the activatedTime value.
     */
    OffsetDateTime activatedTime();

    /**
     * Gets the resolvedTime property: The time at which the incident was resolved in ISO8601 format. If null, it means
     * the incident is still active.
     * 
     * @return the resolvedTime value.
     */
    OffsetDateTime resolvedTime();

    /**
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.IncidentInner object.
     * 
     * @return the inner object.
     */
    IncidentInner innerModel();
}
