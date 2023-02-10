// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class GetConnectionProjectInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique Resource URL
        /// </summary>
        [Input("href", required: true)]
        public Input<string> Href { get; set; } = null!;

        /// <summary>
        /// Project Id
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetConnectionProjectInputArgs()
        {
        }
        public static new GetConnectionProjectInputArgs Empty => new GetConnectionProjectInputArgs();
    }
}
