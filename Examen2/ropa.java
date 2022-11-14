package Examen2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class ropa {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double LitrosAgua, Co2Producida, EnergiaUtilizada, CantidadMaterial = 0;
        String opcion, opcion1, opcion2, opcion3, opcionAdd, opcionF;
        String opcionAdd1, opcionAdd2, opcionAdd3;
        opcion = "";
        boolean pasa1 = true, pasa2 = true, pasa3 = true, pasa4 = true, pasa1Add = true, pasa2Add = true;

        // prenda
        ArrayList<String> prendas = new ArrayList<String>();

        prendas.add("1.-Playera");
        prendas.add("2.-Pantalon");
        prendas.add("3.-Sudadera");
        ArrayList<Double> prendasValores = new ArrayList<Double>();

        prendasValores.add(0.3);
        prendasValores.add(0.4);
        prendasValores.add(0.6);

        // talla
        ArrayList<String> tallas = new ArrayList<String>();

        tallas.add("1.-Chica");
        tallas.add("2.-Mediana");
        tallas.add("3.-Grande");
        ArrayList<Double> tallasValores = new ArrayList<Double>();

        tallasValores.add(1.0);
        tallasValores.add(1.17);
        tallasValores.add(1.35);

        // materiales
        ArrayList<String> materiales = new ArrayList<String>();

        materiales.add("1.-Algodon");
        materiales.add("2.-Poliester");
        materiales.add("3.-Nylon");
        materiales.add("4.-Lana");

        ArrayList<Double> materialesPesos = new ArrayList<Double>();

        materialesPesos.add(1.0);
        materialesPesos.add(0.833);
        materialesPesos.add(0.74); // cambiar
        materialesPesos.add(0.9); // cambiar

        ArrayList<Double> materialesAgua = new ArrayList<Double>();

        materialesAgua.add(9980.0);
        materialesAgua.add(8035.0); // cambiar
        materialesAgua.add(9430.0); // cambiar
        materialesAgua.add(10400.0);

        ArrayList<Double> materialesKwh = new ArrayList<Double>();

        materialesKwh.add(13.5);
        materialesKwh.add(12.7);
        materialesKwh.add(12.7);
        materialesKwh.add(24.8);

        ArrayList<Double> materialesCO2 = new ArrayList<Double>();

        materialesCO2.add(0.35);
        materialesCO2.add(0.38);
        materialesCO2.add(0.40);
        materialesCO2.add(0.42);
        // SEDES
        ArrayList<String> sedes = new ArrayList<String>();
        sedes.add("1.-Reciclados Profesionales MEXICO");
        sedes.add("2.-Recicladora “Los Reyes” ");

        pasa1Add = true;
        while (pasa1Add) {
            try {

                String val = "Escoja la opción que deasea agregar\n";
                val = val + "1. Prenda\n";
                val = val + "2. Talla\n";
                val = val + "3. Material\n";
                val = val + "4. Continuar\n";
                opcionAdd = JOptionPane.showInputDialog(null, val, "");
                if (Integer.parseInt(opcionAdd) < 1 || Integer.parseInt(opcionAdd) > 4) {
                    JOptionPane.showMessageDialog(null, "Valor fuera del rango");
                } else {
                    if (Integer.parseInt(opcionAdd) == 1) {
                        val = "Agregue el nombre de la prenda";
                        opcionAdd1 = JOptionPane.showInputDialog(null, val, "");
                        prendas.add(prendas.size() + 1 + ".-" + opcionAdd1);
                        boolean sale1 = true;
                        while (sale1) {
                            try {
                                val = "Agregue el peso de la prenda (valor positivo)";
                                opcionAdd1 = JOptionPane.showInputDialog(null, val, "");
                                Double valAdd = Double.parseDouble(opcionAdd1);
                                prendasValores.add(valAdd);
                                sale1 = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Valor incorrecto");
                            }
                        }
                    } else if (Integer.parseInt(opcionAdd) == 2) {
                        val = "Agregue la talla";
                        opcionAdd2 = JOptionPane.showInputDialog(null, val, "");
                        tallas.add(tallas.size() + 1 + ".-" + opcionAdd2);
                        boolean sale1 = true;
                        while (sale1) {
                            try {
                                val = "Agregue el material adicional de la talla con respecto al peso origial ( PesoConTalla/PesoOriginal )";
                                opcionAdd1 = JOptionPane.showInputDialog(null, val, "");
                                Double valAdd = Double.parseDouble(opcionAdd1);
                                tallasValores.add(valAdd);
                                sale1 = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Valor incorrecto");
                            }
                        }
                    } else if (Integer.parseInt(opcionAdd) == 3) {
                        val = "Agregue el nombre del material";
                        opcionAdd3 = JOptionPane.showInputDialog(null, val, "");
                        materiales.add(materiales.size() + 1 + ".-" + opcionAdd3);
                        boolean sale1 = true;
                        while (sale1) {
                            try {
                                val = "Ingrese el material necesario para producir una prenda (1 = 100%, 0.1 = 10%)";
                                opcionAdd1 = JOptionPane.showInputDialog(null, val, "");
                                Double valAdd = Double.parseDouble(opcionAdd1);
                                materialesPesos.add(valAdd);
                                sale1 = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Valor incorrecto");
                            }
                        }
                        sale1 = true;
                        while (sale1) {
                            try {
                                val = "Agregue el consumo de agua por kilogramo de material";
                                opcionAdd1 = JOptionPane.showInputDialog(null, val, "");
                                Double valAdd = Double.parseDouble(opcionAdd1);
                                materialesAgua.add(valAdd);
                                sale1 = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Valor incorrecto");
                            }
                        }
                        sale1 = true;
                        while (sale1) {
                            try {
                                val = "Agregue la energía consumida por kilogramo";
                                opcionAdd1 = JOptionPane.showInputDialog(null, val, "");
                                Double valAdd = Double.parseDouble(opcionAdd1);
                                materialesKwh.add(valAdd);
                                sale1 = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Valor incorrecto");
                            }
                        }
                        sale1 = true;
                        while (sale1) {
                            try {
                                val = "Agregue el CO2 producido por kwh de energía utilizada";
                                opcionAdd1 = JOptionPane.showInputDialog(null, val, "");
                                Double valAdd = Double.parseDouble(opcionAdd1);
                                materialesCO2.add(valAdd);
                                sale1 = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Valor incorrecto");
                            }
                        }
                    } else {
                        pasa1Add = false;
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor incorrecto");

            }
        }
        pasa2Add = true;
        while (pasa2Add) {
            pasa1 = true;
            pasa2 = true;
            pasa3 = true;
            pasa4 = true;
            CantidadMaterial = 0;
            while (pasa1) {
                try {
                    String val = "Ingrese que prenda Desea\n";
                    for (String pr : prendas) {
                        val = val + pr + "\n";
                    }
                    opcion = JOptionPane.showInputDialog(null, val, "");
                    if (Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > prendas.size()) {
                        JOptionPane.showMessageDialog(null, "***Valor fuera del rango***");
                    } else {
                        CantidadMaterial = prendasValores.get(Integer.parseInt(opcion) - 1);
                        pasa1 = false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "***ingrese solo numero***");

                }
            }
            while (pasa2) {
                try {
                    String val = "Ingrese la talla deseada\n";
                    for (String pr : tallas) {
                        val = val + pr + "\n";
                    }
                    opcion1 = JOptionPane.showInputDialog(null, val, "");
                    if (Integer.parseInt(opcion1) < 1 || Integer.parseInt(opcion1) > tallas.size()) {
                        JOptionPane.showMessageDialog(null, "***Valor fuera del rango***");
                    } else {
                        CantidadMaterial = CantidadMaterial * tallasValores.get(Integer.parseInt(opcion1) - 1);
                        pasa2 = false;
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "***ingrese solo numero***");
                }

            }
            while (pasa3) {
                try {
                    String val = "Ingrese el material deseado\n";
                    for (String pr : materiales) {
                        val = val + pr + "\n";
                    }
                    opcion2 = JOptionPane.showInputDialog(null, val, "");
                    if (Integer.parseInt(opcion2) < 1 || Integer.parseInt(opcion2) > materiales.size()) {
                        JOptionPane.showMessageDialog(null, "***Valor fuera del rango***");
                    } else {
                        CantidadMaterial = materialesPesos.get(Integer.parseInt(opcion2) - 1) * CantidadMaterial;
                        LitrosAgua = materialesAgua.get(Integer.parseInt(opcion2) - 1) * CantidadMaterial;
                        EnergiaUtilizada = materialesKwh.get(Integer.parseInt(opcion2) - 1) * CantidadMaterial;
                        Co2Producida = materialesCO2.get(Integer.parseInt(opcion2) - 1) * EnergiaUtilizada;

                        JOptionPane.showMessageDialog(null,
                                "Cantidad de kilos de " + df.format(CantidadMaterial) + " "
                                        + materiales.get(Integer.parseInt(opcion2) - 1).substring(3) + ".\n"
                                        + "Se gastaron " + df.format(LitrosAgua) + " litros de agua.\n"
                                        + "Se Consumieron " + df.format(EnergiaUtilizada) + " kwh de energia.\n"
                                        + "Se Emitieron " + df.format(Co2Producida) + " Kg de Co2");
                        pasa3 = false;
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "***ingrese solo numero***");
                }

            }

            while (pasa4) {
                try {
                    String val = "Sedes Cerca de su Domicilio\n";
                    for (String pr : sedes) {
                        val = val + pr + "\n";
                    }
                    opcion3 = JOptionPane.showInputDialog(null, val, "");
                    if (Integer.parseInt(opcion3) < 1 || Integer.parseInt(opcion3) > sedes.size()) {
                        JOptionPane.showMessageDialog(null, "***Valor fuera del rango***");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Sede " + sedes.get(Integer.parseInt(opcion3) - 1).substring(3) + " escogida.");

                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "***ingrese solo numero***");
                }

            }
            boolean quedarse = true;
            while (quedarse) {

                opcionF = JOptionPane.showInputDialog(null,
                        "Desea repetir la selección de prendas?\n" + "1.-Si\n" + "2.-No", "");
                try {
                    if (Integer.parseInt(opcionF) == 1) {
                        quedarse = false;
                    } else if (Integer.parseInt(opcionF) == 2) {
                        quedarse = false;
                        pasa2Add = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "***Valor fuera del rango***");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "***ingrese solo numero***");
                }
            }

        }
        entrada.close();

    }
}