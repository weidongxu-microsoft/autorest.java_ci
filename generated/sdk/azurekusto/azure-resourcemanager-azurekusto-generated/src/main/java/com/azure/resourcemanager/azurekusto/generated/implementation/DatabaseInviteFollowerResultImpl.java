// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.implementation;

import com.azure.resourcemanager.azurekusto.generated.fluent.models.DatabaseInviteFollowerResultInner;
import com.azure.resourcemanager.azurekusto.generated.models.DatabaseInviteFollowerResult;

public final class DatabaseInviteFollowerResultImpl implements DatabaseInviteFollowerResult {
    private DatabaseInviteFollowerResultInner innerObject;

    private final com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager;

    DatabaseInviteFollowerResultImpl(
        DatabaseInviteFollowerResultInner innerObject,
        com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String generatedInvitation() {
        return this.innerModel().generatedInvitation();
    }

    public DatabaseInviteFollowerResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurekusto.generated.KustoManager manager() {
        return this.serviceManager;
    }
}
