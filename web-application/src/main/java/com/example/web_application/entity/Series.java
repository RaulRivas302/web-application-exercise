package com.example.web_application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.sql.Timestamp;

@Entity
@Table(name = "DH_SERIES_INSTANCE_TB", schema = AntechEntity.DARKHORSE)
public class Series {

    @Id
    @Column(name = "SERIES_ID")
    private Long id;

    @Column(name = "CONSULTATION_ID")
    private Long consultationId;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_DATE")
    private Timestamp createdDate;

    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @Column(name = "UPDATED_DATE")
    private Timestamp updatedDate;

    @Column(name = "DELETED_STATUS")
    private String deletedStatus;

    @Column(name = "SERIES_DATE_TIME")
    private Timestamp seriesDateTime;

    @Column(name = "STUDY_TYPE")
    private String studyType;

    @Column(name = "STUDY_UID")
    private String studyUid;

    @Column(name = "SERIES_UID")
    private String seriesUid;

    @Column(name = "PATIENT_ID")
    private Long patientId;

    @Column(name = "STUDY_ID")
    private Long studyId;

    @Column(name = "NUM_FILES")
    private Integer numFiles;

    @Column(name = "STUDY_INSTANCE_UID")
    private String studyInstanceUid;

    @Column(name = "SERIES_DESCRIPTION")
    private String seriesDescription;

    @Column(name = "INSTITUTION_NAME")
    private String institutionName;

    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;

    @Column(name = "BODY_PART_EXAMINED")
    private String bodyPartExamined;

    @Column(name = "STATION_NAME")
    private String stationName;

    @Column(name = "SERIES_NUMBER")
    private Integer seriesNumber;

    @Column(name = "LATERALITY")
    private String laterality;

    @Column(name = "HEADER_LOCATION")
    private String headerLocation;

    @Column(name = "HEADER_VOLUME_ID")
    private Long headerVolumeId;

    @Column(name = "ORIGINAL_SERIES_ID")
    private Long originalSeriesId;

    @Column(name = "ORIGINAL_INSTANCE_UID")
    private String originalInstanceId;

    @Column(name = "IS_DICOM")
    private Integer isDicom;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(Long consultationId) {
        this.consultationId = consultationId;
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

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public Timestamp getSeriesDateTime() {
        return seriesDateTime;
    }

    public void setSeriesDateTime(Timestamp seriesDateTime) {
        this.seriesDateTime = seriesDateTime;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    public String getStudyUid() {
        return studyUid;
    }

    public void setStudyUid(String studyUid) {
        this.studyUid = studyUid;
    }

    public String getSeriesUid() {
        return seriesUid;
    }

    public void setSeriesUid(String seriesUid) {
        this.seriesUid = seriesUid;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getStudyId() {
        return studyId;
    }

    public void setStudyId(Long studyId) {
        this.studyId = studyId;
    }

    public Integer getNumFiles() {
        return numFiles;
    }

    public void setNumFiles(Integer numFiles) {
        this.numFiles = numFiles;
    }

    public String getStudyInstanceUid() {
        return studyInstanceUid;
    }

    public void setStudyInstanceUid(String studyInstanceUid) {
        this.studyInstanceUid = studyInstanceUid;
    }

    public String getSeriesDescription() {
        return seriesDescription;
    }

    public void setSeriesDescription(String seriesDescription) {
        this.seriesDescription = seriesDescription;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getBodyPartExamined() {
        return bodyPartExamined;
    }

    public void setBodyPartExamined(String bodyPartExamined) {
        this.bodyPartExamined = bodyPartExamined;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(Integer seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public String getLaterality() {
        return laterality;
    }

    public void setLaterality(String laterality) {
        this.laterality = laterality;
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

    public Long getOriginalSeriesId() {
        return originalSeriesId;
    }

    public void setOriginalSeriesId(Long originalSeriesId) {
        this.originalSeriesId = originalSeriesId;
    }

    public String getOriginalInstanceId() {
        return originalInstanceId;
    }

    public void setOriginalInstanceId(String originalInstanceId) {
        this.originalInstanceId = originalInstanceId;
    }

    public Integer getIsDicom() {
        return isDicom;
    }

    public void setIsDicom(Integer isDicom) {
        this.isDicom = isDicom;
    }
}
