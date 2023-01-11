// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The data format of the message. Optionally the data format can be added to each message. */
public final class EventGridDataFormat extends ExpandableStringEnum<EventGridDataFormat> {
    /** Static value MULTIJSON for EventGridDataFormat. */
    public static final EventGridDataFormat MULTIJSON = fromString("MULTIJSON");

    /** Static value JSON for EventGridDataFormat. */
    public static final EventGridDataFormat JSON = fromString("JSON");

    /** Static value CSV for EventGridDataFormat. */
    public static final EventGridDataFormat CSV = fromString("CSV");

    /** Static value TSV for EventGridDataFormat. */
    public static final EventGridDataFormat TSV = fromString("TSV");

    /** Static value SCSV for EventGridDataFormat. */
    public static final EventGridDataFormat SCSV = fromString("SCSV");

    /** Static value SOHSV for EventGridDataFormat. */
    public static final EventGridDataFormat SOHSV = fromString("SOHSV");

    /** Static value PSV for EventGridDataFormat. */
    public static final EventGridDataFormat PSV = fromString("PSV");

    /** Static value TXT for EventGridDataFormat. */
    public static final EventGridDataFormat TXT = fromString("TXT");

    /** Static value RAW for EventGridDataFormat. */
    public static final EventGridDataFormat RAW = fromString("RAW");

    /** Static value SINGLEJSON for EventGridDataFormat. */
    public static final EventGridDataFormat SINGLEJSON = fromString("SINGLEJSON");

    /** Static value AVRO for EventGridDataFormat. */
    public static final EventGridDataFormat AVRO = fromString("AVRO");

    /** Static value TSVE for EventGridDataFormat. */
    public static final EventGridDataFormat TSVE = fromString("TSVE");

    /** Static value PARQUET for EventGridDataFormat. */
    public static final EventGridDataFormat PARQUET = fromString("PARQUET");

    /** Static value ORC for EventGridDataFormat. */
    public static final EventGridDataFormat ORC = fromString("ORC");

    /** Static value APACHEAVRO for EventGridDataFormat. */
    public static final EventGridDataFormat APACHEAVRO = fromString("APACHEAVRO");

    /** Static value W3CLOGFILE for EventGridDataFormat. */
    public static final EventGridDataFormat W3CLOGFILE = fromString("W3CLOGFILE");

    /**
     * Creates a new instance of EventGridDataFormat value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EventGridDataFormat() {
    }

    /**
     * Creates or finds a EventGridDataFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventGridDataFormat.
     */
    @JsonCreator
    public static EventGridDataFormat fromString(String name) {
        return fromString(name, EventGridDataFormat.class);
    }

    /**
     * Gets known EventGridDataFormat values.
     *
     * @return known EventGridDataFormat values.
     */
    public static Collection<EventGridDataFormat> values() {
        return values(EventGridDataFormat.class);
    }
}
