CREATE TABLE ticket(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    ocurrence_data TIMESTAMP NOT NULL,
    vehicle UUID NOT NULL,
    type_violation UUID NOT NULL,
    FOREIGN KEY (vehicle) REFERENCES vehicle(id) ON DELETE CASCADE,
    FOREIGN KEY (type_violation) REFERENCES violation(id) ON DELETE CASCADE
);