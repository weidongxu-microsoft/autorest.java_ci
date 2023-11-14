// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/**
 * Properties of the vault.
 */
@Fluent
public final class VaultPatchProperties {
    /*
     * The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     */
    @JsonProperty(value = "tenantId")
    private UUID tenantId;

    /*
     * SKU details
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * An array of 0 to 16 identities that have access to the key vault. All identities in the array must use the same
     * tenant ID as the key vault's tenant ID.
     */
    @JsonProperty(value = "accessPolicies")
    private List<AccessPolicyEntry> accessPolicies;

    /*
     * Property to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from
     * the key vault.
     */
    @JsonProperty(value = "enabledForDeployment")
    private Boolean enabledForDeployment;

    /*
     * Property to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap
     * keys.
     */
    @JsonProperty(value = "enabledForDiskEncryption")
    private Boolean enabledForDiskEncryption;

    /*
     * Property to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault.
     */
    @JsonProperty(value = "enabledForTemplateDeployment")
    private Boolean enabledForTemplateDeployment;

    /*
     * Property to specify whether the 'soft delete' functionality is enabled for this key vault. Once set to true, it
     * cannot be reverted to false.
     */
    @JsonProperty(value = "enableSoftDelete")
    private Boolean enableSoftDelete;

    /*
     * Property that controls how data actions are authorized. When true, the key vault will use Role Based Access
     * Control (RBAC) for authorization of data actions, and the access policies specified in vault properties will be
     * ignored. When false, the key vault will use the access policies specified in vault properties, and any policy
     * stored on Azure Resource Manager will be ignored. If null or not specified, the value of this property will not
     * change.
     */
    @JsonProperty(value = "enableRbacAuthorization")
    private Boolean enableRbacAuthorization;

    /*
     * softDelete data retention days. It accepts >=7 and <=90.
     */
    @JsonProperty(value = "softDeleteRetentionInDays")
    private Integer softDeleteRetentionInDays;

    /*
     * The vault's create mode to indicate whether the vault need to be recovered or not.
     */
    @JsonProperty(value = "createMode")
    private CreateMode createMode;

    /*
     * Property specifying whether protection against purge is enabled for this vault. Setting this property to true
     * activates protection against purge for this vault and its content - only the Key Vault service may initiate a
     * hard, irrecoverable deletion. The setting is effective only if soft delete is also enabled. Enabling this
     * functionality is irreversible - that is, the property does not accept false as its value.
     */
    @JsonProperty(value = "enablePurgeProtection")
    private Boolean enablePurgeProtection;

    /*
     * A collection of rules governing the accessibility of the vault from specific network locations.
     */
    @JsonProperty(value = "networkAcls")
    private NetworkRuleSet networkAcls;

    /*
     * Property to specify whether the vault will accept traffic from public internet. If set to 'disabled' all traffic
     * except private endpoint traffic and that that originates from trusted services will be blocked. This will
     * override the set firewall rules, meaning that even if the firewall rules are present we will not honor the
     * rules.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private String publicNetworkAccess;

    /**
     * Creates an instance of VaultPatchProperties class.
     */
    public VaultPatchProperties() {
    }

    /**
     * Get the tenantId property: The Azure Active Directory tenant ID that should be used for authenticating requests
     * to the key vault.
     * 
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The Azure Active Directory tenant ID that should be used for authenticating requests
     * to the key vault.
     * 
     * @param tenantId the tenantId value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the sku property: SKU details.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU details.
     * 
     * @param sku the sku value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the accessPolicies property: An array of 0 to 16 identities that have access to the key vault. All
     * identities in the array must use the same tenant ID as the key vault's tenant ID.
     * 
     * @return the accessPolicies value.
     */
    public List<AccessPolicyEntry> accessPolicies() {
        return this.accessPolicies;
    }

    /**
     * Set the accessPolicies property: An array of 0 to 16 identities that have access to the key vault. All
     * identities in the array must use the same tenant ID as the key vault's tenant ID.
     * 
     * @param accessPolicies the accessPolicies value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withAccessPolicies(List<AccessPolicyEntry> accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * Get the enabledForDeployment property: Property to specify whether Azure Virtual Machines are permitted to
     * retrieve certificates stored as secrets from the key vault.
     * 
     * @return the enabledForDeployment value.
     */
    public Boolean enabledForDeployment() {
        return this.enabledForDeployment;
    }

    /**
     * Set the enabledForDeployment property: Property to specify whether Azure Virtual Machines are permitted to
     * retrieve certificates stored as secrets from the key vault.
     * 
     * @param enabledForDeployment the enabledForDeployment value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withEnabledForDeployment(Boolean enabledForDeployment) {
        this.enabledForDeployment = enabledForDeployment;
        return this;
    }

    /**
     * Get the enabledForDiskEncryption property: Property to specify whether Azure Disk Encryption is permitted to
     * retrieve secrets from the vault and unwrap keys.
     * 
     * @return the enabledForDiskEncryption value.
     */
    public Boolean enabledForDiskEncryption() {
        return this.enabledForDiskEncryption;
    }

    /**
     * Set the enabledForDiskEncryption property: Property to specify whether Azure Disk Encryption is permitted to
     * retrieve secrets from the vault and unwrap keys.
     * 
     * @param enabledForDiskEncryption the enabledForDiskEncryption value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withEnabledForDiskEncryption(Boolean enabledForDiskEncryption) {
        this.enabledForDiskEncryption = enabledForDiskEncryption;
        return this;
    }

    /**
     * Get the enabledForTemplateDeployment property: Property to specify whether Azure Resource Manager is permitted
     * to retrieve secrets from the key vault.
     * 
     * @return the enabledForTemplateDeployment value.
     */
    public Boolean enabledForTemplateDeployment() {
        return this.enabledForTemplateDeployment;
    }

