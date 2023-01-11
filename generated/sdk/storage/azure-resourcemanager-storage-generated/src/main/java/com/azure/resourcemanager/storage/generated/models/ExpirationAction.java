// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The SAS expiration action. Can only be Log. */
public final class ExpirationAction extends ExpandableStringEnum<ExpirationAction> {
    /** Static value Log for ExpirationAction. */
    public static final ExpirationAction LOG = fromString("Log");

    /**
     * Creates a new instance of ExpirationAction value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExpirationAction() {
    }

    /**
     * Creates or finds a ExpirationAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpirationAction.
     */
    @JsonCreator
    public static ExpirationAction fromString(String name) {
        return fromString(name, ExpirationAction.class);
    }

    /**
     * Gets known ExpirationAction values.
     *
     * @return known ExpirationAction values.
     */
    public static Collection<ExpirationAction> values() {
        return values(ExpirationAction.class);
    }
}
