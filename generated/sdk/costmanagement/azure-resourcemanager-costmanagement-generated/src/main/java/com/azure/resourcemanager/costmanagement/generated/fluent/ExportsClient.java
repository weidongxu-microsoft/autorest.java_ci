// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.ExportExecutionListResultInner;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.ExportInner;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.ExportListResultInner;

/** An instance of this class provides access to all the operations defined in ExportsClient. */
public interface ExportsClient {
    /**
     * The operation to list all exports at the given scope.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing exports along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExportListResultInner> listWithResponse(String scope, Context context);

    /**
     * The operation to list all exports at the given scope.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing exports.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExportListResultInner list(String scope);

    /**
     * The operation to get the export for the defined scope by export name.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param exportName Export Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a export resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExportInner> getWithResponse(String scope, String exportName, Context context);

    /**
     * The operation to get the export for the defined scope by export name.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param exportName Export Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a export resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExportInner get(String scope, String exportName);

    /**
     * The operation to create or update a export. Update operation requires latest eTag to be set in the request. You
     * may obtain the latest eTag by performing a get operation. Create operation does not require eTag.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param exportName Export Name.
     * @param parameters Parameters supplied to the CreateOrUpdate Export operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a export resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExportInner> createOrUpdateWithResponse(
        String scope, String exportName, ExportInner parameters, Context context);

    /**
     * The operation to create or update a export. Update operation requires latest eTag to be set in the request. You
     * may obtain the latest eTag by performing a get operation. Create operation does not require eTag.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param exportName Export Name.
     * @param parameters Parameters supplied to the CreateOrUpdate Export operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a export resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExportInner createOrUpdate(String scope, String exportName, ExportInner parameters);

    /**
     * The operation to delete a export.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param exportName Export Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String scope, String exportName, Context context);

    /**
     * The operation to delete a export.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param exportName Export Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String scope, String exportName);

    /**
     * The operation to execute a export.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param exportName Export Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> executeWithResponse(String scope, String exportName, Context context);

    /**
     * The operation to execute a export.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param exportName Export Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void execute(String scope, String exportName);

    /**
     * The operation to get the execution history of an export for the defined scope by export name.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param exportName Export Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing exports execution history of a export by name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExportExecutionListResultInner> getExecutionHistoryWithResponse(
        String scope, String exportName, Context context);

    /**
     * The operation to get the execution history of an export for the defined scope by export name.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param exportName Export Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing exports execution history of a export by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExportExecutionListResultInner getExecutionHistory(String scope, String exportName);
}
