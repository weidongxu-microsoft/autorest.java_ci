// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.SkuCapacity;
import com.azure.resourcemanager.appservice.generated.models.SkuDescription;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU discovery information. */
@Fluent
public final class SkuInfoInner {
    /*
     * Resource type that this SKU applies to.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * Name and tier of the SKU.
     */
    @JsonProperty(value = "sku")
    private SkuDescription sku;

    /*
     * Min, max, and default scale values of the SKU.
     */
    @JsonProperty(value = "capacity")
    private SkuCapacity capacity;

    /** Creates an instance of SkuInfoInner class. */
    public SkuInfoInner() {
    }

    /**
     * Get the resourceType property: Resource type that this SKU applies to.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource type that this SKU applies to.
     *
     * @param resourceType the resourceType value to set.
     * @return the SkuInfoInner object itself.
     */
    public SkuInfoInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the sku property: Name and tier of the SKU.
     *
     * @return the sku value.
     */
    public SkuDescription sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Name and tier of the SKU.
     *
     * @param sku the sku value to set.
     * @return the SkuInfoInner object itself.
     */
    public SkuInfoInner withSku(SkuDescription sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the capacity property: Min, max, and default scale values of the SKU.
     *
     * @return the capacity value.
     */
    public SkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Min, max, and default scale values of the SKU.
     *
     * @param capacity the capacity value to set.
     * @return the SkuInfoInner object itself.
     */
    public SkuInfoInner withCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (capacity() != null) {
            capacity().validate();
        }
    }
}
