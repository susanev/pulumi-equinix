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
    /// ## Import
    /// 
    /// This resource can be imported using an existing project ID
    /// 
    /// ```sh
    ///  $ pulumi import equinix:metal/project:Project equinix_metal_project {existing_project_id}
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:metal/project:Project")]
    public partial class Project : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
        /// </summary>
        [Output("backendTransfer")]
        public Output<bool?> BackendTransfer { get; private set; } = null!;

        /// <summary>
        /// Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
        /// </summary>
        [Output("bgpConfig")]
        public Output<Outputs.ProjectBgpConfig?> BgpConfig { get; private set; } = null!;

        /// <summary>
        /// The timestamp for when the project was created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// The name of the project.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The UUID of organization under which you want to create the project. If you
        /// leave it out, the project will be create under your the default organization of your account.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// The UUID of payment method for this project. The payment method and the
        /// project need to belong to the same organization (passed with `organization_id`, or default).
        /// </summary>
        [Output("paymentMethodId")]
        public Output<string> PaymentMethodId { get; private set; } = null!;

        /// <summary>
        /// The timestamp for the last time the project was updated.
        /// </summary>
        [Output("updated")]
        public Output<string> Updated { get; private set; } = null!;


        /// <summary>
        /// Create a Project resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Project(string name, ProjectArgs? args = null, CustomResourceOptions? options = null)
            : base("equinix:metal/project:Project", name, args ?? new ProjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Project(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
            : base("equinix:metal/project:Project", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/equinix/pulumi-equinix",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Project resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Project Get(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
        {
            return new Project(name, id, state, options);
        }
    }

    public sealed class ProjectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
        /// </summary>
        [Input("backendTransfer")]
        public Input<bool>? BackendTransfer { get; set; }

        /// <summary>
        /// Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
        /// </summary>
        [Input("bgpConfig")]
        public Input<Inputs.ProjectBgpConfigArgs>? BgpConfig { get; set; }

        /// <summary>
        /// The name of the project.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The UUID of organization under which you want to create the project. If you
        /// leave it out, the project will be create under your the default organization of your account.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// The UUID of payment method for this project. The payment method and the
        /// project need to belong to the same organization (passed with `organization_id`, or default).
        /// </summary>
        [Input("paymentMethodId")]
        public Input<string>? PaymentMethodId { get; set; }

        public ProjectArgs()
        {
        }
        public static new ProjectArgs Empty => new ProjectArgs();
    }

    public sealed class ProjectState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
        /// </summary>
        [Input("backendTransfer")]
        public Input<bool>? BackendTransfer { get; set; }

        /// <summary>
        /// Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
        /// </summary>
        [Input("bgpConfig")]
        public Input<Inputs.ProjectBgpConfigGetArgs>? BgpConfig { get; set; }

        /// <summary>
        /// The timestamp for when the project was created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// The name of the project.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The UUID of organization under which you want to create the project. If you
        /// leave it out, the project will be create under your the default organization of your account.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// The UUID of payment method for this project. The payment method and the
        /// project need to belong to the same organization (passed with `organization_id`, or default).
        /// </summary>
        [Input("paymentMethodId")]
        public Input<string>? PaymentMethodId { get; set; }

        /// <summary>
        /// The timestamp for the last time the project was updated.
        /// </summary>
        [Input("updated")]
        public Input<string>? Updated { get; set; }

        public ProjectState()
        {
        }
        public static new ProjectState Empty => new ProjectState();
    }
}
