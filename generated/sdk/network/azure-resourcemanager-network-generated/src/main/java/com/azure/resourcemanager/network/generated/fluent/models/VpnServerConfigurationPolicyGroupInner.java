// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigurationPolicyGroupMember;
import java.io.IOException;
import java.util.List;

/**
 * VpnServerConfigurationPolicyGroup Resource.
 */
@Fluent
public final class VpnServerConfigurationPolicyGroupInner extends SubResource {
    /*
     * Properties of the VpnServerConfigurationPolicyGroup.
     */
    private VpnServerConfigurationPolicyGroupProperties innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    private String name;

    /*
     * Resource type.
     */
    private String type;

    /**
     * Creates an instance of VpnServerConfigurationPolicyGroupInner class.
     */
    public VpnServerConfigurationPolicyGroupInner() {
    }

    /**
     * Get the innerProperties property: Properties of the VpnServerConfigurationPolicyGroup.
     * 
     * @return the innerProperties value.
     */
    private VpnServerConfigurationPolicyGroupProperties innerProperties() {
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
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the VpnServerConfigurationPolicyGroupInner object itself.
     */
    public VpnServerConfigurationPolicyGroupInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VpnServerConfigurationPolicyGroupInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the isDefault property: Shows if this is a Default VpnServerConfigurationPolicyGroup or not.
     * 
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.innerProperties() == null ? null : this.innerProperties().isDefault();
    }

    /**
     * Set the isDefault property: Shows if this is a Default VpnServerConfigurationPolicyGroup or not.
     * 
     * @param isDefault the isDefault value to set.
     * @return the VpnServerConfigurationPolicyGroupInner object itself.
     */
    public VpnServerConfigurationPolicyGroupInner withIsDefault(Boolean isDefault) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationPolicyGroupProperties();
        }
        this.innerProperties().withIsDefault(isDefault);
        return this;
    }

    /**
     * Get the priority property: Priority for VpnServerConfigurationPolicyGroup.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Set the priority property: Priority for VpnServerConfigurationPolicyGroup.
     * 
     * @param priority the priority value to set.
     * @return the VpnServerConfigurationPolicyGroupInner object itself.
     */
    public VpnServerConfigurationPolicyGroupInner withPriority(Integer priority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationPolicyGroupProperties();
        }
        this.innerProperties().withPriority(priority);
        return this;
    }

    /**
     * Get the policyMembers property: Multiple PolicyMembers for VpnServerConfigurationPolicyGroup.
     * 
     * @return the policyMembers value.
     */
    public List<VpnServerConfigurationPolicyGroupMember> policyMembers() {
        return this.innerProperties() == null ? null : this.innerProperties().policyMembers();
    }

    /**
     * Set the policyMembers property: Multiple PolicyMembers for VpnServerConfigurationPolicyGroup.
     * 
     * @param policyMembers the policyMembers value to set.
     * @return the VpnServerConfigurationPolicyGroupInner object itself.
     */
    public VpnServerConfigurationPolicyGroupInner
        withPolicyMembers(List<VpnServerConfigurationPolicyGroupMember> policyMembers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationPolicyGroupProperties();
        }
        this.innerProperties().withPolicyMembers(policyMembers);
        return this;
    }

    /**
     * Get the p2SConnectionConfigurations property: List of references to P2SConnectionConfigurations.
     * 
     * @return the p2SConnectionConfigurations value.
     */
    public List<SubResource> p2SConnectionConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().p2SConnectionConfigurations();
    }

    /**
     * Get the provisioningState property: The provisioning state of the VpnServerConfigurationPolicyGroup resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VpnServerConfigurationPolicyGroupInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VpnServerConfigurationPolicyGroupInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VpnServerConfigurationPolicyGroupInner.
     */
    public static VpnServerConfigurationPolicyGroupInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VpnServerConfigurationPolicyGroupInner deserializedVpnServerConfigurationPolicyGroupInner
                = new VpnServerConfigurationPolicyGroupInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVpnServerConfigurationPolicyGroupInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedVpnServerConfigurationPolicyGroupInner.innerProperties
                        = VpnServerConfigurationPolicyGroupProperties.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedVpnServerConfigurationPolicyGroupInner.etag = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedVpnServerConfigurationPolicyGroupInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVpnServerConfigurationPolicyGroupInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVpnServerConfigurationPolicyGroupInner;
        });
    }
}
