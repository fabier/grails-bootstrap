dataSource {
    pooled = true
    dbCreate = "update" // "validate"
    driverClassName = "org.postgresql.Driver"
    url = "jdbc:postgresql://localhost:5432/bootstrap"
    dialect = org.hibernate.dialect.PostgreSQL9Dialect
    username = "dev"
    password = "dev"
//    logSql = true
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'org.hibernate.cache.SingletonEhCacheRegionFactory'
}

// environment specific settings
environments {
    development {
        dataSource {
        }
    }
    test {
        dataSource {
        }
    }
    production {
        dataSource {
            username = "grails"
            password = "XXXXXXXXXXXX"
        }
    }
}
