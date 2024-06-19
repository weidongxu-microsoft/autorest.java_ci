// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the settings to be used when encoding the input video into a desired output bitrate layer.
 */
@Fluent
public class VideoLayer extends Layer {
    /*
     * The average bitrate in bits per second at which to encode the input video when generating this layer. This is a
     * required field.
     */
    private int bitrate;

    /*
     * The maximum bitrate (in bits per second), at which the VBV buffer should be assumed to refill. If not specified,
     * defaults to the same value as bitrate.
     */
    private Integer maxBitrate;

    /*
     * The number of B-frames to be used when encoding this layer. If not specified, the encoder chooses an appropriate
     * number based on the video profile and level.
     */
    private Integer bFrames;

    /*
     * The frame rate (in frames per second) at which to encode this layer. The value can be in the form of M/N where M
     * and N are integers (For example, 30000/1001), or in the form of a number (For example, 30, or 29.97). The encoder
     * enforces constraints on allowed frame rates based on the profile and level. If it is not specified, the encoder
     * will use the same frame rate as the input video.
     */
    private String frameRate;

    /*
     * The number of slices to be used when encoding this layer. If not specified, default is zero, which means that
     * encoder will use a single slice for each frame.
     */
    private Integer slices;

    /*
     * Whether or not adaptive B-frames are to be used when encoding this layer. If not specified, the encoder will turn
     * it on whenever the video profile permits its use.
     */
    private Boolean adaptiveBFrame;

    /**
     * Creates an instance of VideoLayer class.
     */
    public VideoLayer() {
    }

    /**
     * Get the bitrate property: The average bitrate in bits per second at which to encode the input video when
     * generating this layer. This is a required field.
     * 
     * @return the bitrate value.
     */
    public int bitrate() {
        return this.bitrate;
    }

    /**
     * Set the bitrate property: The average bitrate in bits per second at which to encode the input video when
     * generating this layer. This is a required field.
     * 
     * @param bitrate the bitrate value to set.
     * @return the VideoLayer object itself.
     */
    public VideoLayer withBitrate(int bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Get the maxBitrate property: The maximum bitrate (in bits per second), at which the VBV buffer should be assumed
     * to refill. If not specified, defaults to the same value as bitrate.
     * 
     * @return the maxBitrate value.
     */
    public Integer maxBitrate() {
        return this.maxBitrate;
    }

    /**
     * Set the maxBitrate property: The maximum bitrate (in bits per second), at which the VBV buffer should be assumed
     * to refill. If not specified, defaults to the same value as bitrate.
     * 
     * @param maxBitrate the maxBitrate value to set.
     * @return the VideoLayer object itself.
     */
    public VideoLayer withMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
        return this;
    }

    /**
     * Get the bFrames property: The number of B-frames to be used when encoding this layer. If not specified, the
     * encoder chooses an appropriate number based on the video profile and level.
     * 
     * @return the bFrames value.
     */
    public Integer bFrames() {
        return this.bFrames;
    }

    /**
     * Set the bFrames property: The number of B-frames to be used when encoding this layer. If not specified, the
     * encoder chooses an appropriate number based on the video profile and level.
     * 
     * @param bFrames the bFrames value to set.
     * @return the VideoLayer object itself.
     */
    public VideoLayer withBFrames(Integer bFrames) {
        this.bFrames = bFrames;
        return this;
    }

    /**
     * Get the frameRate property: The frame rate (in frames per second) at which to encode this layer. The value can be
     * in the form of M/N where M and N are integers (For example, 30000/1001), or in the form of a number (For example,
     * 30, or 29.97). The encoder enforces constraints on allowed frame rates based on the profile and level. If it is
     * not specified, the encoder will use the same frame rate as the input video.
     * 
     * @return the frameRate value.
     */
    public String frameRate() {
        return this.frameRate;
    }

