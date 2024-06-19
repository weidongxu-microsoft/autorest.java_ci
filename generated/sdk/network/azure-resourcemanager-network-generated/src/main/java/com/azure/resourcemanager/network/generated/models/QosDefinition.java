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
import java.util.List;

/**
 * Quality of Service defines the traffic configuration between endpoints. Mandatory to have one marking.
 */
@Fluent
public final class QosDefinition implements JsonSerializable<QosDefinition> {
    /*
     * List of markings to be used in the configuration.
     */
    private List<Integer> markings;

    /*
     * Source IP ranges.
     */
    private List<QosIpRange> sourceIpRanges;

    /*
     * Destination IP ranges.
     */
    private List<QosIpRange> destinationIpRanges;

    /*
     * Sources port ranges.
     */
    private List<QosPortRange> sourcePortRanges;

    /*
     * Destination port ranges.
     */
    private List<QosPortRange> destinationPortRanges;

    /*
     * RNM supported protocol types.
     */
    private ProtocolType protocol;

    /**
     * Creates an instance of QosDefinition class.
     */
    public QosDefinition() {
    }

    /**
     * Get the markings property: List of markings to be used in the configuration.
     * 
     * @return the markings value.
     */
    public List<Integer> markings() {
        return this.markings;
    }

    /**
     * Set the markings property: List of markings to be used in the configuration.
     * 
     * @param markings the markings value to set.
     * @return the QosDefinition object itself.
     */
    public QosDefinition withMarkings(List<Integer> markings) {
        this.markings = markings;
        return this;
    }

    /**
     * Get the sourceIpRanges property: Source IP ranges.
     * 
     * @return the sourceIpRanges value.
     */
    public List<QosIpRange> sourceIpRanges() {
        return this.sourceIpRanges;
    }

    /**
     * Set the sourceIpRanges property: Source IP ranges.
     * 
     * @param sourceIpRanges the sourceIpRanges value to set.
     * @return the QosDefinition object itself.
     */
    public QosDefinition withSourceIpRanges(List<QosIpRange> sourceIpRanges) {
        this.sourceIpRanges = sourceIpRanges;
        return this;
    }

    /**
     * Get the destinationIpRanges property: Destination IP ranges.
     * 
     * @return the destinationIpRanges value.
     */
    public List<QosIpRange> destinationIpRanges() {
        return this.destinationIpRanges;
    }

    /**
     * Set the destinationIpRanges property: Destination IP ranges.
     * 
     * @param destinationIpRanges the destinationIpRanges value to set.
     * @return the QosDefinition object itself.
     */
    public QosDefinition withDestinationIpRanges(List<QosIpRange> destinationIpRanges) {
        this.destinationIpRanges = destinationIpRanges;
        return this;
    }

    /**
     * Get the sourcePortRanges property: Sources port ranges.
     * 
     * @return the sourcePortRanges value.
     */
    public List<QosPortRange> sourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * Set the sourcePortRanges property: Sources port ranges.
     * 
     * @param sourcePortRanges the sourcePortRanges value to set.
     * @return the QosDefinition object itself.
     */
    public QosDefinition withSourcePortRanges(List<QosPortRange> sourcePortRanges) {
        this.sourcePortRanges = sourcePortRanges;
        return this;
    }

    /**
     * Get the destinationPortRanges property: Destination port ranges.
     * 
     * @return the destinationPortRanges value.
     */
    public List<QosPortRange> destinationPortRanges() {
        return this.destinationPortRanges;
    }

    /**
     * Set the destinationPortRanges property: Destination port ranges.
     * 
     * @param destinationPortRanges the destinationPortRanges value to set.
     * @return the QosDefinition object itself.
     */
    public QosDefinition withDestinationPortRanges(List<QosPortRange> destinationPortRanges) {
        this.destinationPortRanges = destinationPortRanges;
        return this;
    }

    /**
     * Get the protocol property: RNM supported protocol types.
     * 
     * @return the protocol value.
     */
    public ProtocolType protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: RNM supported protocol types.
     * 
     * @param protocol the protocol value to set.
     * @return the QosDefinition object itself.
     */
    public QosDefinition withProtocol(ProtocolType protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceIpRanges() != null) {
            sourceIpRanges().forEach(e -> e.validate());
        }
        if (destinationIpRanges() != null) {
            destinationIpRanges().forEach(e -> e.validate());
        }
        if (sourcePortRanges() != null) {
            sourcePortRanges().forEach(e -> e.validate());
        }
        if (destinationPortRanges() != null) {
            destinationPortRanges().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("markings", this.markings, (writer, element) -> writer.writeInt(element));
        jsonWriter.writeArrayField("sourceIpRanges", this.sourceIpRanges,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("destinationIpRanges", this.destinationIpRanges,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("sourcePortRanges", this.sourcePortRanges,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("destinationPortRanges", this.destinationPortRanges,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("protocol", this.protocol == null ? null : this.protocol.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QosDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QosDefinition if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the QosDefinition.
     */
    public static QosDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QosDefinition deserializedQosDefinition = new QosDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("markings".equals(fieldName)) {
                    List<Integer> markings = reader.readArray(reader1 -> reader1.getInt());
                    deserializedQosDefinition.markings = markings;
                } else if ("sourceIpRanges".equals(fieldName)) {
                    List<QosIpRange> sourceIpRanges = reader.readArray(reader1 -> QosIpRange.fromJson(reader1));
                    deserializedQosDefinition.sourceIpRanges = sourceIpRanges;
                } else if ("destinationIpRanges".equals(fieldName)) {
                    List<QosIpRange> destinationIpRanges = reader.readArray(reader1 -> QosIpRange.fromJson(reader1));
                    deserializedQosDefinition.destinationIpRanges = destinationIpRanges;
                } else if ("sourcePortRanges".equals(fieldName)) {
                    List<QosPortRange> sourcePortRanges = reader.readArray(reader1 -> QosPortRange.fromJson(reader1));
                    deserializedQosDefinition.sourcePortRanges = sourcePortRanges;
                } else if ("destinationPortRanges".equals(fieldName)) {
                    List<QosPortRange> destinationPortRanges
                        = reader.readArray(reader1 -> QosPortRange.fromJson(reader1));
                    deserializedQosDefinition.destinationPortRanges = destinationPortRanges;
                } else if ("protocol".equals(fieldName)) {
                    deserializedQosDefinition.protocol = ProtocolType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQosDefinition;
        });
    }
}
