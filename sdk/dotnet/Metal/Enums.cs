// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.ComponentModel;
using Pulumi;

namespace Pulumi.Equinix.Metal
{
    [EnumType]
    public readonly struct BillingCycle : IEquatable<BillingCycle>
    {
        private readonly string _value;

        private BillingCycle(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static BillingCycle Hourly { get; } = new BillingCycle("hourly");
        public static BillingCycle Monthly { get; } = new BillingCycle("monthly");

        public static bool operator ==(BillingCycle left, BillingCycle right) => left.Equals(right);
        public static bool operator !=(BillingCycle left, BillingCycle right) => !left.Equals(right);

        public static explicit operator string(BillingCycle value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is BillingCycle other && Equals(other);
        public bool Equals(BillingCycle other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct Facility : IEquatable<Facility>
    {
        private readonly string _value;

        private Facility(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static Facility EWR1 { get; } = new Facility("ewr1");
        public static Facility SJC1 { get; } = new Facility("sjc1");
        public static Facility DFW1 { get; } = new Facility("dfw1");
        public static Facility DFW2 { get; } = new Facility("dfw2");
        public static Facility AMS1 { get; } = new Facility("ams1");
        public static Facility NRT1 { get; } = new Facility("nrt1");
        public static Facility SEA1 { get; } = new Facility("sea1");
        public static Facility LAX1 { get; } = new Facility("lax1");
        public static Facility ORD1 { get; } = new Facility("ord1");
        public static Facility ATL1 { get; } = new Facility("atl1");
        public static Facility IAD1 { get; } = new Facility("iad1");
        public static Facility SIN1 { get; } = new Facility("sin1");
        public static Facility HKG1 { get; } = new Facility("hkg1");
        public static Facility SYD1 { get; } = new Facility("syd1");
        public static Facility MRS1 { get; } = new Facility("mrs1");
        public static Facility YYZ1 { get; } = new Facility("yyz1");
        public static Facility FRA2 { get; } = new Facility("fra2");
        public static Facility AM6 { get; } = new Facility("am6");
        public static Facility DC13 { get; } = new Facility("dc13");
        public static Facility CH3 { get; } = new Facility("ch3");
        public static Facility DA3 { get; } = new Facility("da3");
        public static Facility DA11 { get; } = new Facility("da11");
        public static Facility LA4 { get; } = new Facility("la4");
        public static Facility NY5 { get; } = new Facility("ny5");
        public static Facility SG1 { get; } = new Facility("sg1");
        public static Facility SV15 { get; } = new Facility("sv15");

        public static bool operator ==(Facility left, Facility right) => left.Equals(right);
        public static bool operator !=(Facility left, Facility right) => !left.Equals(right);

        public static explicit operator string(Facility value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is Facility other && Equals(other);
        public bool Equals(Facility other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct IpBlockType : IEquatable<IpBlockType>
    {
        private readonly string _value;

        private IpBlockType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static IpBlockType GlobalIPv4 { get; } = new IpBlockType("global_ipv4");
        public static IpBlockType PublicIPv4 { get; } = new IpBlockType("public_ipv4");

        public static bool operator ==(IpBlockType left, IpBlockType right) => left.Equals(right);
        public static bool operator !=(IpBlockType left, IpBlockType right) => !left.Equals(right);

        public static explicit operator string(IpBlockType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is IpBlockType other && Equals(other);
        public bool Equals(IpBlockType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct NetworkType : IEquatable<NetworkType>
    {
        private readonly string _value;

        private NetworkType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static NetworkType Layer3 { get; } = new NetworkType("layer3");
        public static NetworkType Layer2Individual { get; } = new NetworkType("layer2-individual");
        public static NetworkType Layer2Bonded { get; } = new NetworkType("layer2-bonded");
        public static NetworkType Hybrid { get; } = new NetworkType("hybrid");

        public static bool operator ==(NetworkType left, NetworkType right) => left.Equals(right);
        public static bool operator !=(NetworkType left, NetworkType right) => !left.Equals(right);

        public static explicit operator string(NetworkType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is NetworkType other && Equals(other);
        public bool Equals(NetworkType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct OperatingSystem : IEquatable<OperatingSystem>
    {
        private readonly string _value;

        private OperatingSystem(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static OperatingSystem Alpine3 { get; } = new OperatingSystem("alpine_3");
        public static OperatingSystem CentOS6 { get; } = new OperatingSystem("centos_6");
        public static OperatingSystem CentOS7 { get; } = new OperatingSystem("centos_7");
        public static OperatingSystem CentOS8 { get; } = new OperatingSystem("centos_8");
        public static OperatingSystem CoreOSAlpha { get; } = new OperatingSystem("coreos_alpha");
        public static OperatingSystem CoreOSBeta { get; } = new OperatingSystem("coreos_beta");
        public static OperatingSystem CoreOSStable { get; } = new OperatingSystem("coreos_stable");
        public static OperatingSystem CustomIPXE { get; } = new OperatingSystem("custom_ipxe");
        public static OperatingSystem Debian8 { get; } = new OperatingSystem("debian_8");
        public static OperatingSystem Debian9 { get; } = new OperatingSystem("debian_9");
        public static OperatingSystem Debian10 { get; } = new OperatingSystem("debian_10");
        public static OperatingSystem FlatcarAlpha { get; } = new OperatingSystem("flatcar_alpha");
        public static OperatingSystem FlatcarBeta { get; } = new OperatingSystem("flatcar_beta");
        public static OperatingSystem FlatcarEdge { get; } = new OperatingSystem("flatcar_edge");
        public static OperatingSystem FlatcarStable { get; } = new OperatingSystem("flatcar_stable");
        public static OperatingSystem FreeBSD10_4 { get; } = new OperatingSystem("freebsd_10_4");
        public static OperatingSystem FreeBSD11_1 { get; } = new OperatingSystem("freebsd_11_1");
        public static OperatingSystem FreeBSD11_2 { get; } = new OperatingSystem("freebsd_11_2");
        public static OperatingSystem FreeBSD12Testing { get; } = new OperatingSystem("freebsd_12_testing");
        public static OperatingSystem NixOS18_03 { get; } = new OperatingSystem("nixos_18_03");
        public static OperatingSystem NixOS19_03 { get; } = new OperatingSystem("nixos_19_03");
        public static OperatingSystem OpenSUSE42_3 { get; } = new OperatingSystem("opensuse_42_3");
        public static OperatingSystem RancherOS { get; } = new OperatingSystem("rancher");
        public static OperatingSystem RHEL7 { get; } = new OperatingSystem("rhel_7");
        public static OperatingSystem RHEL8 { get; } = new OperatingSystem("rhel_8");
        public static OperatingSystem ScientificLinux6 { get; } = new OperatingSystem("scientific_6");
        public static OperatingSystem SLES12SP3 { get; } = new OperatingSystem("suse_sles12_sp3");
        public static OperatingSystem Ubuntu1404 { get; } = new OperatingSystem("ubuntu_14_04");
        public static OperatingSystem Ubuntu1604 { get; } = new OperatingSystem("ubuntu_16_04");
        public static OperatingSystem Ubuntu1710 { get; } = new OperatingSystem("ubuntu_17_10");
        public static OperatingSystem Ubuntu1804 { get; } = new OperatingSystem("ubuntu_18_04");
        public static OperatingSystem Ubuntu2004 { get; } = new OperatingSystem("ubuntu_20_04");
        public static OperatingSystem Ubuntu2010 { get; } = new OperatingSystem("ubuntu_20_10");
        public static OperatingSystem VMWareEsxi6_5 { get; } = new OperatingSystem("vmware_esxi_6_5");
        public static OperatingSystem VMWareEsxi6_7 { get; } = new OperatingSystem("vmware_esxi_6_7");
        public static OperatingSystem VMWareEsxi7_0 { get; } = new OperatingSystem("vmware_esxi_7_0");
        public static OperatingSystem Windows2012R2 { get; } = new OperatingSystem("windows_2012_r2");
        public static OperatingSystem Windows2016 { get; } = new OperatingSystem("windows_2016");
        public static OperatingSystem Windows2019 { get; } = new OperatingSystem("windows_2019");

        public static bool operator ==(OperatingSystem left, OperatingSystem right) => left.Equals(right);
        public static bool operator !=(OperatingSystem left, OperatingSystem right) => !left.Equals(right);

        public static explicit operator string(OperatingSystem value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is OperatingSystem other && Equals(other);
        public bool Equals(OperatingSystem other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct Plan : IEquatable<Plan>
    {
        private readonly string _value;

        private Plan(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static Plan C2LargeARM { get; } = new Plan("c2.large.arm");
        public static Plan C2MediumX86 { get; } = new Plan("c2.medium.x86");
        public static Plan C1SmallX86 { get; } = new Plan("baremetal_1");
        public static Plan C1LargeARM { get; } = new Plan("baremetal_2a");
        public static Plan C1XLargeX86 { get; } = new Plan("baremetal_3");
        public static Plan X2XLargeX86 { get; } = new Plan("x2.xlarge.x86");
        public static Plan X1SmallX86 { get; } = new Plan("baremetal_1e");
        public static Plan G2LargeX86 { get; } = new Plan("g2.large.x86");
        public static Plan M2XLargeX86 { get; } = new Plan("m2.xlarge.x86");
        public static Plan M1XLargeX86 { get; } = new Plan("baremetal_2");
        public static Plan T1SmallX86 { get; } = new Plan("baremetal_0");
        public static Plan S1LargeX86 { get; } = new Plan("baremetal_s");
        public static Plan C3SmallX86 { get; } = new Plan("c3.small.x86");
        public static Plan C3MediumX86 { get; } = new Plan("c3.medium.x86");
        public static Plan F3MediumX86 { get; } = new Plan("f3.medium.x86");
        public static Plan F3LargeX86 { get; } = new Plan("f3.large.x86");
        public static Plan M3LargeX86 { get; } = new Plan("m3.large.x86");
        public static Plan S3XLargeX86 { get; } = new Plan("s3.xlarge.x86");
        public static Plan N2XLargeX86 { get; } = new Plan("n2.xlarge.x86");

        public static bool operator ==(Plan left, Plan right) => left.Equals(right);
        public static bool operator !=(Plan left, Plan right) => !left.Equals(right);

        public static explicit operator string(Plan value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is Plan other && Equals(other);
        public bool Equals(Plan other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }
}
