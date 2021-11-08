// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LanguageExtensionName. */
public final class LanguageExtensionName extends ExpandableStringEnum<LanguageExtensionName> {
    /** Static value PYTHON for LanguageExtensionName. */
    public static final LanguageExtensionName PYTHON = fromString("PYTHON");

    /** Static value R for LanguageExtensionName. */
    public static final LanguageExtensionName R = fromString("R");

    /**
     * Creates or finds a LanguageExtensionName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LanguageExtensionName.
     */
    @JsonCreator
    public static LanguageExtensionName fromString(String name) {
        return fromString(name, LanguageExtensionName.class);
    }

    /** @return known LanguageExtensionName values. */
    public static Collection<LanguageExtensionName> values() {
        return values(LanguageExtensionName.class);
    }
}
