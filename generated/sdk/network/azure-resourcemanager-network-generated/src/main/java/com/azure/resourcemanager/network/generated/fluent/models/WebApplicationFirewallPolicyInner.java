// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ManagedRulesDefinition;
import com.azure.resourcemanager.network.generated.models.PolicySettings;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.WebApplicationFirewallCustomRule;
import com.azure.resourcemanager.network.generated.models.WebApplicationFirewallPolicyResourceState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Defines web application firewall policy.
 */
@Fluent
public final class WebApplicationFirewallPolicyInner extends Resource {
    /*
     * Properties of the web application firewall policy.
     */
    private WebApplicationFirewallPolicyPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Resource ID.
     */
    private String id;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /**
     * Creates an instance of WebApplicationFirewallPolicyInner class.
     */
    public WebApplicationFirewallPolicyInner() {
    }

    /**
     * Get the innerProperties property: Properties of the web application firewall policy.
     * 
     * @return the innerProperties value.
     */
    private WebApplicationFirewallPolicyPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withId(String id) {
        this.id = id;
        return this;
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
     * {@inheritDoc}
     */
    @Override
    public WebApplicationFirewallPolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebApplicationFirewallPolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the policySettings property: The PolicySettings for policy.
     * 
     * @return the policySettings value.
     */
    public PolicySettings policySettings() {
        return this.innerProperties() == null ? null : this.innerProperties().policySettings();
    }

    /**
     * Set the policySettings property: The PolicySettings for policy.
     * 
     * @param policySettings the policySettings value to set.
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withPolicySettings(PolicySettings policySettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebApplicationFirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withPolicySettings(policySettings);
        return this;
    }

    /**
     * Get the customRules property: The custom rules inside the policy.
     * 
     * @return the customRules value.
     */
    public List<WebApplicationFirewallCustomRule> customRules() {
        return this.innerProperties() == null ? null : this.innerProperties().customRules();
    }

    /**
     * Set the customRules property: The custom rules inside the policy.
     * 
     * @param customRules the customRules value to set.
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withCustomRules(List<WebApplicationFirewallCustomRule> customRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebApplicationFirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withCustomRules(customRules);
        return this;
    }

    /**
     * Get the applicationGateways property: A collection of references to application gateways.
     * 
     * @return the applicationGateways value.
     */
    public List<ApplicationGatewayInner> applicationGateways() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationGateways();
    }

    /**
     * Get the provisioningState property: The provisioning state of the web application firewall policy resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceState property: Resource status of the policy.
     * 
     * @return the resourceState value.
     */
    public WebApplicationFirewallPolicyResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
    }

    /**
     * Get the managedRules property: Describes the managedRules structure.
     * 
     * @return the managedRules value.
     */
    public ManagedRulesDefinition managedRules() {
        return this.innerProperties() == null ? null : this.innerProperties().managedRules();
    }

    /**
     * Set the managedRules property: Describes the managedRules structure.
     * 
     * @param managedRules the managedRules value to set.
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withManagedRules(ManagedRulesDefinition managedRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebApplicationFirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withManagedRules(managedRules);
        return this;
    }

    /**
     * Get the httpListeners property: A collection of references to application gateway http listeners.
     * 
     * @return the httpListeners value.
     */
    public List<SubResource> httpListeners() {
        return this.innerProperties() == null ? null : this.innerProperties().httpListeners();
    }

    /**
     * Get the pathBasedRules property: A collection of references to application gateway path rules.
     * 
     * @return the pathBasedRules value.
     */
    public List<SubResource> pathBasedRules() {
        return this.innerProperties() == null ? null : this.innerProperties().pathBasedRules();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model WebApplicationFirewallPolicyInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebApplicationFirewallPolicyInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebApplicationFirewallPolicyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebApplicationFirewallPolicyInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WebApplicationFirewallPolicyInner.
     */
    public static WebApplicationFirewallPolicyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebApplicationFirewallPolicyInner deserializedWebApplicationFirewallPolicyInner
                = new WebApplicationFirewallPolicyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedWebApplicationFirewallPolicyInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedWebApplicationFirewallPolicyInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedWebApplicationFirewallPolicyInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedWebApplicationFirewallPolicyInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedWebApplicationFirewallPolicyInner.innerProperties
                        = WebApplicationFirewallPolicyPropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedWebApplicationFirewallPolicyInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedWebApplicationFirewallPolicyInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebApplicationFirewallPolicyInner;
        });
    }
}
