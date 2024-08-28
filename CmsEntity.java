package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CmsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long campaign_id;
    private String campaign_name;
    private String description;
    private String start_date;
    private String end_date;
    private String target_audience;
    private String status;
    private String created_at;
    private String updated_at;
    public CmsEntity() {
    }
    
    
    
    public CmsEntity(Long campaign_id, String campaign_name, String description, String start_date, String end_date,
            String target_audience, String status, String created_at, String updated_at) {
        this.campaign_id = campaign_id;
        this.campaign_name = campaign_name;
        this.description = description;
        this.start_date = start_date;
        this.end_date = end_date;
        this.target_audience = target_audience;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }



    public Long getCampaign_id() {
        return campaign_id;
    }
    public void setCampaign_id(Long campaign_id) {
        this.campaign_id = campaign_id;
    }
    public String getCampaign_name() {
        return campaign_name;
    }
    public void setCampaign_name(String campaign_name) {
        this.campaign_name = campaign_name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getStart_date() {
        return start_date;
    }
    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }
    public String getEnd_date() {
        return end_date;
    }
    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
    public String getTarget_audience() {
        return target_audience;
    }
    public void setTarget_audience(String target_audience) {
        this.target_audience = target_audience;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    public String getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
    @Override
    public String toString() {
        return "CmsEntity [campaign_id=" + campaign_id + ", campaign_name=" + campaign_name + ", description="
                + description + ", start_date=" + start_date + ", end_date=" + end_date + ", target_audience="
                + target_audience + ", status=" + status + ", created_at=" + created_at + ", updated_at=" + updated_at
                + "]";
    }
    




}
