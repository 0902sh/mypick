drop table hptl_mast;

create table hptl_mast
(
 secu_key_cd varchar(200),
 hptl_nm varchar(500),
 typ_cd varchar(2),
 typ_cd_nm varchar(50),
 sido_cd varchar(6),
 sido_cd_nm varchar(50),
 siggu_cd varchar(6),
 siggu_cd_nm varchar(50),
 emd varchar(100),
 post_cd varchar(6),
 addr varchar(300),
 tel_no varchar(100),
 hptl_url varchar(1000),
 open_date varchar(10),
 doc_num int,
 doc_gnrl_num int,
 doc_int_num int,
 doc_resi_num int,
 doc_sp_num int,
 dent_gnrl_num int,
 dent_int_num int,
 dent_resi_num int,
 dent_sp_num int,
 east_gnrl_num int,
 east_int_num int,
 east_resi_num int,
 east_sp_num int,
 baby_care_num int,
 x_loc float(10,3),
 y_loc float(10,3)
);

select count(*)
from   hptl_mast
;