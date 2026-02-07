-- This file contains SQL statements to create and populate the `book` table in the database.

-- Create the `book` table if it does not already exist
CREATE TABLE IF NOT EXISTS book (
    id VARCHAR(255) PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL
);

-- Sample data
INSERT INTO book (id, title, author) VALUES ('1', 'The Five People You Meet in Heaven', 'Mitch Albom');
INSERT INTO book (id, title, author) VALUES ('2', 'Harry Potter and the Sorcerer''s Stone', 'J.K. Rowling');
INSERT INTO book (id, title, author) VALUES ('3', 'The Hobbit', 'J.R.R. Tolkien');
