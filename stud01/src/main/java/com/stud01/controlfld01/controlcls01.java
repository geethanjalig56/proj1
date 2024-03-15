package com.stud01.controlfld01;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stud01.srvfld01.srvcls01;

import java.util.List;

@Controller

public class controlcls01 {
    private final srvcls01 srvcls01obj01;

    //student controller's constructor
    public controlcls01(srvcls01 srvcls01obj02) {
        this.srvcls01obj01 = srvcls01obj02;
    }

    @GetMapping("/")
    public String showStudentSelection(Model model) {
        List<Long> rollNumbers = srvcls01obj01.getAllRollNumbers();
        model.addAttribute("rollNumbers", rollNumbers);
        return "studfrm01";
    }
    
/*    
    @GetMapping("/getStudentName")
@ResponseBody
public String getStudentNameByRollNumber(@RequestParam("rollNumber") Long rollNumber) {
    return srvcls01obj01.getStudentNameByRollNumber(rollNumber);
}
*/
}