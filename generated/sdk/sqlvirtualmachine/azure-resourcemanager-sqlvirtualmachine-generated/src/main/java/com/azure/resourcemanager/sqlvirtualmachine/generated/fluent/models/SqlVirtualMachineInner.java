// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.AssessmentSettings;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.AutoBackupSettings;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.AutoPatchingSettings;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.KeyVaultCredentialSettings;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.LeastPrivilegeMode;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.ResourceIdentity;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.ServerConfigurationsManagementSettings;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.SqlImageSku;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.SqlManagementMode;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.SqlServerLicenseType;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.StorageConfigurationSettings;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.TroubleshootingStatus;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.WsfcDomainCredentials;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * A SQL virtual machine.
 */
@Fluent
public final class SqlVirtualMachineInner extends Resource {
    /*
     * DO NOT USE. This value will be deprecated. Azure Active Directory identity of the server.
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private SqlVirtualMachineProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of SqlVirtualMachineInner class.
     */
    public SqlVirtualMachineInner() {
    }

    /**
     * Get the identity property: DO NOT USE. This value will be deprecated. Azure Active Directory identity of the
     * server.
     * 
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: DO NOT USE. This value will be deprecated. Azure Active Directory identity of the
     * server.
     * 
     * @param identity the identity value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private SqlVirtualMachineProperties innerProperties() {
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
     * {@inheritDoc}
     */
    @Override
    public SqlVirtualMachineInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlVirtualMachineInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the virtualMachineResourceId property: ARM Resource id of underlying virtual machine created from SQL
     * marketplace image.
     * 
     * @return the virtualMachineResourceId value.
     */
    public String virtualMachineResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachineResourceId();
    }

    /**
     * Set the virtualMachineResourceId property: ARM Resource id of underlying virtual machine created from SQL
     * marketplace image.
     * 
     * @param virtualMachineResourceId the virtualMachineResourceId value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withVirtualMachineResourceId(String virtualMachineResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withVirtualMachineResourceId(virtualMachineResourceId);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state to track the async operation status.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the sqlImageOffer property: SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     * 
     * @return the sqlImageOffer value.
     */
    public String sqlImageOffer() {
        return this.innerProperties() == null ? null : this.innerProperties().sqlImageOffer();
    }

    /**
     * Set the sqlImageOffer property: SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     * 
     * @param sqlImageOffer the sqlImageOffer value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withSqlImageOffer(String sqlImageOffer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withSqlImageOffer(sqlImageOffer);
        return this;
    }

    /**
     * Get the sqlServerLicenseType property: SQL Server license type.
     * 
     * @return the sqlServerLicenseType value.
     */
    public SqlServerLicenseType sqlServerLicenseType() {
        return this.innerProperties() == null ? null : this.innerProperties().sqlServerLicenseType();
    }

    /**
     * Set the sqlServerLicenseType property: SQL Server license type.
     * 
     * @param sqlServerLicenseType the sqlServerLicenseType value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withSqlServerLicenseType(SqlServerLicenseType sqlServerLicenseType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withSqlServerLicenseType(sqlServerLicenseType);
        return this;
    }

    /**
     * Get the sqlManagement property: SQL Server Management type. NOTE: This parameter is not used anymore. API will
     * automatically detect the Sql Management, refrain from using it.
     * 
     * @return the sqlManagement value.
     */
    public SqlManagementMode sqlManagement() {
        return this.innerProperties() == null ? null : this.innerProperties().sqlManagement();
    }

    /**
     * Set the sqlManagement property: SQL Server Management type. NOTE: This parameter is not used anymore. API will
     * automatically detect the Sql Management, refrain from using it.
     * 
     * @param sqlManagement the sqlManagement value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withSqlManagement(SqlManagementMode sqlManagement) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withSqlManagement(sqlManagement);
        return this;
    }

    /**
     * Get the leastPrivilegeMode property: SQL IaaS Agent least privilege mode.
     * 
     * @return the leastPrivilegeMode value.
     */
    public LeastPrivilegeMode leastPrivilegeMode() {
        return this.innerProperties() == null ? null : this.innerProperties().leastPrivilegeMode();
    }

    /**
     * Set the leastPrivilegeMode property: SQL IaaS Agent least privilege mode.
     * 
     * @param leastPrivilegeMode the leastPrivilegeMode value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withLeastPrivilegeMode(LeastPrivilegeMode leastPrivilegeMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withLeastPrivilegeMode(leastPrivilegeMode);
        return this;
    }

    /**
     * Get the sqlImageSku property: SQL Server edition type.
     * 
     * @return the sqlImageSku value.
     */
    public SqlImageSku sqlImageSku() {
        return this.innerProperties() == null ? null : this.innerProperties().sqlImageSku();
    }

    /**
     * Set the sqlImageSku property: SQL Server edition type.
     * 
     * @param sqlImageSku the sqlImageSku value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withSqlImageSku(SqlImageSku sqlImageSku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withSqlImageSku(sqlImageSku);
        return this;
    }

    /**
     * Get the sqlVirtualMachineGroupResourceId property: ARM resource id of the SQL virtual machine group this SQL
     * virtual machine is or will be part of.
     * 
     * @return the sqlVirtualMachineGroupResourceId value.
     */
    public String sqlVirtualMachineGroupResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().sqlVirtualMachineGroupResourceId();
    }

    /**
     * Set the sqlVirtualMachineGroupResourceId property: ARM resource id of the SQL virtual machine group this SQL
     * virtual machine is or will be part of.
     * 
     * @param sqlVirtualMachineGroupResourceId the sqlVirtualMachineGroupResourceId value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withSqlVirtualMachineGroupResourceId(String sqlVirtualMachineGroupResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withSqlVirtualMachineGroupResourceId(sqlVirtualMachineGroupResourceId);
        return this;
    }

    /**
     * Get the wsfcDomainCredentials property: Domain credentials for setting up Windows Server Failover Cluster for
     * SQL availability group.
     * 
     * @return the wsfcDomainCredentials value.
     */
    public WsfcDomainCredentials wsfcDomainCredentials() {
        return this.innerProperties() == null ? null : this.innerProperties().wsfcDomainCredentials();
    }

    /**
     * Set the wsfcDomainCredentials property: Domain credentials for setting up Windows Server Failover Cluster for
     * SQL availability group.
     * 
     * @param wsfcDomainCredentials the wsfcDomainCredentials value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withWsfcDomainCredentials(WsfcDomainCredentials wsfcDomainCredentials) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withWsfcDomainCredentials(wsfcDomainCredentials);
        return this;
    }

    /**
     * Get the wsfcStaticIp property: Domain credentials for setting up Windows Server Failover Cluster for SQL
     * availability group.
     * 
     * @return the wsfcStaticIp value.
     */
    public String wsfcStaticIp() {
        return this.innerProperties() == null ? null : this.innerProperties().wsfcStaticIp();
    }

    /**
     * Set the wsfcStaticIp property: Domain credentials for setting up Windows Server Failover Cluster for SQL
     * availability group.
     * 
     * @param wsfcStaticIp the wsfcStaticIp value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withWsfcStaticIp(String wsfcStaticIp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withWsfcStaticIp(wsfcStaticIp);
        return this;
    }

    /**
     * Get the autoPatchingSettings property: Auto patching settings for applying critical security updates to SQL
     * virtual machine.
     * 
     * @return the autoPatchingSettings value.
     */
    public AutoPatchingSettings autoPatchingSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().autoPatchingSettings();
    }

    /**
     * Set the autoPatchingSettings property: Auto patching settings for applying critical security updates to SQL
     * virtual machine.
     * 
     * @param autoPatchingSettings the autoPatchingSettings value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withAutoPatchingSettings(AutoPatchingSettings autoPatchingSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withAutoPatchingSettings(autoPatchingSettings);
        return this;
    }

    /**
     * Get the autoBackupSettings property: Auto backup settings for SQL Server.
     * 
     * @return the autoBackupSettings value.
     */
    public AutoBackupSettings autoBackupSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().autoBackupSettings();
    }

    /**
     * Set the autoBackupSettings property: Auto backup settings for SQL Server.
     * 
     * @param autoBackupSettings the autoBackupSettings value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withAutoBackupSettings(AutoBackupSettings autoBackupSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withAutoBackupSettings(autoBackupSettings);
        return this;
    }

    /**
     * Get the keyVaultCredentialSettings property: Key vault credential settings.
     * 
     * @return the keyVaultCredentialSettings value.
     */
    public KeyVaultCredentialSettings keyVaultCredentialSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultCredentialSettings();
    }

    /**
     * Set the keyVaultCredentialSettings property: Key vault credential settings.
     * 
     * @param keyVaultCredentialSettings the keyVaultCredentialSettings value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner
        withKeyVaultCredentialSettings(KeyVaultCredentialSettings keyVaultCredentialSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withKeyVaultCredentialSettings(keyVaultCredentialSettings);
        return this;
    }

    /**
     * Get the serverConfigurationsManagementSettings property: SQL Server configuration management settings.
     * 
     * @return the serverConfigurationsManagementSettings value.
     */
    public ServerConfigurationsManagementSettings serverConfigurationsManagementSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().serverConfigurationsManagementSettings();
    }

    /**
     * Set the serverConfigurationsManagementSettings property: SQL Server configuration management settings.
     * 
     * @param serverConfigurationsManagementSettings the serverConfigurationsManagementSettings value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withServerConfigurationsManagementSettings(
        ServerConfigurationsManagementSettings serverConfigurationsManagementSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withServerConfigurationsManagementSettings(serverConfigurationsManagementSettings);
        return this;
    }

    /**
     * Get the storageConfigurationSettings property: Storage Configuration Settings.
     * 
     * @return the storageConfigurationSettings value.
     */
    public StorageConfigurationSettings storageConfigurationSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().storageConfigurationSettings();
    }

    /**
     * Set the storageConfigurationSettings property: Storage Configuration Settings.
     * 
     * @param storageConfigurationSettings the storageConfigurationSettings value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner
        withStorageConfigurationSettings(StorageConfigurationSettings storageConfigurationSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withStorageConfigurationSettings(storageConfigurationSettings);
        return this;
    }

    /**
     * Get the troubleshootingStatus property: Troubleshooting status.
     * 
     * @return the troubleshootingStatus value.
     */
    public TroubleshootingStatus troubleshootingStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().troubleshootingStatus();
    }

    /**
     * Get the assessmentSettings property: SQL best practices Assessment Settings.
     * 
     * @return the assessmentSettings value.
     */
    public AssessmentSettings assessmentSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().assessmentSettings();
    }

    /**
     * Set the assessmentSettings property: SQL best practices Assessment Settings.
     * 
     * @param assessmentSettings the assessmentSettings value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withAssessmentSettings(AssessmentSettings assessmentSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withAssessmentSettings(assessmentSettings);
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: Enable automatic upgrade of Sql IaaS extension Agent.
     * 
     * @return the enableAutomaticUpgrade value.
     */
    public Boolean enableAutomaticUpgrade() {
        return this.innerProperties() == null ? null : this.innerProperties().enableAutomaticUpgrade();
    }

    /**
     * Set the enableAutomaticUpgrade property: Enable automatic upgrade of Sql IaaS extension Agent.
     * 
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlVirtualMachineProperties();
        }
        this.innerProperties().withEnableAutomaticUpgrade(enableAutomaticUpgrade);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
