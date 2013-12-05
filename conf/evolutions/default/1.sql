# --- !Ups

CREATE TABLE user (
  id int(10) NOT NULL AUTO_INCREMENT,
  name varchar(64) NOT NULL,
  email varchar(255) NOT NULL,
  PRIMARY KEY (id)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user (name, email) VALUES ("おれおれ", "oreore@example.com");

# --- !Downs
DROP TABLE User;