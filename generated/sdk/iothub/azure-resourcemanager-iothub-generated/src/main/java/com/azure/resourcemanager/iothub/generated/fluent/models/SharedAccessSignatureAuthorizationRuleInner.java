// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.generated.models.AccessRights;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of an IoT hub shared access policy.
 */
@Fluent
public final class SharedAccessSignatureAuthorizationRuleInner {
    /*
     * The name of the shared access policy.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /*
     * The primary key.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /*
     * The secondary key.
     */
    @JsonProperty(value = "secondaryKey")
    private String secondaryKey;

    /*
     * The permissions assigned to the shared access policy.
     */
    @JsonProperty(value = "rights", required = true)
    private AccessRights rights;

    /**
     * Creates an instance of SharedAccessSignatureAuthorizationRuleInner class.
     */
    public SharedAccessSignatureAuthorizationRuleInner() {
    }

    /**
     * Get the keyName property: The name of the shared access policy.
     * 
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of the shared access policy.
     * 
     * @param keyName the keyName value to set.
     * @return the SharedAccessSignatureAuthorizationRuleInner object itself.
     */
    public SharedAccessSignatureAuthorizationRuleInner withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the primaryKey property: The primary key.
     * 
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey property: The primary key.
     * 
     * @param primaryKey the primaryKey value to set.
     * @return the SharedAccessSignatureAuthorizationRuleInner object itself.
     */
    public SharedAccessSignatureAuthorizationRuleInner withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey property: The secondary key.
     * 
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey property: The secondary key.
     * 
     * @param secondaryKey the secondaryKey value to set.
     * @return the SharedAccessSignatureAuthorizationRuleInner object itself.
     */
    public SharedAccessSignatureAuthorizationRuleInner withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

    /**
     * Get the rights property: The permissions assigned to the shared access policy.
     * 
     * @return the rights value.
     */
    public AccessRights rights() {
        return this.rights;
    }

    /**
     * Set the rights property: The permissions assigned to the shared access policy.
     * 
     * @param rights the rights value to set.
     * @return the SharedAccessSignatureAuthorizationRuleInner object itself.
     */
    public SharedAccessSignatureAuthorizationRuleInner withRights(AccessRights rights) {
        this.rights = rights;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property keyName in model SharedAccessSignatureAuthorizationRuleInner"));
        }
        if (rights() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property rights in model SharedAccessSignatureAuthorizationRuleInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SharedAccessSignatureAuthorizationRuleInner.class);
}
