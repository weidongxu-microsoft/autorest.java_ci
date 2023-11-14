// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Customer Managed Key details of the resource.
 */
@Fluent
public final class VaultPropertiesEncryption {
    /*
     * The properties of the Key Vault which hosts CMK
     */
    @JsonProperty(value = "keyVaultProperties")
    private CmkKeyVaultProperties keyVaultProperties;

    /*
     * The details of the identity used for CMK
     */
    @JsonProperty(value = "kekIdentity")
    private CmkKekIdentity kekIdentity;

    /*
     * Enabling/Disabling the Double Encryption state
     */
    @JsonProperty(value = "infrastructureEncryption")
    private InfrastructureEncryptionState infrastructureEncryption;

    /**
     * Creates an instance of VaultPropertiesEncryption class.
     */
    public VaultPropertiesEncryption() {
    }

    /**
     * Get the keyVaultProperties property: The properties of the Key Vault which hosts CMK.
     * 
     * @return the keyVaultProperties value.
     */
    public CmkKeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: The properties of the Key Vault which hosts CMK.
     * 
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the VaultPropertiesEncryption object itself.
     */
    public VaultPropertiesEncryption withKeyVaultProperties(CmkKeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get the kekIdentity property: The details of the identity used for CMK.
     * 
     * @return the kekIdentity value.
     */
    public CmkKekIdentity kekIdentity() {
        return this.kekIdentity;
    }

    /**
     * Set the kekIdentity property: The details of the identity used for CMK.
     * 
     * @param kekIdentity the kekIdentity value to set.
     * @return the VaultPropertiesEncryption object itself.
     */
    public VaultPropertiesEncryption withKekIdentity(CmkKekIdentity kekIdentity) {
        this.kekIdentity = kekIdentity;
        return this;
    }

    /**
     * Get the infrastructureEncryption property: Enabling/Disabling the Double Encryption state.
     * 
     * @return the infrastructureEncryption value.
     */
    public InfrastructureEncryptionState infrastructureEncryption() {
        return this.infrastructureEncryption;
    }

    /**
     * Set the infrastructureEncryption property: Enabling/Disabling the Double Encryption state.
     * 
     * @param infrastructureEncryption the infrastructureEncryption value to set.
     * @return the VaultPropertiesEncryption object itself.
     */
    public VaultPropertiesEncryption
        withInfrastructureEncryption(InfrastructureEncryptionState infrastructureEncryption) {
        this.infrastructureEncryption = infrastructureEncryption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultProperties() != null) {
            keyVaultProperties().validate();
        }
        if (kekIdentity() != null) {
            kekIdentity().validate();
        }
    }
}
