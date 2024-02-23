// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Describes the properties for producing a collection of GOP aligned multi-bitrate files. The default behavior is to
 * produce one output file for each video layer which is muxed together with all the audios. The exact output files
 * produced can be controlled by specifying the outputFiles collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata.type",
    defaultImpl = MultiBitrateFormat.class)
@JsonTypeName("#Microsoft.Media.MultiBitrateFormat")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.Mp4Format", value = Mp4Format.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.TransportStreamFormat", value = TransportStreamFormat.class) })
@Fluent
public class MultiBitrateFormat extends Format {
    /*
     * The list of output files to produce. Each entry in the list is a set of audio and video layer labels to be muxed
     * together .
     */
    @JsonProperty(value = "outputFiles")
    private List<OutputFile> outputFiles;

    /**
     * Creates an instance of MultiBitrateFormat class.
     */
    public MultiBitrateFormat() {
    }

    /**
     * Get the outputFiles property: The list of output files to produce. Each entry in the list is a set of audio and
     * video layer labels to be muxed together .
     * 
     * @return the outputFiles value.
     */
    public List<OutputFile> outputFiles() {
        return this.outputFiles;
    }

    /**
     * Set the outputFiles property: The list of output files to produce. Each entry in the list is a set of audio and
     * video layer labels to be muxed together .
     * 
     * @param outputFiles the outputFiles value to set.
     * @return the MultiBitrateFormat object itself.
     */
    public MultiBitrateFormat withOutputFiles(List<OutputFile> outputFiles) {
        this.outputFiles = outputFiles;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MultiBitrateFormat withFilenamePattern(String filenamePattern) {
        super.withFilenamePattern(filenamePattern);
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
        if (outputFiles() != null) {
            outputFiles().forEach(e -> e.validate());
        }
    }
}
