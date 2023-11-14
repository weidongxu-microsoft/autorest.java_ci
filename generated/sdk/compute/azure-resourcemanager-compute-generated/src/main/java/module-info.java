// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.compute.generated {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.compute.generated;
    exports com.azure.resourcemanager.compute.generated.fluent;
    exports com.azure.resourcemanager.compute.generated.fluent.models;
    exports com.azure.resourcemanager.compute.generated.models;

    opens com.azure.resourcemanager.compute.generated.fluent.models to com.azure.core, com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.compute.generated.models to com.azure.core, com.fasterxml.jackson.databind;
}
