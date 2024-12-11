-- MySQL syntax. Adjust data types as needed for your specific database system (e.g., PostgreSQL).

CREATE TABLE routes (
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    route_id INT PRIMARY KEY AUTO_INCREMENT,
    destination VARCHAR(255) NOT NULL,
    origin VARCHAR(255) NOT NULL,
    waypoints TEXT
);

CREATE TABLE flights (
    flight_number VARCHAR(20) NOT NULL,
    flight_id INT PRIMARY KEY AUTO_INCREMENT,
    scheduled_time DATETIME NOT NULL,
    route_id INT NOT NULL,
    updated_time DATETIME,
    FOREIGN KEY (route_id) REFERENCES routes(route_id)
);

CREATE TABLE flight_status (
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    flight_id INT NOT NULL,
    status VARCHAR(50) NOT NULL,
    status_id INT PRIMARY KEY AUTO_INCREMENT,
    FOREIGN KEY (flight_id) REFERENCES flights(flight_id)
);

CREATE TABLE crew (
    contact_info VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    role VARCHAR(50) NOT NULL,
    name VARCHAR(255) NOT NULL,
    crew_id INT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE crew_assignments (
    flight_id INT NOT NULL,
    assigned_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    crew_id INT NOT NULL,
    assignment_id INT PRIMARY KEY AUTO_INCREMENT,
    FOREIGN KEY (flight_id) REFERENCES flights(flight_id),
    FOREIGN KEY (crew_id) REFERENCES crew(crew_id)
);

CREATE TABLE crew_availability (
    availability_id INT PRIMARY KEY AUTO_INCREMENT,
    crew_id INT NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(50) NOT NULL,
    FOREIGN KEY (crew_id) REFERENCES crew(crew_id)
);

CREATE TABLE aircrafts (
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    aircraft_id INT PRIMARY KEY AUTO_INCREMENT,
    capacity INT NOT NULL,
    tail_number VARCHAR(20) NOT NULL UNIQUE,
    model VARCHAR(255) NOT NULL
);

CREATE TABLE maintenance (
    maintenance_date DATE NOT NULL,
    description TEXT,
    maintenance_id INT PRIMARY KEY AUTO_INCREMENT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    aircraft_id INT NOT NULL,
    FOREIGN KEY (aircraft_id) REFERENCES aircrafts(aircraft_id)
);

CREATE TABLE notifications (
    message TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    notification_id INT PRIMARY KEY AUTO_INCREMENT,
    recipient VARCHAR(255) NOT NULL,
    event_type VARCHAR(255) NOT NULL
);

CREATE TABLE alert_subscriptions (
    user_id INT NOT NULL,
    event_type VARCHAR(255) NOT NULL,
    subscribed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    subscription_id INT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE users (
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    username VARCHAR(255) NOT NULL UNIQUE,
    user_id INT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE roles (
    role_id INT PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE user_roles (
    assigned_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    role_id INT NOT NULL,
    user_role_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    FOREIGN KEY (role_id) REFERENCES roles(role_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE user_permissions (
    user_id INT NOT NULL,
    permission_id INT NOT NULL,
    permission VARCHAR(255) NOT NULL,
    PRIMARY KEY (user_id, permission_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
