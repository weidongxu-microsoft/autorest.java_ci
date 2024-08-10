// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import java.io.IOException;

/**
 * Used for getting PHP error logging flag.
 */
@Fluent
public final class SitePhpErrorLogFlagInner extends ProxyOnlyResource {
    /*
     * SitePhpErrorLogFlag resource specific properties
     */
    private SitePhpErrorLogFlagProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of SitePhpErrorLogFlagInner class.
     */
    public SitePhpErrorLogFlagInner() {
    }

    /**
     * Get the innerProperties property: SitePhpErrorLogFlag resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private SitePhpErrorLogFlagProperties innerProperties() {
        return this.innerProperties;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * {@inheritDoc}
     */
    @Override
    public SitePhpErrorLogFlagInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the localLogErrors property: Local log_errors setting.
     * 
     * @return the localLogErrors value.
     */
    public String localLogErrors() {
        return this.innerProperties() == null ? null : this.innerProperties().localLogErrors();
    }

    /**
     * Set the localLogErrors property: Local log_errors setting.
     * 
     * @param localLogErrors the localLogErrors value to set.
     * @return the SitePhpErrorLogFlagInner object itself.
     */
    public SitePhpErrorLogFlagInner withLocalLogErrors(String localLogErrors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePhpErrorLogFlagProperties();
        }
        this.innerProperties().withLocalLogErrors(localLogErrors);
        return this;
    }

    /**
     * Get the masterLogErrors property: Master log_errors setting.
     * 
     * @return the masterLogErrors value.
     */
    public String masterLogErrors() {
        return this.innerProperties() == null ? null : this.innerProperties().masterLogErrors();
    }

    /**
     * Set the masterLogErrors property: Master log_errors setting.
     * 
     * @param masterLogErrors the masterLogErrors value to set.
     * @return the SitePhpErrorLogFlagInner object itself.
     */
    public SitePhpErrorLogFlagInner withMasterLogErrors(String masterLogErrors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePhpErrorLogFlagProperties();
        }
        this.innerProperties().withMasterLogErrors(masterLogErrors);
        return this;
    }

    /**
     * Get the localLogErrorsMaxLength property: Local log_errors_max_len setting.
     * 
     * @return the localLogErrorsMaxLength value.
     */
    public String localLogErrorsMaxLength() {
        return this.innerProperties() == null ? null : this.innerProperties().localLogErrorsMaxLength();
    }

    /**
     * Set the localLogErrorsMaxLength property: Local log_errors_max_len setting.
     * 
     * @param localLogErrorsMaxLength the localLogErrorsMaxLength value to set.
     * @return the SitePhpErrorLogFlagInner object itself.
     */
    public SitePhpErrorLogFlagInner withLocalLogErrorsMaxLength(String localLogErrorsMaxLength) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePhpErrorLogFlagProperties();
        }
        this.innerProperties().withLocalLogErrorsMaxLength(localLogErrorsMaxLength);
        return this;
    }

    /**
     * Get the masterLogErrorsMaxLength property: Master log_errors_max_len setting.
     * 
     * @return the masterLogErrorsMaxLength value.
     */
    public String masterLogErrorsMaxLength() {
        return this.innerProperties() == null ? null : this.innerProperties().masterLogErrorsMaxLength();
    }

    /**
     * Set the masterLogErrorsMaxLength property: Master log_errors_max_len setting.
     * 
     * @param masterLogErrorsMaxLength the masterLogErrorsMaxLength value to set.
     * @return the SitePhpErrorLogFlagInner object itself.
     */
    public SitePhpErrorLogFlagInner withMasterLogErrorsMaxLength(String masterLogErrorsMaxLength) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePhpErrorLogFlagProperties();
        }
        this.innerProperties().withMasterLogErrorsMaxLength(masterLogErrorsMaxLength);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
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
     * Reads an instance of SitePhpErrorLogFlagInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SitePhpErrorLogFlagInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SitePhpErrorLogFlagInner.
     */
    public static SitePhpErrorLogFlagInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SitePhpErrorLogFlagInner deserializedSitePhpErrorLogFlagInner = new SitePhpErrorLogFlagInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSitePhpErrorLogFlagInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSitePhpErrorLogFlagInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSitePhpErrorLogFlagInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedSitePhpErrorLogFlagInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedSitePhpErrorLogFlagInner.innerProperties
                        = SitePhpErrorLogFlagProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSitePhpErrorLogFlagInner;
        });
    }
}
