// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Map;

/** reservation detail resource. */
@Fluent
public final class ReservationDetailInner extends ProxyResource {
    /*
     * The properties of the reservation detail.
     */
    @JsonProperty(value = "properties")
    private ReservationDetailProperties innerProperties;

    /*
     * The etag for the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the innerProperties property: The properties of the reservation detail.
     *
     * @return the innerProperties value.
     */
    private ReservationDetailProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: The etag for the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Get the reservationOrderId property: The reservation order ID is the identifier for a reservation purchase. Each
     * reservation order ID represents a single purchase transaction. A reservation order contains reservations. The
     * reservation order specifies the VM size and region for the reservations.
     *
     * @return the reservationOrderId value.
     */
    public String reservationOrderId() {
        return this.innerProperties() == null ? null : this.innerProperties().reservationOrderId();
    }

    /**
     * Get the instanceFlexibilityRatio property: The instance Flexibility Ratio.
     *
     * @return the instanceFlexibilityRatio value.
     */
    public String instanceFlexibilityRatio() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceFlexibilityRatio();
    }

    /**
     * Get the instanceFlexibilityGroup property: The instance Flexibility Group.
     *
     * @return the instanceFlexibilityGroup value.
     */
    public String instanceFlexibilityGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceFlexibilityGroup();
    }

    /**
     * Get the reservationId property: The reservation ID is the identifier of a reservation within a reservation order.
     * Each reservation is the grouping for applying the benefit scope and also specifies the number of instances to
     * which the reservation benefit can be applied to.
     *
     * @return the reservationId value.
     */
    public String reservationId() {
        return this.innerProperties() == null ? null : this.innerProperties().reservationId();
    }

    /**
     * Get the skuName property: This is the ARM Sku name. It can be used to join with the serviceType field in
     * additional info in usage records.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.innerProperties() == null ? null : this.innerProperties().skuName();
    }

    /**
     * Get the reservedHours property: This is the total hours reserved for the day. E.g. if reservation for 1 instance
     * was made on 1 PM, this will be 11 hours for that day and 24 hours from subsequent days.
     *
     * @return the reservedHours value.
     */
    public BigDecimal reservedHours() {
        return this.innerProperties() == null ? null : this.innerProperties().reservedHours();
    }

    /**
     * Get the usageDate property: The date on which consumption occurred.
     *
     * @return the usageDate value.
     */
    public OffsetDateTime usageDate() {
        return this.innerProperties() == null ? null : this.innerProperties().usageDate();
    }

    /**
     * Get the usedHours property: This is the total hours used by the instance.
     *
     * @return the usedHours value.
     */
    public BigDecimal usedHours() {
        return this.innerProperties() == null ? null : this.innerProperties().usedHours();
    }

    /**
     * Get the instanceId property: This identifier is the name of the resource or the fully qualified Resource ID.
     *
     * @return the instanceId value.
     */
    public String instanceId() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceId();
    }

    /**
     * Get the totalReservedQuantity property: This is the total count of instances that are reserved for the
     * reservationId.
     *
     * @return the totalReservedQuantity value.
     */
    public BigDecimal totalReservedQuantity() {
        return this.innerProperties() == null ? null : this.innerProperties().totalReservedQuantity();
    }

    /**
     * Get the kind property: The reservation kind.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.innerProperties() == null ? null : this.innerProperties().kind();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
