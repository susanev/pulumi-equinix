// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetServiceProfileAccessPointTypeConfig;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileAccount;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileChangeLog;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileCustomField;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileMarketingInfo;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileMetro;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileNotification;
import com.equinix.pulumi.fabric.outputs.GetServiceProfilePort;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileProject;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceProfileResult {
    /**
     * @return Access point config information
     * 
     */
    private List<GetServiceProfileAccessPointTypeConfig> accessPointTypeConfigs;
    /**
     * @return Account
     * 
     */
    private GetServiceProfileAccount account;
    /**
     * @return Array of contact emails
     * 
     */
    private List<String> allowedEmails;
    /**
     * @return Captures connection lifecycle change information
     * 
     */
    private GetServiceProfileChangeLog changeLog;
    /**
     * @return Custom Fields
     * 
     */
    private List<GetServiceProfileCustomField> customFields;
    /**
     * @return User-provided service description
     * 
     */
    private String description;
    /**
     * @return Service Profile URI response attribute
     * 
     */
    private String href;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Marketing Info
     * 
     */
    private GetServiceProfileMarketingInfo marketingInfo;
    /**
     * @return Access point config information
     * 
     */
    private List<GetServiceProfileMetro> metros;
    /**
     * @return Customer-assigned service profile name
     * 
     */
    private String name;
    /**
     * @return Preferences for notifications on connection configuration or status changes
     * 
     */
    private List<GetServiceProfileNotification> notifications;
    /**
     * @return Ports
     * 
     */
    private List<GetServiceProfilePort> ports;
    /**
     * @return Project information
     * 
     */
    private GetServiceProfileProject project;
    /**
     * @return Self Profile indicating if the profile is created for customer&#39;s  self use
     * 
     */
    private Boolean selfProfile;
    /**
     * @return Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     * 
     */
    private @Nullable String state;
    /**
     * @return Tags attached to the connection
     * 
     */
    private List<String> tags;
    /**
     * @return Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
     * 
     */
    private String type;
    /**
     * @return Equinix assigned service profile identifier
     * 
     */
    private String uuid;
    /**
     * @return Service profile visibility - PUBLIC, PRIVATE
     * 
     */
    private String visibility;

    private GetServiceProfileResult() {}
    /**
     * @return Access point config information
     * 
     */
    public List<GetServiceProfileAccessPointTypeConfig> accessPointTypeConfigs() {
        return this.accessPointTypeConfigs;
    }
    /**
     * @return Account
     * 
     */
    public GetServiceProfileAccount account() {
        return this.account;
    }
    /**
     * @return Array of contact emails
     * 
     */
    public List<String> allowedEmails() {
        return this.allowedEmails;
    }
    /**
     * @return Captures connection lifecycle change information
     * 
     */
    public GetServiceProfileChangeLog changeLog() {
        return this.changeLog;
    }
    /**
     * @return Custom Fields
     * 
     */
    public List<GetServiceProfileCustomField> customFields() {
        return this.customFields;
    }
    /**
     * @return User-provided service description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Service Profile URI response attribute
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Marketing Info
     * 
     */
    public GetServiceProfileMarketingInfo marketingInfo() {
        return this.marketingInfo;
    }
    /**
     * @return Access point config information
     * 
     */
    public List<GetServiceProfileMetro> metros() {
        return this.metros;
    }
    /**
     * @return Customer-assigned service profile name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Preferences for notifications on connection configuration or status changes
     * 
     */
    public List<GetServiceProfileNotification> notifications() {
        return this.notifications;
    }
    /**
     * @return Ports
     * 
     */
    public List<GetServiceProfilePort> ports() {
        return this.ports;
    }
    /**
     * @return Project information
     * 
     */
    public GetServiceProfileProject project() {
        return this.project;
    }
    /**
     * @return Self Profile indicating if the profile is created for customer&#39;s  self use
     * 
     */
    public Boolean selfProfile() {
        return this.selfProfile;
    }
    /**
     * @return Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return Tags attached to the connection
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix assigned service profile identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }
    /**
     * @return Service profile visibility - PUBLIC, PRIVATE
     * 
     */
    public String visibility() {
        return this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfileResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetServiceProfileAccessPointTypeConfig> accessPointTypeConfigs;
        private GetServiceProfileAccount account;
        private List<String> allowedEmails;
        private GetServiceProfileChangeLog changeLog;
        private List<GetServiceProfileCustomField> customFields;
        private String description;
        private String href;
        private String id;
        private GetServiceProfileMarketingInfo marketingInfo;
        private List<GetServiceProfileMetro> metros;
        private String name;
        private List<GetServiceProfileNotification> notifications;
        private List<GetServiceProfilePort> ports;
        private GetServiceProfileProject project;
        private Boolean selfProfile;
        private @Nullable String state;
        private List<String> tags;
        private String type;
        private String uuid;
        private String visibility;
        public Builder() {}
        public Builder(GetServiceProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointTypeConfigs = defaults.accessPointTypeConfigs;
    	      this.account = defaults.account;
    	      this.allowedEmails = defaults.allowedEmails;
    	      this.changeLog = defaults.changeLog;
    	      this.customFields = defaults.customFields;
    	      this.description = defaults.description;
    	      this.href = defaults.href;
    	      this.id = defaults.id;
    	      this.marketingInfo = defaults.marketingInfo;
    	      this.metros = defaults.metros;
    	      this.name = defaults.name;
    	      this.notifications = defaults.notifications;
    	      this.ports = defaults.ports;
    	      this.project = defaults.project;
    	      this.selfProfile = defaults.selfProfile;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
    	      this.visibility = defaults.visibility;
        }

        @CustomType.Setter
        public Builder accessPointTypeConfigs(List<GetServiceProfileAccessPointTypeConfig> accessPointTypeConfigs) {
            this.accessPointTypeConfigs = Objects.requireNonNull(accessPointTypeConfigs);
            return this;
        }
        public Builder accessPointTypeConfigs(GetServiceProfileAccessPointTypeConfig... accessPointTypeConfigs) {
            return accessPointTypeConfigs(List.of(accessPointTypeConfigs));
        }
        @CustomType.Setter
        public Builder account(GetServiceProfileAccount account) {
            this.account = Objects.requireNonNull(account);
            return this;
        }
        @CustomType.Setter
        public Builder allowedEmails(List<String> allowedEmails) {
            this.allowedEmails = Objects.requireNonNull(allowedEmails);
            return this;
        }
        public Builder allowedEmails(String... allowedEmails) {
            return allowedEmails(List.of(allowedEmails));
        }
        @CustomType.Setter
        public Builder changeLog(GetServiceProfileChangeLog changeLog) {
            this.changeLog = Objects.requireNonNull(changeLog);
            return this;
        }
        @CustomType.Setter
        public Builder customFields(List<GetServiceProfileCustomField> customFields) {
            this.customFields = Objects.requireNonNull(customFields);
            return this;
        }
        public Builder customFields(GetServiceProfileCustomField... customFields) {
            return customFields(List.of(customFields));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            this.href = Objects.requireNonNull(href);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder marketingInfo(GetServiceProfileMarketingInfo marketingInfo) {
            this.marketingInfo = Objects.requireNonNull(marketingInfo);
            return this;
        }
        @CustomType.Setter
        public Builder metros(List<GetServiceProfileMetro> metros) {
            this.metros = Objects.requireNonNull(metros);
            return this;
        }
        public Builder metros(GetServiceProfileMetro... metros) {
            return metros(List.of(metros));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder notifications(List<GetServiceProfileNotification> notifications) {
            this.notifications = Objects.requireNonNull(notifications);
            return this;
        }
        public Builder notifications(GetServiceProfileNotification... notifications) {
            return notifications(List.of(notifications));
        }
        @CustomType.Setter
        public Builder ports(List<GetServiceProfilePort> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(GetServiceProfilePort... ports) {
            return ports(List.of(ports));
        }
        @CustomType.Setter
        public Builder project(GetServiceProfileProject project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder selfProfile(Boolean selfProfile) {
            this.selfProfile = Objects.requireNonNull(selfProfile);
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }
        @CustomType.Setter
        public Builder visibility(String visibility) {
            this.visibility = Objects.requireNonNull(visibility);
            return this;
        }
        public GetServiceProfileResult build() {
            final var o = new GetServiceProfileResult();
            o.accessPointTypeConfigs = accessPointTypeConfigs;
            o.account = account;
            o.allowedEmails = allowedEmails;
            o.changeLog = changeLog;
            o.customFields = customFields;
            o.description = description;
            o.href = href;
            o.id = id;
            o.marketingInfo = marketingInfo;
            o.metros = metros;
            o.name = name;
            o.notifications = notifications;
            o.ports = ports;
            o.project = project;
            o.selfProfile = selfProfile;
            o.state = state;
            o.tags = tags;
            o.type = type;
            o.uuid = uuid;
            o.visibility = visibility;
            return o;
        }
    }
}
