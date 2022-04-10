create table blogs (
id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(256) NOT NULL,
article VARCHAR(10192) NOT NULL
);

create table users (
username VARCHAR(50) NOT NULl PRIMARY KEY,
password VARCHAR(500) NOT NULl,
authority enum('ADMIN', 'USER') NOT NULL
);