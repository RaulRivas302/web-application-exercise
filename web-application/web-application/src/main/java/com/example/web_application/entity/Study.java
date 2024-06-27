package com.example.web_application.entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "DH_STUDY_INSTANCE_TB", schema = AntechEntity.DARKHORSE)
public class Study {

    @Id
    @Column(name = "STUDY_ID")
    private Long id;

    @Column(name = "STUDY_UID")
    private String studyUid;

    @Column(name = "PATIENT_ID")
    private Long patientId;

    @Column(name = "STUDY_DATE_TIME")
    private Timestamp studyDateTime;

    @Column(name = "WEB_CODE")
    private String webCode;

    @Column(name = "EXAM_GUID")
    private String examGuid;

    @Column(name = "INVOICE_ID")
    private Long invoiceId;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_DATE")
    private Timestamp createdDate;

    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @Column(name = "UPDATED_DATE")
    private Timestamp updatedDate;

    @Column(name = "NUM_FILES")
    private Integer numFiles;

    @Column(name = "DELETED_STATUS")
    private String deletedStatus;

    @Column(name = "CONSULTATION_ID")
    private Long consultationId;

    @Column(name = "PAY_PER_CLICK")
    private Integer payPerClick;

    @Column(name = "ITEM_COST")
    private Double itemCost;

    @Column(name = "SENT_TO_FUSION")
    private Integer sentToFusion;

    @Column(name = "DCM_STUDY_ID")
    private String dcmStudyId;

    @Column(name = "ACCESSION_NUMBER")
    private String accessionNumber;

    @Column(name = "REFERRING_PHYSICIAN")
    private String referringPhysician;

    @Column(name = "STUDY_DESCRIPTION")
    private String studyDescription;

    @Column(name = "SERIES_COUNT")
    private Integer seriesCount;

    @Column(name = "HEADER_LOCATION")
    private String headerLocation;

    @Column(name = "HEADER_VOLUME_ID")
    private Long headerVolumeId;

    @Column(name = "MODALITY")
    private String modality;

    @Column(name = "MANUFACTURER")
    private String manufacturer;

    @Column(name = "MANUFACTURER_MODEL_NAME")
    private String manufacturerModelName;

    @Column(name = "DETECTOR_DESCRIPTION")
    private String detectorDescription;

    @Column(name = "PHYSICIANS_OF_RECORD")
    private String physiciansOfRecord;

    @Column(name = "PATIENT_BREED_DESCRIPTION")
    private String patientBreedDescription;

    @Column(name = "RESPONSIBLE_PERSON")
    private String responsiblePerson;

    @Column(name = "RESPONSIBLE_PERSON_ROLE")
    private String responsiblePersonRole;

    @Column(name = "RESPONSIBLE_ORGANIZATION")
    private String responsibleOrganization;

    @Column(name = "ORIGINAL_STUDY_ID")
    private Long originalStudyId;

    @Column(name = "VISIBILITY")
    private Integer visibility;

    @Column(name = "REMOVED_FROM_WOOFPACS")
    private Integer removedFromWoofpacs;

    @Column(name = "VIDEO_COUNT")
    private Integer videoCount;

    @Column(name = "ORIGINAL_INSTANCE_UID")
    private String originalInstanceUid;

    @Column(name = "STUDY_DATE")
    private String studyDate;

    @Column(name = "STUDY_TIME")
    private String studyTime;

    @Column(name = "RECEIVED_STORAGE_TYPE")
    private String receivedStorageType;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudyUid() {
        return studyUid;
    }

