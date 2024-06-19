// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.FlowAccessControlConfiguration;
import com.azure.resourcemanager.appservice.generated.models.FlowEndpointsConfiguration;
import com.azure.resourcemanager.appservice.generated.models.ResourceReference;
import com.azure.resourcemanager.appservice.generated.models.WorkflowParameter;
import com.azure.resourcemanager.appservice.generated.models.WorkflowProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.WorkflowResource;
import com.azure.resourcemanager.appservice.generated.models.WorkflowSku;
import com.azure.resourcemanager.appservice.generated.models.WorkflowState;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The workflow version.
 */
@Fluent
public final class WorkflowVersionInner extends WorkflowResource {
    /*
     * The workflow version properties.
     */
    private WorkflowVersionProperties innerProperties;

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
     * Creates an instance of WorkflowVersionInner class.
     */
    public WorkflowVersionInner() {
    }

    /**
     * Get the innerProperties property: The workflow version properties.
     * 
     * @return the innerProperties value.
     */
    private WorkflowVersionProperties innerProperties() {
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
    public WorkflowVersionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkflowVersionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     * 
     * @return the provisioningState value.
     */
    public WorkflowProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the createdTime property: Gets the created time.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTime();
    }

    /**
     * Get the changedTime property: Gets the changed time.
     * 
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().changedTime();
    }

    /**
     * Get the state property: The state.
     * 
     * @return the state value.
     */
    public WorkflowState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: The state.
     * 
     * @param state the state value to set.
     * @return the WorkflowVersionInner object itself.
     */
    public WorkflowVersionInner withState(WorkflowState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowVersionProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the version property: Gets the version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the accessEndpoint property: Gets the access endpoint.
     * 
     * @return the accessEndpoint value.
     */
    public String accessEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().accessEndpoint();
    }

    /**
     * Get the endpointsConfiguration property: The endpoints configuration.
     * 
     * @return the endpointsConfiguration value.
     */
    public FlowEndpointsConfiguration endpointsConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointsConfiguration();
    }

    /**
     * Set the endpointsConfiguration property: The endpoints configuration.
     * 
     * @param endpointsConfiguration the endpointsConfiguration value to set.
     * @return the WorkflowVersionInner object itself.
     */
    public WorkflowVersionInner withEndpointsConfiguration(FlowEndpointsConfiguration endpointsConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowVersionProperties();
        }
        this.innerProperties().withEndpointsConfiguration(endpointsConfiguration);
        return this;
    }

    /**
     * Get the accessControl property: The access control configuration.
     * 
     * @return the accessControl value.
     */
    public FlowAccessControlConfiguration accessControl() {
        return this.innerProperties() == null ? null : this.innerProperties().accessControl();
    }

    /**
     * Set the accessControl property: The access control configuration.
     * 
     * @param accessControl the accessControl value to set.
     * @return the WorkflowVersionInner object itself.
     */
    public WorkflowVersionInner withAccessControl(FlowAccessControlConfiguration accessControl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowVersionProperties();
        }
        this.innerProperties().withAccessControl(accessControl);
        return this;
    }

    /**
     * Get the sku property: The sku.
     * 
     * @return the sku value.
     */
    public WorkflowSku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Get the integrationAccount property: The integration account.
     * 
     * @return the integrationAccount value.
     */
    public ResourceReference integrationAccount() {
        return this.innerProperties() == null ? null : this.innerProperties().integrationAccount();
    }

    /**
     * Set the integrationAccount property: The integration account.
     * 
     * @param integrationAccount the integrationAccount value to set.
     * @return the WorkflowVersionInner object itself.
     */
    public WorkflowVersionInner withIntegrationAccount(ResourceReference integrationAccount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowVersionProperties();
        }
        this.innerProperties().withIntegrationAccount(integrationAccount);
        return this;
    }

    /**
     * Get the definition property: The definition.
     * 
     * @return the definition value.
     */
    public Object definition() {
        return this.innerProperties() == null ? null : this.innerProperties().definition();
    }

    /**
     * Set the definition property: The definition.
     * 
     * @param definition the definition value to set.
     * @return the WorkflowVersionInner object itself.
     */
    public WorkflowVersionInner withDefinition(Object definition) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowVersionProperties();
        }
        this.innerProperties().withDefinition(definition);
        return this;
    }

    /**
     * Get the parameters property: The parameters.
     * 
     * @return the parameters value.
     */
    public Map<String, WorkflowParameter> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: The parameters.
     * 
     * @param parameters the parameters value to set.
     * @return the WorkflowVersionInner object itself.
     */
    public WorkflowVersionInner withParameters(Map<String, WorkflowParameter> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowVersionProperties();
        }
        this.innerProperties().withParameters(parameters);
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
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkflowVersionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkflowVersionInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WorkflowVersionInner.
     */
    public static WorkflowVersionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkflowVersionInner deserializedWorkflowVersionInner = new WorkflowVersionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedWorkflowVersionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedWorkflowVersionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedWorkflowVersionInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedWorkflowVersionInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedWorkflowVersionInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedWorkflowVersionInner.innerProperties = WorkflowVersionProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkflowVersionInner;
        });
    }
}
