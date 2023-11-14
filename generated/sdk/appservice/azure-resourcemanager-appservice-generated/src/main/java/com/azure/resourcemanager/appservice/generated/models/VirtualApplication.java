// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Virtual application in an app.
 */
@Fluent
public final class VirtualApplication {
    /*
     * Virtual path.
     */
    @JsonProperty(value = "virtualPath")
    private String virtualPath;

    /*
     * Physical path.
     */
    @JsonProperty(value = "physicalPath")
    private String physicalPath;

    /*
     * <code>true</code> if preloading is enabled; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "preloadEnabled")
    private Boolean preloadEnabled;

    /*
     * Virtual directories for virtual application.
     */
    @JsonProperty(value = "virtualDirectories")
    private List<VirtualDirectory> virtualDirectories;

    /**
     * Creates an instance of VirtualApplication class.
     */
    public VirtualApplication() {
    }

    /**
     * Get the virtualPath property: Virtual path.
     * 
     * @return the virtualPath value.
     */
    public String virtualPath() {
        return this.virtualPath;
    }

    /**
     * Set the virtualPath property: Virtual path.
     * 
     * @param virtualPath the virtualPath value to set.
     * @return the VirtualApplication object itself.
     */
    public VirtualApplication withVirtualPath(String virtualPath) {
        this.virtualPath = virtualPath;
        return this;
    }

    /**
     * Get the physicalPath property: Physical path.
     * 
     * @return the physicalPath value.
     */
    public String physicalPath() {
        return this.physicalPath;
    }

    /**
     * Set the physicalPath property: Physical path.
     * 
     * @param physicalPath the physicalPath value to set.
     * @return the VirtualApplication object itself.
     */
    public VirtualApplication withPhysicalPath(String physicalPath) {
        this.physicalPath = physicalPath;
        return this;
    }

    /**
     * Get the preloadEnabled property: &lt;code&gt;true&lt;/code&gt; if preloading is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the preloadEnabled value.
     */
    public Boolean preloadEnabled() {
        return this.preloadEnabled;
    }

    /**
     * Set the preloadEnabled property: &lt;code&gt;true&lt;/code&gt; if preloading is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param preloadEnabled the preloadEnabled value to set.
     * @return the VirtualApplication object itself.
     */
    public VirtualApplication withPreloadEnabled(Boolean preloadEnabled) {
        this.preloadEnabled = preloadEnabled;
        return this;
    }

    /**
     * Get the virtualDirectories property: Virtual directories for virtual application.
     * 
     * @return the virtualDirectories value.
     */
    public List<VirtualDirectory> virtualDirectories() {
        return this.virtualDirectories;
    }

    /**
     * Set the virtualDirectories property: Virtual directories for virtual application.
     * 
     * @param virtualDirectories the virtualDirectories value to set.
     * @return the VirtualApplication object itself.
     */
    public VirtualApplication withVirtualDirectories(List<VirtualDirectory> virtualDirectories) {
        this.virtualDirectories = virtualDirectories;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualDirectories() != null) {
            virtualDirectories().forEach(e -> e.validate());
        }
    }
}
