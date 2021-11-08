// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cni configuration. */
@Immutable
public final class CniConfig {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CniConfig.class);

    /*
     * Cni type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Cni version
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Pod Subnet
     */
    @JsonProperty(value = "podSubnet", access = JsonProperty.Access.WRITE_ONLY)
    private String podSubnet;

    /*
     * Service subnet
     */
    @JsonProperty(value = "serviceSubnet", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceSubnet;

    /**
     * Get the type property: Cni type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the version property: Cni version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the podSubnet property: Pod Subnet.
     *
     * @return the podSubnet value.
     */
    public String podSubnet() {
        return this.podSubnet;
    }

    /**
     * Get the serviceSubnet property: Service subnet.
     *
     * @return the serviceSubnet value.
     */
    public String serviceSubnet() {
        return this.serviceSubnet;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
