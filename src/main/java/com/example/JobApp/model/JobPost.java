package com.example.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Component
public class JobPost {
    private int PostId;
    private String PostProfile;
    private String PostDesc;
    private int reqExperience;
    private List<String> postTechStack;
}
