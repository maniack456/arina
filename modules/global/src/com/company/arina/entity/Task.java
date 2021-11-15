package com.company.arina.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "ARINA_TASK")
@Entity(name = "arina_Task")
@NamePattern("%s|name")
public class Task extends StandardEntity {
    private static final long serialVersionUID = 9151286905437297181L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ASSIGNEE_ID")
    private User assignee;

    @Column(name = "START_DATE")
    private LocalDateTime startDate;

    @Column(name = "ESTIMATED_EFFORTS")
    private Integer estimatedEfforts;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROGECT_ID")
    private Progect progect;

    public Progect getProgect() {
        return progect;
    }

    public void setProgect(Progect progect) {
        this.progect = progect;
    }

    public Integer getEstimatedEfforts() {
        return estimatedEfforts;
    }

    public void setEstimatedEfforts(Integer estimatedEfforts) {
        this.estimatedEfforts = estimatedEfforts;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}