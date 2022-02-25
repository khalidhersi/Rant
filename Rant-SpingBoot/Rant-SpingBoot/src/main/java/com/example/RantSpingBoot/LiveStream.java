package com.example.RantSpingBoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LiveStream {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private String id;
    private String liveStream;
    private String url;
    private String status;
    private String created_at;
    private String duration;
    private String max_stored_resolution;
    private String max_stored_frame_rate;
    private String aspect_ratio;

    public LiveStream(String id, String liveStream, String url, String status, String created_at, String duration, String max_stored_resolution, String max_stored_frame_rate, String aspect_ratio) {
        this.id = id;
        this.liveStream = liveStream;
        this.url = url;
        this.status = status;
        this.created_at = created_at;
        this.duration = duration;
        this.max_stored_resolution = max_stored_resolution;
        this.max_stored_frame_rate = max_stored_frame_rate;
        this.aspect_ratio = aspect_ratio;
    }

    public String getId() {
        return id;
    }

    public String getLiveStream(){
        return liveStream;
    }

    public String getUrl(){
        return url;
    }

    public String getStatus() {
        return status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getDuration() {
        return duration;
    }

    public String getMax_stored_resolution() {
        return max_stored_resolution;
    }

    public String getMax_stored_frame_rate() {
        return max_stored_frame_rate;
    }

    public String getAspect_ratio() {
        return aspect_ratio;
    }
}
