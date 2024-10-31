package my.resume.Spring.service;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import my.resume.Spring.model.WorkExperience;

public class WorkExperienceUtility {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("MMM yyyy");
    
    public static String formatDate(LocalDate date){
        return date.format(DATE_FORMATTER);
    }
    
    //Helper Method for WorkExperience layout of employer, role and dates
    public static String formatWorkExpE_R_D(WorkExperience experience) {
        return String.format("""
                %s 
                $s 
                %s - %s
                """, experience.getEmployer(), experience.getRole(), experience.getStartDate(), experience.getEndDate());
       
    }

    //Helper Method for WorkExperience layout of type, data and highlight
    public static String formatWorkExpT_D_H(String workExperienceType, List<String> workExperienceData, String workExperienceHighlight){
        String formattedData = workExperienceData.stream()
                                .map(item -> "- " + item)
                                .collect(Collectors.joining("<br>"));

        return String.format("""
            <div>
                <p style="font -size: 1.2em;"> %s</p>
                <p> <br>%s <p>
                <p><strong>    - %s<p>
            <div>
                """, workExperienceType, formattedData, workExperienceHighlight);
    }
   
    
    

    
    

     
    
}
