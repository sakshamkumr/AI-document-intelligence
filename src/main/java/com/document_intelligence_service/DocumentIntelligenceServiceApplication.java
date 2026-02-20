package com.document_intelligence_service;

import com.document_intelligence_service.rag.entity.EmbeddingEntity;
import com.document_intelligence_service.rag.repository.EmbeddingRepository;
import com.pgvector.PGvector;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.UUID;

@SpringBootApplication
public class DocumentIntelligenceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentIntelligenceServiceApplication.class, args);
	}
}