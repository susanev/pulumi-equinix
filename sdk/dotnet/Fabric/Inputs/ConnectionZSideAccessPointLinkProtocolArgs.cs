// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionZSideAccessPointLinkProtocolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("vlanCTag")]
        public Input<int>? VlanCTag { get; set; }

        [Input("vlanSTag")]
        public Input<int>? VlanSTag { get; set; }

        [Input("vlanTag")]
        public Input<int>? VlanTag { get; set; }

        public ConnectionZSideAccessPointLinkProtocolArgs()
        {
        }
        public static new ConnectionZSideAccessPointLinkProtocolArgs Empty => new ConnectionZSideAccessPointLinkProtocolArgs();
    }
}
