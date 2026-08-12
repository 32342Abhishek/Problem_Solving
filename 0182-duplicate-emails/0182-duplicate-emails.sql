SELECT DISTINCT e.email AS Email
FROM Person e
JOIN Person a
ON e.email = a.email
AND e.id <> a.id;
