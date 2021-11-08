// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.resourcemanager.frontdoor.generated.fluent.models.PreconfiguredEndpointInner;
import java.util.Map;

/** An immutable client-side representation of PreconfiguredEndpoint. */
public interface PreconfiguredEndpoint {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the description property: The description of the endpoint.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the endpoint property: The endpoint that is preconfigured.
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Gets the endpointType property: The type of endpoint.
     *
     * @return the endpointType value.
     */
    EndpointType endpointType();

    /**
     * Gets the backend property: The preconfigured endpoint backend.
     *
     * @return the backend value.
     */
    String backend();

    /**
     * Gets the inner com.azure.resourcemanager.frontdoor.generated.fluent.models.PreconfiguredEndpointInner object.
     *
     * @return the inner object.
     */
    PreconfiguredEndpointInner innerModel();
}
