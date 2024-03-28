// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Properties of the HybridConnection.
 */
@Fluent
public final class HybridConnectionProperties {
    /*
     * The time the hybrid connection was created.
     */
    @JsonProperty(value = "createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The time the namespace was updated.
     */
    @JsonProperty(value = "updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * The number of listeners for this hybrid connection. Note that min : 1 and max:25 are supported.
     */
    @JsonProperty(value = "listenerCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer listenerCount;

    /*
     * Returns true if client authorization is needed for this hybrid connection; otherwise, false.
     */
    @JsonProperty(value = "requiresClientAuthorization")
    private Boolean requiresClientAuthorization;

    /*
     * The usermetadata is a placeholder to store user-defined string data for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their contact information. Also, user-defined configuration settings can be stored.
     */
    @JsonProperty(value = "userMetadata")
    private String userMetadata;

    /**
     * Creates an instance of HybridConnectionProperties class.
     */
    public HybridConnectionProperties() {
    }

    /**
     * Get the createdAt property: The time the hybrid connection was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the listenerCount property: The number of listeners for this hybrid connection. Note that min : 1 and max:25
     * are supported.
     * 
     * @return the listenerCount value.
     */
    public Integer listenerCount() {
        return this.listenerCount;
    }

    /**
     * Get the requiresClientAuthorization property: Returns true if client authorization is needed for this hybrid
     * connection; otherwise, false.
     * 
     * @return the requiresClientAuthorization value.
     */
    public Boolean requiresClientAuthorization() {
        return this.requiresClientAuthorization;
    }

    /**
     * Set the requiresClientAuthorization property: Returns true if client authorization is needed for this hybrid
     * connection; otherwise, false.
     * 
     * @param requiresClientAuthorization the requiresClientAuthorization value to set.
     * @return the HybridConnectionProperties object itself.
     */
    public HybridConnectionProperties withRequiresClientAuthorization(Boolean requiresClientAuthorization) {
        this.requiresClientAuthorization = requiresClientAuthorization;
        return this;
    }

    /**
     * Get the userMetadata property: The usermetadata is a placeholder to store user-defined string data for the hybrid
     * connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their
     * contact information. Also, user-defined configuration settings can be stored.
     * 
     * @return the userMetadata value.
     */
    public String userMetadata() {
        return this.userMetadata;
    }

    /**
     * Set the userMetadata property: The usermetadata is a placeholder to store user-defined string data for the hybrid
     * connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their
     * contact information. Also, user-defined configuration settings can be stored.
     * 
     * @param userMetadata the userMetadata value to set.
     * @return the HybridConnectionProperties object itself.
     */
    public HybridConnectionProperties withUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
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
