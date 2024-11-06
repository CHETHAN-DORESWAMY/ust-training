package com.ust.spring_sec_demo2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "projectInfo")
public class ProjectInfo {

    private int pid;
    private String projectName;
    private String technology;
    private String manager;
}
