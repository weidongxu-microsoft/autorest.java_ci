// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.applicationinsights.generated.models.WebTestGeolocation;
import com.azure.resourcemanager.applicationinsights.generated.models.WebTestKind;
import com.azure.resourcemanager.applicationinsights.generated.models.WebTestPropertiesConfiguration;
import com.azure.resourcemanager.applicationinsights.generated.models.WebtestsResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An Application Insights web test definition. */
@Fluent
public final class WebTestInner extends WebtestsResource {
    /*
     * The kind of web test that this web test watches. Choices are ping and
     * multistep.
     */
    @JsonProperty(value = "kind")
    private WebTestKind kind;

    /*
     * Metadata describing a web test for an Azure resource.
     */
    @JsonProperty(value = "properties")
    private WebTestProperties innerProperties;

    /**
     * Get the kind property: The kind of web test that this web test watches. Choices are ping and multistep.
     *
     * @return the kind value.
     */
    public WebTestKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of web test that this web test watches. Choices are ping and multistep.
     *
     * @param kind the kind value to set.
     * @return the WebTestInner object itself.
     */
    public WebTestInner withKind(WebTestKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the innerProperties property: Metadata describing a web test for an Azure resource.
     *
     * @return the innerProperties value.
     */
    private WebTestProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public WebTestInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebTestInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the syntheticMonitorId property: Unique ID of this WebTest. This is typically the same value as the Name
     * field.
     *
     * @return the syntheticMonitorId value.
     */
    public String syntheticMonitorId() {
        return this.innerProperties() == null ? null : this.innerProperties().syntheticMonitorId();
    }

    /**
     * Set the syntheticMonitorId property: Unique ID of this WebTest. This is typically the same value as the Name
     * field.
     *
     * @param syntheticMonitorId the syntheticMonitorId value to set.
     * @return the WebTestInner object itself.
     */
    public WebTestInner withSyntheticMonitorId(String syntheticMonitorId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebTestProperties();
        }
        this.innerProperties().withSyntheticMonitorId(syntheticMonitorId);
        return this;
    }

    /**
     * Get the webTestName property: User defined name if this WebTest.
     *
     * @return the webTestName value.
     */
    public String webTestName() {
        return this.innerProperties() == null ? null : this.innerProperties().webTestName();
    }

    /**
     * Set the webTestName property: User defined name if this WebTest.
     *
     * @param webTestName the webTestName value to set.
     * @return the WebTestInner object itself.
     */
    public WebTestInner withWebTestName(String webTestName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebTestProperties();
        }
        this.innerProperties().withWebTestName(webTestName);
        return this;
    }

    /**
     * Get the description property: Purpose/user defined descriptive test for this WebTest.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Purpose/user defined descriptive test for this WebTest.
     *
     * @param description the description value to set.
     * @return the WebTestInner object itself.
     */
    public WebTestInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebTestProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the enabled property: Is the test actively being monitored.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Is the test actively being monitored.
     *
     * @param enabled the enabled value to set.
     * @return the WebTestInner object itself.
     */
    public WebTestInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebTestProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the frequency property: Interval in seconds between test runs for this WebTest. Default value is 300.
     *
     * @return the frequency value.
     */
    public Integer frequency() {
        return this.innerProperties() == null ? null : this.innerProperties().frequency();
    }

    /**
     * Set the frequency property: Interval in seconds between test runs for this WebTest. Default value is 300.
     *
     * @param frequency the frequency value to set.
     * @return the WebTestInner object itself.
     */
    public WebTestInner withFrequency(Integer frequency) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebTestProperties();
        }
        this.innerProperties().withFrequency(frequency);
        return this;
    }

    /**
     * Get the timeout property: Seconds until this WebTest will timeout and fail. Default value is 30.
     *
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.innerProperties() == null ? null : this.innerProperties().timeout();
    }

    /**
     * Set the timeout property: Seconds until this WebTest will timeout and fail. Default value is 30.
     *
     * @param timeout the timeout value to set.
     * @return the WebTestInner object itself.
     */
    public WebTestInner withTimeout(Integer timeout) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebTestProperties();
        }
        this.innerProperties().withTimeout(timeout);
        return this;
    }

    /**
     * Get the webTestKind property: The kind of web test this is, valid choices are ping and multistep.
     *
     * @return the webTestKind value.
     */
    public WebTestKind webTestKind() {
        return this.innerProperties() == null ? null : this.innerProperties().webTestKind();
    }

    /**
     * Set the webTestKind property: The kind of web test this is, valid choices are ping and multistep.
     *
     * @param webTestKind the webTestKind value to set.
     * @return the WebTestInner object itself.
     */
    public WebTestInner withWebTestKind(WebTestKind webTestKind) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebTestProperties();
        }
        this.innerProperties().withWebTestKind(webTestKind);
        return this;
    }

    /**
     * Get the retryEnabled property: Allow for retries should this WebTest fail.
     *
     * @return the retryEnabled value.
     */
    public Boolean retryEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().retryEnabled();
    }

    /**
     * Set the retryEnabled property: Allow for retries should this WebTest fail.
     *
     * @param retryEnabled the retryEnabled value to set.
     * @return the WebTestInner object itself.
     */
    public WebTestInner withRetryEnabled(Boolean retryEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebTestProperties();
        }
        this.innerProperties().withRetryEnabled(retryEnabled);
        return this;
    }

    /**
     * Get the locations property: A list of where to physically run the tests from to give global coverage for
     * accessibility of your application.
     *
     * @return the locations value.
     */
    public List<WebTestGeolocation> locations() {
        return this.innerProperties() == null ? null : this.innerProperties().locations();
    }

    /**
     * Set the locations property: A list of where to physically run the tests from to give global coverage for
     * accessibility of your application.
     *
     * @param locations the locations value to set.
     * @return the WebTestInner object itself.
     */
    public WebTestInner withLocations(List<WebTestGeolocation> locations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebTestProperties();
        }
        this.innerProperties().withLocations(locations);
        return this;
    }

    /**
     * Get the configuration property: An XML configuration specification for a WebTest.
     *
     * @return the configuration value.
     */
    public WebTestPropertiesConfiguration configuration() {
        return this.innerProperties() == null ? null : this.innerProperties().configuration();
    }

    /**
     * Set the configuration property: An XML configuration specification for a WebTest.
     *
     * @param configuration the configuration value to set.
     * @return the WebTestInner object itself.
     */
    public WebTestInner withConfiguration(WebTestPropertiesConfiguration configuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebTestProperties();
        }
        this.innerProperties().withConfiguration(configuration);
        return this;
    }

    /**
     * Get the provisioningState property: Current state of this component, whether or not is has been provisioned
     * within the resource group it is defined. Users cannot change this value but are able to read from it. Values will
     * include Succeeded, Deploying, Canceled, and Failed.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