    public void setStudyUid(String studyUid) {
        this.studyUid = studyUid;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Timestamp getStudyDateTime() {
        return studyDateTime;
    }

    public void setStudyDateTime(Timestamp studyDateTime) {
        this.studyDateTime = studyDateTime;
    }

    public String getWebCode() {
        return webCode;
    }

    public void setWebCode(String webCode) {
        this.webCode = webCode;
    }

    public String getExamGuid() {
        return examGuid;
    }

    public void setExamGuid(String examGuid) {
        this.examGuid = examGuid;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Integer getNumFiles() {
        return numFiles;
    }

    public void setNumFiles(Integer numFiles) {
        this.numFiles = numFiles;
    }

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public Long getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(Long consultationId) {
        this.consultationId = consultationId;
    }

    public Integer getPayPerClick() {
        return payPerClick;
    }

    public void setPayPerClick(Integer payPerClick) {
        this.payPerClick = payPerClick;
    }

    public Double getItemCost() {
        return itemCost;
    }

    public void setItemCost(Double itemCost) {
        this.itemCost = itemCost;
    }

    public Integer getSentToFusion() {
        return sentToFusion;
    }

    public void setSentToFusion(Integer sentToFusion) {
        this.sentToFusion = sentToFusion;
    }

    public String getDcmStudyId() {
        return dcmStudyId;
    }

    public void setDcmStudyId(String dcmStudyId) {
        this.dcmStudyId = dcmStudyId;
    }

    public String getAccessionNumber() {
        return accessionNumber;
    }

    public void setAccessionNumber(String accessionNumber) {
        this.accessionNumber = accessionNumber;
    }

    public String getReferringPhysician() {
        return referringPhysician;
    }

    public void setReferringPhysician(String referringPhysician) {
        this.referringPhysician = referringPhysician;
    }

    public String getStudyDescription() {
        return studyDescription;
    }

    public void setStudyDescription(String studyDescription) {
        this.studyDescription = studyDescription;
    }

    public Integer getSeriesCount() {
        return seriesCount;
    }

    public void setSeriesCount(Integer seriesCount) {
        this.seriesCount = seriesCount;
    }

    public String getHeaderLocation() {
        return headerLocation;
    }

    public void setHeaderLocation(String headerLocation) {
        this.headerLocation = headerLocation;
    }

    public Long getHeaderVolumeId() {
        return headerVolumeId;
    }

    public void setHeaderVolumeId(Long headerVolumeId) {
        this.headerVolumeId = headerVolumeId;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerModelName() {
        return manufacturerModelName;
    }

    public void setManufacturerModelName(String manufacturerModelName) {
        this.manufacturerModelName = manufacturerModelName;
    }

    public String getDetectorDescription() {
        return detectorDescription;
    }

    public void setDetectorDescription(String detectorDescription) {
        this.detectorDescription = detectorDescription;
    }

    public String getPhysiciansOfRecord() {
        return physiciansOfRecord;
    }

    public void setPhysiciansOfRecord(String physiciansOfRecord) {
        this.physiciansOfRecord = physiciansOfRecord;
    }

    public String getPatientBreedDescription() {
        return patientBreedDescription;
    }

    public void setPatientBreedDescription(String patientBreedDescription) {
        this.patientBreedDescription = patientBreedDescription;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getResponsiblePersonRole() {
        return responsiblePersonRole;
    }

    public void setResponsiblePersonRole(String responsiblePersonRole) {
        this.responsiblePersonRole = responsiblePersonRole;
    }

    public String getResponsibleOrganization() {
        return responsibleOrganization;
    }

    public void setResponsibleOrganization(String responsibleOrganization) {
        this.responsibleOrganization = responsibleOrganization;
    }

    public Long getOriginalStudyId() {
        return originalStudyId;
    }

    public void setOriginalStudyId(Long originalStudyId) {
        this.originalStudyId = originalStudyId;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getRemovedFromWoofpacs() {
        return removedFromWoofpacs;
    }

    public void setRemovedFromWoofpacs(Integer removedFromWoofpacs) {
        this.removedFromWoofpacs = removedFromWoofpacs;
    }

    public Integer getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
    }

    public String getOriginalInstanceUid() {
        return originalInstanceUid;
    }

    public void setOriginalInstanceUid(String originalInstanceUid) {
        this.originalInstanceUid = originalInstanceUid;
    }

    public String getStudyDate() {
        return studyDate;
    }

    public void setStudyDate(String studyDate) {
        this.studyDate = studyDate;
    }

    public String getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(String studyTime) {
        this.studyTime = studyTime;
    }

    public String getReceivedStorageType() {
        return receivedStorageType;
    }

    public void setReceivedStorageType(String receivedStorageType) {
        this.receivedStorageType = receivedStorageType;
    }
}
