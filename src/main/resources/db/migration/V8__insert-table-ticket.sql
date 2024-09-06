INSERT INTO ticket(ocurrence_data, vehicle, type_violation) VALUES
('2024-09-05 23:00:00', (SELECT id FROM vehicle WHERE placa = 'ABC1234'), (SELECT id FROM violation WHERE description = 'Excesso de Velocidade (20% a 50% acima do limite)'));

INSERT INTO ticket(ocurrence_data, vehicle, type_violation) VALUES
('2024-09-06 14:30:00', (SELECT id FROM vehicle WHERE placa = 'XYZ5678'), (SELECT id FROM violation WHERE description = 'Estacionamento em Local Proibido'));

INSERT INTO ticket(ocurrence_data, vehicle, type_violation) VALUES
('2024-09-07 08:15:00', (SELECT id FROM vehicle WHERE placa = 'DEF9012'), (SELECT id FROM violation WHERE description = 'Avanço de Sinal Vermelho'));

INSERT INTO ticket(ocurrence_data, vehicle, type_violation) VALUES
('2024-09-08 18:45:00', (SELECT id FROM vehicle WHERE placa = 'GHI3456'), (SELECT id FROM violation WHERE description = 'Dirigir Sob Influência de Álcool'));