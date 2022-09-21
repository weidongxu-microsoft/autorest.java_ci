// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.storage.generated.models.CorsRules;
import com.azure.resourcemanager.storage.generated.models.DeleteRetentionPolicy;
import com.azure.resourcemanager.storage.generated.models.ProtocolSettings;
import com.azure.resourcemanager.storage.generated.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of File services in storage account. */
@Fluent
public final class FileServicePropertiesInner extends ProxyResource {
    /*
     * The properties of File services in storage account.
     */
    @JsonProperty(value = "properties")
    private FileServicePropertiesProperties innerFileServiceProperties;

    /*
     * Sku name and tier.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /** Creates an instance of FileServicePropertiesInner class. */
    public FileServicePropertiesInner() {
    }

    /**
     * Get the innerFileServiceProperties property: The properties of File services in storage account.
     *
     * @return the innerFileServiceProperties value.
     */
    private FileServicePropertiesProperties innerFileServiceProperties() {
        return this.innerFileServiceProperties;
    }

    /**
     * Get the sku property: Sku name and tier.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Get the cors property: Specifies CORS rules for the File service. You can include up to five CorsRule elements in
     * the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS
     * will be disabled for the File service.
     *
     * @return the cors value.
     */
    public CorsRules cors() {
        return this.innerFileServiceProperties() == null ? null : this.innerFileServiceProperties().cors();
    }

    /**
     * Set the cors property: Specifies CORS rules for the File service. You can include up to five CorsRule elements in
     * the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS
     * will be disabled for the File service.
     *
     * @param cors the cors value to set.
     * @return the FileServicePropertiesInner object itself.
     */
    public FileServicePropertiesInner withCors(CorsRules cors) {
        if (this.innerFileServiceProperties() == null) {
            this.innerFileServiceProperties = new FileServicePropertiesProperties();
        }
        this.innerFileServiceProperties().withCors(cors);
        return this;
    }

    /**
     * Get the shareDeleteRetentionPolicy property: The file service properties for share soft delete.
     *
     * @return the shareDeleteRetentionPolicy value.
     */
    public DeleteRetentionPolicy shareDeleteRetentionPolicy() {
        return this.innerFileServiceProperties() == null
            ? null
            : this.innerFileServiceProperties().shareDeleteRetentionPolicy();
    }

    /**
     * Set the shareDeleteRetentionPolicy property: The file service properties for share soft delete.
     *
     * @param shareDeleteRetentionPolicy the shareDeleteRetentionPolicy value to set.
     * @return the FileServicePropertiesInner object itself.
     */
    public FileServicePropertiesInner withShareDeleteRetentionPolicy(DeleteRetentionPolicy shareDeleteRetentionPolicy) {
        if (this.innerFileServiceProperties() == null) {
            this.innerFileServiceProperties = new FileServicePropertiesProperties();
        }
        this.innerFileServiceProperties().withShareDeleteRetentionPolicy(shareDeleteRetentionPolicy);
        return this;
    }

    /**
     * Get the protocolSettings property: Protocol settings for file service.
     *
     * @return the protocolSettings value.
     */
    public ProtocolSettings protocolSettings() {
        return this.innerFileServiceProperties() == null ? null : this.innerFileServiceProperties().protocolSettings();
    }

    /**
     * Set the protocolSettings property: Protocol settings for file service.
     *
     * @param protocolSettings the protocolSettings value to set.
     * @return the FileServicePropertiesInner object itself.
     */
    public FileServicePropertiesInner withProtocolSettings(ProtocolSettings protocolSettings) {
        if (this.innerFileServiceProperties() == null) {
            this.innerFileServiceProperties = new FileServicePropertiesProperties();
        }
        this.innerFileServiceProperties().withProtocolSettings(protocolSettings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerFileServiceProperties() != null) {
            innerFileServiceProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
