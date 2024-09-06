INSERT INTO vehicle(modelo, placa, vehicle_type, renavam, driver) VALUES
    ('Fiat Uno', 'ABC1234', 'Carro', '12345678901', (SELECT id FROM driver WHERE name = 'João da Silva')),
    ('Chevrolet Onix', 'XYZ5678', 'Carro', '12345678902', (SELECT id FROM driver WHERE name = 'Maria Oliveira')),
    ('Honda Civic', 'DEF9012', 'Carro', '12345678903', (SELECT id FROM driver WHERE name = 'Carlos Pereira')),
    ('Volkswagen Gol', 'GHI3456', 'Carro', '12345678904', (SELECT id FROM driver WHERE name = 'Ana Santos'));