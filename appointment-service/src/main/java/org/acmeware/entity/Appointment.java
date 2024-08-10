package org.acmeware.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name ="appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "doctor_id")
    private String doctor;

    @Column(name = "patient_id")
    private String patient;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "hospital")
    private String hospital;

    @Column(name = "clinic")
    private String clinic;

    @Column(name = "paid_free")
    private boolean pairOrFree;

    @Column(name = "done")
    private boolean isDone;

    @Column(name = "cancel")
    private boolean isCancelled;

    @Column(name = "comments")
    private String comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public boolean isPairOrFree() {
        return pairOrFree;
    }

    public void setPairOrFree(boolean pairOrFree) {
        this.pairOrFree = pairOrFree;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
