// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.models.PeriodicTimerSourceInfo;
import com.azure.resourcemanager.databoxedge.generated.models.RoleSinkInfo;
import java.io.IOException;

/**
 * Periodic timer trigger properties.
 */
@Fluent
public final class PeriodicTimerProperties implements JsonSerializable<PeriodicTimerProperties> {
    /*
     * Periodic timer details.
     */
    private PeriodicTimerSourceInfo sourceInfo;

    /*
     * Role Sink information.
     */
    private RoleSinkInfo sinkInfo;

    /*
     * A custom context tag typically used to correlate the trigger against its usage. For example, if a periodic timer
     * trigger is intended for certain specific IoT modules in the device, the tag can be the name or the image URL of
     * the module.
     */
    private String customContextTag;

    /**
     * Creates an instance of PeriodicTimerProperties class.
     */
    public PeriodicTimerProperties() {
    }

    /**
     * Get the sourceInfo property: Periodic timer details.
     * 
     * @return the sourceInfo value.
     */
    public PeriodicTimerSourceInfo sourceInfo() {
        return this.sourceInfo;
    }

    /**
     * Set the sourceInfo property: Periodic timer details.
     * 
     * @param sourceInfo the sourceInfo value to set.
     * @return the PeriodicTimerProperties object itself.
     */
    public PeriodicTimerProperties withSourceInfo(PeriodicTimerSourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    /**
     * Get the sinkInfo property: Role Sink information.
     * 
     * @return the sinkInfo value.
     */
    public RoleSinkInfo sinkInfo() {
        return this.sinkInfo;
    }

    /**
     * Set the sinkInfo property: Role Sink information.
     * 
     * @param sinkInfo the sinkInfo value to set.
     * @return the PeriodicTimerProperties object itself.
     */
    public PeriodicTimerProperties withSinkInfo(RoleSinkInfo sinkInfo) {
        this.sinkInfo = sinkInfo;
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
        return this.customContextTag;
    }

    /**
     * Set the customContextTag property: A custom context tag typically used to correlate the trigger against its
     * usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the
     * tag can be the name or the image URL of the module.
     * 
     * @param customContextTag the customContextTag value to set.
     * @return the PeriodicTimerProperties object itself.
     */
    public PeriodicTimerProperties withCustomContextTag(String customContextTag) {
        this.customContextTag = customContextTag;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceInfo in model PeriodicTimerProperties"));
        } else {
            sourceInfo().validate();
        }
        if (sinkInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sinkInfo in model PeriodicTimerProperties"));
        } else {
            sinkInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PeriodicTimerProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("sourceInfo", this.sourceInfo);
        jsonWriter.writeJsonField("sinkInfo", this.sinkInfo);
        jsonWriter.writeStringField("customContextTag", this.customContextTag);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PeriodicTimerProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PeriodicTimerProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PeriodicTimerProperties.
     */
    public static PeriodicTimerProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PeriodicTimerProperties deserializedPeriodicTimerProperties = new PeriodicTimerProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceInfo".equals(fieldName)) {
                    deserializedPeriodicTimerProperties.sourceInfo = PeriodicTimerSourceInfo.fromJson(reader);
                } else if ("sinkInfo".equals(fieldName)) {
                    deserializedPeriodicTimerProperties.sinkInfo = RoleSinkInfo.fromJson(reader);
                } else if ("customContextTag".equals(fieldName)) {
                    deserializedPeriodicTimerProperties.customContextTag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPeriodicTimerProperties;
        });
    }
}
