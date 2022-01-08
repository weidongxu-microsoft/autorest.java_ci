// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PartnerRegistrationVisibilityState. */
public final class PartnerRegistrationVisibilityState extends ExpandableStringEnum<PartnerRegistrationVisibilityState> {
    /** Static value Hidden for PartnerRegistrationVisibilityState. */
    public static final PartnerRegistrationVisibilityState HIDDEN = fromString("Hidden");

    /** Static value PublicPreview for PartnerRegistrationVisibilityState. */
    public static final PartnerRegistrationVisibilityState PUBLIC_PREVIEW = fromString("PublicPreview");

    /** Static value GenerallyAvailable for PartnerRegistrationVisibilityState. */
    public static final PartnerRegistrationVisibilityState GENERALLY_AVAILABLE = fromString("GenerallyAvailable");

    /**
     * Creates or finds a PartnerRegistrationVisibilityState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartnerRegistrationVisibilityState.
     */
    @JsonCreator
    public static PartnerRegistrationVisibilityState fromString(String name) {
        return fromString(name, PartnerRegistrationVisibilityState.class);
    }

    /** @return known PartnerRegistrationVisibilityState values. */
    public static Collection<PartnerRegistrationVisibilityState> values() {
        return values(PartnerRegistrationVisibilityState.class);
    }
}
