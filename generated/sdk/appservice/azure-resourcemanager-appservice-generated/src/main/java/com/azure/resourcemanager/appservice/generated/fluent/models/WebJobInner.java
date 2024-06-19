// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.generated.models.WebJobType;
import java.io.IOException;
import java.util.Map;

/**
 * Web Job Information.
 */
@Fluent
public final class WebJobInner extends ProxyOnlyResource {
    /*
     * WebJob resource specific properties
     */
    private WebJobProperties innerProperties;

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
     * Creates an instance of WebJobInner class.
     */
    public WebJobInner() {
    }

    /**
     * Get the innerProperties property: WebJob resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private WebJobProperties innerProperties() {
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
    public WebJobInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the runCommand property: Run command.
     * 
     * @return the runCommand value.
     */
    public String runCommand() {
        return this.innerProperties() == null ? null : this.innerProperties().runCommand();
    }

    /**
     * Set the runCommand property: Run command.
     * 
     * @param runCommand the runCommand value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withRunCommand(String runCommand) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withRunCommand(runCommand);
        return this;
    }

    /**
     * Get the url property: Job URL.
     * 
     * @return the url value.
     */
    public String url() {
        return this.innerProperties() == null ? null : this.innerProperties().url();
    }

    /**
     * Set the url property: Job URL.
     * 
     * @param url the url value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withUrl(String url) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withUrl(url);
        return this;
    }

    /**
     * Get the extraInfoUrl property: Extra Info URL.
     * 
     * @return the extraInfoUrl value.
     */
    public String extraInfoUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().extraInfoUrl();
    }

    /**
     * Set the extraInfoUrl property: Extra Info URL.
     * 
     * @param extraInfoUrl the extraInfoUrl value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withExtraInfoUrl(String extraInfoUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withExtraInfoUrl(extraInfoUrl);
        return this;
    }

    /**
     * Get the webJobType property: Job type.
     * 
     * @return the webJobType value.
     */
    public WebJobType webJobType() {
        return this.innerProperties() == null ? null : this.innerProperties().webJobType();
    }

    /**
     * Set the webJobType property: Job type.
     * 
     * @param webJobType the webJobType value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withWebJobType(WebJobType webJobType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withWebJobType(webJobType);
        return this;
    }

    /**
     * Get the error property: Error information.
     * 
     * @return the error value.
     */
    public String error() {
        return this.innerProperties() == null ? null : this.innerProperties().error();
    }

    /**
     * Set the error property: Error information.
     * 
     * @param error the error value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withError(String error) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withError(error);
        return this;
    }

    /**
     * Get the usingSdk property: Using SDK?.
     * 
     * @return the usingSdk value.
     */
    public Boolean usingSdk() {
        return this.innerProperties() == null ? null : this.innerProperties().usingSdk();
    }

    /**
     * Set the usingSdk property: Using SDK?.
     * 
     * @param usingSdk the usingSdk value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withUsingSdk(Boolean usingSdk) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withUsingSdk(usingSdk);
        return this;
    }

    /**
     * Get the settings property: Job settings.
     * 
     * @return the settings value.
     */
    public Map<String, Object> settings() {
        return this.innerProperties() == null ? null : this.innerProperties().settings();
    }

    /**
     * Set the settings property: Job settings.
     * 
     * @param settings the settings value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withSettings(Map<String, Object> settings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withSettings(settings);
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
     * Reads an instance of WebJobInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebJobInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WebJobInner.
     */
    public static WebJobInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebJobInner deserializedWebJobInner = new WebJobInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedWebJobInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedWebJobInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedWebJobInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedWebJobInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedWebJobInner.innerProperties = WebJobProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebJobInner;
        });
    }
}
