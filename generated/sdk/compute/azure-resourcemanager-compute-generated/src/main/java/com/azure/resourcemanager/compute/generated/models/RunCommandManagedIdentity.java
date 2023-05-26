// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains clientId or objectId (use only one, not both) of a user-assigned managed identity that has access to storage
 * blob used in Run Command. Use an empty RunCommandManagedIdentity object in case of system-assigned identity. Make
 * sure the Azure storage blob exists in case of scriptUri, and managed identity has been given access to blob's
 * container with 'Storage Blob Data Reader' role assignment with scriptUri blob and 'Storage Blob Data Contributor' for
 * Append blobs(outputBlobUri, errorBlobUri). In case of user assigned identity, make sure you add it under VM's
 * identity. For more info on managed identity and Run Command, refer https://aka.ms/ManagedIdentity and
 * https://aka.ms/RunCommandManaged.
 */
@Fluent
public final class RunCommandManagedIdentity {
    /*
     * Client Id (GUID value) of the user-assigned managed identity. ObjectId should not be used if this is provided.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * Object Id (GUID value) of the user-assigned managed identity. ClientId should not be used if this is provided.
     */
    @JsonProperty(value = "objectId")
    private String objectId;

    /** Creates an instance of RunCommandManagedIdentity class. */
    public RunCommandManagedIdentity() {
    }

    /**
     * Get the clientId property: Client Id (GUID value) of the user-assigned managed identity. ObjectId should not be
     * used if this is provided.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Client Id (GUID value) of the user-assigned managed identity. ObjectId should not be
     * used if this is provided.
     *
     * @param clientId the clientId value to set.
     * @return the RunCommandManagedIdentity object itself.
     */
    public RunCommandManagedIdentity withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the objectId property: Object Id (GUID value) of the user-assigned managed identity. ClientId should not be
     * used if this is provided.
     *
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: Object Id (GUID value) of the user-assigned managed identity. ClientId should not be
     * used if this is provided.
     *
     * @param objectId the objectId value to set.
     * @return the RunCommandManagedIdentity object itself.
     */
    public RunCommandManagedIdentity withObjectId(String objectId) {
        this.objectId = objectId;
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