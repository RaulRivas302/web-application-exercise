package com.example.web_application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Table(name = "DH_PATIENT_TB", schema = AntechEntity.DARKHORSE)
public class Patient {

    @Id
    @Column(name = "PATIENT_ID")
    private Long patientId;

    @Column(name = "PATIENT_NAME")
    private String patientName;

    @Column(name = "ORG_ID")
    private Long orgId;

    @Column(name = "DATEOFBIRTH")
    private Date dateOfBirth;

    @Column(name = "SEX")
    private String sex;

    @Column(name = "SPECIES_ID")
    private Long speciesId;

    @Column(name = "EQUINE_HISTORY_ID")
    private Long equineHistoryId;

    @Column(name = "BREED")
    private String breed;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "MICROCHIP_NUMBER")
    private String microchipNumber;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    @Column(name = "DELETED_STATUS")
    private String deletedStatus;

    @Column(name = "ENTITY_TYPE")
    private String entityType;

    @Column(name = "OWNER_FIRST_NAME")
    private String ownerFirstName;

    @Column(name = "OWNER_MIDDLE_NAME")
    private String ownerMiddleName;

    @Column(name = "OWNER_LAST_NAME")
    private String ownerLastName;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "CLIENT_ID")
    private Long clientId;

    @Column(name = "CASE_NUMBER")
    private String caseNumber;

    @Column(name = "PATIENT_UID")
    private String patientUid;

    @Column(name = "TATOO_NUMBER")
    private String tattooNumber;

    @Column(name = "REGISTRATION_NUMBER")
    private String registrationNumber;

    @Column(name = "SIRE_REGISTRATION_NUMBER")
    private String sireRegistrationNumber;

    @Column(name = "DAM_REGISTRATION_NUMBER")
    private String damRegistrationNumber;

    @Column(name = "REGISTERED_NAME")
    private String registeredName;

    @Column(name = "DATEOFBIRTH_STRING")
    private String dateOfBirthString;

    @Column(name = "PENNHIP_ID")
    private String pennhipId;

    @Column(name = "PATIENT_MIDDLE_NAME")
    private String patientMiddleName;

    @Column(name = "PATIENT_NAME_PREFIX")
    private String patientNamePrefix;

    @Column(name = "PATIENT_NAME_SUFFIX")
    private String patientNameSuffix;

    // Getters and Setters
    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(Long speciesId) {
        this.speciesId = speciesId;
    }

    public Long getEquineHistoryId() {
        return equineHistoryId;
    }

    public void setEquineHistoryId(Long equineHistoryId) {
        this.equineHistoryId = equineHistoryId;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMicrochipNumber() {
        return microchipNumber;
    }

    public void setMicrochipNumber(String microchipNumber) {
        this.microchipNumber = microchipNumber;
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

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerMiddleName() {
        return ownerMiddleName;
    }

    public void setOwnerMiddleName(String ownerMiddleName) {
        this.ownerMiddleName = ownerMiddleName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getPatientUid() {
        return patientUid;
    }

    public void setPatientUid(String patientUid) {
        this.patientUid = patientUid;
    }

    public String getTattooNumber() {
        return tattooNumber;
    }

    public void setTattooNumber(String tattooNumber) {
        this.tattooNumber = tattooNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getSireRegistrationNumber() {
        return sireRegistrationNumber;
    }

    public void setSireRegistrationNumber(String sireRegistrationNumber) {
        this.sireRegistrationNumber = sireRegistrationNumber;
    }

    public String getDamRegistrationNumber() {
        return damRegistrationNumber;
    }

    public void setDamRegistrationNumber(String damRegistrationNumber) {
        this.damRegistrationNumber = damRegistrationNumber;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public String getDateOfBirthString() {
        return dateOfBirthString;
    }

    public void setDateOfBirthString(String dateOfBirthString) {
        this.dateOfBirthString = dateOfBirthString;
    }

    public String getPennhipId() {
        return pennhipId;
    }

    public void setPennhipId(String pennhipId) {
        this.pennhipId = pennhipId;
    }

    public String getPatientMiddleName() {
        return patientMiddleName;
    }

    public void setPatientMiddleName(String patientMiddleName) {
        this.patientMiddleName = patientMiddleName;
    }

    public String getPatientNamePrefix() {
        return patientNamePrefix;
    }

    public void setPatientNamePrefix(String patientNamePrefix) {
        this.patientNamePrefix = patientNamePrefix;
    }

    public String getPatientNameSuffix() {
        return patientNameSuffix;
    }

    public void setPatientNameSuffix(String patientNameSuffix) {
        this.patientNameSuffix = patientNameSuffix;
    }
}
