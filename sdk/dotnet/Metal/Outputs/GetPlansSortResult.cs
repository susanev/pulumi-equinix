// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Outputs
{

    [OutputType]
    public sealed class GetPlansSortResult
    {
        /// <summary>
        /// The attribute used to filter. Filter attributes are case-sensitive
        /// </summary>
        public readonly string Attribute;
        /// <summary>
        /// Sort results in ascending or descending order. Strings are sorted in alphabetical order. One of: asc, desc
        /// </summary>
        public readonly string? Direction;

        [OutputConstructor]
        private GetPlansSortResult(
            string attribute,

            string? direction)
        {
            Attribute = attribute;
            Direction = direction;
        }
    }
}
