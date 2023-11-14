// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.resourcemanager.monitor.generated.fluent.models.SingleMetricBaselineInner;
import com.azure.resourcemanager.monitor.generated.models.SingleMetricBaseline;
import com.azure.resourcemanager.monitor.generated.models.TimeSeriesBaseline;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

public final class SingleMetricBaselineImpl implements SingleMetricBaseline {
    private SingleMetricBaselineInner innerObject;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    SingleMetricBaselineImpl(SingleMetricBaselineInner innerObject,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String timespan() {
        return this.innerModel().timespan();
    }

    public Duration interval() {
        return this.innerModel().interval();
    }

    public String namespace() {
        return this.innerModel().namespace();
    }

    public List<TimeSeriesBaseline> baselines() {
        List<TimeSeriesBaseline> inner = this.innerModel().baselines();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SingleMetricBaselineInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
