package com.document_intelligence_service.document.repository;

import com.document_intelligence_service.document.entity.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface DocumentRepository extends JpaRepository<DocumentEntity, UUID> {}