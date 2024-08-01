CREATE TABLE driver(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    cpf VARCHAR (11) NOT NULL,
    driver_name VARCHAR (50) NOT NULL,
    renach VARCHAR(50) NOT NULL
);