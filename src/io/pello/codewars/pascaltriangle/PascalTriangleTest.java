package io.pello.codewars.pascaltriangle;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class PascalTriangleTest {

    private List<List<Integer>> generateResult () {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int [][] numbers = new int[][] { {1}, {1,1} ,{1,2,1} , {1,3,3,1}, {1,4,6,4,1}};
        
        for (int i = 0; i< numbers.length; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j<numbers[i].length;j++) {
                row.add(numbers[i][j]);
            }
            result.add(row);
        }
        
        return result;
    }
    
    @Test
    void testGenerateTriangle() {
       assertEquals(PascalTriangle.generateTriangle(5), this.generateResult());
    }

}
