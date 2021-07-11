package com.example.projectpilot.service;

import com.example.projectpilot.model.PilotModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PilotInMemoryService implements PilotService {
    private List<PilotModel> archivePilot;

    public PilotInMemoryService() {
        archivePilot = new ArrayList<>();
    }

    @Override
    public void addPilot(PilotModel pilot) {
        archivePilot.add(pilot);
    }

    @Override
    public List<PilotModel> getPilotList() {
        return archivePilot;
    }

    @Override
    public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
        for (PilotModel pilotModel : archivePilot) {
            if (pilotModel.getLicenseNumber().equals(licenseNumber)) {
                return pilotModel;
            }
        }
        return null;
    }
}
