package com.facul.heartbeat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BPMController {

    List<Beat> bpms = new ArrayList<>();

    @PostMapping("bpm")
    public void postBeat(@RequestBody Beat bpm) {
        bpms.add(bpm);
        System.out.println("BPM Posted: " + bpm.toString());
    }

    @PostMapping("bpms")
    public void postBeats(@RequestBody List<Beat> bpms) {
        this.bpms.addAll(bpms);
    }

    @GetMapping("bpm")
    public List<Beat> getBeats() {
        List<Beat> beatCopy = new ArrayList<>(bpms);
        bpms.clear();
        System.out.println("GETTING***********************************************************");
        return beatCopy;
    }
}
