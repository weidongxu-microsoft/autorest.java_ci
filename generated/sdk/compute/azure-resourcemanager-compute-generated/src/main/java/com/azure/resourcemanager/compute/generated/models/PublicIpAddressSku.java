// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the public IP Sku. It can only be set with OrchestrationMode as Flexible. */
@Fluent
public final class PublicIpAddressSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpAddressSku.class);

    /*
     * Specify public IP sku name
     */
    @JsonProperty(value = "name")
    private PublicIpAddressSkuName name;

    /*
     * Specify public IP sku tier
     */
    @JsonProperty(value = "tier")
    private PublicIpAddressSkuTier tier;

    /**
     * Get the name property: Specify public IP sku name.
     *
     * @return the name value.
     */
    public PublicIpAddressSkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Specify public IP sku name.
     *
     * @param name the name value to set.
     * @return the PublicIpAddressSku object itself.
     */
    public PublicIpAddressSku withName(PublicIpAddressSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Specify public IP sku tier.
     *
     * @return the tier value.
     */
    public PublicIpAddressSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Specify public IP sku tier.
     *
     * @param tier the tier value to set.
     * @return the PublicIpAddressSku object itself.
     */
    public PublicIpAddressSku withTier(PublicIpAddressSkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
