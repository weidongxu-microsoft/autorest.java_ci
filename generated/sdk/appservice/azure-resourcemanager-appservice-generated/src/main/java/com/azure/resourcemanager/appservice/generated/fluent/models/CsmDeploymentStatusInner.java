// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.DeploymentBuildStatus;
import com.azure.resourcemanager.appservice.generated.models.ErrorEntity;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import java.io.IOException;
import java.util.List;

/**
 * Deployment status response payload.
 */
@Fluent
public final class CsmDeploymentStatusInner extends ProxyOnlyResource {
    /*
     * CsmDeploymentStatus resource specific properties
     */
    private CsmDeploymentStatusProperties innerProperties;

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
     * Creates an instance of CsmDeploymentStatusInner class.
     */
    public CsmDeploymentStatusInner() {
    }

    /**
     * Get the innerProperties property: CsmDeploymentStatus resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private CsmDeploymentStatusProperties innerProperties() {
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
    public CsmDeploymentStatusInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the deploymentId property: Deployment operation id.
     * 
     * @return the deploymentId value.
     */
    public String deploymentId() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentId();
    }

    /**
     * Set the deploymentId property: Deployment operation id.
     * 
     * @param deploymentId the deploymentId value to set.
     * @return the CsmDeploymentStatusInner object itself.
     */
    public CsmDeploymentStatusInner withDeploymentId(String deploymentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CsmDeploymentStatusProperties();
        }
        this.innerProperties().withDeploymentId(deploymentId);
        return this;
    }

    /**
     * Get the status property: Deployment build status.
     * 
     * @return the status value.
     */
    public DeploymentBuildStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: Deployment build status.
     * 
     * @param status the status value to set.
     * @return the CsmDeploymentStatusInner object itself.
     */
    public CsmDeploymentStatusInner withStatus(DeploymentBuildStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CsmDeploymentStatusProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the numberOfInstancesInProgress property: Number of site instances currently being provisioned.
     * 
     * @return the numberOfInstancesInProgress value.
     */
    public Integer numberOfInstancesInProgress() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfInstancesInProgress();
    }

    /**
     * Set the numberOfInstancesInProgress property: Number of site instances currently being provisioned.
     * 
     * @param numberOfInstancesInProgress the numberOfInstancesInProgress value to set.
     * @return the CsmDeploymentStatusInner object itself.
     */
    public CsmDeploymentStatusInner withNumberOfInstancesInProgress(Integer numberOfInstancesInProgress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CsmDeploymentStatusProperties();
        }
        this.innerProperties().withNumberOfInstancesInProgress(numberOfInstancesInProgress);
        return this;
    }

    /**
     * Get the numberOfInstancesSuccessful property: Number of site instances provisioned successfully.
     * 
     * @return the numberOfInstancesSuccessful value.
     */
    public Integer numberOfInstancesSuccessful() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfInstancesSuccessful();
    }

    /**
     * Set the numberOfInstancesSuccessful property: Number of site instances provisioned successfully.
     * 
     * @param numberOfInstancesSuccessful the numberOfInstancesSuccessful value to set.
     * @return the CsmDeploymentStatusInner object itself.
     */
    public CsmDeploymentStatusInner withNumberOfInstancesSuccessful(Integer numberOfInstancesSuccessful) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CsmDeploymentStatusProperties();
        }
        this.innerProperties().withNumberOfInstancesSuccessful(numberOfInstancesSuccessful);
        return this;
    }

    /**
     * Get the numberOfInstancesFailed property: Number of site instances failed to provision.
     * 
     * @return the numberOfInstancesFailed value.
     */
    public Integer numberOfInstancesFailed() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfInstancesFailed();
    }

    /**
     * Set the numberOfInstancesFailed property: Number of site instances failed to provision.
     * 
     * @param numberOfInstancesFailed the numberOfInstancesFailed value to set.
     * @return the CsmDeploymentStatusInner object itself.
     */
    public CsmDeploymentStatusInner withNumberOfInstancesFailed(Integer numberOfInstancesFailed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CsmDeploymentStatusProperties();
        }
        this.innerProperties().withNumberOfInstancesFailed(numberOfInstancesFailed);
        return this;
    }

    /**
     * Get the failedInstancesLogs property: List of URLs pointing to logs for instances which failed to provision.
     * 
     * @return the failedInstancesLogs value.
     */
    public List<String> failedInstancesLogs() {
        return this.innerProperties() == null ? null : this.innerProperties().failedInstancesLogs();
    }

    /**
     * Set the failedInstancesLogs property: List of URLs pointing to logs for instances which failed to provision.
     * 
     * @param failedInstancesLogs the failedInstancesLogs value to set.
     * @return the CsmDeploymentStatusInner object itself.
     */
    public CsmDeploymentStatusInner withFailedInstancesLogs(List<String> failedInstancesLogs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CsmDeploymentStatusProperties();
        }
        this.innerProperties().withFailedInstancesLogs(failedInstancesLogs);
        return this;
    }

    /**
     * Get the errors property: List of errors.
     * 
     * @return the errors value.
     */
    public List<ErrorEntity> errors() {
        return this.innerProperties() == null ? null : this.innerProperties().errors();
    }

    /**
     * Set the errors property: List of errors.
     * 
     * @param errors the errors value to set.
     * @return the CsmDeploymentStatusInner object itself.
     */
    public CsmDeploymentStatusInner withErrors(List<ErrorEntity> errors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CsmDeploymentStatusProperties();
        }
        this.innerProperties().withErrors(errors);
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
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CsmDeploymentStatusInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CsmDeploymentStatusInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CsmDeploymentStatusInner.
     */
    public static CsmDeploymentStatusInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CsmDeploymentStatusInner deserializedCsmDeploymentStatusInner = new CsmDeploymentStatusInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCsmDeploymentStatusInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedCsmDeploymentStatusInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCsmDeploymentStatusInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedCsmDeploymentStatusInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedCsmDeploymentStatusInner.innerProperties
                        = CsmDeploymentStatusProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCsmDeploymentStatusInner;
        });
    }
}
