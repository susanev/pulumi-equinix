// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Inputs
{

    public sealed class DeviceReinstallGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the OS disk should be filled with `00h` bytes before reinstall.
        /// Defaults to `false`.
        /// </summary>
        [Input("deprovisionFast")]
        public Input<bool>? DeprovisionFast { get; set; }

        /// <summary>
        /// Whether the provider should favour reinstall over destroy and create. Defaults to
        /// `false`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Whether the non-OS disks should be kept or wiped during reinstall.
        /// Defaults to `false`.
        /// </summary>
        [Input("preserveData")]
        public Input<bool>? PreserveData { get; set; }

        public DeviceReinstallGetArgs()
        {
        }
        public static new DeviceReinstallGetArgs Empty => new DeviceReinstallGetArgs();
    }
}
