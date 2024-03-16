// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The replication policy rule between two containers.
 */
@Fluent
public final class ObjectReplicationPolicyRule {
    /*
     * Rule Id is auto-generated for each new rule on destination account. It is required for put policy on source account.
     */
    @JsonProperty(value = "ruleId")
    private String ruleId;

    /*
     * Required. Source container name.
     */
    @JsonProperty(value = "sourceContainer", required = true)
    private String sourceContainer;

    /*
     * Required. Destination container name.
     */
    @JsonProperty(value = "destinationContainer", required = true)
    private String destinationContainer;

    /*
     * Optional. An object that defines the filter set.
     */
    @JsonProperty(value = "filters")
    private ObjectReplicationPolicyFilter filters;

    /**
     * Creates an instance of ObjectReplicationPolicyRule class.
     */
    public ObjectReplicationPolicyRule() {
    }

    /**
     * Get the ruleId property: Rule Id is auto-generated for each new rule on destination account. It is required for put policy on source account.
     * 
     * @return the ruleId value.
     */
    public String ruleId() {
        return this.ruleId;
    }

    /**
     * Set the ruleId property: Rule Id is auto-generated for each new rule on destination account. It is required for put policy on source account.
     * 
     * @param ruleId the ruleId value to set.
     * @return the ObjectReplicationPolicyRule object itself.
     */
    public ObjectReplicationPolicyRule withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get the sourceContainer property: Required. Source container name.
     * 
     * @return the sourceContainer value.
     */
    public String sourceContainer() {
        return this.sourceContainer;
    }

    /**
     * Set the sourceContainer property: Required. Source container name.
     * 
     * @param sourceContainer the sourceContainer value to set.
     * @return the ObjectReplicationPolicyRule object itself.
     */
    public ObjectReplicationPolicyRule withSourceContainer(String sourceContainer) {
        this.sourceContainer = sourceContainer;
        return this;
    }

    /**
     * Get the destinationContainer property: Required. Destination container name.
     * 
     * @return the destinationContainer value.
     */
    public String destinationContainer() {
        return this.destinationContainer;
    }

    /**
     * Set the destinationContainer property: Required. Destination container name.
     * 
     * @param destinationContainer the destinationContainer value to set.
     * @return the ObjectReplicationPolicyRule object itself.
     */
    public ObjectReplicationPolicyRule withDestinationContainer(String destinationContainer) {
        this.destinationContainer = destinationContainer;
        return this;
    }

    /**
     * Get the filters property: Optional. An object that defines the filter set.
     * 
     * @return the filters value.
     */
    public ObjectReplicationPolicyFilter filters() {
        return this.filters;
    }

    /**
     * Set the filters property: Optional. An object that defines the filter set.
     * 
     * @param filters the filters value to set.
     * @return the ObjectReplicationPolicyRule object itself.
     */
    public ObjectReplicationPolicyRule withFilters(ObjectReplicationPolicyFilter filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceContainer() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property sourceContainer in model ObjectReplicationPolicyRule"));
        }
        if (destinationContainer() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property destinationContainer in model ObjectReplicationPolicyRule"));
        }
        if (filters() != null) {
            filters().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ObjectReplicationPolicyRule.class);
}
