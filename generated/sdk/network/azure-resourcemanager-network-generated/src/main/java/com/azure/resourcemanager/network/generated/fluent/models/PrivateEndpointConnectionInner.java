// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PrivateEndpointConnection resource.
 */
@Fluent
public final class PrivateEndpointConnectionInner extends SubResource {
    /*
     * Properties of the private end point connection.
     */
    @JsonProperty(value = "properties")
    private PrivateEndpointConnectionPropertiesInner innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Creates an instance of PrivateEndpointConnectionInner class.
     */
    public PrivateEndpointConnectionInner() {
    }

    /**
     * Get the innerProperties property: Properties of the private end point connection.
     * 
     * @return the innerProperties value.
     */
    private PrivateEndpointConnectionPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrivateEndpointConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the privateEndpoint property: The resource of private end point.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpointInner privateEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpoint();
    }

    /**
     * Get the privateLinkServiceConnectionState property: A collection of information about the state of the connection
     * between service consumer and provider.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceConnectionState();
    }

    /**
     * Set the privateLinkServiceConnectionState property: A collection of information about the state of the connection
     * between service consumer and provider.
     * 
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner
        withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointConnectionPropertiesInner();
        }
        this.innerProperties().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private endpoint connection resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the linkIdentifier property: The consumer link id.
     * 
     * @return the linkIdentifier value.
     */
    public String linkIdentifier() {
        return this.innerProperties() == null ? null : this.innerProperties().linkIdentifier();
    }

    /**
     * Get the privateEndpointLocation property: The location of the private endpoint.
     * 
     * @return the privateEndpointLocation value.
     */
    public String privateEndpointLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointLocation();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
