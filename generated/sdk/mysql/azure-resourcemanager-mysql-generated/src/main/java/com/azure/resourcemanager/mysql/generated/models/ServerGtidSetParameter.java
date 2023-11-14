// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Server Gtid set parameters.
 */
@Fluent
public final class ServerGtidSetParameter {
    /*
     * The Gtid set of server.
     */
    @JsonProperty(value = "gtidSet")
    private String gtidSet;

    /**
     * Creates an instance of ServerGtidSetParameter class.
     */
    public ServerGtidSetParameter() {
    }

    /**
     * Get the gtidSet property: The Gtid set of server.
     * 
     * @return the gtidSet value.
     */
    public String gtidSet() {
        return this.gtidSet;
    }

    /**
     * Set the gtidSet property: The Gtid set of server.
     * 
     * @param gtidSet the gtidSet value to set.
     * @return the ServerGtidSetParameter object itself.
     */
    public ServerGtidSetParameter withGtidSet(String gtidSet) {
        this.gtidSet = gtidSet;
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
