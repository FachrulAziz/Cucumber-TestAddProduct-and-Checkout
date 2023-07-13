Feature: Absen Izin
#  Scenario: Input Absen Izin
#  When Klik menu Laporan Kegiatan Izin
#  And Klik Absen Izin pada Collapse Laporan Kegiatan
#  And Unggah foto selfie Izin
#  And field Divisi
#  And Dropdown Nama Shift Izin
#  And Pilih Shift Izin
#  And Dropdown Tipe Absen Izin
#  And Kolom keterangan Izin
#  And Submit Izin
#  Then get confirmasi Izin

  Scenario: Input Absen Izin tanpa Upload Foto Selfie
    When Klik menu Laporan Kegiatan Izin
    And Klik Absen Izin pada Collapse Laporan Kegiatan
    And Foto Selfie tidak di isi
    And field Divisi
    And Dropdown Nama Shift Izin
    And Pilih Shift Izin
    And Dropdown Tipe Absen Izin
    And Kolom keterangan Izin
    And Submit Izin
    Then get confirmasi from Button Upload Image


  Scenario: Input Absen Izin tanpa pilih Divisi
    When Klik menu Laporan Kegiatan Izin
    And Klik Absen Izin pada Collapse Laporan Kegiatan
    And Unggah foto selfie Izin
    And Field Divisi tidak di pilih
    And Field Nama Shift dropdown tidak bisa di isi
    And Dropdown Tipe Absen Izin
    And Kolom keterangan Izin
    And Submit Izin
    Then get confirmasi form Field Divisi

  Scenario: Input Absen Izin tanpa pilih Nama Shift
    When Klik menu Laporan Kegiatan Izin
    And Klik Absen Izin pada Collapse Laporan Kegiatan
    And Unggah foto selfie Izin
    And field Divisi
    And Field Nama Shift tidak di pilih
    And Dropdown Tipe Absen Izin
    And Kolom keterangan Izin
    And Submit Izin
    Then get confirmasi form Field Shift

  Scenario: Input Absen Izin tanpa pilih Tipe Absen
    When Klik menu Laporan Kegiatan Izin
    And Klik Absen Izin pada Collapse Laporan Kegiatan
    And Unggah foto selfie Izin
    And field Divisi
    And Dropdown Nama Shift Izin
    And Pilih Shift Izin
    And Field Tipe Absen tidak di pilih
    And Kolom keterangan Izin
    And Submit Izin
    Then get confirmasi form Field Tipe Absen


  Scenario: Input Absen Izin tanpa isi keterangan
    When Klik menu Laporan Kegiatan Izin
    And Klik Absen Izin pada Collapse Laporan Kegiatan
    And Unggah foto selfie Izin
    And field Divisi
    And Dropdown Nama Shift Izin
    And Pilih Shift Izin
    And Dropdown Tipe Absen Izin
    And Kolom keterangan di kosongkan
    And Submit Izin
    Then get confirmasi form Field keterangan

