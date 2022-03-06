// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.recoveryservices.generated.models.IdentityData;
import com.azure.resourcemanager.recoveryservices.generated.models.Sku;
import com.azure.resourcemanager.recoveryservices.generated.models.VaultProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Resource information, as returned by the resource provider. */
@Fluent
public final class VaultInner extends Resource {
    /*
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private IdentityData identity;

    /*
     * Properties of the vault.
     */
    @JsonProperty(value = "properties")
    private VaultProperties properties;

    /*
     * Identifies the unique system identifier for each Azure resource.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    public IdentityData identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity for the resource.
     *
     * @param identity the identity value to set.
     * @return the VaultInner object itself.
     */
    public VaultInner withIdentity(IdentityData identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the properties property: Properties of the vault.
     *
     * @return the properties value.
     */
    public VaultProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the vault.
     *
     * @param properties the properties value to set.
     * @return the VaultInner object itself.
     */
    public VaultInner withProperties(VaultProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: Identifies the unique system identifier for each Azure resource.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Identifies the unique system identifier for each Azure resource.
     *
     * @param sku the sku value to set.
     * @return the VaultInner object itself.
     */
    public VaultInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public VaultInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VaultInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
