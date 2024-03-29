// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.SiteSourceControlInner;
import com.azure.resourcemanager.appservice.generated.models.GitHubActionConfiguration;
import com.azure.resourcemanager.appservice.generated.models.SiteSourceControl;

public final class SiteSourceControlImpl implements SiteSourceControl {
    private SiteSourceControlInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    SiteSourceControlImpl(SiteSourceControlInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public String repoUrl() {
        return this.innerModel().repoUrl();
    }

    public String branch() {
        return this.innerModel().branch();
    }

    public Boolean isManualIntegration() {
        return this.innerModel().isManualIntegration();
    }

    public Boolean isGitHubAction() {
        return this.innerModel().isGitHubAction();
    }

    public Boolean deploymentRollbackEnabled() {
        return this.innerModel().deploymentRollbackEnabled();
    }

    public Boolean isMercurial() {
        return this.innerModel().isMercurial();
    }

    public GitHubActionConfiguration gitHubActionConfiguration() {
        return this.innerModel().gitHubActionConfiguration();
    }

    public SiteSourceControlInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
