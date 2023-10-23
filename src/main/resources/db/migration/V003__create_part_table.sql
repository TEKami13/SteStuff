CREATE TABLE IF NOT EXISTS part(
    part_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    part_name VARCHAR(100) NOT NULL,
    part_quantity INT NOT NULL,
    part_size VARCHAR(100),
    part_in_stock BOOLEAN,
    part_color VARCHAR(100)
);

create sequence part_seq;