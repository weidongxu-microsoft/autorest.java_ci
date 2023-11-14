// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.costmanagement.generated.models.AccumulatedType;
import com.azure.resourcemanager.costmanagement.generated.models.ChartType;
import com.azure.resourcemanager.costmanagement.generated.models.KpiProperties;
import com.azure.resourcemanager.costmanagement.generated.models.MetricType;
import com.azure.resourcemanager.costmanagement.generated.models.PivotProperties;
import com.azure.resourcemanager.costmanagement.generated.models.ReportConfigDataset;
import com.azure.resourcemanager.costmanagement.generated.models.ReportConfigTimePeriod;
import com.azure.resourcemanager.costmanagement.generated.models.ReportTimeframeType;
import com.azure.resourcemanager.costmanagement.generated.models.ReportType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * States and configurations of Cost Analysis.
 */
@Fluent
public final class ViewInner extends ProxyResource {
    /*
     * The properties of the view.
     */
    @JsonProperty(value = "properties")
    private ViewProperties innerProperties;

    /*
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the
     * user is updating the latest version or not.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Creates an instance of ViewInner class.
     */
    public ViewInner() {
    }

    /**
     * Get the innerProperties property: The properties of the view.
     * 
     * @return the innerProperties value.
     */
    private ViewProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     * 
     * @param etag the etag value to set.
     * @return the ViewInner object itself.
     */
    public ViewInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the displayName property: User input name of the view. Required.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: User input name of the view. Required.
     * 
     * @param displayName the displayName value to set.
     * @return the ViewInner object itself.
     */
    public ViewInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ViewProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the scope property: Cost Management scope to save the view on. This includes
     * 'subscriptions/{subscriptionId}' for subscription scope,
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     * for EnrollmentAccount scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * BillingProfile scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     * InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group
     * scope, '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
     * ExternalBillingAccount scope, and
     * '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for ExternalSubscription
     * scope.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: Cost Management scope to save the view on. This includes
     * 'subscriptions/{subscriptionId}' for subscription scope,
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     * for EnrollmentAccount scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * BillingProfile scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     * InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group
     * scope, '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
     * ExternalBillingAccount scope, and
     * '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for ExternalSubscription
     * scope.
     * 
     * @param scope the scope value to set.
     * @return the ViewInner object itself.
     */
    public ViewInner withScope(String scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ViewProperties();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Get the createdOn property: Date the user created this view.
     * 
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.innerProperties() == null ? null : this.innerProperties().createdOn();
    }

    /**
     * Get the modifiedOn property: Date when the user last modified this view.
     * 
     * @return the modifiedOn value.
     */
    public OffsetDateTime modifiedOn() {
        return this.innerProperties() == null ? null : this.innerProperties().modifiedOn();
    }

    /**
     * Get the dateRange property: Selected date range for viewing cost in.
     * 
     * @return the dateRange value.
     */
    public String dateRange() {
        return this.innerProperties() == null ? null : this.innerProperties().dateRange();
    }

    /**
     * Get the currency property: Selected currency.
     * 
     * @return the currency value.
     */
    public String currency() {
        return this.innerProperties() == null ? null : this.innerProperties().currency();
    }

    /**
     * Get the chart property: Chart type of the main view in Cost Analysis. Required.
     * 
     * @return the chart value.
     */
    public ChartType chart() {
        return this.innerProperties() == null ? null : this.innerProperties().chart();
    }

