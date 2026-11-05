   package com.example.webapp;

   import static org.junit.jupiter.api.Assertions.*;

   import org.junit.jupiter.api.Test;

   class StudentRegressionTest {

       @Test
       void studentNameIsNotEmpty() {
           String name = "Navadharani";
           assertFalse(name.trim().isEmpty());
       }

       @Test
       void registerNumberHasExpectedLength() {
           String regNo = "310021104001";
           assertEquals(12, regNo.length());
       }

       @Test
       void ageIsInValidRange() {
           int age = 20;
           assertTrue(age >= 16 && age <= 60);
       }
   }