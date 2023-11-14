// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.generated.fluent.models.ManagedHsmKeyInner;
import com.azure.resourcemanager.keyvault.generated.fluent.models.ManagedHsmKeyProperties;
import com.azure.resourcemanager.keyvault.generated.models.JsonWebKeyCurveName;
import com.azure.resourcemanager.keyvault.generated.models.JsonWebKeyOperation;
import com.azure.resourcemanager.keyvault.generated.models.JsonWebKeyType;
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsmKey;
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsmKeyAttributes;
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsmKeyCreateParameters;
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsmKeyReleasePolicy;
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsmRotationPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ManagedHsmKeyImpl implements ManagedHsmKey, ManagedHsmKey.Definition {
    private ManagedHsmKeyInner innerObject;

    private final com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager;

    ManagedHsmKeyImpl(ManagedHsmKeyInner innerObject,
        com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ManagedHsmKeyAttributes attributes() {
        return this.innerModel().attributes();
    }

    public JsonWebKeyType kty() {
        return this.innerModel().kty();
    }

    public List<JsonWebKeyOperation> keyOps() {
        List<JsonWebKeyOperation> inner = this.innerModel().keyOps();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Integer keySize() {
        return this.innerModel().keySize();
    }

    public JsonWebKeyCurveName curveName() {
        return this.innerModel().curveName();
    }

    public String keyUri() {
        return this.innerModel().keyUri();
    }

    public String keyUriWithVersion() {
        return this.innerModel().keyUriWithVersion();
    }

    public ManagedHsmRotationPolicy rotationPolicy() {
        return this.innerModel().rotationPolicy();
    }

    public ManagedHsmKeyReleasePolicy releasePolicy() {
        return this.innerModel().releasePolicy();
    }

    public ManagedHsmKeyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String keyName;

    private ManagedHsmKeyCreateParameters createParameters;

    public ManagedHsmKeyImpl withExistingManagedHSM(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    public ManagedHsmKey create() {
        this.innerObject = serviceManager.serviceClient().getManagedHsmKeys()
            .createIfNotExistWithResponse(resourceGroupName, name, keyName, createParameters, Context.NONE).getValue();
        return this;
    }

    public ManagedHsmKey create(Context context) {
        this.innerObject = serviceManager.serviceClient().getManagedHsmKeys()
            .createIfNotExistWithResponse(resourceGroupName, name, keyName, createParameters, context).getValue();
        return this;
    }

    ManagedHsmKeyImpl(String name, com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager) {
        this.innerObject = new ManagedHsmKeyInner();
        this.serviceManager = serviceManager;
        this.keyName = name;
        this.createParameters = new ManagedHsmKeyCreateParameters();
    }

    public ManagedHsmKey refresh() {
        this.innerObject = serviceManager.serviceClient().getManagedHsmKeys()
            .getWithResponse(resourceGroupName, name, keyName, Context.NONE).getValue();
        return this;
    }

    public ManagedHsmKey refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getManagedHsmKeys()
            .getWithResponse(resourceGroupName, name, keyName, context).getValue();
        return this;
    }

    public ManagedHsmKeyImpl withProperties(ManagedHsmKeyProperties properties) {
        this.createParameters.withProperties(properties);
        return this;
    }

    public ManagedHsmKeyImpl withTags(Map<String, String> tags) {
        this.createParameters.withTags(tags);
        return this;
    }
}
