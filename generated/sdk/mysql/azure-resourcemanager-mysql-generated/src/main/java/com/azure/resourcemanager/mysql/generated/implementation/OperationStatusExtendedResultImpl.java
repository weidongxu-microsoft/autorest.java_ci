// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.mysql.generated.fluent.models.OperationStatusExtendedResultInner;
import com.azure.resourcemanager.mysql.generated.models.OperationStatusExtendedResult;
import com.azure.resourcemanager.mysql.generated.models.OperationStatusResult;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class OperationStatusExtendedResultImpl implements OperationStatusExtendedResult {
    private OperationStatusExtendedResultInner innerObject;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    OperationStatusExtendedResultImpl(OperationStatusExtendedResultInner innerObject,
        com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String status() {
        return this.innerModel().status();
    }

    public Float percentComplete() {
        return this.innerModel().percentComplete();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public List<OperationStatusResult> operations() {
        List<OperationStatusResult> inner = this.innerModel().operations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public Map<String, Object> properties() {
        Map<String, Object> inner = this.innerModel().properties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public OperationStatusExtendedResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}
