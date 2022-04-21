// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DomainPropertiesDomainNotRenewableReasonsItem. */
public final class DomainPropertiesDomainNotRenewableReasonsItem
    extends ExpandableStringEnum<DomainPropertiesDomainNotRenewableReasonsItem> {
    /** Static value RegistrationStatusNotSupportedForRenewal for DomainPropertiesDomainNotRenewableReasonsItem. */
    public static final DomainPropertiesDomainNotRenewableReasonsItem REGISTRATION_STATUS_NOT_SUPPORTED_FOR_RENEWAL =
        fromString("RegistrationStatusNotSupportedForRenewal");

    /** Static value ExpirationNotInRenewalTimeRange for DomainPropertiesDomainNotRenewableReasonsItem. */
    public static final DomainPropertiesDomainNotRenewableReasonsItem EXPIRATION_NOT_IN_RENEWAL_TIME_RANGE =
        fromString("ExpirationNotInRenewalTimeRange");

    /** Static value SubscriptionNotActive for DomainPropertiesDomainNotRenewableReasonsItem. */
    public static final DomainPropertiesDomainNotRenewableReasonsItem SUBSCRIPTION_NOT_ACTIVE =
        fromString("SubscriptionNotActive");

    /**
     * Creates or finds a DomainPropertiesDomainNotRenewableReasonsItem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DomainPropertiesDomainNotRenewableReasonsItem.
     */
    @JsonCreator
    public static DomainPropertiesDomainNotRenewableReasonsItem fromString(String name) {
        return fromString(name, DomainPropertiesDomainNotRenewableReasonsItem.class);
    }

    /**
     * Gets known DomainPropertiesDomainNotRenewableReasonsItem values.
     *
     * @return known DomainPropertiesDomainNotRenewableReasonsItem values.
     */
    public static Collection<DomainPropertiesDomainNotRenewableReasonsItem> values() {
        return values(DomainPropertiesDomainNotRenewableReasonsItem.class);
    }
}
