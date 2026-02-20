package com.document_intelligence_service.rag.repository;

import com.document_intelligence_service.rag.entity.EmbeddingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface EmbeddingRepository extends JpaRepository<EmbeddingEntity, UUID> {
}
