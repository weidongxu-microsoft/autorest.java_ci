// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration settings of the Azure Active Directory allowed principals. */
@Fluent
public final class AllowedPrincipals {
    /*
     * The list of the allowed groups.
     */
    @JsonProperty(value = "groups")
    private List<String> groups;

    /*
     * The list of the allowed identities.
     */
    @JsonProperty(value = "identities")
    private List<String> identities;

    /** Creates an instance of AllowedPrincipals class. */
    public AllowedPrincipals() {
    }

    /**
     * Get the groups property: The list of the allowed groups.
     *
     * @return the groups value.
     */
    public List<String> groups() {
        return this.groups;
    }

    /**
     * Set the groups property: The list of the allowed groups.
     *
     * @param groups the groups value to set.
     * @return the AllowedPrincipals object itself.
     */
    public AllowedPrincipals withGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Get the identities property: The list of the allowed identities.
     *
     * @return the identities value.
     */
    public List<String> identities() {
        return this.identities;
    }

    /**
     * Set the identities property: The list of the allowed identities.
     *
     * @param identities the identities value to set.
     * @return the AllowedPrincipals object itself.
     */
    public AllowedPrincipals withIdentities(List<String> identities) {
        this.identities = identities;
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
