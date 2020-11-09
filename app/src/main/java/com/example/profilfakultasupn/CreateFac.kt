package com.example.profilfakultasupn

fun CreateFac(): List<DataFakultas> {
    val partListFac = ArrayList<DataFakultas>()
    partListFac.add(
         DataFakultas(
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonimi dan Bisnis adalah salah " +
                        "satu dari 7 Fakultas di UPN JATIM. Yang terdiri dari prodi:",
                "1. Ekonomi Pembangunan\n" +
                        "2. Akuntansi\n" +
                        "3. Manajemen",
                R.drawable.img_feb,
                "feb@upnjatim.ac.id",
                "http://febis.upnjatim.ac.id/"
        )
    )
    partListFac.add(
         DataFakultas(
                "Fakultas Pertanian",
                "Fakultas Pertanian adalah salah satu " +
                        "dari 7 Fakultas di UPN JATIM. Yang terdiri dari prodi:",
                "1. Agroteknologi\n" +
                        "4. Agribisnis",
                R.drawable.img_fapet,
                "fp@upnjatim.ac.id",
                "http://faperta.upnjatim.ac.id/"
        )
    )
    partListFac.add(
         DataFakultas(
                "Fakultas Teknik",
                "Fakultas Teknik adalah salah satu" +
                        " dari 7 Fakultas di UPN JATIM. Yang terdiri dari prodi:",
                "1. Teknik Kimia\n" +
                        "2. Teknik Industri\n" +
                        "3. Teknik Sipil\n" +
                        "4. Teknik Lingkungan\n" +
                        "5. Teknologi Pangan",
                R.drawable.img_ft,
                "ft@upnjatim.ac.id",
                "http://ft.upnjatim.ac.id/"
        )
    )
    partListFac.add(
         DataFakultas(
                "Fakultas Ilmu Sosial Ilmu Politik",
                "Fakultas Ilmu Sosial Ilmu Politik adalah salah" +
                        " satu dari 7 Fakultas di UPN JATIM. Yang terdiri dari prodi:",
                "1. Administrasi Bisnis\n" +
                        "2. Administrasi Negara\n" +
                        "3. Hubungan Internasional",
                R.drawable.img_fisip,
                "fisip@upnjatim.ac.id",
                "http://fisip.upnjatim.ac.id/"
        )
    )
    partListFac.add(
         DataFakultas(
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer adalah salah satu" +
                        " dari 7 Fakultas di UPN JATIM. Yang terdiri dari prodi:",
                "1. Sistem Informasi\n" +
                        "2. Teknik Informatika\n" +
                        "3. Sains Data",
                R.drawable.img_fik,
                "fik@upnjatim.ac.id",
                "http://fik.upnjatim.ac.id/"
        )
    )
    partListFac.add(
         DataFakultas(
                "Fakultas Arsitektur dan Desain",
                "Fakultas Arsitektur dan Desain adalah salah" +
                        " satu dari 7 Fakultas di UPN JATIM. Yang terdiri dari prodi:",
                "1. Arsitektur\n" +
                        "3. Desain Komunikasi Visual",
                R.drawable.img_fad,
                "fad@upnjatim.ac.id",
                "http://fad.upnjatim.ac.id/"
        )
    )
    partListFac.add(
         DataFakultas(
                "Fakultas Teknik",
                "Fakultas Teknik adalah salah satu" +
                        " dari 7 Fakultas di UPN JATIM. Yang terdiri dari prodi:",
                "1. Ilmu Hukum",
                R.drawable.img_fh,
                "fh@upnjatim.ac.id",
                "http://fh.upnjatim.ac.id/"
        )
    )
    partListFac.add(
         DataFakultas(
                "Perancang Aplikasi",
                "Full Name : Ibrahim\n" +
                        "TTL : Pasuruan, 29 Juni 2000\n" +
                        "Alamat : Bangil Pasuruan\n" +
                        "Telepon : 089699373692",
                "Riwayat Pendidikan : \n" +
                        "\t\t 1. SDN Bendomungal 1 Bangil\n" +
                        "\t\t 2. SMP YADIKA BANGIL\n" +
                        "\t\t 3. SMA YADIKA BANGIL",
                R.drawable.ibrahim, "elaimbarca5@gmail.com",
                "https://github.com/IbrahimKarani"
        )
    )
    return partListFac
}