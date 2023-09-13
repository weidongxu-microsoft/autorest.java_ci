// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Server edition capabilities. */
@Immutable
public final class ServerEditionCapabilityV2 {
    /*
     * Server edition name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Default Sku name
     */
    @JsonProperty(value = "defaultSku", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultSku;

    /*
     * Default storage size
     */
    @JsonProperty(value = "defaultStorageSize", access = JsonProperty.Access.WRITE_ONLY)
    private Integer defaultStorageSize;

    /*
     * A list of supported storage editions
     */
    @JsonProperty(value = "supportedStorageEditions", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageEditionCapability> supportedStorageEditions;

    /*
     * A list of supported Skus
     */
    @JsonProperty(value = "supportedSkus", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuCapabilityV2> supportedSkus;

    /** Creates an instance of ServerEditionCapabilityV2 class. */
    public ServerEditionCapabilityV2() {
    }

    /**
     * Get the name property: Server edition name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the defaultSku property: Default Sku name.
     *
     * @return the defaultSku value.
     */
    public String defaultSku() {
        return this.defaultSku;
    }

    /**
     * Get the defaultStorageSize property: Default storage size.
     *
     * @return the defaultStorageSize value.
     */
    public Integer defaultStorageSize() {
        return this.defaultStorageSize;
    }

    /**
     * Get the supportedStorageEditions property: A list of supported storage editions.
     *
     * @return the supportedStorageEditions value.
     */
    public List<StorageEditionCapability> supportedStorageEditions() {
        return this.supportedStorageEditions;
    }

    /**
     * Get the supportedSkus property: A list of supported Skus.
     *
     * @return the supportedSkus value.
     */
    public List<SkuCapabilityV2> supportedSkus() {
        return this.supportedSkus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedStorageEditions() != null) {
            supportedStorageEditions().forEach(e -> e.validate());
        }
        if (supportedSkus() != null) {
            supportedSkus().forEach(e -> e.validate());
        }
    }
}
