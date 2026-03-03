package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long,JournalEntry> journalEntries= new HashMap<>();

    @GetMapping("/allJournals")
    public List<JournalEntry> getAll(){

        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping("/create")
    public Boolean createEntry(@RequestBody JournalEntry newEntry){
        int n = journalEntries.size();
        journalEntries.put(newEntry.getId(),newEntry);
        if(n+1!=journalEntries.size()){
            return false;
        }
        else{
            return true;
        }
    }

}
