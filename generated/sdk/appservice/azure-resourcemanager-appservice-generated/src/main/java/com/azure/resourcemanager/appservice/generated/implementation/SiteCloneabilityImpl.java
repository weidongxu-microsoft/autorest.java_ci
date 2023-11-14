// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.SiteCloneabilityInner;
import com.azure.resourcemanager.appservice.generated.models.CloneAbilityResult;
import com.azure.resourcemanager.appservice.generated.models.SiteCloneability;
import com.azure.resourcemanager.appservice.generated.models.SiteCloneabilityCriterion;
import java.util.Collections;
import java.util.List;

public final class SiteCloneabilityImpl implements SiteCloneability {
    private SiteCloneabilityInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    SiteCloneabilityImpl(SiteCloneabilityInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public CloneAbilityResult result() {
        return this.innerModel().result();
    }

    public List<SiteCloneabilityCriterion> blockingFeatures() {
        List<SiteCloneabilityCriterion> inner = this.innerModel().blockingFeatures();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SiteCloneabilityCriterion> unsupportedFeatures() {
        List<SiteCloneabilityCriterion> inner = this.innerModel().unsupportedFeatures();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SiteCloneabilityCriterion> blockingCharacteristics() {
        List<SiteCloneabilityCriterion> inner = this.innerModel().blockingCharacteristics();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SiteCloneabilityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
