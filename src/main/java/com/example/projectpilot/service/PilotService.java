package com.example.projectpilot.service;

import com.example.projectpilot.model.PilotModel;

import java.util.List;

public interface PilotService {
    void addPilot (PilotModel pilot);
    List<PilotModel> getPilotList();
    PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
}
