// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.models.MSDeployProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** MSDeploy ARM PUT information. */
@Fluent
public final class MSDeploy extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MSDeploy.class);

    /*
     * Core resource properties
     */
    @JsonProperty(value = "properties")
    private MSDeployProperties innerProperties;

    /**
     * Get the innerProperties property: Core resource properties.
     *
     * @return the innerProperties value.
     */
    private MSDeployProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public MSDeploy withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the addOnPackages property: List of Add-On packages. Add-On packages implicitly enable the Do Not Delete
     * MSDeploy rule.
     *
     * @return the addOnPackages value.
     */
    public List<MSDeployCore> addOnPackages() {
        return this.innerProperties() == null ? null : this.innerProperties().addOnPackages();
    }

    /**
     * Set the addOnPackages property: List of Add-On packages. Add-On packages implicitly enable the Do Not Delete
     * MSDeploy rule.
     *
     * @param addOnPackages the addOnPackages value to set.
     * @return the MSDeploy object itself.
     */
    public MSDeploy withAddOnPackages(List<MSDeployCore> addOnPackages) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MSDeployProperties();
        }
        this.innerProperties().withAddOnPackages(addOnPackages);
        return this;
    }

    /**
     * Get the packageUri property: Package URI.
     *
     * @return the packageUri value.
     */
    public String packageUri() {
        return this.innerProperties() == null ? null : this.innerProperties().packageUri();
    }

    /**
     * Set the packageUri property: Package URI.
     *
     * @param packageUri the packageUri value to set.
     * @return the MSDeploy object itself.
     */
    public MSDeploy withPackageUri(String packageUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MSDeployProperties();
        }
        this.innerProperties().withPackageUri(packageUri);
        return this;
    }

    /**
     * Get the connectionString property: SQL Connection String.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionString();
    }

    /**
     * Set the connectionString property: SQL Connection String.
     *
     * @param connectionString the connectionString value to set.
     * @return the MSDeploy object itself.
     */
    public MSDeploy withConnectionString(String connectionString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MSDeployProperties();
        }
        this.innerProperties().withConnectionString(connectionString);
        return this;
    }

    /**
     * Get the dbType property: Database Type.
     *
     * @return the dbType value.
     */
    public String dbType() {
        return this.innerProperties() == null ? null : this.innerProperties().dbType();
    }

    /**
     * Set the dbType property: Database Type.
     *
     * @param dbType the dbType value to set.
     * @return the MSDeploy object itself.
     */
    public MSDeploy withDbType(String dbType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MSDeployProperties();
        }
        this.innerProperties().withDbType(dbType);
        return this;
    }

    /**
     * Get the setParametersXmlFileUri property: URI of MSDeploy Parameters file. Must not be set if SetParameters is
     * used.
     *
     * @return the setParametersXmlFileUri value.
     */
    public String setParametersXmlFileUri() {
        return this.innerProperties() == null ? null : this.innerProperties().setParametersXmlFileUri();
    }

    /**
     * Set the setParametersXmlFileUri property: URI of MSDeploy Parameters file. Must not be set if SetParameters is
     * used.
     *
     * @param setParametersXmlFileUri the setParametersXmlFileUri value to set.
     * @return the MSDeploy object itself.
     */
    public MSDeploy withSetParametersXmlFileUri(String setParametersXmlFileUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MSDeployProperties();
        }
        this.innerProperties().withSetParametersXmlFileUri(setParametersXmlFileUri);
        return this;
    }

    /**
     * Get the setParameters property: MSDeploy Parameters. Must not be set if SetParametersXmlFileUri is used.
     *
     * @return the setParameters value.
     */
    public Map<String, String> setParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().setParameters();
    }

    /**
     * Set the setParameters property: MSDeploy Parameters. Must not be set if SetParametersXmlFileUri is used.
     *
     * @param setParameters the setParameters value to set.
     * @return the MSDeploy object itself.
     */
    public MSDeploy withSetParameters(Map<String, String> setParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MSDeployProperties();
        }
        this.innerProperties().withSetParameters(setParameters);
        return this;
    }

    /**
     * Get the skipAppData property: Controls whether the MSDeploy operation skips the App_Data directory. If set to
     * &lt;code&gt;true&lt;/code&gt;, the existing App_Data directory on the destination will not be deleted, and any
     * App_Data directory in the source will be ignored. Setting is &lt;code&gt;false&lt;/code&gt; by default.
     *
     * @return the skipAppData value.
     */
    public Boolean skipAppData() {
        return this.innerProperties() == null ? null : this.innerProperties().skipAppData();
    }

    /**
     * Set the skipAppData property: Controls whether the MSDeploy operation skips the App_Data directory. If set to
     * &lt;code&gt;true&lt;/code&gt;, the existing App_Data directory on the destination will not be deleted, and any
     * App_Data directory in the source will be ignored. Setting is &lt;code&gt;false&lt;/code&gt; by default.
     *
     * @param skipAppData the skipAppData value to set.
     * @return the MSDeploy object itself.
     */
    public MSDeploy withSkipAppData(Boolean skipAppData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MSDeployProperties();
        }
        this.innerProperties().withSkipAppData(skipAppData);
        return this;
    }

    /**
     * Get the appOffline property: Sets the AppOffline rule while the MSDeploy operation executes. Setting is
     * &lt;code&gt;false&lt;/code&gt; by default.
     *
     * @return the appOffline value.
     */
    public Boolean appOffline() {
        return this.innerProperties() == null ? null : this.innerProperties().appOffline();
    }

    /**
     * Set the appOffline property: Sets the AppOffline rule while the MSDeploy operation executes. Setting is
     * &lt;code&gt;false&lt;/code&gt; by default.
     *
     * @param appOffline the appOffline value to set.
     * @return the MSDeploy object itself.
     */
    public MSDeploy withAppOffline(Boolean appOffline) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MSDeployProperties();
        }
        this.innerProperties().withAppOffline(appOffline);
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
