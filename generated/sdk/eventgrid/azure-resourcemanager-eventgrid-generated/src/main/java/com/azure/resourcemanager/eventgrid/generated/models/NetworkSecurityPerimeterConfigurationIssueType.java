// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Provisioning issue type.
 */
public final class NetworkSecurityPerimeterConfigurationIssueType
    extends ExpandableStringEnum<NetworkSecurityPerimeterConfigurationIssueType> {
    /**
     * Static value MissingPerimeterConfiguration for NetworkSecurityPerimeterConfigurationIssueType.
     */
    public static final NetworkSecurityPerimeterConfigurationIssueType MISSING_PERIMETER_CONFIGURATION
        = fromString("MissingPerimeterConfiguration");

    /**
     * Static value MissingIdentityConfiguration for NetworkSecurityPerimeterConfigurationIssueType.
     */
    public static final NetworkSecurityPerimeterConfigurationIssueType MISSING_IDENTITY_CONFIGURATION
        = fromString("MissingIdentityConfiguration");

    /**
     * Static value ConfigurationPropagationFailure for NetworkSecurityPerimeterConfigurationIssueType.
     */
    public static final NetworkSecurityPerimeterConfigurationIssueType CONFIGURATION_PROPAGATION_FAILURE
        = fromString("ConfigurationPropagationFailure");

    /**
     * Static value Other for NetworkSecurityPerimeterConfigurationIssueType.
     */
    public static final NetworkSecurityPerimeterConfigurationIssueType OTHER = fromString("Other");

    /**
     * Creates a new instance of NetworkSecurityPerimeterConfigurationIssueType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NetworkSecurityPerimeterConfigurationIssueType() {
    }

    /**
     * Creates or finds a NetworkSecurityPerimeterConfigurationIssueType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NetworkSecurityPerimeterConfigurationIssueType.
     */
    @JsonCreator
    public static NetworkSecurityPerimeterConfigurationIssueType fromString(String name) {
        return fromString(name, NetworkSecurityPerimeterConfigurationIssueType.class);
    }

    /**
     * Gets known NetworkSecurityPerimeterConfigurationIssueType values.
     * 
     * @return known NetworkSecurityPerimeterConfigurationIssueType values.
     */
    public static Collection<NetworkSecurityPerimeterConfigurationIssueType> values() {
        return values(NetworkSecurityPerimeterConfigurationIssueType.class);
    }
}
