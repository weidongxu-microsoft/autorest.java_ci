// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The identity information with the event subscription.
 */
@Fluent
public final class EventSubscriptionIdentity {
    /*
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity.
     */
    @JsonProperty(value = "type")
    private EventSubscriptionIdentityType type;

    /*
     * The user identity associated with the resource.
     */
    @JsonProperty(value = "userAssignedIdentity")
    private String userAssignedIdentity;

    /**
     * Creates an instance of EventSubscriptionIdentity class.
     */
    public EventSubscriptionIdentity() {
    }

    /**
     * Get the type property: The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity.
     * 
     * @return the type value.
     */
    public EventSubscriptionIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity.
     * 
     * @param type the type value to set.
     * @return the EventSubscriptionIdentity object itself.
     */
    public EventSubscriptionIdentity withType(EventSubscriptionIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentity property: The user identity associated with the resource.
     * 
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: The user identity associated with the resource.
     * 
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the EventSubscriptionIdentity object itself.
     */
    public EventSubscriptionIdentity withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
