// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SwiftVirtualNetwork resource specific properties. */
@Fluent
public final class SwiftVirtualNetworkProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SwiftVirtualNetworkProperties.class);

    /*
     * The Virtual Network subnet's resource ID. This is the subnet that this
     * Web App will join. This subnet must have a delegation to
     * Microsoft.Web/serverFarms defined first.
     */
    @JsonProperty(value = "subnetResourceId")
    private String subnetResourceId;

    /*
     * A flag that specifies if the scale unit this Web App is on supports
     * Swift integration.
     */
    @JsonProperty(value = "swiftSupported")
    private Boolean swiftSupported;

    /**
     * Get the subnetResourceId property: The Virtual Network subnet's resource ID. This is the subnet that this Web App
     * will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     *
     * @return the subnetResourceId value.
     */
    public String subnetResourceId() {
        return this.subnetResourceId;
    }

    /**
     * Set the subnetResourceId property: The Virtual Network subnet's resource ID. This is the subnet that this Web App
     * will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     *
     * @param subnetResourceId the subnetResourceId value to set.
     * @return the SwiftVirtualNetworkProperties object itself.
     */
    public SwiftVirtualNetworkProperties withSubnetResourceId(String subnetResourceId) {
        this.subnetResourceId = subnetResourceId;
        return this;
    }

    /**
     * Get the swiftSupported property: A flag that specifies if the scale unit this Web App is on supports Swift
     * integration.
     *
     * @return the swiftSupported value.
     */
    public Boolean swiftSupported() {
        return this.swiftSupported;
    }

    /**
     * Set the swiftSupported property: A flag that specifies if the scale unit this Web App is on supports Swift
     * integration.
     *
     * @param swiftSupported the swiftSupported value to set.
     * @return the SwiftVirtualNetworkProperties object itself.
     */
    public SwiftVirtualNetworkProperties withSwiftSupported(Boolean swiftSupported) {
        this.swiftSupported = swiftSupported;
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
