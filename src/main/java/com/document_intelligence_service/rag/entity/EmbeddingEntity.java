package com.document_intelligence_service.rag.entity;

import com.document_intelligence_service.common.vector.PgVectorType;
import com.pgvector.PGvector;
import jakarta.persistence.*;
import lombok.*;

import org.hibernate.annotations.Type;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "embedding")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmbeddingEntity {

    @Id
    private UUID id;

    @Column(name = "chunk_id")
    private UUID chunkId;

    @Type(PgVectorType.class)
    @Column(name = "embedding", columnDefinition = "vector(384)")
    private PGvector embedding;

    @Column(name = "model")
    private String model;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Instant createdAt;
}