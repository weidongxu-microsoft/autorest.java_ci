// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The reason for the restriction. As of now this can be "QuotaId" or "NotAvailableForSubscription". Quota Id is set
 * when the SKU has requiredQuotas parameter as the subscription does not belong to that quota. The
 * "NotAvailableForSubscription" is related to capacity at DC.
 */
public final class ReasonCode extends ExpandableStringEnum<ReasonCode> {
    /**
     * Static value QuotaId for ReasonCode.
     */
    public static final ReasonCode QUOTA_ID = fromString("QuotaId");

    /**
     * Static value NotAvailableForSubscription for ReasonCode.
     */
    public static final ReasonCode NOT_AVAILABLE_FOR_SUBSCRIPTION = fromString("NotAvailableForSubscription");

    /**
     * Creates a new instance of ReasonCode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReasonCode() {
    }

    /**
     * Creates or finds a ReasonCode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ReasonCode.
     */
    @JsonCreator
    public static ReasonCode fromString(String name) {
        return fromString(name, ReasonCode.class);
    }

    /**
     * Gets known ReasonCode values.
     * 
     * @return known ReasonCode values.
     */
    public static Collection<ReasonCode> values() {
        return values(ReasonCode.class);
    }
}
