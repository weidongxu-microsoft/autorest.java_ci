// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Azure active directory domain service resource details. */
@Fluent
public final class AaddsResourceDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AaddsResourceDetails.class);

    /*
     * The Azure active directory domain service name.
     */
    @JsonProperty(value = "domainName")
    private String domainName;

    /*
     * This indicates whether initial sync complete or not.
     */
    @JsonProperty(value = "initialSyncComplete")
    private Boolean initialSyncComplete;

    /*
     * This indicates whether enable ldaps or not.
     */
    @JsonProperty(value = "ldapsEnabled")
    private Boolean ldapsEnabled;

    /*
     * The base 64 format string of public ldap certificate.
     */
    @JsonProperty(value = "ldapsPublicCertificateInBase64")
    private String ldapsPublicCertificateInBase64;

    /*
     * The resource id of azure active directory domain service.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The subnet resource id.
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /*
     * The tenant id of azure active directory domain service .
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * Get the domainName property: The Azure active directory domain service name.
     *
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Set the domainName property: The Azure active directory domain service name.
     *
     * @param domainName the domainName value to set.
     * @return the AaddsResourceDetails object itself.
     */
    public AaddsResourceDetails withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Get the initialSyncComplete property: This indicates whether initial sync complete or not.
     *
     * @return the initialSyncComplete value.
     */
    public Boolean initialSyncComplete() {
        return this.initialSyncComplete;
    }

    /**
     * Set the initialSyncComplete property: This indicates whether initial sync complete or not.
     *
     * @param initialSyncComplete the initialSyncComplete value to set.
     * @return the AaddsResourceDetails object itself.
     */
    public AaddsResourceDetails withInitialSyncComplete(Boolean initialSyncComplete) {
        this.initialSyncComplete = initialSyncComplete;
        return this;
    }

    /**
     * Get the ldapsEnabled property: This indicates whether enable ldaps or not.
     *
     * @return the ldapsEnabled value.
     */
    public Boolean ldapsEnabled() {
        return this.ldapsEnabled;
    }

    /**
     * Set the ldapsEnabled property: This indicates whether enable ldaps or not.
     *
     * @param ldapsEnabled the ldapsEnabled value to set.
     * @return the AaddsResourceDetails object itself.
     */
    public AaddsResourceDetails withLdapsEnabled(Boolean ldapsEnabled) {
        this.ldapsEnabled = ldapsEnabled;
        return this;
    }

    /**
     * Get the ldapsPublicCertificateInBase64 property: The base 64 format string of public ldap certificate.
     *
     * @return the ldapsPublicCertificateInBase64 value.
     */
    public String ldapsPublicCertificateInBase64() {
        return this.ldapsPublicCertificateInBase64;
    }

    /**
     * Set the ldapsPublicCertificateInBase64 property: The base 64 format string of public ldap certificate.
     *
     * @param ldapsPublicCertificateInBase64 the ldapsPublicCertificateInBase64 value to set.
     * @return the AaddsResourceDetails object itself.
     */
    public AaddsResourceDetails withLdapsPublicCertificateInBase64(String ldapsPublicCertificateInBase64) {
        this.ldapsPublicCertificateInBase64 = ldapsPublicCertificateInBase64;
        return this;
    }

    /**
     * Get the resourceId property: The resource id of azure active directory domain service.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource id of azure active directory domain service.
     *
     * @param resourceId the resourceId value to set.
     * @return the AaddsResourceDetails object itself.
     */
    public AaddsResourceDetails withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the subnetId property: The subnet resource id.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The subnet resource id.
     *
     * @param subnetId the subnetId value to set.
     * @return the AaddsResourceDetails object itself.
     */
    public AaddsResourceDetails withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the tenantId property: The tenant id of azure active directory domain service .
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant id of azure active directory domain service .
     *
     * @param tenantId the tenantId value to set.
     * @return the AaddsResourceDetails object itself.
     */
    public AaddsResourceDetails withTenantId(String tenantId) {
        this.tenantId = tenantId;
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
