// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.models.PermissionScope;
import com.azure.resourcemanager.storage.generated.models.SshPublicKey;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The local user associated with the storage accounts. */
@Fluent
public final class LocalUserInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocalUserInner.class);

    /*
     * Storage account local user properties.
     */
    @JsonProperty(value = "properties")
    private LocalUserProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Storage account local user properties.
     *
     * @return the innerProperties value.
     */
    private LocalUserProperties innerProperties() {
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
     * Get the permissionScopes property: The permission scopes of the local user.
     *
     * @return the permissionScopes value.
     */
    public List<PermissionScope> permissionScopes() {
        return this.innerProperties() == null ? null : this.innerProperties().permissionScopes();
    }

    /**
     * Set the permissionScopes property: The permission scopes of the local user.
     *
     * @param permissionScopes the permissionScopes value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withPermissionScopes(List<PermissionScope> permissionScopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withPermissionScopes(permissionScopes);
        return this;
    }

    /**
     * Get the homeDirectory property: Optional, local user home directory.
     *
     * @return the homeDirectory value.
     */
    public String homeDirectory() {
        return this.innerProperties() == null ? null : this.innerProperties().homeDirectory();
    }

    /**
     * Set the homeDirectory property: Optional, local user home directory.
     *
     * @param homeDirectory the homeDirectory value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withHomeDirectory(String homeDirectory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withHomeDirectory(homeDirectory);
        return this;
    }

    /**
     * Get the sshAuthorizedKeys property: Optional, local user ssh authorized keys for SFTP.
     *
     * @return the sshAuthorizedKeys value.
     */
    public List<SshPublicKey> sshAuthorizedKeys() {
        return this.innerProperties() == null ? null : this.innerProperties().sshAuthorizedKeys();
    }

    /**
     * Set the sshAuthorizedKeys property: Optional, local user ssh authorized keys for SFTP.
     *
     * @param sshAuthorizedKeys the sshAuthorizedKeys value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withSshAuthorizedKeys(List<SshPublicKey> sshAuthorizedKeys) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withSshAuthorizedKeys(sshAuthorizedKeys);
        return this;
    }

    /**
     * Get the sid property: A unique Security Identifier that is generated by the server.
     *
     * @return the sid value.
     */
    public String sid() {
        return this.innerProperties() == null ? null : this.innerProperties().sid();
    }

    /**
     * Get the hasSharedKey property: Indicates whether shared key exists. Set it to false to remove existing shared
     * key.
     *
     * @return the hasSharedKey value.
     */
    public Boolean hasSharedKey() {
        return this.innerProperties() == null ? null : this.innerProperties().hasSharedKey();
    }

    /**
     * Set the hasSharedKey property: Indicates whether shared key exists. Set it to false to remove existing shared
     * key.
     *
     * @param hasSharedKey the hasSharedKey value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withHasSharedKey(Boolean hasSharedKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withHasSharedKey(hasSharedKey);
        return this;
    }

    /**
     * Get the hasSshKey property: Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     *
     * @return the hasSshKey value.
     */
    public Boolean hasSshKey() {
        return this.innerProperties() == null ? null : this.innerProperties().hasSshKey();
    }

    /**
     * Set the hasSshKey property: Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     *
     * @param hasSshKey the hasSshKey value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withHasSshKey(Boolean hasSshKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withHasSshKey(hasSshKey);
        return this;
    }

    /**
     * Get the hasSshPassword property: Indicates whether ssh password exists. Set it to false to remove existing SSH
     * password.
     *
     * @return the hasSshPassword value.
     */
    public Boolean hasSshPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().hasSshPassword();
    }

    /**
     * Set the hasSshPassword property: Indicates whether ssh password exists. Set it to false to remove existing SSH
     * password.
     *
     * @param hasSshPassword the hasSshPassword value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withHasSshPassword(Boolean hasSshPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withHasSshPassword(hasSshPassword);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
