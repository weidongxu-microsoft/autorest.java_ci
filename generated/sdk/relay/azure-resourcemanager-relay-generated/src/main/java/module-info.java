// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.relay.generated {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.relay.generated;
    exports com.azure.resourcemanager.relay.generated.fluent;
    exports com.azure.resourcemanager.relay.generated.fluent.models;
    exports com.azure.resourcemanager.relay.generated.models;

    opens com.azure.resourcemanager.relay.generated.fluent.models to com.azure.core, com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.relay.generated.models to com.azure.core, com.fasterxml.jackson.databind;
}
