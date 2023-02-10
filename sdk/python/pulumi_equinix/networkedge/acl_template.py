# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AclTemplateArgs', 'AclTemplate']

@pulumi.input_type
class AclTemplateArgs:
    def __init__(__self__, *,
                 inbound_rules: pulumi.Input[Sequence[pulumi.Input['AclTemplateInboundRuleArgs']]],
                 description: Optional[pulumi.Input[str]] = None,
                 metro_code: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AclTemplate resource.
        :param pulumi.Input[Sequence[pulumi.Input['AclTemplateInboundRuleArgs']]] inbound_rules: One or more rules to specify allowed inbound traffic.
               Rules are ordered, matching traffic rule stops processing subsequent ones.
        :param pulumi.Input[str] description: Inbound rule description, up to 200 characters.
        :param pulumi.Input[str] metro_code: ACL template location metro code.
        :param pulumi.Input[str] name: ACL template name.
        """
        pulumi.set(__self__, "inbound_rules", inbound_rules)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if metro_code is not None:
            warnings.warn("""Metro Code is no longer required""", DeprecationWarning)
            pulumi.log.warn("""metro_code is deprecated: Metro Code is no longer required""")
        if metro_code is not None:
            pulumi.set(__self__, "metro_code", metro_code)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="inboundRules")
    def inbound_rules(self) -> pulumi.Input[Sequence[pulumi.Input['AclTemplateInboundRuleArgs']]]:
        """
        One or more rules to specify allowed inbound traffic.
        Rules are ordered, matching traffic rule stops processing subsequent ones.
        """
        return pulumi.get(self, "inbound_rules")

    @inbound_rules.setter
    def inbound_rules(self, value: pulumi.Input[Sequence[pulumi.Input['AclTemplateInboundRuleArgs']]]):
        pulumi.set(self, "inbound_rules", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Inbound rule description, up to 200 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="metroCode")
    def metro_code(self) -> Optional[pulumi.Input[str]]:
        """
        ACL template location metro code.
        """
        return pulumi.get(self, "metro_code")

    @metro_code.setter
    def metro_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metro_code", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        ACL template name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _AclTemplateState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 device_acl_status: Optional[pulumi.Input[str]] = None,
                 device_details: Optional[pulumi.Input[Sequence[pulumi.Input['AclTemplateDeviceDetailArgs']]]] = None,
                 device_id: Optional[pulumi.Input[str]] = None,
                 inbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input['AclTemplateInboundRuleArgs']]]] = None,
                 metro_code: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AclTemplate resources.
        :param pulumi.Input[str] description: Inbound rule description, up to 200 characters.
        :param pulumi.Input[str] device_acl_status: Status of ACL template provisioning process, where template was applied.
               One of `PROVISIONING`, `PROVISIONED`.
        :param pulumi.Input[Sequence[pulumi.Input['AclTemplateDeviceDetailArgs']]] device_details: List of the devices where the ACL template is applied.
        :param pulumi.Input[str] device_id: (Deprecated) Identifier of a network device where template was applied.
        :param pulumi.Input[Sequence[pulumi.Input['AclTemplateInboundRuleArgs']]] inbound_rules: One or more rules to specify allowed inbound traffic.
               Rules are ordered, matching traffic rule stops processing subsequent ones.
        :param pulumi.Input[str] metro_code: ACL template location metro code.
        :param pulumi.Input[str] name: ACL template name.
        :param pulumi.Input[str] uuid: Device uuid.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if device_acl_status is not None:
            pulumi.set(__self__, "device_acl_status", device_acl_status)
        if device_details is not None:
            pulumi.set(__self__, "device_details", device_details)
        if device_id is not None:
            warnings.warn("""Refer to device details get device information""", DeprecationWarning)
            pulumi.log.warn("""device_id is deprecated: Refer to device details get device information""")
        if device_id is not None:
            pulumi.set(__self__, "device_id", device_id)
        if inbound_rules is not None:
            pulumi.set(__self__, "inbound_rules", inbound_rules)
        if metro_code is not None:
            warnings.warn("""Metro Code is no longer required""", DeprecationWarning)
            pulumi.log.warn("""metro_code is deprecated: Metro Code is no longer required""")
        if metro_code is not None:
            pulumi.set(__self__, "metro_code", metro_code)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Inbound rule description, up to 200 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="deviceAclStatus")
    def device_acl_status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of ACL template provisioning process, where template was applied.
        One of `PROVISIONING`, `PROVISIONED`.
        """
        return pulumi.get(self, "device_acl_status")

    @device_acl_status.setter
    def device_acl_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_acl_status", value)

    @property
    @pulumi.getter(name="deviceDetails")
    def device_details(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AclTemplateDeviceDetailArgs']]]]:
        """
        List of the devices where the ACL template is applied.
        """
        return pulumi.get(self, "device_details")

    @device_details.setter
    def device_details(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AclTemplateDeviceDetailArgs']]]]):
        pulumi.set(self, "device_details", value)

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> Optional[pulumi.Input[str]]:
        """
        (Deprecated) Identifier of a network device where template was applied.
        """
        return pulumi.get(self, "device_id")

    @device_id.setter
    def device_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_id", value)

    @property
    @pulumi.getter(name="inboundRules")
    def inbound_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AclTemplateInboundRuleArgs']]]]:
        """
        One or more rules to specify allowed inbound traffic.
        Rules are ordered, matching traffic rule stops processing subsequent ones.
        """
        return pulumi.get(self, "inbound_rules")

    @inbound_rules.setter
    def inbound_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AclTemplateInboundRuleArgs']]]]):
        pulumi.set(self, "inbound_rules", value)

    @property
    @pulumi.getter(name="metroCode")
    def metro_code(self) -> Optional[pulumi.Input[str]]:
        """
        ACL template location metro code.
        """
        return pulumi.get(self, "metro_code")

    @metro_code.setter
    def metro_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metro_code", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        ACL template name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        """
        Device uuid.
        """
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


class AclTemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 inbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclTemplateInboundRuleArgs']]]]] = None,
                 metro_code: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource `networkedge.AclTemplate` allows creation and management of
        Equinix Network Edge device Access Control List templates.

        Device ACL templates give possibility to define set of rules will allowed inbound
        traffic. Templates can be assigned to the network devices.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_equinix as equinix

        # Creates ACL template and assigns it to the network device
        myacl = equinix.networkedge.AclTemplate("myacl",
            description="Test ACL template",
            inbound_rules=[
                equinix.networkedge.AclTemplateInboundRuleArgs(
                    description="inbound rule description",
                    dst_port="any",
                    protocol="IP",
                    src_port="any",
                    subnet="1.1.1.1/32",
                ),
                equinix.networkedge.AclTemplateInboundRuleArgs(
                    dst_port="53,1045,2041",
                    protocol="UDP",
                    src_port="any",
                    subnet="172.16.25.0/24",
                ),
            ])
        ```

        ## Import

        This resource can be imported using an existing ID

        ```sh
         $ pulumi import equinix:networkedge/aclTemplate:AclTemplate example {existing_id}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Inbound rule description, up to 200 characters.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclTemplateInboundRuleArgs']]]] inbound_rules: One or more rules to specify allowed inbound traffic.
               Rules are ordered, matching traffic rule stops processing subsequent ones.
        :param pulumi.Input[str] metro_code: ACL template location metro code.
        :param pulumi.Input[str] name: ACL template name.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AclTemplateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource `networkedge.AclTemplate` allows creation and management of
        Equinix Network Edge device Access Control List templates.

        Device ACL templates give possibility to define set of rules will allowed inbound
        traffic. Templates can be assigned to the network devices.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_equinix as equinix

        # Creates ACL template and assigns it to the network device
        myacl = equinix.networkedge.AclTemplate("myacl",
            description="Test ACL template",
            inbound_rules=[
                equinix.networkedge.AclTemplateInboundRuleArgs(
                    description="inbound rule description",
                    dst_port="any",
                    protocol="IP",
                    src_port="any",
                    subnet="1.1.1.1/32",
                ),
                equinix.networkedge.AclTemplateInboundRuleArgs(
                    dst_port="53,1045,2041",
                    protocol="UDP",
                    src_port="any",
                    subnet="172.16.25.0/24",
                ),
            ])
        ```

        ## Import

        This resource can be imported using an existing ID

        ```sh
         $ pulumi import equinix:networkedge/aclTemplate:AclTemplate example {existing_id}
        ```

        :param str resource_name: The name of the resource.
        :param AclTemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AclTemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 inbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclTemplateInboundRuleArgs']]]]] = None,
                 metro_code: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AclTemplateArgs.__new__(AclTemplateArgs)

            __props__.__dict__["description"] = description
            if inbound_rules is None and not opts.urn:
                raise TypeError("Missing required property 'inbound_rules'")
            __props__.__dict__["inbound_rules"] = inbound_rules
            if metro_code is not None and not opts.urn:
                warnings.warn("""Metro Code is no longer required""", DeprecationWarning)
                pulumi.log.warn("""metro_code is deprecated: Metro Code is no longer required""")
            __props__.__dict__["metro_code"] = metro_code
            __props__.__dict__["name"] = name
            __props__.__dict__["device_acl_status"] = None
            __props__.__dict__["device_details"] = None
            __props__.__dict__["device_id"] = None
            __props__.__dict__["uuid"] = None
        super(AclTemplate, __self__).__init__(
            'equinix:networkedge/aclTemplate:AclTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            device_acl_status: Optional[pulumi.Input[str]] = None,
            device_details: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclTemplateDeviceDetailArgs']]]]] = None,
            device_id: Optional[pulumi.Input[str]] = None,
            inbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclTemplateInboundRuleArgs']]]]] = None,
            metro_code: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            uuid: Optional[pulumi.Input[str]] = None) -> 'AclTemplate':
        """
        Get an existing AclTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Inbound rule description, up to 200 characters.
        :param pulumi.Input[str] device_acl_status: Status of ACL template provisioning process, where template was applied.
               One of `PROVISIONING`, `PROVISIONED`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclTemplateDeviceDetailArgs']]]] device_details: List of the devices where the ACL template is applied.
        :param pulumi.Input[str] device_id: (Deprecated) Identifier of a network device where template was applied.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclTemplateInboundRuleArgs']]]] inbound_rules: One or more rules to specify allowed inbound traffic.
               Rules are ordered, matching traffic rule stops processing subsequent ones.
        :param pulumi.Input[str] metro_code: ACL template location metro code.
        :param pulumi.Input[str] name: ACL template name.
        :param pulumi.Input[str] uuid: Device uuid.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AclTemplateState.__new__(_AclTemplateState)

        __props__.__dict__["description"] = description
        __props__.__dict__["device_acl_status"] = device_acl_status
        __props__.__dict__["device_details"] = device_details
        __props__.__dict__["device_id"] = device_id
        __props__.__dict__["inbound_rules"] = inbound_rules
        __props__.__dict__["metro_code"] = metro_code
        __props__.__dict__["name"] = name
        __props__.__dict__["uuid"] = uuid
        return AclTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Inbound rule description, up to 200 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="deviceAclStatus")
    def device_acl_status(self) -> pulumi.Output[str]:
        """
        Status of ACL template provisioning process, where template was applied.
        One of `PROVISIONING`, `PROVISIONED`.
        """
        return pulumi.get(self, "device_acl_status")

    @property
    @pulumi.getter(name="deviceDetails")
    def device_details(self) -> pulumi.Output[Sequence['outputs.AclTemplateDeviceDetail']]:
        """
        List of the devices where the ACL template is applied.
        """
        return pulumi.get(self, "device_details")

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> pulumi.Output[str]:
        """
        (Deprecated) Identifier of a network device where template was applied.
        """
        return pulumi.get(self, "device_id")

    @property
    @pulumi.getter(name="inboundRules")
    def inbound_rules(self) -> pulumi.Output[Sequence['outputs.AclTemplateInboundRule']]:
        """
        One or more rules to specify allowed inbound traffic.
        Rules are ordered, matching traffic rule stops processing subsequent ones.
        """
        return pulumi.get(self, "inbound_rules")

    @property
    @pulumi.getter(name="metroCode")
    def metro_code(self) -> pulumi.Output[Optional[str]]:
        """
        ACL template location metro code.
        """
        return pulumi.get(self, "metro_code")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        ACL template name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def uuid(self) -> pulumi.Output[str]:
        """
        Device uuid.
        """
        return pulumi.get(self, "uuid")

