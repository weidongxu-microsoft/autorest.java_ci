// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.generated.fluent.models.BudgetInner;
import java.math.BigDecimal;
import java.util.Map;

/**
 * An immutable client-side representation of Budget.
 */
public interface Budget {
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
     * Gets the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the category property: The category of the budget, whether the budget tracks cost or usage.
     * 
     * @return the category value.
     */
    CategoryType category();

    /**
     * Gets the amount property: The total amount of cost to track with the budget.
     * 
     * @return the amount value.
     */
    BigDecimal amount();

    /**
     * Gets the timeGrain property: The time covered by a budget. Tracking of the amount will be reset based on the time
     * grain. BillingMonth, BillingQuarter, and BillingAnnual are only supported by WD customers.
     * 
     * @return the timeGrain value.
     */
    TimeGrainType timeGrain();

    /**
     * Gets the timePeriod property: Has start and end date of the budget. The start date must be first of the month and
     * should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should
     * not be more than twelve months. Past start date should be selected within the timegrain period. There are no
     * restrictions on the end date.
     * 
     * @return the timePeriod value.
     */
    BudgetTimePeriod timePeriod();

    /**
     * Gets the filter property: May be used to filter budgets by user-specified dimensions and/or tags.
     * 
     * @return the filter value.
     */
    BudgetFilter filter();

    /**
     * Gets the currentSpend property: The current amount of cost which is being tracked for a budget.
     * 
     * @return the currentSpend value.
     */
    CurrentSpend currentSpend();

    /**
     * Gets the notifications property: Dictionary of notifications associated with the budget. Budget can have up to
     * five notifications.
     * 
     * @return the notifications value.
     */
    Map<String, Notification> notifications();

    /**
     * Gets the forecastSpend property: The forecasted cost which is being tracked for a budget.
     * 
     * @return the forecastSpend value.
     */
    ForecastSpend forecastSpend();

    /**
     * Gets the inner com.azure.resourcemanager.consumption.generated.fluent.models.BudgetInner object.
     * 
     * @return the inner object.
     */
    BudgetInner innerModel();

    /**
     * The entirety of the Budget definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithScope, DefinitionStages.WithCreate {
    }

    /**
     * The Budget definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Budget definition.
         */
        interface Blank extends WithScope {
        }

        /**
         * The stage of the Budget definition allowing to specify parent resource.
         */
        interface WithScope {
            /**
             * Specifies scope.
             * 
             * @param scope The scope associated with budget operations. This includes
             * '/subscriptions/{subscriptionId}/' for subscription scope,
             * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
             * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
             * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for
             * Department scope,
             * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
             * for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
             * Management Group scope,
             * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
             * billingProfile scope,
             * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
             * invoiceSection scope.
             * @return the next definition stage.
             */
            WithCreate withExistingScope(String scope);
        }

        /**
         * The stage of the Budget definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithEtag, DefinitionStages.WithCategory,
            DefinitionStages.WithAmount, DefinitionStages.WithTimeGrain, DefinitionStages.WithTimePeriod,
            DefinitionStages.WithFilter, DefinitionStages.WithNotifications {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Budget create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Budget create(Context context);
        }

        /**
         * The stage of the Budget definition allowing to specify etag.
         */
        interface WithEtag {
            /**
             * Specifies the etag property: eTag of the resource. To handle concurrent update scenario, this field will
             * be used to determine whether the user is updating the latest version or not..
             * 
             * @param etag eTag of the resource. To handle concurrent update scenario, this field will be used to
             * determine whether the user is updating the latest version or not.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the Budget definition allowing to specify category.
         */
        interface WithCategory {
            /**
             * Specifies the category property: The category of the budget, whether the budget tracks cost or usage..
             * 
             * @param category The category of the budget, whether the budget tracks cost or usage.
             * @return the next definition stage.
             */
            WithCreate withCategory(CategoryType category);
        }

        /**
         * The stage of the Budget definition allowing to specify amount.
         */
        interface WithAmount {
            /**
             * Specifies the amount property: The total amount of cost to track with the budget.
             * 
             * @param amount The total amount of cost to track with the budget.
             * @return the next definition stage.
             */
            WithCreate withAmount(BigDecimal amount);
        }

        /**
         * The stage of the Budget definition allowing to specify timeGrain.
         */
        interface WithTimeGrain {
            /**
             * Specifies the timeGrain property: The time covered by a budget. Tracking of the amount will be reset
             * based on the time grain. BillingMonth, BillingQuarter, and BillingAnnual are only supported by WD
             * customers.
             * 
             * @param timeGrain The time covered by a budget. Tracking of the amount will be reset based on the time
             * grain. BillingMonth, BillingQuarter, and BillingAnnual are only supported by WD customers.
             * @return the next definition stage.
             */
            WithCreate withTimeGrain(TimeGrainType timeGrain);
        }

