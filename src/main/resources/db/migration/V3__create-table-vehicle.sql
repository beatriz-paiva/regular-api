CREATE TABLE vehicle(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    modelo VARCHAR (50) NOT NULL,
    placa VARCHAR (50) NOT NULL,
    vehicle_type VARCHAR(50) NOT NULL,
    renavam VARCHAR(50) NOT NULL,
    driver UUID NOT NULL,
    FOREIGN KEY (driver) REFERENCES driver(id) ON DELETE CASCADE
);