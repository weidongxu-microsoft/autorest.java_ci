// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The selected configurations for azure monitor. */
@Fluent
public final class AzureMonitorSelectedConfigurations {
    /*
     * The configuration version.
     */
    @JsonProperty(value = "configurationVersion")
    private String configurationVersion;

    /*
     * The global configurations of selected configurations.
     */
    @JsonProperty(value = "globalConfigurations")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> globalConfigurations;

    /*
     * The table list.
     */
    @JsonProperty(value = "tableList")
    private List<AzureMonitorTableConfiguration> tableList;

    /**
     * Get the configurationVersion property: The configuration version.
     *
     * @return the configurationVersion value.
     */
    public String configurationVersion() {
        return this.configurationVersion;
    }

    /**
     * Set the configurationVersion property: The configuration version.
     *
     * @param configurationVersion the configurationVersion value to set.
     * @return the AzureMonitorSelectedConfigurations object itself.
     */
    public AzureMonitorSelectedConfigurations withConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
        return this;
    }

    /**
     * Get the globalConfigurations property: The global configurations of selected configurations.
     *
     * @return the globalConfigurations value.
     */
    public Map<String, String> globalConfigurations() {
        return this.globalConfigurations;
    }

    /**
     * Set the globalConfigurations property: The global configurations of selected configurations.
     *
     * @param globalConfigurations the globalConfigurations value to set.
     * @return the AzureMonitorSelectedConfigurations object itself.
     */
    public AzureMonitorSelectedConfigurations withGlobalConfigurations(Map<String, String> globalConfigurations) {
        this.globalConfigurations = globalConfigurations;
        return this;
    }

    /**
     * Get the tableList property: The table list.
     *
     * @return the tableList value.
     */
    public List<AzureMonitorTableConfiguration> tableList() {
        return this.tableList;
    }

    /**
     * Set the tableList property: The table list.
     *
     * @param tableList the tableList value to set.
     * @return the AzureMonitorSelectedConfigurations object itself.
     */
    public AzureMonitorSelectedConfigurations withTableList(List<AzureMonitorTableConfiguration> tableList) {
        this.tableList = tableList;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tableList() != null) {
            tableList().forEach(e -> e.validate());
        }
    }
}
