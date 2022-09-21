// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policy.generated.fluent.PolicySetDefinitionsClient;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicySetDefinitionInner;
import com.azure.resourcemanager.policy.generated.models.PolicySetDefinition;
import com.azure.resourcemanager.policy.generated.models.PolicySetDefinitions;

public final class PolicySetDefinitionsImpl implements PolicySetDefinitions {
    private static final ClientLogger LOGGER = new ClientLogger(PolicySetDefinitionsImpl.class);

    private final PolicySetDefinitionsClient innerClient;

    private final com.azure.resourcemanager.policy.generated.PolicyManager serviceManager;

    public PolicySetDefinitionsImpl(
        PolicySetDefinitionsClient innerClient,
        com.azure.resourcemanager.policy.generated.PolicyManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Void> deleteWithResponse(String policySetDefinitionName, Context context) {
        return this.serviceClient().deleteWithResponse(policySetDefinitionName, context);
    }

    public void delete(String policySetDefinitionName) {
        this.serviceClient().delete(policySetDefinitionName);
    }

    public Response<PolicySetDefinition> getWithResponse(String policySetDefinitionName, Context context) {
        Response<PolicySetDefinitionInner> inner =
            this.serviceClient().getWithResponse(policySetDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicySetDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicySetDefinition get(String policySetDefinitionName) {
        PolicySetDefinitionInner inner = this.serviceClient().get(policySetDefinitionName);
        if (inner != null) {
            return new PolicySetDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicySetDefinition> getBuiltInWithResponse(String policySetDefinitionName, Context context) {
        Response<PolicySetDefinitionInner> inner =
            this.serviceClient().getBuiltInWithResponse(policySetDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicySetDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicySetDefinition getBuiltIn(String policySetDefinitionName) {
        PolicySetDefinitionInner inner = this.serviceClient().getBuiltIn(policySetDefinitionName);
        if (inner != null) {
            return new PolicySetDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PolicySetDefinition> list() {
        PagedIterable<PolicySetDefinitionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PolicySetDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicySetDefinition> list(String filter, Integer top, Context context) {
        PagedIterable<PolicySetDefinitionInner> inner = this.serviceClient().list(filter, top, context);
        return Utils.mapPage(inner, inner1 -> new PolicySetDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicySetDefinition> listBuiltIn() {
        PagedIterable<PolicySetDefinitionInner> inner = this.serviceClient().listBuiltIn();
        return Utils.mapPage(inner, inner1 -> new PolicySetDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicySetDefinition> listBuiltIn(String filter, Integer top, Context context) {
        PagedIterable<PolicySetDefinitionInner> inner = this.serviceClient().listBuiltIn(filter, top, context);
        return Utils.mapPage(inner, inner1 -> new PolicySetDefinitionImpl(inner1, this.manager()));
    }

    public Response<PolicySetDefinition> createOrUpdateAtManagementGroupWithResponse(
        String policySetDefinitionName,
        String managementGroupId,
        PolicySetDefinitionInner parameters,
        Context context) {
        Response<PolicySetDefinitionInner> inner =
            this
                .serviceClient()
                .createOrUpdateAtManagementGroupWithResponse(
                    policySetDefinitionName, managementGroupId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicySetDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicySetDefinition createOrUpdateAtManagementGroup(
        String policySetDefinitionName, String managementGroupId, PolicySetDefinitionInner parameters) {
        PolicySetDefinitionInner inner =
            this
                .serviceClient()
                .createOrUpdateAtManagementGroup(policySetDefinitionName, managementGroupId, parameters);
        if (inner != null) {
            return new PolicySetDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteAtManagementGroupWithResponse(
        String policySetDefinitionName, String managementGroupId, Context context) {
        return this
            .serviceClient()
            .deleteAtManagementGroupWithResponse(policySetDefinitionName, managementGroupId, context);
    }

    public void deleteAtManagementGroup(String policySetDefinitionName, String managementGroupId) {
        this.serviceClient().deleteAtManagementGroup(policySetDefinitionName, managementGroupId);
    }

    public Response<PolicySetDefinition> getAtManagementGroupWithResponse(
        String policySetDefinitionName, String managementGroupId, Context context) {
        Response<PolicySetDefinitionInner> inner =
            this.serviceClient().getAtManagementGroupWithResponse(policySetDefinitionName, managementGroupId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicySetDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicySetDefinition getAtManagementGroup(String policySetDefinitionName, String managementGroupId) {
        PolicySetDefinitionInner inner =
            this.serviceClient().getAtManagementGroup(policySetDefinitionName, managementGroupId);
        if (inner != null) {
            return new PolicySetDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PolicySetDefinition> listByManagementGroup(String managementGroupId) {
        PagedIterable<PolicySetDefinitionInner> inner = this.serviceClient().listByManagementGroup(managementGroupId);
        return Utils.mapPage(inner, inner1 -> new PolicySetDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicySetDefinition> listByManagementGroup(
        String managementGroupId, String filter, Integer top, Context context) {
        PagedIterable<PolicySetDefinitionInner> inner =
            this.serviceClient().listByManagementGroup(managementGroupId, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new PolicySetDefinitionImpl(inner1, this.manager()));
    }

    public PolicySetDefinition getById(String id) {
        String policySetDefinitionName = Utils.getValueFromIdByName(id, "policySetDefinitions");
        if (policySetDefinitionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'policySetDefinitions'.",
                                id)));
        }
        return this.getWithResponse(policySetDefinitionName, Context.NONE).getValue();
    }

    public Response<PolicySetDefinition> getByIdWithResponse(String id, Context context) {
        String policySetDefinitionName = Utils.getValueFromIdByName(id, "policySetDefinitions");
        if (policySetDefinitionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'policySetDefinitions'.",
                                id)));
        }
        return this.getWithResponse(policySetDefinitionName, context);
    }

    public void deleteById(String id) {
        String policySetDefinitionName = Utils.getValueFromIdByName(id, "policySetDefinitions");
        if (policySetDefinitionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'policySetDefinitions'.",
                                id)));
        }
        this.deleteWithResponse(policySetDefinitionName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String policySetDefinitionName = Utils.getValueFromIdByName(id, "policySetDefinitions");
        if (policySetDefinitionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'policySetDefinitions'.",
                                id)));
        }
        return this.deleteWithResponse(policySetDefinitionName, context);
    }

    private PolicySetDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.policy.generated.PolicyManager manager() {
        return this.serviceManager;
    }

    public PolicySetDefinitionImpl define(String name) {
        return new PolicySetDefinitionImpl(name, this.manager());
    }
}
