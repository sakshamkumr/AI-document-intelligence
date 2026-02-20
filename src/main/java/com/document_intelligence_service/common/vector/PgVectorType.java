package com.document_intelligence_service.common.vector;

import com.pgvector.PGvector;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.Types;
import java.util.Objects;

public class PgVectorType implements UserType<PGvector> {

    @Override
    public int getSqlType() {
        return Types.OTHER;
    }

    @Override
    public Class<PGvector> returnedClass() {
        return PGvector.class;
    }

    @Override
    public boolean equals(PGvector x, PGvector y) {
        return Objects.equals(x, y);
    }

    @Override
    public int hashCode(PGvector x) {
        return Objects.hashCode(x);
    }

    @Override
    public PGvector deepCopy(PGvector value) {
        return value;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(PGvector value) {
        return value;
    }

    @Override
    public PGvector assemble(Serializable cached, Object owner) {
        return (PGvector) cached;
    }

    @Override
    public PGvector replace(PGvector detached, PGvector managed, Object owner) {
        return detached;
    }
}