// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge
{
    public static class GetDevice
    {
        /// <summary>
        /// Use this data source to get Equinix Network Edge device details.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var byUuid = Equinix.NetworkEdge.GetDevice.Invoke(new()
        ///     {
        ///         Uuid = "f0b5c553-cdeb-4bc3-95b8-23db9ccfd5ee",
        ///     });
        /// 
        ///     var byName = Equinix.NetworkEdge.GetDevice.Invoke(new()
        ///     {
        ///         Name = "Arcus-Gateway-A1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDeviceResult> InvokeAsync(GetDeviceArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDeviceResult>("equinix:networkedge/getDevice:getDevice", args ?? new GetDeviceArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get Equinix Network Edge device details.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var byUuid = Equinix.NetworkEdge.GetDevice.Invoke(new()
        ///     {
        ///         Uuid = "f0b5c553-cdeb-4bc3-95b8-23db9ccfd5ee",
        ///     });
        /// 
        ///     var byName = Equinix.NetworkEdge.GetDevice.Invoke(new()
        ///     {
        ///         Name = "Arcus-Gateway-A1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDeviceResult> Invoke(GetDeviceInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDeviceResult>("equinix:networkedge/getDevice:getDevice", args ?? new GetDeviceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeviceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of an existing Equinix Network Edge device
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// UUID of an existing Equinix Network Edge device
        /// </summary>
        [Input("uuid")]
        public string? Uuid { get; set; }

        /// <summary>
        /// Device states to be considered valid when searching for a device by name
        /// </summary>
        [Input("validStatusList")]
        public string? ValidStatusList { get; set; }

        public GetDeviceArgs()
        {
        }
        public static new GetDeviceArgs Empty => new GetDeviceArgs();
    }

    public sealed class GetDeviceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of an existing Equinix Network Edge device
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// UUID of an existing Equinix Network Edge device
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        /// <summary>
        /// Device states to be considered valid when searching for a device by name
        /// </summary>
        [Input("validStatusList")]
        public Input<string>? ValidStatusList { get; set; }

        public GetDeviceInvokeArgs()
        {
        }
        public static new GetDeviceInvokeArgs Empty => new GetDeviceInvokeArgs();
    }


    [OutputType]
    public sealed class GetDeviceResult
    {
        public readonly string AccountNumber;
        /// <summary>
        /// Unique identifier of applied ACL template
        /// </summary>
        public readonly string AclTemplateId;
        public readonly int AdditionalBandwidth;
        /// <summary>
        /// Autonomous system number
        /// </summary>
        public readonly int Asn;
        public readonly bool Byol;
        public readonly ImmutableArray<Outputs.GetDeviceClusterDetailResult> ClusterDetails;
        public readonly int CoreCount;
        public readonly string Hostname;
        /// <summary>
        /// Device location Equinix Business Exchange name
        /// </summary>
        public readonly string Ibx;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int InterfaceCount;
        /// <summary>
        /// List of device interfaces
        /// * `interface.#.id` - interface identifier
        /// * `interface.#.name` - interface name
        /// * `interface.#.status` -  interface status (AVAILABLE, RESERVED, ASSIGNED)
        /// * `interface.#.operational_status` - interface operational status (up or down)
        /// * `interface.#.mac_address` - interface MAC address
        /// * `interface.#.ip_address` - interface IP address
        /// * `interface.#.assigned_type` - interface management type (Equinix Managed or empty)
        /// * `interface.#.type` - interface type
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeviceInterfaceResult> Interfaces;
        public readonly string LicenseFile;
        /// <summary>
        /// Unique identifier of applied license file
        /// </summary>
        public readonly string LicenseFileId;
        /// <summary>
        /// Device license registration status
        /// * APPLYING_LICENSE
        /// * REGISTERED
        /// * APPLIED
        /// * WAITING_FOR_CLUSTER_SETUP
        /// * REGISTRATION_FAILED
        /// </summary>
        public readonly string LicenseStatus;
        public readonly string LicenseToken;
        public readonly string MetroCode;
        public readonly string MgmtAclTemplateUuid;
        public readonly string Name;
        public readonly ImmutableArray<string> Notifications;
        public readonly string OrderReference;
        public readonly string PackageCode;
        public readonly string PurchaseOrderNumber;
        /// <summary>
        /// Device redundancy type applicable for HA devices, either
        /// primary or secondary
        /// </summary>
        public readonly string RedundancyType;
        /// <summary>
        /// Unique identifier for a redundant device applicable for HA devices
        /// </summary>
        public readonly string RedundantId;
        /// <summary>
        /// Device location region
        /// </summary>
        public readonly string Region;
        public readonly ImmutableArray<Outputs.GetDeviceSecondaryDeviceResult> SecondaryDevices;
        public readonly bool SelfManaged;
        /// <summary>
        /// IP address of SSH enabled interface on the device
        /// </summary>
        public readonly string SshIpAddress;
        /// <summary>
        /// FQDN of SSH enabled interface on the device
        /// </summary>
        public readonly string SshIpFqdn;
        public readonly ImmutableArray<Outputs.GetDeviceSshKeyResult> SshKeys;
        /// <summary>
        /// Device provisioning status
        /// * INITIALIZING
        /// * PROVISIONING
        /// * PROVISIONED  (**NOTE: By default data source will only return devices in this state.  To include other states see `valid_state_list`**)
        /// * WAITING_FOR_PRIMARY
        /// * WAITING_FOR_SECONDARY
        /// * WAITING_FOR_REPLICA_CLUSTER_NODES
        /// * CLUSTER_SETUP_IN_PROGRESS
        /// * FAILED
        /// * DEPROVISIONING
        /// * DEPROVISIONED
        /// </summary>
        public readonly string Status;
        public readonly int TermLength;
        public readonly int Throughput;
        public readonly string ThroughputUnit;
        public readonly string TypeCode;
        /// <summary>
        /// Device unique identifier
        /// </summary>
        public readonly string Uuid;
        /// <summary>
        /// Comma separated list of device states (from see `status` for full list) to be considered valid. Default is 'PROVISIONED'.  Case insensitive.
        /// </summary>
        public readonly string? ValidStatusList;
        public readonly ImmutableDictionary<string, string> VendorConfiguration;
        public readonly string Version;
        public readonly string WanInterfaceId;
        /// <summary>
        /// Device location zone code
        /// </summary>
        public readonly string ZoneCode;

        [OutputConstructor]
        private GetDeviceResult(
            string accountNumber,

            string aclTemplateId,

            int additionalBandwidth,

            int asn,

            bool byol,

            ImmutableArray<Outputs.GetDeviceClusterDetailResult> clusterDetails,

            int coreCount,

            string hostname,

            string ibx,

            string id,

            int interfaceCount,

            ImmutableArray<Outputs.GetDeviceInterfaceResult> interfaces,

            string licenseFile,

            string licenseFileId,

            string licenseStatus,

            string licenseToken,

            string metroCode,

            string mgmtAclTemplateUuid,

            string name,

            ImmutableArray<string> notifications,

            string orderReference,

            string packageCode,

            string purchaseOrderNumber,

            string redundancyType,

            string redundantId,

            string region,

            ImmutableArray<Outputs.GetDeviceSecondaryDeviceResult> secondaryDevices,

            bool selfManaged,

            string sshIpAddress,

            string sshIpFqdn,

            ImmutableArray<Outputs.GetDeviceSshKeyResult> sshKeys,

            string status,

            int termLength,

            int throughput,

            string throughputUnit,

            string typeCode,

            string uuid,

            string? validStatusList,

            ImmutableDictionary<string, string> vendorConfiguration,

            string version,

            string wanInterfaceId,

            string zoneCode)
        {
            AccountNumber = accountNumber;
            AclTemplateId = aclTemplateId;
            AdditionalBandwidth = additionalBandwidth;
            Asn = asn;
            Byol = byol;
            ClusterDetails = clusterDetails;
            CoreCount = coreCount;
            Hostname = hostname;
            Ibx = ibx;
            Id = id;
            InterfaceCount = interfaceCount;
            Interfaces = interfaces;
            LicenseFile = licenseFile;
            LicenseFileId = licenseFileId;
            LicenseStatus = licenseStatus;
            LicenseToken = licenseToken;
            MetroCode = metroCode;
            MgmtAclTemplateUuid = mgmtAclTemplateUuid;
            Name = name;
            Notifications = notifications;
            OrderReference = orderReference;
            PackageCode = packageCode;
            PurchaseOrderNumber = purchaseOrderNumber;
            RedundancyType = redundancyType;
            RedundantId = redundantId;
            Region = region;
            SecondaryDevices = secondaryDevices;
            SelfManaged = selfManaged;
            SshIpAddress = sshIpAddress;
            SshIpFqdn = sshIpFqdn;
            SshKeys = sshKeys;
            Status = status;
            TermLength = termLength;
            Throughput = throughput;
            ThroughputUnit = throughputUnit;
            TypeCode = typeCode;
            Uuid = uuid;
            ValidStatusList = validStatusList;
            VendorConfiguration = vendorConfiguration;
            Version = version;
            WanInterfaceId = wanInterfaceId;
            ZoneCode = zoneCode;
        }
    }
}
