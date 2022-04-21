// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProviderOsTypeSelected. */
public final class ProviderOsTypeSelected extends ExpandableStringEnum<ProviderOsTypeSelected> {
    /** Static value Windows for ProviderOsTypeSelected. */
    public static final ProviderOsTypeSelected WINDOWS = fromString("Windows");

    /** Static value Linux for ProviderOsTypeSelected. */
    public static final ProviderOsTypeSelected LINUX = fromString("Linux");

    /** Static value WindowsFunctions for ProviderOsTypeSelected. */
    public static final ProviderOsTypeSelected WINDOWS_FUNCTIONS = fromString("WindowsFunctions");

    /** Static value LinuxFunctions for ProviderOsTypeSelected. */
    public static final ProviderOsTypeSelected LINUX_FUNCTIONS = fromString("LinuxFunctions");

    /** Static value All for ProviderOsTypeSelected. */
    public static final ProviderOsTypeSelected ALL = fromString("All");

    /**
     * Creates or finds a ProviderOsTypeSelected from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProviderOsTypeSelected.
     */
    @JsonCreator
    public static ProviderOsTypeSelected fromString(String name) {
        return fromString(name, ProviderOsTypeSelected.class);
    }

    /**
     * Gets known ProviderOsTypeSelected values.
     *
     * @return known ProviderOsTypeSelected values.
     */
    public static Collection<ProviderOsTypeSelected> values() {
        return values(ProviderOsTypeSelected.class);
    }
}
