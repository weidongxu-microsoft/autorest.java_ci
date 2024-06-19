// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Describes what tool created this Application Insights component. Customers using this API should set this to the
 * default 'rest'.
 */
public final class RequestSource extends ExpandableStringEnum<RequestSource> {
    /**
     * Static value rest for RequestSource.
     */
    public static final RequestSource REST = fromString("rest");

    /**
     * Creates a new instance of RequestSource value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RequestSource() {
    }

    /**
     * Creates or finds a RequestSource from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RequestSource.
     */
    public static RequestSource fromString(String name) {
        return fromString(name, RequestSource.class);
    }

    /**
     * Gets known RequestSource values.
     * 
     * @return known RequestSource values.
     */
    public static Collection<RequestSource> values() {
        return values(RequestSource.class);
    }
}
