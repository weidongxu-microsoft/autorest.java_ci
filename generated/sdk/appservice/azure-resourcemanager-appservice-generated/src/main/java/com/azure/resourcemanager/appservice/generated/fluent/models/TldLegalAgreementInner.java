// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Legal agreement for a top level domain.
 */
@Fluent
public final class TldLegalAgreementInner implements JsonSerializable<TldLegalAgreementInner> {
    /*
     * Unique identifier for the agreement.
     */
    private String agreementKey;

    /*
     * Agreement title.
     */
    private String title;

    /*
     * Agreement details.
     */
    private String content;

    /*
     * URL where a copy of the agreement details is hosted.
     */
    private String url;

    /**
     * Creates an instance of TldLegalAgreementInner class.
     */
    public TldLegalAgreementInner() {
    }

    /**
     * Get the agreementKey property: Unique identifier for the agreement.
     * 
     * @return the agreementKey value.
     */
    public String agreementKey() {
        return this.agreementKey;
    }

    /**
     * Set the agreementKey property: Unique identifier for the agreement.
     * 
     * @param agreementKey the agreementKey value to set.
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withAgreementKey(String agreementKey) {
        this.agreementKey = agreementKey;
        return this;
    }

    /**
     * Get the title property: Agreement title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Agreement title.
     * 
     * @param title the title value to set.
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the content property: Agreement details.
     * 
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: Agreement details.
     * 
     * @param content the content value to set.
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the url property: URL where a copy of the agreement details is hosted.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: URL where a copy of the agreement details is hosted.
     * 
     * @param url the url value to set.
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (agreementKey() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property agreementKey in model TldLegalAgreementInner"));
        }
        if (title() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property title in model TldLegalAgreementInner"));
        }
        if (content() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property content in model TldLegalAgreementInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TldLegalAgreementInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("agreementKey", this.agreementKey);
        jsonWriter.writeStringField("title", this.title);
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeStringField("url", this.url);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TldLegalAgreementInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TldLegalAgreementInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TldLegalAgreementInner.
     */
    public static TldLegalAgreementInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TldLegalAgreementInner deserializedTldLegalAgreementInner = new TldLegalAgreementInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("agreementKey".equals(fieldName)) {
                    deserializedTldLegalAgreementInner.agreementKey = reader.getString();
                } else if ("title".equals(fieldName)) {
                    deserializedTldLegalAgreementInner.title = reader.getString();
                } else if ("content".equals(fieldName)) {
                    deserializedTldLegalAgreementInner.content = reader.getString();
                } else if ("url".equals(fieldName)) {
                    deserializedTldLegalAgreementInner.url = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTldLegalAgreementInner;
        });
    }
}
