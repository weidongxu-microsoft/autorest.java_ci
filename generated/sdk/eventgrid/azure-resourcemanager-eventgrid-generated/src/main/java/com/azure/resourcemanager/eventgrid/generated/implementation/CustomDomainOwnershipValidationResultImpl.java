// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.resourcemanager.eventgrid.generated.fluent.models.CustomDomainOwnershipValidationResultInner;
import com.azure.resourcemanager.eventgrid.generated.models.CustomDomainConfiguration;
import com.azure.resourcemanager.eventgrid.generated.models.CustomDomainOwnershipValidationResult;
import java.util.Collections;
import java.util.List;

public final class CustomDomainOwnershipValidationResultImpl implements CustomDomainOwnershipValidationResult {
    private CustomDomainOwnershipValidationResultInner innerObject;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    CustomDomainOwnershipValidationResultImpl(CustomDomainOwnershipValidationResultInner innerObject,
        com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<CustomDomainConfiguration> customDomainsForTopicsConfiguration() {
        List<CustomDomainConfiguration> inner = this.innerModel().customDomainsForTopicsConfiguration();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<CustomDomainConfiguration> customDomainsForTopicSpacesConfiguration() {
        List<CustomDomainConfiguration> inner = this.innerModel().customDomainsForTopicSpacesConfiguration();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public CustomDomainOwnershipValidationResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }
}