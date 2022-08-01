// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Criteria that triggered alert. */
public final class AlertCriteria extends ExpandableStringEnum<AlertCriteria> {
    /** Static value CostThresholdExceeded for AlertCriteria. */
    public static final AlertCriteria COST_THRESHOLD_EXCEEDED = fromString("CostThresholdExceeded");

    /** Static value UsageThresholdExceeded for AlertCriteria. */
    public static final AlertCriteria USAGE_THRESHOLD_EXCEEDED = fromString("UsageThresholdExceeded");

    /** Static value CreditThresholdApproaching for AlertCriteria. */
    public static final AlertCriteria CREDIT_THRESHOLD_APPROACHING = fromString("CreditThresholdApproaching");

    /** Static value CreditThresholdReached for AlertCriteria. */
    public static final AlertCriteria CREDIT_THRESHOLD_REACHED = fromString("CreditThresholdReached");

    /** Static value QuotaThresholdApproaching for AlertCriteria. */
    public static final AlertCriteria QUOTA_THRESHOLD_APPROACHING = fromString("QuotaThresholdApproaching");

    /** Static value QuotaThresholdReached for AlertCriteria. */
    public static final AlertCriteria QUOTA_THRESHOLD_REACHED = fromString("QuotaThresholdReached");

    /** Static value MultiCurrency for AlertCriteria. */
    public static final AlertCriteria MULTI_CURRENCY = fromString("MultiCurrency");

    /** Static value ForecastCostThresholdExceeded for AlertCriteria. */
    public static final AlertCriteria FORECAST_COST_THRESHOLD_EXCEEDED = fromString("ForecastCostThresholdExceeded");

    /** Static value ForecastUsageThresholdExceeded for AlertCriteria. */
    public static final AlertCriteria FORECAST_USAGE_THRESHOLD_EXCEEDED = fromString("ForecastUsageThresholdExceeded");

    /** Static value InvoiceDueDateApproaching for AlertCriteria. */
    public static final AlertCriteria INVOICE_DUE_DATE_APPROACHING = fromString("InvoiceDueDateApproaching");

    /** Static value InvoiceDueDateReached for AlertCriteria. */
    public static final AlertCriteria INVOICE_DUE_DATE_REACHED = fromString("InvoiceDueDateReached");

    /** Static value CrossCloudNewDataAvailable for AlertCriteria. */
    public static final AlertCriteria CROSS_CLOUD_NEW_DATA_AVAILABLE = fromString("CrossCloudNewDataAvailable");

    /** Static value CrossCloudCollectionError for AlertCriteria. */
    public static final AlertCriteria CROSS_CLOUD_COLLECTION_ERROR = fromString("CrossCloudCollectionError");

    /** Static value GeneralThresholdError for AlertCriteria. */
    public static final AlertCriteria GENERAL_THRESHOLD_ERROR = fromString("GeneralThresholdError");

    /**
     * Creates or finds a AlertCriteria from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertCriteria.
     */
    @JsonCreator
    public static AlertCriteria fromString(String name) {
        return fromString(name, AlertCriteria.class);
    }

    /**
     * Gets known AlertCriteria values.
     *
     * @return known AlertCriteria values.
     */
    public static Collection<AlertCriteria> values() {
        return values(AlertCriteria.class);
    }
}
