// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayPrivateEndpointConnectionInner;

/**
 * An immutable client-side representation of ApplicationGatewayPrivateEndpointConnection.
 */
public interface ApplicationGatewayPrivateEndpointConnection {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Name of the private endpoint connection on an application gateway.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: Type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the privateEndpoint property: The resource of private end point.
     * 
     * @return the privateEndpoint value.
     */
    PrivateEndpoint privateEndpoint();

    /**
     * Gets the privateLinkServiceConnectionState property: A collection of information about the state of the
     * connection between service consumer and provider.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    PrivateLinkServiceConnectionState privateLinkServiceConnectionState();

    /**
     * Gets the provisioningState property: The provisioning state of the application gateway private endpoint
     * connection resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the linkIdentifier property: The consumer link id.
     * 
     * @return the linkIdentifier value.
     */
    String linkIdentifier();

    /**
     * Gets the inner
     * com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayPrivateEndpointConnectionInner
     * object.
     * 
     * @return the inner object.
     */
    ApplicationGatewayPrivateEndpointConnectionInner innerModel();
}
