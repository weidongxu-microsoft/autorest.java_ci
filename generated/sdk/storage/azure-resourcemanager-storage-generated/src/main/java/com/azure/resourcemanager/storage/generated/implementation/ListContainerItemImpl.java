// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.fluent.models.ListContainerItemInner;
import com.azure.resourcemanager.storage.generated.models.ImmutabilityPolicyProperties;
import com.azure.resourcemanager.storage.generated.models.ImmutableStorageWithVersioning;
import com.azure.resourcemanager.storage.generated.models.LeaseDuration;
import com.azure.resourcemanager.storage.generated.models.LeaseState;
import com.azure.resourcemanager.storage.generated.models.LeaseStatus;
import com.azure.resourcemanager.storage.generated.models.LegalHoldProperties;
import com.azure.resourcemanager.storage.generated.models.ListContainerItem;
import com.azure.resourcemanager.storage.generated.models.PublicAccess;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class ListContainerItemImpl implements ListContainerItem {
    private ListContainerItemInner innerObject;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    ListContainerItemImpl(ListContainerItemInner innerObject,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
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

    public String version() {
        return this.innerModel().version();
    }

    public Boolean deleted() {
        return this.innerModel().deleted();
    }

    public OffsetDateTime deletedTime() {
        return this.innerModel().deletedTime();
    }

    public Integer remainingRetentionDays() {
        return this.innerModel().remainingRetentionDays();
    }

    public String defaultEncryptionScope() {
        return this.innerModel().defaultEncryptionScope();
    }

    public Boolean denyEncryptionScopeOverride() {
        return this.innerModel().denyEncryptionScopeOverride();
    }

    public PublicAccess publicAccess() {
        return this.innerModel().publicAccess();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public LeaseStatus leaseStatus() {
        return this.innerModel().leaseStatus();
    }

    public LeaseState leaseState() {
        return this.innerModel().leaseState();
    }

    public LeaseDuration leaseDuration() {
        return this.innerModel().leaseDuration();
    }

    public Map<String, String> metadata() {
        Map<String, String> inner = this.innerModel().metadata();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ImmutabilityPolicyProperties immutabilityPolicy() {
        return this.innerModel().immutabilityPolicy();
    }

    public LegalHoldProperties legalHold() {
        return this.innerModel().legalHold();
    }

    public Boolean hasLegalHold() {
        return this.innerModel().hasLegalHold();
    }

    public Boolean hasImmutabilityPolicy() {
        return this.innerModel().hasImmutabilityPolicy();
    }

    public ImmutableStorageWithVersioning immutableStorageWithVersioning() {
        return this.innerModel().immutableStorageWithVersioning();
    }

    public Boolean enableNfsV3RootSquash() {
        return this.innerModel().enableNfsV3RootSquash();
    }

    public Boolean enableNfsV3AllSquash() {
        return this.innerModel().enableNfsV3AllSquash();
    }

    public ListContainerItemInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }
}
