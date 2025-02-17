// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionASideAccessPointProfileArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessPointTypeConfigs")]
        private InputList<Inputs.ConnectionASideAccessPointProfileAccessPointTypeConfigArgs>? _accessPointTypeConfigs;
        public InputList<Inputs.ConnectionASideAccessPointProfileAccessPointTypeConfigArgs> AccessPointTypeConfigs
        {
            get => _accessPointTypeConfigs ?? (_accessPointTypeConfigs = new InputList<Inputs.ConnectionASideAccessPointProfileAccessPointTypeConfigArgs>());
            set => _accessPointTypeConfigs = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Connection URI information
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
        /// </summary>
        [Input("type", required: true)]
        public InputUnion<string, Pulumi.Equinix.Fabric.ProfileType> Type { get; set; } = null!;

        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public ConnectionASideAccessPointProfileArgs()
        {
        }
        public static new ConnectionASideAccessPointProfileArgs Empty => new ConnectionASideAccessPointProfileArgs();
    }
}
