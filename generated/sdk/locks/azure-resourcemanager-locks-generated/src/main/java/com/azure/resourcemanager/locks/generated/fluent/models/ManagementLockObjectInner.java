// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.locks.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.locks.generated.models.LockLevel;
import com.azure.resourcemanager.locks.generated.models.ManagementLockOwner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The lock information.
 */
@Fluent
public final class ManagementLockObjectInner extends ProxyResource {
    /*
     * The properties of the lock.
     */
    @JsonProperty(value = "properties", required = true)
    private ManagementLockProperties innerProperties = new ManagementLockProperties();

    /**
     * Creates an instance of ManagementLockObjectInner class.
     */
    public ManagementLockObjectInner() {
    }

    /**
     * Get the innerProperties property: The properties of the lock.
     * 
     * @return the innerProperties value.
     */
    private ManagementLockProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the level property: The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly.
     * CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means
     * authorized users can only read from a resource, but they can't modify or delete it.
     * 
     * @return the level value.
     */
    public LockLevel level() {
        return this.innerProperties() == null ? null : this.innerProperties().level();
    }

    /**
     * Set the level property: The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly.
     * CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means
     * authorized users can only read from a resource, but they can't modify or delete it.
     * 
     * @param level the level value to set.
     * @return the ManagementLockObjectInner object itself.
     */
    public ManagementLockObjectInner withLevel(LockLevel level) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagementLockProperties();
        }
        this.innerProperties().withLevel(level);
        return this;
    }

    /**
     * Get the notes property: Notes about the lock. Maximum of 512 characters.
     * 
     * @return the notes value.
     */
    public String notes() {
        return this.innerProperties() == null ? null : this.innerProperties().notes();
    }

    /**
     * Set the notes property: Notes about the lock. Maximum of 512 characters.
     * 
     * @param notes the notes value to set.
     * @return the ManagementLockObjectInner object itself.
     */
    public ManagementLockObjectInner withNotes(String notes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagementLockProperties();
        }
        this.innerProperties().withNotes(notes);
        return this;
    }

    /**
     * Get the owners property: The owners of the lock.
     * 
     * @return the owners value.
     */
    public List<ManagementLockOwner> owners() {
        return this.innerProperties() == null ? null : this.innerProperties().owners();
    }

    /**
     * Set the owners property: The owners of the lock.
     * 
     * @param owners the owners value to set.
     * @return the ManagementLockObjectInner object itself.
     */
    public ManagementLockObjectInner withOwners(List<ManagementLockOwner> owners) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagementLockProperties();
        }
        this.innerProperties().withOwners(owners);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model ManagementLockObjectInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagementLockObjectInner.class);
}
