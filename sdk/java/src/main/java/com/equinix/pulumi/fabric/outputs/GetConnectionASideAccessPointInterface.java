// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionASideAccessPointInterface {
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned connection identifier
     * 
     */
    private String uuid;

    private GetConnectionASideAccessPointInterface() {}
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix-assigned connection identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionASideAccessPointInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetConnectionASideAccessPointInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
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
        public GetConnectionASideAccessPointInterface build() {
            final var o = new GetConnectionASideAccessPointInterface();
            o.id = id;
            o.type = type;
            o.uuid = uuid;
            return o;
        }
    }
}
