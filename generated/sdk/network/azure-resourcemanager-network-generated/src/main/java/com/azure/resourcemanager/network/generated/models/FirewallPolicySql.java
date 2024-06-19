// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * SQL Settings in Firewall Policy.
 */
@Fluent
public final class FirewallPolicySql implements JsonSerializable<FirewallPolicySql> {
    /*
     * A flag to indicate if SQL Redirect traffic filtering is enabled. Turning on the flag requires no rule using port
     * 11000-11999.
     */
    private Boolean allowSqlRedirect;

    /**
     * Creates an instance of FirewallPolicySql class.
     */
    public FirewallPolicySql() {
    }

    /**
     * Get the allowSqlRedirect property: A flag to indicate if SQL Redirect traffic filtering is enabled. Turning on
     * the flag requires no rule using port 11000-11999.
     * 
     * @return the allowSqlRedirect value.
     */
    public Boolean allowSqlRedirect() {
        return this.allowSqlRedirect;
    }

    /**
     * Set the allowSqlRedirect property: A flag to indicate if SQL Redirect traffic filtering is enabled. Turning on
     * the flag requires no rule using port 11000-11999.
     * 
     * @param allowSqlRedirect the allowSqlRedirect value to set.
     * @return the FirewallPolicySql object itself.
     */
    public FirewallPolicySql withAllowSqlRedirect(Boolean allowSqlRedirect) {
        this.allowSqlRedirect = allowSqlRedirect;
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
        jsonWriter.writeBooleanField("allowSqlRedirect", this.allowSqlRedirect);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FirewallPolicySql from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FirewallPolicySql if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FirewallPolicySql.
     */
    public static FirewallPolicySql fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FirewallPolicySql deserializedFirewallPolicySql = new FirewallPolicySql();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("allowSqlRedirect".equals(fieldName)) {
                    deserializedFirewallPolicySql.allowSqlRedirect = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFirewallPolicySql;
        });
    }
}
