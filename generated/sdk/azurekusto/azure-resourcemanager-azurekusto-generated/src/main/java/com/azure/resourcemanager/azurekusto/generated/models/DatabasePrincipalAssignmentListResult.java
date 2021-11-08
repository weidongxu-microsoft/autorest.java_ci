// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.DatabasePrincipalAssignmentInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list Kusto database principal assignments operation response. */
@Fluent
public final class DatabasePrincipalAssignmentListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabasePrincipalAssignmentListResult.class);

    /*
     * The list of Kusto database principal assignments.
     */
    @JsonProperty(value = "value")
    private List<DatabasePrincipalAssignmentInner> value;

    /**
     * Get the value property: The list of Kusto database principal assignments.
     *
     * @return the value value.
     */
    public List<DatabasePrincipalAssignmentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Kusto database principal assignments.
     *
     * @param value the value value to set.
     * @return the DatabasePrincipalAssignmentListResult object itself.
     */
    public DatabasePrincipalAssignmentListResult withValue(List<DatabasePrincipalAssignmentInner> value) {
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
