// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.implementation;

import com.azure.resourcemanager.costmanagement.generated.fluent.models.DimensionInner;
import com.azure.resourcemanager.costmanagement.generated.models.Dimension;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DimensionImpl implements Dimension {
    private DimensionInner innerObject;

    private final com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager;

    DimensionImpl(DimensionInner innerObject,
        com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager) {
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

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String description() {
        return this.innerModel().description();
    }

    public Boolean filterEnabled() {
        return this.innerModel().filterEnabled();
    }

    public Boolean groupingEnabled() {
        return this.innerModel().groupingEnabled();
    }

    public List<String> data() {
        List<String> inner = this.innerModel().data();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Integer total() {
        return this.innerModel().total();
    }

    public String category() {
        return this.innerModel().category();
    }

    public OffsetDateTime usageStart() {
        return this.innerModel().usageStart();
    }

    public OffsetDateTime usageEnd() {
        return this.innerModel().usageEnd();
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public DimensionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.costmanagement.generated.CostManagementManager manager() {
        return this.serviceManager;
    }
}
