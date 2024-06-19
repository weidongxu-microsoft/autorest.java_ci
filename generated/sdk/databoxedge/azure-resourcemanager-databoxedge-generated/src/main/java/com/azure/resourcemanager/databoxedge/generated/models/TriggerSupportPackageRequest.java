// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.SupportPackageRequestProperties;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The request object for trigger support package.
 */
@Fluent
public final class TriggerSupportPackageRequest extends ArmBaseModel {
    /*
     * The TriggerSupportPackageRequest properties.
     */
    private SupportPackageRequestProperties innerProperties = new SupportPackageRequestProperties();

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
     * Creates an instance of TriggerSupportPackageRequest class.
     */
    public TriggerSupportPackageRequest() {
    }

    /**
     * Get the innerProperties property: The TriggerSupportPackageRequest properties.
     * 
     * @return the innerProperties value.
     */
    private SupportPackageRequestProperties innerProperties() {
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
     * Get the minimumTimestamp property: MinimumTimeStamp from where logs need to be collected.
     * 
     * @return the minimumTimestamp value.
     */
    public OffsetDateTime minimumTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumTimestamp();
    }

    /**
     * Set the minimumTimestamp property: MinimumTimeStamp from where logs need to be collected.
     * 
     * @param minimumTimestamp the minimumTimestamp value to set.
     * @return the TriggerSupportPackageRequest object itself.
     */
    public TriggerSupportPackageRequest withMinimumTimestamp(OffsetDateTime minimumTimestamp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportPackageRequestProperties();
        }
        this.innerProperties().withMinimumTimestamp(minimumTimestamp);
        return this;
    }

    /**
     * Get the maximumTimestamp property: Start of the timespan of the log collection.
     * 
     * @return the maximumTimestamp value.
     */
    public OffsetDateTime maximumTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().maximumTimestamp();
    }

    /**
     * Set the maximumTimestamp property: Start of the timespan of the log collection.
     * 
     * @param maximumTimestamp the maximumTimestamp value to set.
     * @return the TriggerSupportPackageRequest object itself.
     */
    public TriggerSupportPackageRequest withMaximumTimestamp(OffsetDateTime maximumTimestamp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportPackageRequestProperties();
        }
        this.innerProperties().withMaximumTimestamp(maximumTimestamp);
        return this;
    }

    /**
     * Get the include property: Type of files, which need to be included in the logs
     * This will contain the type of logs (Default/DefaultWithDumps/None/All/DefaultWithArchived)
     * or a comma separated list of log types that are required.
     * 
     * @return the include value.
     */
    public String include() {
        return this.innerProperties() == null ? null : this.innerProperties().include();
    }

    /**
     * Set the include property: Type of files, which need to be included in the logs
     * This will contain the type of logs (Default/DefaultWithDumps/None/All/DefaultWithArchived)
     * or a comma separated list of log types that are required.
     * 
     * @param include the include value to set.
     * @return the TriggerSupportPackageRequest object itself.
     */
    public TriggerSupportPackageRequest withInclude(String include) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportPackageRequestProperties();
        }
        this.innerProperties().withInclude(include);
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
                    "Missing required property innerProperties in model TriggerSupportPackageRequest"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TriggerSupportPackageRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TriggerSupportPackageRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TriggerSupportPackageRequest if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TriggerSupportPackageRequest.
     */
    public static TriggerSupportPackageRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TriggerSupportPackageRequest deserializedTriggerSupportPackageRequest = new TriggerSupportPackageRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedTriggerSupportPackageRequest.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedTriggerSupportPackageRequest.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedTriggerSupportPackageRequest.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedTriggerSupportPackageRequest.innerProperties
                        = SupportPackageRequestProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTriggerSupportPackageRequest;
        });
    }
}
