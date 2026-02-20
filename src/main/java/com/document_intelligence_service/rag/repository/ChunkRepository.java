package com.document_intelligence_service.rag.repository;


import com.document_intelligence_service.rag.entity.ChunkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ChunkRepository extends JpaRepository<ChunkEntity, UUID> {}
