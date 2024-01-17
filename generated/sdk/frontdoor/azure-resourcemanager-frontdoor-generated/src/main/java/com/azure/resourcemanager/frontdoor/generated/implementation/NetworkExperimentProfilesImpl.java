// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.generated.fluent.NetworkExperimentProfilesClient;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.ProfileInner;
import com.azure.resourcemanager.frontdoor.generated.models.NetworkExperimentProfiles;
import com.azure.resourcemanager.frontdoor.generated.models.Profile;

public final class NetworkExperimentProfilesImpl implements NetworkExperimentProfiles {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkExperimentProfilesImpl.class);

    private final NetworkExperimentProfilesClient innerClient;

    private final com.azure.resourcemanager.frontdoor.generated.FrontDoorManager serviceManager;

    public NetworkExperimentProfilesImpl(NetworkExperimentProfilesClient innerClient,
        com.azure.resourcemanager.frontdoor.generated.FrontDoorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Profile> list() {
        PagedIterable<ProfileInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProfileImpl(inner1, this.manager()));
    }

    public PagedIterable<Profile> list(Context context) {
        PagedIterable<ProfileInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProfileImpl(inner1, this.manager()));
    }

    public PagedIterable<Profile> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ProfileInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProfileImpl(inner1, this.manager()));
    }

    public PagedIterable<Profile> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ProfileInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProfileImpl(inner1, this.manager()));
    }

    public Response<Profile> getByResourceGroupWithResponse(String resourceGroupName, String profileName,
        Context context) {
        Response<ProfileInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, profileName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ProfileImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Profile getByResourceGroup(String resourceGroupName, String profileName) {
        ProfileInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, profileName);
        if (inner != null) {
            return new ProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String profileName) {
        this.serviceClient().delete(resourceGroupName, profileName);
    }

    public void delete(String resourceGroupName, String profileName, Context context) {
        this.serviceClient().delete(resourceGroupName, profileName, context);
    }

    public Profile getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = ResourceManagerUtils.getValueFromIdByName(id, "NetworkExperimentProfiles");
        if (profileName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'NetworkExperimentProfiles'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, profileName, Context.NONE).getValue();
    }

    public Response<Profile> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = ResourceManagerUtils.getValueFromIdByName(id, "NetworkExperimentProfiles");
        if (profileName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'NetworkExperimentProfiles'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, profileName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = ResourceManagerUtils.getValueFromIdByName(id, "NetworkExperimentProfiles");
        if (profileName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'NetworkExperimentProfiles'.", id)));
        }
        this.delete(resourceGroupName, profileName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = ResourceManagerUtils.getValueFromIdByName(id, "NetworkExperimentProfiles");
        if (profileName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'NetworkExperimentProfiles'.", id)));
        }
        this.delete(resourceGroupName, profileName, context);
    }

    private NetworkExperimentProfilesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.frontdoor.generated.FrontDoorManager manager() {
        return this.serviceManager;
    }

    public ProfileImpl define(String name) {
        return new ProfileImpl(name, this.manager());
    }
}
