// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.PermissionInner;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleDefinitionInner;
import com.azure.resourcemanager.authorization.generated.models.Permission;
import com.azure.resourcemanager.authorization.generated.models.RoleDefinition;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class RoleDefinitionImpl implements RoleDefinition, RoleDefinition.Definition, RoleDefinition.Update {
    private RoleDefinitionInner innerObject;

    private final com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String roleName() {
        return this.innerModel().roleName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String roleType() {
        return this.innerModel().roleType();
    }

    public List<Permission> permissions() {
        List<PermissionInner> inner = this.innerModel().permissions();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new PermissionImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> assignableScopes() {
        List<String> inner = this.innerModel().assignableScopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public RoleDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.authorization.generated.AuthorizationManager manager() {
        return this.serviceManager;
    }

    private String scope;

    private String roleDefinitionId;

    public RoleDefinitionImpl withExistingScope(String scope) {
        this.scope = scope;
        return this;
    }

    public RoleDefinition create() {
        this.innerObject = serviceManager.serviceClient().getRoleDefinitions()
            .createOrUpdateWithResponse(scope, roleDefinitionId, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public RoleDefinition create(Context context) {
        this.innerObject = serviceManager.serviceClient().getRoleDefinitions()
            .createOrUpdateWithResponse(scope, roleDefinitionId, this.innerModel(), context).getValue();
        return this;
    }

    RoleDefinitionImpl(String name,
        com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager) {
        this.innerObject = new RoleDefinitionInner();
        this.serviceManager = serviceManager;
        this.roleDefinitionId = name;
    }

    public RoleDefinitionImpl update() {
        return this;
    }

    public RoleDefinition apply() {
        this.innerObject = serviceManager.serviceClient().getRoleDefinitions()
            .createOrUpdateWithResponse(scope, roleDefinitionId, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public RoleDefinition apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getRoleDefinitions()
            .createOrUpdateWithResponse(scope, roleDefinitionId, this.innerModel(), context).getValue();
        return this;
    }

    RoleDefinitionImpl(RoleDefinitionInner innerObject,
        com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.scope = Utils.getValueFromIdByParameterName(innerObject.id(),
            "/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId}", "scope");
        this.roleDefinitionId = Utils.getValueFromIdByParameterName(innerObject.id(),
            "/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId}", "roleDefinitionId");
    }

    public RoleDefinition refresh() {
        this.innerObject = serviceManager.serviceClient().getRoleDefinitions()
            .getWithResponse(scope, roleDefinitionId, Context.NONE).getValue();
        return this;
    }

    public RoleDefinition refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getRoleDefinitions()
            .getWithResponse(scope, roleDefinitionId, context).getValue();
        return this;
    }

    public RoleDefinitionImpl withRoleName(String roleName) {
        this.innerModel().withRoleName(roleName);
        return this;
    }

    public RoleDefinitionImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public RoleDefinitionImpl withRoleType(String roleType) {
        this.innerModel().withRoleType(roleType);
        return this;
    }

    public RoleDefinitionImpl withPermissions(List<PermissionInner> permissions) {
        this.innerModel().withPermissions(permissions);
        return this;
    }

    public RoleDefinitionImpl withAssignableScopes(List<String> assignableScopes) {
        this.innerModel().withAssignableScopes(assignableScopes);
        return this;
    }
}
