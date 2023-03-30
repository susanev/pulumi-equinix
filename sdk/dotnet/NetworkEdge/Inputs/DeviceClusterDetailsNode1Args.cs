// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge.Inputs
{

    public sealed class DeviceClusterDetailsNode1Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier of a license file that will be applied on the device.
        /// </summary>
        [Input("licenseFileId")]
        public Input<string>? LicenseFileId { get; set; }

        [Input("licenseToken")]
        private Input<string>? _licenseToken;

        /// <summary>
        /// License Token applicable for some device types in BYOL licensing
        /// mode.
        /// </summary>
        public Input<string>? LicenseToken
        {
            get => _licenseToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _licenseToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Device name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Device unique identifier.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        /// <summary>
        /// Map of vendor specific configuration parameters for a device
        /// (controller1, activationKey, managementType, siteId, systemIpAddress)
        /// * `ssh-key` - (Optional) Definition of SSH key that will be provisioned
        /// on a device (max one key).  See SSH Key below for more details.
        /// </summary>
        [Input("vendorConfiguration")]
        public Input<Inputs.DeviceClusterDetailsNode1VendorConfigurationArgs>? VendorConfiguration { get; set; }

        public DeviceClusterDetailsNode1Args()
        {
        }
        public static new DeviceClusterDetailsNode1Args Empty => new DeviceClusterDetailsNode1Args();
    }
}
