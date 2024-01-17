// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.fluent.BudgetsClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.BudgetInner;
import com.azure.resourcemanager.consumption.generated.models.Budget;
import com.azure.resourcemanager.consumption.generated.models.Budgets;

public final class BudgetsImpl implements Budgets {
    private static final ClientLogger LOGGER = new ClientLogger(BudgetsImpl.class);

    private final BudgetsClient innerClient;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    public BudgetsImpl(BudgetsClient innerClient,
        com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Budget> list(String scope) {
        PagedIterable<BudgetInner> inner = this.serviceClient().list(scope);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BudgetImpl(inner1, this.manager()));
    }

    public PagedIterable<Budget> list(String scope, Context context) {
        PagedIterable<BudgetInner> inner = this.serviceClient().list(scope, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BudgetImpl(inner1, this.manager()));
    }

    public Response<Budget> getWithResponse(String scope, String budgetName, Context context) {
        Response<BudgetInner> inner = this.serviceClient().getWithResponse(scope, budgetName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BudgetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Budget get(String scope, String budgetName) {
        BudgetInner inner = this.serviceClient().get(scope, budgetName);
        if (inner != null) {
            return new BudgetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(String scope, String budgetName, Context context) {
        return this.serviceClient().deleteWithResponse(scope, budgetName, context);
    }

    public void deleteByResourceGroup(String scope, String budgetName) {
        this.serviceClient().delete(scope, budgetName);
    }

    public Budget getById(String id) {
        String scope = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.Consumption/budgets/{budgetName}", "scope");
        if (scope == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String budgetName = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.Consumption/budgets/{budgetName}", "budgetName");
        if (budgetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'budgets'.", id)));
        }
        return this.getWithResponse(scope, budgetName, Context.NONE).getValue();
    }

    public Response<Budget> getByIdWithResponse(String id, Context context) {
        String scope = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.Consumption/budgets/{budgetName}", "scope");
        if (scope == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String budgetName = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.Consumption/budgets/{budgetName}", "budgetName");
        if (budgetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'budgets'.", id)));
        }
        return this.getWithResponse(scope, budgetName, context);
    }

    public void deleteById(String id) {
        String scope = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.Consumption/budgets/{budgetName}", "scope");
        if (scope == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String budgetName = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.Consumption/budgets/{budgetName}", "budgetName");
        if (budgetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'budgets'.", id)));
        }
        this.deleteByResourceGroupWithResponse(scope, budgetName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String scope = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.Consumption/budgets/{budgetName}", "scope");
        if (scope == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String budgetName = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{scope}/providers/Microsoft.Consumption/budgets/{budgetName}", "budgetName");
        if (budgetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'budgets'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(scope, budgetName, context);
    }

    private BudgetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }

    public BudgetImpl define(String name) {
        return new BudgetImpl(name, this.manager());
    }
}
