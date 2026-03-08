package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/journal")
public class JournalEntryController_v2 {

    @Autowired
    JournalEntryService journalEntryService;

    @GetMapping("/allJournals")
    public List<JournalEntry> getAll(){

        return journalEntryService.getAllEntries();
    }

    @PostMapping("/create")
    public JournalEntry createEntry(@RequestBody JournalEntry newEntry){
        newEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(newEntry);
        return newEntry;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myId){
        return journalEntryService.getJournalEntryById(myId).orElse(null);
    }

    @DeleteMapping("/id/{myId}")
    public Boolean deleteJournalEntryById(@PathVariable ObjectId myId){
        journalEntryService.deleteJournalById(myId);
        return true;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable ObjectId id,@RequestBody JournalEntry newEntry){
        JournalEntry oldEntry = journalEntryService.getJournalEntryById(id).orElse(null);
        oldEntry.setContent(newEntry.getContent()==null || newEntry.getContent()==""? oldEntry.getContent():newEntry.getContent());
        oldEntry.setTitle(newEntry.getTitle()==null || newEntry.getTitle()==""?oldEntry.getTitle():newEntry.getTitle());
        journalEntryService.saveEntry(oldEntry);
        return oldEntry;
    }
}
