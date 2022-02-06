--user
INSERT INTO user (id, name, username, password)
    VALUES (1, 'User', 'user', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3');

--address
INSERT INTO address (id, street, number, city)
    VALUES (1, 'Avenida Augusta', 55, 'Sao Paulo');

INSERT INTO address (id, street, number, city)
    VALUES (2, 'Rua Sergipe', '10', 'Belo Horizonte');

--delivery
INSERT INTO delivery (id, status, product_id, route_id)
    VALUES (1, 'ON_ROUTE', 1, 1);

--product
INSERT INTO product (id, description)
    VALUES (1, 'Livro Senhor dos Aneis - Edicao Colecionador');

--route
INSERT INTO route (id, status, vehicle_id, origin_id, destination_id)
    VALUES (1, 'IN_PROGRESS', 1, 1, 2);

--vehicle
INSERT INTO vehicle (id, driver, plate, current_location)
    VALUES (id, 'Pedro Martines', 'AHF6849', 'Rua Padre Anchieta 234 Barbacena');