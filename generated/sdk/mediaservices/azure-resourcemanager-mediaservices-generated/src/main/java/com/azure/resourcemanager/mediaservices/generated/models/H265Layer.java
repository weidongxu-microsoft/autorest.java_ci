// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * Describes the settings to be used when encoding the input video into a desired output bitrate layer with the H.265
 * video codec.
 */
@Fluent
public final class H265Layer extends H265VideoLayer {
    /*
     * We currently support Main. Default is Auto.
     */
    private H265VideoProfile profile;

    /*
     * We currently support Level up to 6.2. The value can be Auto, or a number that matches the H.265 profile. If not
     * specified, the default is Auto, which lets the encoder choose the Level that is appropriate for this layer.
     */
    private String level;

    /*
     * The VBV buffer window length. The value should be in ISO 8601 format. The value should be in the range [0.1-100]
     * seconds. The default is 5 seconds (for example, PT5S).
     */
    private Duration bufferWindow;

    /*
     * The value of CRF to be used when encoding this layer. This setting takes effect when RateControlMode of video
     * codec is set at CRF mode. The range of CRF value is between 0 and 51, where lower values would result in better
     * quality, at the expense of higher file sizes. Higher values mean more compression, but at some point quality
     * degradation will be noticed. Default value is 28.
     */
    private Float crf;

    /*
     * The number of reference frames to be used when encoding this layer. If not specified, the encoder determines an
     * appropriate number based on the encoder complexity setting.
     */
    private Integer referenceFrames;

    /**
     * Creates an instance of H265Layer class.
     */
    public H265Layer() {
    }

    /**
     * Get the profile property: We currently support Main. Default is Auto.
     * 
     * @return the profile value.
     */
    public H265VideoProfile profile() {
        return this.profile;
    }

