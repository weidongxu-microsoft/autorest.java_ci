// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.implementation;

import com.azure.resourcemanager.postgresql.generated.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.postgresql.generated.models.NameAvailability;

public final class NameAvailabilityImpl implements NameAvailability {
    private NameAvailabilityInner innerObject;

    private final com.azure.resourcemanager.postgresql.generated.PostgreSqlManager serviceManager;

    NameAvailabilityImpl(
        NameAvailabilityInner innerObject,
        com.azure.resourcemanager.postgresql.generated.PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String message() {
        return this.innerModel().message();
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public NameAvailabilityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.postgresql.generated.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
