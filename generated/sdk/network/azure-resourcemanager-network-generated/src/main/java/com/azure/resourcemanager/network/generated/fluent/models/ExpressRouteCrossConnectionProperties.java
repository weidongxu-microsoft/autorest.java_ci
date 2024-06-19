// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitReference;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.ServiceProviderProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Properties of ExpressRouteCrossConnection.
 */
@Fluent
public final class ExpressRouteCrossConnectionProperties
    implements JsonSerializable<ExpressRouteCrossConnectionProperties> {
    /*
     * The name of the primary port.
     */
    private String primaryAzurePort;

    /*
     * The name of the secondary port.
     */
    private String secondaryAzurePort;

    /*
     * The identifier of the circuit traffic.
     */
    private Integer stag;

    /*
     * The peering location of the ExpressRoute circuit.
     */
    private String peeringLocation;

    /*
     * The circuit bandwidth In Mbps.
     */
    private Integer bandwidthInMbps;

    /*
     * The ExpressRouteCircuit.
     */
    private ExpressRouteCircuitReference expressRouteCircuit;

    /*
     * The provisioning state of the circuit in the connectivity provider system.
     */
    private ServiceProviderProvisioningState serviceProviderProvisioningState;

    /*
     * Additional read only notes set by the connectivity provider.
     */
    private String serviceProviderNotes;

    /*
     * The provisioning state of the express route cross connection resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The list of peerings.
     */
    private List<ExpressRouteCrossConnectionPeeringInner> peerings;

    /**
     * Creates an instance of ExpressRouteCrossConnectionProperties class.
     */
    public ExpressRouteCrossConnectionProperties() {
    }

    /**
     * Get the primaryAzurePort property: The name of the primary port.
     * 
     * @return the primaryAzurePort value.
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Get the secondaryAzurePort property: The name of the secondary port.
     * 
     * @return the secondaryAzurePort value.
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Get the stag property: The identifier of the circuit traffic.
     * 
     * @return the stag value.
     */
    public Integer stag() {
        return this.stag;
    }

    /**
     * Get the peeringLocation property: The peering location of the ExpressRoute circuit.
     * 
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Get the bandwidthInMbps property: The circuit bandwidth In Mbps.
     * 
     * @return the bandwidthInMbps value.
     */
    public Integer bandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    /**
     * Get the expressRouteCircuit property: The ExpressRouteCircuit.
     * 
     * @return the expressRouteCircuit value.
     */
    public ExpressRouteCircuitReference expressRouteCircuit() {
        return this.expressRouteCircuit;
    }

    /**
     * Set the expressRouteCircuit property: The ExpressRouteCircuit.
     * 
     * @param expressRouteCircuit the expressRouteCircuit value to set.
     * @return the ExpressRouteCrossConnectionProperties object itself.
     */
    public ExpressRouteCrossConnectionProperties
        withExpressRouteCircuit(ExpressRouteCircuitReference expressRouteCircuit) {
        this.expressRouteCircuit = expressRouteCircuit;
        return this;
    }

    /**
     * Get the serviceProviderProvisioningState property: The provisioning state of the circuit in the connectivity
     * provider system.
     * 
     * @return the serviceProviderProvisioningState value.
     */
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.serviceProviderProvisioningState;
    }

    /**
     * Set the serviceProviderProvisioningState property: The provisioning state of the circuit in the connectivity
     * provider system.
     * 
     * @param serviceProviderProvisioningState the serviceProviderProvisioningState value to set.
     * @return the ExpressRouteCrossConnectionProperties object itself.
     */
    public ExpressRouteCrossConnectionProperties
        withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.serviceProviderProvisioningState = serviceProviderProvisioningState;
        return this;
    }

    /**
     * Get the serviceProviderNotes property: Additional read only notes set by the connectivity provider.
     * 
     * @return the serviceProviderNotes value.
     */
    public String serviceProviderNotes() {
        return this.serviceProviderNotes;
    }

    /**
     * Set the serviceProviderNotes property: Additional read only notes set by the connectivity provider.
     * 
     * @param serviceProviderNotes the serviceProviderNotes value to set.
     * @return the ExpressRouteCrossConnectionProperties object itself.
     */
    public ExpressRouteCrossConnectionProperties withServiceProviderNotes(String serviceProviderNotes) {
        this.serviceProviderNotes = serviceProviderNotes;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route cross connection resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the peerings property: The list of peerings.
     * 
     * @return the peerings value.
     */
    public List<ExpressRouteCrossConnectionPeeringInner> peerings() {
        return this.peerings;
    }

    /**
     * Set the peerings property: The list of peerings.
     * 
     * @param peerings the peerings value to set.
     * @return the ExpressRouteCrossConnectionProperties object itself.
     */
    public ExpressRouteCrossConnectionProperties withPeerings(List<ExpressRouteCrossConnectionPeeringInner> peerings) {
        this.peerings = peerings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (expressRouteCircuit() != null) {
            expressRouteCircuit().validate();
        }
        if (peerings() != null) {
            peerings().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("expressRouteCircuit", this.expressRouteCircuit);
        jsonWriter.writeStringField("serviceProviderProvisioningState",
            this.serviceProviderProvisioningState == null ? null : this.serviceProviderProvisioningState.toString());
        jsonWriter.writeStringField("serviceProviderNotes", this.serviceProviderNotes);
        jsonWriter.writeArrayField("peerings", this.peerings, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpressRouteCrossConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteCrossConnectionProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExpressRouteCrossConnectionProperties.
     */
    public static ExpressRouteCrossConnectionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteCrossConnectionProperties deserializedExpressRouteCrossConnectionProperties
                = new ExpressRouteCrossConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("primaryAzurePort".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionProperties.primaryAzurePort = reader.getString();
                } else if ("secondaryAzurePort".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionProperties.secondaryAzurePort = reader.getString();
                } else if ("sTag".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionProperties.stag = reader.getNullable(JsonReader::getInt);
                } else if ("peeringLocation".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionProperties.peeringLocation = reader.getString();
                } else if ("bandwidthInMbps".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionProperties.bandwidthInMbps
                        = reader.getNullable(JsonReader::getInt);
                } else if ("expressRouteCircuit".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionProperties.expressRouteCircuit
                        = ExpressRouteCircuitReference.fromJson(reader);
                } else if ("serviceProviderProvisioningState".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionProperties.serviceProviderProvisioningState
                        = ServiceProviderProvisioningState.fromString(reader.getString());
                } else if ("serviceProviderNotes".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionProperties.serviceProviderNotes = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("peerings".equals(fieldName)) {
                    List<ExpressRouteCrossConnectionPeeringInner> peerings
                        = reader.readArray(reader1 -> ExpressRouteCrossConnectionPeeringInner.fromJson(reader1));
                    deserializedExpressRouteCrossConnectionProperties.peerings = peerings;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteCrossConnectionProperties;
        });
    }
}
