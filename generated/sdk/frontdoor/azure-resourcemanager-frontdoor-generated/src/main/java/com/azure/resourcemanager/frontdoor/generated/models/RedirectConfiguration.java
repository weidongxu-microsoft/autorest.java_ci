// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes Redirect Route.
 */
@Fluent
public final class RedirectConfiguration extends RouteConfiguration {
    /*
     * The redirect type the rule will use when redirecting traffic.
     */
    private FrontDoorRedirectType redirectType;

    /*
     * The protocol of the destination to where the traffic is redirected
     */
    private FrontDoorRedirectProtocol redirectProtocol;

    /*
     * Host to redirect. Leave empty to use the incoming host as the destination host.
     */
    private String customHost;

    /*
     * The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as
     * destination path.
     */
    private String customPath;

    /*
     * Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     */
    private String customFragment;

    /*
     * The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query
     * string; leave empty to preserve the incoming query string. Query string must be in <key>=<value> format. The
     * first ? and & will be added automatically so do not include them in the front, but do separate multiple query
     * strings with &.
     */
    private String customQueryString;

    /**
     * Creates an instance of RedirectConfiguration class.
     */
    public RedirectConfiguration() {
        this.odataType = "#Microsoft.Azure.FrontDoor.Models.FrontdoorRedirectConfiguration";
    }

    /**
     * Get the redirectType property: The redirect type the rule will use when redirecting traffic.
     * 
     * @return the redirectType value.
     */
    public FrontDoorRedirectType redirectType() {
        return this.redirectType;
    }

    /**
     * Set the redirectType property: The redirect type the rule will use when redirecting traffic.
     * 
     * @param redirectType the redirectType value to set.
     * @return the RedirectConfiguration object itself.
     */
    public RedirectConfiguration withRedirectType(FrontDoorRedirectType redirectType) {
        this.redirectType = redirectType;
        return this;
    }

    /**
     * Get the redirectProtocol property: The protocol of the destination to where the traffic is redirected.
     * 
     * @return the redirectProtocol value.
     */
    public FrontDoorRedirectProtocol redirectProtocol() {
        return this.redirectProtocol;
    }

    /**
     * Set the redirectProtocol property: The protocol of the destination to where the traffic is redirected.
     * 
     * @param redirectProtocol the redirectProtocol value to set.
     * @return the RedirectConfiguration object itself.
     */
    public RedirectConfiguration withRedirectProtocol(FrontDoorRedirectProtocol redirectProtocol) {
        this.redirectProtocol = redirectProtocol;
        return this;
    }

    /**
     * Get the customHost property: Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
     * @return the customHost value.
     */
    public String customHost() {
        return this.customHost;
    }

    /**
     * Set the customHost property: Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
     * @param customHost the customHost value to set.
     * @return the RedirectConfiguration object itself.
     */
    public RedirectConfiguration withCustomHost(String customHost) {
        this.customHost = customHost;
        return this;
    }

    /**
     * Get the customPath property: The full path to redirect. Path cannot be empty and must start with /. Leave empty
     * to use the incoming path as destination path.
     * 
     * @return the customPath value.
     */
    public String customPath() {
        return this.customPath;
    }

    /**
     * Set the customPath property: The full path to redirect. Path cannot be empty and must start with /. Leave empty
     * to use the incoming path as destination path.
     * 
     * @param customPath the customPath value to set.
     * @return the RedirectConfiguration object itself.
     */
    public RedirectConfiguration withCustomPath(String customPath) {
        this.customPath = customPath;
        return this;
    }

    /**
     * Get the customFragment property: Fragment to add to the redirect URL. Fragment is the part of the URL that comes
     * after #. Do not include the #.
     * 
     * @return the customFragment value.
     */
    public String customFragment() {
        return this.customFragment;
    }

    /**
     * Set the customFragment property: Fragment to add to the redirect URL. Fragment is the part of the URL that comes
     * after #. Do not include the #.
     * 
     * @param customFragment the customFragment value to set.
     * @return the RedirectConfiguration object itself.
     */
    public RedirectConfiguration withCustomFragment(String customFragment) {
        this.customFragment = customFragment;
        return this;
    }

    /**
     * Get the customQueryString property: The set of query strings to be placed in the redirect URL. Setting this value
     * would replace any existing query string; leave empty to preserve the incoming query string. Query string must be
     * in &lt;key&gt;=&lt;value&gt; format. The first ? and &amp; will be added automatically so do not include them in
     * the front, but do separate multiple query strings with &amp;.
     * 
     * @return the customQueryString value.
     */
    public String customQueryString() {
        return this.customQueryString;
    }

    /**
     * Set the customQueryString property: The set of query strings to be placed in the redirect URL. Setting this value
     * would replace any existing query string; leave empty to preserve the incoming query string. Query string must be
     * in &lt;key&gt;=&lt;value&gt; format. The first ? and &amp; will be added automatically so do not include them in
     * the front, but do separate multiple query strings with &amp;.
     * 
     * @param customQueryString the customQueryString value to set.
     * @return the RedirectConfiguration object itself.
     */
    public RedirectConfiguration withCustomQueryString(String customQueryString) {
        this.customQueryString = customQueryString;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        jsonWriter.writeStringField("redirectType", this.redirectType == null ? null : this.redirectType.toString());
        jsonWriter.writeStringField("redirectProtocol",
            this.redirectProtocol == null ? null : this.redirectProtocol.toString());
        jsonWriter.writeStringField("customHost", this.customHost);
        jsonWriter.writeStringField("customPath", this.customPath);
        jsonWriter.writeStringField("customFragment", this.customFragment);
        jsonWriter.writeStringField("customQueryString", this.customQueryString);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RedirectConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedirectConfiguration if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RedirectConfiguration.
     */
    public static RedirectConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedirectConfiguration deserializedRedirectConfiguration = new RedirectConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedRedirectConfiguration.odataType = reader.getString();
                } else if ("redirectType".equals(fieldName)) {
                    deserializedRedirectConfiguration.redirectType
                        = FrontDoorRedirectType.fromString(reader.getString());
                } else if ("redirectProtocol".equals(fieldName)) {
                    deserializedRedirectConfiguration.redirectProtocol
                        = FrontDoorRedirectProtocol.fromString(reader.getString());
                } else if ("customHost".equals(fieldName)) {
                    deserializedRedirectConfiguration.customHost = reader.getString();
                } else if ("customPath".equals(fieldName)) {
                    deserializedRedirectConfiguration.customPath = reader.getString();
                } else if ("customFragment".equals(fieldName)) {
                    deserializedRedirectConfiguration.customFragment = reader.getString();
                } else if ("customQueryString".equals(fieldName)) {
                    deserializedRedirectConfiguration.customQueryString = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRedirectConfiguration;
        });
    }
}
