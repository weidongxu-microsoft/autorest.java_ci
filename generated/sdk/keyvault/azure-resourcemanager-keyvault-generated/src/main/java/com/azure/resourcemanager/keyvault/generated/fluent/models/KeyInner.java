// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.keyvault.generated.models.JsonWebKeyCurveName;
import com.azure.resourcemanager.keyvault.generated.models.JsonWebKeyOperation;
import com.azure.resourcemanager.keyvault.generated.models.JsonWebKeyType;
import com.azure.resourcemanager.keyvault.generated.models.KeyAttributes;
import com.azure.resourcemanager.keyvault.generated.models.KeyReleasePolicy;
import com.azure.resourcemanager.keyvault.generated.models.RotationPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The key resource.
 */
@Fluent
public final class KeyInner extends Resource {
    /*
     * The properties of the key.
     */
    @JsonProperty(value = "properties", required = true)
    private KeyProperties innerProperties = new KeyProperties();

    /**
     * Creates an instance of KeyInner class.
     */
    public KeyInner() {
    }

    /**
     * Get the innerProperties property: The properties of the key.
     * 
     * @return the innerProperties value.
     */
    private KeyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the attributes property: The attributes of the key.
     * 
     * @return the attributes value.
     */
    public KeyAttributes attributes() {
        return this.innerProperties() == null ? null : this.innerProperties().attributes();
    }

    /**
     * Set the attributes property: The attributes of the key.
     * 
     * @param attributes the attributes value to set.
     * @return the KeyInner object itself.
     */
    public KeyInner withAttributes(KeyAttributes attributes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KeyProperties();
        }
        this.innerProperties().withAttributes(attributes);
        return this;
    }

    /**
     * Get the kty property: The type of the key. For valid values, see JsonWebKeyType.
     * 
     * @return the kty value.
     */
    public JsonWebKeyType kty() {
        return this.innerProperties() == null ? null : this.innerProperties().kty();
    }

    /**
     * Set the kty property: The type of the key. For valid values, see JsonWebKeyType.
     * 
     * @param kty the kty value to set.
     * @return the KeyInner object itself.
     */
    public KeyInner withKty(JsonWebKeyType kty) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KeyProperties();
        }
        this.innerProperties().withKty(kty);
        return this;
    }

    /**
     * Get the keyOps property: The keyOps property.
     * 
     * @return the keyOps value.
     */
    public List<JsonWebKeyOperation> keyOps() {
        return this.innerProperties() == null ? null : this.innerProperties().keyOps();
    }

    /**
     * Set the keyOps property: The keyOps property.
     * 
     * @param keyOps the keyOps value to set.
     * @return the KeyInner object itself.
     */
    public KeyInner withKeyOps(List<JsonWebKeyOperation> keyOps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KeyProperties();
        }
        this.innerProperties().withKeyOps(keyOps);
        return this;
    }

    /**
     * Get the keySize property: The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     * @return the keySize value.
     */
    public Integer keySize() {
        return this.innerProperties() == null ? null : this.innerProperties().keySize();
    }

    /**
     * Set the keySize property: The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     * @param keySize the keySize value to set.
     * @return the KeyInner object itself.
     */
    public KeyInner withKeySize(Integer keySize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KeyProperties();
        }
        this.innerProperties().withKeySize(keySize);
        return this;
    }

    /**
     * Get the curveName property: The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     * 
     * @return the curveName value.
     */
    public JsonWebKeyCurveName curveName() {
        return this.innerProperties() == null ? null : this.innerProperties().curveName();
    }

    /**
     * Set the curveName property: The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     * 
     * @param curveName the curveName value to set.
     * @return the KeyInner object itself.
     */
    public KeyInner withCurveName(JsonWebKeyCurveName curveName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KeyProperties();
        }
        this.innerProperties().withCurveName(curveName);
        return this;
    }

    /**
     * Get the keyUri property: The URI to retrieve the current version of the key.
     * 
     * @return the keyUri value.
     */
    public String keyUri() {
        return this.innerProperties() == null ? null : this.innerProperties().keyUri();
    }

    /**
     * Get the keyUriWithVersion property: The URI to retrieve the specific version of the key.
     * 
     * @return the keyUriWithVersion value.
     */
    public String keyUriWithVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().keyUriWithVersion();
    }

    /**
     * Get the rotationPolicy property: Key rotation policy in response. It will be used for both output and input. Omitted if empty.
     * 
     * @return the rotationPolicy value.
     */
    public RotationPolicy rotationPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().rotationPolicy();
    }

    /**
     * Set the rotationPolicy property: Key rotation policy in response. It will be used for both output and input. Omitted if empty.
     * 
     * @param rotationPolicy the rotationPolicy value to set.
     * @return the KeyInner object itself.
     */
    public KeyInner withRotationPolicy(RotationPolicy rotationPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KeyProperties();
        }
        this.innerProperties().withRotationPolicy(rotationPolicy);
        return this;
    }

    /**
     * Get the releasePolicy property: Key release policy in response. It will be used for both output and input. Omitted if empty.
     * 
     * @return the releasePolicy value.
     */
    public KeyReleasePolicy releasePolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().releasePolicy();
    }

    /**
     * Set the releasePolicy property: Key release policy in response. It will be used for both output and input. Omitted if empty.
     * 
     * @param releasePolicy the releasePolicy value to set.
     * @return the KeyInner object itself.
     */
    public KeyInner withReleasePolicy(KeyReleasePolicy releasePolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KeyProperties();
        }
        this.innerProperties().withReleasePolicy(releasePolicy);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property innerProperties in model KeyInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KeyInner.class);
}
