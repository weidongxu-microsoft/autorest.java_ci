// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.UserInner;
import com.azure.resourcemanager.databoxedge.generated.models.AsymmetricEncryptedSecret;
import com.azure.resourcemanager.databoxedge.generated.models.ShareAccessRight;
import com.azure.resourcemanager.databoxedge.generated.models.User;
import com.azure.resourcemanager.databoxedge.generated.models.UserType;
import java.util.Collections;
import java.util.List;

public final class UserImpl implements User, User.Definition, User.Update {
    private UserInner innerObject;

    private final com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public AsymmetricEncryptedSecret encryptedPassword() {
        return this.innerModel().encryptedPassword();
    }

    public List<ShareAccessRight> shareAccessRights() {
        List<ShareAccessRight> inner = this.innerModel().shareAccessRights();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public UserType userType() {
        return this.innerModel().userType();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public UserInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    private String deviceName;

    private String name;

    private String resourceGroupName;

    public UserImpl withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        this.deviceName = deviceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public User create() {
        this.innerObject = serviceManager.serviceClient().getUsers().createOrUpdate(deviceName, name, resourceGroupName,
            this.innerModel(), Context.NONE);
        return this;
    }

    public User create(Context context) {
        this.innerObject = serviceManager.serviceClient().getUsers().createOrUpdate(deviceName, name, resourceGroupName,
            this.innerModel(), context);
        return this;
    }

    UserImpl(String name, com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
        this.innerObject = new UserInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public UserImpl update() {
        return this;
    }

    public User apply() {
        this.innerObject = serviceManager.serviceClient().getUsers().createOrUpdate(deviceName, name, resourceGroupName,
            this.innerModel(), Context.NONE);
        return this;
    }

    public User apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getUsers().createOrUpdate(deviceName, name, resourceGroupName,
            this.innerModel(), context);
        return this;
    }

    UserImpl(UserInner innerObject, com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.deviceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "dataBoxEdgeDevices");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "users");
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public User refresh() {
        this.innerObject = serviceManager.serviceClient().getUsers()
            .getWithResponse(deviceName, name, resourceGroupName, Context.NONE).getValue();
        return this;
    }

    public User refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getUsers()
            .getWithResponse(deviceName, name, resourceGroupName, context).getValue();
        return this;
    }

    public UserImpl withUserType(UserType userType) {
        this.innerModel().withUserType(userType);
        return this;
    }

    public UserImpl withEncryptedPassword(AsymmetricEncryptedSecret encryptedPassword) {
        this.innerModel().withEncryptedPassword(encryptedPassword);
        return this;
    }
}
