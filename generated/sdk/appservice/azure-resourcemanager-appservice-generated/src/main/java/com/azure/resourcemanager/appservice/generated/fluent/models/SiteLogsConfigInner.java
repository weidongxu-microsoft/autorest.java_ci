// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.ApplicationLogsConfig;
import com.azure.resourcemanager.appservice.generated.models.EnabledConfig;
import com.azure.resourcemanager.appservice.generated.models.HttpLogsConfig;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import java.io.IOException;

/**
 * Configuration of App Service site logs.
 */
@Fluent
public final class SiteLogsConfigInner extends ProxyOnlyResource {
    /*
     * SiteLogsConfig resource specific properties
     */
    private SiteLogsConfigProperties innerProperties;

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
     * Creates an instance of SiteLogsConfigInner class.
     */
    public SiteLogsConfigInner() {
    }

    /**
     * Get the innerProperties property: SiteLogsConfig resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private SiteLogsConfigProperties innerProperties() {
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
    public SiteLogsConfigInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the applicationLogs property: Application logs configuration.
     * 
     * @return the applicationLogs value.
     */
    public ApplicationLogsConfig applicationLogs() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationLogs();
    }

    /**
     * Set the applicationLogs property: Application logs configuration.
     * 
     * @param applicationLogs the applicationLogs value to set.
     * @return the SiteLogsConfigInner object itself.
     */
    public SiteLogsConfigInner withApplicationLogs(ApplicationLogsConfig applicationLogs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SiteLogsConfigProperties();
        }
        this.innerProperties().withApplicationLogs(applicationLogs);
        return this;
    }

    /**
     * Get the httpLogs property: HTTP logs configuration.
     * 
     * @return the httpLogs value.
     */
    public HttpLogsConfig httpLogs() {
        return this.innerProperties() == null ? null : this.innerProperties().httpLogs();
    }

    /**
     * Set the httpLogs property: HTTP logs configuration.
     * 
     * @param httpLogs the httpLogs value to set.
     * @return the SiteLogsConfigInner object itself.
     */
    public SiteLogsConfigInner withHttpLogs(HttpLogsConfig httpLogs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SiteLogsConfigProperties();
        }
        this.innerProperties().withHttpLogs(httpLogs);
        return this;
    }

    /**
     * Get the failedRequestsTracing property: Failed requests tracing configuration.
     * 
     * @return the failedRequestsTracing value.
     */
    public EnabledConfig failedRequestsTracing() {
        return this.innerProperties() == null ? null : this.innerProperties().failedRequestsTracing();
    }

    /**
     * Set the failedRequestsTracing property: Failed requests tracing configuration.
     * 
     * @param failedRequestsTracing the failedRequestsTracing value to set.
     * @return the SiteLogsConfigInner object itself.
     */
    public SiteLogsConfigInner withFailedRequestsTracing(EnabledConfig failedRequestsTracing) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SiteLogsConfigProperties();
        }
        this.innerProperties().withFailedRequestsTracing(failedRequestsTracing);
        return this;
    }

    /**
     * Get the detailedErrorMessages property: Detailed error messages configuration.
     * 
     * @return the detailedErrorMessages value.
     */
    public EnabledConfig detailedErrorMessages() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedErrorMessages();
    }

    /**
     * Set the detailedErrorMessages property: Detailed error messages configuration.
     * 
     * @param detailedErrorMessages the detailedErrorMessages value to set.
     * @return the SiteLogsConfigInner object itself.
     */
    public SiteLogsConfigInner withDetailedErrorMessages(EnabledConfig detailedErrorMessages) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SiteLogsConfigProperties();
        }
        this.innerProperties().withDetailedErrorMessages(detailedErrorMessages);
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
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SiteLogsConfigInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SiteLogsConfigInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SiteLogsConfigInner.
     */
    public static SiteLogsConfigInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SiteLogsConfigInner deserializedSiteLogsConfigInner = new SiteLogsConfigInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSiteLogsConfigInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSiteLogsConfigInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSiteLogsConfigInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedSiteLogsConfigInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedSiteLogsConfigInner.innerProperties = SiteLogsConfigProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSiteLogsConfigInner;
        });
    }
}
