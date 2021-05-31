USE TUHousing;
INSERT INTO TUH_USER VALUES 
('Bill', 'Smith', 'bsmith2@students.towson.edu', '444-111-2222', '123456789', '123 Bell Street', 'Towson', '21233', 'MD'),
('Jane', 'Snow', 'jsnow2@students.towson.edu', '432-234-9342', '134342323', '123 Walnut Drive', 'Baltimore', '21233', 'MD'),
('Eric', 'Walters', 'ewalters1@students.towson.edu', '444-482-1234', '114245324', '123 Smith Street', 'Baltimore', '21233', 'MD'),
('Will', 'Pain', 'wpain2@students.towson.edu', '483-229-0983', '833723231', '123 Bell Drive', 'Baltimore', '21233', 'MD'),
('Jeremiah', 'Failla', 'jfaill2@students.towson.edu', '410-064-9873', '523833292', '11416 Bell Road', 'Whaleyville', '21723', 'MD'),
('Folayinka', 'Alonge', 'falong2@students.towson.edu', '410-322-8432', '973432323', '389 Elk Drive', 'Towson', '21233', 'MD'),
('Jaico', 'Nakpil', 'jnakpi1@students.towson.edu', '410-322-8432', '876432331', '972 Dove Street', 'Towson', '21233', 'MD');

INSERT INTO HOUSING VALUES 
(1, 'Jenny McHill', '2021-2022', '123 Towson Drive', 'Towson', 21204, 'MD'),
(2, 'Bill Jackson', '2021-2022', '424 Emerson Drive', 'Towson', 21204, 'MD'),
(3, 'Bill Jackson', '2021-2022', '435 Towson Way', 'Towson', 21204, 'MD'),
(4, 'Tom Ron', '2021-2022', '10 Burke Ave', 'Towson', 21204, 'MD'),
(5, 'Kate Starling', '2021-2022', '8000 York Rd', 'Towson', 21204, 'MD'),
(6, 'Phil Jackson', '2021-2022', '123 Stephenson Ave', 'Towson', 21204, 'MD'),
(7, 'Henry Weeks', '2021-2022', '123 Stephenson Av', 'Towson', 21204, 'MD');

INSERT INTO RESIDENT_HALL VALUES
(5, '410-704-5702', 315, 'Glen Complex'),
(6, '410-704-3997', 225, 'Newell Hall'),
(7, '410-704-4565', 400, 'Stephens Hall');


INSERT INTO HALL_BED VALUES
(1, 101, 3981, 4, 5, 'GC-101A'),
(1, 101, 3981, 4, 5, 'GC-101B'),
(1, 101, 3981, 4, 5, 'GC-101C'),
(1, 101, 3981, 4, 5, 'GC-101D'),
(2, 202, 3981, 4, 5, 'GC-202A'),
(2, 202, 3981, 4, 5, 'GC-202B'),
(2, 202, 3981, 4, 5, 'GC-202C'),
(2, 202, 3981, 4, 5, 'GC-202D'),
(3, 303, 3981, 4, 5, 'GC-303A'),
(3, 303, 3981, 4, 5, 'GC-303B'),
(3, 303, 3981, 4, 5, 'GC-303C'),
(3, 303, 3981, 4, 5, 'GC-303D'),
(1, 101, 3981, 4, 6, 'NH-101A'),
(1, 101, 3981, 4, 6, 'NH-101B'),
(1, 101, 3981, 4, 6, 'NH-101C'),
(1, 101, 3981, 4, 6, 'NH-101D'),
(2, 202, 3981, 4, 6, 'NH-202A'),
(2, 202, 3981, 4, 6, 'NH-202B'),
(2, 202, 3981, 4, 6, 'NH-202C'),
(2, 202, 3981, 4, 6, 'NH-202D'),
(3, 303, 3981, 4, 6, 'NH-303A'),
(3, 303, 3981, 4, 6, 'NH-303B'),
(3, 303, 3981, 4, 6, 'NH-303C'),
(3, 303, 3981, 4, 6, 'NH-303D'),
(1, 101, 3981, 4, 7, 'SH-101A'),
(1, 101, 3981, 4, 7, 'SH-101B'),
(1, 101, 3981, 4, 7, 'SH-101C'),
(1, 101, 3981, 4, 7, 'SH-101D'),
(2, 202, 3981, 4, 7, 'SH-202A'),
(2, 202, 3981, 4, 7, 'SH-202B'),
(2, 202, 3981, 4, 7, 'SH-202C'),
(2, 202, 3981, 4, 7, 'SH-202D'),
(3, 303, 3981, 4, 7, 'SH-303A'),
(3, 303, 3981, 4, 7, 'SH-303B'),
(3, 303, 3981, 4, 7, 'SH-303C'),
(3, 303, 3981, 4, 7, 'SH-303D');