    /**
     * Set the chart property: Chart type of the main view in Cost Analysis. Required.
     * 
     * @param chart the chart value to set.
     * @return the ViewInner object itself.
     */
    public ViewInner withChart(ChartType chart) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ViewProperties();
        }
        this.innerProperties().withChart(chart);
        return this;
    }

    /**
     * Get the accumulated property: Show costs accumulated over time.
     * 
     * @return the accumulated value.
     */
    public AccumulatedType accumulated() {
        return this.innerProperties() == null ? null : this.innerProperties().accumulated();
    }

    /**
     * Set the accumulated property: Show costs accumulated over time.
     * 
     * @param accumulated the accumulated value to set.
     * @return the ViewInner object itself.
     */
    public ViewInner withAccumulated(AccumulatedType accumulated) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ViewProperties();
        }
        this.innerProperties().withAccumulated(accumulated);
        return this;
    }

    /**
     * Get the metric property: Metric to use when displaying costs.
     * 
     * @return the metric value.
     */
    public MetricType metric() {
        return this.innerProperties() == null ? null : this.innerProperties().metric();
    }

    /**
     * Set the metric property: Metric to use when displaying costs.
     * 
     * @param metric the metric value to set.
     * @return the ViewInner object itself.
     */
    public ViewInner withMetric(MetricType metric) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ViewProperties();
        }
        this.innerProperties().withMetric(metric);
        return this;
    }

    /**
     * Get the kpis property: List of KPIs to show in Cost Analysis UI.
     * 
     * @return the kpis value.
     */
    public List<KpiProperties> kpis() {
        return this.innerProperties() == null ? null : this.innerProperties().kpis();
    }

    /**
     * Set the kpis property: List of KPIs to show in Cost Analysis UI.
     * 
     * @param kpis the kpis value to set.
     * @return the ViewInner object itself.
     */
    public ViewInner withKpis(List<KpiProperties> kpis) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ViewProperties();
        }
        this.innerProperties().withKpis(kpis);
        return this;
    }

    /**
     * Get the pivots property: Configuration of 3 sub-views in the Cost Analysis UI.
     * 
     * @return the pivots value.
     */
    public List<PivotProperties> pivots() {
        return this.innerProperties() == null ? null : this.innerProperties().pivots();
    }

    /**
     * Set the pivots property: Configuration of 3 sub-views in the Cost Analysis UI.
     * 
     * @param pivots the pivots value to set.
     * @return the ViewInner object itself.
     */
    public ViewInner withPivots(List<PivotProperties> pivots) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ViewProperties();
        }
        this.innerProperties().withPivots(pivots);
        return this;
    }

    /**
     * Get the type property: The type of the report. Usage represents actual usage, forecast represents forecasted
     * data and UsageAndForecast represents both usage and forecasted data. Actual usage and forecasted data can be
     * differentiated based on dates.
     * 
     * @return the type value.
     */
    public ReportType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: The type of the report. Usage represents actual usage, forecast represents forecasted
     * data and UsageAndForecast represents both usage and forecasted data. Actual usage and forecasted data can be
     * differentiated based on dates.
     * 
     * @param type the type value to set.
     * @return the ViewInner object itself.
     */
    public ViewInner withTypePropertiesType(ReportType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ViewProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the timeframe property: The time frame for pulling data for the report. If custom, then a specific time
     * period must be provided.
     * 
     * @return the timeframe value.
     */
    public ReportTimeframeType timeframe() {
        return this.innerProperties() == null ? null : this.innerProperties().timeframe();
    }

    /**
     * Set the timeframe property: The time frame for pulling data for the report. If custom, then a specific time
     * period must be provided.
     * 
     * @param timeframe the timeframe value to set.
     * @return the ViewInner object itself.
     */
    public ViewInner withTimeframe(ReportTimeframeType timeframe) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ViewProperties();
        }
        this.innerProperties().withTimeframe(timeframe);
        return this;
    }

    /**
     * Get the timePeriod property: Has time period for pulling data for the report.
     * 
     * @return the timePeriod value.
     */
    public ReportConfigTimePeriod timePeriod() {
        return this.innerProperties() == null ? null : this.innerProperties().timePeriod();
    }

    /**
     * Set the timePeriod property: Has time period for pulling data for the report.
     * 
     * @param timePeriod the timePeriod value to set.
     * @return the ViewInner object itself.
     */
    public ViewInner withTimePeriod(ReportConfigTimePeriod timePeriod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ViewProperties();
        }
        this.innerProperties().withTimePeriod(timePeriod);
        return this;
    }

    /**
     * Get the dataSet property: Has definition for data in this report config.
     * 
     * @return the dataSet value.
     */
    public ReportConfigDataset dataSet() {
        return this.innerProperties() == null ? null : this.innerProperties().dataSet();
    }

    /**
     * Set the dataSet property: Has definition for data in this report config.
     * 
     * @param dataSet the dataSet value to set.
     * @return the ViewInner object itself.
     */
    public ViewInner withDataSet(ReportConfigDataset dataSet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ViewProperties();
        }
        this.innerProperties().withDataSet(dataSet);
        return this;
    }

    /**
     * Get the includeMonetaryCommitment property: Include monetary commitment.
     * 
     * @return the includeMonetaryCommitment value.
     */
    public Boolean includeMonetaryCommitment() {
        return this.innerProperties() == null ? null : this.innerProperties().includeMonetaryCommitment();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
