// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.implementation;

import com.azure.resourcemanager.postgresql.generated.fluent.models.ServerAdministratorResourceInner;
import com.azure.resourcemanager.postgresql.generated.models.AdministratorType;
import com.azure.resourcemanager.postgresql.generated.models.ServerAdministratorResource;
import java.util.UUID;

public final class ServerAdministratorResourceImpl implements ServerAdministratorResource {
    private ServerAdministratorResourceInner innerObject;

    private final com.azure.resourcemanager.postgresql.generated.PostgreSqlManager serviceManager;

    ServerAdministratorResourceImpl(ServerAdministratorResourceInner innerObject,
        com.azure.resourcemanager.postgresql.generated.PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public AdministratorType administratorType() {
        return this.innerModel().administratorType();
    }

    public String login() {
        return this.innerModel().login();
    }

    public UUID sid() {
        return this.innerModel().sid();
    }

    public UUID tenantId() {
        return this.innerModel().tenantId();
    }

    public ServerAdministratorResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.postgresql.generated.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
