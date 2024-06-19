// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryApplicationProperties;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Specifies information about the gallery Application Definition that you want to update.
 */
@Fluent
public final class GalleryApplicationUpdate extends UpdateResourceDefinition {
    /*
     * Describes the properties of a gallery Application Definition.
     */
    private GalleryApplicationProperties innerProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of GalleryApplicationUpdate class.
     */
    public GalleryApplicationUpdate() {
    }

    /**
     * Get the innerProperties property: Describes the properties of a gallery Application Definition.
     * 
     * @return the innerProperties value.
     */
    private GalleryApplicationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GalleryApplicationUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the description property: The description of this gallery Application Definition resource. This property is
     * updatable.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of this gallery Application Definition resource. This property is
     * updatable.
     * 
     * @param description the description value to set.
     * @return the GalleryApplicationUpdate object itself.
     */
    public GalleryApplicationUpdate withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryApplicationProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the eula property: The Eula agreement for the gallery Application Definition.
     * 
     * @return the eula value.
     */
    public String eula() {
        return this.innerProperties() == null ? null : this.innerProperties().eula();
    }

    /**
     * Set the eula property: The Eula agreement for the gallery Application Definition.
     * 
     * @param eula the eula value to set.
     * @return the GalleryApplicationUpdate object itself.
     */
    public GalleryApplicationUpdate withEula(String eula) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryApplicationProperties();
        }
        this.innerProperties().withEula(eula);
        return this;
    }

    /**
     * Get the privacyStatementUri property: The privacy statement uri.
     * 
     * @return the privacyStatementUri value.
     */
    public String privacyStatementUri() {
        return this.innerProperties() == null ? null : this.innerProperties().privacyStatementUri();
    }

    /**
     * Set the privacyStatementUri property: The privacy statement uri.
     * 
     * @param privacyStatementUri the privacyStatementUri value to set.
     * @return the GalleryApplicationUpdate object itself.
     */
    public GalleryApplicationUpdate withPrivacyStatementUri(String privacyStatementUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryApplicationProperties();
        }
        this.innerProperties().withPrivacyStatementUri(privacyStatementUri);
        return this;
    }

    /**
     * Get the releaseNoteUri property: The release note uri.
     * 
     * @return the releaseNoteUri value.
     */
    public String releaseNoteUri() {
        return this.innerProperties() == null ? null : this.innerProperties().releaseNoteUri();
    }

    /**
     * Set the releaseNoteUri property: The release note uri.
     * 
     * @param releaseNoteUri the releaseNoteUri value to set.
     * @return the GalleryApplicationUpdate object itself.
     */
    public GalleryApplicationUpdate withReleaseNoteUri(String releaseNoteUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryApplicationProperties();
        }
        this.innerProperties().withReleaseNoteUri(releaseNoteUri);
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery Application Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     * 
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.innerProperties() == null ? null : this.innerProperties().endOfLifeDate();
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery Application Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     * 
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the GalleryApplicationUpdate object itself.
     */
    public GalleryApplicationUpdate withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryApplicationProperties();
        }
        this.innerProperties().withEndOfLifeDate(endOfLifeDate);
        return this;
    }

    /**
     * Get the supportedOSType property: This property allows you to specify the supported type of the OS that
     * application is built for. Possible values are: **Windows,** **Linux.**.
     * 
     * @return the supportedOSType value.
     */
    public OperatingSystemTypes supportedOSType() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedOSType();
    }

    /**
     * Set the supportedOSType property: This property allows you to specify the supported type of the OS that
     * application is built for. Possible values are: **Windows,** **Linux.**.
     * 
     * @param supportedOSType the supportedOSType value to set.
     * @return the GalleryApplicationUpdate object itself.
     */
    public GalleryApplicationUpdate withSupportedOSType(OperatingSystemTypes supportedOSType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryApplicationProperties();
        }
        this.innerProperties().withSupportedOSType(supportedOSType);
        return this;
    }

    /**
     * Get the customActions property: A list of custom actions that can be performed with all of the Gallery
     * Application Versions within this Gallery Application.
     * 
     * @return the customActions value.
     */
    public List<GalleryApplicationCustomAction> customActions() {
        return this.innerProperties() == null ? null : this.innerProperties().customActions();
    }

    /**
     * Set the customActions property: A list of custom actions that can be performed with all of the Gallery
     * Application Versions within this Gallery Application.
     * 
     * @param customActions the customActions value to set.
     * @return the GalleryApplicationUpdate object itself.
     */
    public GalleryApplicationUpdate withCustomActions(List<GalleryApplicationCustomAction> customActions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryApplicationProperties();
        }
        this.innerProperties().withCustomActions(customActions);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GalleryApplicationUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GalleryApplicationUpdate if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GalleryApplicationUpdate.
     */
    public static GalleryApplicationUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GalleryApplicationUpdate deserializedGalleryApplicationUpdate = new GalleryApplicationUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedGalleryApplicationUpdate.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedGalleryApplicationUpdate.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedGalleryApplicationUpdate.type = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedGalleryApplicationUpdate.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedGalleryApplicationUpdate.innerProperties
                        = GalleryApplicationProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGalleryApplicationUpdate;
        });
    }
}
