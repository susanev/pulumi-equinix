// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    /// <summary>
    /// Use this resource to request the creation an Interconnection asset to connect with other parties using [Equinix Fabric - software-defined interconnections](https://metal.equinix.com/developers/docs/networking/fabric/).
    /// 
    /// &gt; Equinix Metal connection with with Service Token A-side / Z-side (service_token_type) is not generally available and may not be enabled yet for your organization.
    /// 
    /// ## Example Usage
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var projectId = config.Require("projectId");
    ///     var metro = config.Get("metro") ?? "SV";
    ///     var speedInMbps = config.GetNumber("speedInMbps") ?? 200;
    ///     var connection = new Equinix.Metal.Interconnection("connection", new()
    ///     {
    ///         Name = "fabric-port-to-metal",
    ///         ProjectId = projectId,
    ///         Type = "shared",
    ///         Redundancy = "primary",
    ///         Metro = metro,
    ///         Speed = $"{speedInMbps}Mbps",
    ///         ServiceTokenType = "z_side",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["connectionStatus"] = connection.Status,
    ///         ["connectionTokens"] = connection.ServiceTokens,
    ///     };
    /// });
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:metal/interconnection:Interconnection")]
    public partial class Interconnection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description for the connection resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Facility where the connection will be created.
        /// </summary>
        [Output("facility")]
        public Output<string> Facility { get; private set; } = null!;

        /// <summary>
        /// Metro where the connection will be created.
        /// </summary>
        [Output("metro")]
        public Output<string> Metro { get; private set; } = null!;

        /// <summary>
        /// Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
        /// </summary>
        [Output("mode")]
        public Output<string?> Mode { get; private set; } = null!;

        /// <summary>
        /// Name of the connection resource
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// ID of the organization where the connection is scoped to.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of
        /// port is described in documentation of the
        /// equinix.metal.Interconnection datasource.
        /// </summary>
        [Output("ports")]
        public Output<ImmutableArray<Outputs.InterconnectionPort>> Ports { get; private set; } = null!;

        /// <summary>
        /// ID of the project where the connection is scoped to, must be set for.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Connection redundancy - redundant or primary.
        /// </summary>
        [Output("redundancy")]
        public Output<string> Redundancy { get; private set; } = null!;

        /// <summary>
        /// Only used with shared connection. Type of service token to use for the connection, a_side or z_side
        /// </summary>
        [Output("serviceTokenType")]
        public Output<string?> ServiceTokenType { get; private set; } = null!;

        /// <summary>
        /// List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the equinix_ecx_l2_connection resource or from the [Equinix Fabric Portal](https://ecxfabric.equinix.com/dashboard). Scehma of service_token is described in documentation of the equinix.metal.Interconnection datasource.
        /// </summary>
        [Output("serviceTokens")]
        public Output<ImmutableArray<Outputs.InterconnectionServiceToken>> ServiceTokens { get; private set; } = null!;

        /// <summary>
        /// Connection speed - one of 50Mbps, 200Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps.
        /// </summary>
        [Output("speed")]
        public Output<string> Speed { get; private set; } = null!;

        /// <summary>
        /// Status of the connection resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// String list of tags.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the equinix_ecx_l2_connection resource or from the [Equinix Fabric Portal](https://ecxfabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `service_tokens` instead.
        /// </summary>
        [Output("token")]
        public Output<string> Token { get; private set; } = null!;

        /// <summary>
        /// Connection type - dedicated or shared.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
        /// </summary>
        [Output("vlans")]
        public Output<ImmutableArray<int>> Vlans { get; private set; } = null!;


        /// <summary>
        /// Create a Interconnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Interconnection(string name, InterconnectionArgs args, CustomResourceOptions? options = null)
            : base("equinix:metal/interconnection:Interconnection", name, args ?? new InterconnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Interconnection(string name, Input<string> id, InterconnectionState? state = null, CustomResourceOptions? options = null)
            : base("equinix:metal/interconnection:Interconnection", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/equinix/pulumi-equinix/releases/download/0.0.1-alpha.1680197579+b252741a.dirty",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Interconnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Interconnection Get(string name, Input<string> id, InterconnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new Interconnection(name, id, state, options);
        }
    }

    public sealed class InterconnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description for the connection resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Facility where the connection will be created.
        /// </summary>
        [Input("facility")]
        public Input<string>? Facility { get; set; }

        /// <summary>
        /// Metro where the connection will be created.
        /// </summary>
        [Input("metro")]
        public Input<string>? Metro { get; set; }

        /// <summary>
        /// Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// Name of the connection resource
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the organization where the connection is scoped to.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// ID of the project where the connection is scoped to, must be set for.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Connection redundancy - redundant or primary.
        /// </summary>
        [Input("redundancy", required: true)]
        public Input<string> Redundancy { get; set; } = null!;

        /// <summary>
        /// Only used with shared connection. Type of service token to use for the connection, a_side or z_side
        /// </summary>
        [Input("serviceTokenType")]
        public Input<string>? ServiceTokenType { get; set; }

        /// <summary>
        /// Connection speed - one of 50Mbps, 200Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps.
        /// </summary>
        [Input("speed", required: true)]
        public Input<string> Speed { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// String list of tags.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Connection type - dedicated or shared.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("vlans")]
        private InputList<int>? _vlans;

        /// <summary>
        /// Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
        /// </summary>
        public InputList<int> Vlans
        {
            get => _vlans ?? (_vlans = new InputList<int>());
            set => _vlans = value;
        }

        public InterconnectionArgs()
        {
        }
        public static new InterconnectionArgs Empty => new InterconnectionArgs();
    }

    public sealed class InterconnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description for the connection resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Facility where the connection will be created.
        /// </summary>
        [Input("facility")]
        public Input<string>? Facility { get; set; }

        /// <summary>
        /// Metro where the connection will be created.
        /// </summary>
        [Input("metro")]
        public Input<string>? Metro { get; set; }

        /// <summary>
        /// Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// Name of the connection resource
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the organization where the connection is scoped to.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        [Input("ports")]
        private InputList<Inputs.InterconnectionPortGetArgs>? _ports;

        /// <summary>
        /// List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of
        /// port is described in documentation of the
        /// equinix.metal.Interconnection datasource.
        /// </summary>
        public InputList<Inputs.InterconnectionPortGetArgs> Ports
        {
            get => _ports ?? (_ports = new InputList<Inputs.InterconnectionPortGetArgs>());
            set => _ports = value;
        }

        /// <summary>
        /// ID of the project where the connection is scoped to, must be set for.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Connection redundancy - redundant or primary.
        /// </summary>
        [Input("redundancy")]
        public Input<string>? Redundancy { get; set; }

        /// <summary>
        /// Only used with shared connection. Type of service token to use for the connection, a_side or z_side
        /// </summary>
        [Input("serviceTokenType")]
        public Input<string>? ServiceTokenType { get; set; }

        [Input("serviceTokens")]
        private InputList<Inputs.InterconnectionServiceTokenGetArgs>? _serviceTokens;

        /// <summary>
        /// List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the equinix_ecx_l2_connection resource or from the [Equinix Fabric Portal](https://ecxfabric.equinix.com/dashboard). Scehma of service_token is described in documentation of the equinix.metal.Interconnection datasource.
        /// </summary>
        public InputList<Inputs.InterconnectionServiceTokenGetArgs> ServiceTokens
        {
            get => _serviceTokens ?? (_serviceTokens = new InputList<Inputs.InterconnectionServiceTokenGetArgs>());
            set => _serviceTokens = value;
        }

        /// <summary>
        /// Connection speed - one of 50Mbps, 200Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps.
        /// </summary>
        [Input("speed")]
        public Input<string>? Speed { get; set; }

        /// <summary>
        /// Status of the connection resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// String list of tags.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the equinix_ecx_l2_connection resource or from the [Equinix Fabric Portal](https://ecxfabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `service_tokens` instead.
        /// </summary>
        [Input("token")]
        public Input<string>? Token { get; set; }

        /// <summary>
        /// Connection type - dedicated or shared.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("vlans")]
        private InputList<int>? _vlans;

        /// <summary>
        /// Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
        /// </summary>
        public InputList<int> Vlans
        {
            get => _vlans ?? (_vlans = new InputList<int>());
            set => _vlans = value;
        }

        public InterconnectionState()
        {
        }
        public static new InterconnectionState Empty => new InterconnectionState();
    }
}
