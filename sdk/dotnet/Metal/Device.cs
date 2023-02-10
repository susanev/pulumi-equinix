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
    /// Provides an Equinix Metal device resource. This can be used to create,
    /// modify, and delete devices.
    /// 
    /// &gt; **NOTE:** All arguments including the `root_password` and `user_data` will be stored in
    ///  the raw state as plain-text.
    /// [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
    /// 
    /// ## Example Usage
    /// 
    /// Create a device and add it to cool_project
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var web1 = new Equinix.Metal.Device("web1", new()
    ///     {
    ///         Hostname = "tf.coreos2",
    ///         Plan = "c3.small.x86",
    ///         Metro = "sv",
    ///         OperatingSystem = "ubuntu_20_04",
    ///         BillingCycle = "hourly",
    ///         ProjectId = local.Project_id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Same as above, but boot via iPXE initially, using the Ignition Provider for provisioning
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var pxe1 = new Equinix.Metal.Device("pxe1", new()
    ///     {
    ///         Hostname = "tf.coreos2-pxe",
    ///         Plan = "c3.small.x86",
    ///         Metro = "sv",
    ///         OperatingSystem = "custom_ipxe",
    ///         BillingCycle = "hourly",
    ///         ProjectId = local.Project_id,
    ///         IpxeScriptUrl = "https://rawgit.com/cloudnativelabs/pxe/master/metal/coreos-stable-metal.ipxe",
    ///         AlwaysPxe = false,
    ///         UserData = data.Ignition_config.Example.Rendered,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Create a device without a public IP address in facility ny5, with only a /30 private IPv4 subnet (4 IP addresses)
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var web1 = new Equinix.Metal.Device("web1", new()
    ///     {
    ///         Hostname = "tf.coreos2",
    ///         Plan = "c3.small.x86",
    ///         Facilities = new[]
    ///         {
    ///             "ny5",
    ///         },
    ///         OperatingSystem = "ubuntu_20_04",
    ///         BillingCycle = "hourly",
    ///         ProjectId = local.Project_id,
    ///         IpAddresses = new[]
    ///         {
    ///             new Equinix.Metal.Inputs.DeviceIpAddressArgs
    ///             {
    ///                 Type = "private_ipv4",
    ///                 Cidr = 30,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Deploy device on next-available reserved hardware and do custom partitioning.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var web1 = new Equinix.Metal.Device("web1", new()
    ///     {
    ///         Hostname = "tftest",
    ///         Plan = "c3.small.x86",
    ///         Facilities = new[]
    ///         {
    ///             "ny5",
    ///         },
    ///         OperatingSystem = "ubuntu_20_04",
    ///         BillingCycle = "hourly",
    ///         ProjectId = local.Project_id,
    ///         HardwareReservationId = "next-available",
    ///         Storage = @"{
    ///   ""disks"": [
    ///     {
    ///       ""device"": ""/dev/sda"",
    ///       ""wipeTable"": true,
    ///       ""partitions"": [
    ///         {
    ///           ""label"": ""BIOS"",
    ///           ""number"": 1,
    ///           ""size"": ""4096""
    ///         },
    ///         {
    ///           ""label"": ""SWAP"",
    ///           ""number"": 2,
    ///           ""size"": ""3993600""
    ///         },
    ///         {
    ///           ""label"": ""ROOT"",
    ///           ""number"": 3,
    ///           ""size"": ""0""
    ///         }
    ///       ]
    ///     }
    ///   ],
    ///   ""filesystems"": [
    ///     {
    ///       ""mount"": {
    ///         ""device"": ""/dev/sda3"",
    ///         ""format"": ""ext4"",
    ///         ""point"": ""/"",
    ///         ""create"": {
    ///           ""options"": [
    ///             ""-L"",
    ///             ""ROOT""
    ///           ]
    ///         }
    ///       }
    ///     },
    ///     {
    ///       ""mount"": {
    ///         ""device"": ""/dev/sda2"",
    ///         ""format"": ""swap"",
    ///         ""point"": ""none"",
    ///         ""create"": {
    ///           ""options"": [
    ///             ""-L"",
    ///             ""SWAP""
    ///           ]
    ///         }
    ///       }
    ///     }
    ///   ]
    /// }
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using an existing device ID
    /// 
    /// ```sh
    ///  $ pulumi import equinix:metal/device:Device equinix_metal_device {existing_device_id}
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:metal/device:Device")]
    public partial class Device : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ipv4 private IP assigned to the device.
        /// </summary>
        [Output("accessPrivateIpv4")]
        public Output<string> AccessPrivateIpv4 { get; private set; } = null!;

        /// <summary>
        /// The ipv4 maintenance IP assigned to the device.
        /// </summary>
        [Output("accessPublicIpv4")]
        public Output<string> AccessPublicIpv4 { get; private set; } = null!;

        /// <summary>
        /// The ipv6 maintenance IP assigned to the device.
        /// </summary>
        [Output("accessPublicIpv6")]
        public Output<string> AccessPublicIpv6 { get; private set; } = null!;

        /// <summary>
        /// If true, a device with OS `custom_ipxe` will continue to boot via iPXE
        /// on reboots.
        /// </summary>
        [Output("alwaysPxe")]
        public Output<bool?> AlwaysPxe { get; private set; } = null!;

        /// <summary>
        /// monthly or hourly
        /// </summary>
        [Output("billingCycle")]
        public Output<string> BillingCycle { get; private set; } = null!;

        /// <summary>
        /// The timestamp for when the device was created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// A string of the desired Custom Data for the device.
        /// </summary>
        [Output("customData")]
        public Output<string?> CustomData { get; private set; } = null!;

        /// <summary>
        /// The facility where the device is deployed.
        /// </summary>
        [Output("deployedFacility")]
        public Output<string> DeployedFacility { get; private set; } = null!;

        /// <summary>
        /// ID of hardware reservation where this device was deployed.
        /// It is useful when using the `next-available` hardware reservation.
        /// </summary>
        [Output("deployedHardwareReservationId")]
        public Output<string> DeployedHardwareReservationId { get; private set; } = null!;

        /// <summary>
        /// The device description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// List of facility codes with deployment preferences. Equinix Metal API will go
        /// through the list and will deploy your device to first facility with free capacity. List items must
        /// be facility codes or `any` (a wildcard). To find the facility code, visit
        /// [Facilities API docs](https://metal.equinix.com/developers/api/facilities/), set your API auth
        /// token in the top of the page and see JSON from the API response. Conflicts with `metro`.
        /// </summary>
        [Output("facilities")]
        public Output<ImmutableArray<string>> Facilities { get; private set; } = null!;

        /// <summary>
        /// Delete device even if it has volumes attached. Only applies
        /// for destroy action.
        /// </summary>
        [Output("forceDetachVolumes")]
        public Output<bool?> ForceDetachVolumes { get; private set; } = null!;

        /// <summary>
        /// The UUID of the hardware reservation where you want this device deployed, or next-available if you want to pick your
        /// next available reservation automatically
        /// </summary>
        [Output("hardwareReservationId")]
        public Output<string?> HardwareReservationId { get; private set; } = null!;

        /// <summary>
        /// The device hostname used in deployments taking advantage of Layer3 DHCP
        /// or metadata service configuration.
        /// </summary>
        [Output("hostname")]
        public Output<string> Hostname { get; private set; } = null!;

        /// <summary>
        /// A list of IP address types for the device. See
        /// IP address below for more details.
        /// </summary>
        [Output("ipAddresses")]
        public Output<ImmutableArray<Outputs.DeviceIpAddress>> IpAddresses { get; private set; } = null!;

        /// <summary>
        /// URL pointing to a hosted iPXE script. More information is in the
        /// [Custom iPXE](https://metal.equinix.com/developers/docs/servers/custom-ipxe/) doc.
        /// </summary>
        [Output("ipxeScriptUrl")]
        public Output<string?> IpxeScriptUrl { get; private set; } = null!;

        /// <summary>
        /// Whether the device is locked.
        /// </summary>
        [Output("locked")]
        public Output<bool> Locked { get; private set; } = null!;

        /// <summary>
        /// Metro area for the new device. Conflicts with `facilities`.
        /// </summary>
        [Output("metro")]
        public Output<string?> Metro { get; private set; } = null!;

        /// <summary>
        /// (Deprecated) Network type of a device, used in
        /// [Layer 2 networking](https://metal.equinix.com/developers/docs/networking/layer2/). Since this
        /// attribute is deprecated you should handle Network Type with one of
        /// equinix_metal_port,
        /// equinix.metal.DeviceNetworkType resources or
        /// equinix.metal.Port datasource.
        /// See network_types guide for more info.
        /// </summary>
        [Output("networkType")]
        public Output<string> NetworkType { get; private set; } = null!;

        /// <summary>
        /// The device's private and public IP (v4 and v6) network details. See
        /// Network Attribute below for more details.
        /// </summary>
        [Output("networks")]
        public Output<ImmutableArray<Outputs.DeviceNetwork>> Networks { get; private set; } = null!;

        /// <summary>
        /// The operating system slug. To find the slug, or visit
        /// [Operating Systems API docs](https://metal.equinix.com/developers/api/operatingsystems), set your
        /// API auth token in the top of the page and see JSON from the API response.
        /// </summary>
        [Output("operatingSystem")]
        public Output<string> OperatingSystem { get; private set; } = null!;

        /// <summary>
        /// The device plan slug. To find the plan slug, visit
        /// [Device plans API docs](https://metal.equinix.com/developers/api/plans), set your auth token in the
        /// top of the page and see JSON from the API response.
        /// </summary>
        [Output("plan")]
        public Output<string> Plan { get; private set; } = null!;

        /// <summary>
        /// List of ports assigned to the device. See Ports Attribute below for
        /// more details.
        /// </summary>
        [Output("ports")]
        public Output<ImmutableArray<Outputs.DevicePort>> Ports { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which to create the device
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Array of IDs of the project SSH keys which should be added to the device.
        /// If you omit this, SSH keys of all the members of the parent project will be added to the device. If
        /// you specify this array, only the listed project SSH keys will be added. Project SSH keys can be
        /// created with the equinix.metal.ProjectSshKey resource.
        /// </summary>
        [Output("projectSshKeyIds")]
        public Output<ImmutableArray<string>> ProjectSshKeyIds { get; private set; } = null!;

        /// <summary>
        /// Whether the device should be reinstalled instead of destroyed when
        /// modifying user_data, custom_data, or operating system. See Reinstall below for more
        /// details.
        /// </summary>
        [Output("reinstall")]
        public Output<Outputs.DeviceReinstall?> Reinstall { get; private set; } = null!;

        /// <summary>
        /// Root password to the server (disabled after 24 hours).
        /// </summary>
        [Output("rootPassword")]
        public Output<string> RootPassword { get; private set; } = null!;

        /// <summary>
        /// List of IDs of SSH keys deployed in the device, can be both user and project SSH keys.
        /// </summary>
        [Output("sshKeyIds")]
        public Output<ImmutableArray<string>> SshKeyIds { get; private set; } = null!;

        /// <summary>
        /// The status of the device.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// JSON for custom partitioning. Only usable on reserved hardware. More
        /// information in in the
        /// [Custom Partitioning and RAID](https://metal.equinix.com/developers/docs/servers/custom-partitioning-raid/)
        /// doc. Please note that the disks.partitions.size attribute must be a string, not an integer. It can
        /// be a number string, or size notation string, e.g. "4G" or "8M" (for gigabytes and megabytes).
        /// </summary>
        [Output("storage")]
        public Output<string?> Storage { get; private set; } = null!;

        /// <summary>
        /// Tags attached to the device.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Timestamp for device termination. For example `2021-09-03T16:32:00+03:00`.
        /// If you don't supply timezone info, timestamp is assumed to be in UTC.
        /// </summary>
        [Output("terminationTime")]
        public Output<string?> TerminationTime { get; private set; } = null!;

        /// <summary>
        /// The timestamp for the last time the device was updated.
        /// </summary>
        [Output("updated")]
        public Output<string> Updated { get; private set; } = null!;

        /// <summary>
        /// A string of the desired User Data for the device.
        /// </summary>
        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;

        /// <summary>
        /// Array of IDs of the user SSH keys which should be added to the device. If you omit this, SSH keys of all the members of the parent project will be added to the device. If you specify this array, only the listed user SSH keys (and any project_ssh_key_ids) will be added. User SSH keys can be created with the equinix.metal.SshKey resource
        /// </summary>
        [Output("userSshKeyIds")]
        public Output<ImmutableArray<string>> UserSshKeyIds { get; private set; } = null!;

        /// <summary>
        /// Only used for devices in reserved hardware. If
        /// set, the deletion of this device will block until the hardware reservation is marked provisionable
        /// (about 4 minutes in August 2019).
        /// </summary>
        [Output("waitForReservationDeprovision")]
        public Output<bool?> WaitForReservationDeprovision { get; private set; } = null!;


        /// <summary>
        /// Create a Device resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Device(string name, DeviceArgs args, CustomResourceOptions? options = null)
            : base("equinix:metal/device:Device", name, args ?? new DeviceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Device(string name, Input<string> id, DeviceState? state = null, CustomResourceOptions? options = null)
            : base("equinix:metal/device:Device", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Device resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Device Get(string name, Input<string> id, DeviceState? state = null, CustomResourceOptions? options = null)
        {
            return new Device(name, id, state, options);
        }
    }

    public sealed class DeviceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, a device with OS `custom_ipxe` will continue to boot via iPXE
        /// on reboots.
        /// </summary>
        [Input("alwaysPxe")]
        public Input<bool>? AlwaysPxe { get; set; }

        /// <summary>
        /// monthly or hourly
        /// </summary>
        [Input("billingCycle")]
        public InputUnion<string, Pulumi.Equinix.Metal.BillingCycle>? BillingCycle { get; set; }

        /// <summary>
        /// A string of the desired Custom Data for the device.
        /// </summary>
        [Input("customData")]
        public Input<string>? CustomData { get; set; }

        /// <summary>
        /// The device description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("facilities")]
        private InputList<Union<string, Pulumi.Equinix.Metal.Facility>>? _facilities;

        /// <summary>
        /// List of facility codes with deployment preferences. Equinix Metal API will go
        /// through the list and will deploy your device to first facility with free capacity. List items must
        /// be facility codes or `any` (a wildcard). To find the facility code, visit
        /// [Facilities API docs](https://metal.equinix.com/developers/api/facilities/), set your API auth
        /// token in the top of the page and see JSON from the API response. Conflicts with `metro`.
        /// </summary>
        public InputList<Union<string, Pulumi.Equinix.Metal.Facility>> Facilities
        {
            get => _facilities ?? (_facilities = new InputList<Union<string, Pulumi.Equinix.Metal.Facility>>());
            set => _facilities = value;
        }

        /// <summary>
        /// Delete device even if it has volumes attached. Only applies
        /// for destroy action.
        /// </summary>
        [Input("forceDetachVolumes")]
        public Input<bool>? ForceDetachVolumes { get; set; }

        /// <summary>
        /// The UUID of the hardware reservation where you want this device deployed, or next-available if you want to pick your
        /// next available reservation automatically
        /// </summary>
        [Input("hardwareReservationId")]
        public Input<string>? HardwareReservationId { get; set; }

        /// <summary>
        /// The device hostname used in deployments taking advantage of Layer3 DHCP
        /// or metadata service configuration.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        [Input("ipAddresses")]
        private InputList<Inputs.DeviceIpAddressArgs>? _ipAddresses;

        /// <summary>
        /// A list of IP address types for the device. See
        /// IP address below for more details.
        /// </summary>
        public InputList<Inputs.DeviceIpAddressArgs> IpAddresses
        {
            get => _ipAddresses ?? (_ipAddresses = new InputList<Inputs.DeviceIpAddressArgs>());
            set => _ipAddresses = value;
        }

        /// <summary>
        /// URL pointing to a hosted iPXE script. More information is in the
        /// [Custom iPXE](https://metal.equinix.com/developers/docs/servers/custom-ipxe/) doc.
        /// </summary>
        [Input("ipxeScriptUrl")]
        public Input<string>? IpxeScriptUrl { get; set; }

        /// <summary>
        /// Metro area for the new device. Conflicts with `facilities`.
        /// </summary>
        [Input("metro")]
        public Input<string>? Metro { get; set; }

        /// <summary>
        /// The operating system slug. To find the slug, or visit
        /// [Operating Systems API docs](https://metal.equinix.com/developers/api/operatingsystems), set your
        /// API auth token in the top of the page and see JSON from the API response.
        /// </summary>
        [Input("operatingSystem", required: true)]
        public InputUnion<string, Pulumi.Equinix.Metal.OperatingSystem> OperatingSystem { get; set; } = null!;

        /// <summary>
        /// The device plan slug. To find the plan slug, visit
        /// [Device plans API docs](https://metal.equinix.com/developers/api/plans), set your auth token in the
        /// top of the page and see JSON from the API response.
        /// </summary>
        [Input("plan", required: true)]
        public InputUnion<string, Pulumi.Equinix.Metal.Plan> Plan { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which to create the device
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("projectSshKeyIds")]
        private InputList<string>? _projectSshKeyIds;

        /// <summary>
        /// Array of IDs of the project SSH keys which should be added to the device.
        /// If you omit this, SSH keys of all the members of the parent project will be added to the device. If
        /// you specify this array, only the listed project SSH keys will be added. Project SSH keys can be
        /// created with the equinix.metal.ProjectSshKey resource.
        /// </summary>
        public InputList<string> ProjectSshKeyIds
        {
            get => _projectSshKeyIds ?? (_projectSshKeyIds = new InputList<string>());
            set => _projectSshKeyIds = value;
        }

        /// <summary>
        /// Whether the device should be reinstalled instead of destroyed when
        /// modifying user_data, custom_data, or operating system. See Reinstall below for more
        /// details.
        /// </summary>
        [Input("reinstall")]
        public Input<Inputs.DeviceReinstallArgs>? Reinstall { get; set; }

        /// <summary>
        /// JSON for custom partitioning. Only usable on reserved hardware. More
        /// information in in the
        /// [Custom Partitioning and RAID](https://metal.equinix.com/developers/docs/servers/custom-partitioning-raid/)
        /// doc. Please note that the disks.partitions.size attribute must be a string, not an integer. It can
        /// be a number string, or size notation string, e.g. "4G" or "8M" (for gigabytes and megabytes).
        /// </summary>
        [Input("storage")]
        public Input<string>? Storage { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags attached to the device.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Timestamp for device termination. For example `2021-09-03T16:32:00+03:00`.
        /// If you don't supply timezone info, timestamp is assumed to be in UTC.
        /// </summary>
        [Input("terminationTime")]
        public Input<string>? TerminationTime { get; set; }

        /// <summary>
        /// A string of the desired User Data for the device.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        [Input("userSshKeyIds")]
        private InputList<string>? _userSshKeyIds;

        /// <summary>
        /// Array of IDs of the user SSH keys which should be added to the device. If you omit this, SSH keys of all the members of the parent project will be added to the device. If you specify this array, only the listed user SSH keys (and any project_ssh_key_ids) will be added. User SSH keys can be created with the equinix.metal.SshKey resource
        /// </summary>
        public InputList<string> UserSshKeyIds
        {
            get => _userSshKeyIds ?? (_userSshKeyIds = new InputList<string>());
            set => _userSshKeyIds = value;
        }

        /// <summary>
        /// Only used for devices in reserved hardware. If
        /// set, the deletion of this device will block until the hardware reservation is marked provisionable
        /// (about 4 minutes in August 2019).
        /// </summary>
        [Input("waitForReservationDeprovision")]
        public Input<bool>? WaitForReservationDeprovision { get; set; }

        public DeviceArgs()
        {
        }
        public static new DeviceArgs Empty => new DeviceArgs();
    }

    public sealed class DeviceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ipv4 private IP assigned to the device.
        /// </summary>
        [Input("accessPrivateIpv4")]
        public Input<string>? AccessPrivateIpv4 { get; set; }

        /// <summary>
        /// The ipv4 maintenance IP assigned to the device.
        /// </summary>
        [Input("accessPublicIpv4")]
        public Input<string>? AccessPublicIpv4 { get; set; }

        /// <summary>
        /// The ipv6 maintenance IP assigned to the device.
        /// </summary>
        [Input("accessPublicIpv6")]
        public Input<string>? AccessPublicIpv6 { get; set; }

        /// <summary>
        /// If true, a device with OS `custom_ipxe` will continue to boot via iPXE
        /// on reboots.
        /// </summary>
        [Input("alwaysPxe")]
        public Input<bool>? AlwaysPxe { get; set; }

        /// <summary>
        /// monthly or hourly
        /// </summary>
        [Input("billingCycle")]
        public InputUnion<string, Pulumi.Equinix.Metal.BillingCycle>? BillingCycle { get; set; }

        /// <summary>
        /// The timestamp for when the device was created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// A string of the desired Custom Data for the device.
        /// </summary>
        [Input("customData")]
        public Input<string>? CustomData { get; set; }

        /// <summary>
        /// The facility where the device is deployed.
        /// </summary>
        [Input("deployedFacility")]
        public Input<string>? DeployedFacility { get; set; }

        /// <summary>
        /// ID of hardware reservation where this device was deployed.
        /// It is useful when using the `next-available` hardware reservation.
        /// </summary>
        [Input("deployedHardwareReservationId")]
        public Input<string>? DeployedHardwareReservationId { get; set; }

        /// <summary>
        /// The device description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("facilities")]
        private InputList<Union<string, Pulumi.Equinix.Metal.Facility>>? _facilities;

        /// <summary>
        /// List of facility codes with deployment preferences. Equinix Metal API will go
        /// through the list and will deploy your device to first facility with free capacity. List items must
        /// be facility codes or `any` (a wildcard). To find the facility code, visit
        /// [Facilities API docs](https://metal.equinix.com/developers/api/facilities/), set your API auth
        /// token in the top of the page and see JSON from the API response. Conflicts with `metro`.
        /// </summary>
        public InputList<Union<string, Pulumi.Equinix.Metal.Facility>> Facilities
        {
            get => _facilities ?? (_facilities = new InputList<Union<string, Pulumi.Equinix.Metal.Facility>>());
            set => _facilities = value;
        }

        /// <summary>
        /// Delete device even if it has volumes attached. Only applies
        /// for destroy action.
        /// </summary>
        [Input("forceDetachVolumes")]
        public Input<bool>? ForceDetachVolumes { get; set; }

        /// <summary>
        /// The UUID of the hardware reservation where you want this device deployed, or next-available if you want to pick your
        /// next available reservation automatically
        /// </summary>
        [Input("hardwareReservationId")]
        public Input<string>? HardwareReservationId { get; set; }

        /// <summary>
        /// The device hostname used in deployments taking advantage of Layer3 DHCP
        /// or metadata service configuration.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        [Input("ipAddresses")]
        private InputList<Inputs.DeviceIpAddressGetArgs>? _ipAddresses;

        /// <summary>
        /// A list of IP address types for the device. See
        /// IP address below for more details.
        /// </summary>
        public InputList<Inputs.DeviceIpAddressGetArgs> IpAddresses
        {
            get => _ipAddresses ?? (_ipAddresses = new InputList<Inputs.DeviceIpAddressGetArgs>());
            set => _ipAddresses = value;
        }

        /// <summary>
        /// URL pointing to a hosted iPXE script. More information is in the
        /// [Custom iPXE](https://metal.equinix.com/developers/docs/servers/custom-ipxe/) doc.
        /// </summary>
        [Input("ipxeScriptUrl")]
        public Input<string>? IpxeScriptUrl { get; set; }

        /// <summary>
        /// Whether the device is locked.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Metro area for the new device. Conflicts with `facilities`.
        /// </summary>
        [Input("metro")]
        public Input<string>? Metro { get; set; }

        /// <summary>
        /// (Deprecated) Network type of a device, used in
        /// [Layer 2 networking](https://metal.equinix.com/developers/docs/networking/layer2/). Since this
        /// attribute is deprecated you should handle Network Type with one of
        /// equinix_metal_port,
        /// equinix.metal.DeviceNetworkType resources or
        /// equinix.metal.Port datasource.
        /// See network_types guide for more info.
        /// </summary>
        [Input("networkType")]
        public InputUnion<string, Pulumi.Equinix.Metal.NetworkType>? NetworkType { get; set; }

        [Input("networks")]
        private InputList<Inputs.DeviceNetworkGetArgs>? _networks;

        /// <summary>
        /// The device's private and public IP (v4 and v6) network details. See
        /// Network Attribute below for more details.
        /// </summary>
        public InputList<Inputs.DeviceNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.DeviceNetworkGetArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// The operating system slug. To find the slug, or visit
        /// [Operating Systems API docs](https://metal.equinix.com/developers/api/operatingsystems), set your
        /// API auth token in the top of the page and see JSON from the API response.
        /// </summary>
        [Input("operatingSystem")]
        public InputUnion<string, Pulumi.Equinix.Metal.OperatingSystem>? OperatingSystem { get; set; }

        /// <summary>
        /// The device plan slug. To find the plan slug, visit
        /// [Device plans API docs](https://metal.equinix.com/developers/api/plans), set your auth token in the
        /// top of the page and see JSON from the API response.
        /// </summary>
        [Input("plan")]
        public InputUnion<string, Pulumi.Equinix.Metal.Plan>? Plan { get; set; }

        [Input("ports")]
        private InputList<Inputs.DevicePortGetArgs>? _ports;

        /// <summary>
        /// List of ports assigned to the device. See Ports Attribute below for
        /// more details.
        /// </summary>
        public InputList<Inputs.DevicePortGetArgs> Ports
        {
            get => _ports ?? (_ports = new InputList<Inputs.DevicePortGetArgs>());
            set => _ports = value;
        }

        /// <summary>
        /// The ID of the project in which to create the device
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("projectSshKeyIds")]
        private InputList<string>? _projectSshKeyIds;

        /// <summary>
        /// Array of IDs of the project SSH keys which should be added to the device.
        /// If you omit this, SSH keys of all the members of the parent project will be added to the device. If
        /// you specify this array, only the listed project SSH keys will be added. Project SSH keys can be
        /// created with the equinix.metal.ProjectSshKey resource.
        /// </summary>
        public InputList<string> ProjectSshKeyIds
        {
            get => _projectSshKeyIds ?? (_projectSshKeyIds = new InputList<string>());
            set => _projectSshKeyIds = value;
        }

        /// <summary>
        /// Whether the device should be reinstalled instead of destroyed when
        /// modifying user_data, custom_data, or operating system. See Reinstall below for more
        /// details.
        /// </summary>
        [Input("reinstall")]
        public Input<Inputs.DeviceReinstallGetArgs>? Reinstall { get; set; }

        /// <summary>
        /// Root password to the server (disabled after 24 hours).
        /// </summary>
        [Input("rootPassword")]
        public Input<string>? RootPassword { get; set; }

        [Input("sshKeyIds")]
        private InputList<string>? _sshKeyIds;

        /// <summary>
        /// List of IDs of SSH keys deployed in the device, can be both user and project SSH keys.
        /// </summary>
        public InputList<string> SshKeyIds
        {
            get => _sshKeyIds ?? (_sshKeyIds = new InputList<string>());
            set => _sshKeyIds = value;
        }

        /// <summary>
        /// The status of the device.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// JSON for custom partitioning. Only usable on reserved hardware. More
        /// information in in the
        /// [Custom Partitioning and RAID](https://metal.equinix.com/developers/docs/servers/custom-partitioning-raid/)
        /// doc. Please note that the disks.partitions.size attribute must be a string, not an integer. It can
        /// be a number string, or size notation string, e.g. "4G" or "8M" (for gigabytes and megabytes).
        /// </summary>
        [Input("storage")]
        public Input<string>? Storage { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags attached to the device.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Timestamp for device termination. For example `2021-09-03T16:32:00+03:00`.
        /// If you don't supply timezone info, timestamp is assumed to be in UTC.
        /// </summary>
        [Input("terminationTime")]
        public Input<string>? TerminationTime { get; set; }

        /// <summary>
        /// The timestamp for the last time the device was updated.
        /// </summary>
        [Input("updated")]
        public Input<string>? Updated { get; set; }

        /// <summary>
        /// A string of the desired User Data for the device.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        [Input("userSshKeyIds")]
        private InputList<string>? _userSshKeyIds;

        /// <summary>
        /// Array of IDs of the user SSH keys which should be added to the device. If you omit this, SSH keys of all the members of the parent project will be added to the device. If you specify this array, only the listed user SSH keys (and any project_ssh_key_ids) will be added. User SSH keys can be created with the equinix.metal.SshKey resource
        /// </summary>
        public InputList<string> UserSshKeyIds
        {
            get => _userSshKeyIds ?? (_userSshKeyIds = new InputList<string>());
            set => _userSshKeyIds = value;
        }

        /// <summary>
        /// Only used for devices in reserved hardware. If
        /// set, the deletion of this device will block until the hardware reservation is marked provisionable
        /// (about 4 minutes in August 2019).
        /// </summary>
        [Input("waitForReservationDeprovision")]
        public Input<bool>? WaitForReservationDeprovision { get; set; }

        public DeviceState()
        {
        }
        public static new DeviceState Empty => new DeviceState();
    }
}
