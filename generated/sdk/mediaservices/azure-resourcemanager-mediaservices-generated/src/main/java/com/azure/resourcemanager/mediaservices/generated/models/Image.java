// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/**
 * Describes the basic properties for generating thumbnails from the input video.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata.type",
    defaultImpl = Image.class)
@JsonTypeName("#Microsoft.Media.Image")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.JpgImage", value = JpgImage.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.PngImage", value = PngImage.class) })
@Fluent
public class Image extends Video {
    /*
     * The position in the input video from where to start generating thumbnails. The value can be in ISO 8601 format
     * (For example, PT05S to start at 5 seconds), or a frame count (For example, 10 to start at the 10th frame), or a
     * relative value to stream duration (For example, 10% to start at 10% of stream duration). Also supports a macro
     * {Best}, which tells the encoder to select the best thumbnail from the first few seconds of the video and will
     * only produce one thumbnail, no matter what other settings are for Step and Range. The default value is macro
     * {Best}.
     */
    @JsonProperty(value = "start", required = true)
    private String start;

    /*
     * The intervals at which thumbnails are generated. The value can be in ISO 8601 format (For example, PT05S for one
     * image every 5 seconds), or a frame count (For example, 30 for one image every 30 frames), or a relative value to
     * stream duration (For example, 10% for one image every 10% of stream duration). Note: Step value will affect the
     * first generated thumbnail, which may not be exactly the one specified at transform preset start time. This is
     * due to the encoder, which tries to select the best thumbnail between start time and Step position from start
     * time as the first output. As the default value is 10%, it means if stream has long duration, the first generated
     * thumbnail might be far away from the one specified at start time. Try to select reasonable value for Step if the
     * first thumbnail is expected close to start time, or set Range value at 1 if only one thumbnail is needed at
     * start time.
     */
    @JsonProperty(value = "step")
    private String step;

    /*
     * The position relative to transform preset start time in the input video at which to stop generating thumbnails.
     * The value can be in ISO 8601 format (For example, PT5M30S to stop at 5 minutes and 30 seconds from start time),
     * or a frame count (For example, 300 to stop at the 300th frame from the frame at start time. If this value is 1,
     * it means only producing one thumbnail at start time), or a relative value to the stream duration (For example,
     * 50% to stop at half of stream duration from start time). The default value is 100%, which means to stop at the
     * end of the stream.
     */
    @JsonProperty(value = "range")
    private String range;

    /**
     * Creates an instance of Image class.
     */
    public Image() {
    }

    /**
     * Get the start property: The position in the input video from where to start generating thumbnails. The value can
     * be in ISO 8601 format (For example, PT05S to start at 5 seconds), or a frame count (For example, 10 to start at
     * the 10th frame), or a relative value to stream duration (For example, 10% to start at 10% of stream duration).
     * Also supports a macro {Best}, which tells the encoder to select the best thumbnail from the first few seconds of
     * the video and will only produce one thumbnail, no matter what other settings are for Step and Range. The default
     * value is macro {Best}.
     * 
     * @return the start value.
     */
    public String start() {
        return this.start;
    }

    /**
     * Set the start property: The position in the input video from where to start generating thumbnails. The value can
     * be in ISO 8601 format (For example, PT05S to start at 5 seconds), or a frame count (For example, 10 to start at
     * the 10th frame), or a relative value to stream duration (For example, 10% to start at 10% of stream duration).
     * Also supports a macro {Best}, which tells the encoder to select the best thumbnail from the first few seconds of
     * the video and will only produce one thumbnail, no matter what other settings are for Step and Range. The default
     * value is macro {Best}.
     * 
     * @param start the start value to set.
     * @return the Image object itself.
     */
    public Image withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Get the step property: The intervals at which thumbnails are generated. The value can be in ISO 8601 format (For
     * example, PT05S for one image every 5 seconds), or a frame count (For example, 30 for one image every 30 frames),
     * or a relative value to stream duration (For example, 10% for one image every 10% of stream duration). Note: Step
     * value will affect the first generated thumbnail, which may not be exactly the one specified at transform preset
     * start time. This is due to the encoder, which tries to select the best thumbnail between start time and Step
     * position from start time as the first output. As the default value is 10%, it means if stream has long duration,
     * the first generated thumbnail might be far away from the one specified at start time. Try to select reasonable
     * value for Step if the first thumbnail is expected close to start time, or set Range value at 1 if only one
     * thumbnail is needed at start time.
     * 
     * @return the step value.
     */
    public String step() {
        return this.step;
    }

    /**
     * Set the step property: The intervals at which thumbnails are generated. The value can be in ISO 8601 format (For
     * example, PT05S for one image every 5 seconds), or a frame count (For example, 30 for one image every 30 frames),
     * or a relative value to stream duration (For example, 10% for one image every 10% of stream duration). Note: Step
     * value will affect the first generated thumbnail, which may not be exactly the one specified at transform preset
     * start time. This is due to the encoder, which tries to select the best thumbnail between start time and Step
     * position from start time as the first output. As the default value is 10%, it means if stream has long duration,
     * the first generated thumbnail might be far away from the one specified at start time. Try to select reasonable
     * value for Step if the first thumbnail is expected close to start time, or set Range value at 1 if only one
     * thumbnail is needed at start time.
     * 
     * @param step the step value to set.
     * @return the Image object itself.
     */
    public Image withStep(String step) {
        this.step = step;
        return this;
    }

    /**
     * Get the range property: The position relative to transform preset start time in the input video at which to stop
     * generating thumbnails. The value can be in ISO 8601 format (For example, PT5M30S to stop at 5 minutes and 30
     * seconds from start time), or a frame count (For example, 300 to stop at the 300th frame from the frame at start
     * time. If this value is 1, it means only producing one thumbnail at start time), or a relative value to the
     * stream duration (For example, 50% to stop at half of stream duration from start time). The default value is
     * 100%, which means to stop at the end of the stream.
     * 
     * @return the range value.
     */
    public String range() {
        return this.range;
    }

    /**
     * Set the range property: The position relative to transform preset start time in the input video at which to stop
     * generating thumbnails. The value can be in ISO 8601 format (For example, PT5M30S to stop at 5 minutes and 30
     * seconds from start time), or a frame count (For example, 300 to stop at the 300th frame from the frame at start
     * time. If this value is 1, it means only producing one thumbnail at start time), or a relative value to the
     * stream duration (For example, 50% to stop at half of stream duration from start time). The default value is
     * 100%, which means to stop at the end of the stream.
     * 
     * @param range the range value to set.
     * @return the Image object itself.
     */
    public Image withRange(String range) {
        this.range = range;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image withKeyFrameInterval(Duration keyFrameInterval) {
        super.withKeyFrameInterval(keyFrameInterval);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image withStretchMode(StretchMode stretchMode) {
        super.withStretchMode(stretchMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image withSyncMode(VideoSyncMode syncMode) {
        super.withSyncMode(syncMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image withLabel(String label) {
        super.withLabel(label);
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
        if (start() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property start in model Image"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Image.class);
}
