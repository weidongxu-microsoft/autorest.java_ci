// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.BastionActiveSessionInner;

/**
 * An immutable client-side representation of BastionActiveSession.
 */
public interface BastionActiveSession {
    /**
     * Gets the sessionId property: A unique id for the session.
     * 
     * @return the sessionId value.
     */
    String sessionId();

    /**
     * Gets the startTime property: The time when the session started.
     * 
     * @return the startTime value.
     */
    Object startTime();

    /**
     * Gets the targetSubscriptionId property: The subscription id for the target virtual machine.
     * 
     * @return the targetSubscriptionId value.
     */
    String targetSubscriptionId();

    /**
     * Gets the resourceType property: The type of the resource.
     * 
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the targetHostname property: The host name of the target.
     * 
     * @return the targetHostname value.
     */
    String targetHostname();

    /**
     * Gets the targetResourceGroup property: The resource group of the target.
     * 
     * @return the targetResourceGroup value.
     */
    String targetResourceGroup();

    /**
     * Gets the username property: The user name who is active on this session.
     * 
     * @return the username value.
     */
    String username();

    /**
     * Gets the targetIpAddress property: The IP Address of the target.
     * 
     * @return the targetIpAddress value.
     */
    String targetIpAddress();

    /**
     * Gets the protocol property: The protocol used to connect to the target.
     * 
     * @return the protocol value.
     */
    BastionConnectProtocol protocol();

    /**
     * Gets the targetResourceId property: The resource id of the target.
     * 
     * @return the targetResourceId value.
     */
    String targetResourceId();

    /**
     * Gets the sessionDurationInMins property: Duration in mins the session has been active.
     * 
     * @return the sessionDurationInMins value.
     */
    Float sessionDurationInMins();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.BastionActiveSessionInner object.
     * 
     * @return the inner object.
     */
    BastionActiveSessionInner innerModel();
}
