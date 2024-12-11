sql
-- INSERT statements for routes table (using placeholder data - replace with Faker or other data generation)

INSERT INTO routes (destination, origin, waypoints) VALUES
('JFK', 'LAX', '{"waypoint1": "ORD", "waypoint2": "DEN"}'),
('LHR', 'JFK', 'null'),
('CDG', 'LAX', '{"waypoint1": "YVR"}'),
('HND', 'SFO', '{"waypoint1": "NRT"}'),
('SYD', 'LAX', '{"waypoint1": "HNL"}');


-- INSERT statements for flights table
INSERT INTO flights (flight_number, scheduled_time, route_id) VALUES
('UA123', '2024-03-15 10:00:00', 1),
('AA456', '2024-03-15 14:00:00', 2),
('DL789', '2024-03-16 08:00:00', 3),
('UA987', '2024-03-16 16:00:00', 4),
('AA101', '2024-03-17 12:00:00', 5);


-- INSERT statements for flight_status table
INSERT INTO flight_status (flight_id, status) VALUES
(1, 'On Time'),
(2, 'Delayed'),
(3, 'On Time'),
(4, 'Cancelled'),
(5, 'On Time');


-- INSERT statements for crew table
INSERT INTO crew (name, role, contact_info) VALUES
('John Doe', 'Pilot', 'john.doe@email.com'),
('Jane Smith', 'Pilot', 'jane.smith@email.com'),
('Peter Jones', 'Flight Attendant', 'peter.jones@email.com'),
('Mary Brown', 'Flight Attendant', 'mary.brown@email.com'),
('David Lee', 'Mechanic', 'david.lee@email.com');


-- INSERT statements for crew_assignments table
INSERT INTO crew_assignments (flight_id, crew_id) VALUES
(1, 1),
(1, 3),
(2, 2),
(2, 4),
(3, 1),
(3, 3);


-- INSERT statements for crew_availability table
INSERT INTO crew_availability (crew_id, status) VALUES
(1, 'Available'),
(2, 'Available'),
(3, 'Available'),
(4, 'Available'),
(5, 'Unavailable');


-- INSERT statements for aircrafts table
INSERT INTO aircrafts (capacity, tail_number, model) VALUES
(200, 'N123AB', 'Boeing 737'),
(300, 'N456CD', 'Airbus A320'),
(250, 'N789EF', 'Boeing 757'),
(150, 'N987GH', 'Embraer 190'),
(100, 'N101IJ', 'Bombardier CRJ');


-- INSERT statements for maintenance table
INSERT INTO maintenance (maintenance_date, aircraft_id, description) VALUES
('2024-03-20', 1, 'Regular maintenance check'),
('2024-03-25', 2, 'Engine repair'),
('2024-04-01', 3, 'Landing gear inspection'),
('2024-04-05', 4, 'Minor repairs');


-- INSERT statements for notifications table
INSERT INTO notifications (message, recipient, event_type) VALUES
('Flight UA123 delayed', 'Passengers', 'FlightDelay'),
('Flight AA456 cancelled', 'Passengers', 'FlightCancellation'),
('Aircraft N123AB requires maintenance', 'Maintenance Crew', 'AircraftMaintenance');


-- INSERT statements for alert_subscriptions table
INSERT INTO alert_subscriptions (user_id, event_type) VALUES
(1, 'FlightDelay'),
(1, 'FlightCancellation'),
(2, 'AircraftMaintenance');


-- INSERT statements for users table
INSERT INTO users (email, password, username) VALUES
('john.doe@example.com', 'password123', 'johndoe'),
('jane.smith@example.com', 'password456', 'janesmith');


-- INSERT statements for roles table
INSERT INTO roles (role_name) VALUES
('Admin'),
('User');


-- INSERT statements for user_roles table
INSERT INTO user_roles (user_id, role_id) VALUES
(1, 1),
(2, 2);


-- INSERT statements for user_permissions table (Example permissions)
INSERT INTO user_permissions (user_id, permission_id, permission) VALUES
(1, 1, 'manage_flights'),
(1, 2, 'manage_users'),
(2, 3, 'view_flights');