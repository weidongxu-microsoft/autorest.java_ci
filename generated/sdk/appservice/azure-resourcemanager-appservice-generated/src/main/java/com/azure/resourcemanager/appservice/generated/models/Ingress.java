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
import java.util.List;

/**
 * Container App Ingress configuration.
 */
@Fluent
public final class Ingress implements JsonSerializable<Ingress> {
    /*
     * Hostname.
     */
    private String fqdn;

    /*
     * Bool indicating if app exposes an external http endpoint
     */
    private Boolean external;

    /*
     * Target Port in containers for traffic from ingress
     */
    private Integer targetPort;

    /*
     * Ingress transport protocol
     */
    private IngressTransportMethod transport;

    /*
     * The traffic property.
     */
    private List<TrafficWeight> traffic;

    /*
     * Bool indicating if HTTP connections to is allowed. If set to false HTTP connections are automatically redirected
     * to HTTPS connections
     */
    private Boolean allowInsecure;

    /**
     * Creates an instance of Ingress class.
     */
    public Ingress() {
    }

    /**
     * Get the fqdn property: Hostname.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the external property: Bool indicating if app exposes an external http endpoint.
     * 
     * @return the external value.
     */
    public Boolean external() {
        return this.external;
    }

    /**
     * Set the external property: Bool indicating if app exposes an external http endpoint.
     * 
     * @param external the external value to set.
     * @return the Ingress object itself.
     */
    public Ingress withExternal(Boolean external) {
        this.external = external;
        return this;
    }

    /**
     * Get the targetPort property: Target Port in containers for traffic from ingress.
     * 
     * @return the targetPort value.
     */
    public Integer targetPort() {
        return this.targetPort;
    }

    /**
     * Set the targetPort property: Target Port in containers for traffic from ingress.
     * 
     * @param targetPort the targetPort value to set.
     * @return the Ingress object itself.
     */
    public Ingress withTargetPort(Integer targetPort) {
        this.targetPort = targetPort;
        return this;
    }

    /**
     * Get the transport property: Ingress transport protocol.
     * 
     * @return the transport value.
     */
    public IngressTransportMethod transport() {
        return this.transport;
    }

    /**
     * Set the transport property: Ingress transport protocol.
     * 
     * @param transport the transport value to set.
     * @return the Ingress object itself.
     */
    public Ingress withTransport(IngressTransportMethod transport) {
        this.transport = transport;
        return this;
    }

    /**
     * Get the traffic property: The traffic property.
     * 
     * @return the traffic value.
     */
    public List<TrafficWeight> traffic() {
        return this.traffic;
    }

    /**
     * Set the traffic property: The traffic property.
     * 
     * @param traffic the traffic value to set.
     * @return the Ingress object itself.
     */
    public Ingress withTraffic(List<TrafficWeight> traffic) {
        this.traffic = traffic;
        return this;
    }

    /**
     * Get the allowInsecure property: Bool indicating if HTTP connections to is allowed. If set to false HTTP
     * connections are automatically redirected to HTTPS connections.
     * 
     * @return the allowInsecure value.
     */
    public Boolean allowInsecure() {
        return this.allowInsecure;
    }

    /**
     * Set the allowInsecure property: Bool indicating if HTTP connections to is allowed. If set to false HTTP
     * connections are automatically redirected to HTTPS connections.
     * 
     * @param allowInsecure the allowInsecure value to set.
     * @return the Ingress object itself.
     */
    public Ingress withAllowInsecure(Boolean allowInsecure) {
        this.allowInsecure = allowInsecure;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (traffic() != null) {
            traffic().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("external", this.external);
        jsonWriter.writeNumberField("targetPort", this.targetPort);
        jsonWriter.writeStringField("transport", this.transport == null ? null : this.transport.toString());
        jsonWriter.writeArrayField("traffic", this.traffic, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("allowInsecure", this.allowInsecure);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Ingress from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Ingress if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Ingress.
     */
    public static Ingress fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Ingress deserializedIngress = new Ingress();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("fqdn".equals(fieldName)) {
                    deserializedIngress.fqdn = reader.getString();
                } else if ("external".equals(fieldName)) {
                    deserializedIngress.external = reader.getNullable(JsonReader::getBoolean);
                } else if ("targetPort".equals(fieldName)) {
                    deserializedIngress.targetPort = reader.getNullable(JsonReader::getInt);
                } else if ("transport".equals(fieldName)) {
                    deserializedIngress.transport = IngressTransportMethod.fromString(reader.getString());
                } else if ("traffic".equals(fieldName)) {
                    List<TrafficWeight> traffic = reader.readArray(reader1 -> TrafficWeight.fromJson(reader1));
                    deserializedIngress.traffic = traffic;
                } else if ("allowInsecure".equals(fieldName)) {
                    deserializedIngress.allowInsecure = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIngress;
        });
    }
}
