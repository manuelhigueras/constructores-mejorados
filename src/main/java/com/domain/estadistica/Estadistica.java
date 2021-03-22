/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.estadistica;

/**
 *
 * @author user
 */
public class Estadistica {
    public float average(int... nums){
        int sum = 0;
        for(int x: nums){
            sum+=x;
        }
        return ((float) sum) / nums.length;
    }
}
