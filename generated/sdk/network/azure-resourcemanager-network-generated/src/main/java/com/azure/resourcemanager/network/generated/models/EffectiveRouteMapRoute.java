// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The effective RouteMap route configured on the connection resource. */
@Fluent
public final class EffectiveRouteMapRoute {
    /*
     * The address prefix of the route.
     */
    @JsonProperty(value = "prefix")
    private String prefix;

    /*
     * BGP communities of the route.
     */
    @JsonProperty(value = "bgpCommunities")
    private String bgpCommunities;

    /*
     * The ASPath of this route.
     */
    @JsonProperty(value = "asPath")
    private String asPath;

    /** Creates an instance of EffectiveRouteMapRoute class. */
    public EffectiveRouteMapRoute() {
    }

    /**
     * Get the prefix property: The address prefix of the route.
     *
     * @return the prefix value.
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The address prefix of the route.
     *
     * @param prefix the prefix value to set.
     * @return the EffectiveRouteMapRoute object itself.
     */
    public EffectiveRouteMapRoute withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the bgpCommunities property: BGP communities of the route.
     *
     * @return the bgpCommunities value.
     */
    public String bgpCommunities() {
        return this.bgpCommunities;
    }

    /**
     * Set the bgpCommunities property: BGP communities of the route.
     *
     * @param bgpCommunities the bgpCommunities value to set.
     * @return the EffectiveRouteMapRoute object itself.
     */
    public EffectiveRouteMapRoute withBgpCommunities(String bgpCommunities) {
        this.bgpCommunities = bgpCommunities;
        return this;
    }

    /**
     * Get the asPath property: The ASPath of this route.
     *
     * @return the asPath value.
     */
    public String asPath() {
        return this.asPath;
    }

    /**
     * Set the asPath property: The ASPath of this route.
     *
     * @param asPath the asPath value to set.
     * @return the EffectiveRouteMapRoute object itself.
     */
    public EffectiveRouteMapRoute withAsPath(String asPath) {
        this.asPath = asPath;
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