// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayFirewallRuleSet;
import java.io.IOException;
import java.util.List;

/**
 * Response for ApplicationGatewayAvailableWafRuleSets API service call.
 */
@Fluent
public final class ApplicationGatewayAvailableWafRuleSetsResultInner
    implements JsonSerializable<ApplicationGatewayAvailableWafRuleSetsResultInner> {
    /*
     * The list of application gateway rule sets.
     */
    private List<ApplicationGatewayFirewallRuleSet> value;

    /**
     * Creates an instance of ApplicationGatewayAvailableWafRuleSetsResultInner class.
     */
    public ApplicationGatewayAvailableWafRuleSetsResultInner() {
    }

    /**
     * Get the value property: The list of application gateway rule sets.
     * 
     * @return the value value.
     */
    public List<ApplicationGatewayFirewallRuleSet> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of application gateway rule sets.
     * 
     * @param value the value value to set.
     * @return the ApplicationGatewayAvailableWafRuleSetsResultInner object itself.
     */
    public ApplicationGatewayAvailableWafRuleSetsResultInner withValue(List<ApplicationGatewayFirewallRuleSet> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayAvailableWafRuleSetsResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayAvailableWafRuleSetsResultInner if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewayAvailableWafRuleSetsResultInner.
     */
    public static ApplicationGatewayAvailableWafRuleSetsResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayAvailableWafRuleSetsResultInner deserializedApplicationGatewayAvailableWafRuleSetsResultInner
                = new ApplicationGatewayAvailableWafRuleSetsResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ApplicationGatewayFirewallRuleSet> value
                        = reader.readArray(reader1 -> ApplicationGatewayFirewallRuleSet.fromJson(reader1));
                    deserializedApplicationGatewayAvailableWafRuleSetsResultInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayAvailableWafRuleSetsResultInner;
        });
    }
}
