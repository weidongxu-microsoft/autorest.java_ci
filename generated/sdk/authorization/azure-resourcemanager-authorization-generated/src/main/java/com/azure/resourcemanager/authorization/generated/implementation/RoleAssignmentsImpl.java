// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.fluent.RoleAssignmentsClient;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleAssignmentInner;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignment;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentCreateParameters;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignments;

public final class RoleAssignmentsImpl implements RoleAssignments {
    private static final ClientLogger LOGGER = new ClientLogger(RoleAssignmentsImpl.class);

    private final RoleAssignmentsClient innerClient;

    private final com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager;

    public RoleAssignmentsImpl(
        RoleAssignmentsClient innerClient,
        com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RoleAssignment> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName) {
        PagedIterable<RoleAssignmentInner> inner =
            this
                .serviceClient()
                .listForResource(
                    resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName);
        return Utils.mapPage(inner, inner1 -> new RoleAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<RoleAssignment> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String filter,
        Context context) {
        PagedIterable<RoleAssignmentInner> inner =
            this
                .serviceClient()
                .listForResource(
                    resourceGroupName,
                    resourceProviderNamespace,
                    parentResourcePath,
                    resourceType,
                    resourceName,
                    filter,
                    context);
        return Utils.mapPage(inner, inner1 -> new RoleAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<RoleAssignment> listByResourceGroup(String resourceGroupName) {
        PagedIterable<RoleAssignmentInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new RoleAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<RoleAssignment> listByResourceGroup(String resourceGroupName, String filter, Context context) {
        PagedIterable<RoleAssignmentInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, context);
        return Utils.mapPage(inner, inner1 -> new RoleAssignmentImpl(inner1, this.manager()));
    }

    public RoleAssignment deleteByResourceGroup(String scope, String roleAssignmentName) {
        RoleAssignmentInner inner = this.serviceClient().delete(scope, roleAssignmentName);
        if (inner != null) {
            return new RoleAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleAssignment> deleteWithResponse(String scope, String roleAssignmentName, Context context) {
        Response<RoleAssignmentInner> inner =
            this.serviceClient().deleteWithResponse(scope, roleAssignmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RoleAssignment get(String scope, String roleAssignmentName) {
        RoleAssignmentInner inner = this.serviceClient().get(scope, roleAssignmentName);
        if (inner != null) {
            return new RoleAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleAssignment> getWithResponse(String scope, String roleAssignmentName, Context context) {
        Response<RoleAssignmentInner> inner = this.serviceClient().getWithResponse(scope, roleAssignmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RoleAssignment deleteById(String roleId) {
        RoleAssignmentInner inner = this.serviceClient().deleteById(roleId);
        if (inner != null) {
            return new RoleAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleAssignment> deleteByIdWithResponse(String roleId, Context context) {
        Response<RoleAssignmentInner> inner = this.serviceClient().deleteByIdWithResponse(roleId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RoleAssignment createById(String roleId, RoleAssignmentCreateParameters parameters) {
        RoleAssignmentInner inner = this.serviceClient().createById(roleId, parameters);
        if (inner != null) {
            return new RoleAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleAssignment> createByIdWithResponse(
        String roleId, RoleAssignmentCreateParameters parameters, Context context) {
        Response<RoleAssignmentInner> inner = this.serviceClient().createByIdWithResponse(roleId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RoleAssignment getById(String roleId) {
        RoleAssignmentInner inner = this.serviceClient().getById(roleId);
        if (inner != null) {
            return new RoleAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleAssignment> getByIdWithResponse(String roleId, Context context) {
        Response<RoleAssignmentInner> inner = this.serviceClient().getByIdWithResponse(roleId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<RoleAssignment> list() {
        PagedIterable<RoleAssignmentInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new RoleAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<RoleAssignment> list(String filter, Context context) {
        PagedIterable<RoleAssignmentInner> inner = this.serviceClient().list(filter, context);
        return Utils.mapPage(inner, inner1 -> new RoleAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<RoleAssignment> listForScope(String scope) {
        PagedIterable<RoleAssignmentInner> inner = this.serviceClient().listForScope(scope);
        return Utils.mapPage(inner, inner1 -> new RoleAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<RoleAssignment> listForScope(String scope, String filter, Context context) {
        PagedIterable<RoleAssignmentInner> inner = this.serviceClient().listForScope(scope, filter, context);
        return Utils.mapPage(inner, inner1 -> new RoleAssignmentImpl(inner1, this.manager()));
    }

    private RoleAssignmentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.authorization.generated.AuthorizationManager manager() {
        return this.serviceManager;
    }

    public RoleAssignmentImpl define(String name) {
        return new RoleAssignmentImpl(name, this.manager());
    }
}
