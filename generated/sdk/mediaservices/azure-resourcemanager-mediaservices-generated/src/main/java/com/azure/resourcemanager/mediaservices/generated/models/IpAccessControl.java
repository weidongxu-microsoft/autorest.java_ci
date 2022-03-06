// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The IP access control. */
@Fluent
public final class IpAccessControl {
    /*
     * The IP allow list.
     */
    @JsonProperty(value = "allow")
    private List<IpRange> allow;

    /**
     * Get the allow property: The IP allow list.
     *
     * @return the allow value.
     */
    public List<IpRange> allow() {
        return this.allow;
    }

    /**
     * Set the allow property: The IP allow list.
     *
     * @param allow the allow value to set.
     * @return the IpAccessControl object itself.
     */
    public IpAccessControl withAllow(List<IpRange> allow) {
        this.allow = allow;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (allow() != null) {
            allow().forEach(e -> e.validate());
        }
    }
}
