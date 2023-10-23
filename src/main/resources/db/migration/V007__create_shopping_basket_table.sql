CREATE TABLE IF NOT EXISTS shopping_basket(
    shopping_basket_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    part_id BIGINT,
    FOREIGN KEY(part_id) REFERENCES part(part_id),
    order_id BIGINT,
    FOREIGN KEY(order_id) REFERENCES order(order_id)
);

create sequence shopping_basket_seq;