// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storage.generated.models.ChangeFeed;
import com.azure.resourcemanager.storage.generated.models.CorsRules;
import com.azure.resourcemanager.storage.generated.models.DeleteRetentionPolicy;
import com.azure.resourcemanager.storage.generated.models.LastAccessTimeTrackingPolicy;
import com.azure.resourcemanager.storage.generated.models.RestorePolicyProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a storage account’s Blob service.
 */
@Fluent
public final class BlobServicePropertiesProperties {
    /*
     * Specifies CORS rules for the Blob service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Blob service.
     */
    @JsonProperty(value = "cors")
    private CorsRules cors;

    /*
     * DefaultServiceVersion indicates the default version to use for requests to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27 and all more recent versions.
     */
    @JsonProperty(value = "defaultServiceVersion")
    private String defaultServiceVersion;

    /*
     * The blob service properties for blob soft delete.
     */
    @JsonProperty(value = "deleteRetentionPolicy")
    private DeleteRetentionPolicy deleteRetentionPolicy;

    /*
     * Versioning is enabled if set to true.
     */
    @JsonProperty(value = "isVersioningEnabled")
    private Boolean isVersioningEnabled;

    /*
     * Deprecated in favor of isVersioningEnabled property.
     */
    @JsonProperty(value = "automaticSnapshotPolicyEnabled")
    private Boolean automaticSnapshotPolicyEnabled;

    /*
     * The blob service properties for change feed events.
     */
    @JsonProperty(value = "changeFeed")
    private ChangeFeed changeFeed;

    /*
     * The blob service properties for blob restore policy.
     */
    @JsonProperty(value = "restorePolicy")
    private RestorePolicyProperties restorePolicy;

    /*
     * The blob service properties for container soft delete.
     */
    @JsonProperty(value = "containerDeleteRetentionPolicy")
    private DeleteRetentionPolicy containerDeleteRetentionPolicy;

    /*
     * The blob service property to configure last access time based tracking policy.
     */
    @JsonProperty(value = "lastAccessTimeTrackingPolicy")
    private LastAccessTimeTrackingPolicy lastAccessTimeTrackingPolicy;

    /**
     * Creates an instance of BlobServicePropertiesProperties class.
     */
    public BlobServicePropertiesProperties() {
    }

    /**
     * Get the cors property: Specifies CORS rules for the Blob service. You can include up to five CorsRule elements in
     * the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS
     * will be disabled for the Blob service.
     * 
     * @return the cors value.
     */
    public CorsRules cors() {
        return this.cors;
    }

