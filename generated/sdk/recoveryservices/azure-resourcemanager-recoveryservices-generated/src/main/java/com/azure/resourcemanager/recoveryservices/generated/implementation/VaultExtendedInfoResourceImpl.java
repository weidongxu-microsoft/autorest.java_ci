// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.implementation;

import com.azure.resourcemanager.recoveryservices.generated.fluent.models.VaultExtendedInfoResourceInner;
import com.azure.resourcemanager.recoveryservices.generated.models.VaultExtendedInfoResource;

public final class VaultExtendedInfoResourceImpl implements VaultExtendedInfoResource {
    private VaultExtendedInfoResourceInner innerObject;

    private final com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager serviceManager;

    VaultExtendedInfoResourceImpl(VaultExtendedInfoResourceInner innerObject,
        com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager serviceManager) {
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

    public String etag() {
        return this.innerModel().etag();
    }

    public String integrityKey() {
        return this.innerModel().integrityKey();
    }

    public String encryptionKey() {
        return this.innerModel().encryptionKey();
    }

    public String encryptionKeyThumbprint() {
        return this.innerModel().encryptionKeyThumbprint();
    }

    public String algorithm() {
        return this.innerModel().algorithm();
    }

    public VaultExtendedInfoResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager manager() {
        return this.serviceManager;
    }
}
