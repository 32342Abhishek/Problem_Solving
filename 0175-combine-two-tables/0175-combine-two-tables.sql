select firstname,lastname,city,state from Person as p
left join Address a on p.personId=a.personId;