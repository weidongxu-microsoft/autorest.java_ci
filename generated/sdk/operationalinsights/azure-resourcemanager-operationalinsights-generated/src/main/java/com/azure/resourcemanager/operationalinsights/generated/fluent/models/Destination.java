// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.models.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Destination properties. */
@Fluent
public final class Destination {
    /*
     * The destination resource ID. This can be copied from the Properties entry of the destination resource in Azure.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /*
     * The type of the destination resource
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private Type type;

    /*
     * destination meta data.
     */
    @JsonProperty(value = "metaData")
    private DestinationMetadata innerMetadata;

    /** Creates an instance of Destination class. */
    public Destination() {
    }

    /**
     * Get the resourceId property: The destination resource ID. This can be copied from the Properties entry of the
     * destination resource in Azure.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The destination resource ID. This can be copied from the Properties entry of the
     * destination resource in Azure.
     *
     * @param resourceId the resourceId value to set.
     * @return the Destination object itself.
     */
    public Destination withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the type property: The type of the destination resource.
     *
     * @return the type value.
     */
    public Type type() {
        return this.type;
    }

    /**
     * Get the innerMetadata property: destination meta data.
     *
     * @return the innerMetadata value.
     */
    private DestinationMetadata innerMetadata() {
        return this.innerMetadata;
    }

    /**
     * Get the eventHubName property: Optional. Allows to define an Event Hub name. Not applicable when destination is
     * Storage Account.
     *
     * @return the eventHubName value.
     */
    public String eventHubName() {
        return this.innerMetadata() == null ? null : this.innerMetadata().eventHubName();
    }

    /**
     * Set the eventHubName property: Optional. Allows to define an Event Hub name. Not applicable when destination is
     * Storage Account.
     *
     * @param eventHubName the eventHubName value to set.
     * @return the Destination object itself.
     */
    public Destination withEventHubName(String eventHubName) {
        if (this.innerMetadata() == null) {
            this.innerMetadata = new DestinationMetadata();
        }
        this.innerMetadata().withEventHubName(eventHubName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property resourceId in model Destination"));
        }
        if (innerMetadata() != null) {
            innerMetadata().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Destination.class);
}