    /**
     * Set the enabledForTemplateDeployment property: Property to specify whether Azure Resource Manager is permitted
     * to retrieve secrets from the key vault.
     * 
     * @param enabledForTemplateDeployment the enabledForTemplateDeployment value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withEnabledForTemplateDeployment(Boolean enabledForTemplateDeployment) {
        this.enabledForTemplateDeployment = enabledForTemplateDeployment;
        return this;
    }

    /**
     * Get the enableSoftDelete property: Property to specify whether the 'soft delete' functionality is enabled for
     * this key vault. Once set to true, it cannot be reverted to false.
     * 
     * @return the enableSoftDelete value.
     */
    public Boolean enableSoftDelete() {
        return this.enableSoftDelete;
    }

    /**
     * Set the enableSoftDelete property: Property to specify whether the 'soft delete' functionality is enabled for
     * this key vault. Once set to true, it cannot be reverted to false.
     * 
     * @param enableSoftDelete the enableSoftDelete value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withEnableSoftDelete(Boolean enableSoftDelete) {
        this.enableSoftDelete = enableSoftDelete;
        return this;
    }

    /**
     * Get the enableRbacAuthorization property: Property that controls how data actions are authorized. When true, the
     * key vault will use Role Based Access Control (RBAC) for authorization of data actions, and the access policies
     * specified in vault properties will be ignored. When false, the key vault will use the access policies specified
     * in vault properties, and any policy stored on Azure Resource Manager will be ignored. If null or not specified,
     * the value of this property will not change.
     * 
     * @return the enableRbacAuthorization value.
     */
    public Boolean enableRbacAuthorization() {
        return this.enableRbacAuthorization;
    }

    /**
     * Set the enableRbacAuthorization property: Property that controls how data actions are authorized. When true, the
     * key vault will use Role Based Access Control (RBAC) for authorization of data actions, and the access policies
     * specified in vault properties will be ignored. When false, the key vault will use the access policies specified
     * in vault properties, and any policy stored on Azure Resource Manager will be ignored. If null or not specified,
     * the value of this property will not change.
     * 
     * @param enableRbacAuthorization the enableRbacAuthorization value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withEnableRbacAuthorization(Boolean enableRbacAuthorization) {
        this.enableRbacAuthorization = enableRbacAuthorization;
        return this;
    }

    /**
     * Get the softDeleteRetentionInDays property: softDelete data retention days. It accepts &gt;=7 and &lt;=90.
     * 
     * @return the softDeleteRetentionInDays value.
     */
    public Integer softDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays;
    }

    /**
     * Set the softDeleteRetentionInDays property: softDelete data retention days. It accepts &gt;=7 and &lt;=90.
     * 
     * @param softDeleteRetentionInDays the softDeleteRetentionInDays value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withSoftDeleteRetentionInDays(Integer softDeleteRetentionInDays) {
        this.softDeleteRetentionInDays = softDeleteRetentionInDays;
        return this;
    }

    /**
     * Get the createMode property: The vault's create mode to indicate whether the vault need to be recovered or not.
     * 
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: The vault's create mode to indicate whether the vault need to be recovered or not.
     * 
     * @param createMode the createMode value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * vault. Setting this property to true activates protection against purge for this vault and its content - only
     * the Key Vault service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete
     * is also enabled. Enabling this functionality is irreversible - that is, the property does not accept false as
     * its value.
     * 
     * @return the enablePurgeProtection value.
     */
    public Boolean enablePurgeProtection() {
        return this.enablePurgeProtection;
    }

    /**
     * Set the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * vault. Setting this property to true activates protection against purge for this vault and its content - only
     * the Key Vault service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete
     * is also enabled. Enabling this functionality is irreversible - that is, the property does not accept false as
     * its value.
     * 
     * @param enablePurgeProtection the enablePurgeProtection value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withEnablePurgeProtection(Boolean enablePurgeProtection) {
        this.enablePurgeProtection = enablePurgeProtection;
        return this;
    }

    /**
     * Get the networkAcls property: A collection of rules governing the accessibility of the vault from specific
     * network locations.
     * 
     * @return the networkAcls value.
     */
    public NetworkRuleSet networkAcls() {
        return this.networkAcls;
    }

    /**
     * Set the networkAcls property: A collection of rules governing the accessibility of the vault from specific
     * network locations.
     * 
     * @param networkAcls the networkAcls value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withNetworkAcls(NetworkRuleSet networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Property to specify whether the vault will accept traffic from public
     * internet. If set to 'disabled' all traffic except private endpoint traffic and that that originates from trusted
     * services will be blocked. This will override the set firewall rules, meaning that even if the firewall rules are
     * present we will not honor the rules.
     * 
     * @return the publicNetworkAccess value.
     */
    public String publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Property to specify whether the vault will accept traffic from public
     * internet. If set to 'disabled' all traffic except private endpoint traffic and that that originates from trusted
     * services will be blocked. This will override the set firewall rules, meaning that even if the firewall rules are
     * present we will not honor the rules.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the VaultPatchProperties object itself.
     */
    public VaultPatchProperties withPublicNetworkAccess(String publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
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
        if (accessPolicies() != null) {
            accessPolicies().forEach(e -> e.validate());
        }
        if (networkAcls() != null) {
            networkAcls().validate();
        }
    }
}
