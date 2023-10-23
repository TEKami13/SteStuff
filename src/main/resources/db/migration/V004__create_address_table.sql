CREATE TABLE IF NOT EXISTS address(
    address_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    address_street_name VARCHAR(100) NOT NULL,
    address_city VARCHAR(100) NOT NULL,
    address_country VARCHAR(100) NOT NULL,
    address_zip_code INT NOT NULL,
    address_state VARCHAR(100),
    address_county VARCHAR(100)
);
create sequence address_seq;