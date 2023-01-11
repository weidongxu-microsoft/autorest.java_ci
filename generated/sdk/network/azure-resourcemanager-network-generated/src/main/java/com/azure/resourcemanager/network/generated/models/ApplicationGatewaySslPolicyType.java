// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Type of Ssl Policy. */
public final class ApplicationGatewaySslPolicyType extends ExpandableStringEnum<ApplicationGatewaySslPolicyType> {
    /** Static value Predefined for ApplicationGatewaySslPolicyType. */
    public static final ApplicationGatewaySslPolicyType PREDEFINED = fromString("Predefined");

    /** Static value Custom for ApplicationGatewaySslPolicyType. */
    public static final ApplicationGatewaySslPolicyType CUSTOM = fromString("Custom");

    /** Static value CustomV2 for ApplicationGatewaySslPolicyType. */
    public static final ApplicationGatewaySslPolicyType CUSTOM_V2 = fromString("CustomV2");

    /**
     * Creates a new instance of ApplicationGatewaySslPolicyType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApplicationGatewaySslPolicyType() {
    }

    /**
     * Creates or finds a ApplicationGatewaySslPolicyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewaySslPolicyType.
     */
    @JsonCreator
    public static ApplicationGatewaySslPolicyType fromString(String name) {
        return fromString(name, ApplicationGatewaySslPolicyType.class);
    }

    /**
     * Gets known ApplicationGatewaySslPolicyType values.
     *
     * @return known ApplicationGatewaySslPolicyType values.
     */
    public static Collection<ApplicationGatewaySslPolicyType> values() {
        return values(ApplicationGatewaySslPolicyType.class);
    }
}
