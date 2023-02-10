// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Outputs
{

    [OutputType]
    public sealed class GetPortsDataLocationResult
    {
        public readonly string Href;
        public readonly string Ibx;
        public readonly string MetroCode;
        public readonly string MetroName;
        public readonly string Region;

        [OutputConstructor]
        private GetPortsDataLocationResult(
            string href,

            string ibx,

            string metroCode,

            string metroName,

            string region)
        {
            Href = href;
            Ibx = ibx;
            MetroCode = metroCode;
            MetroName = metroName;
            Region = region;
        }
    }
}
