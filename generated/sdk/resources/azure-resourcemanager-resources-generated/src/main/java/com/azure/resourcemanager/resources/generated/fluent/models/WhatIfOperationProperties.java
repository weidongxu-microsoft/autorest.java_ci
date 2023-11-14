// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.generated.models.WhatIfChange;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Deployment operation properties.
 */
@Fluent
public final class WhatIfOperationProperties {
    /*
     * List of resource changes predicted by What-If operation.
     */
    @JsonProperty(value = "changes")
    private List<WhatIfChange> changes;

    /**
     * Creates an instance of WhatIfOperationProperties class.
     */
    public WhatIfOperationProperties() {
    }

    /**
     * Get the changes property: List of resource changes predicted by What-If operation.
     * 
     * @return the changes value.
     */
    public List<WhatIfChange> changes() {
        return this.changes;
    }

    /**
     * Set the changes property: List of resource changes predicted by What-If operation.
     * 
     * @param changes the changes value to set.
     * @return the WhatIfOperationProperties object itself.
     */
    public WhatIfOperationProperties withChanges(List<WhatIfChange> changes) {
        this.changes = changes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (changes() != null) {
            changes().forEach(e -> e.validate());
        }
    }
}
