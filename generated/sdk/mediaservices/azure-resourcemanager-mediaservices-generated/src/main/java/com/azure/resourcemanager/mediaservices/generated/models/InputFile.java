// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * An InputDefinition for a single file. TrackSelections are scoped to the file specified.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@odata.type", defaultImpl = InputFile.class, visible = true)
@JsonTypeName("#Microsoft.Media.InputFile")
@Fluent
public final class InputFile extends InputDefinition {
    /*
     * The discriminator for derived types.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Media.InputFile";

    /*
     * Name of the file that this input definition applies to.
     */
    @JsonProperty(value = "filename")
    private String filename;

    /**
     * Creates an instance of InputFile class.
     */
    public InputFile() {
    }

    /**
     * Get the odataType property: The discriminator for derived types.
     * 
     * @return the odataType value.
     */
    @Override
    public String odataType() {
        return this.odataType;
    }

    /**
     * Get the filename property: Name of the file that this input definition applies to.
     * 
     * @return the filename value.
     */
    public String filename() {
        return this.filename;
    }

    /**
     * Set the filename property: Name of the file that this input definition applies to.
     * 
     * @param filename the filename value to set.
     * @return the InputFile object itself.
     */
    public InputFile withFilename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InputFile withIncludedTracks(List<TrackDescriptor> includedTracks) {
        super.withIncludedTracks(includedTracks);
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
    }
}
