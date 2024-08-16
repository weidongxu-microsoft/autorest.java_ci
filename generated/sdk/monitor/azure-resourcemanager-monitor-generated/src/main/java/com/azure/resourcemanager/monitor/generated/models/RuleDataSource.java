// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The resource from which the rule collects its data.
 */
@Fluent
public class RuleDataSource implements JsonSerializable<RuleDataSource> {
    /*
     * specifies the type of data source. There are two types of rule data sources: RuleMetricDataSource and
     * RuleManagementEventDataSource
     */
    String odataType;

    /*
     * the resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an
     * existing rule.
     */
    private String resourceUri;

    /*
     * the legacy resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for
     * an existing rule.
     */
    private String legacyResourceId;

    /*
     * the location of the resource.
     */
    private String resourceLocation;

    /*
     * the namespace of the metric.
     */
    private String metricNamespace;

    /**
     * Creates an instance of RuleDataSource class.
     */
    public RuleDataSource() {
        this.odataType = "RuleDataSource";
    }

    /**
     * Get the odataType property: specifies the type of data source. There are two types of rule data sources:
     * RuleMetricDataSource and RuleManagementEventDataSource.
     * 
     * @return the odataType value.
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * Get the resourceUri property: the resource identifier of the resource the rule monitors. **NOTE**: this property
     * cannot be updated for an existing rule.
     * 
     * @return the resourceUri value.
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: the resource identifier of the resource the rule monitors. **NOTE**: this property
     * cannot be updated for an existing rule.
     * 
     * @param resourceUri the resourceUri value to set.
     * @return the RuleDataSource object itself.
     */
    public RuleDataSource withResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    /**
     * Get the legacyResourceId property: the legacy resource identifier of the resource the rule monitors. **NOTE**:
     * this property cannot be updated for an existing rule.
     * 
     * @return the legacyResourceId value.
     */
    public String legacyResourceId() {
        return this.legacyResourceId;
    }

    /**
     * Set the legacyResourceId property: the legacy resource identifier of the resource the rule monitors. **NOTE**:
     * this property cannot be updated for an existing rule.
     * 
     * @param legacyResourceId the legacyResourceId value to set.
     * @return the RuleDataSource object itself.
     */
    public RuleDataSource withLegacyResourceId(String legacyResourceId) {
        this.legacyResourceId = legacyResourceId;
        return this;
    }

    /**
     * Get the resourceLocation property: the location of the resource.
     * 
     * @return the resourceLocation value.
     */
    public String resourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Set the resourceLocation property: the location of the resource.
     * 
     * @param resourceLocation the resourceLocation value to set.
     * @return the RuleDataSource object itself.
     */
    public RuleDataSource withResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }

    /**
     * Get the metricNamespace property: the namespace of the metric.
     * 
     * @return the metricNamespace value.
     */
    public String metricNamespace() {
        return this.metricNamespace;
    }

    /**
     * Set the metricNamespace property: the namespace of the metric.
     * 
     * @param metricNamespace the metricNamespace value to set.
     * @return the RuleDataSource object itself.
     */
    public RuleDataSource withMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
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
        toJsonShared(jsonWriter);
        return jsonWriter.writeEndObject();
    }

    void toJsonShared(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStringField("odata.type", this.odataType);
        jsonWriter.writeStringField("resourceUri", this.resourceUri);
        jsonWriter.writeStringField("legacyResourceId", this.legacyResourceId);
        jsonWriter.writeStringField("resourceLocation", this.resourceLocation);
        jsonWriter.writeStringField("metricNamespace", this.metricNamespace);
    }

    /**
     * Reads an instance of RuleDataSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RuleDataSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RuleDataSource.
     */
    public static RuleDataSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("odata.type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Microsoft.Azure.Management.Insights.Models.RuleMetricDataSource".equals(discriminatorValue)) {
                    return RuleMetricDataSource.fromJson(readerToUse.reset());
                } else if ("Microsoft.Azure.Management.Insights.Models.RuleManagementEventDataSource"
                    .equals(discriminatorValue)) {
                    return RuleManagementEventDataSource.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static RuleDataSource fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RuleDataSource deserializedRuleDataSource = new RuleDataSource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("odata.type".equals(fieldName)) {
                    deserializedRuleDataSource.odataType = reader.getString();
                } else if ("resourceUri".equals(fieldName)) {
                    deserializedRuleDataSource.resourceUri = reader.getString();
                } else if ("legacyResourceId".equals(fieldName)) {
                    deserializedRuleDataSource.legacyResourceId = reader.getString();
                } else if ("resourceLocation".equals(fieldName)) {
                    deserializedRuleDataSource.resourceLocation = reader.getString();
                } else if ("metricNamespace".equals(fieldName)) {
                    deserializedRuleDataSource.metricNamespace = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRuleDataSource;
        });
    }
}
