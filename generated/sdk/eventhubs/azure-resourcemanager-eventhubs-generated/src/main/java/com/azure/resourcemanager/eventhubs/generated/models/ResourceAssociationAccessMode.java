// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Access Mode of the resource association. */
public final class ResourceAssociationAccessMode extends ExpandableStringEnum<ResourceAssociationAccessMode> {
    /** Static value NoAssociationMode for ResourceAssociationAccessMode. */
    public static final ResourceAssociationAccessMode NO_ASSOCIATION_MODE = fromString("NoAssociationMode");

    /** Static value EnforcedMode for ResourceAssociationAccessMode. */
    public static final ResourceAssociationAccessMode ENFORCED_MODE = fromString("EnforcedMode");

    /** Static value LearningMode for ResourceAssociationAccessMode. */
    public static final ResourceAssociationAccessMode LEARNING_MODE = fromString("LearningMode");

    /** Static value AuditMode for ResourceAssociationAccessMode. */
    public static final ResourceAssociationAccessMode AUDIT_MODE = fromString("AuditMode");

    /** Static value UnspecifiedMode for ResourceAssociationAccessMode. */
    public static final ResourceAssociationAccessMode UNSPECIFIED_MODE = fromString("UnspecifiedMode");

    /**
     * Creates or finds a ResourceAssociationAccessMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceAssociationAccessMode.
     */
    @JsonCreator
    public static ResourceAssociationAccessMode fromString(String name) {
        return fromString(name, ResourceAssociationAccessMode.class);
    }

    /**
     * Gets known ResourceAssociationAccessMode values.
     *
     * @return known ResourceAssociationAccessMode values.
     */
    public static Collection<ResourceAssociationAccessMode> values() {
        return values(ResourceAssociationAccessMode.class);
    }
}
