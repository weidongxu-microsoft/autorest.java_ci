// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.storage.generated.models.AccessTier;
import com.azure.resourcemanager.storage.generated.models.AccountStatus;
import com.azure.resourcemanager.storage.generated.models.AllowedCopyScope;
import com.azure.resourcemanager.storage.generated.models.AzureFilesIdentityBasedAuthentication;
import com.azure.resourcemanager.storage.generated.models.CustomDomain;
import com.azure.resourcemanager.storage.generated.models.Encryption;
import com.azure.resourcemanager.storage.generated.models.Endpoints;
import com.azure.resourcemanager.storage.generated.models.ExtendedLocation;
import com.azure.resourcemanager.storage.generated.models.GeoReplicationStats;
import com.azure.resourcemanager.storage.generated.models.Identity;
import com.azure.resourcemanager.storage.generated.models.ImmutableStorageAccount;
import com.azure.resourcemanager.storage.generated.models.KeyCreationTime;
import com.azure.resourcemanager.storage.generated.models.KeyPolicy;
import com.azure.resourcemanager.storage.generated.models.Kind;
import com.azure.resourcemanager.storage.generated.models.LargeFileSharesState;
import com.azure.resourcemanager.storage.generated.models.MinimumTlsVersion;
import com.azure.resourcemanager.storage.generated.models.NetworkRuleSet;
import com.azure.resourcemanager.storage.generated.models.ProvisioningState;
import com.azure.resourcemanager.storage.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.storage.generated.models.RoutingPreference;
import com.azure.resourcemanager.storage.generated.models.SasPolicy;
import com.azure.resourcemanager.storage.generated.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** The storage account. */
@Fluent
public final class StorageAccountInner extends Resource {
    /*
     * Gets the SKU.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /*
     * Gets the Kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private Kind kind;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The extendedLocation of the resource.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Properties of the storage account.
     */
    @JsonProperty(value = "properties")
    private StorageAccountPropertiesInner innerProperties;

