/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.1.25-MariaDB : Database - db_fordward_chaining
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_fordward_chaining` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_fordward_chaining`;

/*Table structure for table `tbl_gejala` */

DROP TABLE IF EXISTS `tbl_gejala`;

CREATE TABLE `tbl_gejala` (
  `kode` varchar(20) NOT NULL,
  `gejala` text,
  `level` int(10) DEFAULT NULL,
  `penyakit` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`kode`),
  KEY `penyakit` (`penyakit`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_gejala` */

insert  into `tbl_gejala`(`kode`,`gejala`,`level`,`penyakit`) values ('GP1','Bintik-bintik putih pada keping biji.',1,'K1'),('GP10','Ekskreta kutu kebul menghasilkan embun madu yang menyebabkan tanaman tampak berwarna hitam.',1,'K5'),('GP11','Terdapat telur berwarna kuning terang dan bertangkai seperti kerucut di permukaan bawah daun muda',2,'K5'),('GP12','Menyerang dengan mengisap cairan daun sehingga daun berwarna kuning.',1,'K6'),('GP13','Daun yang diserang akan dijumpai jaringan benang halus yang digunakan untuk tungau dewasa pindah ke daun yang masih segar dengan bergantung pada benang.',2,'K6'),('GP14','Adanya daun yang telah dimakan serta pucuk tanaman ikut serta kena dampaknya.',1,'K7'),('GP15','Menyerang Bunga dan polong.',2,'K7'),('GP16','Menyerang dan Memakan daun',1,'K8'),('GP17','menyerang polong muda dan tulang daun muda',2,'K8'),('GP18','Menyerang Pada daun yang tua ',3,'K8'),('GP19','Ulat makan daun dari arah pinggir.',1,'K9'),('GP2','Larva masuk ke pangkal helai daun pertama atau kedua.',2,'K1'),('GP20','Serangan berat pada daun mengakibatkan yang tersisa tinggal tulang-tulang daunnya',2,'K9'),('GP21','Serangan biasa terjadi pada saat pengisian polong. ',3,'K9'),('GP22','Adanya daun-daun yang tergulung menjadi satu',1,'K10'),('GP23','Jika gulungan dibuka akan dijumpai ulat atau kotorannya berwarna coklat hitam',2,'K10'),('GP24','Kepala dan sebagian tubuhnya masuk ke dalam polong',1,'K11'),('GP25','Menyerang daun dan bunga.',2,'K11'),('GP26','Pertumbuhan polong kempis',1,'K12'),('GP27','Pertumbuhan biji kempis',2,'K12'),('GP28','Terjadinya pengeringan dan polong gugur',3,'K12'),('GP29','Terjadinya kerusakan polong dan biji',1,'K13'),('GP3','Pada daun muda terdapat bintik-bintik bekas alat peletak telur.',1,'K2'),('GP30','Serangan dengan menusukan stiletnya pada kulit polong terus ke biji lalu menghisap cairan biji',2,'K13'),('GP31','Serangan berupa lubang gerek berbentuk bundar pada kulit polong.',1,'K14'),('GP32','Terdapat 2 lubang gerek berbentuk bundar pada kulit polong',2,'K14'),('GP33','Pada daun pertama berupa bercak-bercak berisi uredia',1,'K15'),('GP34','Bercak ini berkembang ke daun-daun diatasnya dengan bertumbuhnya umur tanaman',2,'K15'),('GP35','Bercak berada pada permukaan bawa daun dan warna bercak coklat kemerahan seperti karat',3,'K15'),('GP36','Bercak kecil berwana hijau pucat pada kedua permukaan daun',1,'K16'),('GP37','Penonjolan pada bagian tengah lalu menjadi bisul warna coklat muda atau putih pada permukaan bawah daun',2,'K16'),('GP38','Menyerang batang, polong,tangkai daun',1,'K17'),('GP39','Tulang daun pada permukaan bawah tanaman terserang biasanya menebal dengan  berwarna kecoklatan',2,'K17'),('GP4','Lubang pada gerekan larva pada batang dapat menyebabkan tanaman layu.',2,'K2'),('GP40','Pada permukaan bawah daun timbul bercak warna putih kekuningan',1,'K18'),('GP41','Umumnya bulat dengan batas yang jelas',2,'K18'),('GP42','Kadang-kadang bercak menyatu membentuk bercak lebih lebar yang menyebabkan daun-daun abnormal, kaku dan mirip penyakit yang disebabkan virus',3,'K18'),('GP43','bercak coklat kemerahan timbul pada daun, batang, polong, biji, hipokotil, dan akar',1,'K19'),('GP44','Mengalami sonasi, yaitu membentuk lingkaran seperti pada papan tembak (target)',2,'K19'),('GP45','Pada tanaman yang baru tumbuh mengalami busuk di dekat akar',1,'K20'),('GP46','Menyebabkan tanaman mati karena rebah',2,'K20'),('GP47','Pada daun, batang, dan polong timbul hawar dengan arah serangan dari bawah ke atas',3,'K20'),('GP48','Jika terserang berat akan mengalami kering serta pada kondisi sangat lembab timbul miselium yang menyebabkan daun-daun lengket satu sama lain seperti sarang laba-laba ',4,'K20'),('GP49','Infeksi pada pangkal batang atau sedikit di bawah permukaan tanah berupa bercak coklat muda yang cepat berubah menjadi coklat tua atau warna gelap meluas sampai ke hipokotil',1,'K21'),('GP5','Mengering dan mati',3,'K2'),('GP50','Gejala layu mendadak meruapakn gejala yang pertama kali timbul.',2,'K21'),('GP51','Daun yang terinfeksi mula-mula berupa bercak bulat berwarna merah sampai ke coklat tua, kemudian mengering dan menempel pada batang mati. ',3,'K21'),('GP52','Gejala pada daun, btang dan polong sulit dikenali',1,'K22'),('GP53','Gejala awal pada daun timbul saat pengisian biji dengan kenampakn warna ungu muda yang menjadi kasar, kaku, dan menjadi warna ungu kemerahan',2,'K22'),('GP54','Tulang pada daun yang masih muda menjadi tidak jernih ',1,'K23'),('GP55','Daun berkerut dan mempunyai gambaran mosaik dengan warna hijau gelap di sepanjang tulang daun',2,'K23'),('GP56','Tepi daun sering mengalami klorosis',3,'K23'),('GP6','Pada saat populasi tinggi lalat pucuk dapat menyebabkan seluruh helai daun layu.',1,'K3'),('GP7','Kematian pucuk berlangsung pada saat pembungaan.',2,'K3'),('GP8','Serangan pada pucuk tanaman muda menyebabkan tanaman kerdil.',1,'K4'),('GP9','Menyerang tanaman kedelai muda sampai tua',2,'K4');

/*Table structure for table `tbl_pengguna` */

DROP TABLE IF EXISTS `tbl_pengguna`;

CREATE TABLE `tbl_pengguna` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `sandi` varchar(100) DEFAULT NULL,
  `level` enum('admin') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_pengguna` */

insert  into `tbl_pengguna`(`id`,`username`,`sandi`,`level`) values (6,'admin','202cb962ac59075b964b07152d234b70','admin');

/*Table structure for table `tbl_penyakit` */

DROP TABLE IF EXISTS `tbl_penyakit`;

CREATE TABLE `tbl_penyakit` (
  `kode` varchar(20) NOT NULL,
  `penyakit` text,
  `solusi` text,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_penyakit` */

insert  into `tbl_penyakit`(`kode`,`penyakit`,`solusi`) values ('K1','Hama lalat bibit kacang','- Mulsa jerami.\r\n- Perlakuan benih (pada daerah endemik).\r\n- Semprot insektisida saat tanaman berumur 7 hari.'),('K10','Hama ulat penggulung daun','- Tanam serempak\r\n- Semprot insektisida bila telah mencapai ambang kendali (kerusakan daun 12,5 %)'),('K11','Hama ulat helicoverpa (heliothis)','- Tanam serempak.\r\n- Tanam tanaman perangkap (jagung) di pematang.\r\n- Semprot HaNPV.\r\n- Semprt insektisida bila mencapai ambang kendali.'),('K12','Hama Kepik polong','- Tanam serampak.\r\n- Tanam tanaman perangkap Sesbania rostrata.\r\n- Semprot insektisida bila mencapai ambang kendali.'),('K13','Hama kepik hijau','- Tanam serempak.\r\n- Pergiliran tanaman.\r\n- Tanam tanaman perangkap Sesbania rostrata.\r\n- Semprot insektisida.\r\n'),('K14','Hama penggerek polong kedelai','- Tanam serempak.\r\n- Pelepasan parasitoid Trichogramma bactrae - bactrae.\r\n- Semprot insektisida.'),('K15','penyakit karat','- Menanam varietas tahan.\r\n- Aplikasi fungisida mankoseb, triadimefon, bitertanol, difenokonazol.'),('K16','penyakit pustul bakteri','- Menanam benih bebas patogen.\r\n- Membenamkan sisa tanaman terinfeksi.\r\n- Hindari rotasi dengan buncis dan kacang tunggak.'),('K17','penyakit Antraknose','- Menanam benih kualitas tinggi dan bebas patogen.\r\n- Perawatan benih terutama pada benih terinfeksi.\r\n- Membenamkansisa tanaman terinfeksi.\r\n- Rotasi dengan tanaman selain kacang - kacangan.'),('K18','penyakit Downy mildew','- Perawatan benih dengan fungisida.\r\n- Membenamkan tanaman terinfeksi.\r\n- Rotasi tanam selama 1 tahun atau lebih.'),('K19','penyakit target spot','- Perawatan benih terutama pada biji terinfeksi.\r\n- Membenam sisa tanaman terinfeksi.\r\n- Aplikasi fungisida benomil, klorotalonil, kaptan.'),('K2','Hama lalat batang','- Mulsa jerami\r\n- Perlakuan benih.\r\n- Semprot insektisida saat tanaman berumur 12 hari, bila populasi mencapai ambang kendali.'),('K20','penyakit rebah kecambah','- Perawatan benih dengan fungisida dan aplikasi fungisida sistemik.\r\n- Mempertahankan drainase tetap baik.'),('K21','penyakit hawar batang','- Memperbaiki pengolahan tanah dan drainase.\r\n- Perawatan benih dengan fungisida.'),('K22','penyakit hawar','- Menanam benih yang sehat atau bersih.\r\n- Perawatan beih dengan fungisida.\r\n- Aplikasi fungisida sistemik.'),('K23','Penyakit virus mosaik (SMV)','- Mengurangi sumber penularan virus.\r\n- Menekan populasi serangga vector.\r\n- Menanam varietas toleran.'),('K3','Hama lalat pucuk','- Varietas toleran.\r\n- Mulsa jerami.\r\n- Perlakuan benih.\r\n- Semprot Insektisida saat tanaman berumur 18 hari.'),('K4','Hama aphis','- Tanam serempak.\r\n- Pemantauan secara rutin, apabila populasi tinggi semprot dengan insektisida.'),('K5','Hama kutu bemisia','- Tanam serempak.\r\n- Pemantauan secara rutin, apabila populasi tinggi semprot dengan insektisida.'),('K6','Hama tungau merah','- Tanam serempak.\r\n- Pemantauan secara rutin, apabila populasi tinggi semprot dengan akarisida.'),('K7','Hama Kumbang kedelai','- Tanam serempak.\r\n- Pemantauan secara rutin, semprot insktisida apabila telah mencapai ambang kendali.'),('K8','Hama ulat grayak','- Tanam serempak.\r\n- Varietas toleran (ijen).\r\n- Semprot Insektisida bila mencapai ambang kendali.'),('K9','Hama ulat jengkal','- Tanam serempak.\r\n- Semprot insektisida bila telah mencapai ambang kendali (kerusakan daun 12,5%)');

/*Table structure for table `tbl_riwayat` */

DROP TABLE IF EXISTS `tbl_riwayat`;

CREATE TABLE `tbl_riwayat` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `nama_petani` varchar(30) DEFAULT NULL,
  `kelompok_petani` varchar(30) DEFAULT NULL,
  `penyakit` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_riwayat` */

insert  into `tbl_riwayat`(`id`,`nama_petani`,`kelompok_petani`,`penyakit`) values (1,'pajar','kelompok 2','K18'),(2,'pajar','kelompok 5','K23'),(3,'android','2','K23'),(4,'example','2','K3'),(5,'','','K15'),(6,'','','K5');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
