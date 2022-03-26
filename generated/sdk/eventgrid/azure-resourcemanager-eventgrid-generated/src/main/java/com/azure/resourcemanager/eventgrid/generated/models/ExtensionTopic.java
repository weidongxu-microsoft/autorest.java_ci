// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.ExtensionTopicInner;

/** An immutable client-side representation of ExtensionTopic. */
public interface ExtensionTopic {
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
     * Gets the systemData property: The system metadata relating to Extension Topic resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the description property: Description of the extension topic.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the systemTopic property: System topic resource id which is mapped to the source.
     *
     * @return the systemTopic value.
     */
    String systemTopic();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.generated.fluent.models.ExtensionTopicInner object.
     *
     * @return the inner object.
     */
    ExtensionTopicInner innerModel();
}
