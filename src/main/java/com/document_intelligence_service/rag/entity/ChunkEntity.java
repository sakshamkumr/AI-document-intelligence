package com.document_intelligence_service.rag.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "chunk")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ChunkEntity {

    @Id
    private UUID id;

    @Column(name = "document_id")
    private UUID documentId;

    @Column(name = "chunk_index")
    private Integer chunkIndex;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(name = "created_at")
    private Instant createdAt;
}