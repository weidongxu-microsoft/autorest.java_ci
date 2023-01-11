// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The Pfs Groups used in IKE Phase 2 for new child SA. */
public final class PfsGroup extends ExpandableStringEnum<PfsGroup> {
    /** Static value None for PfsGroup. */
    public static final PfsGroup NONE = fromString("None");

    /** Static value PFS1 for PfsGroup. */
    public static final PfsGroup PFS1 = fromString("PFS1");

    /** Static value PFS2 for PfsGroup. */
    public static final PfsGroup PFS2 = fromString("PFS2");

    /** Static value PFS2048 for PfsGroup. */
    public static final PfsGroup PFS2048 = fromString("PFS2048");

    /** Static value ECP256 for PfsGroup. */
    public static final PfsGroup ECP256 = fromString("ECP256");

    /** Static value ECP384 for PfsGroup. */
    public static final PfsGroup ECP384 = fromString("ECP384");

    /** Static value PFS24 for PfsGroup. */
    public static final PfsGroup PFS24 = fromString("PFS24");

    /** Static value PFS14 for PfsGroup. */
    public static final PfsGroup PFS14 = fromString("PFS14");

    /** Static value PFSMM for PfsGroup. */
    public static final PfsGroup PFSMM = fromString("PFSMM");

    /**
     * Creates a new instance of PfsGroup value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PfsGroup() {
    }

    /**
     * Creates or finds a PfsGroup from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PfsGroup.
     */
    @JsonCreator
    public static PfsGroup fromString(String name) {
        return fromString(name, PfsGroup.class);
    }

    /**
     * Gets known PfsGroup values.
     *
     * @return known PfsGroup values.
     */
    public static Collection<PfsGroup> values() {
        return values(PfsGroup.class);
    }
}
