// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge.Inputs
{

    public sealed class DeviceLinkLinkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// billing account number to be used for
        /// connection charges
        /// </summary>
        [Input("accountNumber", required: true)]
        public Input<string> AccountNumber { get; set; } = null!;

        /// <summary>
        /// connection destination metro code.
        /// </summary>
        [Input("dstMetroCode", required: true)]
        public Input<string> DstMetroCode { get; set; } = null!;

        /// <summary>
        /// connection destination zone code is not required.
        /// </summary>
        [Input("dstZoneCode")]
        public Input<string>? DstZoneCode { get; set; }

        /// <summary>
        /// connection source metro code.
        /// </summary>
        [Input("srcMetroCode", required: true)]
        public Input<string> SrcMetroCode { get; set; } = null!;

        /// <summary>
        /// connection source zone code is not required.
        /// </summary>
        [Input("srcZoneCode")]
        public Input<string>? SrcZoneCode { get; set; }

        /// <summary>
        /// connection throughput.
        /// </summary>
        [Input("throughput", required: true)]
        public Input<string> Throughput { get; set; } = null!;

        /// <summary>
        /// connection throughput unit (Mbps or Gbps).
        /// </summary>
        [Input("throughputUnit", required: true)]
        public Input<string> ThroughputUnit { get; set; } = null!;

        public DeviceLinkLinkArgs()
        {
        }
        public static new DeviceLinkLinkArgs Empty => new DeviceLinkLinkArgs();
    }
}
