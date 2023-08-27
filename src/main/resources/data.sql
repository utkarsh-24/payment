CREATE TABLE card (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    card_holder_name VARCHAR(255),
    card_number BIGINT,
    amount DOUBLE
);

INSERT INTO card (card_holder_name, card_number, amount)
VALUES ('John Doe', 1234567890123456, 1000.0);

INSERT INTO card (card_holder_name, card_number, amount)
VALUES ('Jane Smith', 9876543210987654, 1500.0);

