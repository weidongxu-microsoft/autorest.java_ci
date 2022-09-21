// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.AccountType;
import com.azure.resourcemanager.databoxedge.generated.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.generated.models.AsymmetricEncryptedSecret;
import com.azure.resourcemanager.databoxedge.generated.models.SslStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The storage account credential. */
@Fluent
public final class StorageAccountCredentialInner extends ArmBaseModel {
    /*
     * The storage account credential properties.
     */
    @JsonProperty(value = "properties", required = true)
    private StorageAccountCredentialProperties innerProperties = new StorageAccountCredentialProperties();

    /*
     * Metadata pertaining to creation and last modification of StorageAccountCredential
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of StorageAccountCredentialInner class. */
    public StorageAccountCredentialInner() {
    }

    /**
     * Get the innerProperties property: The storage account credential properties.
     *
     * @return the innerProperties value.
     */
    private StorageAccountCredentialProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of StorageAccountCredential.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the alias property: Alias for the storage account.
     *
     * @return the alias value.
     */
    public String alias() {
        return this.innerProperties() == null ? null : this.innerProperties().alias();
    }

    /**
     * Set the alias property: Alias for the storage account.
     *
     * @param alias the alias value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withAlias(String alias) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountCredentialProperties();
        }
        this.innerProperties().withAlias(alias);
        return this;
    }

    /**
     * Get the username property: Username for the storage account.
     *
     * @return the username value.
     */
    public String username() {
        return this.innerProperties() == null ? null : this.innerProperties().username();
    }

    /**
     * Set the username property: Username for the storage account.
     *
     * @param username the username value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withUsername(String username) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountCredentialProperties();
        }
        this.innerProperties().withUsername(username);
        return this;
    }

    /**
     * Get the accountKey property: Encrypted storage key.
     *
     * @return the accountKey value.
     */
    public AsymmetricEncryptedSecret accountKey() {
        return this.innerProperties() == null ? null : this.innerProperties().accountKey();
    }

    /**
     * Set the accountKey property: Encrypted storage key.
     *
     * @param accountKey the accountKey value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withAccountKey(AsymmetricEncryptedSecret accountKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountCredentialProperties();
        }
        this.innerProperties().withAccountKey(accountKey);
        return this;
    }

    /**
     * Get the connectionString property: Connection string for the storage account. Use this string if username and
     * account key are not specified.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionString();
    }

    /**
     * Set the connectionString property: Connection string for the storage account. Use this string if username and
     * account key are not specified.
     *
     * @param connectionString the connectionString value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withConnectionString(String connectionString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountCredentialProperties();
        }
        this.innerProperties().withConnectionString(connectionString);
        return this;
    }

    /**
     * Get the sslStatus property: Signifies whether SSL needs to be enabled or not.
     *
     * @return the sslStatus value.
     */
    public SslStatus sslStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().sslStatus();
    }

    /**
     * Set the sslStatus property: Signifies whether SSL needs to be enabled or not.
     *
     * @param sslStatus the sslStatus value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withSslStatus(SslStatus sslStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountCredentialProperties();
        }
        this.innerProperties().withSslStatus(sslStatus);
        return this;
    }

    /**
     * Get the blobDomainName property: Blob end point for private clouds.
     *
     * @return the blobDomainName value.
     */
    public String blobDomainName() {
        return this.innerProperties() == null ? null : this.innerProperties().blobDomainName();
    }

    /**
     * Set the blobDomainName property: Blob end point for private clouds.
     *
     * @param blobDomainName the blobDomainName value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withBlobDomainName(String blobDomainName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountCredentialProperties();
        }
        this.innerProperties().withBlobDomainName(blobDomainName);
        return this;
    }

    /**
     * Get the accountType property: Type of storage accessed on the storage account.
     *
     * @return the accountType value.
     */
    public AccountType accountType() {
        return this.innerProperties() == null ? null : this.innerProperties().accountType();
    }

    /**
     * Set the accountType property: Type of storage accessed on the storage account.
     *
     * @param accountType the accountType value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withAccountType(AccountType accountType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountCredentialProperties();
        }
        this.innerProperties().withAccountType(accountType);
        return this;
    }

    /**
     * Get the storageAccountId property: Id of the storage account.
     *
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountId();
    }

    /**
     * Set the storageAccountId property: Id of the storage account.
     *
     * @param storageAccountId the storageAccountId value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withStorageAccountId(String storageAccountId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountCredentialProperties();
        }
        this.innerProperties().withStorageAccountId(storageAccountId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model StorageAccountCredentialInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageAccountCredentialInner.class);
}
