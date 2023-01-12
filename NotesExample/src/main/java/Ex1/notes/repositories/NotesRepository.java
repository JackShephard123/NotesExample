package Ex1.notes.repositories;

import Ex1.notes.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Note, Long> {
}
