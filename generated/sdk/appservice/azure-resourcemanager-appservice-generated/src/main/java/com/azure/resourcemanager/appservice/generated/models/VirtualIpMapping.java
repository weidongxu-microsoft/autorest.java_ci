// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Virtual IP mapping. */
@Fluent
public final class VirtualIpMapping {
    /*
     * Virtual IP address.
     */
    @JsonProperty(value = "virtualIP")
    private String virtualIp;

    /*
     * Internal HTTP port.
     */
    @JsonProperty(value = "internalHttpPort")
    private Integer internalHttpPort;

    /*
     * Internal HTTPS port.
     */
    @JsonProperty(value = "internalHttpsPort")
    private Integer internalHttpsPort;

    /*
     * Is virtual IP mapping in use.
     */
    @JsonProperty(value = "inUse")
    private Boolean inUse;

    /*
     * name of the service that virtual IP is assigned to
     */
    @JsonProperty(value = "serviceName")
    private String serviceName;

    /**
     * Get the virtualIp property: Virtual IP address.
     *
     * @return the virtualIp value.
     */
    public String virtualIp() {
        return this.virtualIp;
    }

    /**
     * Set the virtualIp property: Virtual IP address.
     *
     * @param virtualIp the virtualIp value to set.
     * @return the VirtualIpMapping object itself.
     */
    public VirtualIpMapping withVirtualIp(String virtualIp) {
        this.virtualIp = virtualIp;
        return this;
    }

    /**
     * Get the internalHttpPort property: Internal HTTP port.
     *
     * @return the internalHttpPort value.
     */
    public Integer internalHttpPort() {
        return this.internalHttpPort;
    }

    /**
     * Set the internalHttpPort property: Internal HTTP port.
     *
     * @param internalHttpPort the internalHttpPort value to set.
     * @return the VirtualIpMapping object itself.
     */
    public VirtualIpMapping withInternalHttpPort(Integer internalHttpPort) {
        this.internalHttpPort = internalHttpPort;
        return this;
    }

    /**
     * Get the internalHttpsPort property: Internal HTTPS port.
     *
     * @return the internalHttpsPort value.
     */
    public Integer internalHttpsPort() {
        return this.internalHttpsPort;
    }

    /**
     * Set the internalHttpsPort property: Internal HTTPS port.
     *
     * @param internalHttpsPort the internalHttpsPort value to set.
     * @return the VirtualIpMapping object itself.
     */
    public VirtualIpMapping withInternalHttpsPort(Integer internalHttpsPort) {
        this.internalHttpsPort = internalHttpsPort;
        return this;
    }

    /**
     * Get the inUse property: Is virtual IP mapping in use.
     *
     * @return the inUse value.
     */
    public Boolean inUse() {
        return this.inUse;
    }

    /**
     * Set the inUse property: Is virtual IP mapping in use.
     *
     * @param inUse the inUse value to set.
     * @return the VirtualIpMapping object itself.
     */
    public VirtualIpMapping withInUse(Boolean inUse) {
        this.inUse = inUse;
        return this;
    }

    /**
     * Get the serviceName property: name of the service that virtual IP is assigned to.
     *
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: name of the service that virtual IP is assigned to.
     *
     * @param serviceName the serviceName value to set.
     * @return the VirtualIpMapping object itself.
     */
    public VirtualIpMapping withServiceName(String serviceName) {
        this.serviceName = serviceName;
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
