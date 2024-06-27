package com.example.web_application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "DH_ORGANIZATION_TB", schema = AntechEntity.DARKHORSE)
public class Organization {

    @Id
    @Column(name = "ORGANIZATION_ID", nullable = false)
    private Long organizationId;

    @Column(name = "ORGANIZATION_NAME", nullable = false, length = 100)
    private String organizationName;

    @Column(name = "ORGANIZATION_TAX_ID")
    private Long organizationTaxId;

    @Column(name = "ORGANIZATION_EXEMPT_ID")
    private Long organizationExemptId;

    @Column(name = "ORGANIZATION_TYPE", length = 25)
    private String organizationType;

    @Column(name = "ORG_URL", length = 100)
    private String orgUrl;

    @Column(name = "ORG_DESCRIPTION", length = 1000)
    private String orgDescription;

    @Column(name = "HOURS_OF_OPER", length = 50)
    private String hoursOfOper;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "PARENT_ORG_ID")
    private Long parentOrgId;

    @Column(name = "ORGANIZATION_TM", length = 1)
    private String organizationTm;

    @Column(name = "EMAIL_ADDRESS", length = 100)
    private String emailAddress;

    @Column(name = "PRIMARY_ADDRESS")
    private Long primaryAddress;

    @Column(name = "PRIMARY_PHONE")
    private Long primaryPhone;

    @Column(name = "INSTANTIATE_TYPE", length = 1)
    private String instantiateType;

    @Column(name = "PRIVATE_FLAG")
    private Boolean privateFlag;

    @Column(name = "CREATED_BY", length = 50)
    private String createdBy;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "UPDATED_BY", length = 50)
    private String updatedBy;

    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    @Column(name = "DELETED_STATUS", length = 1)
    private String deletedStatus;

    @Column(name = "ENTITY_TYPE", length = 100)
    private String entityType;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

    @Column(name = "FOLLOW_UP_DAYS")
    private Integer followUpDays;

    @Column(name = "ACCOUNT_ID")
    private Long accountId;

    @Column(name = "TIME_ZONE", length = 40)
    private String timeZone;

    @Column(name = "COMMISSION_ID")
    private Long commissionId;

    @Column(name = "DISCOUNT_ID")
    private Long discountId;

    @Column(name = "FAX_PRACTITIONER")
    private Boolean faxPractitioner;

    @Column(name = "CORPORATE_ID")
    private Long corporateId;

    @Column(name = "USE_CORPORATE_CARD")
    private Boolean useCorporateCard;

    @Column(name = "LOGO_ID")
    private Long logoId;

    @Column(name = "BILLING_LOGO_ID")
    private Long billingLogoId;

    @Column(name = "AE_TITLE", length = 20)
    private String aeTitle;

    @Column(name = "CLINIC_UID", length = 50)
    private String clinicUid;

    @Column(name = "ALLOW_SHARES")
    private Boolean allowShares;

    @Column(name = "SOUND_ID")
    private Long soundId;

    @Column(name = "PRIMARY_TECH")
    private Long primaryTech;

    @Column(name = "LICENSED")
    private Boolean licensed;

    @Column(name = "PAY_PER_CLICK")
    private Boolean payPerClick;

    @Column(name = "PAY_PER_CLICK_AMOUNT", precision = 5, scale = 2)
    private Double payPerClickAmount;

    @Column(name = "HEADER_LOGO_FILENAME", length = 100)
    private String headerLogoFilename;

    @Column(name = "BILLING_LOGO_FILENAME", length = 100)
    private String billingLogoFilename;

    @Column(name = "REPORT_LOGO_FILENAME", length = 100)
    private String reportLogoFilename;

    @Column(name = "SOUND_ASSURED")
    private Boolean soundAssured;

    @Column(name = "USE_WEB_QUERY")
    private Boolean useWebQuery;

    @Column(name = "AUTOFORWARD_TO_FUSION")
    private Boolean autoforwardToFusion;

    @Column(name = "DONT_BIND_PATIENT_IDS")
    private Boolean dontBindPatientIds;

    @Column(name = "CLIENTID")
    private Long clientId;

    @Column(name = "STORAGE_NOTIF_EMAIL_ADDRS", length = 300)
    private String storageNotifEmailAddrs;

    @Column(name = "WAIT_HOURS_MISSING_STUDY")
    private Integer waitHoursMissingStudy;

    @Column(name = "STORAGE_TYPE", length = 50, nullable = false)
    private String storageType;

    @Column(name = "LEAD_ORIGIN", length = 75)
    private String leadOrigin;

    @Column(name = "ANTECH_REGION", length = 50)
    private String antechRegion;

    @Column(name = "DEFAULT_EQUIPMENT_DRCR", length = 75)
    private String defaultEquipmentDrcr;

    @Column(name = "DEFAULT_EQUIPMENT_CT", length = 75)
    private String defaultEquipmentCt;

    @Column(name = "DEFAULT_EQUIPMENT_MRI", length = 75)
    private String defaultEquipmentMri;

    @Column(name = "DEFAULT_EQUIPMENT_US", length = 75)
    private String defaultEquipmentUs;

    @Column(name = "DEFAULT_EQUIPMENT_SCANNER", length = 75)
    private String defaultEquipmentScanner;

    @Column(name = "SALESPERSON_ID")
    private Long salespersonId;

    @Column(name = "ANTECH_ACCOUNT_ID")
    private Long antechAccountId;

    @Column(name = "AIS_ACCOUNT_ID")
    private Long aisAccountId;

    @Column(name = "CORPORATE_HTML_SEARCH")
    private Boolean corporateHtmlSearch;

    @Column(name = "TROUBLE_CLINIC")
    private Boolean troubleClinic;

    @Column(name = "CERTIFICATION_FEE", precision = 5, scale = 2)
    private Double certificationFee;

    @Column(name = "SEARCH_INCLUDE_LAST_NAME")
    private Boolean searchIncludeLastName;

    @Column(name = "FOLLOWUP_DAYS")
    private Integer followupDays;

    @Column(name = "WOOFPACS_IDENTIFIER", length = 20)
    private String woofpacsIdentifier;

    @Column(name = "EMAIL_RETENTION_PERIOD")
    private Integer emailRetentionPeriod;

    @Column(name = "MAX_ORTHO_USERS")
    private Integer maxOrthoUsers;

    @Column(name = "FEE_SCHEDULE_ID")
    private Integer feeScheduleId;

    @Column(name = "ANONYMIZE_IMAGES")
    private Boolean anonymizeImages;

    @Column(name = "TIER_LEVEL", length = 8, nullable = false)
    private String tierLevel;

    // Getters and setters

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Long getOrganizationTaxId() {
        return organizationTaxId;
    }

    public void setOrganizationTaxId(Long organizationTaxId) {
        this.organizationTaxId = organizationTaxId;
    }

    public Long getOrganizationExemptId() {
        return organizationExemptId;
    }

    public void setOrganizationExemptId(Long organizationExemptId) {
        this.organizationExemptId = organizationExemptId;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getOrgUrl() {
        return orgUrl;
    }

    public void setOrgUrl(String orgUrl) {
        this.orgUrl = orgUrl;
    }

    public String getOrgDescription() {
        return orgDescription;
    }

    public void setOrgDescription(String orgDescription) {
        this.orgDescription = orgDescription;
    }

    public String getHoursOfOper() {
        return hoursOfOper;
    }

    public void setHoursOfOper(String hoursOfOper) {
        this.hoursOfOper = hoursOfOper;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getParentOrgId() {
        return parentOrgId;
    }

    public void setParentOrgId(Long parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    public String getOrganizationTm() {
        return organizationTm;
    }

    public void setOrganizationTm(String organizationTm) {
        this.organizationTm = organizationTm;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Long getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(Long primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public Long getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(Long primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public String getInstantiateType() {
        return instantiateType;
    }

    public void setInstantiateType(String instantiateType) {
        this.instantiateType = instantiateType;
    }

    public Boolean getPrivateFlag() {
        return privateFlag;
    }

    public void setPrivateFlag(Boolean privateFlag) {
        this.privateFlag = privateFlag;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getFollowUpDays() {
        return followUpDays;
    }

    public void setFollowUpDays(Integer followUpDays) {
        this.followUpDays = followUpDays;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Long getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Long commissionId) {
        this.commissionId = commissionId;
    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Boolean getFaxPractitioner() {
        return faxPractitioner;
    }

    public void setFaxPractitioner(Boolean faxPractitioner) {
        this.faxPractitioner = faxPractitioner;
    }

    public Long getCorporateId() {
        return corporateId;
    }

    public void setCorporateId(Long corporateId) {
        this.corporateId = corporateId;
    }

    public Boolean getUseCorporateCard() {
        return useCorporateCard;
    }

    public void setUseCorporateCard(Boolean useCorporateCard) {
        this.useCorporateCard = useCorporateCard;
    }

    public Long getLogoId() {
        return logoId;
    }

    public void setLogoId(Long logoId) {
        this.logoId = logoId;
    }

    public Long getBillingLogoId() {
        return billingLogoId;
    }

    public void setBillingLogoId(Long billingLogoId) {
        this.billingLogoId = billingLogoId;
    }

    public String getAeTitle() {
        return aeTitle;
    }

    public void setAeTitle(String aeTitle) {
        this.aeTitle = aeTitle;
    }

    public String getClinicUid() {
        return clinicUid;
    }

    public void setClinicUid(String clinicUid) {
        this.clinicUid = clinicUid;
    }

    public Boolean getAllowShares() {
        return allowShares;
    }

    public void setAllowShares(Boolean allowShares) {
        this.allowShares = allowShares;
    }

    public Long getSoundId() {
        return soundId;
    }

    public void setSoundId(Long soundId) {
        this.soundId = soundId;
    }

    public Long getPrimaryTech() {
        return primaryTech;
    }

    public void setPrimaryTech(Long primaryTech) {
        this.primaryTech = primaryTech;
    }

    public Boolean getLicensed() {
        return licensed;
    }

    public void setLicensed(Boolean licensed) {
        this.licensed = licensed;
    }

    public Boolean getPayPerClick() {
        return payPerClick;
    }

    public void setPayPerClick(Boolean payPerClick) {
        this.payPerClick = payPerClick;
    }

    public Double getPayPerClickAmount() {
        return payPerClickAmount;
    }

    public void setPayPerClickAmount(Double payPerClickAmount) {
        this.payPerClickAmount = payPerClickAmount;
    }

    public String getHeaderLogoFilename() {
        return headerLogoFilename;
    }

    public void setHeaderLogoFilename(String headerLogoFilename) {
        this.headerLogoFilename = headerLogoFilename;
    }

    public String getBillingLogoFilename() {
        return billingLogoFilename;
    }

    public void setBillingLogoFilename(String billingLogoFilename) {
        this.billingLogoFilename = billingLogoFilename;
    }

    public String getReportLogoFilename() {
        return reportLogoFilename;
    }

    public void setReportLogoFilename(String reportLogoFilename) {
        this.reportLogoFilename = reportLogoFilename;
    }

    public Boolean getSoundAssured() {
        return soundAssured;
    }

    public void setSoundAssured(Boolean soundAssured) {
        this.soundAssured = soundAssured;
    }

    public Boolean getUseWebQuery() {
        return useWebQuery;
    }

    public void setUseWebQuery(Boolean useWebQuery) {
        this.useWebQuery = useWebQuery;
    }

    public Boolean getAutoforwardToFusion() {
        return autoforwardToFusion;
    }

    public void setAutoforwardToFusion(Boolean autoforwardToFusion) {
        this.autoforwardToFusion = autoforwardToFusion;
    }

    public Boolean getDontBindPatientIds() {
        return dontBindPatientIds;
    }

    public void setDontBindPatientIds(Boolean dontBindPatientIds) {
        this.dontBindPatientIds = dontBindPatientIds;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getStorageNotifEmailAddrs() {
        return storageNotifEmailAddrs;
    }

    public void setStorageNotifEmailAddrs(String storageNotifEmailAddrs) {
        this.storageNotifEmailAddrs = storageNotifEmailAddrs;
    }

    public Integer getWaitHoursMissingStudy() {
        return waitHoursMissingStudy;
    }

    public void setWaitHoursMissingStudy(Integer waitHoursMissingStudy) {
        this.waitHoursMissingStudy = waitHoursMissingStudy;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getLeadOrigin() {
        return leadOrigin;
    }

    public void setLeadOrigin(String leadOrigin) {
        this.leadOrigin = leadOrigin;
    }

    public String getAntechRegion() {
        return antechRegion;
    }

    public void setAntechRegion(String antechRegion) {
        this.antechRegion = antechRegion;
    }

    public String getDefaultEquipmentDrcr() {
        return defaultEquipmentDrcr;
    }

    public void setDefaultEquipmentDrcr(String defaultEquipmentDrcr) {
        this.defaultEquipmentDrcr = defaultEquipmentDrcr;
    }

    public String getDefaultEquipmentCt() {
        return defaultEquipmentCt;
    }

    public void setDefaultEquipmentCt(String defaultEquipmentCt) {
        this.defaultEquipmentCt = defaultEquipmentCt;
    }

    public String getDefaultEquipmentMri() {
        return defaultEquipmentMri;
    }

    public void setDefaultEquipmentMri(String defaultEquipmentMri) {
        this.defaultEquipmentMri = defaultEquipmentMri;
    }

    public String getDefaultEquipmentUs() {
        return defaultEquipmentUs;
    }

    public void setDefaultEquipmentUs(String defaultEquipmentUs) {
        this.defaultEquipmentUs = defaultEquipmentUs;
    }

    public String getDefaultEquipmentScanner() {
        return defaultEquipmentScanner;
    }

    public void setDefaultEquipmentScanner(String defaultEquipmentScanner) {
        this.defaultEquipmentScanner = defaultEquipmentScanner;
    }

    public Long getSalespersonId() {
        return salespersonId;
    }

    public void setSalespersonId(Long salespersonId) {
        this.salespersonId = salespersonId;
    }

    public Long getAntechAccountId() {
        return antechAccountId;
    }

    public void setAntechAccountId(Long antechAccountId) {
        this.antechAccountId = antechAccountId;
    }

    public Long getAisAccountId() {
        return aisAccountId;
    }

    public void setAisAccountId(Long aisAccountId) {
        this.aisAccountId = aisAccountId;
    }

    public Boolean getCorporateHtmlSearch() {
        return corporateHtmlSearch;
    }

    public void setCorporateHtmlSearch(Boolean corporateHtmlSearch) {
        this.corporateHtmlSearch = corporateHtmlSearch;
    }

    public Boolean getTroubleClinic() {
        return troubleClinic;
    }

    public void setTroubleClinic(Boolean troubleClinic) {
        this.troubleClinic = troubleClinic;
    }

    public Double getCertificationFee() {
        return certificationFee;
    }

    public void setCertificationFee(Double certificationFee) {
        this.certificationFee = certificationFee;
    }

    public Boolean getSearchIncludeLastName() {
        return searchIncludeLastName;
    }

    public void setSearchIncludeLastName(Boolean searchIncludeLastName) {
        this.searchIncludeLastName = searchIncludeLastName;
    }

    public Integer getFollowupDays() {
        return followupDays;
    }

    public void setFollowupDays(Integer followupDays) {
        this.followupDays = followupDays;
    }

    public String getWoofpacsIdentifier() {
        return woofpacsIdentifier;
    }

    public void setWoofpacsIdentifier(String woofpacsIdentifier) {
        this.woofpacsIdentifier = woofpacsIdentifier;
    }

    public Integer getEmailRetentionPeriod() {
        return emailRetentionPeriod;
    }

    public void setEmailRetentionPeriod(Integer emailRetentionPeriod) {
        this.emailRetentionPeriod = emailRetentionPeriod;
    }

    public Integer getMaxOrthoUsers() {
        return maxOrthoUsers;
    }

    public void setMaxOrthoUsers(Integer maxOrthoUsers) {
        this.maxOrthoUsers = maxOrthoUsers;
    }

    public Integer getFeeScheduleId() {
        return feeScheduleId;
    }

    public void setFeeScheduleId(Integer feeScheduleId) {
        this.feeScheduleId = feeScheduleId;
    }

    public Boolean getAnonymizeImages() {
        return anonymizeImages;
    }

    public void setAnonymizeImages(Boolean anonymizeImages) {
        this.anonymizeImages = anonymizeImages;
    }

    public String getTierLevel() {
        return tierLevel;
    }

    public void setTierLevel(String tierLevel) {
        this.tierLevel = tierLevel;
    }
}
