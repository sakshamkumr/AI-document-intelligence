package com.document_intelligence_service.common.vector;


import com.pgvector.PGvector;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class PGvectorConverter implements AttributeConverter<PGvector, PGvector> {

    @Override
    public PGvector convertToDatabaseColumn(PGvector attribute) {
        return attribute;
    }

    @Override
    public PGvector convertToEntityAttribute(PGvector dbData) {
        return dbData;
    }
}