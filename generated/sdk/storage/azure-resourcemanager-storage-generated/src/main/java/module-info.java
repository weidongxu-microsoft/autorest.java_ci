// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.storage.generated {
    requires transitive com.azure.core.management;
    exports com.azure.resourcemanager.storage.generated;
    exports com.azure.resourcemanager.storage.generated.fluent;
    exports com.azure.resourcemanager.storage.generated.fluent.models;
    exports com.azure.resourcemanager.storage.generated.models;
    opens com.azure.resourcemanager.storage.generated.fluent.models to com.azure.core, com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.storage.generated.models to com.azure.core, com.fasterxml.jackson.databind;
}
