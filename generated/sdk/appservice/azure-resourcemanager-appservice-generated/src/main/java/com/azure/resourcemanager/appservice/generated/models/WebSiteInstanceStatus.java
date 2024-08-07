// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.WebSiteInstanceStatusInner;
import java.util.Map;

/**
 * An immutable client-side representation of WebSiteInstanceStatus.
 */
public interface WebSiteInstanceStatus {
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
     * Gets the state property: The state property.
     * 
     * @return the state value.
     */
    SiteRuntimeState state();

    /**
     * Gets the statusUrl property: Link to the GetStatusApi in Kudu.
     * 
     * @return the statusUrl value.
     */
    String statusUrl();

    /**
     * Gets the detectorUrl property: Link to the Diagnose and Solve Portal.
     * 
     * @return the detectorUrl value.
     */
    String detectorUrl();

    /**
     * Gets the consoleUrl property: Link to the console to web app instance.
     * 
     * @return the consoleUrl value.
     */
    String consoleUrl();

    /**
     * Gets the healthCheckUrl property: Link to the console to web app instance.
     * 
     * @return the healthCheckUrl value.
     */
    String healthCheckUrl();

    /**
     * Gets the containers property: Dictionary of &lt;ContainerInfo&gt;.
     * 
     * @return the containers value.
     */
    Map<String, ContainerInfo> containers();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.WebSiteInstanceStatusInner object.
     * 
     * @return the inner object.
     */
    WebSiteInstanceStatusInner innerModel();
}
