// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policy.generated.fluent.DataPolicyManifestsClient;
import com.azure.resourcemanager.policy.generated.fluent.models.DataPolicyManifestInner;
import com.azure.resourcemanager.policy.generated.models.DataPolicyManifest;
import com.azure.resourcemanager.policy.generated.models.DataPolicyManifests;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DataPolicyManifestsImpl implements DataPolicyManifests {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataPolicyManifestsImpl.class);

    private final DataPolicyManifestsClient innerClient;

    private final com.azure.resourcemanager.policy.generated.PolicyManager serviceManager;

    public DataPolicyManifestsImpl(
        DataPolicyManifestsClient innerClient,
        com.azure.resourcemanager.policy.generated.PolicyManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DataPolicyManifest getByPolicyMode(String policyMode) {
        DataPolicyManifestInner inner = this.serviceClient().getByPolicyMode(policyMode);
        if (inner != null) {
            return new DataPolicyManifestImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataPolicyManifest> getByPolicyModeWithResponse(String policyMode, Context context) {
        Response<DataPolicyManifestInner> inner = this.serviceClient().getByPolicyModeWithResponse(policyMode, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataPolicyManifestImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DataPolicyManifest> list() {
        PagedIterable<DataPolicyManifestInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DataPolicyManifestImpl(inner1, this.manager()));
    }

    public PagedIterable<DataPolicyManifest> list(String filter, Context context) {
        PagedIterable<DataPolicyManifestInner> inner = this.serviceClient().list(filter, context);
        return Utils.mapPage(inner, inner1 -> new DataPolicyManifestImpl(inner1, this.manager()));
    }

    private DataPolicyManifestsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.policy.generated.PolicyManager manager() {
        return this.serviceManager;
    }
}
