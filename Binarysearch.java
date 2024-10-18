/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarysearch;

/**
 *
 * @author nethe
 */
public class Binarysearch {

    public static int findProductIndex(int[] productIDs, int targetID) {
        int left = 0;
        int right = productIDs.length - 1;

        
        while (left <= right) {
            int mid = (left + right) / 2;

            
            if (productIDs[mid] == targetID) {
                return mid;
            }

            
            if (productIDs[left] <= productIDs[mid]) {
                
                if (targetID >= productIDs[left] && targetID < productIDs[mid]) {
                    
                    right = mid - 1;
                } else {
                    
                    left = mid + 1;
                }
            } else {
                
                if (targetID > productIDs[mid] && targetID <= productIDs[right]) {
                    
                    left = mid + 1;
                } else {
                    
                    right = mid - 1;
                }
            }
        }

        
        return -1;
    }

    public static void main(String[] args) {
        int[] productIDs = {104, 105, 106, 107, 101, 102, 103};
        int targetID = 102;

        
        int index = findProductIndex(productIDs, targetID);
        if (index != -1) {
            System.out.println("Product ID found at index: " + index);
        } 
        else {
            System.out.println("Product ID not found.");
        }
    }}
    




    
