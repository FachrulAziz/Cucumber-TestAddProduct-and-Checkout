Feature: Absen Pulang
#  Scenario: Input Absen Pulang
#  When Klik menu Laporan Kegiatan Pulang
#  And Klik Absen Pulang pada Collapse Laporan Kegiatan
#  And Unggah foto selfie Pulang
#  And field Divisi
#  And Dropdown Nama Shift pulang
#  And Pilih Shift pulang
#  And Dropdown Tipe Absen pulang
#  And Kolom keterangan pulang
#  And Submit pulang
#  Then get confirmasi pulang

  Scenario: Input Absen Pulang tanpa Upload Foto Selfie
    When Klik menu Laporan Kegiatan Pulang
    And Klik Absen Pulang pada Collapse Laporan Kegiatan
    And Foto Selfie tidak di isi
    And field Divisi
    And Dropdown Nama Shift pulang
    And Pilih Shift pulang
    And Dropdown Tipe Absen pulang
    And Kolom keterangan pulang
    And Submit pulang
    Then get confirmasi from Button Upload Image


  Scenario: Input Absen Pulang tanpa pilih Divisi
    When Klik menu Laporan Kegiatan Pulang
    And Klik Absen Pulang pada Collapse Laporan Kegiatan
    And Unggah foto selfie Pulang
    And Field Divisi tidak di pilih
    And Field Nama Shift dropdown tidak bisa di isi
    And Dropdown Tipe Absen pulang
    And Kolom keterangan pulang
    And Submit pulang
    Then get confirmasi form Field Divisi

  Scenario: Input Absen Pulang tanpa pilih Nama Shift
    When Klik menu Laporan Kegiatan Pulang
    And Klik Absen Pulang pada Collapse Laporan Kegiatan
    And Unggah foto selfie Pulang
    And field Divisi
    And Field Nama Shift tidak di pilih
    And Dropdown Tipe Absen pulang
    And Kolom keterangan pulang
    And Submit pulang
    Then get confirmasi form Field Shift

  Scenario: Input Absen Pulang tanpa pilih Tipe Absen
    When Klik menu Laporan Kegiatan Pulang
    And Klik Absen Pulang pada Collapse Laporan Kegiatan
    And Unggah foto selfie Pulang
    And field Divisi
    And Dropdown Nama Shift pulang
    And Pilih Shift pulang
    And Field Tipe Absen tidak di pilih
    And Kolom keterangan pulang
    And Submit pulang
    Then get confirmasi form Field Tipe Absen


  Scenario: Input Absen Pulang tanpa isi keterangan
    When Klik menu Laporan Kegiatan Pulang
    And Klik Absen Pulang pada Collapse Laporan Kegiatan
    And Unggah foto selfie Pulang
    And field Divisi
    And Dropdown Nama Shift pulang
    And Pilih Shift pulang
    And Dropdown Tipe Absen pulang
    And Kolom keterangan di kosongkan
    And Submit pulang
    Then get confirmasi form Field keterangan

