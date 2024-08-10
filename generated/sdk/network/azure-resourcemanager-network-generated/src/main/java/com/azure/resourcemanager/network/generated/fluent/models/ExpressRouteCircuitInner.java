// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitServiceProviderProperties;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitSku;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.ServiceProviderProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * ExpressRouteCircuit resource.
 */
@Fluent
public final class ExpressRouteCircuitInner extends Resource {
    /*
     * The SKU.
     */
    private ExpressRouteCircuitSku sku;

    /*
     * Properties of the express route circuit.
     */
    private ExpressRouteCircuitPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Resource ID.
     */
    private String id;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /**
     * Creates an instance of ExpressRouteCircuitInner class.
     */
    public ExpressRouteCircuitInner() {
    }

    /**
     * Get the sku property: The SKU.
     * 
     * @return the sku value.
     */
    public ExpressRouteCircuitSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU.
     * 
     * @param sku the sku value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withSku(ExpressRouteCircuitSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the express route circuit.
     * 
     * @return the innerProperties value.
     */
    private ExpressRouteCircuitPropertiesFormat innerProperties() {
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
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withId(String id) {
        this.id = id;
        return this;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExpressRouteCircuitInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExpressRouteCircuitInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the allowClassicOperations property: Allow classic operations.
     * 
     * @return the allowClassicOperations value.
     */
    public Boolean allowClassicOperations() {
        return this.innerProperties() == null ? null : this.innerProperties().allowClassicOperations();
    }

    /**
     * Set the allowClassicOperations property: Allow classic operations.
     * 
     * @param allowClassicOperations the allowClassicOperations value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withAllowClassicOperations(Boolean allowClassicOperations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withAllowClassicOperations(allowClassicOperations);
        return this;
    }

    /**
     * Get the circuitProvisioningState property: The CircuitProvisioningState state of the resource.
     * 
     * @return the circuitProvisioningState value.
     */
    public String circuitProvisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().circuitProvisioningState();
    }

    /**
     * Set the circuitProvisioningState property: The CircuitProvisioningState state of the resource.
     * 
     * @param circuitProvisioningState the circuitProvisioningState value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withCircuitProvisioningState(String circuitProvisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withCircuitProvisioningState(circuitProvisioningState);
        return this;
    }

    /**
     * Get the serviceProviderProvisioningState property: The ServiceProviderProvisioningState state of the resource.
     * 
     * @return the serviceProviderProvisioningState value.
     */
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceProviderProvisioningState();
    }

    /**
     * Set the serviceProviderProvisioningState property: The ServiceProviderProvisioningState state of the resource.
     * 
     * @param serviceProviderProvisioningState the serviceProviderProvisioningState value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner
        withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withServiceProviderProvisioningState(serviceProviderProvisioningState);
        return this;
    }

    /**
     * Get the authorizations property: The list of authorizations.
     * 
     * @return the authorizations value.
     */
    public List<ExpressRouteCircuitAuthorizationInner> authorizations() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizations();
    }

    /**
     * Set the authorizations property: The list of authorizations.
     * 
     * @param authorizations the authorizations value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withAuthorizations(authorizations);
        return this;
    }

    /**
     * Get the peerings property: The list of peerings.
     * 
     * @return the peerings value.
     */
    public List<ExpressRouteCircuitPeeringInner> peerings() {
        return this.innerProperties() == null ? null : this.innerProperties().peerings();
    }

