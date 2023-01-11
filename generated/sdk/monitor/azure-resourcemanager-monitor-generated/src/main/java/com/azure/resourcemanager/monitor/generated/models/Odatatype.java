// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** specifies the type of the alert criteria. */
public final class Odatatype extends ExpandableStringEnum<Odatatype> {
    /** Static value Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria for Odatatype. */
    public static final Odatatype MICROSOFT_AZURE_MONITOR_SINGLE_RESOURCE_MULTIPLE_METRIC_CRITERIA =
        fromString("Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria");

    /** Static value Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria for Odatatype. */
    public static final Odatatype MICROSOFT_AZURE_MONITOR_MULTIPLE_RESOURCE_MULTIPLE_METRIC_CRITERIA =
        fromString("Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria");

    /** Static value Microsoft.Azure.Monitor.WebtestLocationAvailabilityCriteria for Odatatype. */
    public static final Odatatype MICROSOFT_AZURE_MONITOR_WEBTEST_LOCATION_AVAILABILITY_CRITERIA =
        fromString("Microsoft.Azure.Monitor.WebtestLocationAvailabilityCriteria");

    /**
     * Creates a new instance of Odatatype value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Odatatype() {
    }

    /**
     * Creates or finds a Odatatype from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Odatatype.
     */
    @JsonCreator
    public static Odatatype fromString(String name) {
        return fromString(name, Odatatype.class);
    }

    /**
     * Gets known Odatatype values.
     *
     * @return known Odatatype values.
     */
    public static Collection<Odatatype> values() {
        return values(Odatatype.class);
    }
}
