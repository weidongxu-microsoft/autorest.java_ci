// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.mysql.generated {
    requires transitive com.azure.core.management;
    exports com.azure.resourcemanager.mysql.generated;
    exports com.azure.resourcemanager.mysql.generated.fluent;
    exports com.azure.resourcemanager.mysql.generated.fluent.models;
    exports com.azure.resourcemanager.mysql.generated.models;
    opens com.azure.resourcemanager.mysql.generated.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.mysql.generated.models to com.azure.core;
}