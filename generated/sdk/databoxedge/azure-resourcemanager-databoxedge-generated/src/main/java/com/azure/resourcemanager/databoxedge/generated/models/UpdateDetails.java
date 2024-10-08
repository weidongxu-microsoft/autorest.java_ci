// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Update Specific attributes.
 */
@Fluent
public final class UpdateDetails implements JsonSerializable<UpdateDetails> {
    /*
     * Title of the Update
     */
    private String updateTitle;

    /*
     * Size of the update(In Bytes)
     */
    private Double updateSize;

    /*
     * Type of the Update
     */
    private UpdateType updateType;

    /*
     * Target Version number
     */
    private String targetVersion;

    /*
     * Friendly Version Number
     */
    private String friendlyVersionNumber;

    /*
     * Estimated Install Time for the update
     */
    private Integer estimatedInstallTimeInMins;

    /*
     * Indicates if updates are available and at least one of the updates needs a reboot.
     */
    private InstallRebootBehavior rebootBehavior;

    /*
     * Impact of Installing an updateType
     */
    private InstallationImpact installationImpact;

    /*
     * Status of the update.
     */
    private UpdateStatus status;

    /**
     * Creates an instance of UpdateDetails class.
     */
    public UpdateDetails() {
    }

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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("updateTitle", this.updateTitle);
        jsonWriter.writeNumberField("updateSize", this.updateSize);
        jsonWriter.writeStringField("updateType", this.updateType == null ? null : this.updateType.toString());
        jsonWriter.writeStringField("targetVersion", this.targetVersion);
        jsonWriter.writeStringField("friendlyVersionNumber", this.friendlyVersionNumber);
        jsonWriter.writeNumberField("estimatedInstallTimeInMins", this.estimatedInstallTimeInMins);
        jsonWriter.writeStringField("rebootBehavior",
            this.rebootBehavior == null ? null : this.rebootBehavior.toString());
        jsonWriter.writeStringField("installationImpact",
            this.installationImpact == null ? null : this.installationImpact.toString());
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdateDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UpdateDetails.
     */
    public static UpdateDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateDetails deserializedUpdateDetails = new UpdateDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("updateTitle".equals(fieldName)) {
                    deserializedUpdateDetails.updateTitle = reader.getString();
                } else if ("updateSize".equals(fieldName)) {
                    deserializedUpdateDetails.updateSize = reader.getNullable(JsonReader::getDouble);
                } else if ("updateType".equals(fieldName)) {
                    deserializedUpdateDetails.updateType = UpdateType.fromString(reader.getString());
                } else if ("targetVersion".equals(fieldName)) {
                    deserializedUpdateDetails.targetVersion = reader.getString();
                } else if ("friendlyVersionNumber".equals(fieldName)) {
                    deserializedUpdateDetails.friendlyVersionNumber = reader.getString();
                } else if ("estimatedInstallTimeInMins".equals(fieldName)) {
                    deserializedUpdateDetails.estimatedInstallTimeInMins = reader.getNullable(JsonReader::getInt);
                } else if ("rebootBehavior".equals(fieldName)) {
                    deserializedUpdateDetails.rebootBehavior = InstallRebootBehavior.fromString(reader.getString());
                } else if ("installationImpact".equals(fieldName)) {
                    deserializedUpdateDetails.installationImpact = InstallationImpact.fromString(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedUpdateDetails.status = UpdateStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdateDetails;
        });
    }
}
