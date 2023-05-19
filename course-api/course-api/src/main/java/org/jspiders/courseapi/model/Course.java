package org.jspiders.courseapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Course {
    private int batchCode;
    private String subject;
    private String faculty;
    private int totalClasses;

}