        /**
         * The stage of the Budget definition allowing to specify timePeriod.
         */
        interface WithTimePeriod {
            /**
             * Specifies the timePeriod property: Has start and end date of the budget. The start date must be first of
             * the month and should be less than the end date. Budget start date must be on or after June 1, 2017.
             * Future start date should not be more than twelve months. Past start date should be selected within the
             * timegrain period. There are no restrictions on the end date..
             * 
             * @param timePeriod Has start and end date of the budget. The start date must be first of the month and
             * should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date
             * should not be more than twelve months. Past start date should be selected within the timegrain period.
             * There are no restrictions on the end date.
             * @return the next definition stage.
             */
            WithCreate withTimePeriod(BudgetTimePeriod timePeriod);
        }

        /**
         * The stage of the Budget definition allowing to specify filter.
         */
        interface WithFilter {
            /**
             * Specifies the filter property: May be used to filter budgets by user-specified dimensions and/or tags..
             * 
             * @param filter May be used to filter budgets by user-specified dimensions and/or tags.
             * @return the next definition stage.
             */
            WithCreate withFilter(BudgetFilter filter);
        }

        /**
         * The stage of the Budget definition allowing to specify notifications.
         */
        interface WithNotifications {
            /**
             * Specifies the notifications property: Dictionary of notifications associated with the budget. Budget can
             * have up to five notifications..
             * 
             * @param notifications Dictionary of notifications associated with the budget. Budget can have up to five
             * notifications.
             * @return the next definition stage.
             */
            WithCreate withNotifications(Map<String, Notification> notifications);
        }
    }

    /**
     * Begins update for the Budget resource.
     * 
     * @return the stage of resource update.
     */
    Budget.Update update();

    /**
     * The template for Budget update.
     */
    interface Update
        extends UpdateStages.WithEtag, UpdateStages.WithCategory, UpdateStages.WithAmount, UpdateStages.WithTimeGrain,
        UpdateStages.WithTimePeriod, UpdateStages.WithFilter, UpdateStages.WithNotifications {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Budget apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Budget apply(Context context);
    }

    /**
     * The Budget update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Budget update allowing to specify etag.
         */
        interface WithEtag {
            /**
             * Specifies the etag property: eTag of the resource. To handle concurrent update scenario, this field will
             * be used to determine whether the user is updating the latest version or not..
             * 
             * @param etag eTag of the resource. To handle concurrent update scenario, this field will be used to
             * determine whether the user is updating the latest version or not.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the Budget update allowing to specify category.
         */
        interface WithCategory {
            /**
             * Specifies the category property: The category of the budget, whether the budget tracks cost or usage..
             * 
             * @param category The category of the budget, whether the budget tracks cost or usage.
             * @return the next definition stage.
             */
            Update withCategory(CategoryType category);
        }

        /**
         * The stage of the Budget update allowing to specify amount.
         */
        interface WithAmount {
            /**
             * Specifies the amount property: The total amount of cost to track with the budget.
             * 
             * @param amount The total amount of cost to track with the budget.
             * @return the next definition stage.
             */
            Update withAmount(BigDecimal amount);
        }

        /**
         * The stage of the Budget update allowing to specify timeGrain.
         */
        interface WithTimeGrain {
            /**
             * Specifies the timeGrain property: The time covered by a budget. Tracking of the amount will be reset
             * based on the time grain. BillingMonth, BillingQuarter, and BillingAnnual are only supported by WD
             * customers.
             * 
             * @param timeGrain The time covered by a budget. Tracking of the amount will be reset based on the time
             * grain. BillingMonth, BillingQuarter, and BillingAnnual are only supported by WD customers.
             * @return the next definition stage.
             */
            Update withTimeGrain(TimeGrainType timeGrain);
        }

        /**
         * The stage of the Budget update allowing to specify timePeriod.
         */
        interface WithTimePeriod {
            /**
             * Specifies the timePeriod property: Has start and end date of the budget. The start date must be first of
             * the month and should be less than the end date. Budget start date must be on or after June 1, 2017.
             * Future start date should not be more than twelve months. Past start date should be selected within the
             * timegrain period. There are no restrictions on the end date..
             * 
             * @param timePeriod Has start and end date of the budget. The start date must be first of the month and
             * should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date
             * should not be more than twelve months. Past start date should be selected within the timegrain period.
             * There are no restrictions on the end date.
             * @return the next definition stage.
             */
            Update withTimePeriod(BudgetTimePeriod timePeriod);
        }

        /**
         * The stage of the Budget update allowing to specify filter.
         */
        interface WithFilter {
            /**
             * Specifies the filter property: May be used to filter budgets by user-specified dimensions and/or tags..
             * 
             * @param filter May be used to filter budgets by user-specified dimensions and/or tags.
             * @return the next definition stage.
             */
            Update withFilter(BudgetFilter filter);
        }

        /**
         * The stage of the Budget update allowing to specify notifications.
         */
        interface WithNotifications {
            /**
             * Specifies the notifications property: Dictionary of notifications associated with the budget. Budget can
             * have up to five notifications..
             * 
             * @param notifications Dictionary of notifications associated with the budget. Budget can have up to five
             * notifications.
             * @return the next definition stage.
             */
            Update withNotifications(Map<String, Notification> notifications);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Budget refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Budget refresh(Context context);
}
