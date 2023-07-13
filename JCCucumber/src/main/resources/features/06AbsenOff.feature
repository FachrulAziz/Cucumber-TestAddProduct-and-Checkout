Feature: Absen Off
#  Scenario: Input Absen Off
#  When Klik menu Laporan Kegiatan Off
#  And Klik Absen Off pada Collapse Laporan Kegiatan
#  And Unggah foto selfie Off
#  And field Divisi
#  And Dropdown Nama Shift Off
#  And Pilih Shift Off
#  And Dropdown Tipe Absen Off
#  And Kolom keterangan Off
#  And Submit Off
#  Then get confirmasi Off

  Scenario: Input Absen Off tanpa Upload Foto Selfie
    When Klik menu Laporan Kegiatan Off
    And Klik Absen Off pada Collapse Laporan Kegiatan
    And Foto Selfie tidak di isi
    And field Divisi
    And Dropdown Nama Shift Off
    And Pilih Shift Off
    And Dropdown Tipe Absen Off
    And Kolom keterangan Off
    And Submit Off
    Then get confirmasi from Button Upload Image


  Scenario: Input Absen Off tanpa pilih Divisi
    When Klik menu Laporan Kegiatan Off
    And Klik Absen Off pada Collapse Laporan Kegiatan
    And Unggah foto selfie Off
    And Field Divisi tidak di pilih
    And Field Nama Shift dropdown tidak bisa di isi
    And Dropdown Tipe Absen Off
    And Kolom keterangan Off
    And Submit Off
    Then get confirmasi form Field Divisi

  Scenario: Input Absen Off tanpa pilih Nama Shift
    When Klik menu Laporan Kegiatan Off
    And Klik Absen Off pada Collapse Laporan Kegiatan
    And Unggah foto selfie Off
    And field Divisi
    And Field Nama Shift tidak di pilih
    And Dropdown Tipe Absen Off
    And Kolom keterangan Off
    And Submit Off
    Then get confirmasi form Field Shift

  Scenario: Input Absen Off tanpa pilih Tipe Absen
    When Klik menu Laporan Kegiatan Off
    And Klik Absen Off pada Collapse Laporan Kegiatan
    And Unggah foto selfie Off
    And field Divisi
    And Dropdown Nama Shift Off
    And Pilih Shift Off
    And Field Tipe Absen tidak di pilih
    And Kolom keterangan Off
    And Submit Off
    Then get confirmasi form Field Tipe Absen


  Scenario: Input Absen Off tanpa isi keterangan
    When Klik menu Laporan Kegiatan Off
    And Klik Absen Off pada Collapse Laporan Kegiatan
    And Unggah foto selfie Off
    And field Divisi
    And Dropdown Nama Shift Off
    And Pilih Shift Off
    And Dropdown Tipe Absen Off
    And Kolom keterangan di kosongkan
    And Submit Off
    Then get confirmasi form Field keterangan

