// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge.Inputs
{

    public sealed class DeviceInterfaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// interface management type (Equinix Managed or empty).
        /// </summary>
        [Input("assignedType")]
        public Input<string>? AssignedType { get; set; }

        /// <summary>
        /// interface identifier.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// interface IP address.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// interface MAC address.
        /// </summary>
        [Input("macAddress")]
        public Input<string>? MacAddress { get; set; }

        /// <summary>
        /// Device name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// interface operational status. One of `up`, `down`.
        /// </summary>
        [Input("operationalStatus")]
        public Input<string>? OperationalStatus { get; set; }

        /// <summary>
        /// interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// interface type.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DeviceInterfaceArgs()
        {
        }
        public static new DeviceInterfaceArgs Empty => new DeviceInterfaceArgs();
    }
}
