Feature: Add Candidate

  Scenario: Halaman Add Candidate
    When User click Add
    And Isi First Name
    And Isi Middle Name
    And Isi Last Name
    And Pilih Vacany
    And Isi Email
    And Isi Contact Number
    And Isi Resume
    And Isi Keyword
    And Pilih Tanggal
    And Isi notes
    And Centang Data
    Then Klik Save
