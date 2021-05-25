
mysql> use organisation;
Database changed
mysql> SELECT *FROM EMPLOYEE;
+--------+----------+---------+------------+---------+--------+-------------+
| EMP_NO | EMP_NAME | ADDRESS | MOBILE_NO  | DEPT_NO | SALARY | DESIGNATION |
+--------+----------+---------+------------+---------+--------+-------------+
|    101 | SID      | KOLLAM  | 2147483647 |       1 |  25000 | ACCOUNTS    |
|    102 | JIM      | TVM     | 2147483647 |       2 |  25000 | TYPIST      |
|    103 | CARRY    | KOLLAM  | 2147483647 |       3 |  45000 | MANAGER     |
|    105 | JONNY    | KOTTYAM | 2147483647 |       5 |  25000 | TYPIST      |
+--------+----------+---------+------------+---------+--------+-------------+
4 rows in set (0.00 sec)

mysql> SELECT *FROM DEPARTMENT;
+---------+-----------+----------+
| DEPT_NO | DEPT_NAME | LOCATION |
+---------+-----------+----------+
|     101 | A BLOCK   | F1       |
|     102 | B BLOCK   | F2       |
|     103 | C BLOCK   | F3       |
|     104 | D BLOCK   | F4       |
|     105 | E BLOCK   | F5       |
+---------+-----------+----------+
5 rows in set (0.00 sec)

mysql>