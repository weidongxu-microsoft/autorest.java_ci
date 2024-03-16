// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.MSDeployCore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Core resource properties.
 */
@Fluent
public final class MSDeployProperties extends MSDeployCore {
    /*
     * List of Add-On packages. Add-On packages implicitly enable the Do Not Delete MSDeploy rule.
     */
    @JsonProperty(value = "addOnPackages")
    private List<MSDeployCore> addOnPackages;

    /**
     * Creates an instance of MSDeployProperties class.
     */
    public MSDeployProperties() {
    }

    /**
     * Get the addOnPackages property: List of Add-On packages. Add-On packages implicitly enable the Do Not Delete MSDeploy rule.
     * 
     * @return the addOnPackages value.
     */
    public List<MSDeployCore> addOnPackages() {
        return this.addOnPackages;
    }

    /**
     * Set the addOnPackages property: List of Add-On packages. Add-On packages implicitly enable the Do Not Delete MSDeploy rule.
     * 
     * @param addOnPackages the addOnPackages value to set.
     * @return the MSDeployProperties object itself.
     */
    public MSDeployProperties withAddOnPackages(List<MSDeployCore> addOnPackages) {
        this.addOnPackages = addOnPackages;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MSDeployProperties withPackageUri(String packageUri) {
        super.withPackageUri(packageUri);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MSDeployProperties withConnectionString(String connectionString) {
        super.withConnectionString(connectionString);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MSDeployProperties withDbType(String dbType) {
        super.withDbType(dbType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MSDeployProperties withSetParametersXmlFileUri(String setParametersXmlFileUri) {
        super.withSetParametersXmlFileUri(setParametersXmlFileUri);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MSDeployProperties withSetParameters(Map<String, String> setParameters) {
        super.withSetParameters(setParameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MSDeployProperties withSkipAppData(Boolean skipAppData) {
        super.withSkipAppData(skipAppData);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MSDeployProperties withAppOffline(Boolean appOffline) {
        super.withAppOffline(appOffline);
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
        if (addOnPackages() != null) {
            addOnPackages().forEach(e -> e.validate());
        }
    }
}
