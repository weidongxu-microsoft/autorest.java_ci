// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines the type of insights that you want the service to generate. The allowed values are 'AudioInsightsOnly',
 * 'VideoInsightsOnly', and 'AllInsights'. The default is AllInsights. If you set this to AllInsights and the input is
 * audio only, then only audio insights are generated. Similarly if the input is video only, then only video insights
 * are generated. It is recommended that you not use AudioInsightsOnly if you expect some of your inputs to be video
 * only; or use VideoInsightsOnly if you expect some of your inputs to be audio only. Your Jobs in such conditions would
 * error out.
 */
public final class InsightsType extends ExpandableStringEnum<InsightsType> {
    /** Static value AudioInsightsOnly for InsightsType. */
    public static final InsightsType AUDIO_INSIGHTS_ONLY = fromString("AudioInsightsOnly");

    /** Static value VideoInsightsOnly for InsightsType. */
    public static final InsightsType VIDEO_INSIGHTS_ONLY = fromString("VideoInsightsOnly");

    /** Static value AllInsights for InsightsType. */
    public static final InsightsType ALL_INSIGHTS = fromString("AllInsights");

    /**
     * Creates a new instance of InsightsType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InsightsType() {
    }

    /**
     * Creates or finds a InsightsType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InsightsType.
     */
    @JsonCreator
    public static InsightsType fromString(String name) {
        return fromString(name, InsightsType.class);
    }

    /**
     * Gets known InsightsType values.
     *
     * @return known InsightsType values.
     */
    public static Collection<InsightsType> values() {
        return values(InsightsType.class);
    }
}
