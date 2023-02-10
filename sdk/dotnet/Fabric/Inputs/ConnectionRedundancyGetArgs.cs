// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionRedundancyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Redundancy group identifier
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// Priority type- PRIMARY, SECONDARY
        /// </summary>
        [Input("priority")]
        public Input<string>? Priority { get; set; }

        public ConnectionRedundancyGetArgs()
        {
        }
        public static new ConnectionRedundancyGetArgs Empty => new ConnectionRedundancyGetArgs();
    }
}
