DROP TABLE IF EXISTS public."person";

CREATE TABLE IF NOT EXISTS public."person" (
    id VARCHAR(36) DEFAULT gen_random_uuid() NOT NULL,
    born_at VARCHAR(10),
    name VARCHAR(100),
    nickname VARCHAR(32) UNIQUE,
    stack VARCHAR(255),
    PRIMARY KEY (id)
);
