// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines the source of the SSL certificate. */
public final class FrontDoorCertificateSource extends ExpandableStringEnum<FrontDoorCertificateSource> {
    /** Static value AzureKeyVault for FrontDoorCertificateSource. */
    public static final FrontDoorCertificateSource AZURE_KEY_VAULT = fromString("AzureKeyVault");

    /** Static value FrontDoor for FrontDoorCertificateSource. */
    public static final FrontDoorCertificateSource FRONT_DOOR = fromString("FrontDoor");

    /**
     * Creates or finds a FrontDoorCertificateSource from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FrontDoorCertificateSource.
     */
    @JsonCreator
    public static FrontDoorCertificateSource fromString(String name) {
        return fromString(name, FrontDoorCertificateSource.class);
    }

    /**
     * Gets known FrontDoorCertificateSource values.
     *
     * @return known FrontDoorCertificateSource values.
     */
    public static Collection<FrontDoorCertificateSource> values() {
        return values(FrontDoorCertificateSource.class);
    }
}
