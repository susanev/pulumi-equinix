// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.ComponentModel;
using Pulumi;

namespace Pulumi.Equinix.Fabric
{
    [EnumType]
    public readonly struct AccessPointLinkProtocolType : IEquatable<AccessPointLinkProtocolType>
    {
        private readonly string _value;

        private AccessPointLinkProtocolType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static AccessPointLinkProtocolType Untagged { get; } = new AccessPointLinkProtocolType("UNTAGGED");
        public static AccessPointLinkProtocolType Dot1q { get; } = new AccessPointLinkProtocolType("DOT1Q");
        public static AccessPointLinkProtocolType QinQ { get; } = new AccessPointLinkProtocolType("QINQ");
        public static AccessPointLinkProtocolType EVPN_VXLAN { get; } = new AccessPointLinkProtocolType("EVPN_VXLAN");

        public static bool operator ==(AccessPointLinkProtocolType left, AccessPointLinkProtocolType right) => left.Equals(right);
        public static bool operator !=(AccessPointLinkProtocolType left, AccessPointLinkProtocolType right) => !left.Equals(right);

        public static explicit operator string(AccessPointLinkProtocolType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is AccessPointLinkProtocolType other && Equals(other);
        public bool Equals(AccessPointLinkProtocolType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct AccessPointPeeringType : IEquatable<AccessPointPeeringType>
    {
        private readonly string _value;

        private AccessPointPeeringType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static AccessPointPeeringType Private { get; } = new AccessPointPeeringType("PRIVATE");
        public static AccessPointPeeringType Microsoft { get; } = new AccessPointPeeringType("MICROSOFT");
        public static AccessPointPeeringType Public { get; } = new AccessPointPeeringType("PUBLIC");

        public static bool operator ==(AccessPointPeeringType left, AccessPointPeeringType right) => left.Equals(right);
        public static bool operator !=(AccessPointPeeringType left, AccessPointPeeringType right) => !left.Equals(right);

        public static explicit operator string(AccessPointPeeringType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is AccessPointPeeringType other && Equals(other);
        public bool Equals(AccessPointPeeringType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct AccessPointType : IEquatable<AccessPointType>
    {
        private readonly string _value;

        private AccessPointType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// Colocation
        /// </summary>
        public static AccessPointType Colo { get; } = new AccessPointType("COLO");
        /// <summary>
        /// Virtual Device
        /// </summary>
        public static AccessPointType VD { get; } = new AccessPointType("VD");
        /// <summary>
        /// Service Profile
        /// </summary>
        public static AccessPointType SP { get; } = new AccessPointType("SP");
        /// <summary>
        /// Internet Gateway
        /// </summary>
        public static AccessPointType IGW { get; } = new AccessPointType("IGW");
        /// <summary>
        /// Subnet
        /// </summary>
        public static AccessPointType Subnet { get; } = new AccessPointType("SUBNET");
        /// <summary>
        /// Gateway
        /// </summary>
        public static AccessPointType GW { get; } = new AccessPointType("GW");
        /// <summary>
        /// Network
        /// </summary>
        public static AccessPointType Network { get; } = new AccessPointType("NETWORK");

        public static bool operator ==(AccessPointType left, AccessPointType right) => left.Equals(right);
        public static bool operator !=(AccessPointType left, AccessPointType right) => !left.Equals(right);

        public static explicit operator string(AccessPointType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is AccessPointType other && Equals(other);
        public bool Equals(AccessPointType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct ConnectionType : IEquatable<ConnectionType>
    {
        private readonly string _value;

        private ConnectionType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// Virtual Gateway
        /// </summary>
        public static ConnectionType VG { get; } = new ConnectionType("VG_VC");
        /// <summary>
        /// Ethernet Virtual Private Line
        /// </summary>
        public static ConnectionType EVPL { get; } = new ConnectionType("EVPL_VC");
        /// <summary>
        /// Ethernet Private Line
        /// </summary>
        public static ConnectionType EPL { get; } = new ConnectionType("EPL_VC");
        /// <summary>
        /// Fabric Gateway virtual connection
        /// </summary>
        public static ConnectionType GW { get; } = new ConnectionType("GW_VC");
        /// <summary>
        /// E-access, layer 2 connection between a QINQ port and an EPL port.
        /// </summary>
        public static ConnectionType AccessEPL { get; } = new ConnectionType("ACCESS_EPL_VC");

        public static bool operator ==(ConnectionType left, ConnectionType right) => left.Equals(right);
        public static bool operator !=(ConnectionType left, ConnectionType right) => !left.Equals(right);

        public static explicit operator string(ConnectionType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is ConnectionType other && Equals(other);
        public bool Equals(ConnectionType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct NotificationsType : IEquatable<NotificationsType>
    {
        private readonly string _value;

        private NotificationsType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static NotificationsType All { get; } = new NotificationsType("ALL");
        public static NotificationsType ConnectionApproval { get; } = new NotificationsType("CONNECTION_APPROVAL");
        public static NotificationsType SalesNotifications { get; } = new NotificationsType("SALES_REP_NOTIFICATIONS");
        public static NotificationsType Notifications { get; } = new NotificationsType("NOTIFICATIONS");

        public static bool operator ==(NotificationsType left, NotificationsType right) => left.Equals(right);
        public static bool operator !=(NotificationsType left, NotificationsType right) => !left.Equals(right);

        public static explicit operator string(NotificationsType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is NotificationsType other && Equals(other);
        public bool Equals(NotificationsType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct ProfileAccessPointType : IEquatable<ProfileAccessPointType>
    {
        private readonly string _value;

        private ProfileAccessPointType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// Colocation
        /// </summary>
        public static ProfileAccessPointType Colo { get; } = new ProfileAccessPointType("COLO");
        /// <summary>
        /// Virtual Device
        /// </summary>
        public static ProfileAccessPointType VD { get; } = new ProfileAccessPointType("VD");

        public static bool operator ==(ProfileAccessPointType left, ProfileAccessPointType right) => left.Equals(right);
        public static bool operator !=(ProfileAccessPointType left, ProfileAccessPointType right) => !left.Equals(right);

        public static explicit operator string(ProfileAccessPointType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is ProfileAccessPointType other && Equals(other);
        public bool Equals(ProfileAccessPointType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct ProfileState : IEquatable<ProfileState>
    {
        private readonly string _value;

        private ProfileState(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static ProfileState Active { get; } = new ProfileState("ACTIVE");
        public static ProfileState PendingApproval { get; } = new ProfileState("PENDING_APPROVAL");
        public static ProfileState Deleted { get; } = new ProfileState("DELETED");
        public static ProfileState Rejected { get; } = new ProfileState("REJECTED");

        public static bool operator ==(ProfileState left, ProfileState right) => left.Equals(right);
        public static bool operator !=(ProfileState left, ProfileState right) => !left.Equals(right);

        public static explicit operator string(ProfileState value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is ProfileState other && Equals(other);
        public bool Equals(ProfileState other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct ProfileType : IEquatable<ProfileType>
    {
        private readonly string _value;

        private ProfileType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static ProfileType L2Profile { get; } = new ProfileType("L2_PROFILE");
        public static ProfileType L3Profile { get; } = new ProfileType("L3_PROFILE");

        public static bool operator ==(ProfileType left, ProfileType right) => left.Equals(right);
        public static bool operator !=(ProfileType left, ProfileType right) => !left.Equals(right);

        public static explicit operator string(ProfileType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is ProfileType other && Equals(other);
        public bool Equals(ProfileType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct ProfileVisibility : IEquatable<ProfileVisibility>
    {
        private readonly string _value;

        private ProfileVisibility(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static ProfileVisibility Public { get; } = new ProfileVisibility("PUBLIC");
        public static ProfileVisibility Private { get; } = new ProfileVisibility("PRIVATE");

        public static bool operator ==(ProfileVisibility left, ProfileVisibility right) => left.Equals(right);
        public static bool operator !=(ProfileVisibility left, ProfileVisibility right) => !left.Equals(right);

        public static explicit operator string(ProfileVisibility value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is ProfileVisibility other && Equals(other);
        public bool Equals(ProfileVisibility other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct ServiceTokenType : IEquatable<ServiceTokenType>
    {
        private readonly string _value;

        private ServiceTokenType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public static ServiceTokenType VCToken { get; } = new ServiceTokenType("VC_TOKEN");

        public static bool operator ==(ServiceTokenType left, ServiceTokenType right) => left.Equals(right);
        public static bool operator !=(ServiceTokenType left, ServiceTokenType right) => !left.Equals(right);

        public static explicit operator string(ServiceTokenType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is ServiceTokenType other && Equals(other);
        public bool Equals(ServiceTokenType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }
}
