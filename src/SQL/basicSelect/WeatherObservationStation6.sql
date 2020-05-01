select distinct city  from station where
left(city,1)='A' or
left(city,1)='E' or
left(city,1)='I' or
left(city,1)='O' or
left(city,1)='U';


select distinct city from station where substring(city,1,1) in ('a','e','i','o','u');

