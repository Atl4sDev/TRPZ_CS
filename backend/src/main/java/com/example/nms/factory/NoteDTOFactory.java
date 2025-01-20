package com.example.nms.factory;

import com.example.nms.dto.NoteDetailDTO;
import com.example.nms.entity.Note;

public class NoteDTOFactory {
    public static NoteDetailDTO createNoteDetailDTO(Note note) {
        NoteDetailDTO dto = new NoteDetailDTO();
        dto.setUuid(note.getUuid());
        dto.setTitle(note.getTitle());
        dto.setContents(note.getContents());
        dto.setCreatedAt(note.getCreatedAt());
        dto.setUpdatedAt(note.getUpdatedAt());
        return dto;
    }
}
