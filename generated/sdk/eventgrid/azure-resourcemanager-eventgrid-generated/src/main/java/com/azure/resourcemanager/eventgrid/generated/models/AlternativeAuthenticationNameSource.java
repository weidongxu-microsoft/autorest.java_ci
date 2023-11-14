// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for AlternativeAuthenticationNameSource.
 */
public final class AlternativeAuthenticationNameSource
    extends ExpandableStringEnum<AlternativeAuthenticationNameSource> {
    /**
     * Static value ClientCertificateSubject for AlternativeAuthenticationNameSource.
     */
    public static final AlternativeAuthenticationNameSource CLIENT_CERTIFICATE_SUBJECT
        = fromString("ClientCertificateSubject");

    /**
     * Static value ClientCertificateDns for AlternativeAuthenticationNameSource.
     */
    public static final AlternativeAuthenticationNameSource CLIENT_CERTIFICATE_DNS = fromString("ClientCertificateDns");

    /**
     * Static value ClientCertificateUri for AlternativeAuthenticationNameSource.
     */
    public static final AlternativeAuthenticationNameSource CLIENT_CERTIFICATE_URI = fromString("ClientCertificateUri");

    /**
     * Static value ClientCertificateIp for AlternativeAuthenticationNameSource.
     */
    public static final AlternativeAuthenticationNameSource CLIENT_CERTIFICATE_IP = fromString("ClientCertificateIp");

    /**
     * Static value ClientCertificateEmail for AlternativeAuthenticationNameSource.
     */
    public static final AlternativeAuthenticationNameSource CLIENT_CERTIFICATE_EMAIL
        = fromString("ClientCertificateEmail");

    /**
     * Creates a new instance of AlternativeAuthenticationNameSource value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AlternativeAuthenticationNameSource() {
    }

    /**
     * Creates or finds a AlternativeAuthenticationNameSource from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AlternativeAuthenticationNameSource.
     */
    @JsonCreator
    public static AlternativeAuthenticationNameSource fromString(String name) {
        return fromString(name, AlternativeAuthenticationNameSource.class);
    }

    /**
     * Gets known AlternativeAuthenticationNameSource values.
     * 
     * @return known AlternativeAuthenticationNameSource values.
     */
    public static Collection<AlternativeAuthenticationNameSource> values() {
        return values(AlternativeAuthenticationNameSource.class);
    }
}
