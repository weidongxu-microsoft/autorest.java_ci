// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ContainerInfo;
import com.azure.resourcemanager.appservice.generated.models.SiteRuntimeState;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** WebSiteInstanceStatus resource specific properties. */
@Fluent
public final class WebSiteInstanceStatusProperties {
    /*
     * The state property.
     */
    @JsonProperty(value = "state")
    private SiteRuntimeState state;

    /*
     * Link to the GetStatusApi in Kudu
     */
    @JsonProperty(value = "statusUrl")
    private String statusUrl;

    /*
     * Link to the Diagnose and Solve Portal
     */
    @JsonProperty(value = "detectorUrl")
    private String detectorUrl;

    /*
     * Link to the console to web app instance
     */
    @JsonProperty(value = "consoleUrl")
    private String consoleUrl;

    /*
     * Link to the console to web app instance
     */
    @JsonProperty(value = "healthCheckUrl")
    private String healthCheckUrl;

    /*
     * Dictionary of <ContainerInfo>
     */
    @JsonProperty(value = "containers")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, ContainerInfo> containers;

    /** Creates an instance of WebSiteInstanceStatusProperties class. */
    public WebSiteInstanceStatusProperties() {
    }

    /**
     * Get the state property: The state property.
     *
     * @return the state value.
     */
    public SiteRuntimeState state() {
        return this.state;
    }

    /**
     * Set the state property: The state property.
     *
     * @param state the state value to set.
     * @return the WebSiteInstanceStatusProperties object itself.
     */
    public WebSiteInstanceStatusProperties withState(SiteRuntimeState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the statusUrl property: Link to the GetStatusApi in Kudu.
     *
     * @return the statusUrl value.
     */
    public String statusUrl() {
        return this.statusUrl;
    }

    /**
     * Set the statusUrl property: Link to the GetStatusApi in Kudu.
     *
     * @param statusUrl the statusUrl value to set.
     * @return the WebSiteInstanceStatusProperties object itself.
     */
    public WebSiteInstanceStatusProperties withStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
        return this;
    }

    /**
     * Get the detectorUrl property: Link to the Diagnose and Solve Portal.
     *
     * @return the detectorUrl value.
     */
    public String detectorUrl() {
        return this.detectorUrl;
    }

    /**
     * Set the detectorUrl property: Link to the Diagnose and Solve Portal.
     *
     * @param detectorUrl the detectorUrl value to set.
     * @return the WebSiteInstanceStatusProperties object itself.
     */
    public WebSiteInstanceStatusProperties withDetectorUrl(String detectorUrl) {
        this.detectorUrl = detectorUrl;
        return this;
    }

    /**
     * Get the consoleUrl property: Link to the console to web app instance.
     *
     * @return the consoleUrl value.
     */
    public String consoleUrl() {
        return this.consoleUrl;
    }

    /**
     * Set the consoleUrl property: Link to the console to web app instance.
     *
     * @param consoleUrl the consoleUrl value to set.
     * @return the WebSiteInstanceStatusProperties object itself.
     */
    public WebSiteInstanceStatusProperties withConsoleUrl(String consoleUrl) {
        this.consoleUrl = consoleUrl;
        return this;
    }

    /**
     * Get the healthCheckUrl property: Link to the console to web app instance.
     *
     * @return the healthCheckUrl value.
     */
    public String healthCheckUrl() {
        return this.healthCheckUrl;
    }

    /**
     * Set the healthCheckUrl property: Link to the console to web app instance.
     *
     * @param healthCheckUrl the healthCheckUrl value to set.
     * @return the WebSiteInstanceStatusProperties object itself.
     */
    public WebSiteInstanceStatusProperties withHealthCheckUrl(String healthCheckUrl) {
        this.healthCheckUrl = healthCheckUrl;
        return this;
    }

    /**
     * Get the containers property: Dictionary of &lt;ContainerInfo&gt;.
     *
     * @return the containers value.
     */
    public Map<String, ContainerInfo> containers() {
        return this.containers;
    }

    /**
     * Set the containers property: Dictionary of &lt;ContainerInfo&gt;.
     *
     * @param containers the containers value to set.
     * @return the WebSiteInstanceStatusProperties object itself.
     */
    public WebSiteInstanceStatusProperties withContainers(Map<String, ContainerInfo> containers) {
        this.containers = containers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containers() != null) {
            containers()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
