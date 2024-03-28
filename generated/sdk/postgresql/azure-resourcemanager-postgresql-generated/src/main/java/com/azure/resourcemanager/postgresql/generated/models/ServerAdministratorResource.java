// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.resourcemanager.postgresql.generated.fluent.models.ServerAdministratorResourceInner;
import java.util.UUID;

/**
 * An immutable client-side representation of ServerAdministratorResource.
 */
public interface ServerAdministratorResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the administratorType property: The type of administrator.
     * 
     * @return the administratorType value.
     */
    AdministratorType administratorType();

    /**
     * Gets the login property: The server administrator login account name.
     * 
     * @return the login value.
     */
    String login();

    /**
     * Gets the sid property: The server administrator Sid (Secure ID).
     * 
     * @return the sid value.
     */
    UUID sid();

    /**
     * Gets the tenantId property: The server Active Directory Administrator tenant id.
     * 
     * @return the tenantId value.
     */
    UUID tenantId();

    /**
     * Gets the inner com.azure.resourcemanager.postgresql.generated.fluent.models.ServerAdministratorResourceInner
     * object.
     * 
     * @return the inner object.
     */
    ServerAdministratorResourceInner innerModel();
}
