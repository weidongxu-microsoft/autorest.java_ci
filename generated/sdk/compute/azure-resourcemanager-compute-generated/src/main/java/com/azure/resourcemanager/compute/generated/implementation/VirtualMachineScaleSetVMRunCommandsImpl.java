// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetVMRunCommandsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineRunCommandInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommand;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandUpdate;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMRunCommands;

public final class VirtualMachineScaleSetVMRunCommandsImpl implements VirtualMachineScaleSetVMRunCommands {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineScaleSetVMRunCommandsImpl.class);

    private final VirtualMachineScaleSetVMRunCommandsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public VirtualMachineScaleSetVMRunCommandsImpl(VirtualMachineScaleSetVMRunCommandsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualMachineRunCommand createOrUpdate(String resourceGroupName, String vmScaleSetName, String instanceId,
        String runCommandName, VirtualMachineRunCommandInner runCommand) {
        VirtualMachineRunCommandInner inner = this.serviceClient().createOrUpdate(resourceGroupName, vmScaleSetName,
            instanceId, runCommandName, runCommand);
        if (inner != null) {
            return new VirtualMachineRunCommandImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineRunCommand createOrUpdate(String resourceGroupName, String vmScaleSetName, String instanceId,
        String runCommandName, VirtualMachineRunCommandInner runCommand, Context context) {
        VirtualMachineRunCommandInner inner = this.serviceClient().createOrUpdate(resourceGroupName, vmScaleSetName,
            instanceId, runCommandName, runCommand, context);
        if (inner != null) {
            return new VirtualMachineRunCommandImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineRunCommand update(String resourceGroupName, String vmScaleSetName, String instanceId,
        String runCommandName, VirtualMachineRunCommandUpdate runCommand) {
        VirtualMachineRunCommandInner inner
            = this.serviceClient().update(resourceGroupName, vmScaleSetName, instanceId, runCommandName, runCommand);
        if (inner != null) {
            return new VirtualMachineRunCommandImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineRunCommand update(String resourceGroupName, String vmScaleSetName, String instanceId,
        String runCommandName, VirtualMachineRunCommandUpdate runCommand, Context context) {
        VirtualMachineRunCommandInner inner = this.serviceClient().update(resourceGroupName, vmScaleSetName, instanceId,
            runCommandName, runCommand, context);
        if (inner != null) {
            return new VirtualMachineRunCommandImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String vmScaleSetName, String instanceId, String runCommandName) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, instanceId, runCommandName);
    }

    public void delete(String resourceGroupName, String vmScaleSetName, String instanceId, String runCommandName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, instanceId, runCommandName, context);
    }

    public Response<VirtualMachineRunCommand> getWithResponse(String resourceGroupName, String vmScaleSetName,
        String instanceId, String runCommandName, String expand, Context context) {
        Response<VirtualMachineRunCommandInner> inner = this.serviceClient().getWithResponse(resourceGroupName,
            vmScaleSetName, instanceId, runCommandName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VirtualMachineRunCommandImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualMachineRunCommand get(String resourceGroupName, String vmScaleSetName, String instanceId,
        String runCommandName) {
        VirtualMachineRunCommandInner inner
            = this.serviceClient().get(resourceGroupName, vmScaleSetName, instanceId, runCommandName);
        if (inner != null) {
            return new VirtualMachineRunCommandImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualMachineRunCommand> list(String resourceGroupName, String vmScaleSetName,
        String instanceId) {
        PagedIterable<VirtualMachineRunCommandInner> inner
            = this.serviceClient().list(resourceGroupName, vmScaleSetName, instanceId);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualMachineRunCommandImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineRunCommand> list(String resourceGroupName, String vmScaleSetName,
        String instanceId, String expand, Context context) {
        PagedIterable<VirtualMachineRunCommandInner> inner
            = this.serviceClient().list(resourceGroupName, vmScaleSetName, instanceId, expand, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualMachineRunCommandImpl(inner1, this.manager()));
    }

    private VirtualMachineScaleSetVMRunCommandsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
