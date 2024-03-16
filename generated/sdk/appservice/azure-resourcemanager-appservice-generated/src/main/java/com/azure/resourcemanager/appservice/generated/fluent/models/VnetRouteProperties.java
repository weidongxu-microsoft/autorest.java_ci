// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.RouteType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VnetRoute resource specific properties.
 */
@Fluent
public final class VnetRouteProperties {
    /*
     * The starting address for this route. This may also include a CIDR notation, in which case the end address must not be specified.
     */
    @JsonProperty(value = "startAddress")
    private String startAddress;

    /*
     * The ending address for this route. If the start address is specified in CIDR notation, this must be omitted.
     */
    @JsonProperty(value = "endAddress")
    private String endAddress;

    /*
     * The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     * 
     * These values will be used for syncing an app's routes with those from a Virtual Network.
     */
    @JsonProperty(value = "routeType")
    private RouteType routeType;

    /**
     * Creates an instance of VnetRouteProperties class.
     */
    public VnetRouteProperties() {
    }

    /**
     * Get the startAddress property: The starting address for this route. This may also include a CIDR notation, in which case the end address must not be specified.
     * 
     * @return the startAddress value.
     */
    public String startAddress() {
        return this.startAddress;
    }

    /**
     * Set the startAddress property: The starting address for this route. This may also include a CIDR notation, in which case the end address must not be specified.
     * 
     * @param startAddress the startAddress value to set.
     * @return the VnetRouteProperties object itself.
     */
    public VnetRouteProperties withStartAddress(String startAddress) {
        this.startAddress = startAddress;
        return this;
    }

    /**
     * Get the endAddress property: The ending address for this route. If the start address is specified in CIDR notation, this must be omitted.
     * 
     * @return the endAddress value.
     */
    public String endAddress() {
        return this.endAddress;
    }

    /**
     * Set the endAddress property: The ending address for this route. If the start address is specified in CIDR notation, this must be omitted.
     * 
     * @param endAddress the endAddress value to set.
     * @return the VnetRouteProperties object itself.
     */
    public VnetRouteProperties withEndAddress(String endAddress) {
        this.endAddress = endAddress;
        return this;
    }

    /**
     * Get the routeType property: The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     * 
     * These values will be used for syncing an app's routes with those from a Virtual Network.
     * 
     * @return the routeType value.
     */
    public RouteType routeType() {
        return this.routeType;
    }

    /**
     * Set the routeType property: The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     * 
     * These values will be used for syncing an app's routes with those from a Virtual Network.
     * 
     * @param routeType the routeType value to set.
     * @return the VnetRouteProperties object itself.
     */
    public VnetRouteProperties withRouteType(RouteType routeType) {
        this.routeType = routeType;
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
