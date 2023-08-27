# Payment Service README

This is a guide for setting up and testing the Payment Service using H2 database and the provided endpoints.

## Setting Up H2 Console

1. Open the H2 Console using the following credentials:
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User Name: `utkarsh`
   - Password: `utkarsh`

## Loading Initial Data

Run the following SQL queries in the H2 Console to load initial data:

```sql
-- Load card data
INSERT INTO card (card_holder_name, card_number, amount)
VALUES ('John Doe', 1234567890123456, 1000.0);

INSERT INTO card (card_holder_name, card_number, amount)
VALUES ('Jane Smith', 9876543210987654, 1500.0);

-- Load currency exchange rate data
INSERT INTO currency_exchange_rate (quote_currency, base_currency, quote_country, base_country, exchange_rate)
VALUES ('USD', 'EUR', 'United States', 'Eurozone', 0.85);

INSERT INTO currency_exchange_rate (quote_currency, base_currency, quote_country, base_country, exchange_rate)
VALUES ('GBP', 'EUR', 'United Kingdom', 'Eurozone', 1.15);
