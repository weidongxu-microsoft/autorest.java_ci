// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.dns.generated.fluent.models.RecordSetInner;
import com.azure.resourcemanager.dns.generated.models.ARecord;
import com.azure.resourcemanager.dns.generated.models.AaaaRecord;
import com.azure.resourcemanager.dns.generated.models.CaaRecord;
import com.azure.resourcemanager.dns.generated.models.CnameRecord;
import com.azure.resourcemanager.dns.generated.models.DsRecord;
import com.azure.resourcemanager.dns.generated.models.MxRecord;
import com.azure.resourcemanager.dns.generated.models.NaptrRecord;
import com.azure.resourcemanager.dns.generated.models.NsRecord;
import com.azure.resourcemanager.dns.generated.models.PtrRecord;
import com.azure.resourcemanager.dns.generated.models.RecordSet;
import com.azure.resourcemanager.dns.generated.models.SoaRecord;
import com.azure.resourcemanager.dns.generated.models.SrvRecord;
import com.azure.resourcemanager.dns.generated.models.TlsaRecord;
import com.azure.resourcemanager.dns.generated.models.TxtRecord;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class RecordSetImpl implements RecordSet {
    private RecordSetInner innerObject;

    private final com.azure.resourcemanager.dns.generated.DnsManager serviceManager;

    RecordSetImpl(RecordSetInner innerObject, com.azure.resourcemanager.dns.generated.DnsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Map<String, String> metadata() {
        Map<String, String> inner = this.innerModel().metadata();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Long ttl() {
        return this.innerModel().ttl();
    }

    public String fqdn() {
        return this.innerModel().fqdn();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SubResource targetResource() {
        return this.innerModel().targetResource();
    }

    public SubResource trafficManagementProfile() {
        return this.innerModel().trafficManagementProfile();
    }

    public List<ARecord> aRecords() {
        List<ARecord> inner = this.innerModel().aRecords();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AaaaRecord> aaaaRecords() {
        List<AaaaRecord> inner = this.innerModel().aaaaRecords();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<MxRecord> mxRecords() {
        List<MxRecord> inner = this.innerModel().mxRecords();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<NsRecord> nsRecords() {
        List<NsRecord> inner = this.innerModel().nsRecords();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<PtrRecord> ptrRecords() {
        List<PtrRecord> inner = this.innerModel().ptrRecords();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SrvRecord> srvRecords() {
        List<SrvRecord> inner = this.innerModel().srvRecords();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<TxtRecord> txtRecords() {
        List<TxtRecord> inner = this.innerModel().txtRecords();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public CnameRecord cnameRecord() {
        return this.innerModel().cnameRecord();
    }

    public SoaRecord soaRecord() {
        return this.innerModel().soaRecord();
    }

    public List<CaaRecord> caaRecords() {
        List<CaaRecord> inner = this.innerModel().caaRecords();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<DsRecord> dsRecords() {
        List<DsRecord> inner = this.innerModel().dsRecords();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<TlsaRecord> tlsaRecords() {
        List<TlsaRecord> inner = this.innerModel().tlsaRecords();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<NaptrRecord> naptrRecords() {
        List<NaptrRecord> inner = this.innerModel().naptrRecords();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public RecordSetInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dns.generated.DnsManager manager() {
        return this.serviceManager;
    }
}
