// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The HTTP method to use.
 */
public final class HttpConfigurationMethod extends ExpandableStringEnum<HttpConfigurationMethod> {
    /**
     * Static value Get for HttpConfigurationMethod.
     */
    public static final HttpConfigurationMethod GET = fromString("Get");

    /**
     * Static value Post for HttpConfigurationMethod.
     */
    public static final HttpConfigurationMethod POST = fromString("Post");

    /**
     * Creates a new instance of HttpConfigurationMethod value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HttpConfigurationMethod() {
    }

    /**
     * Creates or finds a HttpConfigurationMethod from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HttpConfigurationMethod.
     */
    @JsonCreator
    public static HttpConfigurationMethod fromString(String name) {
        return fromString(name, HttpConfigurationMethod.class);
    }

    /**
     * Gets known HttpConfigurationMethod values.
     * 
     * @return known HttpConfigurationMethod values.
     */
    public static Collection<HttpConfigurationMethod> values() {
        return values(HttpConfigurationMethod.class);
    }
}
