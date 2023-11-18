INSERT INTO users (id, username, password,
                   is_account_non_expired, is_account_non_locked, is_credentials_non_expired, is_enabled)
VALUES
    (1, 'annasmith', '$2a$10$U9dBmrmFoYt5TxCnzh5nCOiCLQeQQWaRtSWm5j/GYaYFFZHtS6KHa', 1, 1, 1, 1),
    (2, 'tom', '$2a$10$ta9jYeMwolkltr7RC16l2ORNBuGD6mQ1cDDJhBwINXhx.n8Os0j.C', 1, 1, 1, 1),
    (3, 'jonny', '$2a$10$n1l36hSHh9idL9DTMxD6COFTOcbDbgcnmL7SZZ4mQaYnx86yFUYq6', 1, 1, 1, 1);

INSERT INTO authority (id, authority)
VALUES
    (1, 'STUDENT'),
    (2, 'ADMIN'),
    (3, 'ADMINTRAINEE');

INSERT INTO user_authorities (user_id, authority_id)
VALUES
    (1, 1),
    (2, 2),
    (3, 3);


