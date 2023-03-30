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
    /// Use this resource to create Metal Project API Key resources in Equinix Metal. Project API keys can
    /// be used to create and read resources in a single project. Each API key contains a token which can
    /// be used for authentication in Equinix Metal HTTP API (in HTTP request header `X-Auth-Token`).
    /// 
    /// Read-only keys only allow to list and view existing resources, read-write keys can also be used to
    /// create resources.
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
    ///     var readOnly = config.GetBoolean("readOnly") ?? false;
    ///     var apiKey = new Equinix.Metal.ProjectApiKey("apiKey", new()
    ///     {
    ///         ProjectId = projectId,
    ///         Description = "A project level API Key",
    ///         ReadOnly = readOnly,
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["apiKeyToken"] = apiKey.Token,
    ///     };
    /// });
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:metal/projectApiKey:ProjectApiKey")]
    public partial class ProjectApiKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description string for the Project API Key resource.
        /// * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// UUID of the project where the API key is scoped to.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Flag indicating whether the API key shoud be read-only
        /// </summary>
        [Output("readOnly")]
        public Output<bool> ReadOnly { get; private set; } = null!;

        /// <summary>
        /// API token which can be used in Equinix Metal API clients
        /// </summary>
        [Output("token")]
        public Output<string> Token { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectApiKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectApiKey(string name, ProjectApiKeyArgs args, CustomResourceOptions? options = null)
            : base("equinix:metal/projectApiKey:ProjectApiKey", name, args ?? new ProjectApiKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProjectApiKey(string name, Input<string> id, ProjectApiKeyState? state = null, CustomResourceOptions? options = null)
            : base("equinix:metal/projectApiKey:ProjectApiKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/equinix/pulumi-equinix/releases/download/0.0.1-alpha.1680197579+b252741a.dirty",
                AdditionalSecretOutputs =
                {
                    "token",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ProjectApiKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectApiKey Get(string name, Input<string> id, ProjectApiKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectApiKey(name, id, state, options);
        }
    }

    public sealed class ProjectApiKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description string for the Project API Key resource.
        /// * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// UUID of the project where the API key is scoped to.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Flag indicating whether the API key shoud be read-only
        /// </summary>
        [Input("readOnly", required: true)]
        public Input<bool> ReadOnly { get; set; } = null!;

        public ProjectApiKeyArgs()
        {
        }
        public static new ProjectApiKeyArgs Empty => new ProjectApiKeyArgs();
    }

    public sealed class ProjectApiKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description string for the Project API Key resource.
        /// * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// UUID of the project where the API key is scoped to.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Flag indicating whether the API key shoud be read-only
        /// </summary>
        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// API token which can be used in Equinix Metal API clients
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ProjectApiKeyState()
        {
        }
        public static new ProjectApiKeyState Empty => new ProjectApiKeyState();
    }
}
