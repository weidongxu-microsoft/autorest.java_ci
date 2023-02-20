// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.resourcemanager.mediaservices.generated.fluent.models.LiveEventStreamEventInner;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventStreamEvent;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventStreamEventData;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventStreamEventLevel;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventStreamEventType;
import java.time.OffsetDateTime;

public final class LiveEventStreamEventImpl implements LiveEventStreamEvent {
    private LiveEventStreamEventInner innerObject;

    private final com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager;

    LiveEventStreamEventImpl(
        LiveEventStreamEventInner innerObject,
        com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public LiveEventStreamEventType eventType() {
        return this.innerModel().eventType();
    }

    public OffsetDateTime eventTime() {
        return this.innerModel().eventTime();
    }

    public LiveEventStreamEventLevel eventLevel() {
        return this.innerModel().eventLevel();
    }

    public LiveEventStreamEventData data() {
        return this.innerModel().data();
    }

    public LiveEventStreamEventInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.generated.MediaServicesManager manager() {
        return this.serviceManager;
    }
}
