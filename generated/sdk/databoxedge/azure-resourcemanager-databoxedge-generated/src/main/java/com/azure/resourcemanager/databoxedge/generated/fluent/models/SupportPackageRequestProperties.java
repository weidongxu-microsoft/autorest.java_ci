// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The share properties.
 */
@Fluent
public final class SupportPackageRequestProperties implements JsonSerializable<SupportPackageRequestProperties> {
    /*
     * MinimumTimeStamp from where logs need to be collected
     */
    private OffsetDateTime minimumTimestamp;

    /*
     * Start of the timespan of the log collection
     */
    private OffsetDateTime maximumTimestamp;

    /*
     * Type of files, which need to be included in the logs
     * This will contain the type of logs (Default/DefaultWithDumps/None/All/DefaultWithArchived)
     * or a comma separated list of log types that are required
     */
    private String include;

    /**
     * Creates an instance of SupportPackageRequestProperties class.
     */
    public SupportPackageRequestProperties() {
    }

    /**
     * Get the minimumTimestamp property: MinimumTimeStamp from where logs need to be collected.
     * 
     * @return the minimumTimestamp value.
     */
    public OffsetDateTime minimumTimestamp() {
        return this.minimumTimestamp;
    }

    /**
     * Set the minimumTimestamp property: MinimumTimeStamp from where logs need to be collected.
     * 
     * @param minimumTimestamp the minimumTimestamp value to set.
     * @return the SupportPackageRequestProperties object itself.
     */
    public SupportPackageRequestProperties withMinimumTimestamp(OffsetDateTime minimumTimestamp) {
        this.minimumTimestamp = minimumTimestamp;
        return this;
    }

    /**
     * Get the maximumTimestamp property: Start of the timespan of the log collection.
     * 
     * @return the maximumTimestamp value.
     */
    public OffsetDateTime maximumTimestamp() {
        return this.maximumTimestamp;
    }

    /**
     * Set the maximumTimestamp property: Start of the timespan of the log collection.
     * 
     * @param maximumTimestamp the maximumTimestamp value to set.
     * @return the SupportPackageRequestProperties object itself.
     */
    public SupportPackageRequestProperties withMaximumTimestamp(OffsetDateTime maximumTimestamp) {
        this.maximumTimestamp = maximumTimestamp;
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
        return this.include;
    }

    /**
     * Set the include property: Type of files, which need to be included in the logs
     * This will contain the type of logs (Default/DefaultWithDumps/None/All/DefaultWithArchived)
     * or a comma separated list of log types that are required.
     * 
     * @param include the include value to set.
     * @return the SupportPackageRequestProperties object itself.
     */
    public SupportPackageRequestProperties withInclude(String include) {
        this.include = include;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("minimumTimeStamp",
            this.minimumTimestamp == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.minimumTimestamp));
        jsonWriter.writeStringField("maximumTimeStamp",
            this.maximumTimestamp == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.maximumTimestamp));
        jsonWriter.writeStringField("include", this.include);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SupportPackageRequestProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SupportPackageRequestProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SupportPackageRequestProperties.
     */
    public static SupportPackageRequestProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SupportPackageRequestProperties deserializedSupportPackageRequestProperties
                = new SupportPackageRequestProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("minimumTimeStamp".equals(fieldName)) {
                    deserializedSupportPackageRequestProperties.minimumTimestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("maximumTimeStamp".equals(fieldName)) {
                    deserializedSupportPackageRequestProperties.maximumTimestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("include".equals(fieldName)) {
                    deserializedSupportPackageRequestProperties.include = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSupportPackageRequestProperties;
        });
    }
}
