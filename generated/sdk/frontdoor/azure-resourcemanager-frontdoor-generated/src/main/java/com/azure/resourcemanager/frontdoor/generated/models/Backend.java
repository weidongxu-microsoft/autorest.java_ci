// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Backend address of a frontDoor load balancer.
 */
@Fluent
public final class Backend {
    /*
     * Location of the backend (IP address or FQDN)
     */
    @JsonProperty(value = "address")
    private String address;

    /*
     * The Alias of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     */
    @JsonProperty(value = "privateLinkAlias")
    private String privateLinkAlias;

    /*
     * The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     */
    @JsonProperty(value = "privateLinkResourceId")
    private String privateLinkResourceId;

    /*
     * The location of the Private Link resource. Required only if 'privateLinkResourceId' is populated
     */
    @JsonProperty(value = "privateLinkLocation")
    private String privateLinkLocation;

    /*
     * The Approval status for the connection to the Private Link
     */
    @JsonProperty(value = "privateEndpointStatus", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointStatus privateEndpointStatus;

    /*
     * A custom message to be included in the approval request to connect to the Private Link
     */
    @JsonProperty(value = "privateLinkApprovalMessage")
    private String privateLinkApprovalMessage;

    /*
     * The HTTP TCP port number. Must be between 1 and 65535.
     */
    @JsonProperty(value = "httpPort")
    private Integer httpPort;

    /*
     * The HTTPS TCP port number. Must be between 1 and 65535.
     */
    @JsonProperty(value = "httpsPort")
    private Integer httpsPort;

    /*
     * Whether to enable use of this backend. Permitted values are 'Enabled' or 'Disabled'
     */
    @JsonProperty(value = "enabledState")
    private BackendEnabledState enabledState;

    /*
     * Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Weight of this endpoint for load balancing purposes.
     */
    @JsonProperty(value = "weight")
    private Integer weight;

    /*
     * The value to use as the host header sent to the backend. If blank or unspecified, this defaults to the incoming host.
     */
    @JsonProperty(value = "backendHostHeader")
    private String backendHostHeader;

    /**
     * Creates an instance of Backend class.
     */
    public Backend() {
    }

    /**
     * Get the address property: Location of the backend (IP address or FQDN).
     * 
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: Location of the backend (IP address or FQDN).
     * 
     * @param address the address value to set.
     * @return the Backend object itself.
     */
    public Backend withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the privateLinkAlias property: The Alias of the Private Link resource. Populating this optional field
     * indicates that this backend is 'Private'.
     * 
     * @return the privateLinkAlias value.
     */
    public String privateLinkAlias() {
        return this.privateLinkAlias;
    }

    /**
     * Set the privateLinkAlias property: The Alias of the Private Link resource. Populating this optional field
     * indicates that this backend is 'Private'.
     * 
     * @param privateLinkAlias the privateLinkAlias value to set.
     * @return the Backend object itself.
     */
    public Backend withPrivateLinkAlias(String privateLinkAlias) {
        this.privateLinkAlias = privateLinkAlias;
        return this;
    }

    /**
     * Get the privateLinkResourceId property: The Resource Id of the Private Link resource. Populating this optional
     * field indicates that this backend is 'Private'.
     * 
     * @return the privateLinkResourceId value.
     */
    public String privateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * Set the privateLinkResourceId property: The Resource Id of the Private Link resource. Populating this optional
     * field indicates that this backend is 'Private'.
     * 
     * @param privateLinkResourceId the privateLinkResourceId value to set.
     * @return the Backend object itself.
     */
    public Backend withPrivateLinkResourceId(String privateLinkResourceId) {
        this.privateLinkResourceId = privateLinkResourceId;
        return this;
    }

    /**
     * Get the privateLinkLocation property: The location of the Private Link resource. Required only if
     * 'privateLinkResourceId' is populated.
     * 
     * @return the privateLinkLocation value.
     */
    public String privateLinkLocation() {
        return this.privateLinkLocation;
    }

    /**
     * Set the privateLinkLocation property: The location of the Private Link resource. Required only if
     * 'privateLinkResourceId' is populated.
     * 
     * @param privateLinkLocation the privateLinkLocation value to set.
     * @return the Backend object itself.
     */
    public Backend withPrivateLinkLocation(String privateLinkLocation) {
        this.privateLinkLocation = privateLinkLocation;
        return this;
    }

    /**
     * Get the privateEndpointStatus property: The Approval status for the connection to the Private Link.
     * 
     * @return the privateEndpointStatus value.
     */
    public PrivateEndpointStatus privateEndpointStatus() {
        return this.privateEndpointStatus;
    }

    /**
     * Get the privateLinkApprovalMessage property: A custom message to be included in the approval request to connect
     * to the Private Link.
     * 
     * @return the privateLinkApprovalMessage value.
     */
    public String privateLinkApprovalMessage() {
        return this.privateLinkApprovalMessage;
    }

    /**
     * Set the privateLinkApprovalMessage property: A custom message to be included in the approval request to connect
     * to the Private Link.
     * 
     * @param privateLinkApprovalMessage the privateLinkApprovalMessage value to set.
     * @return the Backend object itself.
     */
    public Backend withPrivateLinkApprovalMessage(String privateLinkApprovalMessage) {
        this.privateLinkApprovalMessage = privateLinkApprovalMessage;
        return this;
    }

    /**
     * Get the httpPort property: The HTTP TCP port number. Must be between 1 and 65535.
     * 
     * @return the httpPort value.
     */
    public Integer httpPort() {
        return this.httpPort;
    }

    /**
     * Set the httpPort property: The HTTP TCP port number. Must be between 1 and 65535.
     * 
     * @param httpPort the httpPort value to set.
     * @return the Backend object itself.
     */
    public Backend withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * Get the httpsPort property: The HTTPS TCP port number. Must be between 1 and 65535.
     * 
     * @return the httpsPort value.
     */
    public Integer httpsPort() {
        return this.httpsPort;
    }

    /**
     * Set the httpsPort property: The HTTPS TCP port number. Must be between 1 and 65535.
     * 
     * @param httpsPort the httpsPort value to set.
     * @return the Backend object itself.
     */
    public Backend withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    /**
     * Get the enabledState property: Whether to enable use of this backend. Permitted values are 'Enabled' or
     * 'Disabled'.
     * 
     * @return the enabledState value.
     */
    public BackendEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Whether to enable use of this backend. Permitted values are 'Enabled' or
     * 'Disabled'.
     * 
     * @param enabledState the enabledState value to set.
     * @return the Backend object itself.
     */
    public Backend withEnabledState(BackendEnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get the priority property: Priority to use for load balancing. Higher priorities will not be used for load
     * balancing if any lower priority backend is healthy.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority to use for load balancing. Higher priorities will not be used for load
     * balancing if any lower priority backend is healthy.
     * 
     * @param priority the priority value to set.
     * @return the Backend object itself.
     */
    public Backend withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the weight property: Weight of this endpoint for load balancing purposes.
     * 
     * @return the weight value.
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * Set the weight property: Weight of this endpoint for load balancing purposes.
     * 
     * @param weight the weight value to set.
     * @return the Backend object itself.
     */
    public Backend withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the backendHostHeader property: The value to use as the host header sent to the backend. If blank or
     * unspecified, this defaults to the incoming host.
     * 
     * @return the backendHostHeader value.
     */
    public String backendHostHeader() {
        return this.backendHostHeader;
    }

    /**
     * Set the backendHostHeader property: The value to use as the host header sent to the backend. If blank or
     * unspecified, this defaults to the incoming host.
     * 
     * @param backendHostHeader the backendHostHeader value to set.
     * @return the Backend object itself.
     */
    public Backend withBackendHostHeader(String backendHostHeader) {
        this.backendHostHeader = backendHostHeader;
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
