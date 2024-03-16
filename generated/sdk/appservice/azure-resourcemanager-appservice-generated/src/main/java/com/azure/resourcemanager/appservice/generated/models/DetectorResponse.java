// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of DetectorResponse.
 */
public interface DetectorResponse {
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
     * Gets the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the metadata property: metadata for the detector.
     * 
     * @return the metadata value.
     */
    DetectorInfo metadata();

    /**
     * Gets the dataset property: Data Set.
     * 
     * @return the dataset value.
     */
    List<DiagnosticData> dataset();

    /**
     * Gets the status property: Indicates status of the most severe insight.
     * 
     * @return the status value.
     */
    Status status();

    /**
     * Gets the dataProvidersMetadata property: Additional configuration for different data providers to be used by the UI.
     * 
     * @return the dataProvidersMetadata value.
     */
    List<DataProviderMetadata> dataProvidersMetadata();

    /**
     * Gets the suggestedUtterances property: Suggested utterances where the detector can be applicable.
     * 
     * @return the suggestedUtterances value.
     */
    QueryUtterancesResults suggestedUtterances();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.DetectorResponseInner object.
     * 
     * @return the inner object.
     */
    DetectorResponseInner innerModel();
}
