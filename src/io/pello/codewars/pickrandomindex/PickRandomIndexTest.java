package io.pello.codewars.pickrandomindex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PickRandomIndexTest {

    private PickRandomIndex pickRandomIndex;
    
    @BeforeEach
    void setUp() throws Exception {
        pickRandomIndex = new PickRandomIndex();
    }

    @Test
    void testPick() {
        int [] array = new int[] {2,4,4,2,3,4,2,1,2,3};
        int number = 3; 
        
      for (int i = 0;i< 100;i++) {
            int result = pickRandomIndex.pickRandom(array, number);
            assertTrue(result == 9 || result == 4);
        }
    }

    @Test
    void testPickAlt() {
        int [] array = new int[] {2,4,4,2,3,4,2,1,2,3};
        int number = 3; 
        
      for (int i = 0;i< 100;i++) {
            int result = pickRandomIndex.pickRandomAlt(array, number);
            assertTrue(result == 9 || result == 4);
        }
    }
}
