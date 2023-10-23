CREATE TABLE IF NOT EXISTS order(
    order_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    order_name VARCHAR(255) NOT NULL
);

create sequence order_seq;