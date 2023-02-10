// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionASideAdditionalInfoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Additional information key
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Additional information value
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ConnectionASideAdditionalInfoArgs()
        {
        }
        public static new ConnectionASideAdditionalInfoArgs Empty => new ConnectionASideAdditionalInfoArgs();
    }
}
