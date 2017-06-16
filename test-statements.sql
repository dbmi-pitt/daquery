select val from TA;
select val as v from TA;
select val as v from TA a;
select val as vaa from TA where val like 'A%';
select count(*) from TA join TB on TB.AID = TA.AID;  -- legal in daquery when returning aggregated result
select a.val from TA join TB on TB.AID = TA.AID;
select a.val, b.value from TA a, TB b where b.AID = a.AID;
select a.val av, b.value bv from TA a, TB b where b.AID = a.AID;
select a.val as av, b.value as bv from TA a, TB b where b.AID = a.AID;
select distinct a.val as av, b.value as bv from TA a, TB b where b.AID = a.AID;
select distinct a.val from TA a, TB b where b.AID = a.AID;
select count(distinct a.val) from TA a, TB b where b.AID = a.AID;
select count(distinct a.val) from TA a, TB b where b.AID = a.AID group by b.value;
select count(distinct a.val) as cnt, b.value as bv from TA a, TB b where b.AID = a.AID group by b.value, a.val;
select a.val as cnt, b.value as bv, c.value as cv from TA a, TB b, TC c where b.AID = a.AID and c.bid = b.bid order by b.value;
select distinct a.val as cnt, b.value bv, c.value as cv from TA a, TB b, (select bid, value from TC) c where b.AID = a.AID and c.bid = b.bid order by b.value;
select count(distinct a.val)from TA a, TB b, (select bid, value from TC order by value) c where b.AID = a.AID and c.bid = b.bid order by b.value;
select distinct a.val from TA a, TB b where b.AID = a.AID and (b.value like 'C%' or (BID > 2 and b.value like 'B%'));

--illegal queryies
select * from TA join TB on TB.AID = TA.AID; -- valid sql, but illegal in daquery
drop table tt;
--insert query
--update query
