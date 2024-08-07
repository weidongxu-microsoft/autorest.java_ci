// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The organization type of the lot.
 */
public final class OrganizationType extends ExpandableStringEnum<OrganizationType> {
    /**
     * Static value Primary for OrganizationType.
     */
    public static final OrganizationType PRIMARY = fromString("Primary");

    /**
     * Static value Contributor for OrganizationType.
     */
    public static final OrganizationType CONTRIBUTOR = fromString("Contributor");

    /**
     * Creates a new instance of OrganizationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OrganizationType() {
    }

    /**
     * Creates or finds a OrganizationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OrganizationType.
     */
    public static OrganizationType fromString(String name) {
        return fromString(name, OrganizationType.class);
    }

    /**
     * Gets known OrganizationType values.
     * 
     * @return known OrganizationType values.
     */
    public static Collection<OrganizationType> values() {
        return values(OrganizationType.class);
    }
}
