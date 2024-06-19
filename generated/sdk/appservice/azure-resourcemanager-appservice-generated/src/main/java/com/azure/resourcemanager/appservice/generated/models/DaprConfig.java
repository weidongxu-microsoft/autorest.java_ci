// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * App Dapr configuration.
 */
@Fluent
public final class DaprConfig implements JsonSerializable<DaprConfig> {
    /*
     * Boolean indicating if the Dapr side car is enabled
     */
    private Boolean enabled;

    /*
     * Dapr application identifier
     */
    private String appId;

    /*
     * Tells Dapr which port your application is listening on
     */
    private Integer appPort;

    /*
     * Dapr max size of http header read buffer in KB to handle when sending multi-KB headers. Default is 65KB.
     */
    private Integer httpReadBufferSize;

    /*
     * Increasing max size of request body http servers parameter in MB to handle uploading of big files. Default is 4
     * MB.
     */
    private Integer httpMaxRequestSize;

    /*
     * Sets the log level for the Dapr sidecar. Allowed values are debug, info, warn, error. Default is info.
     */
    private DaprLogLevel logLevel;

    /*
     * Enables API logging for the Dapr sidecar
     */
    private Boolean enableApiLogging;

    /**
     * Creates an instance of DaprConfig class.
     */
    public DaprConfig() {
    }

    /**
     * Get the enabled property: Boolean indicating if the Dapr side car is enabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Boolean indicating if the Dapr side car is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the DaprConfig object itself.
     */
    public DaprConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the appId property: Dapr application identifier.
     * 
     * @return the appId value.
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the appId property: Dapr application identifier.
     * 
     * @param appId the appId value to set.
     * @return the DaprConfig object itself.
     */
    public DaprConfig withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the appPort property: Tells Dapr which port your application is listening on.
     * 
     * @return the appPort value.
     */
    public Integer appPort() {
        return this.appPort;
    }

    /**
     * Set the appPort property: Tells Dapr which port your application is listening on.
     * 
     * @param appPort the appPort value to set.
     * @return the DaprConfig object itself.
     */
    public DaprConfig withAppPort(Integer appPort) {
        this.appPort = appPort;
        return this;
    }

    /**
     * Get the httpReadBufferSize property: Dapr max size of http header read buffer in KB to handle when sending
     * multi-KB headers. Default is 65KB.
     * 
     * @return the httpReadBufferSize value.
     */
    public Integer httpReadBufferSize() {
        return this.httpReadBufferSize;
    }

    /**
     * Set the httpReadBufferSize property: Dapr max size of http header read buffer in KB to handle when sending
     * multi-KB headers. Default is 65KB.
     * 
     * @param httpReadBufferSize the httpReadBufferSize value to set.
     * @return the DaprConfig object itself.
     */
    public DaprConfig withHttpReadBufferSize(Integer httpReadBufferSize) {
        this.httpReadBufferSize = httpReadBufferSize;
        return this;
    }

    /**
     * Get the httpMaxRequestSize property: Increasing max size of request body http servers parameter in MB to handle
     * uploading of big files. Default is 4 MB.
     * 
     * @return the httpMaxRequestSize value.
     */
    public Integer httpMaxRequestSize() {
        return this.httpMaxRequestSize;
    }

    /**
     * Set the httpMaxRequestSize property: Increasing max size of request body http servers parameter in MB to handle
     * uploading of big files. Default is 4 MB.
     * 
     * @param httpMaxRequestSize the httpMaxRequestSize value to set.
     * @return the DaprConfig object itself.
     */
    public DaprConfig withHttpMaxRequestSize(Integer httpMaxRequestSize) {
        this.httpMaxRequestSize = httpMaxRequestSize;
        return this;
    }

    /**
     * Get the logLevel property: Sets the log level for the Dapr sidecar. Allowed values are debug, info, warn, error.
     * Default is info.
     * 
     * @return the logLevel value.
     */
    public DaprLogLevel logLevel() {
        return this.logLevel;
    }

    /**
     * Set the logLevel property: Sets the log level for the Dapr sidecar. Allowed values are debug, info, warn, error.
     * Default is info.
     * 
     * @param logLevel the logLevel value to set.
     * @return the DaprConfig object itself.
     */
    public DaprConfig withLogLevel(DaprLogLevel logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * Get the enableApiLogging property: Enables API logging for the Dapr sidecar.
     * 
     * @return the enableApiLogging value.
     */
    public Boolean enableApiLogging() {
        return this.enableApiLogging;
    }

    /**
     * Set the enableApiLogging property: Enables API logging for the Dapr sidecar.
     * 
     * @param enableApiLogging the enableApiLogging value to set.
     * @return the DaprConfig object itself.
     */
    public DaprConfig withEnableApiLogging(Boolean enableApiLogging) {
        this.enableApiLogging = enableApiLogging;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("appId", this.appId);
        jsonWriter.writeNumberField("appPort", this.appPort);
        jsonWriter.writeNumberField("httpReadBufferSize", this.httpReadBufferSize);
        jsonWriter.writeNumberField("httpMaxRequestSize", this.httpMaxRequestSize);
        jsonWriter.writeStringField("logLevel", this.logLevel == null ? null : this.logLevel.toString());
        jsonWriter.writeBooleanField("enableApiLogging", this.enableApiLogging);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DaprConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DaprConfig if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the DaprConfig.
     */
    public static DaprConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DaprConfig deserializedDaprConfig = new DaprConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedDaprConfig.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("appId".equals(fieldName)) {
                    deserializedDaprConfig.appId = reader.getString();
                } else if ("appPort".equals(fieldName)) {
                    deserializedDaprConfig.appPort = reader.getNullable(JsonReader::getInt);
                } else if ("httpReadBufferSize".equals(fieldName)) {
                    deserializedDaprConfig.httpReadBufferSize = reader.getNullable(JsonReader::getInt);
                } else if ("httpMaxRequestSize".equals(fieldName)) {
                    deserializedDaprConfig.httpMaxRequestSize = reader.getNullable(JsonReader::getInt);
                } else if ("logLevel".equals(fieldName)) {
                    deserializedDaprConfig.logLevel = DaprLogLevel.fromString(reader.getString());
                } else if ("enableApiLogging".equals(fieldName)) {
                    deserializedDaprConfig.enableApiLogging = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDaprConfig;
        });
    }
}
