CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE violation(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    description VARCHAR(100) NOT NULL,
    moint DECIMAL NOT NULL,
    rating VARCHAR(11) NOT NULL,
    factor VARCHAR(255) NULL
);
