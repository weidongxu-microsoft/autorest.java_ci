// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.resourcemanager.resources.generated.fluent.models.TemplateHashResultInner;

/**
 * An immutable client-side representation of TemplateHashResult.
 */
public interface TemplateHashResult {
    /**
     * Gets the minifiedTemplate property: The minified template string.
     * 
     * @return the minifiedTemplate value.
     */
    String minifiedTemplate();

    /**
     * Gets the templateHash property: The template hash.
     * 
     * @return the templateHash value.
     */
    String templateHash();

    /**
     * Gets the inner com.azure.resourcemanager.resources.generated.fluent.models.TemplateHashResultInner object.
     * 
     * @return the inner object.
     */
    TemplateHashResultInner innerModel();
}
