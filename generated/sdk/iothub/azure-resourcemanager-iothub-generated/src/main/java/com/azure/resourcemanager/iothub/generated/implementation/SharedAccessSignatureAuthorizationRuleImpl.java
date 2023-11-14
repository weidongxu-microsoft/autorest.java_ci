// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.implementation;

import com.azure.resourcemanager.iothub.generated.fluent.models.SharedAccessSignatureAuthorizationRuleInner;
import com.azure.resourcemanager.iothub.generated.models.AccessRights;
import com.azure.resourcemanager.iothub.generated.models.SharedAccessSignatureAuthorizationRule;

public final class SharedAccessSignatureAuthorizationRuleImpl implements SharedAccessSignatureAuthorizationRule {
    private SharedAccessSignatureAuthorizationRuleInner innerObject;

    private final com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager;

    SharedAccessSignatureAuthorizationRuleImpl(SharedAccessSignatureAuthorizationRuleInner innerObject,
        com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String keyName() {
        return this.innerModel().keyName();
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public String secondaryKey() {
        return this.innerModel().secondaryKey();
    }

    public AccessRights rights() {
        return this.innerModel().rights();
    }

    public SharedAccessSignatureAuthorizationRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iothub.generated.IotHubManager manager() {
        return this.serviceManager;
    }
}
