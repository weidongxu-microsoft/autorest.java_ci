// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.FileTriggerProperties;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.TriggerInner;
import java.io.IOException;

/**
 * Trigger details.
 */
@Fluent
public final class FileEventTrigger extends TriggerInner {
    /*
     * Trigger Kind.
     */
    private TriggerEventType kind = TriggerEventType.FILE_EVENT;

    /*
     * File trigger properties.
     */
    private FileTriggerProperties innerProperties = new FileTriggerProperties();

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

    /*
     * Metadata pertaining to creation and last modification of Trigger
     */
    private SystemData systemData;

    /**
     * Creates an instance of FileEventTrigger class.
     */
    public FileEventTrigger() {
    }

    /**
     * Get the kind property: Trigger Kind.
     * 
     * @return the kind value.
     */
    @Override
    public TriggerEventType kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: File trigger properties.
     * 
     * @return the innerProperties value.
     */
    private FileTriggerProperties innerProperties() {
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
     * Get the systemData property: Metadata pertaining to creation and last modification of Trigger.
     * 
     * @return the systemData value.
     */
    @Override
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the sourceInfo property: File event source details.
     * 
     * @return the sourceInfo value.
     */
    public FileSourceInfo sourceInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceInfo();
    }

    /**
     * Set the sourceInfo property: File event source details.
     * 
     * @param sourceInfo the sourceInfo value to set.
     * @return the FileEventTrigger object itself.
     */
    public FileEventTrigger withSourceInfo(FileSourceInfo sourceInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileTriggerProperties();
        }
        this.innerProperties().withSourceInfo(sourceInfo);
        return this;
    }

    /**
     * Get the sinkInfo property: Role sink info.
     * 
     * @return the sinkInfo value.
     */
    public RoleSinkInfo sinkInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().sinkInfo();
    }

    /**
     * Set the sinkInfo property: Role sink info.
     * 
     * @param sinkInfo the sinkInfo value to set.
     * @return the FileEventTrigger object itself.
     */
    public FileEventTrigger withSinkInfo(RoleSinkInfo sinkInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileTriggerProperties();
        }
        this.innerProperties().withSinkInfo(sinkInfo);
        return this;
    }

    /**
     * Get the customContextTag property: A custom context tag typically used to correlate the trigger against its
     * usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the
     * tag can be the name or the image URL of the module.
     * 
     * @return the customContextTag value.
     */
    public String customContextTag() {
        return this.innerProperties() == null ? null : this.innerProperties().customContextTag();
    }

    /**
     * Set the customContextTag property: A custom context tag typically used to correlate the trigger against its
     * usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the
     * tag can be the name or the image URL of the module.
     * 
     * @param customContextTag the customContextTag value to set.
     * @return the FileEventTrigger object itself.
     */
    public FileEventTrigger withCustomContextTag(String customContextTag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileTriggerProperties();
        }
        this.innerProperties().withCustomContextTag(customContextTag);
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
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model FileEventTrigger"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FileEventTrigger.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FileEventTrigger from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FileEventTrigger if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FileEventTrigger.
     */
    public static FileEventTrigger fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FileEventTrigger deserializedFileEventTrigger = new FileEventTrigger();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedFileEventTrigger.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedFileEventTrigger.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedFileEventTrigger.type = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedFileEventTrigger.systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedFileEventTrigger.innerProperties = FileTriggerProperties.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedFileEventTrigger.kind = TriggerEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFileEventTrigger;
        });
    }
}
