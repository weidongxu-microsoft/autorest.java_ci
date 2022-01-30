// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.generated.fluent.models.MarketplaceInner;

/** An instance of this class provides access to all the operations defined in MarketplacesClient. */
public interface MarketplacesClient {
    /**
     * Lists the marketplaces for a scope at the defined scope. Marketplaces are available via this API only for May 1,
     * 2014 or later.
     *
     * @param scope The scope associated with marketplace operations. This includes '/subscriptions/{subscriptionId}/'
     *     for subscription scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account
     *     scope, '/providers/Microsoft.Billing/departments/{departmentId}' for Department scope,
     *     '/providers/Microsoft.Billing/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope and
     *     '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group scope. For
     *     subscription, billing account, department, enrollment account and ManagementGroup, you can also add billing
     *     period to the scope using '/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'. For e.g. to
     *     specify billing period at department scope use
     *     '/providers/Microsoft.Billing/departments/{departmentId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing marketplaces as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MarketplaceInner> list(String scope);

    /**
     * Lists the marketplaces for a scope at the defined scope. Marketplaces are available via this API only for May 1,
     * 2014 or later.
     *
     * @param scope The scope associated with marketplace operations. This includes '/subscriptions/{subscriptionId}/'
     *     for subscription scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account
     *     scope, '/providers/Microsoft.Billing/departments/{departmentId}' for Department scope,
     *     '/providers/Microsoft.Billing/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope and
     *     '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group scope. For
     *     subscription, billing account, department, enrollment account and ManagementGroup, you can also add billing
     *     period to the scope using '/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'. For e.g. to
     *     specify billing period at department scope use
     *     '/providers/Microsoft.Billing/departments/{departmentId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'.
     * @param filter May be used to filter marketplaces by properties/usageEnd (Utc time), properties/usageStart (Utc
     *     time), properties/resourceGroup, properties/instanceName or properties/instanceId. The filter supports 'eq',
     *     'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @param top May be used to limit the number of results to the most recent N marketplaces.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing marketplaces as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MarketplaceInner> list(String scope, String filter, Integer top, String skiptoken, Context context);
}
