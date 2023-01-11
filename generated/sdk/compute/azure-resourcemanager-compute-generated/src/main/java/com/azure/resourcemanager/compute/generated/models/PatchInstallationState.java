// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The state of the patch after the installation operation completed. */
public final class PatchInstallationState extends ExpandableStringEnum<PatchInstallationState> {
    /** Static value Unknown for PatchInstallationState. */
    public static final PatchInstallationState UNKNOWN = fromString("Unknown");

    /** Static value Installed for PatchInstallationState. */
    public static final PatchInstallationState INSTALLED = fromString("Installed");

    /** Static value Failed for PatchInstallationState. */
    public static final PatchInstallationState FAILED = fromString("Failed");

    /** Static value Excluded for PatchInstallationState. */
    public static final PatchInstallationState EXCLUDED = fromString("Excluded");

    /** Static value NotSelected for PatchInstallationState. */
    public static final PatchInstallationState NOT_SELECTED = fromString("NotSelected");

    /** Static value Pending for PatchInstallationState. */
    public static final PatchInstallationState PENDING = fromString("Pending");

    /**
     * Creates a new instance of PatchInstallationState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PatchInstallationState() {
    }

    /**
     * Creates or finds a PatchInstallationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PatchInstallationState.
     */
    @JsonCreator
    public static PatchInstallationState fromString(String name) {
        return fromString(name, PatchInstallationState.class);
    }

    /**
     * Gets known PatchInstallationState values.
     *
     * @return known PatchInstallationState values.
     */
    public static Collection<PatchInstallationState> values() {
        return values(PatchInstallationState.class);
    }
}
