// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteZipDeployment;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Static site zip deployment ARM resource. */
@Fluent
public final class StaticSiteZipDeploymentArmResource extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StaticSiteZipDeploymentArmResource.class);

    /*
     * Core resource properties
     */
    @JsonProperty(value = "properties")
    private StaticSiteZipDeployment innerProperties;

    /**
     * Get the innerProperties property: Core resource properties.
     *
     * @return the innerProperties value.
     */
    private StaticSiteZipDeployment innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSiteZipDeploymentArmResource withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the appZipUrl property: URL for the zipped app content.
     *
     * @return the appZipUrl value.
     */
    public String appZipUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().appZipUrl();
    }

    /**
     * Set the appZipUrl property: URL for the zipped app content.
     *
     * @param appZipUrl the appZipUrl value to set.
     * @return the StaticSiteZipDeploymentArmResource object itself.
     */
    public StaticSiteZipDeploymentArmResource withAppZipUrl(String appZipUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteZipDeployment();
        }
        this.innerProperties().withAppZipUrl(appZipUrl);
        return this;
    }

    /**
     * Get the apiZipUrl property: URL for the zipped api content.
     *
     * @return the apiZipUrl value.
     */
    public String apiZipUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().apiZipUrl();
    }

    /**
     * Set the apiZipUrl property: URL for the zipped api content.
     *
     * @param apiZipUrl the apiZipUrl value to set.
     * @return the StaticSiteZipDeploymentArmResource object itself.
     */
    public StaticSiteZipDeploymentArmResource withApiZipUrl(String apiZipUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteZipDeployment();
        }
        this.innerProperties().withApiZipUrl(apiZipUrl);
        return this;
    }

    /**
     * Get the deploymentTitle property: A title to label the deployment.
     *
     * @return the deploymentTitle value.
     */
    public String deploymentTitle() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentTitle();
    }

    /**
     * Set the deploymentTitle property: A title to label the deployment.
     *
     * @param deploymentTitle the deploymentTitle value to set.
     * @return the StaticSiteZipDeploymentArmResource object itself.
     */
    public StaticSiteZipDeploymentArmResource withDeploymentTitle(String deploymentTitle) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteZipDeployment();
        }
        this.innerProperties().withDeploymentTitle(deploymentTitle);
        return this;
    }

    /**
     * Get the provider property: The provider submitting this deployment.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.innerProperties() == null ? null : this.innerProperties().provider();
    }

    /**
     * Set the provider property: The provider submitting this deployment.
     *
     * @param provider the provider value to set.
     * @return the StaticSiteZipDeploymentArmResource object itself.
     */
    public StaticSiteZipDeploymentArmResource withProvider(String provider) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteZipDeployment();
        }
        this.innerProperties().withProvider(provider);
        return this;
    }

    /**
     * Get the functionLanguage property: The language of the api content, if it exists.
     *
     * @return the functionLanguage value.
     */
    public String functionLanguage() {
        return this.innerProperties() == null ? null : this.innerProperties().functionLanguage();
    }

    /**
     * Set the functionLanguage property: The language of the api content, if it exists.
     *
     * @param functionLanguage the functionLanguage value to set.
     * @return the StaticSiteZipDeploymentArmResource object itself.
     */
    public StaticSiteZipDeploymentArmResource withFunctionLanguage(String functionLanguage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteZipDeployment();
        }
        this.innerProperties().withFunctionLanguage(functionLanguage);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
