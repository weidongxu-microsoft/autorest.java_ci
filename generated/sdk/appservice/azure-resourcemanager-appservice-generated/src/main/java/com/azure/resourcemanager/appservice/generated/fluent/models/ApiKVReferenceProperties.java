// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ConfigReferenceSource;
import com.azure.resourcemanager.appservice.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.appservice.generated.models.ResolveStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ApiKVReference resource specific properties. */
@Fluent
public final class ApiKVReferenceProperties {
    /*
     * The reference property.
     */
    @JsonProperty(value = "reference")
    private String reference;

    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private ResolveStatus status;

    /*
     * The vaultName property.
     */
    @JsonProperty(value = "vaultName")
    private String vaultName;

    /*
     * The secretName property.
     */
    @JsonProperty(value = "secretName")
    private String secretName;

    /*
     * The secretVersion property.
     */
    @JsonProperty(value = "secretVersion")
    private String secretVersion;

    /*
     * Managed service identity.
     */
    @JsonProperty(value = "identityType")
    private ManagedServiceIdentity identityType;

    /*
     * The details property.
     */
    @JsonProperty(value = "details")
    private String details;

    /*
     * The source property.
     */
    @JsonProperty(value = "source")
    private ConfigReferenceSource source;

    /*
     * The activeVersion property.
     */
    @JsonProperty(value = "activeVersion")
    private String activeVersion;

    /** Creates an instance of ApiKVReferenceProperties class. */
    public ApiKVReferenceProperties() {
    }

    /**
     * Get the reference property: The reference property.
     *
     * @return the reference value.
     */
    public String reference() {
        return this.reference;
    }

    /**
     * Set the reference property: The reference property.
     *
     * @param reference the reference value to set.
     * @return the ApiKVReferenceProperties object itself.
     */
    public ApiKVReferenceProperties withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public ResolveStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the ApiKVReferenceProperties object itself.
     */
    public ApiKVReferenceProperties withStatus(ResolveStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the vaultName property: The vaultName property.
     *
     * @return the vaultName value.
     */
    public String vaultName() {
        return this.vaultName;
    }

    /**
     * Set the vaultName property: The vaultName property.
     *
     * @param vaultName the vaultName value to set.
     * @return the ApiKVReferenceProperties object itself.
     */
    public ApiKVReferenceProperties withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Get the secretName property: The secretName property.
     *
     * @return the secretName value.
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the secretName property: The secretName property.
     *
     * @param secretName the secretName value to set.
     * @return the ApiKVReferenceProperties object itself.
     */
    public ApiKVReferenceProperties withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the secretVersion property: The secretVersion property.
     *
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion property: The secretVersion property.
     *
     * @param secretVersion the secretVersion value to set.
     * @return the ApiKVReferenceProperties object itself.
     */
    public ApiKVReferenceProperties withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Get the identityType property: Managed service identity.
     *
     * @return the identityType value.
     */
    public ManagedServiceIdentity identityType() {
        return this.identityType;
    }

    /**
     * Set the identityType property: Managed service identity.
     *
     * @param identityType the identityType value to set.
     * @return the ApiKVReferenceProperties object itself.
     */
    public ApiKVReferenceProperties withIdentityType(ManagedServiceIdentity identityType) {
        this.identityType = identityType;
        return this;
    }

    /**
     * Get the details property: The details property.
     *
     * @return the details value.
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details property: The details property.
     *
     * @param details the details value to set.
     * @return the ApiKVReferenceProperties object itself.
     */
    public ApiKVReferenceProperties withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * Get the source property: The source property.
     *
     * @return the source value.
     */
    public ConfigReferenceSource source() {
        return this.source;
    }

    /**
     * Set the source property: The source property.
     *
     * @param source the source value to set.
     * @return the ApiKVReferenceProperties object itself.
     */
    public ApiKVReferenceProperties withSource(ConfigReferenceSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the activeVersion property: The activeVersion property.
     *
     * @return the activeVersion value.
     */
    public String activeVersion() {
        return this.activeVersion;
    }

    /**
     * Set the activeVersion property: The activeVersion property.
     *
     * @param activeVersion the activeVersion value to set.
     * @return the ApiKVReferenceProperties object itself.
     */
    public ApiKVReferenceProperties withActiveVersion(String activeVersion) {
        this.activeVersion = activeVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identityType() != null) {
            identityType().validate();
        }
    }
}
