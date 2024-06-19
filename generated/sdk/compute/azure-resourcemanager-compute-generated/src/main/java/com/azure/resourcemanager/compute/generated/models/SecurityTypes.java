// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the SecurityType of the virtual machine. It has to be set to any specified value to enable UefiSettings.
 * The default behavior is: UefiSettings will not be enabled unless this property is set.
 */
public final class SecurityTypes extends ExpandableStringEnum<SecurityTypes> {
    /**
     * Static value TrustedLaunch for SecurityTypes.
     */
    public static final SecurityTypes TRUSTED_LAUNCH = fromString("TrustedLaunch");

    /**
     * Static value ConfidentialVM for SecurityTypes.
     */
    public static final SecurityTypes CONFIDENTIAL_VM = fromString("ConfidentialVM");

    /**
     * Creates a new instance of SecurityTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SecurityTypes() {
    }

    /**
     * Creates or finds a SecurityTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SecurityTypes.
     */
    public static SecurityTypes fromString(String name) {
        return fromString(name, SecurityTypes.class);
    }

    /**
     * Gets known SecurityTypes values.
     * 
     * @return known SecurityTypes values.
     */
    public static Collection<SecurityTypes> values() {
        return values(SecurityTypes.class);
    }
}
