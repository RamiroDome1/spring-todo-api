package com.example.demo;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(length = 500)
    private String description;

    @Column
    private Boolean completed = false;

    @UpdateTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}


//// Entity: Task
//id: Long (Auto-Generated)
//title: String (Not Blank, max 100 chars)
//description: String (Optional, max 500 chars)
//completed: Boolean (default: false)
//createdAt: LocalDateTime (Auto-populated on creation)
//updatedAt: LocalDateTime (Auto-populated on update)