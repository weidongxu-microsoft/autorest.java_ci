// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.resourcemanager.consumption.generated.fluent.models.ReservationDetailInner;
import com.azure.resourcemanager.consumption.generated.models.ReservationDetail;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class ReservationDetailImpl implements ReservationDetail {
    private ReservationDetailInner innerObject;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    ReservationDetailImpl(
        ReservationDetailInner innerObject,
        com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager) {
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

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String reservationOrderId() {
        return this.innerModel().reservationOrderId();
    }

    public String instanceFlexibilityRatio() {
        return this.innerModel().instanceFlexibilityRatio();
    }

    public String instanceFlexibilityGroup() {
        return this.innerModel().instanceFlexibilityGroup();
    }

    public String reservationId() {
        return this.innerModel().reservationId();
    }

    public String skuName() {
        return this.innerModel().skuName();
    }

    public BigDecimal reservedHours() {
        return this.innerModel().reservedHours();
    }

    public OffsetDateTime usageDate() {
        return this.innerModel().usageDate();
    }

    public BigDecimal usedHours() {
        return this.innerModel().usedHours();
    }

    public String instanceId() {
        return this.innerModel().instanceId();
    }

    public BigDecimal totalReservedQuantity() {
        return this.innerModel().totalReservedQuantity();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public ReservationDetailInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
