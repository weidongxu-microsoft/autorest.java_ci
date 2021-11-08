// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.fluent.models.ReservationTransactionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** Legacy Reservation transaction resource. */
@Immutable
public final class LegacyReservationTransaction extends ReservationTransactionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LegacyReservationTransaction.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
