// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Availability group configuration. */
@Immutable
public final class AgConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AgConfiguration.class);

    /*
     * Replica configurations.
     */
    @JsonProperty(value = "replicas", access = JsonProperty.Access.WRITE_ONLY)
    private List<AgReplica> replicas;

    /**
     * Get the replicas property: Replica configurations.
     *
     * @return the replicas value.
     */
    public List<AgReplica> replicas() {
        return this.replicas;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (replicas() != null) {
            replicas().forEach(e -> e.validate());
        }
    }
}
