// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.IsWorkloadProtected;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response for GetPublicIpAddressDdosProtectionStatusOperation API service call. */
@Fluent
public final class PublicIpDdosProtectionStatusResultInner {
    /*
     * Public IP ARM resource ID
     */
    @JsonProperty(value = "publicIpAddressId")
    private String publicIpAddressId;

    /*
     * IP Address of the Public IP Resource
     */
    @JsonProperty(value = "publicIpAddress")
    private String publicIpAddress;

    /*
     * Value indicating whether the IP address is DDoS workload protected or not.
     */
    @JsonProperty(value = "isWorkloadProtected")
    private IsWorkloadProtected isWorkloadProtected;

    /*
     * DDoS protection plan Resource Id of a if IP address is protected through a plan.
     */
    @JsonProperty(value = "ddosProtectionPlanId")
    private String ddosProtectionPlanId;

    /** Creates an instance of PublicIpDdosProtectionStatusResultInner class. */
    public PublicIpDdosProtectionStatusResultInner() {
    }

    /**
     * Get the publicIpAddressId property: Public IP ARM resource ID.
     *
     * @return the publicIpAddressId value.
     */
    public String publicIpAddressId() {
        return this.publicIpAddressId;
    }

    /**
     * Set the publicIpAddressId property: Public IP ARM resource ID.
     *
     * @param publicIpAddressId the publicIpAddressId value to set.
     * @return the PublicIpDdosProtectionStatusResultInner object itself.
     */
    public PublicIpDdosProtectionStatusResultInner withPublicIpAddressId(String publicIpAddressId) {
        this.publicIpAddressId = publicIpAddressId;
        return this;
    }

    /**
     * Get the publicIpAddress property: IP Address of the Public IP Resource.
     *
     * @return the publicIpAddress value.
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: IP Address of the Public IP Resource.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the PublicIpDdosProtectionStatusResultInner object itself.
     */
    public PublicIpDdosProtectionStatusResultInner withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the isWorkloadProtected property: Value indicating whether the IP address is DDoS workload protected or not.
     *
     * @return the isWorkloadProtected value.
     */
    public IsWorkloadProtected isWorkloadProtected() {
        return this.isWorkloadProtected;
    }

    /**
     * Set the isWorkloadProtected property: Value indicating whether the IP address is DDoS workload protected or not.
     *
     * @param isWorkloadProtected the isWorkloadProtected value to set.
     * @return the PublicIpDdosProtectionStatusResultInner object itself.
     */
    public PublicIpDdosProtectionStatusResultInner withIsWorkloadProtected(IsWorkloadProtected isWorkloadProtected) {
        this.isWorkloadProtected = isWorkloadProtected;
        return this;
    }

    /**
     * Get the ddosProtectionPlanId property: DDoS protection plan Resource Id of a if IP address is protected through a
     * plan.
     *
     * @return the ddosProtectionPlanId value.
     */
    public String ddosProtectionPlanId() {
        return this.ddosProtectionPlanId;
    }

    /**
     * Set the ddosProtectionPlanId property: DDoS protection plan Resource Id of a if IP address is protected through a
     * plan.
     *
     * @param ddosProtectionPlanId the ddosProtectionPlanId value to set.
     * @return the PublicIpDdosProtectionStatusResultInner object itself.
     */
    public PublicIpDdosProtectionStatusResultInner withDdosProtectionPlanId(String ddosProtectionPlanId) {
        this.ddosProtectionPlanId = ddosProtectionPlanId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}