public class ProgramPesantren {
	public static void main (String[] args) {
		Pesantren data = new Pesantren ();
		data.setnamaPondok ("Pondok Pesantren Terpadu Darul Amal");
		data.setpendiri ("DR. Umay M. Dja'far Shiddiq, MA");
		data.setguru(135);
		data.setsantri(2000);
		data.setalamat("Kp. Selajati, RT/RW 02/01, Ds. Bojonggenteng Kec. Jampangkulon, 43178 Kab. Sukabumi, Jawa Barat ");
		data.setnoTlp("(0266) 490228");
		data.setemail("infodarulamal@gmail.com");
		data.setsosmed("www.darulamal.or.id, @infodarulamal, @ilmida");
		data.setpengurusOstda1("Ustadz Hudaya, Ustadz Kankan");
		data.setpengurusOstda2("Ustadzah Wati Resmiati, Ustadzah Windayani");
		data.setketerampilan("Basket, Bola Voli, Sepak Bola, Taek Won do, Menjahit, Tahfidz, Pramuka");
		data.setkitab("Nahwu, Shorf, Ushul Fiqh, Jalalain, Bulugul Marom, Al Hikam, Ihya Ulumuddin, Arbain");
		data.setsekolah("PAUD Darul Amal, TK Berkarakter, SDS Berkarakter, MI Darul Amal, SMP Terpadu Darul Amal, SMA Terpadu Darul Amal");
		
		
		
		String namaPondok = data.getnamaPondok();
		String pendiri = data.getpendiri();
		int guru = data.getguru();
		int santri = data.getsantri();
		String alamat = data.getalamat();
		String noTlp = data.getnoTlp();
		String email = data.getemail();
		String sosmed = data.getsosmed();
		String pengurusOstda1 = data.getpengurusOstda1();
		String pengurusOstda2 = data.getpengurusOstda2();
		String keterampilan = data.getketerampilan();
		String kitab = data.getkitab();
		String sekolah = data.getsekolah();
		
		System.out.println("============================================================================================================================");
		System.out.println("Nama Pondok 		: " + namaPondok);
		System.out.println("Pendiri 		: " + pendiri);
		System.out.println("Jumlah Guru 		: " + guru + " Orang");
		System.out.println("Jumlah Santri 		: " + santri + " Orang");
		System.out.println("Alamat 			: " + alamat);
		System.out.println("No Telpon 		: " + noTlp);
		System.out.println("Email 			: " + email);
		System.out.println("Sosial Media 		: " + sosmed);
		System.out.println("Pengurus OSTDA Putra 	: " + pengurusOstda1);
		System.out.println("Pengurus OSTDA Putri 	: " + pengurusOstda2);
		System.out.println("Keterampilan 		: " + keterampilan);
		System.out.println("Kitab 			: " + kitab);
		System.out.println("Sekolah 		: " + sekolah);
		System.out.println("============================================================================================================================");
		
	}
}