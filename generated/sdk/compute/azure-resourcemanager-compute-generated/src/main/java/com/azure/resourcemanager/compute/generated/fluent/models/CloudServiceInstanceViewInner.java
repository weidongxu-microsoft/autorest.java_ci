// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.models.InstanceViewStatusesSummary;
import com.azure.resourcemanager.compute.generated.models.ResourceInstanceViewStatus;
import java.io.IOException;
import java.util.List;

/**
 * InstanceView of CloudService as a whole.
 */
@Fluent
public final class CloudServiceInstanceViewInner implements JsonSerializable<CloudServiceInstanceViewInner> {
    /*
     * Instance view statuses.
     */
    private InstanceViewStatusesSummary roleInstance;

    /*
     * The version of the SDK that was used to generate the package for the cloud service.
     */
    private String sdkVersion;

    /*
     * Specifies a list of unique identifiers generated internally for the cloud service. <br /><br /> NOTE: If you are
     * using Azure Diagnostics extension, this property can be used as 'DeploymentId' for querying details.
     */
    private List<String> privateIds;

    /*
     * The statuses property.
     */
    private List<ResourceInstanceViewStatus> statuses;

    /**
     * Creates an instance of CloudServiceInstanceViewInner class.
     */
    public CloudServiceInstanceViewInner() {
    }

    /**
     * Get the roleInstance property: Instance view statuses.
     * 
     * @return the roleInstance value.
     */
    public InstanceViewStatusesSummary roleInstance() {
        return this.roleInstance;
    }

    /**
     * Set the roleInstance property: Instance view statuses.
     * 
     * @param roleInstance the roleInstance value to set.
     * @return the CloudServiceInstanceViewInner object itself.
     */
    public CloudServiceInstanceViewInner withRoleInstance(InstanceViewStatusesSummary roleInstance) {
        this.roleInstance = roleInstance;
        return this;
    }

    /**
     * Get the sdkVersion property: The version of the SDK that was used to generate the package for the cloud service.
     * 
     * @return the sdkVersion value.
     */
    public String sdkVersion() {
        return this.sdkVersion;
    }

    /**
     * Get the privateIds property: Specifies a list of unique identifiers generated internally for the cloud service.
     * &lt;br /&gt;&lt;br /&gt; NOTE: If you are using Azure Diagnostics extension, this property can be used as
     * 'DeploymentId' for querying details.
     * 
     * @return the privateIds value.
     */
    public List<String> privateIds() {
        return this.privateIds;
    }

    /**
     * Get the statuses property: The statuses property.
     * 
     * @return the statuses value.
     */
    public List<ResourceInstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roleInstance() != null) {
            roleInstance().validate();
        }
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("roleInstance", this.roleInstance);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CloudServiceInstanceViewInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CloudServiceInstanceViewInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CloudServiceInstanceViewInner.
     */
    public static CloudServiceInstanceViewInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CloudServiceInstanceViewInner deserializedCloudServiceInstanceViewInner
                = new CloudServiceInstanceViewInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("roleInstance".equals(fieldName)) {
                    deserializedCloudServiceInstanceViewInner.roleInstance
                        = InstanceViewStatusesSummary.fromJson(reader);
                } else if ("sdkVersion".equals(fieldName)) {
                    deserializedCloudServiceInstanceViewInner.sdkVersion = reader.getString();
                } else if ("privateIds".equals(fieldName)) {
                    List<String> privateIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedCloudServiceInstanceViewInner.privateIds = privateIds;
                } else if ("statuses".equals(fieldName)) {
                    List<ResourceInstanceViewStatus> statuses
                        = reader.readArray(reader1 -> ResourceInstanceViewStatus.fromJson(reader1));
                    deserializedCloudServiceInstanceViewInner.statuses = statuses;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCloudServiceInstanceViewInner;
        });
    }
}
