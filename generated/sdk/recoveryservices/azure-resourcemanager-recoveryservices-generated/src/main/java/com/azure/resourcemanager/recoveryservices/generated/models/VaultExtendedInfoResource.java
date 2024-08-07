// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.resourcemanager.recoveryservices.generated.fluent.models.VaultExtendedInfoResourceInner;

/**
 * An immutable client-side representation of VaultExtendedInfoResource.
 */
public interface VaultExtendedInfoResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: Optional ETag.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the integrityKey property: Integrity key.
     * 
     * @return the integrityKey value.
     */
    String integrityKey();

    /**
     * Gets the encryptionKey property: Encryption key.
     * 
     * @return the encryptionKey value.
     */
    String encryptionKey();

    /**
     * Gets the encryptionKeyThumbprint property: Encryption key thumbprint.
     * 
     * @return the encryptionKeyThumbprint value.
     */
    String encryptionKeyThumbprint();

    /**
     * Gets the algorithm property: Algorithm for Vault ExtendedInfo.
     * 
     * @return the algorithm value.
     */
    String algorithm();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservices.generated.fluent.models.VaultExtendedInfoResourceInner
     * object.
     * 
     * @return the inner object.
     */
    VaultExtendedInfoResourceInner innerModel();
}
