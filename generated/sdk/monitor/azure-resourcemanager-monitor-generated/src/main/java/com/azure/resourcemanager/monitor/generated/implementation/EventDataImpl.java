// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.resourcemanager.monitor.generated.fluent.models.EventDataInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.LocalizableStringInner;
import com.azure.resourcemanager.monitor.generated.models.EventData;
import com.azure.resourcemanager.monitor.generated.models.EventLevel;
import com.azure.resourcemanager.monitor.generated.models.HttpRequestInfo;
import com.azure.resourcemanager.monitor.generated.models.LocalizableString;
import com.azure.resourcemanager.monitor.generated.models.SenderAuthorization;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class EventDataImpl implements EventData {
    private EventDataInner innerObject;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    EventDataImpl(EventDataInner innerObject,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public SenderAuthorization authorization() {
        return this.innerModel().authorization();
    }

    public Map<String, String> claims() {
        Map<String, String> inner = this.innerModel().claims();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String caller() {
        return this.innerModel().caller();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String eventDataId() {
        return this.innerModel().eventDataId();
    }

    public String correlationId() {
        return this.innerModel().correlationId();
    }

    public LocalizableString eventName() {
        LocalizableStringInner inner = this.innerModel().eventName();
        if (inner != null) {
            return new LocalizableStringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LocalizableString category() {
        LocalizableStringInner inner = this.innerModel().category();
        if (inner != null) {
            return new LocalizableStringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public HttpRequestInfo httpRequest() {
        return this.innerModel().httpRequest();
    }

    public EventLevel level() {
        return this.innerModel().level();
    }

    public String resourceGroupName() {
        return this.innerModel().resourceGroupName();
    }

    public LocalizableString resourceProviderName() {
        LocalizableStringInner inner = this.innerModel().resourceProviderName();
        if (inner != null) {
            return new LocalizableStringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public LocalizableString resourceType() {
        LocalizableStringInner inner = this.innerModel().resourceType();
        if (inner != null) {
            return new LocalizableStringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String operationId() {
        return this.innerModel().operationId();
    }

    public LocalizableString operationName() {
        LocalizableStringInner inner = this.innerModel().operationName();
        if (inner != null) {
            return new LocalizableStringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Map<String, String> properties() {
        Map<String, String> inner = this.innerModel().properties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public LocalizableString status() {
        LocalizableStringInner inner = this.innerModel().status();
        if (inner != null) {
            return new LocalizableStringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LocalizableString subStatus() {
        LocalizableStringInner inner = this.innerModel().subStatus();
        if (inner != null) {
            return new LocalizableStringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OffsetDateTime eventTimestamp() {
        return this.innerModel().eventTimestamp();
    }

    public OffsetDateTime submissionTimestamp() {
        return this.innerModel().submissionTimestamp();
    }

    public String subscriptionId() {
        return this.innerModel().subscriptionId();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public EventDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
