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
 * The ArcConfiguration model.
 */
@Fluent
public final class ArcConfiguration implements JsonSerializable<ArcConfiguration> {
    /*
     * The artifactsStorageType property.
     */
    private StorageType artifactsStorageType;

    /*
     * The artifactStorageClassName property.
     */
    private String artifactStorageClassName;

    /*
     * The artifactStorageMountPath property.
     */
    private String artifactStorageMountPath;

    /*
     * The artifactStorageNodeName property.
     */
    private String artifactStorageNodeName;

    /*
     * The artifactStorageAccessMode property.
     */
    private String artifactStorageAccessMode;

    /*
     * The frontEndServiceConfiguration property.
     */
    private FrontEndConfiguration frontEndServiceConfiguration;

    /*
     * The kubeConfig property.
     */
    private String kubeConfig;

    /**
     * Creates an instance of ArcConfiguration class.
     */
    public ArcConfiguration() {
    }

    /**
     * Get the artifactsStorageType property: The artifactsStorageType property.
     * 
     * @return the artifactsStorageType value.
     */
    public StorageType artifactsStorageType() {
        return this.artifactsStorageType;
    }

    /**
     * Set the artifactsStorageType property: The artifactsStorageType property.
     * 
     * @param artifactsStorageType the artifactsStorageType value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withArtifactsStorageType(StorageType artifactsStorageType) {
        this.artifactsStorageType = artifactsStorageType;
        return this;
    }

    /**
     * Get the artifactStorageClassName property: The artifactStorageClassName property.
     * 
     * @return the artifactStorageClassName value.
     */
    public String artifactStorageClassName() {
        return this.artifactStorageClassName;
    }

    /**
     * Set the artifactStorageClassName property: The artifactStorageClassName property.
     * 
     * @param artifactStorageClassName the artifactStorageClassName value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withArtifactStorageClassName(String artifactStorageClassName) {
        this.artifactStorageClassName = artifactStorageClassName;
        return this;
    }

    /**
     * Get the artifactStorageMountPath property: The artifactStorageMountPath property.
     * 
     * @return the artifactStorageMountPath value.
     */
    public String artifactStorageMountPath() {
        return this.artifactStorageMountPath;
    }

    /**
     * Set the artifactStorageMountPath property: The artifactStorageMountPath property.
     * 
     * @param artifactStorageMountPath the artifactStorageMountPath value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withArtifactStorageMountPath(String artifactStorageMountPath) {
        this.artifactStorageMountPath = artifactStorageMountPath;
        return this;
    }

    /**
     * Get the artifactStorageNodeName property: The artifactStorageNodeName property.
     * 
     * @return the artifactStorageNodeName value.
     */
    public String artifactStorageNodeName() {
        return this.artifactStorageNodeName;
    }

    /**
     * Set the artifactStorageNodeName property: The artifactStorageNodeName property.
     * 
     * @param artifactStorageNodeName the artifactStorageNodeName value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withArtifactStorageNodeName(String artifactStorageNodeName) {
        this.artifactStorageNodeName = artifactStorageNodeName;
        return this;
    }

    /**
     * Get the artifactStorageAccessMode property: The artifactStorageAccessMode property.
     * 
     * @return the artifactStorageAccessMode value.
     */
    public String artifactStorageAccessMode() {
        return this.artifactStorageAccessMode;
    }

    /**
     * Set the artifactStorageAccessMode property: The artifactStorageAccessMode property.
     * 
     * @param artifactStorageAccessMode the artifactStorageAccessMode value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withArtifactStorageAccessMode(String artifactStorageAccessMode) {
        this.artifactStorageAccessMode = artifactStorageAccessMode;
        return this;
    }

    /**
     * Get the frontEndServiceConfiguration property: The frontEndServiceConfiguration property.
     * 
     * @return the frontEndServiceConfiguration value.
     */
    public FrontEndConfiguration frontEndServiceConfiguration() {
        return this.frontEndServiceConfiguration;
    }

    /**
     * Set the frontEndServiceConfiguration property: The frontEndServiceConfiguration property.
     * 
     * @param frontEndServiceConfiguration the frontEndServiceConfiguration value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withFrontEndServiceConfiguration(FrontEndConfiguration frontEndServiceConfiguration) {
        this.frontEndServiceConfiguration = frontEndServiceConfiguration;
        return this;
    }

    /**
     * Get the kubeConfig property: The kubeConfig property.
     * 
     * @return the kubeConfig value.
     */
    public String kubeConfig() {
        return this.kubeConfig;
    }

    /**
     * Set the kubeConfig property: The kubeConfig property.
     * 
     * @param kubeConfig the kubeConfig value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frontEndServiceConfiguration() != null) {
            frontEndServiceConfiguration().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("artifactsStorageType",
            this.artifactsStorageType == null ? null : this.artifactsStorageType.toString());
        jsonWriter.writeStringField("artifactStorageClassName", this.artifactStorageClassName);
        jsonWriter.writeStringField("artifactStorageMountPath", this.artifactStorageMountPath);
        jsonWriter.writeStringField("artifactStorageNodeName", this.artifactStorageNodeName);
        jsonWriter.writeStringField("artifactStorageAccessMode", this.artifactStorageAccessMode);
        jsonWriter.writeJsonField("frontEndServiceConfiguration", this.frontEndServiceConfiguration);
        jsonWriter.writeStringField("kubeConfig", this.kubeConfig);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArcConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArcConfiguration if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ArcConfiguration.
     */
    public static ArcConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ArcConfiguration deserializedArcConfiguration = new ArcConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("artifactsStorageType".equals(fieldName)) {
                    deserializedArcConfiguration.artifactsStorageType = StorageType.fromString(reader.getString());
                } else if ("artifactStorageClassName".equals(fieldName)) {
                    deserializedArcConfiguration.artifactStorageClassName = reader.getString();
                } else if ("artifactStorageMountPath".equals(fieldName)) {
                    deserializedArcConfiguration.artifactStorageMountPath = reader.getString();
                } else if ("artifactStorageNodeName".equals(fieldName)) {
                    deserializedArcConfiguration.artifactStorageNodeName = reader.getString();
                } else if ("artifactStorageAccessMode".equals(fieldName)) {
                    deserializedArcConfiguration.artifactStorageAccessMode = reader.getString();
                } else if ("frontEndServiceConfiguration".equals(fieldName)) {
                    deserializedArcConfiguration.frontEndServiceConfiguration = FrontEndConfiguration.fromJson(reader);
                } else if ("kubeConfig".equals(fieldName)) {
                    deserializedArcConfiguration.kubeConfig = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArcConfiguration;
        });
    }
}
