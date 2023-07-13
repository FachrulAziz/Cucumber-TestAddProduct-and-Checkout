Feature: Absen Sakit
#  Scenario: Input Absen Sakit
#  When Klik menu Laporan Kegiatan Sakit
#  And Klik Absen Sakit pada Collapse Laporan Kegiatan
#  And Unggah foto selfie Sakit
#  And field Divisi
#  And Dropdown Nama Shift Sakit
#  And Pilih Shift Sakit
#  And Dropdown Tipe Absen Sakit
#  And Kolom keterangan Sakit
#  And Submit Sakit
#  Then get confirmasi Sakit

  Scenario: Input Absen Sakit tanpa Upload Foto Selfie
    When Klik menu Laporan Kegiatan Sakit
    And Klik Absen Sakit pada Collapse Laporan Kegiatan
    And Foto Selfie tidak di isi
    And field Divisi
    And Dropdown Nama Shift Sakit
    And Pilih Shift Sakit
    And Dropdown Tipe Absen Sakit
    And Kolom keterangan Sakit
    And Submit Sakit
    Then get confirmasi from Button Upload Image


  Scenario: Input Absen Sakit tanpa pilih Divisi
    When Klik menu Laporan Kegiatan Sakit
    And Klik Absen Sakit pada Collapse Laporan Kegiatan
    And Unggah foto selfie Sakit
    And Field Divisi tidak di pilih
    And Field Nama Shift dropdown tidak bisa di isi
    And Dropdown Tipe Absen Sakit
    And Kolom keterangan Sakit
    And Submit Sakit
    Then get confirmasi form Field Divisi

  Scenario: Input Absen Sakit tanpa pilih Nama Shift
    When Klik menu Laporan Kegiatan Sakit
    And Klik Absen Sakit pada Collapse Laporan Kegiatan
    And Unggah foto selfie Sakit
    And field Divisi
    And Field Nama Shift tidak di pilih
    And Dropdown Tipe Absen Sakit
    And Kolom keterangan Sakit
    And Submit Sakit
    Then get confirmasi form Field Shift

  Scenario: Input Absen Sakit tanpa pilih Tipe Absen
    When Klik menu Laporan Kegiatan Sakit
    And Klik Absen Sakit pada Collapse Laporan Kegiatan
    And Unggah foto selfie Sakit
    And field Divisi
    And Dropdown Nama Shift Sakit
    And Pilih Shift Sakit
    And Field Tipe Absen tidak di pilih
    And Kolom keterangan Sakit
    And Submit Sakit
    Then get confirmasi form Field Tipe Absen


  Scenario: Input Absen Sakit tanpa isi keterangan
    When Klik menu Laporan Kegiatan Sakit
    And Klik Absen Sakit pada Collapse Laporan Kegiatan
    And Unggah foto selfie Sakit
    And field Divisi
    And Dropdown Nama Shift Sakit
    And Pilih Shift Sakit
    And Dropdown Tipe Absen Sakit
    And Kolom keterangan di kosongkan
    And Submit Sakit
    Then get confirmasi form Field keterangan

