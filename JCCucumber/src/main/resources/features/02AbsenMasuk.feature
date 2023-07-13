Feature: Absen Masuk
#  Scenario: Login
#    Given User enter url TMS
#    When User enter valid username
#    And User enter valid password
#    And User click button login
#    Then User get text title page dashboard

#  Scenario: Input Absen Masuk
#  When Klik menu Laporan Kegiatan
#  And Klik Absen Masuk pada Collapse Laporan Kegiatan
#  And Unggah foto selfie
#  And Pada field Divisi dropdown pilih Attraction
#  And Dropdown Nama Shift
#  And Pilih Shift
#  And Dropdown Tipe Absen
#  And Kolom keterangan
#  And Submit
#  Then get confirmasi

  Scenario: Input Absen Masuk tanpa Upload Foto Selfie
    When Klik menu Laporan Kegiatan
    And Klik Absen Masuk pada Collapse Laporan Kegiatan
    And Foto Selfie tidak di isi
    And Pada field Divisi dropdown pilih Attraction
    And Dropdown Nama Shift
    And Pilih Shift
    And Dropdown Tipe Absen
    And Kolom keterangan
    And Submit
    Then get confirmasi from Button Upload Image

    Scenario: Input Absen Masuk tanpa pilih Divisi
    When Klik menu Laporan Kegiatan
    And Klik Absen Masuk pada Collapse Laporan Kegiatan
    And Unggah foto selfie
    And Field Divisi tidak di pilih
    And Field Nama Shift dropdown tidak bisa di isi
    And Dropdown Tipe Absen
    And Kolom keterangan
    And Submit
    Then get confirmasi form Field Divisi

    Scenario: Input Absen Masuk tanpa pilih Nama Shift
    When Klik menu Laporan Kegiatan
    And Klik Absen Masuk pada Collapse Laporan Kegiatan
    And Unggah foto selfie
    And Pada field Divisi dropdown pilih Attraction
    And Field Nama Shift tidak di pilih
    And Dropdown Tipe Absen
    And Kolom keterangan
    And Submit
    Then get confirmasi form Field Shift

    Scenario: Input Absen Masuk tanpa pilih Tipe Absen
    When Klik menu Laporan Kegiatan
    And Klik Absen Masuk pada Collapse Laporan Kegiatan
    And Unggah foto selfie
    And Pada field Divisi dropdown pilih Attraction
    And Dropdown Nama Shift
    And Pilih Shift
    And Field Tipe Absen tidak di pilih
    And Kolom keterangan
    And Submit
    Then get confirmasi form Field Tipe Absen

    Scenario: Input Absen Masuk tanpa isi keterangan
      When Klik menu Laporan Kegiatan
      And Klik Absen Masuk pada Collapse Laporan Kegiatan
      And Unggah foto selfie
      And Pada field Divisi dropdown pilih Attraction
      And Dropdown Nama Shift
      And Pilih Shift
      And Dropdown Tipe Absen
      And Kolom keterangan di kosongkan
      And Submit
      Then get confirmasi form Field keterangan
