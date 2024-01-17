// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policy.generated.fluent.PolicyDefinitionsClient;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicyDefinitionInner;
import com.azure.resourcemanager.policy.generated.models.PolicyDefinition;
import com.azure.resourcemanager.policy.generated.models.PolicyDefinitions;

public final class PolicyDefinitionsImpl implements PolicyDefinitions {
    private static final ClientLogger LOGGER = new ClientLogger(PolicyDefinitionsImpl.class);

    private final PolicyDefinitionsClient innerClient;

    private final com.azure.resourcemanager.policy.generated.PolicyManager serviceManager;

    public PolicyDefinitionsImpl(PolicyDefinitionsClient innerClient,
        com.azure.resourcemanager.policy.generated.PolicyManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Void> deleteWithResponse(String policyDefinitionName, Context context) {
        return this.serviceClient().deleteWithResponse(policyDefinitionName, context);
    }

    public void delete(String policyDefinitionName) {
        this.serviceClient().delete(policyDefinitionName);
    }

    public Response<PolicyDefinition> getWithResponse(String policyDefinitionName, Context context) {
        Response<PolicyDefinitionInner> inner = this.serviceClient().getWithResponse(policyDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PolicyDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicyDefinition get(String policyDefinitionName) {
        PolicyDefinitionInner inner = this.serviceClient().get(policyDefinitionName);
        if (inner != null) {
            return new PolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyDefinition> getBuiltInWithResponse(String policyDefinitionName, Context context) {
        Response<PolicyDefinitionInner> inner
            = this.serviceClient().getBuiltInWithResponse(policyDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PolicyDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicyDefinition getBuiltIn(String policyDefinitionName) {
        PolicyDefinitionInner inner = this.serviceClient().getBuiltIn(policyDefinitionName);
        if (inner != null) {
            return new PolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyDefinition> createOrUpdateAtManagementGroupWithResponse(String policyDefinitionName,
        String managementGroupId, PolicyDefinitionInner parameters, Context context) {
        Response<PolicyDefinitionInner> inner = this.serviceClient()
            .createOrUpdateAtManagementGroupWithResponse(policyDefinitionName, managementGroupId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PolicyDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicyDefinition createOrUpdateAtManagementGroup(String policyDefinitionName, String managementGroupId,
        PolicyDefinitionInner parameters) {
        PolicyDefinitionInner inner
            = this.serviceClient().createOrUpdateAtManagementGroup(policyDefinitionName, managementGroupId, parameters);
        if (inner != null) {
            return new PolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteAtManagementGroupWithResponse(String policyDefinitionName, String managementGroupId,
        Context context) {
        return this.serviceClient().deleteAtManagementGroupWithResponse(policyDefinitionName, managementGroupId,
            context);
    }

    public void deleteAtManagementGroup(String policyDefinitionName, String managementGroupId) {
        this.serviceClient().deleteAtManagementGroup(policyDefinitionName, managementGroupId);
    }

    public Response<PolicyDefinition> getAtManagementGroupWithResponse(String policyDefinitionName,
        String managementGroupId, Context context) {
        Response<PolicyDefinitionInner> inner
            = this.serviceClient().getAtManagementGroupWithResponse(policyDefinitionName, managementGroupId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PolicyDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicyDefinition getAtManagementGroup(String policyDefinitionName, String managementGroupId) {
        PolicyDefinitionInner inner
            = this.serviceClient().getAtManagementGroup(policyDefinitionName, managementGroupId);
        if (inner != null) {
            return new PolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PolicyDefinition> list() {
        PagedIterable<PolicyDefinitionInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PolicyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyDefinition> list(String filter, Integer top, Context context) {
        PagedIterable<PolicyDefinitionInner> inner = this.serviceClient().list(filter, top, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PolicyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyDefinition> listBuiltIn() {
        PagedIterable<PolicyDefinitionInner> inner = this.serviceClient().listBuiltIn();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PolicyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyDefinition> listBuiltIn(String filter, Integer top, Context context) {
        PagedIterable<PolicyDefinitionInner> inner = this.serviceClient().listBuiltIn(filter, top, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PolicyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyDefinition> listByManagementGroup(String managementGroupId) {
        PagedIterable<PolicyDefinitionInner> inner = this.serviceClient().listByManagementGroup(managementGroupId);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PolicyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyDefinition> listByManagementGroup(String managementGroupId, String filter, Integer top,
        Context context) {
        PagedIterable<PolicyDefinitionInner> inner
            = this.serviceClient().listByManagementGroup(managementGroupId, filter, top, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PolicyDefinitionImpl(inner1, this.manager()));
    }

    public PolicyDefinition getById(String id) {
        String policyDefinitionName = ResourceManagerUtils.getValueFromIdByName(id, "policyDefinitions");
        if (policyDefinitionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'policyDefinitions'.", id)));
        }
        return this.getWithResponse(policyDefinitionName, Context.NONE).getValue();
    }

    public Response<PolicyDefinition> getByIdWithResponse(String id, Context context) {
        String policyDefinitionName = ResourceManagerUtils.getValueFromIdByName(id, "policyDefinitions");
        if (policyDefinitionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'policyDefinitions'.", id)));
        }
        return this.getWithResponse(policyDefinitionName, context);
    }

    public void deleteById(String id) {
        String policyDefinitionName = ResourceManagerUtils.getValueFromIdByName(id, "policyDefinitions");
        if (policyDefinitionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'policyDefinitions'.", id)));
        }
        this.deleteWithResponse(policyDefinitionName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String policyDefinitionName = ResourceManagerUtils.getValueFromIdByName(id, "policyDefinitions");
        if (policyDefinitionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'policyDefinitions'.", id)));
        }
        return this.deleteWithResponse(policyDefinitionName, context);
    }

    private PolicyDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.policy.generated.PolicyManager manager() {
        return this.serviceManager;
    }

    public PolicyDefinitionImpl define(String name) {
        return new PolicyDefinitionImpl(name, this.manager());
    }
}
