1. Question
Pivot the Occupation column in OCCUPATIONS so that each Name is sorted alphabetically and displayed underneath its corresponding Occupation. The output column headers should be Doctor, Professor, Singer, and Actor, respectively.

Note: Print NULL when there are no more names corresponding to an occupation.


Answer:

select D,P,S,A from
(
select name,OCCUPATION,(row_number() over(partition by Occupation order by Name)) as rn from OCCUPATIONS
)
PIVOT(max(name) for (OCCUPATION) in('Doctor' as D,'Actor' as A,'Singer' as S,'Professor' as P))
order by rn;
 