// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge.Inputs
{

    public sealed class DeviceSecondaryDeviceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Billing account number for secondary device.
        /// </summary>
        [Input("accountNumber", required: true)]
        public Input<string> AccountNumber { get; set; } = null!;

        /// <summary>
        /// Identifier of a WAN interface ACL template that will be applied
        /// on a secondary device.
        /// </summary>
        [Input("aclTemplateId")]
        public Input<string>? AclTemplateId { get; set; }

        /// <summary>
        /// Additional Internet bandwidth, in Mbps, for a secondary
        /// device.
        /// </summary>
        [Input("additionalBandwidth")]
        public Input<int>? AdditionalBandwidth { get; set; }

        /// <summary>
        /// (Autonomous System Number) Unique identifier for a network on the internet.
        /// </summary>
        [Input("asn")]
        public Input<int>? Asn { get; set; }

        /// <summary>
        /// Secondary device hostname.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// Device location Equinix Business Exchange name.
        /// </summary>
        [Input("ibx")]
        public Input<string>? Ibx { get; set; }

        [Input("interfaces")]
        private InputList<Inputs.DeviceSecondaryDeviceInterfaceGetArgs>? _interfaces;

        /// <summary>
        /// List of device interfaces. See Interface Attribute below
        /// for more details.
        /// </summary>
        public InputList<Inputs.DeviceSecondaryDeviceInterfaceGetArgs> Interfaces
        {
            get => _interfaces ?? (_interfaces = new InputList<Inputs.DeviceSecondaryDeviceInterfaceGetArgs>());
            set => _interfaces = value;
        }

        /// <summary>
        /// Path to the license file that will be uploaded and applied on a
        /// secondary device. Applicable for some devices types in BYOL licensing mode.
        /// </summary>
        [Input("licenseFile")]
        public Input<string>? LicenseFile { get; set; }

        /// <summary>
        /// License file id. This is necessary for Fortinet and Juniper clusters.
        /// </summary>
        [Input("licenseFileId")]
        public Input<string>? LicenseFileId { get; set; }

        /// <summary>
        /// Device license registration status. Possible values are `APPLYING_LICENSE`,
        /// `REGISTERED`, `APPLIED`, `WAITING_FOR_CLUSTER_SETUP`, `REGISTRATION_FAILED`.
        /// </summary>
        [Input("licenseStatus")]
        public Input<string>? LicenseStatus { get; set; }

        /// <summary>
        /// License Token can be provided for some device types o the device.
        /// </summary>
        [Input("licenseToken")]
        public Input<string>? LicenseToken { get; set; }

        /// <summary>
        /// Metro location of a secondary device.
        /// </summary>
        [Input("metroCode", required: true)]
        public Input<string> MetroCode { get; set; } = null!;

        /// <summary>
        /// Identifier of an MGMT interface ACL template that will be
        /// applied on the device.
        /// * `ssh-key` - (Optional) Up to one definition of SSH key that will be provisioned on a secondary
        /// device.
        /// </summary>
        [Input("mgmtAclTemplateUuid")]
        public Input<string>? MgmtAclTemplateUuid { get; set; }

        /// <summary>
        /// Secondary device name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("notifications", required: true)]
        private InputList<string>? _notifications;

        /// <summary>
        /// List of email addresses that will receive notifications about
        /// secondary device.
        /// </summary>
        public InputList<string> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<string>());
            set => _notifications = value;
        }

        /// <summary>
        /// Device redundancy type applicable for HA devices, either
        /// primary or secondary.
        /// </summary>
        [Input("redundancyType")]
        public Input<string>? RedundancyType { get; set; }

        /// <summary>
        /// Unique identifier for a redundant device applicable for HA devices.
        /// </summary>
        [Input("redundantId")]
        public Input<string>? RedundantId { get; set; }

        /// <summary>
        /// Device location region.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// IP address of SSH enabled interface on the device.
        /// </summary>
        [Input("sshIpAddress")]
        public Input<string>? SshIpAddress { get; set; }

        /// <summary>
        /// FQDN of SSH enabled interface on the device.
        /// </summary>
        [Input("sshIpFqdn")]
        public Input<string>? SshIpFqdn { get; set; }

        [Input("sshKey")]
        public Input<Inputs.DeviceSecondaryDeviceSshKeyGetArgs>? SshKey { get; set; }

        /// <summary>
        /// interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Device unique identifier.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        [Input("vendorConfiguration")]
        private InputMap<string>? _vendorConfiguration;

        /// <summary>
        /// Key/Value pairs of vendor specific configuration parameters
        /// for a secondary device. Key values are `controller1`, `activationKey`, `managementType`, `siteId`,
        /// `systemIpAddress`.
        /// </summary>
        public InputMap<string> VendorConfiguration
        {
            get => _vendorConfiguration ?? (_vendorConfiguration = new InputMap<string>());
            set => _vendorConfiguration = value;
        }

        [Input("wanInterfaceId")]
        public Input<string>? WanInterfaceId { get; set; }

        /// <summary>
        /// Device location zone code.
        /// </summary>
        [Input("zoneCode")]
        public Input<string>? ZoneCode { get; set; }

        public DeviceSecondaryDeviceGetArgs()
        {
        }
        public static new DeviceSecondaryDeviceGetArgs Empty => new DeviceSecondaryDeviceGetArgs();
    }
}