    /**
     * Get the sku property: Gets the SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Get the kind property: Gets the Kind.
     *
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the extendedLocation property: The extendedLocation of the resource.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extendedLocation of the resource.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the storage account.
     *
     * @return the innerProperties value.
     */
    private StorageAccountPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public StorageAccountInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StorageAccountInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Gets the status of the storage account at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the primaryEndpoints property: Gets the URLs that are used to perform a retrieval of a public blob, queue, or
     * table object. Note that Standard_ZRS and Premium_LRS accounts only return the blob endpoint.
     *
     * @return the primaryEndpoints value.
     */
    public Endpoints primaryEndpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().primaryEndpoints();
    }

    /**
     * Get the primaryLocation property: Gets the location of the primary data center for the storage account.
     *
     * @return the primaryLocation value.
     */
    public String primaryLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().primaryLocation();
    }

    /**
     * Get the statusOfPrimary property: Gets the status indicating whether the primary location of the storage account
     * is available or unavailable.
     *
     * @return the statusOfPrimary value.
     */
    public AccountStatus statusOfPrimary() {
        return this.innerProperties() == null ? null : this.innerProperties().statusOfPrimary();
    }

    /**
     * Get the lastGeoFailoverTime property: Gets the timestamp of the most recent instance of a failover to the
     * secondary location. Only the most recent timestamp is retained. This element is not returned if there has never
     * been a failover instance. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     *
     * @return the lastGeoFailoverTime value.
     */
    public OffsetDateTime lastGeoFailoverTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastGeoFailoverTime();
    }

    /**
     * Get the secondaryLocation property: Gets the location of the geo-replicated secondary for the storage account.
     * Only available if the accountType is Standard_GRS or Standard_RAGRS.
     *
     * @return the secondaryLocation value.
     */
    public String secondaryLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().secondaryLocation();
    }

    /**
     * Get the statusOfSecondary property: Gets the status indicating whether the secondary location of the storage
     * account is available or unavailable. Only available if the SKU name is Standard_GRS or Standard_RAGRS.
     *
     * @return the statusOfSecondary value.
     */
    public AccountStatus statusOfSecondary() {
        return this.innerProperties() == null ? null : this.innerProperties().statusOfSecondary();
    }

    /**
     * Get the creationTime property: Gets the creation date and time of the storage account in UTC.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Get the customDomain property: Gets the custom domain the user assigned to this storage account.
     *
     * @return the customDomain value.
     */
    public CustomDomain customDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().customDomain();
    }

    /**
     * Get the sasPolicy property: SasPolicy assigned to the storage account.
     *
     * @return the sasPolicy value.
     */
    public SasPolicy sasPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().sasPolicy();
    }

    /**
     * Get the keyPolicy property: KeyPolicy assigned to the storage account.
     *
     * @return the keyPolicy value.
     */
    public KeyPolicy keyPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().keyPolicy();
    }

    /**
     * Get the keyCreationTime property: Storage account keys creation time.
     *
     * @return the keyCreationTime value.
     */
    public KeyCreationTime keyCreationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().keyCreationTime();
    }

    /**
     * Get the secondaryEndpoints property: Gets the URLs that are used to perform a retrieval of a public blob, queue,
     * or table object from the secondary location of the storage account. Only available if the SKU name is
     * Standard_RAGRS.
     *
     * @return the secondaryEndpoints value.
     */
    public Endpoints secondaryEndpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().secondaryEndpoints();
    }

    /**
     * Get the encryption property: Encryption settings to be used for server-side encryption for the storage account.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Get the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier used for
     * billing.
     *
     * @return the accessTier value.
     */
    public AccessTier accessTier() {
        return this.innerProperties() == null ? null : this.innerProperties().accessTier();
    }

    /**
     * Get the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @return the azureFilesIdentityBasedAuthentication value.
     */
    public AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication() {
        return this.innerProperties() == null ? null : this.innerProperties().azureFilesIdentityBasedAuthentication();
    }

    /**
     * Set the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @param azureFilesIdentityBasedAuthentication the azureFilesIdentityBasedAuthentication value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withAzureFilesIdentityBasedAuthentication(
        AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withAzureFilesIdentityBasedAuthentication(azureFilesIdentityBasedAuthentication);
        return this;
    }

    /**
     * Get the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true.
     *
     * @return the enableHttpsTrafficOnly value.
     */
    public Boolean enableHttpsTrafficOnly() {
        return this.innerProperties() == null ? null : this.innerProperties().enableHttpsTrafficOnly();
    }

    /**
     * Set the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true.
     *
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withEnableHttpsTrafficOnly(enableHttpsTrafficOnly);
        return this;
    }

    /**
     * Get the networkRuleSet property: Network rule set.
     *
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet networkRuleSet() {
        return this.innerProperties() == null ? null : this.innerProperties().networkRuleSet();
    }

    /**
     * Get the isSftpEnabled property: Enables Secure File Transfer Protocol, if set to true.
     *
     * @return the isSftpEnabled value.
     */
    public Boolean isSftpEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isSftpEnabled();
    }

    /**
     * Set the isSftpEnabled property: Enables Secure File Transfer Protocol, if set to true.
     *
     * @param isSftpEnabled the isSftpEnabled value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withIsSftpEnabled(Boolean isSftpEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withIsSftpEnabled(isSftpEnabled);
        return this;
    }

    /**
     * Get the isLocalUserEnabled property: Enables local users feature, if set to true.
     *
     * @return the isLocalUserEnabled value.
     */
    public Boolean isLocalUserEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isLocalUserEnabled();
    }

    /**
     * Set the isLocalUserEnabled property: Enables local users feature, if set to true.
     *
     * @param isLocalUserEnabled the isLocalUserEnabled value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withIsLocalUserEnabled(Boolean isLocalUserEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withIsLocalUserEnabled(isLocalUserEnabled);
        return this;
    }

    /**
     * Get the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     *
     * @return the isHnsEnabled value.
     */
    public Boolean isHnsEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isHnsEnabled();
    }

    /**
     * Set the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     *
     * @param isHnsEnabled the isHnsEnabled value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withIsHnsEnabled(Boolean isHnsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withIsHnsEnabled(isHnsEnabled);
        return this;
    }

    /**
     * Get the geoReplicationStats property: Geo Replication Stats.
     *
     * @return the geoReplicationStats value.
     */
    public GeoReplicationStats geoReplicationStats() {
        return this.innerProperties() == null ? null : this.innerProperties().geoReplicationStats();
    }

    /**
     * Get the failoverInProgress property: If the failover is in progress, the value will be true, otherwise, it will
     * be null.
     *
     * @return the failoverInProgress value.
     */
    public Boolean failoverInProgress() {
        return this.innerProperties() == null ? null : this.innerProperties().failoverInProgress();
    }

    /**
     * Get the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @return the largeFileSharesState value.
     */
    public LargeFileSharesState largeFileSharesState() {
        return this.innerProperties() == null ? null : this.innerProperties().largeFileSharesState();
    }

    /**
     * Set the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @param largeFileSharesState the largeFileSharesState value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withLargeFileSharesState(LargeFileSharesState largeFileSharesState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withLargeFileSharesState(largeFileSharesState);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connection associated with the specified
     * storage account.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Get the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @return the routingPreference value.
     */
    public RoutingPreference routingPreference() {
        return this.innerProperties() == null ? null : this.innerProperties().routingPreference();
    }

    /**
     * Set the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @param routingPreference the routingPreference value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withRoutingPreference(RoutingPreference routingPreference) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withRoutingPreference(routingPreference);
        return this;
    }

    /**
     * Get the blobRestoreStatus property: Blob restore status.
     *
     * @return the blobRestoreStatus value.
     */
    public BlobRestoreStatusInner blobRestoreStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().blobRestoreStatus();
    }

    /**
     * Get the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is true for this property.
     *
     * @return the allowBlobPublicAccess value.
     */
    public Boolean allowBlobPublicAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().allowBlobPublicAccess();
    }

    /**
     * Set the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is true for this property.
     *
     * @param allowBlobPublicAccess the allowBlobPublicAccess value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withAllowBlobPublicAccess(Boolean allowBlobPublicAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withAllowBlobPublicAccess(allowBlobPublicAccess);
        return this;
    }

    /**
     * Get the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @return the minimumTlsVersion value.
     */
    public MinimumTlsVersion minimumTlsVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumTlsVersion();
    }

    /**
     * Set the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withMinimumTlsVersion(minimumTlsVersion);
        return this;
    }

    /**
     * Get the allowSharedKeyAccess property: Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests, including shared access signatures, must
     * be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     *
     * @return the allowSharedKeyAccess value.
     */
    public Boolean allowSharedKeyAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().allowSharedKeyAccess();
    }

    /**
     * Set the allowSharedKeyAccess property: Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests, including shared access signatures, must
     * be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     *
     * @param allowSharedKeyAccess the allowSharedKeyAccess value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withAllowSharedKeyAccess(Boolean allowSharedKeyAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withAllowSharedKeyAccess(allowSharedKeyAccess);
        return this;
    }

    /**
     * Get the enableNfsV3 property: NFS 3.0 protocol support enabled if set to true.
     *
     * @return the enableNfsV3 value.
     */
    public Boolean enableNfsV3() {
        return this.innerProperties() == null ? null : this.innerProperties().enableNfsV3();
    }

    /**
     * Set the enableNfsV3 property: NFS 3.0 protocol support enabled if set to true.
     *
     * @param enableNfsV3 the enableNfsV3 value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withEnableNfsV3(Boolean enableNfsV3) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withEnableNfsV3(enableNfsV3);
        return this;
    }

    /**
     * Get the allowCrossTenantReplication property: Allow or disallow cross AAD tenant object replication. The default
     * interpretation is true for this property.
     *
     * @return the allowCrossTenantReplication value.
     */
    public Boolean allowCrossTenantReplication() {
        return this.innerProperties() == null ? null : this.innerProperties().allowCrossTenantReplication();
    }

    /**
     * Set the allowCrossTenantReplication property: Allow or disallow cross AAD tenant object replication. The default
     * interpretation is true for this property.
     *
     * @param allowCrossTenantReplication the allowCrossTenantReplication value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withAllowCrossTenantReplication(Boolean allowCrossTenantReplication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withAllowCrossTenantReplication(allowCrossTenantReplication);
        return this;
    }

    /**
     * Get the defaultToOAuthAuthentication property: A boolean flag which indicates whether the default authentication
     * is OAuth or not. The default interpretation is false for this property.
     *
     * @return the defaultToOAuthAuthentication value.
     */
    public Boolean defaultToOAuthAuthentication() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultToOAuthAuthentication();
    }

    /**
     * Set the defaultToOAuthAuthentication property: A boolean flag which indicates whether the default authentication
     * is OAuth or not. The default interpretation is false for this property.
     *
     * @param defaultToOAuthAuthentication the defaultToOAuthAuthentication value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withDefaultToOAuthAuthentication(Boolean defaultToOAuthAuthentication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withDefaultToOAuthAuthentication(defaultToOAuthAuthentication);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Allow or disallow public network access to Storage Account. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Allow or disallow public network access to Storage Account. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the immutableStorageWithVersioning property: The property is immutable and can only be set to true at the
     * account creation time. When set to true, it enables object level immutability for all the containers in the
     * account by default.
     *
     * @return the immutableStorageWithVersioning value.
     */
    public ImmutableStorageAccount immutableStorageWithVersioning() {
        return this.innerProperties() == null ? null : this.innerProperties().immutableStorageWithVersioning();
    }

    /**
     * Set the immutableStorageWithVersioning property: The property is immutable and can only be set to true at the
     * account creation time. When set to true, it enables object level immutability for all the containers in the
     * account by default.
     *
     * @param immutableStorageWithVersioning the immutableStorageWithVersioning value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withImmutableStorageWithVersioning(
        ImmutableStorageAccount immutableStorageWithVersioning) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withImmutableStorageWithVersioning(immutableStorageWithVersioning);
        return this;
    }

    /**
     * Get the allowedCopyScope property: Restrict copy to and from Storage Accounts within an AAD tenant or with
     * Private Links to the same VNet.
     *
     * @return the allowedCopyScope value.
     */
    public AllowedCopyScope allowedCopyScope() {
        return this.innerProperties() == null ? null : this.innerProperties().allowedCopyScope();
    }

    /**
     * Set the allowedCopyScope property: Restrict copy to and from Storage Accounts within an AAD tenant or with
     * Private Links to the same VNet.
     *
     * @param allowedCopyScope the allowedCopyScope value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withAllowedCopyScope(AllowedCopyScope allowedCopyScope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesInner();
        }
        this.innerProperties().withAllowedCopyScope(allowedCopyScope);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
