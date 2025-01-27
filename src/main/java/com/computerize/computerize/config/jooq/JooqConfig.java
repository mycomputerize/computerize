package com.computerize.computerize.config.jooq;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JooqConfig {
    public DSLContext dslContext(DataSource dataSource) {
        return DSL.using(dataSource, org.jooq.SQLDialect.POSTGRES);
    }
}
