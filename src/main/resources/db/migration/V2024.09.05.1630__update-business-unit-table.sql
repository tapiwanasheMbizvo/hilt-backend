CREATE TABLE business_unit (
  business_id INTEGER PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
  business_name VARCHAR(150) NOT NULL,
  business_address VARCHAR(150) NOT NULL,
  business_email VARCHAR(150) NOT NULL,
  business_phone VARCHAR(150) NOT NULL,
  business_website VARCHAR(150) NOT NULL,
  CREATED_ON TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
INSERT INTO business_unit( business_name, business_address, business_email, business_phone, business_website)
	VALUES ('AandB Traders', '16 Matshikos Drive Thembisa', 'ab@business.co.za', '078545658', 'www.aandBtrading.co.za')