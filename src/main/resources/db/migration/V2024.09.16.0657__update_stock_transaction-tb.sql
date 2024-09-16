ALTER TABLE stock_transactions
ADD COLUMN branch_id INTEGER NOT NULL,
ADD CONSTRAINT fk_branch
FOREIGN KEY (branch_id) REFERENCES business_branches(branch_id);


INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (1, 'RECEIVE', 10, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (2, 'SELL', 5, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (3, 'ADJUSTMENT', 2, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (4, 'RETURN', 1, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (5, 'RECEIVE', 20, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (6, 'SELL', 15, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (7, 'ADJUSTMENT', 3, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (8, 'RETURN', 4, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (9, 'RECEIVE', 30, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (10, 'SELL', 10, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (1, 'ADJUSTMENT', 5, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (2, 'RETURN', 2, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (3, 'RECEIVE', 12, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (4, 'SELL', 6, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (5, 'ADJUSTMENT', 8, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (6, 'RETURN', 5, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (7, 'RECEIVE', 14, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (8, 'SELL', 7, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (9, 'ADJUSTMENT', 1, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (10, 'RETURN', 3, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (1, 'RECEIVE', 9, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (2, 'SELL', 4, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (3, 'ADJUSTMENT', 6, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (4, 'RETURN', 2, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (5, 'RECEIVE', 11, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (6, 'SELL', 9, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (7, 'ADJUSTMENT', 7, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (8, 'RETURN', 6, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (9, 'RECEIVE', 18, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (10, 'SELL', 12, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (1, 'ADJUSTMENT', 4, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (2, 'RETURN', 3, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (3, 'RECEIVE', 15, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (4, 'SELL', 8, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (5, 'ADJUSTMENT', 10, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (6, 'RETURN', 9, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (7, 'RECEIVE', 13, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (8, 'SELL', 11, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (9, 'ADJUSTMENT', 2, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (10, 'RETURN', 1, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (1, 'RECEIVE', 10, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (2, 'SELL', 5, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (3, 'ADJUSTMENT', 2, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (4, 'RETURN', 1, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (5, 'RECEIVE', 20, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (6, 'SELL', 15, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (7, 'ADJUSTMENT', 3, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (8, 'RETURN', 4, 2);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (9, 'RECEIVE', 30, 1);
INSERT INTO stock_transactions (product_id, transaction_type, quantity, branch_id) VALUES (10, 'SELL', 10, 2);