// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Denotes the type of timestamp the message will hold. Two types of timestamp types AppendTime, CreateTime. AppendTime
 * refers the time in which message got appended inside broker log. CreateTime refers to the time in which the message
 * was generated on source side and producers can set this timestamp while sending the message. Default value is
 * AppendTime. If you are using AMQP protocol, CreateTime equals AppendTime for now and will full have runtime support
 * later.
 */
public final class TimestampType extends ExpandableStringEnum<TimestampType> {
    /**
     * Static value AppendTime for TimestampType.
     */
    public static final TimestampType APPEND_TIME = fromString("AppendTime");

    /**
     * Static value CreateTime for TimestampType.
     */
    public static final TimestampType CREATE_TIME = fromString("CreateTime");

    /**
     * Creates a new instance of TimestampType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TimestampType() {
    }

    /**
     * Creates or finds a TimestampType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TimestampType.
     */
    @JsonCreator
    public static TimestampType fromString(String name) {
        return fromString(name, TimestampType.class);
    }

    /**
     * Gets known TimestampType values.
     * 
     * @return known TimestampType values.
     */
    public static Collection<TimestampType> values() {
        return values(TimestampType.class);
    }
}