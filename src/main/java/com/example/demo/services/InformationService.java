package com.example.demo.services;
import com.example.demo.domain.InformationDO;
import com.example.demo.domain.StudentDO;

import java.util.List;

public interface InformationService {
     /*information表*/
     List<InformationDO> listInformation();

     /*student表*/
     List<StudentDO>listStudent();
}