    /**
     * Set the peerings property: The list of peerings.
     * 
     * @param peerings the peerings value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withPeerings(List<ExpressRouteCircuitPeeringInner> peerings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withPeerings(peerings);
        return this;
    }

    /**
     * Get the serviceKey property: The ServiceKey.
     * 
     * @return the serviceKey value.
     */
    public String serviceKey() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceKey();
    }

    /**
     * Set the serviceKey property: The ServiceKey.
     * 
     * @param serviceKey the serviceKey value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceKey(String serviceKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withServiceKey(serviceKey);
        return this;
    }

    /**
     * Get the serviceProviderNotes property: The ServiceProviderNotes.
     * 
     * @return the serviceProviderNotes value.
     */
    public String serviceProviderNotes() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceProviderNotes();
    }

    /**
     * Set the serviceProviderNotes property: The ServiceProviderNotes.
     * 
     * @param serviceProviderNotes the serviceProviderNotes value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderNotes(String serviceProviderNotes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withServiceProviderNotes(serviceProviderNotes);
        return this;
    }

    /**
     * Get the serviceProviderProperties property: The ServiceProviderProperties.
     * 
     * @return the serviceProviderProperties value.
     */
    public ExpressRouteCircuitServiceProviderProperties serviceProviderProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceProviderProperties();
    }

    /**
     * Set the serviceProviderProperties property: The ServiceProviderProperties.
     * 
     * @param serviceProviderProperties the serviceProviderProperties value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner
        withServiceProviderProperties(ExpressRouteCircuitServiceProviderProperties serviceProviderProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withServiceProviderProperties(serviceProviderProperties);
        return this;
    }

    /**
     * Get the expressRoutePort property: The reference to the ExpressRoutePort resource when the circuit is provisioned
     * on an ExpressRoutePort resource.
     * 
     * @return the expressRoutePort value.
     */
    public SubResource expressRoutePort() {
        return this.innerProperties() == null ? null : this.innerProperties().expressRoutePort();
    }

    /**
     * Set the expressRoutePort property: The reference to the ExpressRoutePort resource when the circuit is provisioned
     * on an ExpressRoutePort resource.
     * 
     * @param expressRoutePort the expressRoutePort value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withExpressRoutePort(SubResource expressRoutePort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withExpressRoutePort(expressRoutePort);
        return this;
    }

    /**
     * Get the bandwidthInGbps property: The bandwidth of the circuit when the circuit is provisioned on an
     * ExpressRoutePort resource.
     * 
     * @return the bandwidthInGbps value.
     */
    public Float bandwidthInGbps() {
        return this.innerProperties() == null ? null : this.innerProperties().bandwidthInGbps();
    }

    /**
     * Set the bandwidthInGbps property: The bandwidth of the circuit when the circuit is provisioned on an
     * ExpressRoutePort resource.
     * 
     * @param bandwidthInGbps the bandwidthInGbps value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withBandwidthInGbps(Float bandwidthInGbps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withBandwidthInGbps(bandwidthInGbps);
        return this;
    }

    /**
     * Get the stag property: The identifier of the circuit traffic. Outer tag for QinQ encapsulation.
     * 
     * @return the stag value.
     */
    public Integer stag() {
        return this.innerProperties() == null ? null : this.innerProperties().stag();
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route circuit resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the gatewayManagerEtag property: The GatewayManager Etag.
     * 
     * @return the gatewayManagerEtag value.
     */
    public String gatewayManagerEtag() {
        return this.innerProperties() == null ? null : this.innerProperties().gatewayManagerEtag();
    }

    /**
     * Set the gatewayManagerEtag property: The GatewayManager Etag.
     * 
     * @param gatewayManagerEtag the gatewayManagerEtag value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withGatewayManagerEtag(String gatewayManagerEtag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withGatewayManagerEtag(gatewayManagerEtag);
        return this;
    }

    /**
     * Get the globalReachEnabled property: Flag denoting global reach status.
     * 
     * @return the globalReachEnabled value.
     */
    public Boolean globalReachEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().globalReachEnabled();
    }

    /**
     * Set the globalReachEnabled property: Flag denoting global reach status.
     * 
     * @param globalReachEnabled the globalReachEnabled value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withGlobalReachEnabled(Boolean globalReachEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withGlobalReachEnabled(globalReachEnabled);
        return this;
    }

    /**
     * Get the authorizationKey property: The authorizationKey.
     * 
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationKey();
    }

    /**
     * Set the authorizationKey property: The authorizationKey.
     * 
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withAuthorizationKey(String authorizationKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withAuthorizationKey(authorizationKey);
        return this;
    }

    /**
     * Get the authorizationStatus property: The authorization status of the Circuit.
     * 
     * @return the authorizationStatus value.
     */
    public String authorizationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationStatus();
    }

    /**
     * Get the enableDirectPortRateLimit property: Flag denoting rate-limiting status of the ExpressRoute direct-port
     * circuit.
     * 
     * @return the enableDirectPortRateLimit value.
     */
    public Boolean enableDirectPortRateLimit() {
        return this.innerProperties() == null ? null : this.innerProperties().enableDirectPortRateLimit();
    }

    /**
     * Set the enableDirectPortRateLimit property: Flag denoting rate-limiting status of the ExpressRoute direct-port
     * circuit.
     * 
     * @param enableDirectPortRateLimit the enableDirectPortRateLimit value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withEnableDirectPortRateLimit(Boolean enableDirectPortRateLimit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withEnableDirectPortRateLimit(enableDirectPortRateLimit);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model ExpressRouteCircuitInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExpressRouteCircuitInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpressRouteCircuitInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteCircuitInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExpressRouteCircuitInner.
     */
    public static ExpressRouteCircuitInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteCircuitInner deserializedExpressRouteCircuitInner = new ExpressRouteCircuitInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedExpressRouteCircuitInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedExpressRouteCircuitInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedExpressRouteCircuitInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedExpressRouteCircuitInner.withTags(tags);
                } else if ("sku".equals(fieldName)) {
                    deserializedExpressRouteCircuitInner.sku = ExpressRouteCircuitSku.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedExpressRouteCircuitInner.innerProperties
                        = ExpressRouteCircuitPropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedExpressRouteCircuitInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedExpressRouteCircuitInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteCircuitInner;
        });
    }
}
