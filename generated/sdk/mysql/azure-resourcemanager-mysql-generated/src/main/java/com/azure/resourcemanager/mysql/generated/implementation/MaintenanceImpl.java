// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.mysql.generated.fluent.models.MaintenanceInner;
import com.azure.resourcemanager.mysql.generated.models.Maintenance;
import com.azure.resourcemanager.mysql.generated.models.MaintenanceProvisioningState;
import com.azure.resourcemanager.mysql.generated.models.MaintenanceState;
import com.azure.resourcemanager.mysql.generated.models.MaintenanceType;
import java.time.OffsetDateTime;

public final class MaintenanceImpl implements Maintenance {
    private MaintenanceInner innerObject;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    MaintenanceImpl(MaintenanceInner innerObject,
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

    public MaintenanceType maintenanceType() {
        return this.innerModel().maintenanceType();
    }

    public MaintenanceState maintenanceState() {
        return this.innerModel().maintenanceState();
    }

    public OffsetDateTime maintenanceStartTime() {
        return this.innerModel().maintenanceStartTime();
    }

    public OffsetDateTime maintenanceEndTime() {
        return this.innerModel().maintenanceEndTime();
    }

    public OffsetDateTime maintenanceExecutionStartTime() {
        return this.innerModel().maintenanceExecutionStartTime();
    }

    public OffsetDateTime maintenanceExecutionEndTime() {
        return this.innerModel().maintenanceExecutionEndTime();
    }

    public OffsetDateTime maintenanceAvailableScheduleMinTime() {
        return this.innerModel().maintenanceAvailableScheduleMinTime();
    }

    public OffsetDateTime maintenanceAvailableScheduleMaxTime() {
        return this.innerModel().maintenanceAvailableScheduleMaxTime();
    }

    public String maintenanceTitle() {
        return this.innerModel().maintenanceTitle();
    }

    public String maintenanceDescription() {
        return this.innerModel().maintenanceDescription();
    }

    public MaintenanceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public MaintenanceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}
