package Ex1.notes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import Ex1.notes.models.Note;
import Ex1.notes.repositories.NotesRepository;

import java.time.LocalDate;
import java.util.List;

@Controller
public class NotesController {

    @Autowired
    private NotesRepository notesRepository;

    @GetMapping("/notes")
    public String getNotesPage(Model model) {
        List<Note> notes = notesRepository.findAll();
        model.addAttribute("notes", notes);
        return "notes";
    }

    @GetMapping("/notes/add")
    public String getAddNotePage() {
        return "add_note";
    }

    @GetMapping("/notes/{note-id}")
    public String getNotePage(@PathVariable("note-id") Long id, Model model) {
        Note note = notesRepository.findById(id).get();
        model.addAttribute("note", note);
        return "note";
    }

    @PostMapping("/notes")
    public String addNote(Note note) {
        note.setDate(LocalDate.now());
        notesRepository.save(note);
        return "redirect:/notes";
    }
}
