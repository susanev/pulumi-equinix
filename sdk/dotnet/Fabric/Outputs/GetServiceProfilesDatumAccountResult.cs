// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Outputs
{

    [OutputType]
    public sealed class GetServiceProfilesDatumAccountResult
    {
        public readonly string AccountName;
        public readonly int AccountNumber;
        public readonly string GlobalCustId;
        public readonly string GlobalOrgId;
        public readonly string GlobalOrganizationName;
        public readonly int OrgId;
        public readonly string OrganizationName;
        public readonly string UcmId;

        [OutputConstructor]
        private GetServiceProfilesDatumAccountResult(
            string accountName,

            int accountNumber,

            string globalCustId,

            string globalOrgId,

            string globalOrganizationName,

            int orgId,

            string organizationName,

            string ucmId)
        {
            AccountName = accountName;
            AccountNumber = accountNumber;
            GlobalCustId = globalCustId;
            GlobalOrgId = globalOrgId;
            GlobalOrganizationName = globalOrganizationName;
            OrgId = orgId;
            OrganizationName = organizationName;
            UcmId = ucmId;
        }
    }
}
