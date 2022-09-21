// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.generated.fluent.PartnerRegistrationsClient;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerRegistrationInner;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerRegistration;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerRegistrations;

public final class PartnerRegistrationsImpl implements PartnerRegistrations {
    private static final ClientLogger LOGGER = new ClientLogger(PartnerRegistrationsImpl.class);

    private final PartnerRegistrationsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    public PartnerRegistrationsImpl(
        PartnerRegistrationsClient innerClient,
        com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<PartnerRegistration> getByResourceGroupWithResponse(
        String resourceGroupName, String partnerRegistrationName, Context context) {
        Response<PartnerRegistrationInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, partnerRegistrationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PartnerRegistrationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PartnerRegistration getByResourceGroup(String resourceGroupName, String partnerRegistrationName) {
        PartnerRegistrationInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, partnerRegistrationName);
        if (inner != null) {
            return new PartnerRegistrationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String partnerRegistrationName) {
        this.serviceClient().delete(resourceGroupName, partnerRegistrationName);
    }

    public void delete(String resourceGroupName, String partnerRegistrationName, Context context) {
        this.serviceClient().delete(resourceGroupName, partnerRegistrationName, context);
    }

    public PagedIterable<PartnerRegistration> list() {
        PagedIterable<PartnerRegistrationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PartnerRegistrationImpl(inner1, this.manager()));
    }

    public PagedIterable<PartnerRegistration> list(String filter, Integer top, Context context) {
        PagedIterable<PartnerRegistrationInner> inner = this.serviceClient().list(filter, top, context);
        return Utils.mapPage(inner, inner1 -> new PartnerRegistrationImpl(inner1, this.manager()));
    }

    public PagedIterable<PartnerRegistration> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PartnerRegistrationInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PartnerRegistrationImpl(inner1, this.manager()));
    }

    public PagedIterable<PartnerRegistration> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context) {
        PagedIterable<PartnerRegistrationInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new PartnerRegistrationImpl(inner1, this.manager()));
    }

    public PartnerRegistration getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerRegistrationName = Utils.getValueFromIdByName(id, "partnerRegistrations");
        if (partnerRegistrationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerRegistrations'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, partnerRegistrationName, Context.NONE).getValue();
    }

    public Response<PartnerRegistration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerRegistrationName = Utils.getValueFromIdByName(id, "partnerRegistrations");
        if (partnerRegistrationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerRegistrations'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, partnerRegistrationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerRegistrationName = Utils.getValueFromIdByName(id, "partnerRegistrations");
        if (partnerRegistrationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerRegistrations'.",
                                id)));
        }
        this.delete(resourceGroupName, partnerRegistrationName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerRegistrationName = Utils.getValueFromIdByName(id, "partnerRegistrations");
        if (partnerRegistrationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerRegistrations'.",
                                id)));
        }
        this.delete(resourceGroupName, partnerRegistrationName, context);
    }

    private PartnerRegistrationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }

    public PartnerRegistrationImpl define(String name) {
        return new PartnerRegistrationImpl(name, this.manager());
    }
}
