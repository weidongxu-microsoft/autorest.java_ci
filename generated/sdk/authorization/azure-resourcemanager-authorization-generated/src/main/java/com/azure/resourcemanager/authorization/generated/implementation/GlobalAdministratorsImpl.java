// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.fluent.GlobalAdministratorsClient;
import com.azure.resourcemanager.authorization.generated.models.GlobalAdministrators;

public final class GlobalAdministratorsImpl implements GlobalAdministrators {
    private static final ClientLogger LOGGER = new ClientLogger(GlobalAdministratorsImpl.class);

    private final GlobalAdministratorsClient innerClient;

    private final com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager;

    public GlobalAdministratorsImpl(
        GlobalAdministratorsClient innerClient,
        com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Void> elevateAccessWithResponse(Context context) {
        return this.serviceClient().elevateAccessWithResponse(context);
    }

    public void elevateAccess() {
        this.serviceClient().elevateAccess();
    }

    private GlobalAdministratorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.authorization.generated.AuthorizationManager manager() {
        return this.serviceManager;
    }
}
