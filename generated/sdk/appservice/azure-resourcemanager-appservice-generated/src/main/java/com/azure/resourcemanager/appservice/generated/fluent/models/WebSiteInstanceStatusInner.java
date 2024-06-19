// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.ContainerInfo;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.generated.models.SiteRuntimeState;
import java.io.IOException;
import java.util.Map;

/**
 * The WebSiteInstanceStatus model.
 */
@Fluent
public final class WebSiteInstanceStatusInner extends ProxyOnlyResource {
    /*
     * WebSiteInstanceStatus resource specific properties
     */
    private WebSiteInstanceStatusProperties innerProperties;

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
     * Creates an instance of WebSiteInstanceStatusInner class.
     */
    public WebSiteInstanceStatusInner() {
    }

    /**
     * Get the innerProperties property: WebSiteInstanceStatus resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private WebSiteInstanceStatusProperties innerProperties() {
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
    public WebSiteInstanceStatusInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the state property: The state property.
     * 
     * @return the state value.
     */
    public SiteRuntimeState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: The state property.
     * 
     * @param state the state value to set.
     * @return the WebSiteInstanceStatusInner object itself.
     */
    public WebSiteInstanceStatusInner withState(SiteRuntimeState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebSiteInstanceStatusProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the statusUrl property: Link to the GetStatusApi in Kudu.
     * 
     * @return the statusUrl value.
     */
    public String statusUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().statusUrl();
    }

    /**
     * Set the statusUrl property: Link to the GetStatusApi in Kudu.
     * 
     * @param statusUrl the statusUrl value to set.
     * @return the WebSiteInstanceStatusInner object itself.
     */
    public WebSiteInstanceStatusInner withStatusUrl(String statusUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebSiteInstanceStatusProperties();
        }
        this.innerProperties().withStatusUrl(statusUrl);
        return this;
    }

    /**
     * Get the detectorUrl property: Link to the Diagnose and Solve Portal.
     * 
     * @return the detectorUrl value.
     */
    public String detectorUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().detectorUrl();
    }

    /**
     * Set the detectorUrl property: Link to the Diagnose and Solve Portal.
     * 
     * @param detectorUrl the detectorUrl value to set.
     * @return the WebSiteInstanceStatusInner object itself.
     */
    public WebSiteInstanceStatusInner withDetectorUrl(String detectorUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebSiteInstanceStatusProperties();
        }
        this.innerProperties().withDetectorUrl(detectorUrl);
        return this;
    }

    /**
     * Get the consoleUrl property: Link to the console to web app instance.
     * 
     * @return the consoleUrl value.
     */
    public String consoleUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().consoleUrl();
    }

    /**
     * Set the consoleUrl property: Link to the console to web app instance.
     * 
     * @param consoleUrl the consoleUrl value to set.
     * @return the WebSiteInstanceStatusInner object itself.
     */
    public WebSiteInstanceStatusInner withConsoleUrl(String consoleUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebSiteInstanceStatusProperties();
        }
        this.innerProperties().withConsoleUrl(consoleUrl);
        return this;
    }

    /**
     * Get the healthCheckUrl property: Link to the console to web app instance.
     * 
     * @return the healthCheckUrl value.
     */
    public String healthCheckUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().healthCheckUrl();
    }

    /**
     * Set the healthCheckUrl property: Link to the console to web app instance.
     * 
     * @param healthCheckUrl the healthCheckUrl value to set.
     * @return the WebSiteInstanceStatusInner object itself.
     */
    public WebSiteInstanceStatusInner withHealthCheckUrl(String healthCheckUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebSiteInstanceStatusProperties();
        }
        this.innerProperties().withHealthCheckUrl(healthCheckUrl);
        return this;
    }

    /**
     * Get the containers property: Dictionary of &lt;ContainerInfo&gt;.
     * 
     * @return the containers value.
     */
    public Map<String, ContainerInfo> containers() {
        return this.innerProperties() == null ? null : this.innerProperties().containers();
    }

    /**
     * Set the containers property: Dictionary of &lt;ContainerInfo&gt;.
     * 
     * @param containers the containers value to set.
     * @return the WebSiteInstanceStatusInner object itself.
     */
    public WebSiteInstanceStatusInner withContainers(Map<String, ContainerInfo> containers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebSiteInstanceStatusProperties();
        }
        this.innerProperties().withContainers(containers);
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
     * Reads an instance of WebSiteInstanceStatusInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebSiteInstanceStatusInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WebSiteInstanceStatusInner.
     */
    public static WebSiteInstanceStatusInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebSiteInstanceStatusInner deserializedWebSiteInstanceStatusInner = new WebSiteInstanceStatusInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedWebSiteInstanceStatusInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedWebSiteInstanceStatusInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedWebSiteInstanceStatusInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedWebSiteInstanceStatusInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedWebSiteInstanceStatusInner.innerProperties
                        = WebSiteInstanceStatusProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebSiteInstanceStatusInner;
        });
    }
}
