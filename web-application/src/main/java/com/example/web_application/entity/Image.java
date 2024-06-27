package com.example.web_application.entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "DH_IMAGE_TB", schema = AntechEntity.DARKHORSE)
public class Image {

    @Id
    @Column(name = "IMAGE_ID", nullable = false)
    private Long id;

    @Column(name = "IMAGE_LOCATION")
    private String location;

    @Column(name = "IMAGE_TEXT")
    private String text;

    @Column(name = "IMAGE_DESCRIPTION")
    private String description;

    @Column(name = "IMAGE_NAME")
    private String name;

    @Column(name = "IMAGE_TYPE_ID")
    private Long typeId;

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

    @Column(name = "ENTITY_TYPE")
    private String entityType;

    @Column(name = "KB_SIZE")
    private Double size;

    @Column(name = "IS_PRESENT")
    private Integer isPresent;

    @Column(name = "IMAGE_TYPE")
    private String imageType;

    @Column(name = "IMAGE_COMMENTS")
    private String imageComments;

    @Column(name = "IS_SELECTED")
    private Integer isSelected;

    @Column(name = "SELECTED_FRAME")
    private Integer selectedFrame;

    @Column(name = "NUMBER_OF_FRAMES")
    private Integer numberOfFrames;

    @Column(name = "STUDY_DATE")
    private String studyDate;

    @Column(name = "STUDY_TYPE")
    private String studyType;

    @Column(name = "TO_ACTIVE")
    private Integer toActive;

    @Column(name = "SET_NUMBER")
    private Integer setNumber;

    @Column(name = "TAGS")
    private String tags;

    @Column(name = "STUDY_UID")
    private String studyUid;

    @Column(name = "SERIES_UID")
    private String seriesUid;

    @Column(name = "PATIENT_NAME")
    private String patientName;

    @Column(name = "PATIENT_ID")
    private Long patientId;

    @Column(name = "SOP_INSTANCE_UID")
    private String sopInstanceUid;

    @Column(name = "SOUND_GUID")
    private String soundGuid;

    @Column(name = "WEB_CODE")
    private String webCode;

    @Column(name = "IS_SOUNDSAFE")
    private Integer isSoundSafe;

    @Column(name = "EXAM_GUID")
    private String examGuid;

    @Column(name = "SERIES_ID")
    private Long seriesId;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
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

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getIsPresent() {
        return isPresent;
    }

    public void setIsPresent(Integer isPresent) {
        this.isPresent = isPresent;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getImageComments() {
        return imageComments;
    }

    public void setImageComments(String imageComments) {
        this.imageComments = imageComments;
    }

    public Integer getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Integer isSelected) {
        this.isSelected = isSelected;
    }

    public Integer getSelectedFrame() {
        return selectedFrame;
    }

    public void setSelectedFrame(Integer selectedFrame) {
        this.selectedFrame = selectedFrame;
    }

    public Integer getNumberOfFrames() {
        return numberOfFrames;
    }

    public void setNumberOfFrames(Integer numberOfFrames) {
        this.numberOfFrames = numberOfFrames;
    }

    public String getStudyDate() {
        return studyDate;
    }

    public void setStudyDate(String studyDate) {
        this.studyDate = studyDate;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    public Integer getToActive() {
        return toActive;
    }

    public void setToActive(Integer toActive) {
        this.toActive = toActive;
    }

    public Integer getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(Integer setNumber) {
        this.setNumber = setNumber;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getSopInstanceUid() {
        return sopInstanceUid;
    }

    public void setSopInstanceUid(String sopInstanceUid) {
        this.sopInstanceUid = sopInstanceUid;
    }

    public String getSoundGuid() {
        return soundGuid;
    }

    public void setSoundGuid(String soundGuid) {
        this.soundGuid = soundGuid;
    }

    public String getWebCode() {
        return webCode;
    }

    public void setWebCode(String webCode) {
        this.webCode = webCode;
    }

    public Integer getIsSoundSafe() {
        return isSoundSafe;
    }

    public void setIsSoundSafe(Integer isSoundSafe) {
        this.isSoundSafe = isSoundSafe;
    }

    public String getExamGuid() {
        return examGuid;
    }

    public void setExamGuid(String examGuid) {
        this.examGuid = examGuid;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }
}
