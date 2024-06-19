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
 * The configuration settings of a forward proxy used to make the requests.
 */
@Fluent
public final class ForwardProxy implements JsonSerializable<ForwardProxy> {
    /*
     * The convention used to determine the url of the request made.
     */
    private ForwardProxyConvention convention;

    /*
     * The name of the header containing the host of the request.
     */
    private String customHostHeaderName;

    /*
     * The name of the header containing the scheme of the request.
     */
    private String customProtoHeaderName;

    /**
     * Creates an instance of ForwardProxy class.
     */
    public ForwardProxy() {
    }

    /**
     * Get the convention property: The convention used to determine the url of the request made.
     * 
     * @return the convention value.
     */
    public ForwardProxyConvention convention() {
        return this.convention;
    }

    /**
     * Set the convention property: The convention used to determine the url of the request made.
     * 
     * @param convention the convention value to set.
     * @return the ForwardProxy object itself.
     */
    public ForwardProxy withConvention(ForwardProxyConvention convention) {
        this.convention = convention;
        return this;
    }

    /**
     * Get the customHostHeaderName property: The name of the header containing the host of the request.
     * 
     * @return the customHostHeaderName value.
     */
    public String customHostHeaderName() {
        return this.customHostHeaderName;
    }

    /**
     * Set the customHostHeaderName property: The name of the header containing the host of the request.
     * 
     * @param customHostHeaderName the customHostHeaderName value to set.
     * @return the ForwardProxy object itself.
     */
    public ForwardProxy withCustomHostHeaderName(String customHostHeaderName) {
        this.customHostHeaderName = customHostHeaderName;
        return this;
    }

    /**
     * Get the customProtoHeaderName property: The name of the header containing the scheme of the request.
     * 
     * @return the customProtoHeaderName value.
     */
    public String customProtoHeaderName() {
        return this.customProtoHeaderName;
    }

    /**
     * Set the customProtoHeaderName property: The name of the header containing the scheme of the request.
     * 
     * @param customProtoHeaderName the customProtoHeaderName value to set.
     * @return the ForwardProxy object itself.
     */
    public ForwardProxy withCustomProtoHeaderName(String customProtoHeaderName) {
        this.customProtoHeaderName = customProtoHeaderName;
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
        jsonWriter.writeStringField("convention", this.convention == null ? null : this.convention.toString());
        jsonWriter.writeStringField("customHostHeaderName", this.customHostHeaderName);
        jsonWriter.writeStringField("customProtoHeaderName", this.customProtoHeaderName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ForwardProxy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ForwardProxy if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ForwardProxy.
     */
    public static ForwardProxy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ForwardProxy deserializedForwardProxy = new ForwardProxy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("convention".equals(fieldName)) {
                    deserializedForwardProxy.convention = ForwardProxyConvention.fromString(reader.getString());
                } else if ("customHostHeaderName".equals(fieldName)) {
                    deserializedForwardProxy.customHostHeaderName = reader.getString();
                } else if ("customProtoHeaderName".equals(fieldName)) {
                    deserializedForwardProxy.customProtoHeaderName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedForwardProxy;
        });
    }
}
