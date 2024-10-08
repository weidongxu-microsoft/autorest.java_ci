// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.mysql.generated.fluent.models.ServerBackupInner;
import com.azure.resourcemanager.mysql.generated.models.ServerBackup;
import java.time.OffsetDateTime;

public final class ServerBackupImpl implements ServerBackup {
    private ServerBackupInner innerObject;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    ServerBackupImpl(ServerBackupInner innerObject,
        com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String backupType() {
        return this.innerModel().backupType();
    }

    public OffsetDateTime completedTime() {
        return this.innerModel().completedTime();
    }

    public String source() {
        return this.innerModel().source();
    }

    public ServerBackupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}
