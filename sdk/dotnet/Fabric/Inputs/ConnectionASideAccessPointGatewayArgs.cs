// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionASideAccessPointGatewayArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Connection URI information
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public ConnectionASideAccessPointGatewayArgs()
        {
        }
        public static new ConnectionASideAccessPointGatewayArgs Empty => new ConnectionASideAccessPointGatewayArgs();
    }
}
