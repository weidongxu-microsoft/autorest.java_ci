// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Identity for the resource. */
@Fluent
public class Identity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Identity.class);

    /*
     * The principal ID of resource identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant ID of resource.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The identity type.
     */
    @JsonProperty(value = "type", required = true)
    private IdentityType type;

    /*
     * Gets or sets a list of key value pairs that describe the set of User
     * Assigned identities that will be used with this storage account. The key
     * is the ARM resource identifier of the identity. Only 1 User Assigned
     * identity is permitted here.
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, UserAssignedIdentity> userAssignedIdentities;

    /**
     * Get the principalId property: The principal ID of resource identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant ID of resource.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The identity type.
     *
     * @return the type value.
     */
    public IdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The identity type.
     *
     * @param type the type value to set.
     * @return the Identity object itself.
     */
    public Identity withType(IdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: Gets or sets a list of key value pairs that describe the set of User
     * Assigned identities that will be used with this storage account. The key is the ARM resource identifier of the
     * identity. Only 1 User Assigned identity is permitted here.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: Gets or sets a list of key value pairs that describe the set of User
     * Assigned identities that will be used with this storage account. The key is the ARM resource identifier of the
     * identity. Only 1 User Assigned identity is permitted here.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the Identity object itself.
     */
    public Identity withUserAssignedIdentities(Map<String, UserAssignedIdentity> userAssignedIdentities) {
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
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property type in model Identity"));
        }
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
