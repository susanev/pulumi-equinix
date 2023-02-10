// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class GetServiceProfilesSortArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Priority type- DESC, ASC
        /// </summary>
        [Input("direction")]
        public string? Direction { get; set; }

        /// <summary>
        /// Search operation sort criteria /name /state /changeLog/createdDateTime /changeLog/updatedDateTime
        /// </summary>
        [Input("property")]
        public string? Property { get; set; }

        public GetServiceProfilesSortArgs()
        {
        }
        public static new GetServiceProfilesSortArgs Empty => new GetServiceProfilesSortArgs();
    }
}
