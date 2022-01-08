// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.CommissionedState;
import com.azure.resourcemanager.network.generated.models.ExtendedLocation;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Custom IP prefix resource. */
@Fluent
public final class CustomIpPrefixInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomIpPrefixInner.class);

    /*
     * The extended location of the custom IP prefix.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Custom IP prefix properties.
     */
    @JsonProperty(value = "properties")
    private CustomIpPrefixPropertiesFormatInner innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * A list of availability zones denoting the IP allocated for the resource
     * needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the extendedLocation property: The extended location of the custom IP prefix.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the custom IP prefix.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: Custom IP prefix properties.
     *
     * @return the innerProperties value.
     */
    private CustomIpPrefixPropertiesFormatInner innerProperties() {
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
     * Get the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @param zones the zones value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
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
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomIpPrefixInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomIpPrefixInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the cidr property: The prefix range in CIDR notation. Should include the start address and the prefix length.
     *
     * @return the cidr value.
     */
    public String cidr() {
        return this.innerProperties() == null ? null : this.innerProperties().cidr();
    }

    /**
     * Set the cidr property: The prefix range in CIDR notation. Should include the start address and the prefix length.
     *
     * @param cidr the cidr value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withCidr(String cidr) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormatInner();
        }
        this.innerProperties().withCidr(cidr);
        return this;
    }

    /**
     * Get the signedMessage property: Signed message for WAN validation.
     *
     * @return the signedMessage value.
     */
    public String signedMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().signedMessage();
    }

    /**
     * Set the signedMessage property: Signed message for WAN validation.
     *
     * @param signedMessage the signedMessage value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withSignedMessage(String signedMessage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormatInner();
        }
        this.innerProperties().withSignedMessage(signedMessage);
        return this;
    }

    /**
     * Get the authorizationMessage property: Authorization message for WAN validation.
     *
     * @return the authorizationMessage value.
     */
    public String authorizationMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationMessage();
    }

    /**
     * Set the authorizationMessage property: Authorization message for WAN validation.
     *
     * @param authorizationMessage the authorizationMessage value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withAuthorizationMessage(String authorizationMessage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormatInner();
        }
        this.innerProperties().withAuthorizationMessage(authorizationMessage);
        return this;
    }

    /**
     * Get the customIpPrefixParent property: The Parent CustomIpPrefix for IPv6 /64 CustomIpPrefix.
     *
     * @return the customIpPrefixParent value.
     */
    public CustomIpPrefixInner customIpPrefixParent() {
        return this.innerProperties() == null ? null : this.innerProperties().customIpPrefixParent();
    }

    /**
     * Set the customIpPrefixParent property: The Parent CustomIpPrefix for IPv6 /64 CustomIpPrefix.
     *
     * @param customIpPrefixParent the customIpPrefixParent value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withCustomIpPrefixParent(CustomIpPrefixInner customIpPrefixParent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormatInner();
        }
        this.innerProperties().withCustomIpPrefixParent(customIpPrefixParent);
        return this;
    }

    /**
     * Get the childCustomIpPrefixes property: The list of all Children for IPv6 /48 CustomIpPrefix.
     *
     * @return the childCustomIpPrefixes value.
     */
    public List<CustomIpPrefixInner> childCustomIpPrefixes() {
        return this.innerProperties() == null ? null : this.innerProperties().childCustomIpPrefixes();
    }

    /**
     * Get the commissionedState property: The commissioned state of the Custom IP Prefix.
     *
     * @return the commissionedState value.
     */
    public CommissionedState commissionedState() {
        return this.innerProperties() == null ? null : this.innerProperties().commissionedState();
    }

    /**
     * Set the commissionedState property: The commissioned state of the Custom IP Prefix.
     *
     * @param commissionedState the commissionedState value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withCommissionedState(CommissionedState commissionedState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormatInner();
        }
        this.innerProperties().withCommissionedState(commissionedState);
        return this;
    }

    /**
     * Get the publicIpPrefixes property: The list of all referenced PublicIpPrefixes.
     *
     * @return the publicIpPrefixes value.
     */
    public List<SubResource> publicIpPrefixes() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpPrefixes();
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the custom IP prefix resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the failedReason property: The reason why resource is in failed state.
     *
     * @return the failedReason value.
     */
    public String failedReason() {
        return this.innerProperties() == null ? null : this.innerProperties().failedReason();
    }

    /**
     * Get the provisioningState property: The provisioning state of the custom IP prefix resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
