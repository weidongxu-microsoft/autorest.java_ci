// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.AssetTrackInner;
import com.azure.resourcemanager.mediaservices.generated.models.AssetTrack;
import com.azure.resourcemanager.mediaservices.generated.models.ProvisioningState;
import com.azure.resourcemanager.mediaservices.generated.models.TrackBase;

public final class AssetTrackImpl implements AssetTrack, AssetTrack.Definition, AssetTrack.Update {
    private AssetTrackInner innerObject;

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

    public TrackBase track() {
        return this.innerModel().track();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AssetTrackInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.generated.MediaServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String assetName;

    private String trackName;

    public AssetTrackImpl withExistingAsset(String resourceGroupName, String accountName, String assetName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.assetName = assetName;
        return this;
    }

    public AssetTrack create() {
        this.innerObject = serviceManager.serviceClient().getTracks().createOrUpdate(resourceGroupName, accountName,
            assetName, trackName, this.innerModel(), Context.NONE);
        return this;
    }

    public AssetTrack create(Context context) {
        this.innerObject = serviceManager.serviceClient().getTracks().createOrUpdate(resourceGroupName, accountName,
            assetName, trackName, this.innerModel(), context);
        return this;
    }

    AssetTrackImpl(String name, com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerObject = new AssetTrackInner();
        this.serviceManager = serviceManager;
        this.trackName = name;
    }

    public AssetTrackImpl update() {
        return this;
    }

    public AssetTrack apply() {
        this.innerObject = serviceManager.serviceClient().getTracks().update(resourceGroupName, accountName, assetName,
            trackName, this.innerModel(), Context.NONE);
        return this;
    }

    public AssetTrack apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getTracks().update(resourceGroupName, accountName, assetName,
            trackName, this.innerModel(), context);
        return this;
    }

    AssetTrackImpl(AssetTrackInner innerObject,
        com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "mediaServices");
        this.assetName = Utils.getValueFromIdByName(innerObject.id(), "assets");
        this.trackName = Utils.getValueFromIdByName(innerObject.id(), "tracks");
    }

    public AssetTrack refresh() {
        this.innerObject = serviceManager.serviceClient().getTracks()
            .getWithResponse(resourceGroupName, accountName, assetName, trackName, Context.NONE).getValue();
        return this;
    }

    public AssetTrack refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getTracks()
            .getWithResponse(resourceGroupName, accountName, assetName, trackName, context).getValue();
        return this;
    }

    public void updateTrackData() {
        serviceManager.tracks().updateTrackData(resourceGroupName, accountName, assetName, trackName);
    }

    public void updateTrackData(Context context) {
        serviceManager.tracks().updateTrackData(resourceGroupName, accountName, assetName, trackName, context);
    }

    public AssetTrackImpl withTrack(TrackBase track) {
        this.innerModel().withTrack(track);
        return this;
    }
}
