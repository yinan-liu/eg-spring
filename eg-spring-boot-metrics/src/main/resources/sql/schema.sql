CREATE TABLE MESSAGE(
	ID CHAR(6) PRIMARY KEY,
	AUTHOR VARCHAR(20) NOT NULL,
	EMAIL VARCHAR(20),
	CONTENT VARCHAR(2000),
	CREATED DATETIME
);