    /**
     * Set the frameRate property: The frame rate (in frames per second) at which to encode this layer. The value can be
     * in the form of M/N where M and N are integers (For example, 30000/1001), or in the form of a number (For example,
     * 30, or 29.97). The encoder enforces constraints on allowed frame rates based on the profile and level. If it is
     * not specified, the encoder will use the same frame rate as the input video.
     * 
     * @param frameRate the frameRate value to set.
     * @return the VideoLayer object itself.
     */
    public VideoLayer withFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * Get the slices property: The number of slices to be used when encoding this layer. If not specified, default is
     * zero, which means that encoder will use a single slice for each frame.
     * 
     * @return the slices value.
     */
    public Integer slices() {
        return this.slices;
    }

    /**
     * Set the slices property: The number of slices to be used when encoding this layer. If not specified, default is
     * zero, which means that encoder will use a single slice for each frame.
     * 
     * @param slices the slices value to set.
     * @return the VideoLayer object itself.
     */
    public VideoLayer withSlices(Integer slices) {
        this.slices = slices;
        return this;
    }

    /**
     * Get the adaptiveBFrame property: Whether or not adaptive B-frames are to be used when encoding this layer. If not
     * specified, the encoder will turn it on whenever the video profile permits its use.
     * 
     * @return the adaptiveBFrame value.
     */
    public Boolean adaptiveBFrame() {
        return this.adaptiveBFrame;
    }

    /**
     * Set the adaptiveBFrame property: Whether or not adaptive B-frames are to be used when encoding this layer. If not
     * specified, the encoder will turn it on whenever the video profile permits its use.
     * 
     * @param adaptiveBFrame the adaptiveBFrame value to set.
     * @return the VideoLayer object itself.
     */
    public VideoLayer withAdaptiveBFrame(Boolean adaptiveBFrame) {
        this.adaptiveBFrame = adaptiveBFrame;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VideoLayer withWidth(String width) {
        super.withWidth(width);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VideoLayer withHeight(String height) {
        super.withHeight(height);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VideoLayer withLabel(String label) {
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("width", width());
        jsonWriter.writeStringField("height", height());
        jsonWriter.writeStringField("label", label());
        jsonWriter.writeIntField("bitrate", this.bitrate);
        jsonWriter.writeNumberField("maxBitrate", this.maxBitrate);
        jsonWriter.writeNumberField("bFrames", this.bFrames);
        jsonWriter.writeStringField("frameRate", this.frameRate);
        jsonWriter.writeNumberField("slices", this.slices);
        jsonWriter.writeBooleanField("adaptiveBFrame", this.adaptiveBFrame);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VideoLayer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VideoLayer if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VideoLayer.
     */
    public static VideoLayer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VideoLayer deserializedVideoLayer = new VideoLayer();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("width".equals(fieldName)) {
                    deserializedVideoLayer.withWidth(reader.getString());
                } else if ("height".equals(fieldName)) {
                    deserializedVideoLayer.withHeight(reader.getString());
                } else if ("label".equals(fieldName)) {
                    deserializedVideoLayer.withLabel(reader.getString());
                } else if ("bitrate".equals(fieldName)) {
                    deserializedVideoLayer.bitrate = reader.getInt();
                } else if ("maxBitrate".equals(fieldName)) {
                    deserializedVideoLayer.maxBitrate = reader.getNullable(JsonReader::getInt);
                } else if ("bFrames".equals(fieldName)) {
                    deserializedVideoLayer.bFrames = reader.getNullable(JsonReader::getInt);
                } else if ("frameRate".equals(fieldName)) {
                    deserializedVideoLayer.frameRate = reader.getString();
                } else if ("slices".equals(fieldName)) {
                    deserializedVideoLayer.slices = reader.getNullable(JsonReader::getInt);
                } else if ("adaptiveBFrame".equals(fieldName)) {
                    deserializedVideoLayer.adaptiveBFrame = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVideoLayer;
        });
    }
}
