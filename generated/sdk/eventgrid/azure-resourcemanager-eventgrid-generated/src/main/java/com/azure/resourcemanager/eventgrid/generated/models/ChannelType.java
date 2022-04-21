// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ChannelType. */
public final class ChannelType extends ExpandableStringEnum<ChannelType> {
    /** Static value PartnerTopic for ChannelType. */
    public static final ChannelType PARTNER_TOPIC = fromString("PartnerTopic");

    /** Static value PartnerDestination for ChannelType. */
    public static final ChannelType PARTNER_DESTINATION = fromString("PartnerDestination");

    /**
     * Creates or finds a ChannelType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ChannelType.
     */
    @JsonCreator
    public static ChannelType fromString(String name) {
        return fromString(name, ChannelType.class);
    }

    /**
     * Gets known ChannelType values.
     *
     * @return known ChannelType values.
     */
    public static Collection<ChannelType> values() {
        return values(ChannelType.class);
    }
}