    /**
     * Set the profile property: We currently support Main. Default is Auto.
     * 
     * @param profile the profile value to set.
     * @return the H265Layer object itself.
     */
    public H265Layer withProfile(H265VideoProfile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Get the level property: We currently support Level up to 6.2. The value can be Auto, or a number that matches the
     * H.265 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate
     * for this layer.
     * 
     * @return the level value.
     */
    public String level() {
        return this.level;
    }

    /**
     * Set the level property: We currently support Level up to 6.2. The value can be Auto, or a number that matches the
     * H.265 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate
     * for this layer.
     * 
     * @param level the level value to set.
     * @return the H265Layer object itself.
     */
    public H265Layer withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Get the bufferWindow property: The VBV buffer window length. The value should be in ISO 8601 format. The value
     * should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
     * 
     * @return the bufferWindow value.
     */
    public Duration bufferWindow() {
        return this.bufferWindow;
    }

    /**
     * Set the bufferWindow property: The VBV buffer window length. The value should be in ISO 8601 format. The value
     * should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
     * 
     * @param bufferWindow the bufferWindow value to set.
     * @return the H265Layer object itself.
     */
    public H265Layer withBufferWindow(Duration bufferWindow) {
        this.bufferWindow = bufferWindow;
        return this;
    }

    /**
     * Get the crf property: The value of CRF to be used when encoding this layer. This setting takes effect when
     * RateControlMode of video codec is set at CRF mode. The range of CRF value is between 0 and 51, where lower values
     * would result in better quality, at the expense of higher file sizes. Higher values mean more compression, but at
     * some point quality degradation will be noticed. Default value is 28.
     * 
     * @return the crf value.
     */
    public Float crf() {
        return this.crf;
    }

    /**
     * Set the crf property: The value of CRF to be used when encoding this layer. This setting takes effect when
     * RateControlMode of video codec is set at CRF mode. The range of CRF value is between 0 and 51, where lower values
     * would result in better quality, at the expense of higher file sizes. Higher values mean more compression, but at
     * some point quality degradation will be noticed. Default value is 28.
     * 
     * @param crf the crf value to set.
     * @return the H265Layer object itself.
     */
    public H265Layer withCrf(Float crf) {
        this.crf = crf;
        return this;
    }

    /**
     * Get the referenceFrames property: The number of reference frames to be used when encoding this layer. If not
     * specified, the encoder determines an appropriate number based on the encoder complexity setting.
     * 
     * @return the referenceFrames value.
     */
    public Integer referenceFrames() {
        return this.referenceFrames;
    }

    /**
     * Set the referenceFrames property: The number of reference frames to be used when encoding this layer. If not
     * specified, the encoder determines an appropriate number based on the encoder complexity setting.
     * 
     * @param referenceFrames the referenceFrames value to set.
     * @return the H265Layer object itself.
     */
    public H265Layer withReferenceFrames(Integer referenceFrames) {
        this.referenceFrames = referenceFrames;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Layer withBitrate(int bitrate) {
        super.withBitrate(bitrate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Layer withMaxBitrate(Integer maxBitrate) {
        super.withMaxBitrate(maxBitrate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Layer withBFrames(Integer bFrames) {
        super.withBFrames(bFrames);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Layer withFrameRate(String frameRate) {
        super.withFrameRate(frameRate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Layer withSlices(Integer slices) {
        super.withSlices(slices);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Layer withAdaptiveBFrame(Boolean adaptiveBFrame) {
        super.withAdaptiveBFrame(adaptiveBFrame);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Layer withWidth(String width) {
        super.withWidth(width);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Layer withHeight(String height) {
        super.withHeight(height);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Layer withLabel(String label) {
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
        jsonWriter.writeIntField("bitrate", bitrate());
        jsonWriter.writeStringField("width", width());
        jsonWriter.writeStringField("height", height());
        jsonWriter.writeStringField("label", label());
        jsonWriter.writeNumberField("maxBitrate", maxBitrate());
        jsonWriter.writeNumberField("bFrames", bFrames());
        jsonWriter.writeStringField("frameRate", frameRate());
        jsonWriter.writeNumberField("slices", slices());
        jsonWriter.writeBooleanField("adaptiveBFrame", adaptiveBFrame());
        jsonWriter.writeStringField("profile", this.profile == null ? null : this.profile.toString());
        jsonWriter.writeStringField("level", this.level);
        jsonWriter.writeStringField("bufferWindow", CoreUtils.durationToStringWithDays(this.bufferWindow));
        jsonWriter.writeNumberField("crf", this.crf);
        jsonWriter.writeNumberField("referenceFrames", this.referenceFrames);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of H265Layer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of H265Layer if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the H265Layer.
     */
    public static H265Layer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            H265Layer deserializedH265Layer = new H265Layer();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bitrate".equals(fieldName)) {
                    deserializedH265Layer.withBitrate(reader.getInt());
                } else if ("width".equals(fieldName)) {
                    deserializedH265Layer.withWidth(reader.getString());
                } else if ("height".equals(fieldName)) {
                    deserializedH265Layer.withHeight(reader.getString());
                } else if ("label".equals(fieldName)) {
                    deserializedH265Layer.withLabel(reader.getString());
                } else if ("maxBitrate".equals(fieldName)) {
                    deserializedH265Layer.withMaxBitrate(reader.getNullable(JsonReader::getInt));
                } else if ("bFrames".equals(fieldName)) {
                    deserializedH265Layer.withBFrames(reader.getNullable(JsonReader::getInt));
                } else if ("frameRate".equals(fieldName)) {
                    deserializedH265Layer.withFrameRate(reader.getString());
                } else if ("slices".equals(fieldName)) {
                    deserializedH265Layer.withSlices(reader.getNullable(JsonReader::getInt));
                } else if ("adaptiveBFrame".equals(fieldName)) {
                    deserializedH265Layer.withAdaptiveBFrame(reader.getNullable(JsonReader::getBoolean));
                } else if ("profile".equals(fieldName)) {
                    deserializedH265Layer.profile = H265VideoProfile.fromString(reader.getString());
                } else if ("level".equals(fieldName)) {
                    deserializedH265Layer.level = reader.getString();
                } else if ("bufferWindow".equals(fieldName)) {
                    deserializedH265Layer.bufferWindow
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("crf".equals(fieldName)) {
                    deserializedH265Layer.crf = reader.getNullable(JsonReader::getFloat);
                } else if ("referenceFrames".equals(fieldName)) {
                    deserializedH265Layer.referenceFrames = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedH265Layer;
        });
    }
}
