// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PartnerTopicRoutingMode. */
public final class PartnerTopicRoutingMode extends ExpandableStringEnum<PartnerTopicRoutingMode> {
    /** Static value SourceEventAttribute for PartnerTopicRoutingMode. */
    public static final PartnerTopicRoutingMode SOURCE_EVENT_ATTRIBUTE = fromString("SourceEventAttribute");

    /** Static value ChannelNameHeader for PartnerTopicRoutingMode. */
    public static final PartnerTopicRoutingMode CHANNEL_NAME_HEADER = fromString("ChannelNameHeader");

    /**
     * Creates or finds a PartnerTopicRoutingMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartnerTopicRoutingMode.
     */
    @JsonCreator
    public static PartnerTopicRoutingMode fromString(String name) {
        return fromString(name, PartnerTopicRoutingMode.class);
    }

    /** @return known PartnerTopicRoutingMode values. */
    public static Collection<PartnerTopicRoutingMode> values() {
        return values(PartnerTopicRoutingMode.class);
    }
}