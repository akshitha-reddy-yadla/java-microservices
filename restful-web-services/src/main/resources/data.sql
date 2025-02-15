INSERT INTO user_details(id, birth_date, name)
VALUES (10001, current_date(), 'Joe');

INSERT INTO user_details(id, birth_date, name)
VALUES (10002, current_date(), 'Sal');

INSERT INTO user_details(id, birth_date, name)
VALUES (10003, current_date(), 'Q');

INSERT INTO post(id, description, user_id)
VALUES (20001, 'Blah blah', 10001);

INSERT INTO post(id, description, user_id)
VALUES (20002, 'Blah blah', 10001);

INSERT INTO post(id, description, user_id)
VALUES (20003, 'Blah blah', 10002);

INSERT INTO post(id, description, user_id)
VALUES (20004, 'Blah blah', 10003);