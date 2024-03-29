// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.resourcemanager.mediaservices.generated.fluent.models.LiveEventTrackEventInner;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventTrackEvent;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventTrackEventData;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventTrackEventType;
import java.time.OffsetDateTime;

public final class LiveEventTrackEventImpl implements LiveEventTrackEvent {
    private LiveEventTrackEventInner innerObject;

    private final com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager;

    LiveEventTrackEventImpl(LiveEventTrackEventInner innerObject,
        com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public LiveEventTrackEventType eventType() {
        return this.innerModel().eventType();
    }

    public OffsetDateTime eventTime() {
        return this.innerModel().eventTime();
    }

    public LiveEventTrackEventData data() {
        return this.innerModel().data();
    }

    public LiveEventTrackEventInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.generated.MediaServicesManager manager() {
        return this.serviceManager;
    }
}
