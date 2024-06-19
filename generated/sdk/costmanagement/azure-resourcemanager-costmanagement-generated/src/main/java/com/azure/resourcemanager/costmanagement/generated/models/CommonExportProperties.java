// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The common properties of the export.
 */
@Fluent
public class CommonExportProperties implements JsonSerializable<CommonExportProperties> {
    /*
     * The format of the export being delivered.
     */
    private FormatType format;

    /*
     * Has delivery information for the export.
     */
    private ExportDeliveryInfo deliveryInfo;

    /*
     * Has definition for the export.
     */
    private ExportDefinition definition;

    /**
     * Creates an instance of CommonExportProperties class.
     */
    public CommonExportProperties() {
    }

    /**
     * Get the format property: The format of the export being delivered.
     * 
     * @return the format value.
     */
    public FormatType format() {
        return this.format;
    }

    /**
     * Set the format property: The format of the export being delivered.
     * 
     * @param format the format value to set.
     * @return the CommonExportProperties object itself.
     */
    public CommonExportProperties withFormat(FormatType format) {
        this.format = format;
        return this;
    }

    /**
     * Get the deliveryInfo property: Has delivery information for the export.
     * 
     * @return the deliveryInfo value.
     */
    public ExportDeliveryInfo deliveryInfo() {
        return this.deliveryInfo;
    }

    /**
     * Set the deliveryInfo property: Has delivery information for the export.
     * 
     * @param deliveryInfo the deliveryInfo value to set.
     * @return the CommonExportProperties object itself.
     */
    public CommonExportProperties withDeliveryInfo(ExportDeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
        return this;
    }

    /**
     * Get the definition property: Has definition for the export.
     * 
     * @return the definition value.
     */
    public ExportDefinition definition() {
        return this.definition;
    }

    /**
     * Set the definition property: Has definition for the export.
     * 
     * @param definition the definition value to set.
     * @return the CommonExportProperties object itself.
     */
    public CommonExportProperties withDefinition(ExportDefinition definition) {
        this.definition = definition;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deliveryInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property deliveryInfo in model CommonExportProperties"));
        } else {
            deliveryInfo().validate();
        }
        if (definition() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property definition in model CommonExportProperties"));
        } else {
            definition().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CommonExportProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("deliveryInfo", this.deliveryInfo);
        jsonWriter.writeJsonField("definition", this.definition);
        jsonWriter.writeStringField("format", this.format == null ? null : this.format.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CommonExportProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CommonExportProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CommonExportProperties.
     */
    public static CommonExportProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommonExportProperties deserializedCommonExportProperties = new CommonExportProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("deliveryInfo".equals(fieldName)) {
                    deserializedCommonExportProperties.deliveryInfo = ExportDeliveryInfo.fromJson(reader);
                } else if ("definition".equals(fieldName)) {
                    deserializedCommonExportProperties.definition = ExportDefinition.fromJson(reader);
                } else if ("format".equals(fieldName)) {
                    deserializedCommonExportProperties.format = FormatType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCommonExportProperties;
        });
    }
}
