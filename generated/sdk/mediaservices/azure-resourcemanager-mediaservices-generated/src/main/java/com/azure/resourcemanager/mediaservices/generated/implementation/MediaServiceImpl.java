// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.MediaServiceInner;
import com.azure.resourcemanager.mediaservices.generated.models.AccountEncryption;
import com.azure.resourcemanager.mediaservices.generated.models.EdgePolicies;
import com.azure.resourcemanager.mediaservices.generated.models.KeyDelivery;
import com.azure.resourcemanager.mediaservices.generated.models.ListEdgePoliciesInput;
import com.azure.resourcemanager.mediaservices.generated.models.MediaService;
import com.azure.resourcemanager.mediaservices.generated.models.MediaServiceIdentity;
import com.azure.resourcemanager.mediaservices.generated.models.MediaServiceUpdate;
import com.azure.resourcemanager.mediaservices.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.mediaservices.generated.models.StorageAccount;
import com.azure.resourcemanager.mediaservices.generated.models.StorageAuthentication;
import com.azure.resourcemanager.mediaservices.generated.models.SyncStorageKeysInput;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class MediaServiceImpl implements MediaService, MediaService.Definition, MediaService.Update {
    private MediaServiceInner innerObject;

    private final com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public MediaServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public UUID mediaServiceId() {
        return this.innerModel().mediaServiceId();
    }

    public List<StorageAccount> storageAccounts() {
        List<StorageAccount> inner = this.innerModel().storageAccounts();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public StorageAuthentication storageAuthentication() {
        return this.innerModel().storageAuthentication();
    }

    public AccountEncryption encryption() {
        return this.innerModel().encryption();
    }

    public KeyDelivery keyDelivery() {
        return this.innerModel().keyDelivery();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public MediaServiceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.generated.MediaServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private MediaServiceUpdate updateParameters;

    public MediaServiceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public MediaService create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMediaservices()
                .createOrUpdateWithResponse(resourceGroupName, accountName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public MediaService create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMediaservices()
                .createOrUpdateWithResponse(resourceGroupName, accountName, this.innerModel(), context)
                .getValue();
        return this;
    }

    MediaServiceImpl(
        String name, com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerObject = new MediaServiceInner();
        this.serviceManager = serviceManager;
        this.accountName = name;
    }

    public MediaServiceImpl update() {
        this.updateParameters = new MediaServiceUpdate();
        return this;
    }

    public MediaService apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMediaservices()
                .updateWithResponse(resourceGroupName, accountName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public MediaService apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMediaservices()
                .updateWithResponse(resourceGroupName, accountName, updateParameters, context)
                .getValue();
        return this;
    }

    MediaServiceImpl(
        MediaServiceInner innerObject,
        com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "mediaservices");
    }

    public MediaService refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMediaservices()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE)
                .getValue();
        return this;
    }

    public MediaService refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMediaservices()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, context)
                .getValue();
        return this;
    }

    public void syncStorageKeys(SyncStorageKeysInput parameters) {
        serviceManager.mediaservices().syncStorageKeys(resourceGroupName, accountName, parameters);
    }

    public Response<Void> syncStorageKeysWithResponse(SyncStorageKeysInput parameters, Context context) {
        return serviceManager
            .mediaservices()
            .syncStorageKeysWithResponse(resourceGroupName, accountName, parameters, context);
    }

    public EdgePolicies listEdgePolicies(ListEdgePoliciesInput parameters) {
        return serviceManager.mediaservices().listEdgePolicies(resourceGroupName, accountName, parameters);
    }

    public Response<EdgePolicies> listEdgePoliciesWithResponse(ListEdgePoliciesInput parameters, Context context) {
        return serviceManager
            .mediaservices()
            .listEdgePoliciesWithResponse(resourceGroupName, accountName, parameters, context);
    }

    public MediaServiceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public MediaServiceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public MediaServiceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public MediaServiceImpl withIdentity(MediaServiceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public MediaServiceImpl withStorageAccounts(List<StorageAccount> storageAccounts) {
        if (isInCreateMode()) {
            this.innerModel().withStorageAccounts(storageAccounts);
            return this;
        } else {
            this.updateParameters.withStorageAccounts(storageAccounts);
            return this;
        }
    }

    public MediaServiceImpl withStorageAuthentication(StorageAuthentication storageAuthentication) {
        if (isInCreateMode()) {
            this.innerModel().withStorageAuthentication(storageAuthentication);
            return this;
        } else {
            this.updateParameters.withStorageAuthentication(storageAuthentication);
            return this;
        }
    }

    public MediaServiceImpl withEncryption(AccountEncryption encryption) {
        if (isInCreateMode()) {
            this.innerModel().withEncryption(encryption);
            return this;
        } else {
            this.updateParameters.withEncryption(encryption);
            return this;
        }
    }

    public MediaServiceImpl withKeyDelivery(KeyDelivery keyDelivery) {
        if (isInCreateMode()) {
            this.innerModel().withKeyDelivery(keyDelivery);
            return this;
        } else {
            this.updateParameters.withKeyDelivery(keyDelivery);
            return this;
        }
    }

    public MediaServiceImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
