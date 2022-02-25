package com.example.RantSpingBoot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LiveStreamRepository extends JpaRepository<LiveStream ,String> {
    LiveStream findLiveStreamByid(String id);
}
