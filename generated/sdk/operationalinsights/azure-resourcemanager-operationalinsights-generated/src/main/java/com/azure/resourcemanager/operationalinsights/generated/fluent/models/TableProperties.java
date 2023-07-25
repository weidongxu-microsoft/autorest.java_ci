// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.operationalinsights.generated.models.ProvisioningStateEnum;
import com.azure.resourcemanager.operationalinsights.generated.models.RestoredLogs;
import com.azure.resourcemanager.operationalinsights.generated.models.ResultStatistics;
import com.azure.resourcemanager.operationalinsights.generated.models.Schema;
import com.azure.resourcemanager.operationalinsights.generated.models.SearchResults;
import com.azure.resourcemanager.operationalinsights.generated.models.TablePlanEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Table properties. */
@Fluent
public final class TableProperties {
    /*
     * The table retention in days, between 4 and 730. Setting this property to -1 will default to the workspace
     * retention.
     */
    @JsonProperty(value = "retentionInDays")
    private Integer retentionInDays;

    /*
     * The table total retention in days, between 4 and 2556. Setting this property to -1 will default to table
     * retention.
     */
    @JsonProperty(value = "totalRetentionInDays")
    private Integer totalRetentionInDays;

    /*
     * The table data archive retention in days. Calculated as (totalRetentionInDays-retentionInDays)
     */
    @JsonProperty(value = "archiveRetentionInDays", access = JsonProperty.Access.WRITE_ONLY)
    private Integer archiveRetentionInDays;

    /*
     * Parameters of the search job that initiated this table.
     */
    @JsonProperty(value = "searchResults")
    private SearchResults searchResults;

    /*
     * Parameters of the restore operation that initiated this table.
     */
    @JsonProperty(value = "restoredLogs")
    private RestoredLogs restoredLogs;

    /*
     * Search job execution statistics.
     */
    @JsonProperty(value = "resultStatistics", access = JsonProperty.Access.WRITE_ONLY)
    private ResultStatistics resultStatistics;

    /*
     * Instruct the system how to handle and charge the logs ingested to this table.
     */
    @JsonProperty(value = "plan")
    private TablePlanEnum plan;

    /*
     * The timestamp that table plan was last modified (UTC).
     */
    @JsonProperty(value = "lastPlanModifiedDate", access = JsonProperty.Access.WRITE_ONLY)
    private String lastPlanModifiedDate;

    /*
     * Table schema.
     */
    @JsonProperty(value = "schema")
    private Schema schema;

