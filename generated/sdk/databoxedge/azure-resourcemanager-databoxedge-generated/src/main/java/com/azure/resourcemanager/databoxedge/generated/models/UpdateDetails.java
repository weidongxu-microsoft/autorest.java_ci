// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Update Specific attributes. */
@Fluent
public final class UpdateDetails {
    /*
     * Title of the Update
     */
    @JsonProperty(value = "updateTitle")
    private String updateTitle;

    /*
     * Size of the update(In Bytes)
     */
    @JsonProperty(value = "updateSize")
    private Double updateSize;

    /*
     * Type of the Update
     */
    @JsonProperty(value = "updateType")
    private UpdateType updateType;

    /*
     * Target Version number
     */
    @JsonProperty(value = "targetVersion")
    private String targetVersion;

    /*
     * Friendly Version Number
     */
    @JsonProperty(value = "friendlyVersionNumber")
    private String friendlyVersionNumber;

    /*
     * Estimated Install Time for the update
     */
    @JsonProperty(value = "estimatedInstallTimeInMins")
    private Integer estimatedInstallTimeInMins;

    /*
     * Indicates if updates are available and at least one of the updates needs
     * a reboot.
     */
    @JsonProperty(value = "rebootBehavior")
    private InstallRebootBehavior rebootBehavior;

    /*
     * Impact of Installing an updateType
     */
    @JsonProperty(value = "installationImpact")
    private InstallationImpact installationImpact;

    /*
     * Status of the update.
     */
    @JsonProperty(value = "status")
    private UpdateStatus status;

    /**
     * Get the updateTitle property: Title of the Update.
     *
     * @return the updateTitle value.
     */
    public String updateTitle() {
        return this.updateTitle;
    }

    /**
     * Set the updateTitle property: Title of the Update.
     *
     * @param updateTitle the updateTitle value to set.
     * @return the UpdateDetails object itself.
     */
    public UpdateDetails withUpdateTitle(String updateTitle) {
        this.updateTitle = updateTitle;
        return this;
    }

    /**
     * Get the updateSize property: Size of the update(In Bytes).
     *
     * @return the updateSize value.
     */
    public Double updateSize() {
        return this.updateSize;
    }

    /**
     * Set the updateSize property: Size of the update(In Bytes).
     *
     * @param updateSize the updateSize value to set.
     * @return the UpdateDetails object itself.
     */
    public UpdateDetails withUpdateSize(Double updateSize) {
        this.updateSize = updateSize;
        return this;
    }

    /**
     * Get the updateType property: Type of the Update.
     *
     * @return the updateType value.
     */
    public UpdateType updateType() {
        return this.updateType;
    }

    /**
     * Set the updateType property: Type of the Update.
     *
     * @param updateType the updateType value to set.
     * @return the UpdateDetails object itself.
     */
    public UpdateDetails withUpdateType(UpdateType updateType) {
        this.updateType = updateType;
        return this;
    }

    /**
     * Get the targetVersion property: Target Version number.
     *
     * @return the targetVersion value.
     */
    public String targetVersion() {
        return this.targetVersion;
    }

    /**
     * Set the targetVersion property: Target Version number.
     *
     * @param targetVersion the targetVersion value to set.
     * @return the UpdateDetails object itself.
     */
    public UpdateDetails withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * Get the friendlyVersionNumber property: Friendly Version Number.
     *
     * @return the friendlyVersionNumber value.
     */
    public String friendlyVersionNumber() {
        return this.friendlyVersionNumber;
    }

    /**
     * Set the friendlyVersionNumber property: Friendly Version Number.
     *
     * @param friendlyVersionNumber the friendlyVersionNumber value to set.
     * @return the UpdateDetails object itself.
     */
    public UpdateDetails withFriendlyVersionNumber(String friendlyVersionNumber) {
        this.friendlyVersionNumber = friendlyVersionNumber;
        return this;
    }

    /**
     * Get the estimatedInstallTimeInMins property: Estimated Install Time for the update.
     *
     * @return the estimatedInstallTimeInMins value.
     */
    public Integer estimatedInstallTimeInMins() {
        return this.estimatedInstallTimeInMins;
    }

    /**
     * Set the estimatedInstallTimeInMins property: Estimated Install Time for the update.
     *
     * @param estimatedInstallTimeInMins the estimatedInstallTimeInMins value to set.
     * @return the UpdateDetails object itself.
     */
    public UpdateDetails withEstimatedInstallTimeInMins(Integer estimatedInstallTimeInMins) {
        this.estimatedInstallTimeInMins = estimatedInstallTimeInMins;
        return this;
    }

    /**
     * Get the rebootBehavior property: Indicates if updates are available and at least one of the updates needs a
     * reboot.
     *
     * @return the rebootBehavior value.
     */
    public InstallRebootBehavior rebootBehavior() {
        return this.rebootBehavior;
    }

    /**
     * Set the rebootBehavior property: Indicates if updates are available and at least one of the updates needs a
     * reboot.
     *
     * @param rebootBehavior the rebootBehavior value to set.
     * @return the UpdateDetails object itself.
     */
    public UpdateDetails withRebootBehavior(InstallRebootBehavior rebootBehavior) {
        this.rebootBehavior = rebootBehavior;
        return this;
    }

    /**
     * Get the installationImpact property: Impact of Installing an updateType.
     *
     * @return the installationImpact value.
     */
    public InstallationImpact installationImpact() {
        return this.installationImpact;
    }

    /**
     * Set the installationImpact property: Impact of Installing an updateType.
     *
     * @param installationImpact the installationImpact value to set.
     * @return the UpdateDetails object itself.
     */
    public UpdateDetails withInstallationImpact(InstallationImpact installationImpact) {
        this.installationImpact = installationImpact;
        return this;
    }

    /**
     * Get the status property: Status of the update.
     *
     * @return the status value.
     */
    public UpdateStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the update.
     *
     * @param status the status value to set.
     * @return the UpdateDetails object itself.
     */
    public UpdateDetails withStatus(UpdateStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
