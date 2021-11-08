// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.resourcemanager.consumption.generated.fluent.models.MarketplaceInner;
import com.azure.resourcemanager.consumption.generated.models.Marketplace;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public final class MarketplaceImpl implements Marketplace {
    private MarketplaceInner innerObject;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    MarketplaceImpl(
        MarketplaceInner innerObject,
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

    public String billingPeriodId() {
        return this.innerModel().billingPeriodId();
    }

    public OffsetDateTime usageStart() {
        return this.innerModel().usageStart();
    }

    public OffsetDateTime usageEnd() {
        return this.innerModel().usageEnd();
    }

    public BigDecimal resourceRate() {
        return this.innerModel().resourceRate();
    }

    public String offerName() {
        return this.innerModel().offerName();
    }

    public String resourceGroup() {
        return this.innerModel().resourceGroup();
    }

    public String additionalInfo() {
        return this.innerModel().additionalInfo();
    }

    public String orderNumber() {
        return this.innerModel().orderNumber();
    }

    public String instanceName() {
        return this.innerModel().instanceName();
    }

    public String instanceId() {
        return this.innerModel().instanceId();
    }

    public String currency() {
        return this.innerModel().currency();
    }

    public BigDecimal consumedQuantity() {
        return this.innerModel().consumedQuantity();
    }

    public String unitOfMeasure() {
        return this.innerModel().unitOfMeasure();
    }

    public BigDecimal pretaxCost() {
        return this.innerModel().pretaxCost();
    }

    public Boolean isEstimated() {
        return this.innerModel().isEstimated();
    }

    public UUID meterId() {
        return this.innerModel().meterId();
    }

    public UUID subscriptionGuid() {
        return this.innerModel().subscriptionGuid();
    }

    public String subscriptionName() {
        return this.innerModel().subscriptionName();
    }

    public String accountName() {
        return this.innerModel().accountName();
    }

    public String departmentName() {
        return this.innerModel().departmentName();
    }

    public String consumedService() {
        return this.innerModel().consumedService();
    }

    public String costCenter() {
        return this.innerModel().costCenter();
    }

    public String additionalProperties() {
        return this.innerModel().additionalProperties();
    }

    public String publisherName() {
        return this.innerModel().publisherName();
    }

    public String planName() {
        return this.innerModel().planName();
    }

    public Boolean isRecurringCharge() {
        return this.innerModel().isRecurringCharge();
    }

    public MarketplaceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
