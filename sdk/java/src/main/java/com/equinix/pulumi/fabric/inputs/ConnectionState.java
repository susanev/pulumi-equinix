// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.enums.ConnectionType;
import com.equinix.pulumi.fabric.inputs.ConnectionASideArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionAccountArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionAdditionalInfoArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionChangeLogArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionNotificationArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionOperationArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionOrderArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionProjectArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionRedundancyArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * Requester or Customer side connection configuration object of the multi-segment connection
     * 
     */
    @Import(name="aSide")
    private @Nullable Output<ConnectionASideArgs> aSide;

    /**
     * @return Requester or Customer side connection configuration object of the multi-segment connection
     * 
     */
    public Optional<Output<ConnectionASideArgs>> aSide() {
        return Optional.ofNullable(this.aSide);
    }

    /**
     * Customer account information that is associated with this connection
     * 
     */
    @Import(name="account")
    private @Nullable Output<ConnectionAccountArgs> account;

    /**
     * @return Customer account information that is associated with this connection
     * 
     */
    public Optional<Output<ConnectionAccountArgs>> account() {
        return Optional.ofNullable(this.account);
    }

    /**
     * Connection additional information
     * 
     */
    @Import(name="additionalInfo")
    private @Nullable Output<List<ConnectionAdditionalInfoArgs>> additionalInfo;

    /**
     * @return Connection additional information
     * 
     */
    public Optional<Output<List<ConnectionAdditionalInfoArgs>>> additionalInfo() {
        return Optional.ofNullable(this.additionalInfo);
    }

    /**
     * Connection bandwidth in Mbps
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<Integer> bandwidth;

    /**
     * @return Connection bandwidth in Mbps
     * 
     */
    public Optional<Output<Integer>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * Captures connection lifecycle change information
     * 
     */
    @Import(name="changeLog")
    private @Nullable Output<ConnectionChangeLogArgs> changeLog;

    /**
     * @return Captures connection lifecycle change information
     * 
     */
    public Optional<Output<ConnectionChangeLogArgs>> changeLog() {
        return Optional.ofNullable(this.changeLog);
    }

    /**
     * Connection directionality from the requester point of view
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return Connection directionality from the requester point of view
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Connection URI information
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return Connection URI information
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Connection property derived from access point locations
     * 
     */
    @Import(name="isRemote")
    private @Nullable Output<Boolean> isRemote;

    /**
     * @return Connection property derived from access point locations
     * 
     */
    public Optional<Output<Boolean>> isRemote() {
        return Optional.ofNullable(this.isRemote);
    }

    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Preferences for notifications on connection configuration or status changes
     * 
     */
    @Import(name="notifications")
    private @Nullable Output<List<ConnectionNotificationArgs>> notifications;

    /**
     * @return Preferences for notifications on connection configuration or status changes
     * 
     */
    public Optional<Output<List<ConnectionNotificationArgs>>> notifications() {
        return Optional.ofNullable(this.notifications);
    }

    /**
     * Connection type-specific operational data
     * 
     */
    @Import(name="operation")
    private @Nullable Output<ConnectionOperationArgs> operation;

    /**
     * @return Connection type-specific operational data
     * 
     */
    public Optional<Output<ConnectionOperationArgs>> operation() {
        return Optional.ofNullable(this.operation);
    }

    /**
     * Order related to this connection information
     * 
     */
    @Import(name="order")
    private @Nullable Output<ConnectionOrderArgs> order;

    /**
     * @return Order related to this connection information
     * 
     */
    public Optional<Output<ConnectionOrderArgs>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * Project information
     * 
     */
    @Import(name="project")
    private @Nullable Output<ConnectionProjectArgs> project;

    /**
     * @return Project information
     * 
     */
    public Optional<Output<ConnectionProjectArgs>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Redundancy Information
     * 
     */
    @Import(name="redundancy")
    private @Nullable Output<ConnectionRedundancyArgs> redundancy;

    /**
     * @return Redundancy Information
     * 
     */
    public Optional<Output<ConnectionRedundancyArgs>> redundancy() {
        return Optional.ofNullable(this.redundancy);
    }

    /**
     * Connection overall state
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Connection overall state
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,ConnectionType>> type;

    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    public Optional<Output<Either<String,ConnectionType>>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Destination or Provider side connection configuration object of the multi-segment connection
     * 
     */
    @Import(name="zSide")
    private @Nullable Output<ConnectionZSideArgs> zSide;

    /**
     * @return Destination or Provider side connection configuration object of the multi-segment connection
     * 
     */
    public Optional<Output<ConnectionZSideArgs>> zSide() {
        return Optional.ofNullable(this.zSide);
    }

    private ConnectionState() {}

    private ConnectionState(ConnectionState $) {
        this.aSide = $.aSide;
        this.account = $.account;
        this.additionalInfo = $.additionalInfo;
        this.bandwidth = $.bandwidth;
        this.changeLog = $.changeLog;
        this.direction = $.direction;
        this.href = $.href;
        this.isRemote = $.isRemote;
        this.name = $.name;
        this.notifications = $.notifications;
        this.operation = $.operation;
        this.order = $.order;
        this.project = $.project;
        this.redundancy = $.redundancy;
        this.state = $.state;
        this.type = $.type;
        this.zSide = $.zSide;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionState $;

        public Builder() {
            $ = new ConnectionState();
        }

        public Builder(ConnectionState defaults) {
            $ = new ConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aSide Requester or Customer side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder aSide(@Nullable Output<ConnectionASideArgs> aSide) {
            $.aSide = aSide;
            return this;
        }

        /**
         * @param aSide Requester or Customer side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder aSide(ConnectionASideArgs aSide) {
            return aSide(Output.of(aSide));
        }

        /**
         * @param account Customer account information that is associated with this connection
         * 
         * @return builder
         * 
         */
        public Builder account(@Nullable Output<ConnectionAccountArgs> account) {
            $.account = account;
            return this;
        }

        /**
         * @param account Customer account information that is associated with this connection
         * 
         * @return builder
         * 
         */
        public Builder account(ConnectionAccountArgs account) {
            return account(Output.of(account));
        }

        /**
         * @param additionalInfo Connection additional information
         * 
         * @return builder
         * 
         */
        public Builder additionalInfo(@Nullable Output<List<ConnectionAdditionalInfoArgs>> additionalInfo) {
            $.additionalInfo = additionalInfo;
            return this;
        }

        /**
         * @param additionalInfo Connection additional information
         * 
         * @return builder
         * 
         */
        public Builder additionalInfo(List<ConnectionAdditionalInfoArgs> additionalInfo) {
            return additionalInfo(Output.of(additionalInfo));
        }

        /**
         * @param additionalInfo Connection additional information
         * 
         * @return builder
         * 
         */
        public Builder additionalInfo(ConnectionAdditionalInfoArgs... additionalInfo) {
            return additionalInfo(List.of(additionalInfo));
        }

        /**
         * @param bandwidth Connection bandwidth in Mbps
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth Connection bandwidth in Mbps
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param changeLog Captures connection lifecycle change information
         * 
         * @return builder
         * 
         */
        public Builder changeLog(@Nullable Output<ConnectionChangeLogArgs> changeLog) {
            $.changeLog = changeLog;
            return this;
        }

        /**
         * @param changeLog Captures connection lifecycle change information
         * 
         * @return builder
         * 
         */
        public Builder changeLog(ConnectionChangeLogArgs changeLog) {
            return changeLog(Output.of(changeLog));
        }

        /**
         * @param direction Connection directionality from the requester point of view
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction Connection directionality from the requester point of view
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param href Connection URI information
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href Connection URI information
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param isRemote Connection property derived from access point locations
         * 
         * @return builder
         * 
         */
        public Builder isRemote(@Nullable Output<Boolean> isRemote) {
            $.isRemote = isRemote;
            return this;
        }

        /**
         * @param isRemote Connection property derived from access point locations
         * 
         * @return builder
         * 
         */
        public Builder isRemote(Boolean isRemote) {
            return isRemote(Output.of(isRemote));
        }

        /**
         * @param name Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notifications Preferences for notifications on connection configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(@Nullable Output<List<ConnectionNotificationArgs>> notifications) {
            $.notifications = notifications;
            return this;
        }

        /**
         * @param notifications Preferences for notifications on connection configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(List<ConnectionNotificationArgs> notifications) {
            return notifications(Output.of(notifications));
        }

        /**
         * @param notifications Preferences for notifications on connection configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(ConnectionNotificationArgs... notifications) {
            return notifications(List.of(notifications));
        }

        /**
         * @param operation Connection type-specific operational data
         * 
         * @return builder
         * 
         */
        public Builder operation(@Nullable Output<ConnectionOperationArgs> operation) {
            $.operation = operation;
            return this;
        }

        /**
         * @param operation Connection type-specific operational data
         * 
         * @return builder
         * 
         */
        public Builder operation(ConnectionOperationArgs operation) {
            return operation(Output.of(operation));
        }

        /**
         * @param order Order related to this connection information
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<ConnectionOrderArgs> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Order related to this connection information
         * 
         * @return builder
         * 
         */
        public Builder order(ConnectionOrderArgs order) {
            return order(Output.of(order));
        }

        /**
         * @param project Project information
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<ConnectionProjectArgs> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project information
         * 
         * @return builder
         * 
         */
        public Builder project(ConnectionProjectArgs project) {
            return project(Output.of(project));
        }

        /**
         * @param redundancy Redundancy Information
         * 
         * @return builder
         * 
         */
        public Builder redundancy(@Nullable Output<ConnectionRedundancyArgs> redundancy) {
            $.redundancy = redundancy;
            return this;
        }

        /**
         * @param redundancy Redundancy Information
         * 
         * @return builder
         * 
         */
        public Builder redundancy(ConnectionRedundancyArgs redundancy) {
            return redundancy(Output.of(redundancy));
        }

        /**
         * @param state Connection overall state
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Connection overall state
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,ConnectionType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ConnectionType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(ConnectionType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param zSide Destination or Provider side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder zSide(@Nullable Output<ConnectionZSideArgs> zSide) {
            $.zSide = zSide;
            return this;
        }

        /**
         * @param zSide Destination or Provider side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder zSide(ConnectionZSideArgs zSide) {
            return zSide(Output.of(zSide));
        }

        public ConnectionState build() {
            return $;
        }
    }

}
