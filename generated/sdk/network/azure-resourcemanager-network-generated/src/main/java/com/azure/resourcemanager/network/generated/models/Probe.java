// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.ProbeInner;
import java.util.List;

/**
 * An immutable client-side representation of Probe.
 */
public interface Probe {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within the set of probes used by the load balancer. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: Type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the loadBalancingRules property: The load balancer rules that use this probe.
     * 
     * @return the loadBalancingRules value.
     */
    List<SubResource> loadBalancingRules();

    /**
     * Gets the protocol property: The protocol of the end point. If 'Tcp' is specified, a received ACK is required for the probe to be successful. If 'Http' or 'Https' is specified, a 200 OK response from the specifies URI is required for the probe to be successful.
     * 
     * @return the protocol value.
     */
    ProbeProtocol protocol();

    /**
     * Gets the port property: The port for communicating the probe. Possible values range from 1 to 65535, inclusive.
     * 
     * @return the port value.
     */
    int port();

    /**
     * Gets the intervalInSeconds property: The interval, in seconds, for how frequently to probe the endpoint for health status. Typically, the interval is slightly less than half the allocated timeout period (in seconds) which allows two full probes before taking the instance out of rotation. The default value is 15, the minimum value is 5.
     * 
     * @return the intervalInSeconds value.
     */
    Integer intervalInSeconds();

    /**
     * Gets the numberOfProbes property: The number of probes where if no response, will result in stopping further traffic from being delivered to the endpoint. This values allows endpoints to be taken out of rotation faster or slower than the typical times used in Azure.
     * 
     * @return the numberOfProbes value.
     */
    Integer numberOfProbes();

    /**
     * Gets the probeThreshold property: The number of consecutive successful or failed probes in order to allow or deny traffic from being delivered to this endpoint. After failing the number of consecutive probes equal to this value, the endpoint will be taken out of rotation and require the same number of successful consecutive probes to be placed back in rotation.
     * 
     * @return the probeThreshold value.
     */
    Integer probeThreshold();

    /**
     * Gets the requestPath property: The URI used for requesting health status from the VM. Path is required if a protocol is set to http. Otherwise, it is not allowed. There is no default value.
     * 
     * @return the requestPath value.
     */
    String requestPath();

    /**
     * Gets the provisioningState property: The provisioning state of the probe resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ProbeInner object.
     * 
     * @return the inner object.
     */
    ProbeInner innerModel();
}
