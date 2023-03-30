// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionZSideAccessPointVirtualDeviceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Connection URI information
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public ConnectionZSideAccessPointVirtualDeviceGetArgs()
        {
        }
        public static new ConnectionZSideAccessPointVirtualDeviceGetArgs Empty => new ConnectionZSideAccessPointVirtualDeviceGetArgs();
    }
}
