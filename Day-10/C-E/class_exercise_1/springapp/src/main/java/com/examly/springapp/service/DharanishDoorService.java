package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.DharanishDoor;
import com.examly.springapp.repository.DharanishDoorRepo;

@Service
public class DharanishDoorService {
    @Autowired
    private DharanishDoorRepo doorRepo;

    public DharanishDoor postData(DharanishDoor door) {
        return doorRepo.save(door);
    }

    public List<DharanishDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public DharanishDoor updateDetail(int doorid, DharanishDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<DharanishDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<DharanishDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public DharanishDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}