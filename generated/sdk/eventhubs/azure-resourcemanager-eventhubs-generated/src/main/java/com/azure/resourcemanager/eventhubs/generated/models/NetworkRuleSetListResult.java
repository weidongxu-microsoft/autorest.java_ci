// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.resourcemanager.eventhubs.generated.fluent.models.NetworkRuleSetListResultInner;
import java.util.List;

/**
 * An immutable client-side representation of NetworkRuleSetListResult.
 */
public interface NetworkRuleSetListResult {
    /**
     * Gets the value property: Result of the List NetworkRuleSet operation.
     * 
     * @return the value value.
     */
    List<NetworkRuleSet> value();

    /**
     * Gets the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * NetworkRuleSet.
     * 
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.eventhubs.generated.fluent.models.NetworkRuleSetListResultInner object.
     * 
     * @return the inner object.
     */
    NetworkRuleSetListResultInner innerModel();
}
