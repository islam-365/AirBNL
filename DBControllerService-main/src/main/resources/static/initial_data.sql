INSERT INTO country (name) VALUES ('United Arab Emirates');
INSERT INTO country (name) VALUES ('Saudi Arabia');
INSERT INTO country (name) VALUES ('Egypt');
INSERT INTO country (name) VALUES ('Jordan');
INSERT INTO country (name) VALUES ('Morocco');

INSERT INTO role (name) VALUES ('Admin');
INSERT INTO role (name) VALUES ('User');

INSERT INTO user (username, password, full_name, role_id) VALUES ('admin', '123', 'admin', 1);
INSERT INTO user (username, password, full_name, role_id) VALUES ('root', '123', 'root', 1);
INSERT INTO user (username, password, full_name, role_id) VALUES ('user1', '123', 'Bob Johnson', 2);
INSERT INTO user (username, password, full_name, role_id) VALUES ('user2', '123', 'Alice Brown', 2);
INSERT INTO user (username, password, full_name, role_id) VALUES ('user3', '123', 'Sam Wilson', 2);

INSERT INTO hotel (name, manager_id, country_id) VALUES ('Hilton', 1, 1);
INSERT INTO hotel (name, manager_id, country_id) VALUES ('Marriott', 1, 1);
INSERT INTO hotel (name, manager_id, country_id) VALUES ('Radisson', 2, 2);
INSERT INTO hotel (name, manager_id, country_id) VALUES ('Sheraton', 2, 3);
INSERT INTO hotel (name, manager_id, country_id) VALUES ('InterContinental', 2, 4);

INSERT INTO room_type (name, price, hotel_id) VALUES ('Standard', 100, 1);
INSERT INTO room_type (name, price, hotel_id) VALUES ('Deluxe', 150, 1);
INSERT INTO room_type (name, price, hotel_id) VALUES ('Suite', 250, 2);
INSERT INTO room_type (name, price, hotel_id) VALUES ('Superior', 120, 3);
INSERT INTO room_type (name, price, hotel_id) VALUES ('Executive', 200, 4);

INSERT INTO room (hotel_id, number, type_id, bed_count) VALUES (1, '101', 1, 2);
INSERT INTO room (hotel_id, number, type_id, bed_count) VALUES (2, '102', 1, 2);
INSERT INTO room (hotel_id, number, type_id, bed_count) VALUES (3, '201', 2, 2);
INSERT INTO room (hotel_id, number, type_id, bed_count) VALUES (4, '301', 3, 3);
INSERT INTO room (hotel_id, number, type_id, bed_count) VALUES (5, '401', 4, 2);

INSERT INTO reservation (user_id, room_id, cost, date_from, date_to)
VALUES (3, 1, 200, '2023-05-01 14:00:00', '2023-05-05 12:00:00');
INSERT INTO reservation (user_id, room_id, cost, date_from, date_to)
VALUES (3, 3, 300, '2023-06-15 16:00:00', '2023-06-20 11:00:00');
INSERT INTO reservation (user_id, room_id, cost, date_from, date_to)
VALUES (4, 5, 400, '2023-07-10 13:00:00', '2023-07-15 10:00:00');
INSERT INTO reservation (user_id, room_id, cost, date_from, date_to)
VALUES (4, 2, 250, '2023-08-20 15:00:00', '2023-08-24 12:00:00');
INSERT INTO reservation (user_id, room_id, cost, date_from, date_to)
VALUES (5, 4, 350, '2023-09-05 10:00:00', '2023-09-10 9:00:00');

