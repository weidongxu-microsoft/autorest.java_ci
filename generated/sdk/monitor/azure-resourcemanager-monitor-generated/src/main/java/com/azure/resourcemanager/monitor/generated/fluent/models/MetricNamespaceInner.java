// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.generated.models.MetricNamespaceName;
import com.azure.resourcemanager.monitor.generated.models.NamespaceClassification;
import java.io.IOException;

/**
 * Metric namespace class specifies the metadata for a metric namespace.
 */
@Fluent
public final class MetricNamespaceInner implements JsonSerializable<MetricNamespaceInner> {
    /*
     * The ID of the metric namespace.
     */
    private String id;

    /*
     * The type of the namespace.
     */
    private String type;

    /*
     * The escaped name of the namespace.
     */
    private String name;

    /*
     * Kind of namespace
     */
    private NamespaceClassification classification;

    /*
     * Properties which include the fully qualified namespace name.
     */
    private MetricNamespaceName properties;

    /**
     * Creates an instance of MetricNamespaceInner class.
     */
    public MetricNamespaceInner() {
    }

    /**
     * Get the id property: The ID of the metric namespace.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the metric namespace.
     * 
     * @param id the id value to set.
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: The type of the namespace.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the namespace.
     * 
     * @param type the type value to set.
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The escaped name of the namespace.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The escaped name of the namespace.
     * 
     * @param name the name value to set.
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the classification property: Kind of namespace.
     * 
     * @return the classification value.
     */
    public NamespaceClassification classification() {
        return this.classification;
    }

    /**
     * Set the classification property: Kind of namespace.
     * 
     * @param classification the classification value to set.
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withClassification(NamespaceClassification classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Get the properties property: Properties which include the fully qualified namespace name.
     * 
     * @return the properties value.
     */
    public MetricNamespaceName properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties which include the fully qualified namespace name.
     * 
     * @param properties the properties value to set.
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withProperties(MetricNamespaceName properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("classification",
            this.classification == null ? null : this.classification.toString());
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricNamespaceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricNamespaceInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MetricNamespaceInner.
     */
    public static MetricNamespaceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricNamespaceInner deserializedMetricNamespaceInner = new MetricNamespaceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMetricNamespaceInner.id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMetricNamespaceInner.type = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMetricNamespaceInner.name = reader.getString();
                } else if ("classification".equals(fieldName)) {
                    deserializedMetricNamespaceInner.classification
                        = NamespaceClassification.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedMetricNamespaceInner.properties = MetricNamespaceName.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricNamespaceInner;
        });
    }
}
