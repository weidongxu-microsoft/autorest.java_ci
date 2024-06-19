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
import java.util.Map;

/**
 * Message envelope that contains the common Azure resource manager properties and the resource provider specific
 * content.
 */
@Fluent
public final class ResponseMessageEnvelopeRemotePrivateEndpointConnection
    implements JsonSerializable<ResponseMessageEnvelopeRemotePrivateEndpointConnection> {
    /*
     * Resource Id. Typically ID is populated only for responses to GET requests. Caller is responsible for passing in
     * this
     * value for GET requests only.
     * For example:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupId}/providers/Microsoft.Web/sites/{sitename}
     */
    private String id;

    /*
     * Name of resource.
     */
    private String name;

    /*
     * Type of resource e.g "Microsoft.Web/sites".
     */
    private String type;

    /*
     * Geographical region resource belongs to e.g. SouthCentralUS, SouthEastAsia.
     */
    private String location;

    /*
     * Tags associated with resource.
     */
    private Map<String, String> tags;

    /*
     * Azure resource manager plan.
     */
    private ArmPlan plan;

    /*
     * Resource specific properties.
     */
    private RemotePrivateEndpointConnection properties;

    /*
     * SKU description of the resource.
     */
    private SkuDescription sku;

    /*
     * Azure-AsyncOperation Status info.
     */
    private String status;

    /*
     * Azure-AsyncOperation Error info.
     */
    private ErrorEntity error;

    /*
     * MSI resource
     */
    private ManagedServiceIdentity identity;

    /*
     * Logical Availability Zones the service is hosted in
     */
    private List<String> zones;

    /**
     * Creates an instance of ResponseMessageEnvelopeRemotePrivateEndpointConnection class.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection() {
    }

    /**
     * Get the id property: Resource Id. Typically ID is populated only for responses to GET requests. Caller is
     * responsible for passing in this
     * value for GET requests only.
     * For example:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupId}/providers/Microsoft.Web/sites/{sitename}.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource Id. Typically ID is populated only for responses to GET requests. Caller is
     * responsible for passing in this
     * value for GET requests only.
     * For example:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupId}/providers/Microsoft.Web/sites/{sitename}.
     * 
     * @param id the id value to set.
     * @return the ResponseMessageEnvelopeRemotePrivateEndpointConnection object itself.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of resource.
     * 
     * @param name the name value to set.
     * @return the ResponseMessageEnvelopeRemotePrivateEndpointConnection object itself.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Type of resource e.g "Microsoft.Web/sites".
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of resource e.g "Microsoft.Web/sites".
     * 
     * @param type the type value to set.
     * @return the ResponseMessageEnvelopeRemotePrivateEndpointConnection object itself.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the location property: Geographical region resource belongs to e.g. SouthCentralUS, SouthEastAsia.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Geographical region resource belongs to e.g. SouthCentralUS, SouthEastAsia.
     * 
     * @param location the location value to set.
     * @return the ResponseMessageEnvelopeRemotePrivateEndpointConnection object itself.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Tags associated with resource.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags associated with resource.
     * 
     * @param tags the tags value to set.
     * @return the ResponseMessageEnvelopeRemotePrivateEndpointConnection object itself.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the plan property: Azure resource manager plan.
     * 
     * @return the plan value.
     */
    public ArmPlan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Azure resource manager plan.
     * 
     * @param plan the plan value to set.
     * @return the ResponseMessageEnvelopeRemotePrivateEndpointConnection object itself.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection withPlan(ArmPlan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the properties property: Resource specific properties.
     * 
     * @return the properties value.
     */
    public RemotePrivateEndpointConnection properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Resource specific properties.
     * 
     * @param properties the properties value to set.
     * @return the ResponseMessageEnvelopeRemotePrivateEndpointConnection object itself.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection
        withProperties(RemotePrivateEndpointConnection properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: SKU description of the resource.
     * 
     * @return the sku value.
     */
    public SkuDescription sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU description of the resource.
     * 
     * @param sku the sku value to set.
     * @return the ResponseMessageEnvelopeRemotePrivateEndpointConnection object itself.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection withSku(SkuDescription sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the status property: Azure-AsyncOperation Status info.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Azure-AsyncOperation Status info.
     * 
     * @param status the status value to set.
     * @return the ResponseMessageEnvelopeRemotePrivateEndpointConnection object itself.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error property: Azure-AsyncOperation Error info.
     * 
     * @return the error value.
     */
    public ErrorEntity error() {
        return this.error;
    }

    /**
     * Set the error property: Azure-AsyncOperation Error info.
     * 
     * @param error the error value to set.
     * @return the ResponseMessageEnvelopeRemotePrivateEndpointConnection object itself.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection withError(ErrorEntity error) {
        this.error = error;
        return this;
    }

    /**
     * Get the identity property: MSI resource.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: MSI resource.
     * 
     * @param identity the identity value to set.
     * @return the ResponseMessageEnvelopeRemotePrivateEndpointConnection object itself.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the zones property: Logical Availability Zones the service is hosted in.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Logical Availability Zones the service is hosted in.
     * 
     * @param zones the zones value to set.
     * @return the ResponseMessageEnvelopeRemotePrivateEndpointConnection object itself.
     */
    public ResponseMessageEnvelopeRemotePrivateEndpointConnection withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (plan() != null) {
            plan().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (error() != null) {
            error().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("plan", this.plan);
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeJsonField("error", this.error);
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeArrayField("zones", this.zones, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResponseMessageEnvelopeRemotePrivateEndpointConnection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResponseMessageEnvelopeRemotePrivateEndpointConnection if the JsonReader was pointing to
     * an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResponseMessageEnvelopeRemotePrivateEndpointConnection.
     */
    public static ResponseMessageEnvelopeRemotePrivateEndpointConnection fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ResponseMessageEnvelopeRemotePrivateEndpointConnection deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection
                = new ResponseMessageEnvelopeRemotePrivateEndpointConnection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection.location = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection.tags = tags;
                } else if ("plan".equals(fieldName)) {
                    deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection.plan = ArmPlan.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection.properties
                        = RemotePrivateEndpointConnection.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection.sku
                        = SkuDescription.fromJson(reader);
                } else if ("status".equals(fieldName)) {
                    deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection.status = reader.getString();
                } else if ("error".equals(fieldName)) {
                    deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection.error
                        = ErrorEntity.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection.identity
                        = ManagedServiceIdentity.fromJson(reader);
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection.zones = zones;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResponseMessageEnvelopeRemotePrivateEndpointConnection;
        });
    }
}
