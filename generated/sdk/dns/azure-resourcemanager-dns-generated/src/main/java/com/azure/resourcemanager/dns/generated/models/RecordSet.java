// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.dns.generated.fluent.models.RecordSetInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of RecordSet.
 */
public interface RecordSet {
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
     * Gets the etag property: The etag of the record set.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the metadata property: The metadata attached to the record set.
     * 
     * @return the metadata value.
     */
    Map<String, String> metadata();

    /**
     * Gets the ttl property: The TTL (time-to-live) of the records in the record set.
     * 
     * @return the ttl value.
     */
    Long ttl();

    /**
     * Gets the fqdn property: Fully qualified domain name of the record set.
     * 
     * @return the fqdn value.
     */
    String fqdn();

    /**
     * Gets the provisioningState property: provisioning State of the record set.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the targetResource property: A reference to an azure resource from where the dns resource value is taken.
     * 
     * @return the targetResource value.
     */
    SubResource targetResource();

    /**
     * Gets the trafficManagementProfile property: A reference to an azure traffic manager profile resource from where
     * the dns resource value is taken.
     * 
     * @return the trafficManagementProfile value.
     */
    SubResource trafficManagementProfile();

    /**
     * Gets the aRecords property: The list of A records in the record set.
     * 
     * @return the aRecords value.
     */
    List<ARecord> aRecords();

    /**
     * Gets the aaaaRecords property: The list of AAAA records in the record set.
     * 
     * @return the aaaaRecords value.
     */
    List<AaaaRecord> aaaaRecords();

    /**
     * Gets the mxRecords property: The list of MX records in the record set.
     * 
     * @return the mxRecords value.
     */
    List<MxRecord> mxRecords();

    /**
     * Gets the nsRecords property: The list of NS records in the record set.
     * 
     * @return the nsRecords value.
     */
    List<NsRecord> nsRecords();

    /**
     * Gets the ptrRecords property: The list of PTR records in the record set.
     * 
     * @return the ptrRecords value.
     */
    List<PtrRecord> ptrRecords();

    /**
     * Gets the srvRecords property: The list of SRV records in the record set.
     * 
     * @return the srvRecords value.
     */
    List<SrvRecord> srvRecords();

    /**
     * Gets the txtRecords property: The list of TXT records in the record set.
     * 
     * @return the txtRecords value.
     */
    List<TxtRecord> txtRecords();

    /**
     * Gets the cnameRecord property: The CNAME record in the record set.
     * 
     * @return the cnameRecord value.
     */
    CnameRecord cnameRecord();

    /**
     * Gets the soaRecord property: The SOA record in the record set.
     * 
     * @return the soaRecord value.
     */
    SoaRecord soaRecord();

    /**
     * Gets the caaRecords property: The list of CAA records in the record set.
     * 
     * @return the caaRecords value.
     */
    List<CaaRecord> caaRecords();

    /**
     * Gets the dsRecords property: The list of DS records in the record set.
     * 
     * @return the dsRecords value.
     */
    List<DsRecord> dsRecords();

    /**
     * Gets the tlsaRecords property: The list of TLSA records in the record set.
     * 
     * @return the tlsaRecords value.
     */
    List<TlsaRecord> tlsaRecords();

    /**
     * Gets the naptrRecords property: The list of NAPTR records in the record set.
     * 
     * @return the naptrRecords value.
     */
    List<NaptrRecord> naptrRecords();

    /**
     * Gets the inner com.azure.resourcemanager.dns.generated.fluent.models.RecordSetInner object.
     * 
     * @return the inner object.
     */
    RecordSetInner innerModel();
}
