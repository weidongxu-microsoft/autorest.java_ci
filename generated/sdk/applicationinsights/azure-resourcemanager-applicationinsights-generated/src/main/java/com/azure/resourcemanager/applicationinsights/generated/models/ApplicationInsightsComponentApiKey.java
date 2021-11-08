// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentApiKeyInner;
import java.util.List;

/** An immutable client-side representation of ApplicationInsightsComponentApiKey. */
public interface ApplicationInsightsComponentApiKey {
    /**
     * Gets the id property: The unique ID of the API key inside an Application Insights component. It is auto generated
     * when the API key is created.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the apiKey property: The API key value. It will be only return once when the API Key was created.
     *
     * @return the apiKey value.
     */
    String apiKey();

    /**
     * Gets the createdDate property: The create date of this API key.
     *
     * @return the createdDate value.
     */
    String createdDate();

    /**
     * Gets the name property: The name of the API key.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the linkedReadProperties property: The read access rights of this API Key.
     *
     * @return the linkedReadProperties value.
     */
    List<String> linkedReadProperties();

    /**
     * Gets the linkedWriteProperties property: The write access rights of this API Key.
     *
     * @return the linkedWriteProperties value.
     */
    List<String> linkedWriteProperties();

    /**
     * Gets the inner
     * com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentApiKeyInner
     * object.
     *
     * @return the inner object.
     */
    ApplicationInsightsComponentApiKeyInner innerModel();
}
