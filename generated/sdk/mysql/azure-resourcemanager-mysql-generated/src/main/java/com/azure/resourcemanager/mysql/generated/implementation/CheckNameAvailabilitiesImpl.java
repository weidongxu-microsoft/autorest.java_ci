// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.generated.fluent.CheckNameAvailabilitiesClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.mysql.generated.models.CheckNameAvailabilities;
import com.azure.resourcemanager.mysql.generated.models.NameAvailability;
import com.azure.resourcemanager.mysql.generated.models.NameAvailabilityRequest;

public final class CheckNameAvailabilitiesImpl implements CheckNameAvailabilities {
    private static final ClientLogger LOGGER = new ClientLogger(CheckNameAvailabilitiesImpl.class);

    private final CheckNameAvailabilitiesClient innerClient;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    public CheckNameAvailabilitiesImpl(
        CheckNameAvailabilitiesClient innerClient,
        com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NameAvailability> executeWithResponse(
        NameAvailabilityRequest nameAvailabilityRequest, Context context) {
        Response<NameAvailabilityInner> inner =
            this.serviceClient().executeWithResponse(nameAvailabilityRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NameAvailabilityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NameAvailability execute(NameAvailabilityRequest nameAvailabilityRequest) {
        NameAvailabilityInner inner = this.serviceClient().execute(nameAvailabilityRequest);
        if (inner != null) {
            return new NameAvailabilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private CheckNameAvailabilitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}
