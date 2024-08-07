// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.DiagnosticProactiveLogCollectionSettingsInner;

/**
 * An immutable client-side representation of DiagnosticProactiveLogCollectionSettings.
 */
public interface DiagnosticProactiveLogCollectionSettings {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of
     * DiagnosticProactiveLogCollectionSettings.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the userConsent property: Proactive diagnostic collection consent flag.
     * 
     * @return the userConsent value.
     */
    ProactiveDiagnosticsConsent userConsent();

    /**
     * Gets the inner
     * com.azure.resourcemanager.databoxedge.generated.fluent.models.DiagnosticProactiveLogCollectionSettingsInner
     * object.
     * 
     * @return the inner object.
     */
    DiagnosticProactiveLogCollectionSettingsInner innerModel();
}
