// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.storage.generated.models.BlobInventoryPolicySchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The storage account blob inventory policy.
 */
@Fluent
public final class BlobInventoryPolicyInner extends ProxyResource {
    /*
     * Returns the storage account blob inventory policy rules.
     */
    @JsonProperty(value = "properties")
    private BlobInventoryPolicyProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of BlobInventoryPolicyInner class.
     */
    public BlobInventoryPolicyInner() {
    }

    /**
     * Get the innerProperties property: Returns the storage account blob inventory policy rules.
     * 
     * @return the innerProperties value.
     */
    private BlobInventoryPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the lastModifiedTime property: Returns the last modified date and time of the blob inventory policy.
     * 
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTime();
    }

    /**
     * Get the policy property: The storage account blob inventory policy object. It is composed of policy rules.
     * 
     * @return the policy value.
     */
    public BlobInventoryPolicySchema policy() {
        return this.innerProperties() == null ? null : this.innerProperties().policy();
    }

    /**
     * Set the policy property: The storage account blob inventory policy object. It is composed of policy rules.
     * 
     * @param policy the policy value to set.
     * @return the BlobInventoryPolicyInner object itself.
     */
    public BlobInventoryPolicyInner withPolicy(BlobInventoryPolicySchema policy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BlobInventoryPolicyProperties();
        }
        this.innerProperties().withPolicy(policy);
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
