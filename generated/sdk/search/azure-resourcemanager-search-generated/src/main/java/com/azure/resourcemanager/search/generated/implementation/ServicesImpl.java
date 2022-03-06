// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.search.generated.fluent.ServicesClient;
import com.azure.resourcemanager.search.generated.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.search.generated.fluent.models.SearchServiceInner;
import com.azure.resourcemanager.search.generated.models.CheckNameAvailabilityInput;
import com.azure.resourcemanager.search.generated.models.CheckNameAvailabilityOutput;
import com.azure.resourcemanager.search.generated.models.SearchService;
import com.azure.resourcemanager.search.generated.models.Services;
import java.util.UUID;

public final class ServicesImpl implements Services {
    private static final ClientLogger LOGGER = new ClientLogger(ServicesImpl.class);

    private final ServicesClient innerClient;

    private final com.azure.resourcemanager.search.generated.SearchManager serviceManager;

    public ServicesImpl(
        ServicesClient innerClient, com.azure.resourcemanager.search.generated.SearchManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public SearchService getByResourceGroup(String resourceGroupName, String searchServiceName) {
        SearchServiceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, searchServiceName);
        if (inner != null) {
            return new SearchServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SearchService> getByResourceGroupWithResponse(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context) {
        Response<SearchServiceInner> inner =
            this
                .serviceClient()
                .getByResourceGroupWithResponse(resourceGroupName, searchServiceName, clientRequestId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SearchServiceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String searchServiceName) {
        this.serviceClient().delete(resourceGroupName, searchServiceName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, searchServiceName, clientRequestId, context);
    }

    public PagedIterable<SearchService> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SearchServiceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new SearchServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<SearchService> listByResourceGroup(
        String resourceGroupName, UUID clientRequestId, Context context) {
        PagedIterable<SearchServiceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, clientRequestId, context);
        return Utils.mapPage(inner, inner1 -> new SearchServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<SearchService> list() {
        PagedIterable<SearchServiceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SearchServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<SearchService> list(UUID clientRequestId, Context context) {
        PagedIterable<SearchServiceInner> inner = this.serviceClient().list(clientRequestId, context);
        return Utils.mapPage(inner, inner1 -> new SearchServiceImpl(inner1, this.manager()));
    }

    public CheckNameAvailabilityOutput checkNameAvailability(CheckNameAvailabilityInput checkNameAvailabilityInput) {
        CheckNameAvailabilityOutputInner inner = this.serviceClient().checkNameAvailability(checkNameAvailabilityInput);
        if (inner != null) {
            return new CheckNameAvailabilityOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityOutput> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityInput checkNameAvailabilityInput, UUID clientRequestId, Context context) {
        Response<CheckNameAvailabilityOutputInner> inner =
            this
                .serviceClient()
                .checkNameAvailabilityWithResponse(checkNameAvailabilityInput, clientRequestId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityOutputImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SearchService getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String searchServiceName = Utils.getValueFromIdByName(id, "searchServices");
        if (searchServiceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'searchServices'.", id)));
        }
        UUID localClientRequestId = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, searchServiceName, localClientRequestId, Context.NONE)
            .getValue();
    }

    public Response<SearchService> getByIdWithResponse(String id, UUID clientRequestId, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String searchServiceName = Utils.getValueFromIdByName(id, "searchServices");
        if (searchServiceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'searchServices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, searchServiceName, clientRequestId, context);
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
        String searchServiceName = Utils.getValueFromIdByName(id, "searchServices");
        if (searchServiceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'searchServices'.", id)));
        }
        UUID localClientRequestId = null;
        this.deleteWithResponse(resourceGroupName, searchServiceName, localClientRequestId, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, UUID clientRequestId, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String searchServiceName = Utils.getValueFromIdByName(id, "searchServices");
        if (searchServiceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'searchServices'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, searchServiceName, clientRequestId, context);
    }

    private ServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.search.generated.SearchManager manager() {
        return this.serviceManager;
    }

    public SearchServiceImpl define(String name) {
        return new SearchServiceImpl(name, this.manager());
    }
}
