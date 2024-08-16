// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

/**
 * Describes all the properties for encoding a video with the H.265 codec.
 */
@Fluent
public final class H265Video extends Video {
    /*
     * Specifies whether or not the encoder should insert key frames at scene changes. If not specified, the default is
     * false. This flag should be set to true only when the encoder is being configured to produce a single output
     * video.
     */
    private Boolean sceneChangeDetection;

    /*
     * Tells the encoder how to choose its encoding settings. Quality will provide for a higher compression ratio but at
     * a higher cost and longer compute time. Speed will produce a relatively larger file but is faster and more
     * economical. The default value is Balanced.
     */
    private H265Complexity complexity;

    /*
     * The collection of output H.265 layers to be produced by the encoder.
     */
    private List<H265Layer> layers;

    /**
     * Creates an instance of H265Video class.
     */
    public H265Video() {
        this.odataType = "#Microsoft.Media.H265Video";
    }

    /**
     * Get the sceneChangeDetection property: Specifies whether or not the encoder should insert key frames at scene
     * changes. If not specified, the default is false. This flag should be set to true only when the encoder is being
     * configured to produce a single output video.
     * 
     * @return the sceneChangeDetection value.
     */
    public Boolean sceneChangeDetection() {
        return this.sceneChangeDetection;
    }

    /**
     * Set the sceneChangeDetection property: Specifies whether or not the encoder should insert key frames at scene
     * changes. If not specified, the default is false. This flag should be set to true only when the encoder is being
     * configured to produce a single output video.
     * 
     * @param sceneChangeDetection the sceneChangeDetection value to set.
     * @return the H265Video object itself.
     */
    public H265Video withSceneChangeDetection(Boolean sceneChangeDetection) {
        this.sceneChangeDetection = sceneChangeDetection;
        return this;
    }

    /**
     * Get the complexity property: Tells the encoder how to choose its encoding settings. Quality will provide for a
     * higher compression ratio but at a higher cost and longer compute time. Speed will produce a relatively larger
     * file but is faster and more economical. The default value is Balanced.
     * 
     * @return the complexity value.
     */
    public H265Complexity complexity() {
        return this.complexity;
    }

    /**
     * Set the complexity property: Tells the encoder how to choose its encoding settings. Quality will provide for a
     * higher compression ratio but at a higher cost and longer compute time. Speed will produce a relatively larger
     * file but is faster and more economical. The default value is Balanced.
     * 
     * @param complexity the complexity value to set.
     * @return the H265Video object itself.
     */
    public H265Video withComplexity(H265Complexity complexity) {
        this.complexity = complexity;
        return this;
    }

    /**
     * Get the layers property: The collection of output H.265 layers to be produced by the encoder.
     * 
     * @return the layers value.
     */
    public List<H265Layer> layers() {
        return this.layers;
    }

    /**
     * Set the layers property: The collection of output H.265 layers to be produced by the encoder.
     * 
     * @param layers the layers value to set.
     * @return the H265Video object itself.
     */
    public H265Video withLayers(List<H265Layer> layers) {
        this.layers = layers;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Video withKeyFrameInterval(Duration keyFrameInterval) {
        super.withKeyFrameInterval(keyFrameInterval);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Video withStretchMode(StretchMode stretchMode) {
        super.withStretchMode(stretchMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Video withSyncMode(VideoSyncMode syncMode) {
        super.withSyncMode(syncMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public H265Video withLabel(String label) {
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
        if (layers() != null) {
            layers().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        jsonWriter.writeBooleanField("sceneChangeDetection", this.sceneChangeDetection);
        jsonWriter.writeStringField("complexity", this.complexity == null ? null : this.complexity.toString());
        jsonWriter.writeArrayField("layers", this.layers, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of H265Video from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of H265Video if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the H265Video.
     */
    public static H265Video fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            H265Video deserializedH265Video = new H265Video();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("label".equals(fieldName)) {
                    deserializedH265Video.withLabel(reader.getString());
                } else if ("keyFrameInterval".equals(fieldName)) {
                    deserializedH265Video.withKeyFrameInterval(
                        reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString())));
                } else if ("stretchMode".equals(fieldName)) {
                    deserializedH265Video.withStretchMode(StretchMode.fromString(reader.getString()));
                } else if ("syncMode".equals(fieldName)) {
                    deserializedH265Video.withSyncMode(VideoSyncMode.fromString(reader.getString()));
                } else if ("@odata.type".equals(fieldName)) {
                    deserializedH265Video.odataType = reader.getString();
                } else if ("sceneChangeDetection".equals(fieldName)) {
                    deserializedH265Video.sceneChangeDetection = reader.getNullable(JsonReader::getBoolean);
                } else if ("complexity".equals(fieldName)) {
                    deserializedH265Video.complexity = H265Complexity.fromString(reader.getString());
                } else if ("layers".equals(fieldName)) {
                    List<H265Layer> layers = reader.readArray(reader1 -> H265Layer.fromJson(reader1));
                    deserializedH265Video.layers = layers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedH265Video;
        });
    }
}
