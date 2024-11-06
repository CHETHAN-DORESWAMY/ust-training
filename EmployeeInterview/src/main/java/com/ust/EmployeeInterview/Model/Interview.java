package com.ust.EmployeeInterview.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.GenerationType;


@Entity
@Table(name = "Interview")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Interview {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long interviewId;
    @OneToOne
    @JoinColumn(name = "projectId", nullable = false)
    private Project project;
    private String InterviewInfo;
}
