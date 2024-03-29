// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The network properties.
 */
@Fluent
public final class NetworkProperties {
    /*
     * A value to describe how the outbound dependencies of a HDInsight cluster are managed. 'Managed' means that the outbound dependencies are managed by the HDInsight service. 'External' means that the outbound dependencies are managed by a customer specific solution.
     */
    @JsonProperty(value = "outboundDependenciesManagedType")
    private OutboundDependenciesManagedType outboundDependenciesManagedType;

    /*
     * The direction for the resource provider connection.
     */
    @JsonProperty(value = "resourceProviderConnection")
    private ResourceProviderConnection resourceProviderConnection;

    /*
     * Indicates whether or not private link is enabled.
     */
    @JsonProperty(value = "privateLink")
    private PrivateLink privateLink;

    /**
     * Creates an instance of NetworkProperties class.
     */
    public NetworkProperties() {
    }

    /**
     * Get the outboundDependenciesManagedType property: A value to describe how the outbound dependencies of a HDInsight cluster are managed. 'Managed' means that the outbound dependencies are managed by the HDInsight service. 'External' means that the outbound dependencies are managed by a customer specific solution.
     * 
     * @return the outboundDependenciesManagedType value.
     */
    public OutboundDependenciesManagedType outboundDependenciesManagedType() {
        return this.outboundDependenciesManagedType;
    }

    /**
     * Set the outboundDependenciesManagedType property: A value to describe how the outbound dependencies of a HDInsight cluster are managed. 'Managed' means that the outbound dependencies are managed by the HDInsight service. 'External' means that the outbound dependencies are managed by a customer specific solution.
     * 
     * @param outboundDependenciesManagedType the outboundDependenciesManagedType value to set.
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties
        withOutboundDependenciesManagedType(OutboundDependenciesManagedType outboundDependenciesManagedType) {
        this.outboundDependenciesManagedType = outboundDependenciesManagedType;
        return this;
    }

    /**
     * Get the resourceProviderConnection property: The direction for the resource provider connection.
     * 
     * @return the resourceProviderConnection value.
     */
    public ResourceProviderConnection resourceProviderConnection() {
        return this.resourceProviderConnection;
    }

    /**
     * Set the resourceProviderConnection property: The direction for the resource provider connection.
     * 
     * @param resourceProviderConnection the resourceProviderConnection value to set.
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withResourceProviderConnection(ResourceProviderConnection resourceProviderConnection) {
        this.resourceProviderConnection = resourceProviderConnection;
        return this;
    }

    /**
     * Get the privateLink property: Indicates whether or not private link is enabled.
     * 
     * @return the privateLink value.
     */
    public PrivateLink privateLink() {
        return this.privateLink;
    }

    /**
     * Set the privateLink property: Indicates whether or not private link is enabled.
     * 
     * @param privateLink the privateLink value to set.
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withPrivateLink(PrivateLink privateLink) {
        this.privateLink = privateLink;
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
