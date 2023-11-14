// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.SiteConfigurationSnapshotInfoInner;
import com.azure.resourcemanager.appservice.generated.models.SiteConfigurationSnapshotInfo;
import java.time.OffsetDateTime;

public final class SiteConfigurationSnapshotInfoImpl implements SiteConfigurationSnapshotInfo {
    private SiteConfigurationSnapshotInfoInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    SiteConfigurationSnapshotInfoImpl(SiteConfigurationSnapshotInfoInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public OffsetDateTime time() {
        return this.innerModel().time();
    }

    public Integer snapshotId() {
        return this.innerModel().snapshotId();
    }

    public SiteConfigurationSnapshotInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
