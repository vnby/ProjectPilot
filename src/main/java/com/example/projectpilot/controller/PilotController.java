package com.example.projectpilot.controller;

import java.util.List;

import com.example.projectpilot.model.PilotModel;
import com.example.projectpilot.service.PilotService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PilotController {
    @Autowired
    private  PilotService pilotService;

    public PilotController(PilotService pilotService) {
        this.pilotService = pilotService;
    }

    @RequestMapping("/pilot/add")
    public String add(@RequestParam(value = "id", required = true) String id,
                      @RequestParam(value = "licenseNumber", required = true) String licenseNumber,
                      @RequestParam(value = "name", required = true) String name,
                      @RequestParam(value = "flyHour", required = true) int flyHour) {
        PilotModel pilot = new PilotModel(id, licenseNumber, name, flyHour);
        pilotService.addPilot(pilot);
        return "add";
    }
}
