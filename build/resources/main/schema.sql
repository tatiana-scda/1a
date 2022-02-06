DROP TABLE IF EXISTS vehicle;
   CREATE TABLE vehicle (
   id                INT NOT NULL AUTO_INCREMENT,
   driver            VARCHAR(150),
   plate             VARCHAR(150),
   current_location  VARCHAR(150),
   PRIMARY KEY (id)
);

DROP TABLE IF EXISTS user;
   CREATE TABLE user (
   id              INT NOT NULL AUTO_INCREMENT,
   name            VARCHAR(150),
   username        VARCHAR(150) NOT NULL UNIQUE,
   password        VARCHAR(150),
   PRIMARY KEY (id)
);

DROP TABLE IF EXISTS route;
   CREATE TABLE route (
   id                INT NOT NULL AUTO_INCREMENT,
   status            VARCHAR(150),
   vehicle_id        INT,
   origin_id         INT,
   destination_id    INT,
   PRIMARY KEY (id)
);

DROP TABLE IF EXISTS product;
   CREATE TABLE product (
   id                INT NOT NULL AUTO_INCREMENT,
   description            VARCHAR(150),
   PRIMARY KEY (id)
);

DROP TABLE IF EXISTS delivery;
   CREATE TABLE delivery (
   id                INT NOT NULL AUTO_INCREMENT,
   status            VARCHAR(150),
   product_id        INT,
   route_id          INT,
   PRIMARY KEY (id)
);

DROP TABLE IF EXISTS address;
   CREATE TABLE address (
   id                INT NOT NULL AUTO_INCREMENT,
   street            VARCHAR(150),
   number            INT,
   city              VARCHAR(150),
   PRIMARY KEY (id)
);