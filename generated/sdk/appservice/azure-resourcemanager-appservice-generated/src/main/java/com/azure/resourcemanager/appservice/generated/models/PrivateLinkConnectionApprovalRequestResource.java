// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.models.PrivateLinkConnectionApprovalRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Private Endpoint Connection Approval ARM resource. */
@Fluent
public final class PrivateLinkConnectionApprovalRequestResource extends ProxyOnlyResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(PrivateLinkConnectionApprovalRequestResource.class);

    /*
     * Core resource properties
     */
    @JsonProperty(value = "properties")
    private PrivateLinkConnectionApprovalRequest innerProperties;

    /**
     * Get the innerProperties property: Core resource properties.
     *
     * @return the innerProperties value.
     */
    private PrivateLinkConnectionApprovalRequest innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateLinkConnectionApprovalRequestResource withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkConnectionState privateLinkServiceConnectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceConnectionState();
    }

    /**
     * Set the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateLinkConnectionApprovalRequestResource object itself.
     */
    public PrivateLinkConnectionApprovalRequestResource withPrivateLinkServiceConnectionState(
        PrivateLinkConnectionState privateLinkServiceConnectionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkConnectionApprovalRequest();
        }
        this.innerProperties().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
