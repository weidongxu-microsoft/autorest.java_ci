// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The common properties of the export.
 */
@Fluent
public class CommonExportProperties {
    /*
     * The format of the export being delivered.
     */
    @JsonProperty(value = "format")
    private FormatType format;

    /*
     * Has delivery information for the export.
     */
    @JsonProperty(value = "deliveryInfo", required = true)
    private ExportDeliveryInfo deliveryInfo;

    /*
     * Has definition for the export.
     */
    @JsonProperty(value = "definition", required = true)
    private ExportDefinition definition;

    /**
     * Creates an instance of CommonExportProperties class.
     */
    public CommonExportProperties() {
    }

    /**
     * Get the format property: The format of the export being delivered.
     * 
     * @return the format value.
     */
    public FormatType format() {
        return this.format;
    }

    /**
     * Set the format property: The format of the export being delivered.
     * 
     * @param format the format value to set.
     * @return the CommonExportProperties object itself.
     */
    public CommonExportProperties withFormat(FormatType format) {
        this.format = format;
        return this;
    }

    /**
     * Get the deliveryInfo property: Has delivery information for the export.
     * 
     * @return the deliveryInfo value.
     */
    public ExportDeliveryInfo deliveryInfo() {
        return this.deliveryInfo;
    }

    /**
     * Set the deliveryInfo property: Has delivery information for the export.
     * 
     * @param deliveryInfo the deliveryInfo value to set.
     * @return the CommonExportProperties object itself.
     */
    public CommonExportProperties withDeliveryInfo(ExportDeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
        return this;
    }

    /**
     * Get the definition property: Has definition for the export.
     * 
     * @return the definition value.
     */
    public ExportDefinition definition() {
        return this.definition;
    }

    /**
     * Set the definition property: Has definition for the export.
     * 
     * @param definition the definition value to set.
     * @return the CommonExportProperties object itself.
     */
    public CommonExportProperties withDefinition(ExportDefinition definition) {
        this.definition = definition;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deliveryInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property deliveryInfo in model CommonExportProperties"));
        } else {
            deliveryInfo().validate();
        }
        if (definition() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property definition in model CommonExportProperties"));
        } else {
            definition().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CommonExportProperties.class);
}