    /**
     * Set the cors property: Specifies CORS rules for the Blob service. You can include up to five CorsRule elements in
     * the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS
     * will be disabled for the Blob service.
     * 
     * @param cors the cors value to set.
     * @return the BlobServicePropertiesProperties object itself.
     */
    public BlobServicePropertiesProperties withCors(CorsRules cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the defaultServiceVersion property: DefaultServiceVersion indicates the default version to use for requests
     * to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27
     * and all more recent versions.
     * 
     * @return the defaultServiceVersion value.
     */
    public String defaultServiceVersion() {
        return this.defaultServiceVersion;
    }

    /**
     * Set the defaultServiceVersion property: DefaultServiceVersion indicates the default version to use for requests
     * to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27
     * and all more recent versions.
     * 
     * @param defaultServiceVersion the defaultServiceVersion value to set.
     * @return the BlobServicePropertiesProperties object itself.
     */
    public BlobServicePropertiesProperties withDefaultServiceVersion(String defaultServiceVersion) {
        this.defaultServiceVersion = defaultServiceVersion;
        return this;
    }

    /**
     * Get the deleteRetentionPolicy property: The blob service properties for blob soft delete.
     * 
     * @return the deleteRetentionPolicy value.
     */
    public DeleteRetentionPolicy deleteRetentionPolicy() {
        return this.deleteRetentionPolicy;
    }

    /**
     * Set the deleteRetentionPolicy property: The blob service properties for blob soft delete.
     * 
     * @param deleteRetentionPolicy the deleteRetentionPolicy value to set.
     * @return the BlobServicePropertiesProperties object itself.
     */
    public BlobServicePropertiesProperties withDeleteRetentionPolicy(DeleteRetentionPolicy deleteRetentionPolicy) {
        this.deleteRetentionPolicy = deleteRetentionPolicy;
        return this;
    }

    /**
     * Get the isVersioningEnabled property: Versioning is enabled if set to true.
     * 
     * @return the isVersioningEnabled value.
     */
    public Boolean isVersioningEnabled() {
        return this.isVersioningEnabled;
    }

    /**
     * Set the isVersioningEnabled property: Versioning is enabled if set to true.
     * 
     * @param isVersioningEnabled the isVersioningEnabled value to set.
     * @return the BlobServicePropertiesProperties object itself.
     */
    public BlobServicePropertiesProperties withIsVersioningEnabled(Boolean isVersioningEnabled) {
        this.isVersioningEnabled = isVersioningEnabled;
        return this;
    }

    /**
     * Get the automaticSnapshotPolicyEnabled property: Deprecated in favor of isVersioningEnabled property.
     * 
     * @return the automaticSnapshotPolicyEnabled value.
     */
    public Boolean automaticSnapshotPolicyEnabled() {
        return this.automaticSnapshotPolicyEnabled;
    }

    /**
     * Set the automaticSnapshotPolicyEnabled property: Deprecated in favor of isVersioningEnabled property.
     * 
     * @param automaticSnapshotPolicyEnabled the automaticSnapshotPolicyEnabled value to set.
     * @return the BlobServicePropertiesProperties object itself.
     */
    public BlobServicePropertiesProperties withAutomaticSnapshotPolicyEnabled(Boolean automaticSnapshotPolicyEnabled) {
        this.automaticSnapshotPolicyEnabled = automaticSnapshotPolicyEnabled;
        return this;
    }

    /**
     * Get the changeFeed property: The blob service properties for change feed events.
     * 
     * @return the changeFeed value.
     */
    public ChangeFeed changeFeed() {
        return this.changeFeed;
    }

    /**
     * Set the changeFeed property: The blob service properties for change feed events.
     * 
     * @param changeFeed the changeFeed value to set.
     * @return the BlobServicePropertiesProperties object itself.
     */
    public BlobServicePropertiesProperties withChangeFeed(ChangeFeed changeFeed) {
        this.changeFeed = changeFeed;
        return this;
    }

    /**
     * Get the restorePolicy property: The blob service properties for blob restore policy.
     * 
     * @return the restorePolicy value.
     */
    public RestorePolicyProperties restorePolicy() {
        return this.restorePolicy;
    }

    /**
     * Set the restorePolicy property: The blob service properties for blob restore policy.
     * 
     * @param restorePolicy the restorePolicy value to set.
     * @return the BlobServicePropertiesProperties object itself.
     */
    public BlobServicePropertiesProperties withRestorePolicy(RestorePolicyProperties restorePolicy) {
        this.restorePolicy = restorePolicy;
        return this;
    }

    /**
     * Get the containerDeleteRetentionPolicy property: The blob service properties for container soft delete.
     * 
     * @return the containerDeleteRetentionPolicy value.
     */
    public DeleteRetentionPolicy containerDeleteRetentionPolicy() {
        return this.containerDeleteRetentionPolicy;
    }

    /**
     * Set the containerDeleteRetentionPolicy property: The blob service properties for container soft delete.
     * 
     * @param containerDeleteRetentionPolicy the containerDeleteRetentionPolicy value to set.
     * @return the BlobServicePropertiesProperties object itself.
     */
    public BlobServicePropertiesProperties
        withContainerDeleteRetentionPolicy(DeleteRetentionPolicy containerDeleteRetentionPolicy) {
        this.containerDeleteRetentionPolicy = containerDeleteRetentionPolicy;
        return this;
    }

    /**
     * Get the lastAccessTimeTrackingPolicy property: The blob service property to configure last access time based
     * tracking policy.
     * 
     * @return the lastAccessTimeTrackingPolicy value.
     */
    public LastAccessTimeTrackingPolicy lastAccessTimeTrackingPolicy() {
        return this.lastAccessTimeTrackingPolicy;
    }

    /**
     * Set the lastAccessTimeTrackingPolicy property: The blob service property to configure last access time based
     * tracking policy.
     * 
     * @param lastAccessTimeTrackingPolicy the lastAccessTimeTrackingPolicy value to set.
     * @return the BlobServicePropertiesProperties object itself.
     */
    public BlobServicePropertiesProperties
        withLastAccessTimeTrackingPolicy(LastAccessTimeTrackingPolicy lastAccessTimeTrackingPolicy) {
        this.lastAccessTimeTrackingPolicy = lastAccessTimeTrackingPolicy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cors() != null) {
            cors().validate();
        }
        if (deleteRetentionPolicy() != null) {
            deleteRetentionPolicy().validate();
        }
        if (changeFeed() != null) {
            changeFeed().validate();
        }
        if (restorePolicy() != null) {
            restorePolicy().validate();
        }
        if (containerDeleteRetentionPolicy() != null) {
            containerDeleteRetentionPolicy().validate();
        }
        if (lastAccessTimeTrackingPolicy() != null) {
            lastAccessTimeTrackingPolicy().validate();
        }
    }
}
