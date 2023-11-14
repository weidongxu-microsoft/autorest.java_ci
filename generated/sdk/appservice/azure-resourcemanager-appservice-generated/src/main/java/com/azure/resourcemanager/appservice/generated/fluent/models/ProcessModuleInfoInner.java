// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Process Module Information.
 */
@Fluent
public final class ProcessModuleInfoInner extends ProxyOnlyResource {
    /*
     * ProcessModuleInfo resource specific properties
     */
    @JsonProperty(value = "properties")
    private ProcessModuleInfoProperties innerProperties;

    /**
     * Creates an instance of ProcessModuleInfoInner class.
     */
    public ProcessModuleInfoInner() {
    }

    /**
     * Get the innerProperties property: ProcessModuleInfo resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private ProcessModuleInfoProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessModuleInfoInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the baseAddress property: Base address. Used as module identifier in ARM resource URI.
     * 
     * @return the baseAddress value.
     */
    public String baseAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().baseAddress();
    }

    /**
     * Set the baseAddress property: Base address. Used as module identifier in ARM resource URI.
     * 
     * @param baseAddress the baseAddress value to set.
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withBaseAddress(String baseAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessModuleInfoProperties();
        }
        this.innerProperties().withBaseAddress(baseAddress);
        return this;
    }

    /**
     * Get the fileName property: File name.
     * 
     * @return the fileName value.
     */
    public String fileName() {
        return this.innerProperties() == null ? null : this.innerProperties().fileName();
    }

    /**
     * Set the fileName property: File name.
     * 
     * @param fileName the fileName value to set.
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withFileName(String fileName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessModuleInfoProperties();
        }
        this.innerProperties().withFileName(fileName);
        return this;
    }

    /**
     * Get the href property: HRef URI.
     * 
     * @return the href value.
     */
    public String href() {
        return this.innerProperties() == null ? null : this.innerProperties().href();
    }

    /**
     * Set the href property: HRef URI.
     * 
     * @param href the href value to set.
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withHref(String href) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessModuleInfoProperties();
        }
        this.innerProperties().withHref(href);
        return this;
    }

    /**
     * Get the filePath property: File path.
     * 
     * @return the filePath value.
     */
    public String filePath() {
        return this.innerProperties() == null ? null : this.innerProperties().filePath();
    }

    /**
     * Set the filePath property: File path.
     * 
     * @param filePath the filePath value to set.
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withFilePath(String filePath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessModuleInfoProperties();
        }
        this.innerProperties().withFilePath(filePath);
        return this;
    }

    /**
     * Get the moduleMemorySize property: Module memory size.
     * 
     * @return the moduleMemorySize value.
     */
    public Integer moduleMemorySize() {
        return this.innerProperties() == null ? null : this.innerProperties().moduleMemorySize();
    }

    /**
     * Set the moduleMemorySize property: Module memory size.
     * 
     * @param moduleMemorySize the moduleMemorySize value to set.
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withModuleMemorySize(Integer moduleMemorySize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessModuleInfoProperties();
        }
        this.innerProperties().withModuleMemorySize(moduleMemorySize);
        return this;
    }

    /**
     * Get the fileVersion property: File version.
     * 
     * @return the fileVersion value.
     */
    public String fileVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().fileVersion();
    }

    /**
     * Set the fileVersion property: File version.
     * 
     * @param fileVersion the fileVersion value to set.
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withFileVersion(String fileVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessModuleInfoProperties();
        }
        this.innerProperties().withFileVersion(fileVersion);
        return this;
    }

    /**
     * Get the fileDescription property: File description.
     * 
     * @return the fileDescription value.
     */
    public String fileDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().fileDescription();
    }

    /**
     * Set the fileDescription property: File description.
     * 
     * @param fileDescription the fileDescription value to set.
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withFileDescription(String fileDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessModuleInfoProperties();
        }
        this.innerProperties().withFileDescription(fileDescription);
        return this;
    }

    /**
     * Get the product property: Product name.
     * 
     * @return the product value.
     */
    public String product() {
        return this.innerProperties() == null ? null : this.innerProperties().product();
    }

    /**
     * Set the product property: Product name.
     * 
     * @param product the product value to set.
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withProduct(String product) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessModuleInfoProperties();
        }
        this.innerProperties().withProduct(product);
        return this;
    }

    /**
     * Get the productVersion property: Product version.
     * 
     * @return the productVersion value.
     */
    public String productVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().productVersion();
    }

    /**
     * Set the productVersion property: Product version.
     * 
     * @param productVersion the productVersion value to set.
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withProductVersion(String productVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessModuleInfoProperties();
        }
        this.innerProperties().withProductVersion(productVersion);
        return this;
    }

    /**
     * Get the isDebug property: Is debug?.
     * 
     * @return the isDebug value.
     */
    public Boolean isDebug() {
        return this.innerProperties() == null ? null : this.innerProperties().isDebug();
    }

    /**
     * Set the isDebug property: Is debug?.
     * 
     * @param isDebug the isDebug value to set.
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withIsDebug(Boolean isDebug) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessModuleInfoProperties();
        }
        this.innerProperties().withIsDebug(isDebug);
        return this;
    }

    /**
     * Get the language property: Module language (locale).
     * 
     * @return the language value.
     */
    public String language() {
        return this.innerProperties() == null ? null : this.innerProperties().language();
    }

    /**
     * Set the language property: Module language (locale).
     * 
     * @param language the language value to set.
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withLanguage(String language) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessModuleInfoProperties();
        }
        this.innerProperties().withLanguage(language);
        return this;
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
