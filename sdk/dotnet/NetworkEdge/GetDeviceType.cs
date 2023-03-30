// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge
{
    public static class GetDeviceType
    {
        /// <summary>
        /// Use this data source to get Equinix Network Edge device type details. For further details, check supported
        /// [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ciscoRouter = Equinix.NetworkEdge.GetDeviceType.Invoke(new()
        ///     {
        ///         Category = "Router",
        ///         MetroCodes = new[]
        ///         {
        ///             "DC",
        ///             "SV",
        ///         },
        ///         Vendor = "Cisco",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDeviceTypeResult> InvokeAsync(GetDeviceTypeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDeviceTypeResult>("equinix:networkedge/getDeviceType:getDeviceType", args ?? new GetDeviceTypeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get Equinix Network Edge device type details. For further details, check supported
        /// [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ciscoRouter = Equinix.NetworkEdge.GetDeviceType.Invoke(new()
        ///     {
        ///         Category = "Router",
        ///         MetroCodes = new[]
        ///         {
        ///             "DC",
        ///             "SV",
        ///         },
        ///         Vendor = "Cisco",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDeviceTypeResult> Invoke(GetDeviceTypeInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeviceTypeResult>("equinix:networkedge/getDeviceType:getDeviceType", args ?? new GetDeviceTypeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeviceTypeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Device type category. One of: `Router`, `Firewall`, `SDWAN`.
        /// </summary>
        [Input("category")]
        public string? Category { get; set; }

        [Input("metroCodes")]
        private List<string>? _metroCodes;

        /// <summary>
        /// List of metro codes where device type has to be available
        /// </summary>
        public List<string> MetroCodes
        {
            get => _metroCodes ?? (_metroCodes = new List<string>());
            set => _metroCodes = value;
        }

        /// <summary>
        /// Device type name.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
        /// </summary>
        [Input("vendor")]
        public string? Vendor { get; set; }

        public GetDeviceTypeArgs()
        {
        }
        public static new GetDeviceTypeArgs Empty => new GetDeviceTypeArgs();
    }

    public sealed class GetDeviceTypeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Device type category. One of: `Router`, `Firewall`, `SDWAN`.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("metroCodes")]
        private InputList<string>? _metroCodes;

        /// <summary>
        /// List of metro codes where device type has to be available
        /// </summary>
        public InputList<string> MetroCodes
        {
            get => _metroCodes ?? (_metroCodes = new InputList<string>());
            set => _metroCodes = value;
        }

        /// <summary>
        /// Device type name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
        /// </summary>
        [Input("vendor")]
        public Input<string>? Vendor { get; set; }

        public GetDeviceTypeInvokeArgs()
        {
        }
        public static new GetDeviceTypeInvokeArgs Empty => new GetDeviceTypeInvokeArgs();
    }


    [OutputType]
    public sealed class GetDeviceTypeResult
    {
        public readonly string Category;
        /// <summary>
        /// Device type short code, unique identifier of a network device type
        /// </summary>
        public readonly string Code;
        /// <summary>
        /// Device type textual description
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> MetroCodes;
        public readonly string Name;
        public readonly string Vendor;

        [OutputConstructor]
        private GetDeviceTypeResult(
            string category,

            string code,

            string description,

            string id,

            ImmutableArray<string> metroCodes,

            string name,

            string vendor)
        {
            Category = category;
            Code = code;
            Description = description;
            Id = id;
            MetroCodes = metroCodes;
            Name = name;
            Vendor = vendor;
        }
    }
}
