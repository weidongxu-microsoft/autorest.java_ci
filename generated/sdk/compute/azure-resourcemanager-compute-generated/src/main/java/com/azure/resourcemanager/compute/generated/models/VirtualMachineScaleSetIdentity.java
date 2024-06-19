// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Identity for the virtual machine scale set.
 */
@Fluent
public final class VirtualMachineScaleSetIdentity implements JsonSerializable<VirtualMachineScaleSetIdentity> {
    /*
     * The principal id of virtual machine scale set identity. This property will only be provided for a system assigned
     * identity.
     */
    private String principalId;

    /*
     * The tenant id associated with the virtual machine scale set. This property will only be provided for a system
     * assigned identity.
     */
    private String tenantId;

    /*
     * The type of identity used for the virtual machine scale set. The type 'SystemAssigned, UserAssigned' includes
     * both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any
     * identities from the virtual machine scale set.
     */
    private ResourceIdentityType type;

    /*
     * The list of user identities associated with the virtual machine scale set. The user identity dictionary key
     * references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/
     * userAssignedIdentities/{identityName}'.
     */
    private Map<String, UserAssignedIdentitiesValue> userAssignedIdentities;

    /**
     * Creates an instance of VirtualMachineScaleSetIdentity class.
     */
    public VirtualMachineScaleSetIdentity() {
    }

    /**
     * Get the principalId property: The principal id of virtual machine scale set identity. This property will only be
     * provided for a system assigned identity.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant id associated with the virtual machine scale set. This property will only
     * be provided for a system assigned identity.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The type of identity used for the virtual machine scale set. The type 'SystemAssigned,
     * UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None'
     * will remove any identities from the virtual machine scale set.
     * 
     * @return the type value.
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity used for the virtual machine scale set. The type 'SystemAssigned,
     * UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None'
     * will remove any identities from the virtual machine scale set.
     * 
     * @param type the type value to set.
     * @return the VirtualMachineScaleSetIdentity object itself.
     */
    public VirtualMachineScaleSetIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The list of user identities associated with the virtual machine scale
     * set. The user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedIdentitiesValue> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The list of user identities associated with the virtual machine scale
     * set. The user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the VirtualMachineScaleSetIdentity object itself.
     */
    public VirtualMachineScaleSetIdentity
        withUserAssignedIdentities(Map<String, UserAssignedIdentitiesValue> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeMapField("userAssignedIdentities", this.userAssignedIdentities,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetIdentity if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetIdentity.
     */
    public static VirtualMachineScaleSetIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetIdentity deserializedVirtualMachineScaleSetIdentity
                = new VirtualMachineScaleSetIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("principalId".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetIdentity.principalId = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetIdentity.tenantId = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetIdentity.type
                        = ResourceIdentityType.fromString(reader.getString());
                } else if ("userAssignedIdentities".equals(fieldName)) {
                    Map<String, UserAssignedIdentitiesValue> userAssignedIdentities
                        = reader.readMap(reader1 -> UserAssignedIdentitiesValue.fromJson(reader1));
                    deserializedVirtualMachineScaleSetIdentity.userAssignedIdentities = userAssignedIdentities;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetIdentity;
        });
    }
}
