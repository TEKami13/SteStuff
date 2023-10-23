CREATE TABLE IF NOT EXISTS customer(
    customer_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    customer_mail VARCHAR(100) NOT NULL UNIQUE,
    customer_phone INT NOT NULL UNIQUE
);

create sequence customer_seq;