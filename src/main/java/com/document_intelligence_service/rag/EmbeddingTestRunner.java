package com.document_intelligence_service.rag;


import com.document_intelligence_service.rag.entity.EmbeddingEntity;
import com.document_intelligence_service.rag.repository.EmbeddingRepository;
import com.pgvector.PGvector;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class EmbeddingTestRunner implements CommandLineRunner {

    private final EmbeddingRepository embeddingRepository;

    @Override
    public void run(String... args) {

        PGvector vec = new PGvector(new float[384]);

        EmbeddingEntity e = EmbeddingEntity.builder()
                .id(UUID.randomUUID())
                .chunkId(null)
                .embedding(vec)
                .model("test")
                .build();

        embeddingRepository.save(e);

        System.out.println("✅ PGVECTOR INSERT SUCCESS");
    }
}