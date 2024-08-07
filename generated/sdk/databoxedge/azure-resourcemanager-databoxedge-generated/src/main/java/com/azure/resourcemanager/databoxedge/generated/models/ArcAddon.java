// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.AddonInner;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.ArcAddonProperties;
import java.io.IOException;

/**
 * Arc Addon.
 */
@Fluent
public final class ArcAddon extends AddonInner {
    /*
     * Addon type.
     */
    private AddonType kind = AddonType.ARC_FOR_KUBERNETES;

    /*
     * Properties specific to Arc addon.
     */
    private ArcAddonProperties innerProperties = new ArcAddonProperties();

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

    /*
     * Metadata pertaining to creation and last modification of Addon
     */
    private SystemData systemData;

    /**
     * Creates an instance of ArcAddon class.
     */
    public ArcAddon() {
    }

    /**
     * Get the kind property: Addon type.
     * 
     * @return the kind value.
     */
    @Override
    public AddonType kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: Properties specific to Arc addon.
     * 
     * @return the innerProperties value.
     */
    private ArcAddonProperties innerProperties() {
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
     * Get the systemData property: Metadata pertaining to creation and last modification of Addon.
     * 
     * @return the systemData value.
     */
    @Override
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the subscriptionId property: Arc resource subscription Id.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionId();
    }

    /**
     * Set the subscriptionId property: Arc resource subscription Id.
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the ArcAddon object itself.
     */
    public ArcAddon withSubscriptionId(String subscriptionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcAddonProperties();
        }
        this.innerProperties().withSubscriptionId(subscriptionId);
        return this;
    }

    /**
     * Get the resourceGroupName property: Arc resource group name.
     * 
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGroupName();
    }

    /**
     * Set the resourceGroupName property: Arc resource group name.
     * 
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the ArcAddon object itself.
     */
    public ArcAddon withResourceGroupName(String resourceGroupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcAddonProperties();
        }
        this.innerProperties().withResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * Get the resourceName property: Arc resource Name.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceName();
    }

    /**
     * Set the resourceName property: Arc resource Name.
     * 
     * @param resourceName the resourceName value to set.
     * @return the ArcAddon object itself.
     */
    public ArcAddon withResourceName(String resourceName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcAddonProperties();
        }
        this.innerProperties().withResourceName(resourceName);
        return this;
    }

    /**
     * Get the resourceLocation property: Arc resource location.
     * 
     * @return the resourceLocation value.
     */
    public String resourceLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceLocation();
    }

    /**
     * Set the resourceLocation property: Arc resource location.
     * 
     * @param resourceLocation the resourceLocation value to set.
     * @return the ArcAddon object itself.
     */
    public ArcAddon withResourceLocation(String resourceLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcAddonProperties();
        }
        this.innerProperties().withResourceLocation(resourceLocation);
        return this;
    }

    /**
     * Get the version property: Arc resource version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the hostPlatform property: Host OS supported by the Arc addon.
     * 
     * @return the hostPlatform value.
     */
    public PlatformType hostPlatform() {
        return this.innerProperties() == null ? null : this.innerProperties().hostPlatform();
    }

    /**
     * Get the hostPlatformType property: Platform where the runtime is hosted.
     * 
     * @return the hostPlatformType value.
     */
    public HostPlatformType hostPlatformType() {
        return this.innerProperties() == null ? null : this.innerProperties().hostPlatformType();
    }

    /**
     * Get the provisioningState property: Addon Provisioning State.
     * 
     * @return the provisioningState value.
     */
    public AddonState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property innerProperties in model ArcAddon"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ArcAddon.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArcAddon from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArcAddon if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ArcAddon.
     */
    public static ArcAddon fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ArcAddon deserializedArcAddon = new ArcAddon();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedArcAddon.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedArcAddon.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedArcAddon.type = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedArcAddon.systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedArcAddon.innerProperties = ArcAddonProperties.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedArcAddon.kind = AddonType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArcAddon;
        });
    }
}
