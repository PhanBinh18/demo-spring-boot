package com.example.demo;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int tinhTong(int a, int b){
        return (a + b) * 2;
    }
}
