package com.ronald.boot.landon.roomwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServices {
    private RoomRepository roomRepository;
    public long count = 0;

    @Autowired
    public RoomServices(RoomRepository roomRepository){
        super();
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        List<Room> rooms = new ArrayList<>();
        this.roomRepository.findAll().forEach(rooms::add);
        count = this.roomRepository.count();    //To count the total number of items in roomRepository
        System.out.println(count);
        return rooms;
    }
}
