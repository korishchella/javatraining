-- Create the database
CREATE DATABASE userapp;

-- Use the database
USE userapp;

-- Create the users table
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insert some sample data for testing
INSERT INTO users (username, password) VALUES
('john_doe', 'password123'),
('jane_smith', 'mypassword'),
('admin', 'admin123');

-- Verify the table structure
DESCRIBE users;

-- View all users
SELECT * FROM users;

-- Check if the table is working correctly
SELECT COUNT(*) as total_users FROM users;