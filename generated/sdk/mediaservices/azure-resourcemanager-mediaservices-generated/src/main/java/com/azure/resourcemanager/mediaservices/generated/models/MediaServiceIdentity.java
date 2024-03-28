// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.UUID;

/**
 * The MediaServiceIdentity model.
 */
@Fluent
public final class MediaServiceIdentity {
    /*
     * The identity type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * The Principal ID of the identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /*
     * The Tenant ID of the identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /*
     * The user assigned managed identities.
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, UserAssignedManagedIdentity> userAssignedIdentities;

    /**
     * Creates an instance of MediaServiceIdentity class.
     */
    public MediaServiceIdentity() {
    }

    /**
     * Get the type property: The identity type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The identity type.
     * 
     * @param type the type value to set.
     * @return the MediaServiceIdentity object itself.
     */
    public MediaServiceIdentity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId property: The Principal ID of the identity.
     * 
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The Tenant ID of the identity.
     * 
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Get the userAssignedIdentities property: The user assigned managed identities.
     * 
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedManagedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The user assigned managed identities.
     * 
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the MediaServiceIdentity object itself.
     */
    public MediaServiceIdentity
        withUserAssignedIdentities(Map<String, UserAssignedManagedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property type in model MediaServiceIdentity"));
        }
        if (userAssignedIdentities() != null) {
            userAssignedIdentities().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MediaServiceIdentity.class);
}
