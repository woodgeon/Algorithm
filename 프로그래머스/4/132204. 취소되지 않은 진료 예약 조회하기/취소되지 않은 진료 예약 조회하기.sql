select a.APNT_NO, p.PT_NAME, p.PT_NO, d.MCDP_CD, d.DR_NAME, a.APNT_YMD
from APPOINTMENT a join PATIENT p on a.PT_NO = p.PT_NO
    join DOCTOR d on a.MDDR_ID = d.DR_ID
where a.APNT_CNCL_YN = 'N' and a.APNT_YMD between date '2022-04-13' and date '2022-04-14'
order by a.APNT_YMD asc;