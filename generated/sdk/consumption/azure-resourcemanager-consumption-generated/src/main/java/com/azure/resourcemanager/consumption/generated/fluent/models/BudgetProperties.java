// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.models.BudgetFilter;
import com.azure.resourcemanager.consumption.generated.models.BudgetTimePeriod;
import com.azure.resourcemanager.consumption.generated.models.CategoryType;
import com.azure.resourcemanager.consumption.generated.models.CurrentSpend;
import com.azure.resourcemanager.consumption.generated.models.ForecastSpend;
import com.azure.resourcemanager.consumption.generated.models.Notification;
import com.azure.resourcemanager.consumption.generated.models.TimeGrainType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Map;

/** The properties of the budget. */
@Fluent
public final class BudgetProperties {
    /*
     * The category of the budget, whether the budget tracks cost or usage.
     */
    @JsonProperty(value = "category", required = true)
    private CategoryType category;

    /*
     * The total amount of cost to track with the budget
     */
    @JsonProperty(value = "amount", required = true)
    private BigDecimal amount;

    /*
     * The time covered by a budget. Tracking of the amount will be reset based on the time grain. BillingMonth,
     * BillingQuarter, and BillingAnnual are only supported by WD customers
     */
    @JsonProperty(value = "timeGrain", required = true)
    private TimeGrainType timeGrain;

    /*
     * Has start and end date of the budget. The start date must be first of the month and should be less than the end
     * date. Budget start date must be on or after June 1, 2017. Future start date should not be more than twelve
     * months. Past start date should  be selected within the timegrain period. There are no restrictions on the end
     * date.
     */
    @JsonProperty(value = "timePeriod", required = true)
    private BudgetTimePeriod timePeriod;

    /*
     * May be used to filter budgets by user-specified dimensions and/or tags.
     */
    @JsonProperty(value = "filter")
    private BudgetFilter filter;

    /*
     * The current amount of cost which is being tracked for a budget.
     */
    @JsonProperty(value = "currentSpend", access = JsonProperty.Access.WRITE_ONLY)
    private CurrentSpend currentSpend;

    /*
     * Dictionary of notifications associated with the budget. Budget can have up to five notifications.
     */
    @JsonProperty(value = "notifications")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Notification> notifications;

    /*
     * The forecasted cost which is being tracked for a budget.
     */
    @JsonProperty(value = "forecastSpend", access = JsonProperty.Access.WRITE_ONLY)
    private ForecastSpend forecastSpend;

    /** Creates an instance of BudgetProperties class. */
    public BudgetProperties() {
    }

    /**
     * Get the category property: The category of the budget, whether the budget tracks cost or usage.
     *
     * @return the category value.
     */
    public CategoryType category() {
        return this.category;
    }

    /**
     * Set the category property: The category of the budget, whether the budget tracks cost or usage.
     *
     * @param category the category value to set.
     * @return the BudgetProperties object itself.
     */
    public BudgetProperties withCategory(CategoryType category) {
        this.category = category;
        return this;
    }

    /**
     * Get the amount property: The total amount of cost to track with the budget.
     *
     * @return the amount value.
     */
    public BigDecimal amount() {
        return this.amount;
    }

    /**
     * Set the amount property: The total amount of cost to track with the budget.
     *
     * @param amount the amount value to set.
     * @return the BudgetProperties object itself.
     */
    public BudgetProperties withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get the timeGrain property: The time covered by a budget. Tracking of the amount will be reset based on the time
     * grain. BillingMonth, BillingQuarter, and BillingAnnual are only supported by WD customers.
     *
     * @return the timeGrain value.
     */
    public TimeGrainType timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: The time covered by a budget. Tracking of the amount will be reset based on the time
     * grain. BillingMonth, BillingQuarter, and BillingAnnual are only supported by WD customers.
     *
     * @param timeGrain the timeGrain value to set.
     * @return the BudgetProperties object itself.
     */
    public BudgetProperties withTimeGrain(TimeGrainType timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the timePeriod property: Has start and end date of the budget. The start date must be first of the month and
     * should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should
     * not be more than twelve months. Past start date should be selected within the timegrain period. There are no
     * restrictions on the end date.
     *
     * @return the timePeriod value.
     */
    public BudgetTimePeriod timePeriod() {
        return this.timePeriod;
    }

    /**
     * Set the timePeriod property: Has start and end date of the budget. The start date must be first of the month and
     * should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should
     * not be more than twelve months. Past start date should be selected within the timegrain period. There are no
     * restrictions on the end date.
     *
     * @param timePeriod the timePeriod value to set.
     * @return the BudgetProperties object itself.
     */
    public BudgetProperties withTimePeriod(BudgetTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * Get the filter property: May be used to filter budgets by user-specified dimensions and/or tags.
     *
     * @return the filter value.
     */
    public BudgetFilter filter() {
        return this.filter;
    }

    /**
     * Set the filter property: May be used to filter budgets by user-specified dimensions and/or tags.
     *
     * @param filter the filter value to set.
     * @return the BudgetProperties object itself.
     */
    public BudgetProperties withFilter(BudgetFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the currentSpend property: The current amount of cost which is being tracked for a budget.
     *
     * @return the currentSpend value.
     */
    public CurrentSpend currentSpend() {
        return this.currentSpend;
    }

    /**
     * Get the notifications property: Dictionary of notifications associated with the budget. Budget can have up to
     * five notifications.
     *
     * @return the notifications value.
     */
    public Map<String, Notification> notifications() {
        return this.notifications;
    }

    /**
     * Set the notifications property: Dictionary of notifications associated with the budget. Budget can have up to
     * five notifications.
     *
     * @param notifications the notifications value to set.
     * @return the BudgetProperties object itself.
     */
    public BudgetProperties withNotifications(Map<String, Notification> notifications) {
        this.notifications = notifications;
        return this;
    }

    /**
     * Get the forecastSpend property: The forecasted cost which is being tracked for a budget.
     *
     * @return the forecastSpend value.
     */
    public ForecastSpend forecastSpend() {
        return this.forecastSpend;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (category() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property category in model BudgetProperties"));
        }
        if (amount() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property amount in model BudgetProperties"));
        }
        if (timeGrain() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property timeGrain in model BudgetProperties"));
        }
        if (timePeriod() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property timePeriod in model BudgetProperties"));
        } else {
            timePeriod().validate();
        }
        if (filter() != null) {
            filter().validate();
        }
        if (currentSpend() != null) {
            currentSpend().validate();
        }
        if (notifications() != null) {
            notifications()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (forecastSpend() != null) {
            forecastSpend().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BudgetProperties.class);
}
