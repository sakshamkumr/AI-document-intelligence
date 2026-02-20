package com.document_intelligence_service.rag.entity;

import com.pgvector.PGvector;
import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "embedding")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class EmbeddingEntity {

    @Id
    private UUID id;

    @Column(name = "chunk_id")
    private UUID chunkId;

    @Column(columnDefinition = "vector(384)")
    private PGvector embedding;

    private String model;

    @Column(name = "created_at")
    private Instant createdAt;
}
