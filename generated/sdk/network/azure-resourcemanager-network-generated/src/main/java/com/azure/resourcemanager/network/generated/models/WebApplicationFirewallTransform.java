// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Transforms applied before matching.
 */
public final class WebApplicationFirewallTransform extends ExpandableStringEnum<WebApplicationFirewallTransform> {
    /**
     * Static value Uppercase for WebApplicationFirewallTransform.
     */
    public static final WebApplicationFirewallTransform UPPERCASE = fromString("Uppercase");

    /**
     * Static value Lowercase for WebApplicationFirewallTransform.
     */
    public static final WebApplicationFirewallTransform LOWERCASE = fromString("Lowercase");

    /**
     * Static value Trim for WebApplicationFirewallTransform.
     */
    public static final WebApplicationFirewallTransform TRIM = fromString("Trim");

    /**
     * Static value UrlDecode for WebApplicationFirewallTransform.
     */
    public static final WebApplicationFirewallTransform URL_DECODE = fromString("UrlDecode");

    /**
     * Static value UrlEncode for WebApplicationFirewallTransform.
     */
    public static final WebApplicationFirewallTransform URL_ENCODE = fromString("UrlEncode");

    /**
     * Static value RemoveNulls for WebApplicationFirewallTransform.
     */
    public static final WebApplicationFirewallTransform REMOVE_NULLS = fromString("RemoveNulls");

    /**
     * Static value HtmlEntityDecode for WebApplicationFirewallTransform.
     */
    public static final WebApplicationFirewallTransform HTML_ENTITY_DECODE = fromString("HtmlEntityDecode");

    /**
     * Creates a new instance of WebApplicationFirewallTransform value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WebApplicationFirewallTransform() {
    }

    /**
     * Creates or finds a WebApplicationFirewallTransform from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WebApplicationFirewallTransform.
     */
    public static WebApplicationFirewallTransform fromString(String name) {
        return fromString(name, WebApplicationFirewallTransform.class);
    }

    /**
     * Gets known WebApplicationFirewallTransform values.
     * 
     * @return known WebApplicationFirewallTransform values.
     */
    public static Collection<WebApplicationFirewallTransform> values() {
        return values(WebApplicationFirewallTransform.class);
    }
}
