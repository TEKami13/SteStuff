CREATE TABLE IF NOT EXISTS address_customer(
    address_customer_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    address_customer_type VARCHAR(100) NOT NULL,
    address_id BIGINT,
    FOREIGN KEY(address_id) REFERENCES address(address_id),
    customer_id BIGINT,
    FOREIGN KEY(customer_id) REFERENCES customer(customer_id)
);

create sequence address_customer_seq;

ALTER TABLE IF EXISTS part ADD (
    part_description VARCHAR(255)
    );