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
 * Represents a text track in an asset. A text track is usually used for sparse data related to the audio or video
 * tracks.
 */
@Fluent
public final class TextTrack extends TrackBase {
    /*
     * The discriminator for derived types.
     */
    private String odataType = "#Microsoft.Media.TextTrack";

    /*
     * The file name to the source file. This file is located in the storage container of the asset.
     */
    private String fileName;

    /*
     * The display name of the text track on a video player. In HLS, this maps to the NAME attribute of EXT-X-MEDIA.
     */
    private String displayName;

    /*
     * The RFC5646 language code for the text track.
     */
    private String languageCode;

    /*
     * When PlayerVisibility is set to "Visible", the text track will be present in the DASH manifest or HLS playlist
     * when requested by a client. When the PlayerVisibility is set to "Hidden", the text will not be available to the
     * client. The default value is "Visible".
     */
    private Visibility playerVisibility;

    /*
     * The HLS specific setting for the text track.
     */
    private HlsSettings hlsSettings;

    /**
     * Creates an instance of TextTrack class.
     */
    public TextTrack() {
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
     * Get the fileName property: The file name to the source file. This file is located in the storage container of the
     * asset.
     * 
     * @return the fileName value.
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The file name to the source file. This file is located in the storage container of the
     * asset.
     * 
     * @param fileName the fileName value to set.
     * @return the TextTrack object itself.
     */
    public TextTrack withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the displayName property: The display name of the text track on a video player. In HLS, this maps to the NAME
     * attribute of EXT-X-MEDIA.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the text track on a video player. In HLS, this maps to the NAME
     * attribute of EXT-X-MEDIA.
     * 
     * @param displayName the displayName value to set.
     * @return the TextTrack object itself.
     */
    public TextTrack withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the languageCode property: The RFC5646 language code for the text track.
     * 
     * @return the languageCode value.
     */
    public String languageCode() {
        return this.languageCode;
    }

    /**
     * Get the playerVisibility property: When PlayerVisibility is set to "Visible", the text track will be present in
     * the DASH manifest or HLS playlist when requested by a client. When the PlayerVisibility is set to "Hidden", the
     * text will not be available to the client. The default value is "Visible".
     * 
     * @return the playerVisibility value.
     */
    public Visibility playerVisibility() {
        return this.playerVisibility;
    }

    /**
     * Set the playerVisibility property: When PlayerVisibility is set to "Visible", the text track will be present in
     * the DASH manifest or HLS playlist when requested by a client. When the PlayerVisibility is set to "Hidden", the
     * text will not be available to the client. The default value is "Visible".
     * 
     * @param playerVisibility the playerVisibility value to set.
     * @return the TextTrack object itself.
     */
    public TextTrack withPlayerVisibility(Visibility playerVisibility) {
        this.playerVisibility = playerVisibility;
        return this;
    }

    /**
     * Get the hlsSettings property: The HLS specific setting for the text track.
     * 
     * @return the hlsSettings value.
     */
    public HlsSettings hlsSettings() {
        return this.hlsSettings;
    }

    /**
     * Set the hlsSettings property: The HLS specific setting for the text track.
     * 
     * @param hlsSettings the hlsSettings value to set.
     * @return the TextTrack object itself.
     */
    public TextTrack withHlsSettings(HlsSettings hlsSettings) {
        this.hlsSettings = hlsSettings;
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
        if (hlsSettings() != null) {
            hlsSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", this.odataType);
        jsonWriter.writeStringField("fileName", this.fileName);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("playerVisibility",
            this.playerVisibility == null ? null : this.playerVisibility.toString());
        jsonWriter.writeJsonField("hlsSettings", this.hlsSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TextTrack from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TextTrack if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the TextTrack.
     */
    public static TextTrack fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TextTrack deserializedTextTrack = new TextTrack();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedTextTrack.odataType = reader.getString();
                } else if ("fileName".equals(fieldName)) {
                    deserializedTextTrack.fileName = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedTextTrack.displayName = reader.getString();
                } else if ("languageCode".equals(fieldName)) {
                    deserializedTextTrack.languageCode = reader.getString();
                } else if ("playerVisibility".equals(fieldName)) {
                    deserializedTextTrack.playerVisibility = Visibility.fromString(reader.getString());
                } else if ("hlsSettings".equals(fieldName)) {
                    deserializedTextTrack.hlsSettings = HlsSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTextTrack;
        });
    }
}
