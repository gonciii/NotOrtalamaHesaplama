
--EXAMPLE 3
----------------------------------------------------------------------------

SELECT country FROM country
WHERE country LIKE 'A%a';

------------------------------------------------------------------------------
SELECT country FROM country
WHERE country
LIKE '%n' AND length(country) >= 6;

------------------------------------------------------------------------------
SELECT title FROM film
WHERE title ~~* '%T%T%T%T%';

------------------------------------------------------------------------------
SELECT * FROM film
WHERE title LIKE 'C%'
AND length > 90  AND rental_rate = 2.99;