// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.ReplicationUsageInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Replication usages for vault. */
@Fluent
public final class ReplicationUsageList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationUsageList.class);

    /*
     * The list of replication usages for the given vault.
     */
    @JsonProperty(value = "value")
    private List<ReplicationUsageInner> value;

    /**
     * Get the value property: The list of replication usages for the given vault.
     *
     * @return the value value.
     */
    public List<ReplicationUsageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of replication usages for the given vault.
     *
     * @param value the value value to set.
     * @return the ReplicationUsageList object itself.
     */
    public ReplicationUsageList withValue(List<ReplicationUsageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
