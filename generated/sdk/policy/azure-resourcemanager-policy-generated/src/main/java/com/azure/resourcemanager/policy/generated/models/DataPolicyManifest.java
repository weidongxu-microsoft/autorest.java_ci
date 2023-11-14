// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.resourcemanager.policy.generated.fluent.models.DataPolicyManifestInner;
import java.util.List;

/**
 * An immutable client-side representation of DataPolicyManifest.
 */
public interface DataPolicyManifest {
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
     * Gets the namespaces property: The list of namespaces for the data policy manifest.
     * 
     * @return the namespaces value.
     */
    List<String> namespaces();

    /**
     * Gets the policyMode property: The policy mode of the data policy manifest.
     * 
     * @return the policyMode value.
     */
    String policyMode();

    /**
     * Gets the isBuiltInOnly property: A value indicating whether policy mode is allowed only in built-in definitions.
     * 
     * @return the isBuiltInOnly value.
     */
    Boolean isBuiltInOnly();

    /**
     * Gets the resourceTypeAliases property: An array of resource type aliases.
     * 
     * @return the resourceTypeAliases value.
     */
    List<ResourceTypeAliases> resourceTypeAliases();

    /**
     * Gets the effects property: The effect definition.
     * 
     * @return the effects value.
     */
    List<DataEffect> effects();

    /**
     * Gets the fieldValues property: The non-alias field accessor values that can be used in the policy rule.
     * 
     * @return the fieldValues value.
     */
    List<String> fieldValues();

    /**
     * Gets the standard property: The standard resource functions (subscription and/or resourceGroup).
     * 
     * @return the standard value.
     */
    List<String> standard();

    /**
     * Gets the custom property: An array of data manifest custom resource definition.
     * 
     * @return the custom value.
     */
    List<DataManifestCustomResourceFunctionDefinition> custom();

    /**
     * Gets the inner com.azure.resourcemanager.policy.generated.fluent.models.DataPolicyManifestInner object.
     * 
     * @return the inner object.
     */
    DataPolicyManifestInner innerModel();
}
