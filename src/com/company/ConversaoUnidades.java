package com.company;

public class ConversaoUnidades {

        public static void main(String[] args){}

        public static double temperatura(double Celsius)
        {
            double Fahrenheit = 1.8*Celsius+32;
            return Fahrenheit;
        }
        public static double velocidade(double MetrosPorSegundo)
        {
            double KmPorHora = MetrosPorSegundo*3.6;
            return KmPorHora;
        }
        public static double distancia(double Km)
        {
            double Centimetros = Km/0.00001;
            return Centimetros;
        }
        public static double tempo(double Hora)
        {
            double Segundos = Hora*3600;
            return Segundos;
        }
    }
