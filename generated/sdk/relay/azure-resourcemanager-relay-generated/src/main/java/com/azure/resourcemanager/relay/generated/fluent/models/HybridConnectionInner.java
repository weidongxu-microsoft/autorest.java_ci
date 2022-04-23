// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Description of hybrid connection resource. */
@Fluent
public final class HybridConnectionInner extends ProxyResource {
    /*
     * Properties of the HybridConnection.
     */
    @JsonProperty(value = "properties")
    private HybridConnectionProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Get the innerProperties property: Properties of the HybridConnection.
     *
     * @return the innerProperties value.
     */
    private HybridConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the createdAt property: The time the hybrid connection was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAt();
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAt();
    }

    /**
     * Get the listenerCount property: The number of listeners for this hybrid connection. Note that min : 1 and max:25
     * are supported.
     *
     * @return the listenerCount value.
     */
    public Integer listenerCount() {
        return this.innerProperties() == null ? null : this.innerProperties().listenerCount();
    }

    /**
     * Get the requiresClientAuthorization property: Returns true if client authorization is needed for this hybrid
     * connection; otherwise, false.
     *
     * @return the requiresClientAuthorization value.
     */
    public Boolean requiresClientAuthorization() {
        return this.innerProperties() == null ? null : this.innerProperties().requiresClientAuthorization();
    }

    /**
     * Set the requiresClientAuthorization property: Returns true if client authorization is needed for this hybrid
     * connection; otherwise, false.
     *
     * @param requiresClientAuthorization the requiresClientAuthorization value to set.
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withRequiresClientAuthorization(Boolean requiresClientAuthorization) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionProperties();
        }
        this.innerProperties().withRequiresClientAuthorization(requiresClientAuthorization);
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
        return this.innerProperties() == null ? null : this.innerProperties().userMetadata();
    }

    /**
     * Set the userMetadata property: The usermetadata is a placeholder to store user-defined string data for the hybrid
     * connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their
     * contact information. Also, user-defined configuration settings can be stored.
     *
     * @param userMetadata the userMetadata value to set.
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withUserMetadata(String userMetadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionProperties();
        }
        this.innerProperties().withUserMetadata(userMetadata);
        return this;
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
