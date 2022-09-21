// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.postgresql.generated.models.AdministratorType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Represents a and external administrator to be created. */
@Fluent
public final class ServerAdministratorResourceInner extends ProxyResource {
    /*
     * Properties of the server AAD administrator.
     */
    @JsonProperty(value = "properties")
    private ServerAdministratorProperties innerProperties;

    /** Creates an instance of ServerAdministratorResourceInner class. */
    public ServerAdministratorResourceInner() {
    }

    /**
     * Get the innerProperties property: Properties of the server AAD administrator.
     *
     * @return the innerProperties value.
     */
    private ServerAdministratorProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the administratorType property: The type of administrator.
     *
     * @return the administratorType value.
     */
    public AdministratorType administratorType() {
        return this.innerProperties() == null ? null : this.innerProperties().administratorType();
    }

    /**
     * Set the administratorType property: The type of administrator.
     *
     * @param administratorType the administratorType value to set.
     * @return the ServerAdministratorResourceInner object itself.
     */
    public ServerAdministratorResourceInner withAdministratorType(AdministratorType administratorType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerAdministratorProperties();
        }
        this.innerProperties().withAdministratorType(administratorType);
        return this;
    }

    /**
     * Get the login property: The server administrator login account name.
     *
     * @return the login value.
     */
    public String login() {
        return this.innerProperties() == null ? null : this.innerProperties().login();
    }

    /**
     * Set the login property: The server administrator login account name.
     *
     * @param login the login value to set.
     * @return the ServerAdministratorResourceInner object itself.
     */
    public ServerAdministratorResourceInner withLogin(String login) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerAdministratorProperties();
        }
        this.innerProperties().withLogin(login);
        return this;
    }

    /**
     * Get the sid property: The server administrator Sid (Secure ID).
     *
     * @return the sid value.
     */
    public UUID sid() {
        return this.innerProperties() == null ? null : this.innerProperties().sid();
    }

    /**
     * Set the sid property: The server administrator Sid (Secure ID).
     *
     * @param sid the sid value to set.
     * @return the ServerAdministratorResourceInner object itself.
     */
    public ServerAdministratorResourceInner withSid(UUID sid) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerAdministratorProperties();
        }
        this.innerProperties().withSid(sid);
        return this;
    }

    /**
     * Get the tenantId property: The server Active Directory Administrator tenant id.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The server Active Directory Administrator tenant id.
     *
     * @param tenantId the tenantId value to set.
     * @return the ServerAdministratorResourceInner object itself.
     */
    public ServerAdministratorResourceInner withTenantId(UUID tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerAdministratorProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
