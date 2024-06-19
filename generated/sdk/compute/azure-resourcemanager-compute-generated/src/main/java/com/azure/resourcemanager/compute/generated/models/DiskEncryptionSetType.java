// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of key used to encrypt the data of the disk.
 */
public final class DiskEncryptionSetType extends ExpandableStringEnum<DiskEncryptionSetType> {
    /**
     * Static value EncryptionAtRestWithCustomerKey for DiskEncryptionSetType.
     */
    public static final DiskEncryptionSetType ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY
        = fromString("EncryptionAtRestWithCustomerKey");

    /**
     * Static value EncryptionAtRestWithPlatformAndCustomerKeys for DiskEncryptionSetType.
     */
    public static final DiskEncryptionSetType ENCRYPTION_AT_REST_WITH_PLATFORM_AND_CUSTOMER_KEYS
        = fromString("EncryptionAtRestWithPlatformAndCustomerKeys");

    /**
     * Static value ConfidentialVmEncryptedWithCustomerKey for DiskEncryptionSetType.
     */
    public static final DiskEncryptionSetType CONFIDENTIAL_VM_ENCRYPTED_WITH_CUSTOMER_KEY
        = fromString("ConfidentialVmEncryptedWithCustomerKey");

    /**
     * Creates a new instance of DiskEncryptionSetType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DiskEncryptionSetType() {
    }

    /**
     * Creates or finds a DiskEncryptionSetType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DiskEncryptionSetType.
     */
    public static DiskEncryptionSetType fromString(String name) {
        return fromString(name, DiskEncryptionSetType.class);
    }

    /**
     * Gets known DiskEncryptionSetType values.
     * 
     * @return known DiskEncryptionSetType values.
     */
    public static Collection<DiskEncryptionSetType> values() {
        return values(DiskEncryptionSetType.class);
    }
}
