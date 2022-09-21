// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Patch Resource information, as returned by the resource provider. */
@Fluent
public final class PatchVault extends PatchTrackedResource {
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
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private IdentityData identity;

    /** Creates an instance of PatchVault class. */
    public PatchVault() {
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
     * @return the PatchVault object itself.
     */
    public PatchVault withProperties(VaultProperties properties) {
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
     * @return the PatchVault object itself.
     */
    public PatchVault withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

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
     * @return the PatchVault object itself.
     */
    public PatchVault withIdentity(IdentityData identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PatchVault withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PatchVault withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PatchVault withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
