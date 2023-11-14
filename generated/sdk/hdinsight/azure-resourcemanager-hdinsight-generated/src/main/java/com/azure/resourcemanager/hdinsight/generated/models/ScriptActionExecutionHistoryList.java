// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.RuntimeScriptActionDetailInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The list script execution history response.
 */
@Immutable
public final class ScriptActionExecutionHistoryList {
    /*
     * The list of persisted script action details for the cluster.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<RuntimeScriptActionDetailInner> value;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ScriptActionExecutionHistoryList class.
     */
    public ScriptActionExecutionHistoryList() {
    }

    /**
     * Get the value property: The list of persisted script action details for the cluster.
     * 
     * @return the value value.
     */
    public List<RuntimeScriptActionDetailInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
