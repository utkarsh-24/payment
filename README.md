p a y m e n t service

use this to open h2-console
JDBC URL:jdbc:h2:mem:testdb
User Name:utkarsh
Password:utkarsh

then run these queries to load data
INSERT INTO card (card_holder_name, card_number, amount)
VALUES ('John Doe', 1234567890123456, 1000.0);

INSERT INTO card (card_holder_name, card_number, amount)
VALUES ('Jane Smith', 9876543210987654, 1500.0);
INSERT INTO currency_exchange_rate (quote_currency, base_currency, quote_country, base_country, exchange_rate)
VALUES ('USD', 'EUR', 'United States', 'Eurozone', 0.85);

INSERT INTO currency_exchange_rate (quote_currency, base_currency, quote_country, base_country, exchange_rate)
VALUES ('GBP', 'EUR', 'United Kingdom', 'Eurozone', 1.15);
select * from card;
select * from currency_exchange_rate;


now use this enpoint to update card amount
POST http://localhost:8080/api/v1/card/update-card-amount 
 {
    "cardNumber":1234567890123456,
    "amount":23.4,
    "quoteCurrency":"GBP",
    "baseCurrency":"EUR"
}
 
