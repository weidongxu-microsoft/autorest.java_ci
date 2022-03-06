// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the compute profile. */
@Fluent
public final class ComputeProfile {
    /*
     * The list of roles in the cluster.
     */
    @JsonProperty(value = "roles")
    private List<Role> roles;

    /**
     * Get the roles property: The list of roles in the cluster.
     *
     * @return the roles value.
     */
    public List<Role> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The list of roles in the cluster.
     *
     * @param roles the roles value to set.
     * @return the ComputeProfile object itself.
     */
    public ComputeProfile withRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roles() != null) {
            roles().forEach(e -> e.validate());
        }
    }
}