    /*
     * Table's current provisioning state. If set to 'updating', indicates a resource lock due to ongoing operation,
     * forbidding any update to the table until the ongoing operation is concluded.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningStateEnum provisioningState;

    /*
     * True - Value originates from workspace retention in days, False - Customer specific.
     */
    @JsonProperty(value = "retentionInDaysAsDefault", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean retentionInDaysAsDefault;

    /*
     * True - Value originates from retention in days, False - Customer specific.
     */
    @JsonProperty(value = "totalRetentionInDaysAsDefault", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean totalRetentionInDaysAsDefault;

    /** Creates an instance of TableProperties class. */
    public TableProperties() {
    }

    /**
     * Get the retentionInDays property: The table retention in days, between 4 and 730. Setting this property to -1
     * will default to the workspace retention.
     *
     * @return the retentionInDays value.
     */
    public Integer retentionInDays() {
        return this.retentionInDays;
    }

    /**
     * Set the retentionInDays property: The table retention in days, between 4 and 730. Setting this property to -1
     * will default to the workspace retention.
     *
     * @param retentionInDays the retentionInDays value to set.
     * @return the TableProperties object itself.
     */
    public TableProperties withRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
        return this;
    }

    /**
     * Get the totalRetentionInDays property: The table total retention in days, between 4 and 2556. Setting this
     * property to -1 will default to table retention.
     *
     * @return the totalRetentionInDays value.
     */
    public Integer totalRetentionInDays() {
        return this.totalRetentionInDays;
    }

    /**
     * Set the totalRetentionInDays property: The table total retention in days, between 4 and 2556. Setting this
     * property to -1 will default to table retention.
     *
     * @param totalRetentionInDays the totalRetentionInDays value to set.
     * @return the TableProperties object itself.
     */
    public TableProperties withTotalRetentionInDays(Integer totalRetentionInDays) {
        this.totalRetentionInDays = totalRetentionInDays;
        return this;
    }

    /**
     * Get the archiveRetentionInDays property: The table data archive retention in days. Calculated as
     * (totalRetentionInDays-retentionInDays).
     *
     * @return the archiveRetentionInDays value.
     */
    public Integer archiveRetentionInDays() {
        return this.archiveRetentionInDays;
    }

    /**
     * Get the searchResults property: Parameters of the search job that initiated this table.
     *
     * @return the searchResults value.
     */
    public SearchResults searchResults() {
        return this.searchResults;
    }

    /**
     * Set the searchResults property: Parameters of the search job that initiated this table.
     *
     * @param searchResults the searchResults value to set.
     * @return the TableProperties object itself.
     */
    public TableProperties withSearchResults(SearchResults searchResults) {
        this.searchResults = searchResults;
        return this;
    }

    /**
     * Get the restoredLogs property: Parameters of the restore operation that initiated this table.
     *
     * @return the restoredLogs value.
     */
    public RestoredLogs restoredLogs() {
        return this.restoredLogs;
    }

    /**
     * Set the restoredLogs property: Parameters of the restore operation that initiated this table.
     *
     * @param restoredLogs the restoredLogs value to set.
     * @return the TableProperties object itself.
     */
    public TableProperties withRestoredLogs(RestoredLogs restoredLogs) {
        this.restoredLogs = restoredLogs;
        return this;
    }

    /**
     * Get the resultStatistics property: Search job execution statistics.
     *
     * @return the resultStatistics value.
     */
    public ResultStatistics resultStatistics() {
        return this.resultStatistics;
    }

    /**
     * Get the plan property: Instruct the system how to handle and charge the logs ingested to this table.
     *
     * @return the plan value.
     */
    public TablePlanEnum plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Instruct the system how to handle and charge the logs ingested to this table.
     *
     * @param plan the plan value to set.
     * @return the TableProperties object itself.
     */
    public TableProperties withPlan(TablePlanEnum plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the lastPlanModifiedDate property: The timestamp that table plan was last modified (UTC).
     *
     * @return the lastPlanModifiedDate value.
     */
    public String lastPlanModifiedDate() {
        return this.lastPlanModifiedDate;
    }

    /**
     * Get the schema property: Table schema.
     *
     * @return the schema value.
     */
    public Schema schema() {
        return this.schema;
    }

    /**
     * Set the schema property: Table schema.
     *
     * @param schema the schema value to set.
     * @return the TableProperties object itself.
     */
    public TableProperties withSchema(Schema schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the provisioningState property: Table's current provisioning state. If set to 'updating', indicates a
     * resource lock due to ongoing operation, forbidding any update to the table until the ongoing operation is
     * concluded.
     *
     * @return the provisioningState value.
     */
    public ProvisioningStateEnum provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the retentionInDaysAsDefault property: True - Value originates from workspace retention in days, False -
     * Customer specific.
     *
     * @return the retentionInDaysAsDefault value.
     */
    public Boolean retentionInDaysAsDefault() {
        return this.retentionInDaysAsDefault;
    }

    /**
     * Get the totalRetentionInDaysAsDefault property: True - Value originates from retention in days, False - Customer
     * specific.
     *
     * @return the totalRetentionInDaysAsDefault value.
     */
    public Boolean totalRetentionInDaysAsDefault() {
        return this.totalRetentionInDaysAsDefault;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (searchResults() != null) {
            searchResults().validate();
        }
        if (restoredLogs() != null) {
            restoredLogs().validate();
        }
        if (resultStatistics() != null) {
            resultStatistics().validate();
        }
        if (schema() != null) {
            schema().validate();
        }
    }
}
