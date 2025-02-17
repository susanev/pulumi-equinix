// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Inputs
{

    public sealed class InterconnectionPortArgs : global::Pulumi.ResourceArgs
    {
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("linkStatus")]
        public Input<string>? LinkStatus { get; set; }

        /// <summary>
        /// Name of the connection resource
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// Connection speed - one of 50Mbps, 200Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps.
        /// </summary>
        [Input("speed")]
        public Input<int>? Speed { get; set; }

        /// <summary>
        /// Status of the connection resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("virtualCircuitIds")]
        private InputList<object>? _virtualCircuitIds;
        public InputList<object> VirtualCircuitIds
        {
            get => _virtualCircuitIds ?? (_virtualCircuitIds = new InputList<object>());
            set => _virtualCircuitIds = value;
        }

        public InterconnectionPortArgs()
        {
        }
        public static new InterconnectionPortArgs Empty => new InterconnectionPortArgs();
    }
}
