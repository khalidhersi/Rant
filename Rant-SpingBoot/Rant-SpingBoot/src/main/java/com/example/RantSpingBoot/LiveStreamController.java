package com.example.RantSpingBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins  =  "http://localhost:3000")
public class LiveStreamController {
    @Autowired
    LiveStreamRepository repository;

    @GetMapping("/assets")
    public ResponseEntity<List<LiveStream>> getLiveStream() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @GetMapping("/assets/{id}")
    public ResponseEntity<List<LiveStream>> getId() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @PostMapping("/assets")
    public ResponseEntity<String>  createLiveStream(@RequestBody LiveStream liveStream){
        repository.save(liveStream);
        return ResponseEntity.status(HttpStatus.CREATED).body( "added" + liveStream.getUrl());
        //a created status code 201 will be sent

    }


}
