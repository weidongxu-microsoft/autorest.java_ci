// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.IpAllocationType;
import com.azure.resourcemanager.network.generated.models.IpVersion;
import java.io.IOException;
import java.util.Map;

/**
 * IpAllocation resource.
 */
@Fluent
public final class IpAllocationInner extends Resource {
    /*
     * Properties of the IpAllocation.
     */
    private IpAllocationPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Resource ID.
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

    /**
     * Creates an instance of IpAllocationInner class.
     */
    public IpAllocationInner() {
    }

    /**
     * Get the innerProperties property: Properties of the IpAllocation.
     * 
     * @return the innerProperties value.
     */
    private IpAllocationPropertiesFormat innerProperties() {
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
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withId(String id) {
        this.id = id;
        return this;
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
     * {@inheritDoc}
     */
    @Override
    public IpAllocationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IpAllocationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the subnet property: The Subnet that using the prefix of this IpAllocation resource.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Get the virtualNetwork property: The VirtualNetwork that using the prefix of this IpAllocation resource.
     * 
     * @return the virtualNetwork value.
     */
    public SubResource virtualNetwork() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetwork();
    }

    /**
     * Get the type property: The type for the IpAllocation.
     * 
     * @return the type value.
     */
    public IpAllocationType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: The type for the IpAllocation.
     * 
     * @param type the type value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withTypePropertiesType(IpAllocationType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpAllocationPropertiesFormat();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the prefix property: The address prefix for the IpAllocation.
     * 
     * @return the prefix value.
     */
    public String prefix() {
        return this.innerProperties() == null ? null : this.innerProperties().prefix();
    }

    /**
     * Set the prefix property: The address prefix for the IpAllocation.
     * 
     * @param prefix the prefix value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withPrefix(String prefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpAllocationPropertiesFormat();
        }
        this.innerProperties().withPrefix(prefix);
        return this;
    }

    /**
     * Get the prefixLength property: The address prefix length for the IpAllocation.
     * 
     * @return the prefixLength value.
     */
    public Integer prefixLength() {
        return this.innerProperties() == null ? null : this.innerProperties().prefixLength();
    }

    /**
     * Set the prefixLength property: The address prefix length for the IpAllocation.
     * 
     * @param prefixLength the prefixLength value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withPrefixLength(Integer prefixLength) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpAllocationPropertiesFormat();
        }
        this.innerProperties().withPrefixLength(prefixLength);
        return this;
    }

    /**
     * Get the prefixType property: The address prefix Type for the IpAllocation.
     * 
     * @return the prefixType value.
     */
    public IpVersion prefixType() {
        return this.innerProperties() == null ? null : this.innerProperties().prefixType();
    }

    /**
     * Set the prefixType property: The address prefix Type for the IpAllocation.
     * 
     * @param prefixType the prefixType value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withPrefixType(IpVersion prefixType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpAllocationPropertiesFormat();
        }
        this.innerProperties().withPrefixType(prefixType);
        return this;
    }

    /**
     * Get the ipamAllocationId property: The IPAM allocation ID.
     * 
     * @return the ipamAllocationId value.
     */
    public String ipamAllocationId() {
        return this.innerProperties() == null ? null : this.innerProperties().ipamAllocationId();
    }

    /**
     * Set the ipamAllocationId property: The IPAM allocation ID.
     * 
     * @param ipamAllocationId the ipamAllocationId value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withIpamAllocationId(String ipamAllocationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpAllocationPropertiesFormat();
        }
        this.innerProperties().withIpamAllocationId(ipamAllocationId);
        return this;
    }

    /**
     * Get the allocationTags property: IpAllocation tags.
     * 
     * @return the allocationTags value.
     */
    public Map<String, String> allocationTags() {
        return this.innerProperties() == null ? null : this.innerProperties().allocationTags();
    }

    /**
     * Set the allocationTags property: IpAllocation tags.
     * 
     * @param allocationTags the allocationTags value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withAllocationTags(Map<String, String> allocationTags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpAllocationPropertiesFormat();
        }
        this.innerProperties().withAllocationTags(allocationTags);
        return this;
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpAllocationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpAllocationInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IpAllocationInner.
     */
    public static IpAllocationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpAllocationInner deserializedIpAllocationInner = new IpAllocationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedIpAllocationInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedIpAllocationInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedIpAllocationInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedIpAllocationInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedIpAllocationInner.innerProperties = IpAllocationPropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedIpAllocationInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedIpAllocationInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpAllocationInner;
        });
    }
}
