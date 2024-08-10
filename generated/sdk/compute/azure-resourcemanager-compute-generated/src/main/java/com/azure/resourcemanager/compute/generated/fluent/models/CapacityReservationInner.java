// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.models.CapacityReservationInstanceView;
import com.azure.resourcemanager.compute.generated.models.Sku;
import com.azure.resourcemanager.compute.generated.models.SubResourceReadOnly;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Specifies information about the capacity reservation.
 */
@Fluent
public final class CapacityReservationInner extends Resource {
    /*
     * Properties of the Capacity reservation.
     */
    private CapacityReservationProperties innerProperties;

    /*
     * SKU of the resource for which capacity needs be reserved. The SKU name and capacity is required to be set.
     * Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are supported. Refer to
     * List Microsoft.Compute SKUs in a region (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for
     * supported values.
     */
    private Sku sku;

    /*
     * Availability Zone to use for this capacity reservation. The zone has to be single value and also should be part
     * for the list of zones specified during the capacity reservation group creation. The zone can be assigned only
     * during creation. If not provided, the reservation supports only non-zonal deployments. If provided, enforces
     * VM/VMSS using this capacity reservation to be in same zone.
     */
    private List<String> zones;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of CapacityReservationInner class.
     */
    public CapacityReservationInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Capacity reservation.
     * 
     * @return the innerProperties value.
     */
    private CapacityReservationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: SKU of the resource for which capacity needs be reserved. The SKU name and capacity is
     * required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are
     * supported. Refer to List Microsoft.Compute SKUs in a region
     * (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of the resource for which capacity needs be reserved. The SKU name and capacity is
     * required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are
     * supported. Refer to List Microsoft.Compute SKUs in a region
     * (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     * 
     * @param sku the sku value to set.
     * @return the CapacityReservationInner object itself.
     */
    public CapacityReservationInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the zones property: Availability Zone to use for this capacity reservation. The zone has to be single value
     * and also should be part for the list of zones specified during the capacity reservation group creation. The zone
     * can be assigned only during creation. If not provided, the reservation supports only non-zonal deployments. If
     * provided, enforces VM/VMSS using this capacity reservation to be in same zone.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Availability Zone to use for this capacity reservation. The zone has to be single value
     * and also should be part for the list of zones specified during the capacity reservation group creation. The zone
     * can be assigned only during creation. If not provided, the reservation supports only non-zonal deployments. If
     * provided, enforces VM/VMSS using this capacity reservation to be in same zone.
     * 
     * @param zones the zones value to set.
     * @return the CapacityReservationInner object itself.
     */
    public CapacityReservationInner withZones(List<String> zones) {
        this.zones = zones;
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
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CapacityReservationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CapacityReservationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the reservationId property: A unique id generated and assigned to the capacity reservation by the platform
     * which does not change throughout the lifetime of the resource.
     * 
     * @return the reservationId value.
     */
    public String reservationId() {
        return this.innerProperties() == null ? null : this.innerProperties().reservationId();
    }

    /**
     * Get the platformFaultDomainCount property: Specifies the value of fault domain count that Capacity Reservation
     * supports for requested VM size. **Note:** The fault domain count specified for a resource (like virtual machines
     * scale set) must be less than or equal to this value if it deploys using capacity reservation. Minimum
     * api-version: 2022-08-01.
     * 
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.innerProperties() == null ? null : this.innerProperties().platformFaultDomainCount();
    }

    /**
     * Get the virtualMachinesAssociated property: A list of all virtual machine resource ids that are associated with
     * the capacity reservation.
     * 
     * @return the virtualMachinesAssociated value.
     */
    public List<SubResourceReadOnly> virtualMachinesAssociated() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachinesAssociated();
    }

    /**
     * Get the provisioningTime property: The date time when the capacity reservation was last updated.
     * 
     * @return the provisioningTime value.
     */
    public OffsetDateTime provisioningTime() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningTime();
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the instanceView property: The Capacity reservation instance view.
     * 
     * @return the instanceView value.
     */
    public CapacityReservationInstanceView instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
    }

    /**
     * Get the timeCreated property: Specifies the time at which the Capacity Reservation resource was created. Minimum
     * api-version: 2021-11-01.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sku in model CapacityReservationInner"));
        } else {
            sku().validate();
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model CapacityReservationInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CapacityReservationInner.class);

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
        jsonWriter.writeArrayField("zones", this.zones, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CapacityReservationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CapacityReservationInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CapacityReservationInner.
     */
    public static CapacityReservationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CapacityReservationInner deserializedCapacityReservationInner = new CapacityReservationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCapacityReservationInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedCapacityReservationInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCapacityReservationInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedCapacityReservationInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedCapacityReservationInner.withTags(tags);
                } else if ("sku".equals(fieldName)) {
                    deserializedCapacityReservationInner.sku = Sku.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedCapacityReservationInner.innerProperties
                        = CapacityReservationProperties.fromJson(reader);
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedCapacityReservationInner.zones = zones;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCapacityReservationInner;
        });
    }
}
