package com.stud01.srvfld01;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stud01.entityfld01.entitycls01;
import com.stud01.repofld01.repocls01;

@Service
public class srvcls01 {
    private final repocls01 repocls01obj01;

    public srvcls01(repocls01 repocls01obj02) {
        this.repocls01obj01 = repocls01obj02;
    }

    public List<Long> getAllRollNumbers() {
        return repocls01obj01.findallrollno01s();
    }

    public String getStudentNameByRollNumber(Long rollNumber) {
        entitycls01 entitycls01obj01  = repocls01obj01.findbyrollno01(rollNumber);
        return (entitycls01obj01 != null) ? entitycls01obj01.getname01() : null;
    }
}