INSERT INTO APARTMENT VALUES
(1, '410 704 2000', 205, 'Towson Run'),
(2, '410-704-6991', 205, 'Carroll Hall'),
(3, '410-704-6899', 100, 'Marshall Hall'),
(4, '410-704-2516', 315, '10 West');

INSERT INTO APART_BED VALUES
(1, 101, 4606, 1, 1, 1, 'TR-101A'),
(2, 102, 4354, 4, 2, 1, 'TR-202A'),
(2, 202, 4354, 4, 2, 1, 'TR-202B'),
(2, 202, 4354, 4, 2, 1, 'TR-202C'),
(2, 202, 4354, 4, 2, 1, 'TR-202D'),
(3, 303, 4354, 2, 1, 1, 'TR-303A'),
(3, 303, 4354, 2, 1, 1, 'TR-303B'),
(1, 101, 5305, 2, 1, 2, 'CH-101A'),
(1, 101, 5305, 2, 1, 2, 'CH-101B'),
(2, 202, 5201, 4, 2, 2, 'CH-202A'),
(2, 202, 5201, 4, 2, 2, 'CH-202B'),
(2, 202, 5201, 4, 2, 2, 'CH-202C'),
(2, 202, 5201, 4, 2, 2, 'CH-202D'),
(3, 303, 5201, 4, 2, 2, 'CH-303A'),
(3, 303, 5201, 4, 2, 2, 'CH-303B'),
(3, 303, 5201, 4, 2, 2, 'CH-303C'),
(3, 303, 5201, 4, 2, 2, 'CH-303D'),
(1, 101, 5201, 4, 2, 3, 'MH-101A'),
(1, 101, 5201, 4, 2, 3, 'MH-101B'),
(1, 101, 5201, 4, 2, 3, 'MH-101C'),
(1, 101, 5201, 4, 2, 3, 'MH-101D'),
(2, 202, 5305, 2, 1, 3, 'MH-202A'),
(2, 202, 5305, 2, 1, 3, 'MH-202B'),
(3, 303, 3981, 2, 1, 3, 'MH-303A'),
(3, 303, 3981, 2, 1, 3, 'MH-303B'),
(1, 101, 4853, 2, 1, 4, '10W-101A'),
(1, 101, 4853, 2, 1, 4, '10W-101B'),
(2, 202, 4853, 2, 1, 4, '10W-202A'),
(2, 202, 4853, 2, 1, 4, '10W-202B'),
(3, 303, 4853, 2, 1, 4, '10W-303A'),
(3, 303, 4853, 2, 1, 4, '10W-303B');

INSERT INTO MEAL_PLAN VALUES 
(0, 0, 'None'),
(2450, 1, '10 Meal Per Week'),
(2700, 2, '14 Meal Per Week'),
(3000, 3, '19 Meal Per Week'),
(3200, 4, '21 Meal Per Week'),
(3400, 5, 'Unlimited Meal Per Week');

INSERT INTO LEASE VALUES 
('Academic Year', '2021-4-17', NULL, 5, 'GC-101A'),
('Academic Year', '2021-4-17', NULL, 5, 'GC-202A'),
('Academic Year', '2021-4-18', NULL, 5, 'GC-303A'),
('Semester', '2021-4-19', NULL, 5, 'GC-303B');


INSERT INTO STUDENT (Num_of_courses, Credits, Student_id, Tu_Status, Ssn, Plan_id, Want_parking, Want_meal_plan) VALUES 
(5, 15, '9023223', 'Senior', '123456789', 2, true, true),
(4, 12, '1243526', 'Junior', '134342323', 2, true, true),
(4, 16, '5253929', 'Senior', '114245324', 4, false, true),
(5, 17, '6293221', 'Sophomore', '833723231', 0, true, false);

INSERT INTO PARKING (Car_make, Car_model, Car_color, Plate_num, Student_id) VALUES 
('Lamborghini', 'Lambo', 'Red', 'BC23242', '9023223'),
('Toyota', 'Camry', 'Silver', 'FE26442', '1243526'),
('Honda', 'CRV', 'Green',  'BP32563', '6293221');

INSERT INTO TU_ADMIN (Username, Passw, Tu_position, Ssn) VALUES 
('jfaill2', 'password', 'Admin', '523833292'),
('jpalmer2', 'password', 'Admin', '973432323'),
('jpalmer2', 'password', 'Admin', '876432331');








